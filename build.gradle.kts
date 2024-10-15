// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(androidLibs.plugins.android.application) apply false
    alias(kotlinLibs.plugins.kotlin.android) apply false
}

buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath("com.camouflage.convention:camouflage-convention-plugin:0.0.1")
    }
}