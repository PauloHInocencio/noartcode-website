package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import io.noartcode.components.BottomNavBar
import io.noartcode.components.ContactForm
import io.noartcode.components.SectionHeader
import io.noartcode.styles.Theme
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ContactContent() {
    Column(
        modifier = Modifier.fillMaxSize().gap(8.cssRem),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        SectionHeader(
            title = "Contact Me",
            subTitle = "Get in Touch"
        )
        ContactForm()
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                Modifier.fillMaxWidth().gap(2.cssRem),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                BottomNavBar()
                P(
                    attrs = Modifier
                        .color(Theme.TextSecondary)
                        .margin(bottom = 2.cssRem)
                        .toAttrs()
                ){
                  Text("Copyright © 2026 NOARTCODE LTDA. All Rights Reserved.")
                }
            }
        }
    }
}
