package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.Anchor
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.components.AppButton
import io.noartcode.components.ButtonVariant
import io.noartcode.components.SectionHeader
import io.noartcode.models.ProjectItem
import io.noartcode.styles.ProjectCard2Style
import io.noartcode.styles.ProjectSectionContentStyle
import io.noartcode.styles.Theme
import io.noartcode.util.Constants
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun ProjectsContent() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SectionHeader(
            title = "Projects",
            subTitle = "Browse My Recent"
        )
        SimpleGrid(
            numColumns(1, md = 2, lg = 3),
            modifier = ProjectSectionContentStyle.toModifier().gap(1.cssRem).fillMaxSize()
        ) {
            Constants.PROJECT_ITEMS.forEach {
                ProjectCard2(it)
            }
        }
    }
}


@Composable
private fun ProjectCard2(
    projectItem: ProjectItem
) {
    Anchor(
        href = projectItem.link, ProjectCard2Style.toAttrs()
    ) {
        Column (Modifier.fillMaxSize()){
            H1{
                Text(projectItem.title)
            }
            P {
                Text(projectItem.description)
            }
            Row(
                Modifier.fillMaxSize().gap(0.5.cssRem),
                verticalAlignment = Alignment.Bottom
            ) {
                projectItem.tags.forEach {
                    ProjectTag(it)
                }
            }
        }
    }
}


@Composable
private fun ProjectTag(
    value:String
) {
    Box(modifier = Modifier
        .padding(leftRight = 1.cssRem, topBottom = 0.25.cssRem)
        .fontSize(0.875.cssRem)
        .borderRadius(90.px)
        .border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Theme.BorderPrimary
        ),
        contentAlignment = Alignment.Center
    ) {
        Text(value)
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