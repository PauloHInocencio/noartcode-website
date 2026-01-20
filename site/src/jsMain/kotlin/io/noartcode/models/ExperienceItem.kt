package io.noartcode.models

data class ExperienceItem(
    val iconPath: String,
    val title: String,
    val subTitle: String,
    val description: String,
    val iconWidth: Int? = null,      // Optional custom width (default: square)
    val iconHeight: Int = 52,         // Default 52px
    val useScaleDown: Boolean = false // For kobweb.png special case
)
