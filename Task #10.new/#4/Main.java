package com.gmail.t.bisyk;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// http://patorjk.com/software/taag/#p=display&c=c&f=4Max&t=V%20W%20X%20Y%20Z
		Map<Character, StringBuilder> litterArt = new HashMap<>();
		FontChoose fs = new FontChoose();
		String text = "i like cat";

		litterArt = fs.fontChoose();

		String aToArt = litterArt.get('A').toString();
		int row = aToArt.split("\n").length;
		int n = 0;
		char[] litter = aToArt.toCharArray();
		for (; litter[n] != '\n';) {
			n++;
		}

		char[] w = text.toUpperCase().toCharArray();
		StringBuilder[] lo = litterToArray(w, text.length(), litterArt);

		System.out.println(textToArt(lo, row, n, text.length()).toString());
	}

	private static StringBuilder[] litterToArray(char[] w, int length, Map<Character, StringBuilder> lArt) {
		StringBuilder[] out = new StringBuilder[length];
		String temp = "";
		for (int i = 0; i < length; i++) {
			out[i] = new StringBuilder("");
			temp = lArt.get(w[i]).toString();
			out[i].append(temp);
		}
		return out;
	}

	private static StringBuilder textToArt(StringBuilder[] lo, int row, int n, int length) {
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < length; j++) {
				out.append(lo[j].subSequence(0, (n - 1))).append(" ");
				lo[j].delete(0, n + 1);
			}
			out.append(System.lineSeparator());
		}
		return out;
	}

}
