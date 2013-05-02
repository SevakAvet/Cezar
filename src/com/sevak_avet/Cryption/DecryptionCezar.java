package com.sevak_avet.Cryption;

public class DecryptionCezar extends CezarCryptoMethods {
	private String output;

	public DecryptionCezar(String text, int k) {

		String input = text;
		StringBuilder dec = new StringBuilder();

		for (int i = 0; i < input.length(); ++i) {
			char c = input.charAt(i);

			if (isEnglish(c)) {
				int x = (findInEnglish(c) - k + nEng) % nEng;

				if (Character.isUpperCase(c)) {
					dec.append(engslish[x]);
				} else {
					dec.append(Character.toLowerCase(engslish[x]));
				}

				continue;
			}

			if (isRussian(c)) {
				int x = (findInRussian(c) - k + nRus) % nRus;

				if (Character.isUpperCase(c)) {
					dec.append(russian[x]);
				} else {
					dec.append(Character.toLowerCase(russian[x]));
				}

				continue;
			}

			if (!isEnglish(c) && !isRussian(c)) {
				dec.append(c);
			}
		}

		output = dec.toString();
	}

	public DecryptionCezar(EncryptCezar enc) {
		int k = enc.getK();
		String input = enc.getEncText();

		DecryptionCezar dec = new DecryptionCezar(input, k);
		output = dec.getDecText();

	}

	public String getDecText() {
		return output;
	}

}
