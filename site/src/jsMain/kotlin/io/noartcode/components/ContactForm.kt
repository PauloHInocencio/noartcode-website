package io.noartcode.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.styles.InputStyle
import io.noartcode.styles.TextAreaStyle
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactForm(modifier: Modifier = Modifier) {
    Form(
        action = "https://formspree.io/f/mbdopboy",
        attrs = modifier
            .attrsModifier {
                attr("method", "POST")
            }
            .toAttrs()
    ) {
        Column(modifier = Modifier.gap(0.5.cssRem)) {
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .toAttrs(),
                forId = "inputName"
            ) {
                Text("Name")
            }
            Input(
                type = InputType.Text,
                attrs = InputStyle.toModifier()
                    .id("inputName")
                    .classNames("form-control")
                    .attrsModifier {
                        attr("placeholder", "Full Name")
                        attr("name", "name")
                        attr("required", "true")
                    }
                    .toAttrs()
            )
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .toAttrs(),
                forId = "inputEmail"
            ) {
                Text("Email")
            }
            Input(
                type = InputType.Email,
                attrs = InputStyle.toModifier()
                    .id("inputEmail")
                    .classNames("form-control")
                    .attrsModifier {
                        attr("placeholder", "Email Address")
                        attr("name", "email")
                        attr("required", "true")
                    }
                    .toAttrs()
            )
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .toAttrs(),
                forId = "inputMessage"
            ) {
                Text("Message")
            }
            TextArea (
                attrs = TextAreaStyle.toModifier()
                    .id("inputMessage")
                    .classNames("form-control")
                    .attrsModifier {
                        attr("placeholder", "Your Message")
                        attr("name", "message")
                        attr("required", "true")
                    }
                    .toAttrs()
            )
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                AppButton(
                    text = "Submit"
                )
            }
        }
    }
}





