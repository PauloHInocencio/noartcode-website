import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
    // alias(libs.plugins.kobwebx.markdown)
}

group = "io.noartcode"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")

            head.add {
                // Preconnect to optimize requests — DSN lookups, TCP handshake, and TLS negotiation
                link(rel = "preconnect", href = "https://fonts.googleapis.com")
                link {
                    rel = "preconnect"
                    href = "https://fonts.gstatic.com"
                    attributes["crossorigin"] = ""
                }
                // Install Google Poppins
                link {
                    rel = "stylesheet"
                    href = "https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap"
                }
            }
        }
    }
}

kotlin {
    configAsKobwebApplication("noartcode")

    sourceSets {
        jsMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            // implementation(libs.kobwebx.markdown)
            
        }
    }
}
