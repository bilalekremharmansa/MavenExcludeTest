package com.bilalekrem.b;

import com.bilalekrem.ProjectVersion;

public class PrintProjectB {

    public static void main(String[] args) {
        new PrintProjectB().print();
    }

    public void print() {
        System.out.println("This is projectB, expecting pom version 2.0");
        new ProjectVersion().print();
    }

}
