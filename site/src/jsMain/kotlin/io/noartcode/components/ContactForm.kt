package io.noartcode.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Resize
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.focus
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.styles.Theme
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
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
                    .height(150.px)
                    .margin(bottom = 20.px)
                    .width(500.px)
                    .backgroundColor(Theme.Form.Background)
                    .boxShadow(0.px, 0.px, 0.px, 0.px, null)
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



val InputStyle = CssStyle {
    base {
        Modifier
            .borderRadius(10.px)
            .height(3.cssRem)
            .margin(bottom = 10.px)
            .width(500.px)
            .padding(leftRight = 10.px)
            .backgroundColor(Theme.Form.Background)
            .fontSize(1.cssRem)
            .boxShadow(0.px, 0.px, 0.px, 0.px, null)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = Theme.Form.Border
            )
            .transition(Transition.of(property = "border", duration = 200.ms))
    }
    focus {
        Modifier.border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Theme.Form.BorderFocus
        )
    }
    hover {
        Modifier.border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Theme.Form.BorderHover
        )
    }
}

val TextAreaStyle =  CssStyle {
    base {
        Modifier
            .borderRadius(10.px)
            .fontSize(1.cssRem)
            .padding(topBottom = 10.px, leftRight = 10.px)
            .resize(Resize.Vertical)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = Theme.Form.Border
            )
            .transition(Transition.of(property = "border", duration = 200.ms))
    }
    focus {
        Modifier.border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Theme.Form.BorderFocus
        )
    }
    hover {
        Modifier.border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Theme.Form.BorderHover
        )
    }
}

