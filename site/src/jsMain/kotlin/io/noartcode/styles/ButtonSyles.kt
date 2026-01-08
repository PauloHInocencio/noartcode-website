package io.noartcode.styles

import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

val PrimaryButtonStyle = CssStyle {
    base {
        Modifier
            .padding(topBottom = 1.cssRem, leftRight = 1.7.cssRem)
            .backgroundColor(Color.rgb(53, 53, 53))
            .color(Colors.White)
            .border(1.px)
            .border(1.px, LineStyle.Solid, Color.rgb(53, 53, 53))
            .borderRadius(50.px)
            .fontSize(0.7.cssRem)
            .fontWeight(FontWeight.SemiBold)
            .cursor(Cursor.Pointer)
    }

    hover {
        Modifier
            .backgroundColor(Colors.Black)
    }
}

val SecondaryButtonStyle = CssStyle {
    base {
        Modifier
            .padding(topBottom = 1.cssRem, leftRight = 1.7.cssRem)
            .backgroundColor(Colors.White)
            .color(Color.rgb(53, 53, 53))
            .border(1.px, LineStyle.Solid, Color.rgb(53, 53, 53))
            .borderRadius(50.px)
            .fontSize(0.7.cssRem)
            .fontWeight(FontWeight.SemiBold)
            .cursor(Cursor.Pointer)
    }
    hover {
        Modifier
            .backgroundColor(Color.rgb(53, 53, 53))
            .color(Colors.White)
    }
}