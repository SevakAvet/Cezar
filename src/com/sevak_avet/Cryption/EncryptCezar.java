package com.sevak_avet.Cryption;

public class EncryptCezar extends CezarCryptoMethods {

	private String output;
	private int k;

	public EncryptCezar(String text, int k) {
		this.k = k;
		String input = text;
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < input.length(); ++i) {
			char c = input.charAt(i);

			if (isEnglish(c)) {
				int y = (findInEnglish(c) + k) % nEng;

				if (Character.isUpperCase(c)) {
					output.append(engslish[y]);
				} else {
					output.append(Character.toLowerCase(engslish[y]));
				}
				
				continue;
			}
			
			if (isRussian(c)) {
				int y = (findInRussian(c) + k) % nRus;
				
				if (Character.isUpperCase(c)) {
					output.append(russian[y]);
				} else {
					output.append(Character.toLowerCase(russian[y]));
				}
				
				continue;
			} 
			
			if (!isEnglish(c) && !isRussian(c)) {
				output.append(c);
			}
		}
		this.output = output.toString();
	}

	public String getEncText() {

		return this.output;
	}

	public int getK() {

		return this.k;
	}

}
