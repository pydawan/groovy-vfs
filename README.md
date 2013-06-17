A DSL for Groovy to wrap around the Apache VFS libraries

Groovy Code
===========
```groovy
  import org.ysb33r.groovy.dsl.vfs.VFS

  def vfs = new VFS()
 
  // Simple copy operation 
  vfs.cp 'ftp://foo.example/myfile', 'sftp://bar.example/yourfile'
 
   // Utilising the DSL 
   vfs {
   
     // Copy file from one site to anther using two different protocols
     cp 'http://first.example/myfile', 'sftp://second.example/yourfile'
     
     // Not implemented yet - move file between two sites using different protocols
     mv 'sftp://second.example/yourfile', 'ftp://third.example/theirfile'
     
     // Lists all files on a remote site
     ls 'http://first.example' {
       println it.name
     }
      
     // Streams the output 
     println cat ('http://first.example/myfile') .text 
 
     // Change default options via property Map
     options 'vfs.ftp.passiveMode' : true
     
     // Change default options DSL style
     options {
       ftp {
         passiveMode true
       }
     }
     
     // Use options on a per URL basis
     cp 'ftp://first.example/myfile?vfs.ftp.passiveMode=1', 'sftp://second.example/yourfile?vfs.sftp.compression=zlib'
     
     
   }  
```


Gradle plugin (EXPERIMENTAL)
=============

It is now possible to use this in Gradle as an extension to the project class.
The interface is very experimental and may change without much warning in future
releases of this plugin.

```groovy

buildscript {
    repositories {
        mavenCentral()
        mavenRepo(url: 'http://repository.codehaus.org')
        mavenRepo(url: 'http://dl.bintray.com/ysb33r/grysb33r')
      }
      dependencies {
        classpath 'org.ysb33r.gradle:vfs:0.2'
      }
}
apply plugin : 'vfs'

// Create a VFS task
task copyReadme << { 
  project.vfs {
    cp 'https://raw.github.com/ysb33r/groovy-vfs/master/README.md', "${buildDir}/tmp/README.md"
  }
}

// it is also possible to update global options for vfs
project.vfs {
  options {
    http {
      maxTotalConnections 4
    }
  }
}


```

Credits
=======

It is seldom that these kind of libraries happen in isolation. It is therefore prudent 
that I acknowledge the inputs of others in the creation of groovy-vfs

+ Will_lp (https://gist.github.com/will-lp/5785180) & Jim White (https://gist.github.com/jimwhite/5784982) 
offered great suggestions when I got stuck with the config DSL. 
