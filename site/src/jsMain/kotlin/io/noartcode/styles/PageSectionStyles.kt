package io.noartcode.styles

import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.boxSizing
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

val PageSectionStyle = CssStyle {
    base {
        Modifier
            .padding(top = 4.vh)
            .height(96.vh)
            .margin(0.px)
            .boxSizing(BoxSizing.BorderBox)
    }


}