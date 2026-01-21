package io.noartcode.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.sections.*
import io.noartcode.styles.ProjectPageSectionStyle

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PageSection(id = "about", navigateToPath = "#experience") { HeroSectionContent() }
        PageSection(id = "experience", navigateToPath = "#projects") { ExperienceContent() }
        PageSection(
            id = "projects",
            navigateToPath = "#contact",
            modifier = ProjectPageSectionStyle.toModifier()
        ){
            ProjectsContent()
        }
        PageSection(id = "contact") { ContactContent() }
    }
}


