package iofile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_09_wordcount_김민우 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("lyrics.txt"));
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String lyrics;
		while ((lyrics = br.readLine()) != null) {
			String[] word = lyrics.split("\s");
			int length = word.length;
			for (int i = 0; i < length; i++) {
				if (hm.containsKey(word[i])) {
					hm.put(word[i], hm.get(word[i]) + 1);
				} else {
					hm.put(word[i], 1);
				}
			}
		}
		br.close();
		Set<String> set = hm.keySet();
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String lyricsT = iter.next();
			System.out.println(lyricsT + ":\s" + hm.get(lyricsT));
		}
	}
}