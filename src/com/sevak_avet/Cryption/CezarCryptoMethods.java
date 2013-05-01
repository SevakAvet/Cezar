package com.sevak_avet.Cryption;

public class CezarCryptoMethods {
	
    protected static final int n = 26; // мощность алфавита
	protected static char[] upper = 
        {'A','B','C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q',
            'R','S','T','U','V','W','X','Y','Z'};
        
    protected static char[] lower= {'a','b','c','d','e','f','g','h',
            'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
	 public static int findInUpper(char c){
			int rez = -1;
			
			for(int i=0; i<upper.length; ++i){
				if(c == upper[i]) rez = i;
			}
			return rez;
		}
		
		public static int findInLower(char c){
			int rez = -1;
			
			for(int i=0; i<lower.length; ++i){
				if(c == lower[i]) rez = i;
			}
			return rez;
		}

}
