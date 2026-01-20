package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.styles.PageSectionArrowLinkStyle
import io.noartcode.styles.PageSectionStyle
import org.jetbrains.compose.web.css.Position

@Composable
fun PageSection(
    id: String,
    navigateToPath:String? = null,
    content: @Composable () -> Unit
) {
    Box(
        modifier = PageSectionStyle.toModifier()
            .position(Position.Relative)
            .id(id)
    ){
        content()
        if (navigateToPath != null) {
            Link(
                modifier = Modifier.cursor(Cursor.Pointer),
                path = navigateToPath,
            ) {
                Image(
                    modifier = PageSectionArrowLinkStyle.toModifier(),
                    src = "arrow.png"
                )
            }
        }

    }
}