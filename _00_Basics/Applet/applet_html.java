package _00_Basics.Applet;

//applet_html.java

import java.applet.Applet;

import java.awt.Graphics;

public class applet_html extends Applet {

    public void paint(Graphics g) {

        g.drawString("welcome", 150, 150);

    }
}

// Note: class must be public because its object is created by Java
// Plugin software that resides on the browser.

// myapplet.html

// <html>

// <body>

// <applet code="applet_html.class"width="300"height="300">

// </applet>

// </body>

// </html
// >