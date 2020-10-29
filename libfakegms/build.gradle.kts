import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("signal-library")
}

android {
    namespace = "com.google.android.gms"
}

dependencies {
    implementation(libs.androidx.preference)
    implementation(libs.osmdroid)
}
