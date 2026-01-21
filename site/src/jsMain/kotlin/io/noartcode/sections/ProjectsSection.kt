package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toAttrs
import io.noartcode.components.AppButton
import io.noartcode.components.ButtonVariant
import io.noartcode.components.SectionHeader
import io.noartcode.styles.ProjectSectionContentStyle
import io.noartcode.styles.Theme
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

@Composable
fun ProjectsContent() {
    Column(Modifier.fillMaxSize()) {
        SectionHeader(
            title = "Projects",
            subTitle = "Browse My Recent"
        )
        Div(
            attrs = ProjectSectionContentStyle.toAttrs()
        ) {
            ProjectCard(
                title = "Project One",
                imageSrc = "project-1.png",
                githubLink = "",
                demoLink = "",
            )
            ProjectCard(
                title = "Project Two",
                imageSrc = "project-2.png",
                githubLink = "",
                demoLink = "",
            )
            ProjectCard(
                title = "Project Three",
                imageSrc = "project-3.png",
                githubLink = "",
                demoLink = "",
            )
        }
    }
}

@Composable
private fun ProjectCard(
    imageSrc:String,
    title:String,
    githubLink:String,
    demoLink:String
) {
    Div(
        Modifier
            .padding(1.5.cssRem)
            .borderRadius(2.cssRem)
            .backgroundColor(Theme.BackgroundSecondary)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = Theme.BorderPrimary
            )
            .toAttrs(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProjectImageContainer(
                imageSrc = imageSrc
            )
            H2(
                Modifier.margin(1.cssRem)
                    .fontWeight(FontWeight.SemiBold)
                    .fontSize(1.75.cssRem)
                    .toAttrs()
            ) {
                Text(title)
            }
            Row(
                modifier = Modifier.gap(1.cssRem)
            ) {
                AppButton(
                    text = "Github",
                    variant = ButtonVariant.Secondary
                )
                AppButton(
                    text = "Live Demo",
                    variant = ButtonVariant.Secondary
                )
            }
        }
    }
}


@Composable
private fun ProjectImageContainer(
    imageSrc:String
) {
    Image(
        modifier = Modifier
            .size(90.percent)
            .borderRadius(2.cssRem)
        ,
        src = imageSrc,

        )
}