package sample;

import org.junit.rules.ExternalResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerResource extends ExternalResource {
	static Logger logger = LoggerFactory.getLogger(ServerResource.class);
	String name;

	public ServerResource(String name) {
		this.name = name;
	}
	
	@Override
	protected void before() throws Throwable {
		logger.debug("startup {}...", name);
	}

	@Override
	protected void after() {
		logger.debug("shutdown {}...", name);
	}	
}
