package io.noartcode.util

import io.noartcode.models.ExperienceItem
import io.noartcode.models.ProjectItem

object Constants {

    const val LOREM_IPSUM_LONG =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    const val LOREM_IPSUM_SHORTEST =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."

    const val ABOUT_ME_DESCRIPTION = "I am a software developer with over 14 years of experience, approximately 10 years of which have been focused on native application development, primarily for Android, but also with experience in iOS."

    const val ABOUT_ME_DESCRIPTION_2 = "I’m currently deepening my knowledge of Kotlin Multiplatform through personal projects and by applying it whenever possible at work."

    const val WEBSITE_GITHUB_URL = "https://github.com/PauloHInocencio/noartcode-website"
    const val KOBWEB_URL = "https://kobweb.varabyte.com"
    val EXPERIENCE_ITEMS = listOf(
        ExperienceItem(
            iconPath = "android.svg",
            title = "Android Development",
            subTitle = "Specialist",
            description = "I’m an experienced Android developer with a strong focus on Kotlin, Jetpack Compose, and modern app architecture."
        ),
        ExperienceItem(
            iconPath = "cmp.svg",
            title = "Compose Multiplatform",
            subTitle = "Advanced",
            description = "I build cross-platform UIs with Compose Multiplatform, targeting Android, iOS, and desktop from a shared codebase"
        ),
        ExperienceItem(
            iconPath = "kmp.svg",
            title = "Kotlin Multiplatform",
            subTitle = "Advanced",
            description = "I work with Kotlin Multiplatform to share business logic across Android, iOS, and desktop apps, building scalable cross-platform solutions."
        ),
        ExperienceItem(
            iconPath = "ios.svg",
            title = "iOS Development",
            subTitle = "Intermediate",
            description = "I build native iOS components and integrations using SwiftUI, focusing on bridging shared codebases and platform-specific features."
        ),
        ExperienceItem(
            iconPath = "golang.svg",
            title = "Backend Development",
            subTitle = "Intermediate",
            description = "I build backend services in Go, using goroutines for concurrency and real-time features like Server-Sent Events, with a focus on scalable APIs and databases."
        ),
        ExperienceItem(
            iconPath = "kobweb.png",
            title = "Frontend Development",
            subTitle = "Beginner",
            description = "I build this websites using Kobweb, leveraging Kotlin and Compose for Web to create modern, type-safe UIs.",
            iconWidth = 120,
            iconHeight = 52,
            useScaleDown = true
        )
    )

    val PROJECT_ITEMS = listOf(
        ProjectItem(
            title = "ThePrice",
            description = "ThePrice is a budget app I'm building to help me track my monthly payments while learning more about Compose Multiplatform",
            tags = listOf("CMP", "Kotlin", "Swift"),
            link = "https://github.com/PauloHInocencio/ThePrice"
        ),
        ProjectItem(
            "RickAndMorty",
            description = "This is a sample Android app that implements the MVI architecture design pattern. The app consumes data from the open Rick And Morty Api",
            tags = listOf("KMP", "Kotlin", "Swift"),
            link = "https://github.com/PauloHInocencio/RickAndMorty-Android"
        ),
        ProjectItem(
            "Breeze",
            description = "App to chill out seeing beautiful photos. The app consumes data from the Unsplash API.",
            tags = listOf("Android", "Kotlin", "Dagger"),
            link = "https://github.com/PauloHInocencio/Breeze"
        )

    )
}

object Res {
    object Image {
        const val PROFILE_IMAGE = "paulo_avatar.jpg"
    }
}