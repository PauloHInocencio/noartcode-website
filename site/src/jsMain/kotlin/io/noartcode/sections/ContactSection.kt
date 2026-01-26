package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import io.noartcode.components.BottomNavBar
import io.noartcode.components.ContactForm
import io.noartcode.components.SectionHeader
import io.noartcode.styles.Theme
import io.noartcode.util.Constants
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun ContactContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        SectionHeader(
            title = "Contact Me",
            subTitle = "Get in Touch"
        )
        ContactForm(
            Modifier.margin(top = 4.cssRem)
        )
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Spacer()
                Span(
                    attrs = Modifier
                        .color(Theme.TextSecondary)
                        .fontSize(0.75.cssRem)
                        .toAttrs()
                ) {
                    SpanText(text = "This website is ")
                    Link(path = Constants.WEBSITE_GITHUB_URL, text = "open source")
                    SpanText(text = ", written using ")
                    Link(path = Constants.KOBWEB_URL, text = "Kobweb")
                }
                BottomNavBar(Modifier.margin(topBottom = 1.cssRem))
                P(
                    attrs = Modifier
                        .color(Theme.TextSecondary)
                        .margin(bottom = 0.5.cssRem)
                        .fontSize(0.75.cssRem)
                        .toAttrs()
                ){
                  Text("Copyright © 2026 NOARTCODE LTDA. All Rights Reserved.")
                }
            }
        }
    }
}
