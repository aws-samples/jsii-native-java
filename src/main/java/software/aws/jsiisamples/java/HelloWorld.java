// Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: MIT-0

package software.aws.jsiisamples.java;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    public int fibonacci(Integer num) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 2; i < num + 1; i++) {
            array.add(array.get(i - 2) + array.get(i - 1));
        }
        return array.get(num);
    }
}
