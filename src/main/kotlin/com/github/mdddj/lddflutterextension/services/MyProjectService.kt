package com.github.mdddj.lddflutterextension.services

import com.intellij.openapi.project.Project
import com.github.mdddj.lddflutterextension.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
