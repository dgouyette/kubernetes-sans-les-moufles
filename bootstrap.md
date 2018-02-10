### Initialisation

Installation de kubernetes avec minkube. 

Cela permet de tester en local kubernetes sans devoir passer par un cloud type Google Compute Engine.


## MacOS

#### Kubernetes

Récupérer [binaries/macos/kubectl](binaries/macos/kubectl)
Rendez le exécutable `chmod +x ./kubectl`

*ou si vous avez du réseau :  `brew install kubectl`*

#### Minikube

Récupérer [binaries/macos/minikube](binaries/macos/minikube)
Rendez le exécutable `chmod +x minikube && sudo mv minikube /usr/local/bin/`

### Complétion

ZSH 
`source <(kubectl completion zsh)`


Si vous avez du réseau : 

```
## Bash 3.2 included with macOS
brew install bash-completion
## Bash 4.1+
brew install bash-completion@2
```

*Si vous utilisez oh-my-zsh : *

`éditer ~/.zshrc  et ajouter à plugins=kubectl`

## Linux

#### Kubernetes

Récupérer [binaries/linux/kubectl](binaries/linux/kubectl)
Rendez le exécutable `chmod +x ./kubectl`


#### Minikube

Récupérer [binaries/linux/minikube](binaries/linux/minikube)
Rendez le exécutable `chmod +x minikube && sudo mv minikube /usr/local/bin/`

#### Complétion
source <(kubectl completion bash)


## Windows 

#### Kubernetes


Récupérer [binaries/windows/kubectl.exe](binaries/windows/kubectl.exe)

#### Minikube [Experimental]

Récupérer [binaries/windows/minikube.exe](binaries/windows/minikube.exe)




### Références :  

[Installation kubernetes](https://kubernetes.io/docs/tasks/tools/install-kubectl/)

[Installation minikube](https://github.com/kubernetes/minikube/releases)