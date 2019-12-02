package com.swe795.tracker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.*;

public class DebuggerHook {	
	public static Debugger debugger;
	private static ExecutorService executor = Executors.newSingleThreadExecutor();
	
	public static void injectDebugger(Object instance, ClassLoader loader) {
		StackTraceElement[] stack = new Throwable().getStackTrace();
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					if(debugger == null) {
						try {
							UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
						}catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
							e.printStackTrace();
						}
						debugger = new Debugger();
					}
					debugger.addClass(stack[1].getClassName(), instance, loader);
				}catch(Exception e) {
					Debugger.showErrorDialog("Exception while loading Debugger.", e);
					e.printStackTrace();
				}
			}
		};
		
		executor.execute(thread);
	}
}
