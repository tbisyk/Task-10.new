package com.gmail.t.bisyk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FontChoose {

	public FontChoose() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Map<Character, StringBuilder> fontChoose() {
		Map<Character, StringBuilder> la = new HashMap<>();
		ShifrFont sfr = new ShifrFont();
		System.out.print("Enter the font (1/2): ");
		Scanner sc = new Scanner(System.in);
		for (; ;) {
			String font = sc.nextLine();
			if (font.equals("1")) {
				sfr = new ShifrOne();
				break;
			}
			if (font.equals("2")) {
				sfr = new ShifrTwo();
				break;
			}
			System.out.println("try again...");
		}
		for (int i = 65; i < 91; i++) {
			la.put((char) i, sfr.shifr(i));
		}
		la.put(' ', sfr.shifr(91));
		return la;
	}

}
