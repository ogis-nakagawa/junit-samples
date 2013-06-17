package sample;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import sample.catagory.IntegrationTests;
import sample.catagory.PerformanceTests;

@RunWith(Categories.class)
@IncludeCategory(IntegrationTests.class)
@ExcludeCategory(PerformanceTests.class)
@SuiteClasses( { IntegrationTest.class })
public class CategoriesTests {}
