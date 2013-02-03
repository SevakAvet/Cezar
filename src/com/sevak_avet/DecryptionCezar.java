package com.sevak_avet;

public class DecryptionCezar extends CezarCryptoMethods{
	private String output;
	
	public DecryptionCezar(String text, int k){
		String input = text;
		StringBuilder dec = new StringBuilder();
		
		for(int i=0; i<input.length(); ++i){
			char c = input.charAt(i);
			
			if((findIndLower(c) == -1) && (findIndUpper(c) != -1)){
				int x = (findIndUpper(c)-k+n)%n;
				dec.append(upper[x]);
			}
			if((findIndUpper(c) == -1) && (findIndLower(c) != -1)){
				int x = (findIndLower(c)-k+n)%n;
				dec.append(lower[x]);
			}
			if((findIndUpper(c) == -1) && (findIndLower(c) == -1)){
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
			
			if((findIndLower(c) == -1) && (findIndUpper(c) != -1)){
				int x = (findIndUpper(c)-k+n)%n;
				dec.append(upper[x]);
			}
			if((findIndUpper(c) == -1) && (findIndLower(c) != -1)){
				int x = (findIndLower(c)-k+n)%n;
				dec.append(lower[x]);
			}
			if((findIndUpper(c) == -1) && (findIndLower(c) == -1)){
				dec.append(c);
			}
		}
		
		this.output = dec.toString();
	}
	
	public String getDecText(){
		return this.output;
	}

}
