package org.lang;

public class StateDetails extends LanguageInfo {
	public void southIndia() {
		System.out.println("TAMIL");
	}
	private void northIndia() {
		System.out.println("ENGLISH");
	}
			public static void main(String[] args) {
				StateDetails L = new StateDetails();
			L.northIndia();
			L.southIndia();
			L.tamilLanguage();
			L.englishLanguage();
			L.hindiLanguage();
	}
}
