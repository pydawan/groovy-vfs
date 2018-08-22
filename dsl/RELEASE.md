# Changelog

## 1.1 - Roadmap
+ [Using a closure as a filter when copying](https://github.com/ysb33r/groovy-vfs/issues/4)
+ [Allow option not to create intermediate paths when copying](https://github.com/ysb33r/groovy-vfs/issues/2)
+ [Create complex URIs with a closure](https://github.com/ysb33r/groovy-vfs/issues/11)
+ [Delete functionality](https://github.com/ysb33r/groovy-vfs/issues/9)
+ [Allow cookies to be passed to http/https schemas](https://github.com/ysb33r/groovy-vfs/issues/10)
+ [Add append to DSL for multiple files](https://github.com/ysb33r/groovy-vfs/issues/37)

## 1.0
+ [Add option to mkdir to not automatically create intermediate paths](https://github.com/ysb33r/groovy-vfs/issues/18)
+ [Send arbitrary content to a remote file](https://github.com/ysb33r/groovy-vfs/issues/39)
+ [uri keyword](https://github.com/ysb33r/groovy-vfs/issues/38)
+ [Up to date check related to GET_LAST_MODIFIED](https://github.com/ysb33r/groovy-vfs/issues/64)
+ Support for `mkdir`
+ `defaultProvider` will be ignored when constructing a `VFS` object. Use `provider` configuration closure instead.
+ Pass `antPattern` to `filter` to use ANT-style patterns when copying files
+ Added boolean property `closeFileSystem` that can be passed to `ls` method.
+ Fixed issue when resolved URI are passed to some methods with additional non-VFS options

## 0.5
+ Removed standalone use of InputStream when applying `cat`.
+ [Fix use of mavenRepo](https://github.com/ysb33r/groovy-vfs/issues/12)
+ [Fix MissingMethodException when uri was a FileObject and extra properties were provided](https://github.com/ysb33r/groovy-vfs/issues/16)
+ [Fix issue with connection not closing when using cat method](https://github.com/ysb33r/groovy-vfs/issues/15)
+ Source Jar will be created as part of build

## 0.4
+ [Fixed Bug #6](https://github.com/ysb33r/groovy-vfs/issues/6) - Obtain logger instance in use by Groovy VFS
+ [Fixed Bug #8](https://github.com/ysb33r/groovy-vfs/issues/8) - Overwrite fails when using nested schemas
+ [CodeNarc checks added to source code](https://github.com/ysb33r/groovy-vfs/issues/7)
+ Upgraded to Gradle 1.11

## 0.3
+ [Move files and folders between sites](https://github.com/ysb33r/groovy-vfs/issues/3)
+ Copy operations support using a closure for overwrites
+ Builds with JDK6

## 0.2
+ DSL for setting options
+ Replaced ```vfs << {}``` with ```vfs {}```

## 0.1.1
+ Published in Maven format instead of Ivy (using gradle-bintray plugin)

## 0.01
+ Initial release
+ Support for `cp`, `ls`, `cat`
