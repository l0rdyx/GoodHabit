
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    
}

kotlin {
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            implementation("io.insert-koin:koin-core:3.5.3")
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

