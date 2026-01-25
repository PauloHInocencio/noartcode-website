package io.noartcode.util

import io.noartcode.models.ExperienceItem

object Constants {

    const val LOREM_IPSUM_LONG =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    const val LOREM_IPSUM_SHORTEST =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."

    const val ABOUT_ME_DESCRIPTION = "I am a software developer with over 14 years of experience, approximately 10 years of which have been focused on native application development, primarily for Android, but also with experience in iOS."

    const val ABOUT_ME_DESCRIPTION_2 = "I’m currently deepening my knowledge of Kotlin Multiplatform through personal projects and by applying it whenever possible at work."

    val EXPERIENCE_ITEMS = listOf(
        ExperienceItem(
            iconPath = "android.svg",
            title = "Android Development",
            subTitle = "12+ years",
            description = LOREM_IPSUM_SHORTEST
        ),
        ExperienceItem(
            iconPath = "cmp.svg",
            title = "Compose Multiplatform",
            subTitle = "4+ years",
            description = LOREM_IPSUM_SHORTEST
        ),
        ExperienceItem(
            iconPath = "kmp.svg",
            title = "Kotlin Multiplatform",
            subTitle = "4+ years",
            description = LOREM_IPSUM_SHORTEST
        ),
        ExperienceItem(
            iconPath = "ios.svg",
            title = "iOS Development",
            subTitle = "4+ years",
            description = LOREM_IPSUM_SHORTEST
        ),
        ExperienceItem(
            iconPath = "golang.svg",
            title = "Backend Development",
            subTitle = "2+ years",
            description = LOREM_IPSUM_SHORTEST
        ),
        ExperienceItem(
            iconPath = "kobweb.png",
            title = "Frontend Development",
            subTitle = "1+ years",
            description = LOREM_IPSUM_SHORTEST,
            iconWidth = 120,
            iconHeight = 52,
            useScaleDown = true
        )
    )
}

object Res {
    object Image {
        const val PROFILE_IMAGE = "paulo_avatar.jpg"
    }
}