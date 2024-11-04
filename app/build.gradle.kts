plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.dynamicappexample"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dynamicappexample"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        viewBinding = true;
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

//    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation("androidx.core:core:1.13.0")
    implementation("com.android.support:support-compat:27.1.1") {
        exclude(group = "androidx.core", module = "core")
    }
//    implementation(libs.android.networking)
    implementation("com.github.amitshekhariitbhu.Fast-Android-Networking:android-networking:1.0.4")

}