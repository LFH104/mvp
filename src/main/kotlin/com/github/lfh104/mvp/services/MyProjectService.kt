package com.github.lfh104.mvp.services

import com.intellij.openapi.project.Project
import com.github.lfh104.mvp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
