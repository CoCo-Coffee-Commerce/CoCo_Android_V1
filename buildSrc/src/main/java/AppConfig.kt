object AppConfig {
    const val COMPILE_SDK = 32
    const val BUILD_TOOL_VERSION = "30.0.2"
    const val MIN_SDK = 24
    const val TARGET_SDK = 32
    const val VERSION_CODE = 1
    const val VERSION_NAME = "0.0.1"
    const val APPLICATION_ID = "com.android.coco.client"

    const val APPLICATION_VERSION = "com.android.application:${AppVersions.APPLICATION_VERSION}"
    const val LIBRARY_VERSION = "com.android.library:${AppVersions.LIBRARY_VERSION}"
    const val KOTLIN_VERSION = "org.jetbrains.kotlin.android:${AppVersions.KOTLIN_VERSION}"
    const val KOTLIN_JVM_VERSION = "org.jetbrains.kotlin.jvm:${AppVersions.KOTLIN_JVM_VERSION}"
}

object AppVersions {
    const val APPLICATION_VERSION = "7.3.1"
    const val LIBRARY_VERSION = "7.3.1"
    const val KOTLIN_VERSION = "1.8.10"
    const val KOTLIN_JVM_VERSION = "1.8.10"
}