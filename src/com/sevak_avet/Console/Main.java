package com.sevak_avet.Console;
import com.sevak_avet.Cryption.DecryptionCezar;
import com.sevak_avet.Cryption.EncryptCezar;


public class Main {
	public static void main(String[] args) {
		EncryptCezar enc = new EncryptCezar("Hello, Habhahabr!", 7);
		System.out.println(enc.getEncText());
		
		DecryptionCezar dec = new DecryptionCezar(enc);
		System.out.println(dec.getDecText());
	}
}
