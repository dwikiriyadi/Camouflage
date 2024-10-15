plugins {
    id("android.application.compose")
}

android {
    namespace = "dev.dwikiriyadi.camouflage"

    defaultConfig {
        applicationId = "dev.dwikiriyadi.camouflage"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

javaConfiguration {
    version = JavaVersion.VERSION_17
}

dependencies {
    testImplementation(testLibs.junit)
    androidTestImplementation(testLibs.androidx.test.ext.junit)
    androidTestImplementation(testLibs.androidx.espresso.core)
}