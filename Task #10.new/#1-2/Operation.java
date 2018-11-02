package com.gmail.t.bisyk;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Operation {
	public Operation() {
		super();
	}
	public List<String> endlishText(File file) {
		List<String> lines = new ArrayList<>();
		Stream<String> st;
		try {
			st = Files.newBufferedReader(Paths.get(file.getAbsolutePath()),Charset.forName("windows-1251"))
								 .lines()
								 .map(n -> n.toUpperCase());
		lines = st.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	public Map<String, String> maps(List<String> lines) {
		Map<String, String> voc = new HashMap<>();
		for (String line : lines) {
			boolean keyBool = true;
			String key = "";
			String valve = "";
			for (String wrd : line.split(" ")) {
				if (keyBool) {
					key = wrd;
					keyBool = false;
				}else {
					valve = wrd;
				}
			}
			voc.put(key, valve);
		}
		return voc;
	}

}
