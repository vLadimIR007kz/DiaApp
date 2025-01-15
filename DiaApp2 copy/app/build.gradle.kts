plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.rwell.diaapp" // Пространство имен приложения
    compileSdk = 35 // Уровень API для компиляции

    defaultConfig {
        applicationId = "com.rwell.diaapp" // Уникальный идентификатор приложения
        minSdk = 24 // Минимальный уровень API
        targetSdk = 34 // Целевой уровень API
        versionCode = 1 // Версия кода приложения
        versionName = "1.0" // Версия приложения
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner" // Тестовый раннер
    }

    buildTypes {
        release {
            isMinifyEnabled = false // Минификация кода отключена для релиза
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), // Основной ProGuard-файл
                "proguard-rules.pro" // Ваши правила ProGuard
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11 // Версия Java для исходного кода
        targetCompatibility = JavaVersion.VERSION_11 // Целевая версия Java
    }

    kotlinOptions {
        jvmTarget = "11" // Целевая версия JVM для Kotlin
    }

    buildFeatures {
        compose = true // Включение Jetpack Compose
    }
}

dependencies {
    // Core библиотеки AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation("androidx.appcompat:appcompat:1.6.1")


    // Jetpack Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    // Дополнительные библиотеки AndroidX
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.coordinatorlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.preference)
    implementation(libs.androidx.preference.ktx)

    // Material Design
    implementation("com.google.android.material:material:1.10.0") // Google Material Components

    // Flexbox Layout
    implementation(libs.flexbox)

    // MPAndroidChart
    implementation(libs.mpandroidchart)

    // Тестирование
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)

    // Инструменты отладки
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

}
