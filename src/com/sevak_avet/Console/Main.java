package com.sevak_avet.Console;

import com.sevak_avet.Cryption.DecryptionCezar;
import com.sevak_avet.Cryption.EncryptCezar;

public class Main {
	public static void main(String[] args) {
		/**
		 * А.С.Пушкин "Я вас любил" 1829г
		 */

		EncryptCezar enc = new EncryptCezar(
				"Я вас любил: любовь еще, быть может, \n"
						+ "В душе моей угасла не совсем; \n"
						+ "Но пусть она вас больше не тревожит; \n"
						+ "Я не хочу печалить вас ничем. \n"
						+ "Я вас любил безмолвно, безнадежно, \n"
						+ "То робостью, то ревностью томим; \n"
						+ "Я вас любил так искренно,так нежно, \n"
						+ "Как дай вам бог любимой быть другим. \n", 7);

		System.out.println(enc.getEncText());

		DecryptionCezar dec = new DecryptionCezar(enc);
		System.out.println(dec.getDecText());

		/**
		 * У.Шекспир "Ромео и Джульетта"
		 */

		EncryptCezar encRomeo = new EncryptCezar(
				"A glooming peace this morning with it brings; \n"
						+ "The sun, for sorrow, will not show his head: \n"
						+ "Go hence, to have more talk of these sad things; \n"
						+ "Some shall be pardon'd, and some punished: \n"
						+ "For never was a story of more woe \n"
						+ "Than this of Juliet and her Romeo.", 7);

		System.out.println(enc.getEncText());

		DecryptionCezar decRomeo = new DecryptionCezar(encRomeo);
		System.out.println(decRomeo.getDecText());
	}
}
