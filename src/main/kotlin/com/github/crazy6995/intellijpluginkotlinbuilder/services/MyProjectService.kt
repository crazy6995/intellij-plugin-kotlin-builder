package com.github.crazy6995.intellijpluginkotlinbuilder.services

import com.intellij.openapi.project.Project
import com.github.crazy6995.intellijpluginkotlinbuilder.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
