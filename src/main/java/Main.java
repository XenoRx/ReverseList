import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> inputList = new ArrayList<String>();
		//вводим к примеру 1 2 3 4 5 -> 5 4 3 2 1 (через новую строку)
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()) {
			String value = input.nextLine();
			if (! value.isEmpty()) {
				inputList.add(value);
			} else {
				input.close();
				break;
			}
		}
		Collections.reverse(inputList);
		
		ArrayList<String> tmp = new ArrayList<String>();
		for (String value : inputList) {
			String str;
			//считает и схлопывает повторки
			if (Collections.frequency(inputList, value) > 1) {
				str = value + " " + Collections.frequency(inputList, value) + " повторки";
			} else {
				str = value;
			}
			tmp.add(str);
		}
		
		ArrayList<String> result = new ArrayList<String>(new LinkedHashSet<>(tmp));
		for (String value : result) {
			System.out.println(value);
		}
	}
}