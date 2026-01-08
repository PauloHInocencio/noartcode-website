package io.noartcode.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.components.TopNavbar
import io.noartcode.sections.HeroSection
import io.noartcode.styles.PageSectionStyle

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopNavbar()
        HeroSection()
        //PageSection(id = "") { HeroSection() }
        //PageSection(id = "about") { AboutContent() }
        //PageSection(id = "experience") { ExperienceContent() }
        //PageSection(id = "projects") { ProjectsContent() }
        //PageSection(id = "Contact") { ContactContent() }
    }
}


@Composable
fun PageSection(
    id: String,
    content: @Composable () -> Unit
) {
    Box(
        modifier = PageSectionStyle.toModifier()
            .id(id)
            //.padding(topBottom = 60.px)
    ){
        content()
    }
}