package org.idea.example

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages

class HelloAction extends AnAction {

    HelloAction() {
        super("Hello")
    }

    @Override
    void actionPerformed(AnActionEvent e) {
        Project project = event.getProject()
        Messages.showMessageDialog(
                project,
                "Hello world!",
                "Greeting",
                Messages.getInformationIcon())
    }
}
