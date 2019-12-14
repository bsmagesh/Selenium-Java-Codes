package week3.day2.classroom1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapClass {
	public static void main(String args[]) {
		String name="Testleaf";
		char[] charArray = name.toCharArray();

		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i])+1);
			}else  {
				map.put(charArray[i], 1);

			}
		}
		for (Entry<Character,Integer> nextLine: map.entrySet()) {
			System.out.println(nextLine.getKey()+"="+nextLine.getValue());
		}
	}
}
