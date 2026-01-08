package io.noartcode.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.styles.PrimaryButtonStyle
import io.noartcode.styles.SecondaryButtonStyle
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text

enum class ButtonVariant {
    Primary,
    Secondary
}

@Composable
fun AppButton(
    text: String,
    variant: ButtonVariant = ButtonVariant.Primary,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val style = when(variant) {
        ButtonVariant.Primary -> PrimaryButtonStyle
        ButtonVariant.Secondary -> SecondaryButtonStyle
    }

    Button(
        attrs = style.toModifier()
            .then(modifier)
            .onClick { onClick() }
            .toAttrs()
    ) {
        Text(text)
    }
}
