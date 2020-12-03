package iofile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_09_wordcount_kimminwoo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("lyrics.txt");
		BufferedReader br = new BufferedReader(fr);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String lyrics;
		while ((lyrics = br.readLine()) != null) {
			String[] word = lyrics.split(" ");
			for (int i = 0; i < word.length; i++) {
				if (hm.containsKey(word[i])) {
					int count = hm.get(word[i]);
					count++;
					hm.put(word[i], count);
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
			System.out.println(lyricsT + ": " + hm.get(lyricsT));
		}

	}
}
