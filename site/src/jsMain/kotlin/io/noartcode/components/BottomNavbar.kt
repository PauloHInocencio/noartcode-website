package io.noartcode.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.styles.BottomNavbarLinkStyle
import org.jetbrains.compose.web.css.cssRem

@Composable
fun BottomNavBar() {
    Row(
        Modifier
            .gap(2.cssRem) // 32px — scale with user font size preferences (just like Android `sp`)
    ) {
        NavigationLinks(
            linksModifier = BottomNavbarLinkStyle.toModifier()
        )
    }
}