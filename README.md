This git repository demonstrates a problem I've found with the VS Code Metals Extension version 1.2.

When a SBT project (p1) is opened that depends on another project (p2) using a relative path eg `ProjectRef(file("../p2"))`, Metals is unable to build the project even when SBT manages fine. So no SematicDB is created and the IDE code navigation features dont work.

When p1 project is imported, the VS Code Output window shows the following message:
```
Missing project 'p2', may cause compilation issues in project 'root'
```

This repository is an updated version of a previous reproduction: https://github.com/benhutchison/metals_import_test
