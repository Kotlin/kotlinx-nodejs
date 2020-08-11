val SOURCE_TARGET_DIR = "${project.buildDir}/sources"

task<Copy>("prepareSources") {
    from("package.template.json")
    into(SOURCE_TARGET_DIR)

    from("package-lock.json")
    into(SOURCE_TARGET_DIR)

    rename { fileName -> fileName.replace(".template", "") }
}

task<Exec>("installSources") {
    dependsOn("prepareSources")

    workingDir(SOURCE_TARGET_DIR)
    commandLine(listOf("npm", "ci", "package.json"))
}
