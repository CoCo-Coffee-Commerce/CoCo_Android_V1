plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.coco.android.client"
    compileSdk = AppConfig.COMPILE_SDK

    defaultConfig {
        applicationId = AppConfig.APPLICATION_ID
        minSdk = AppConfig.MIN_SDK
        targetSdk = AppConfig.TARGET_SDK
        versionCode = AppConfig.VERSION_CODE
        versionName = AppConfig.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = AppConfig.KOTLIN_COPILER_EXTENSION_VERSION
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))

    implementation(Libraries.Application.CORE_KTX)
    implementation(Libraries.Application.RUNTIME_LIFECYCLE)
    implementation(Libraries.Application.ACTIVITY_COMPOSE)
    implementation(Libraries.Application.COMPOSE_UI)
    implementation(Libraries.Application.COMPOSE_UI_PREVIEW_TOOLING)
    implementation(Libraries.Application.COMPOSE_UI_MATERIAL_THREE)
    testImplementation(Libraries.Test.TEST_JUNIT)
    androidTestImplementation(Libraries.Test.ANDROID_TEST_JUNIT)
    androidTestImplementation(Libraries.Test.ANDROID_ESPRESSO_CORE)
    androidTestImplementation(Libraries.Test.ANDROID_COMPOSE_UI_TEST_JUNIT)
    debugImplementation(Libraries.Test.DEBUG_UI_TOOLING)
    debugImplementation(Libraries.Test.DEBUG_COMPOSE_TEST_MANIFEST)
}