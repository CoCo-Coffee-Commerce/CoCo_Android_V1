object Versions {
    // KTX
    const val CORE_KTX = "1.7.0"

    // Lifecycle
    const val RUNTIME_LIFECYCLE = "2.3.1"

    // Compose
    const val ACTIVITY_COMPOSE = "1.3.1"
    const val COMPOSE_UI = "1.3.3"
    const val COMPOSE_UI_PREVIEW_TOOLING = "1.3.3"
    const val COMPOSE_MATERIAL_THREE = "1.0.0-alpha02"
    const val COMPOSE_VERSION = "1.3.3"

    // Test
    const val TEST_JUNIT = "4.13.2"
    const val ANDROID_TEST_JUNIT = "1.1.5"
    const val ANDROID_ESPRESSO_CORE = "3.5.1"
    const val ANDROID_COMPOSE_UI_TEST_JUNIT = "1.3.3"
    const val DEBUG_UI_TOOLING = "1.3.3"
    const val DEBUG_COMPOSE_TEST_MANIFEST = "1.3.3"

    const val KOTLIN_COMPILER_EXTENSION = "1.1.1"
}

object Libraries {

    object Application {
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val RUNTIME_LIFECYCLE =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.RUNTIME_LIFECYCLE}"
        const val ACTIVITY_COMPOSE =
            "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"
        const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE_UI}"
        const val COMPOSE_UI_PREVIEW_TOOLING =
            "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE_UI_PREVIEW_TOOLING}"
        const val COMPOSE_UI_MATERIAL_THREE =
            "androidx.compose.material3:material3:${Versions.COMPOSE_MATERIAL_THREE}"
    }

    object Test {
        const val TEST_JUNIT = "junit:junit:${Versions.TEST_JUNIT}"
        const val ANDROID_TEST_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_TEST_JUNIT}"
        const val ANDROID_ESPRESSO_CORE =
            "androidx.test.espresso:espresso-core:${Versions.ANDROID_ESPRESSO_CORE}"
        const val ANDROID_COMPOSE_UI_TEST_JUNIT =
            "androidx.compose.ui:ui-test-junit4:${Versions.ANDROID_COMPOSE_UI_TEST_JUNIT}"
        const val DEBUG_UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.DEBUG_UI_TOOLING}"
        const val DEBUG_COMPOSE_TEST_MANIFEST =
            "androidx.compose.ui:ui-test-manifest:${Versions.DEBUG_COMPOSE_TEST_MANIFEST}"
    }
}
