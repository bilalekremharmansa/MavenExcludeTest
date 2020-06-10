package com.bilalekrem.a;

import com.bilalekrem.ProjectVersion;

public class PrintProjectA {

    public static void main(String[] args) {
        new PrintProjectA().print();
    }

    public void print() {
        System.out.println("This is projectA, expecting pom version 1.0");
        new ProjectVersion().print();
    }

}
