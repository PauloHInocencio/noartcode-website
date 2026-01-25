package io.noartcode.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page
import io.noartcode.components.TopNavbar
import io.noartcode.sections.*

@Page
@Composable
fun HomePage() {

    Box(
        Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopCenter
    ) {
        TopNavbar()
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PageSection(id = "hero2") { HeroSection2Content() }
            PageSection(id = "experience", navigateToPath = "#projects") { ExperienceContent() }
            PageSection(id = "projects", navigateToPath = "#about"){ ProjectsContent() }
            PageSection(id = "about", navigateToPath = "#contact") { HeroSectionContent() }
            PageSection(id = "contact") { ContactContent() }
        }
    }


}


