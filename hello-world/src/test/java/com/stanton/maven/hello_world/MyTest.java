package com.stanton.maven.hello_world;

import org.junit.Test;

import junit.framework.Assert;

public class MyTest {

	@Test
	public void test() {
		Desktop desktop = new Desktop("Stanton", "Cary");
		Assert.assertEquals("Stanton", desktop.getName());
		Assert.assertEquals("Cary",  desktop.getAddress());
	}

}
