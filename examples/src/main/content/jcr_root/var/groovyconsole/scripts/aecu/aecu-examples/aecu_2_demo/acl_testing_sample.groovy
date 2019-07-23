println aecu.validateAccessRights()
        .forGroups("administrators", "contributor", "content-authors")
        .forPaths("/content", "/content/cq:tags", "/content/dam", "/home/users")
        .canRead()
        .canModify()
        .canDelete()
        .cannotCreate()
        .canReadAcl()
        .cannotWriteAcl()

        .forGroups("administrators", "bla")
        .forPaths("/content/catalogs", "/sdfs")
        .canRead()

        .forGroups("administrators")
        .forPaths("/content", "/content/we-retail")
        .canRead()
        .canReadPage()

        .validate();




