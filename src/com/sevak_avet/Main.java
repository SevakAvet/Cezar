package com.sevak_avet;
public class Main {        
	public static void main(String[] args) {
		EncryptCezar enc = new EncryptCezar("Sevak םו רטפנףי 1111!!!", 1);
		System.out.println(enc.getEncText());
		
		DecryptionCezar dec = new DecryptionCezar(enc.getEncText(), enc.getK());
		System.out.println(dec.getDecText());
	}
}
