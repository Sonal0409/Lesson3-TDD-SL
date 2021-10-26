package testScriptsJunit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class TagsDemo {
			
			
			@Test
			@Tag("unittesting")
			public void test1()
			{
				System.out.println("unittesting1");
			}
			
			
			@Test
			@Tag("unittesting")
			public void test2()
			{
				System.out.println("unittesting2");
			}
			
			
			@Test
			@Tag("AcceptanceTesting")
			public void test3()
			{
				System.out.println("Acceptancetesting");
			}

}