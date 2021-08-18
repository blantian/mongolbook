plugins {
    if (!ApplicationOrLibrary.isApplication){
        id(GradlePluginId.ANDROID_APPLICATION)
    }else{
        id(GradlePluginId.ANDROID_LIBRARY)
    }
    id(GradlePluginId.KOTLIN_ANDROID)
    id(GradlePluginId.KOTLIN_KAPT)
    id(GradlePluginId.KOTLIN_PARCELIZE)

}

android {
    compileSdk = AndroidConfig.COMPILE_SDK_VERSION
    defaultConfig {
        if (!ApplicationOrLibrary.isApplication){
//            applicationId = AndroidConfig.ID
//            versionCode = AndroidConfig.VERSION_CODE
//            versionName = AndroidConfig.VERSION_NAME
        }
        minSdk = AndroidConfig.MIN_SDK_VERSION
        targetSdk = AndroidConfig.TARGET_SDK_VERSION


        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }

    buildTypes {
        getByName(BuildType.RELEASE){
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        getByName(BuildType.DEBUG){
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    sourceSets{
        getByName("main"){
            if (!ApplicationOrLibrary.isApplication){
                manifest.srcFile("src/main/AndroidManifest.xml")
            }else{
                manifest.srcFile("src/main/manifest/AndroidManifest.xml")
            }
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    implementation(project(ModuleDependency.BASIC))
}