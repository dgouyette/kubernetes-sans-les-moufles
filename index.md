Introduction


Notion d’environnement (avec helm)
Avoir des environnements cohérents  (versions applicative)
Configuration sous la forme de code
Gestion de failure 
Abstraction sur les resources matérielles ( elles sont représentées comme un seule grosse resources de calcul
On déploie des applications sans savoir où elles seront exécutées

Déploiement d.un ensemble applicatif


[Boostrap](bootstrap.md)

```
   binaries
   ├──   linux
   │   └── [ 64M]  kubectl
   ├──   macos
   │   └── [ 64M]  kubectl
   └──   windows
       └── [ 65M]  kubectl.exe
```


[Pods](pods.md)

[Replications controllers](replication-controller.md)

[Services](services.md)
[Ingress](ingress.md)

[Déploiement](deployment.md)

[Monitoring](monitoring.md)

[Gestionnaire de dépendance](helm.md)