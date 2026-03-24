plugins {
    id 'fabric-loom' version '1.7-SNAPSHOT'
    id 'maven-publish'
}

version = "1.0.0-fabric-1.21.1"
group = "com.mercurows.superbwarfare"

base {
    archivesName = "superbwarfare"
}

repositories {
    mavenCentral()
    maven { url = "https://maven.fabricmc.net/" }
    maven { url = "https://maven.terraformersmc.com/releases/" }
    maven { url = "https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/" }
    maven { url = "https://maven.blamejared.com/" }
    maven { url = "https://jitpack.io" }
}

dependencies {
    minecraft "com.mojang:minecraft:1.21.1"
    mappings "net.fabricmc:yarn:1.21.1+build.3:v2"
    modImplementation "net.fabricmc:fabric-loader:0.15.11"

    // Fabric API الأساسي
    modImplementation "net.fabricmc.fabric-api:fabric-api:0.102.0+1.21.1"

    // مكتبة GeckoLib للأنميشن (نسخة 1.21.1)
    modImplementation "software.bernie.geckolib:geckolib-fabric-1.21.1:4.5.2"

    // مكتبة Trinkets (بديل Curios في فابريك)
    modImplementation "dev.emi:trinkets:3.9.0"
}

processResources {
    inputs.property "version", project.version
    filesMatching("fabric.mod.json") {
        expand "version": project.version
    }
}

tasks.withType(JavaCompile).configureEach {
    it.options.release = 21
}

java {
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
