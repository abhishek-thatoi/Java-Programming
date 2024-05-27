package _00_Basics.Applet;

//applet_viewer.java

import java.applet.Applet;

import java.awt.Graphics;

public class applet_viewer extends Applet{

public void paint(Graphics g){

g.drawString("welcome to applet",150,150);

}

}

/*

<applet code="applet_viewer.class" width="300" height="300">

</applet>

*/



// !To execute the applet by appletviewer tool, write in command
// prompt:

// c:\>javac applet_viewer.java

// c:\>appletviewer applet_viewer.java