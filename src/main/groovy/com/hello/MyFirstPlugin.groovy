package com.hello;

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyFirstPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println "this is single project gradle plugin..."
    }
}
