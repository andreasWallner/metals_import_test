lazy val root = project.in(file(".")).dependsOn(p2)

lazy val p2 = ProjectRef(file("../p2"), "p2")
      

bloopAggregateSourceDependencies in Global := true