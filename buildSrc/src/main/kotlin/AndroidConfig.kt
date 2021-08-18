object AndroidConfig {
    const val COMPILE_SDK_VERSION = 30
    const val MIN_SDK_VERSION = 23
    const val TARGET_SDK_VERSION = 30
    const val BUILD_TOOLS_VERSION = "30.0.2"

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"

    const val ID = "com.lt.mongolbook"
    const val LOGIN_ID = "com.lt.login"
    const val MEMBER_ID = "com.lt.member"
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"

    const val dimension = "channel"
}

interface BuildType {
    companion object {
        const val RELEASE = "release"
        const val DEBUG = "debug"
    }

    val isMinifyEnabled: Boolean
    val isShrinkResources: Boolean

}

object BuildTypeDebug : BuildType {
    override val isMinifyEnabled = false
    override val isShrinkResources = false

}

object ApplicationOrLibrary{
    const val isApplication: Boolean = true
}

object BuildTypeRelease : BuildType {
    override val isMinifyEnabled = true
    override val isShrinkResources = true

}

object TestOptions {
    const val IS_RETURN_DEFAULT_VALUES = true
}

object PublicImplementation{
    val dependencies = arrayOf("androidx.core:core-ktx:1.6.0",
                               "androidx.appcompat:appcompat:1.3.1",
                               "com.google.android.material:material:1.4.0",
                               "androidx.constraintlayout:constraintlayout:2.1.0",
                               "junit:junit:4.13.2",
                               "androidx.test.ext:junit:1.1.3",
                               "androidx.test.espresso:espresso-core:3.4.0")
}
