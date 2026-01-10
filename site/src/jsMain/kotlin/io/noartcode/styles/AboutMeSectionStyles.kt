package io.noartcode.styles

import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.filter
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@OptIn(ExperimentalComposeWebApi::class)
val AboutMeImageStyle = CssStyle {
    base {
        Modifier
            .size(200.px)
            .objectFit(ObjectFit.Cover)
            .borderRadius(r = 30.px)
            .styleModifier {
                filter { grayscale(100.percent) }
            }
    }

    Breakpoint.XL {
        Modifier
            .size(400.px)
    }

}