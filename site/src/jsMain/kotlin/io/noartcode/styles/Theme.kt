package io.noartcode.styles

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgba

/**
 * Centralized theme colors for NoArtCode portfolio website.
 * Provides semantic color naming for consistent styling across the application.
 */
object Theme {

    // ===== PRIMARY COLORS =====
    /**
     * Primary brand color - Dark charcoal used for primary actions and emphasis
     * Used in: buttons, primary text elements
     */
    val Primary = Color.rgb(53, 53, 53) // #353535

    /**
     * Primary hover state - Pure black for strong emphasis on interactive elements
     */
    val PrimaryHover = Colors.Black

    // ===== TEXT COLORS =====
    /**
     * Primary text color - Pure black for maximum readability
     * Used in: headings, navigation links, main content
     */
    val TextPrimary = Colors.Black

    /**
     * Secondary text color - Medium gray for less prominent text
     * Used in: body text, descriptions, subtitles, labels
     */
    val TextSecondary = Color.rgb(85, 85, 85) // #555555

    /**
     * Tertiary text color - Light gray for hover states and decorative text
     */
    val TextTertiary = Colors.Gray

    // ===== BACKGROUND COLORS =====
    /**
     * Primary background - White for main content areas
     */
    val BackgroundPrimary = Colors.White

    /**
     * Secondary background - Very light gray for subtle contrast sections
     * Used in: project cards, content containers
     */
    val BackgroundSecondary = Color.rgb(250, 250, 250) // #FAFAFA

    // ===== BORDER COLORS =====
    /**
     * Primary border color - Medium gray for borders and dividers
     * Used in: form inputs, cards, containers
     */
    val BorderPrimary = Color.rgb(163, 163, 163) // #A3A3A3

    /**
     * Border focus/hover color - Same as primary brand color for interactive states
     * Used in: form inputs on focus, interactive borders
     */
    val BorderInteractive = Primary

    // ===== DECORATIVE COLORS =====
    /**
     * Decoration color - Light gray for underlines and subtle decorations
     * Used in: link underlines, decorative elements
     */
    val DecorationLight = Color.rgb(181, 181, 181) // #B5B5B5

    // ===== SHADOW COLORS =====
    /**
     * Shadow color - Semi-transparent black for elevation effects
     * Used in: dropdown menus, elevated cards, overlays
     */
    val ShadowDefault: CSSColorValue = rgba(0, 0, 0, 0.1)

    // ===== SEMANTIC COLOR GROUPS =====

    /**
     * Button-specific color variants for primary and secondary buttons
     */
    object Button {
        val PrimaryBackground = Primary
        val PrimaryBackgroundHover = PrimaryHover
        val PrimaryText = Colors.White
        val PrimaryBorder = Primary

        val SecondaryBackground = BackgroundPrimary
        val SecondaryBackgroundHover = Primary
        val SecondaryText = Primary
        val SecondaryTextHover = Colors.White
        val SecondaryBorder = BorderPrimary
    }

    /**
     * Form input color variants for borders and backgrounds
     */
    object Form {
        val Border = BorderPrimary
        val BorderFocus = BorderInteractive
        val BorderHover = BorderInteractive
        val Background = BackgroundSecondary
    }

    /**
     * Link color variants for default and hover states
     */
    object Link {
        val Default = TextPrimary
        val Hover = TextTertiary
        val UnderlineHover = DecorationLight
        val Blue = Color.rgb(r = 0, g = 137, b = 237)
    }
}
