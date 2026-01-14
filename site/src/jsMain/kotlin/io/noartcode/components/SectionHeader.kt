package io.noartcode.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import io.noartcode.styles.Theme
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionHeader(
    title:String,
    subTitle:String
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        P (Modifier
            .margin(0.px)
            .color(Theme.TextSecondary)
            .fontSize(16.px)
            .fontWeight(FontWeight.Normal)
            .toAttrs()
        ){
            Text(subTitle)
        }
        H1 (
            Modifier
                .fontWeight(FontWeight.SemiBold)
                .fontSize(3.cssRem)
                .margin(0.px)
                .toAttrs()
        ) {
            Text(title)
        }
    }
}