package fr.epsi.test.tdd.roman;

public enum RomanSymbol {

	M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);

	private final int chiffreArabe;

	RomanSymbol(int i) {
		this.chiffreArabe = i;
	}

	public int getChiffreArabe() {
		return chiffreArabe;
	}
	
}
