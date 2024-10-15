plugins {
    id("android.library.compose")
    id("kotlin.publication")
}

android {
    namespace = "com.camouflage.framework"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

javaConfiguration {
    version = JavaVersion.VERSION_17
}

publishConfiguration {
    groupId = "com.camouflage.framework"
    artifactId = "form"
    version = "0.0.1"
}