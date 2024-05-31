plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.couselling"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.couselling"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("com.android.volley:volley:1.2.1")
    implementation ("com.mikhaellopez:circularimageview:4.3.1")
    implementation ("com.balysv:material-ripple:1.0.2")
    implementation ("com.squareup.retrofit2:retrofit:2.4.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.4.0")
}