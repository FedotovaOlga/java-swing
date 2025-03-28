package org.eclipse.main;

import java.awt.Frame;

import org.eclipse.frames.CalculetteFrame;
import org.eclipse.frames.Firstframe;

public class Main {

	public static void main(String[] args) {
//		Firstframe frame = new Firstframe();
//		frame.dispose();
		CalculetteFrame frame = new CalculetteFrame();
		frame.showFrame();
		System.out.println("GUI créé");

	}

}
