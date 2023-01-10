dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
rootProject.name = "Ivy Wallet"
include(":app")
include(":common:main")
include(":common:android-test")
include(":common:test")
include(":design-system")
include(":accounts")
include(":categories")
include(":home:tab")
include(":home:more-menu")
include(":home:customer-journey")
include(":transaction")
include(":onboarding")
include(":main:impl")
include(":main:base")
include(":widgets")
include(":app-locked")
include(":android:billing")
include(":android:notifications")
include(":core:data-model")
include(":core:domain")
include(":core:exchange-provider")
include(":core:ui")
include(":core:persistence")
include(":network")
include(":resources")
include(":navigation")
include(":debug")
include(":formula:domain")
include(":formula:persistence")
include(":formula:ui")
include(":parser")
include(":math")
include(":drive:google-drive")
include(":settings")
include(":backup:base")
include(":backup:old")
include(":backup:impl")
include(":backup:api")
