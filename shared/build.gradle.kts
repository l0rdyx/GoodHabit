import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.sqlDelight)
}

kotlin {
    val xcframework = XCFramework()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
            xcframework.add(this)
        }
    }

    sqldelight {
        databases {
            create("Logs") {
                packageName = "models"
            }
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            implementation("io.insert-koin:koin-core:3.5.3")
            implementation("app.cash.sqldelight:runtime:2.0.0")
            implementation("app.cash.sqldelight:coroutines-extensions:2.0.0")
            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")
        }
        iosMain.dependencies {
            implementation("app.cash.sqldelight:native-driver:2.0.0")
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

