package com.curso.v5;

public class CompuLinux extends Computadora {
	
	//HAS-A
	String version;

	public CompuLinux(String version) {
		this.version = version;
	}

	public void prender() {
		System.out.println("Linux version: "+version+ ", inicio");
	}

}
