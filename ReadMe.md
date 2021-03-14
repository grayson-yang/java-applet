# Producing a Applet Application

This guide walks you through the process of creating an application through Java Applet.



## What you'll build

You'll build a Java Applet application that let's you operate in Web Browser and Desktop, using the different way to setup the Java Applet application.

```text
[TODO] JFrame vs JApplet

[I] javax.swing.RootPaneContainer
	java.awt.Frame
		javax.swing.JFrame
	java.applet.Applet
		javax.swing.JApplet
```

Note, You must have a Java 2-enabled browser to view the applet.

## What you'll need

- About 15 minutes
- A favorite text editor or IDE
- JDK 1.8 or later
- Gradle 4+ or Maven 3.2+
- You can also import the code straight into your IDE:
  - IntelliJ IDEA

## How to complete this guide





```bat
load: class WelcomeApplet.class not found.
java.lang.ClassNotFoundException: WelcomeApplet.class
        at sun.applet.AppletClassLoader.findClass(AppletClassLoader.java:219)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at sun.applet.AppletClassLoader.loadClass(AppletClassLoader.java:152)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
        at sun.applet.AppletClassLoader.loadCode(AppletClassLoader.java:634)
        at sun.applet.AppletPanel.createApplet(AppletPanel.java:799)
        at sun.applet.AppletPanel.runLoader(AppletPanel.java:728)
        at sun.applet.AppletPanel.run(AppletPanel.java:378)
        at java.lang.Thread.run(Thread.java:748)
```

