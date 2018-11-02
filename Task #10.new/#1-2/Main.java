package com.gmail.t.bisyk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operation opr = new Operation();
		UpVocabulary upc = new UpVocabulary();

		List<String> text = opr.endlishText(new File("English.in"));
		List<String> word = new ArrayList<>();
		for (String line : text) {
			for (String wrd : line.split(" ")) {
				word.add(wrd);
			}
		}
		System.out.print("Do you want to a add word to the vocabulary (y/n): ");
		Scanner sc = new Scanner(System.in);
		for(;;) {
			String out = sc.nextLine();
			if (out.equals("n")) break;
			if (out.equals("y")) {
				upc.saveWordToFile();
				break;
			}
			System.out.println("try egain");	
		}

		List<String> vcbText = opr.endlishText(new File("vocabulary.txt"));
		Map<String, String> voc = opr.maps(vcbText);
		
		StringBuilder sb = new StringBuilder();
		for (String wrd : word) {
			sb.append(voc.get(wrd));
			sb.append(" ");
		}
		
		try {
			FileWriter fw = new FileWriter(new File("Ukrainian.out"));
			fw.write(sb.toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------");
		System.out.println(sb.toString());

	}


}
