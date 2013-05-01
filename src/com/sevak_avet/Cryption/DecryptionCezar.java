package com.sevak_avet.Cryption;

public class DecryptionCezar extends CezarCryptoMethods{
	private String output;
	
	public DecryptionCezar(String text, int k){
		
		String input = text;
		StringBuilder dec = new StringBuilder();
		
		for(int i=0; i<input.length(); ++i){
			char c = input.charAt(i);
			
			if((findInLower(c) == -1) && (findInUpper(c) != -1)){
				int x = (findInUpper(c)-k+n)%n;
				dec.append(upper[x]);
			}
			if((findInUpper(c) == -1) && (findInLower(c) != -1)){
				int x = (findInLower(c)-k+n)%n;
				dec.append(lower[x]);
			}
			if((findInUpper(c) == -1) && (findInLower(c) == -1)){
				dec.append(c);
			}
		}
		
		this.output = dec.toString();
	}
	
	public DecryptionCezar(EncryptCezar enc) {
		int k = enc.getK();
		String input = enc.getEncText();
		
		StringBuilder dec = new StringBuilder();
		
		for(int i=0; i<input.length(); ++i){
			char c = input.charAt(i);
			
			if((findInLower(c) == -1) && (findInUpper(c) != -1)){
				int x = (findInUpper(c)-k+n)%n;
				dec.append(upper[x]);
			}
			if((findInUpper(c) == -1) && (findInLower(c) != -1)){
				int x = (findInLower(c)-k+n)%n;
				dec.append(lower[x]);
			}
			if((findInUpper(c) == -1) && (findInLower(c) == -1)){
				dec.append(c);
			}
		}
		
		this.output = dec.toString();
	}
	
	public String getDecText(){
		return this.output;
	}

}
