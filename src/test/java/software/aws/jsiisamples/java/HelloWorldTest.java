// Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: MIT-0

package software.aws.jsiisamples.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
    private HelloWorld helloWorld;

    @Before
    public void initialize() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void sayHelloShouldReturnHelloWorld() {
        Assert.assertEquals("Hello, World", helloWorld.sayHello("World"));
    }

    @Test
    public void sayHelloShouldReturnHelloNeo() {
        Assert.assertEquals("Hello, Neo", helloWorld.sayHello("Neo"));
    }

    @Test
    public void fibonacciShouldReturnCorrectlyFor5() {
        Assert.assertEquals(5, helloWorld.fibonacci(5));
    }

    @Test
    public void fibonacciShouldReturnCorrectlyFor20() {
        Assert.assertEquals(6765, helloWorld.fibonacci(20));
    }
}
