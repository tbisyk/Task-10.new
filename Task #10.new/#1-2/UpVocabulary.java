package com.gmail.t.bisyk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UpVocabulary {
	public void saveWordToFile() {
		Operation opr = new Operation();
		Scanner sc = new Scanner(System.in);
		boolean out = true;
		for (; out;) {
			try {
				FileWriter fw = new FileWriter(new File("vocabulary.txt"), true);
				System.out.print("English word: ");
				String en = sc.nextLine();
				System.out.print("Translate to Ukranian: ");
				String ua = sc.nextLine();
				String nword = en + " " + ua;
				fw.write(nword.toUpperCase() + "\n");
				fw.flush();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.print("do you want to repeat (y/n): ");
			for (;;) {
				String ot = sc.nextLine();
				if (ot.equals("y")) {
					break;
				}
				if (ot.equals("n")) {
					out = false;
					break;
				}
				System.out.println("try again");
			}
		}

}
}
