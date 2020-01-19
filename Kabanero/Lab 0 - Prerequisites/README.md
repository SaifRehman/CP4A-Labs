# Pre-requisites of Kabanero 

## What is Kabanero ?

Kabanero is an open source project that brings together foundational open source technologies into a modern microservices-based framework. This provides an end-to-end solution that enables you to architect, build, deploy, and manage the lifecycle of Kubernetes-based applications, faster.

Kabanero brings together architecture, development, and operations through the use of integrated collections and application stacks. Architects and operations can include their company’s standards for aspects like security and build pipelines customized for their developers use.

## Pre-Requisute installation 

### Installing on macOS

Follow these steps:

1. If you don't have the Xcode command line tools installed on your system, install them by running:

```
$ xcode-select --install
```

2. If you don't have Homebrew installed on your system, install it by running:

```
$ /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

3. To install Appsody, run:

```
$ brew install appsody/appsody/appsody
```

### Installing on Ubuntu

Follow these steps:

1. Your user account must be a member of the docker group, which you can configure by running sudo usermod -aG docker <username>

2. Download the latest Debian install package from the [Appsody releases page](https://github.com/appsody/appsody/releases). The file is named appsody_v.r.m_amd64.deb, where v.r.m indicates the release tag.

3. To install the package, run:

```
$ sudo apt install -f <path>/appsody_v.r.m_amd64.deb
```

### Installing on RHEL

Follow these steps:

1. Your user account must be a member of the docker group, which you can configure by running sudo usermod -aG docker <username>

2. Download the latest RPM install package from the [Appsody releases page](https://github.com/appsody/appsody/releases). The file is named appsody-v.r.m-1.x86_64.rpm, where v.r.m indicates the release tag.

3. To install the package, run:

```
$ sudo yum install <path>/appsody-v.r.m-1.x86_64.rpm
```