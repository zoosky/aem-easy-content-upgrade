
def conditionMap_resourceType = [:]
conditionMap_resourceType['sling:resourceType'] = "weretail/components/content/heroimage"

println aecu
        .contentUpgradeBuilder()
        // collectors
        .forDescendantResourcesOf("/content/we-retail/ca/en")
        // filters
        .filterByProperties(conditionMap_resourceType)
        // actions
        .printPath()
        .doSetProperty("useFullWidth", false)
        .run()



