pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        // Dependencies
        create("camouflageLibs") {
            from(files("./gradle/catalog/camouflage.versions.toml"))
        }
        create("androidLibs") {
            from(files("./gradle/catalog/android.versions.toml"))
        }
        create("composeLibs") {
            from(files("./gradle/catalog/compose.versions.toml"))
        }
        create("hiltLibs") {
            from(files("./gradle/catalog/hilt.versions.toml"))
        }
        create("koinLibs") {
            from(files("./gradle/catalog/koin.versions.toml"))
        }
        create("kotlinLibs") {
            from(files("./gradle/catalog/kotlin.versions.toml"))
        }
        create("ktorLibs") {
            from(files("./gradle/catalog/ktor.versions.toml"))
        }
        create("pluginsLibs") {
            from(files("./gradle/catalog/plugins.versions.toml"))
        }
        create("testLibs") {
            from(files("./gradle/catalog/test.versions.toml"))
        }
        create("jacocoLibs") {
            from(files("./gradle/catalog/jacoco.versions.toml"))
        }
    }
}

rootProject.name = "Camouflage"
include(":example")
include(":library:framework:form")
include(":library:ui:foundation")
include(":library:ui:component")
include(":library:ui:theme:fluent")
include(":library:ui:theme:mantine")
include(":library:ui:theme:material")
