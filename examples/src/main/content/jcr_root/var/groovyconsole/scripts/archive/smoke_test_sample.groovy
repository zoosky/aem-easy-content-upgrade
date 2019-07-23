
println aecu.contentUpgradeBuilder()
        .forChildResourcesOf("/content/we-retail/ca/en")
        .filterByProperty("sling:resourceType",
        "weretail/components/structure/page")
        .doCheckPageRendering()
        .doCheckPageRendering(200)
        .doCheckPageRendering("some test string")
        .doCheckPageRendering("some test string", "exception")
        .run()