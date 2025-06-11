package com.github.mlvandijk.progressbarpl.startup

import com.github.mlvandijk.progressbarpl.progressbar.PolishFlagProgressIndicatorProvider
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

/**
 * Project activity that ensures the Polish Flag progress bar is initialized.
 */
class MyProjectActivity : ProjectActivity {

    override suspend fun execute(project: Project) {
        // Initialize the progress bar provider
        PolishFlagProgressIndicatorProvider.getInstance()
    }
}
