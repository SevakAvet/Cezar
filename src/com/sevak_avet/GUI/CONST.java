package com.sevak_avet.GUI;

public enum CONST {
	VERSION_ENCRYPT("Cezar Encryption v0.1a"),
	VERSION_DECRYPT("Cezar Decryption v0.1a"),
	WIDTH(400),
	HEIGHT(300);
	
	private String version;
	private int size;
	
	public String getVersion() {
		return version;
	}
	
	public int getSize(){
		return size;
	}
	
	
	CONST(String str){
		version = str;
	}
	
	CONST(int i){
		size = i;
	}
	
	
}
