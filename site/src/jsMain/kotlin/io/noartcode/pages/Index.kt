package io.noartcode.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import io.noartcode.components.AboutContent
import io.noartcode.components.TopNavbar
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopNavbar()
        PageSection(id = "about") { AboutContent() }
        //PageSection(id = "experience") { ExperienceContent() }
        //PageSection(id = "projects") { ProjectsContent() }
        //PageSection(id = "Contact") { ContactContent() }
    }
}


@Composable
fun PageSection(
    id: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .id(id)
            .padding(topBottom = 60.px)
    ){
        content()
    }
}