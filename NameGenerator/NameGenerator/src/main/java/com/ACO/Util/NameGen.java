package com.ACO.Util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class NameGen {

//	public static void main(String[] args) {
//		System.out.println(nameGenerator(6l,"leB"));
//	}

	List<String> alphabet = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
			"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

	static Random rand = new Random();

	public String nameGenerator(Long length, String preName) {

		String suffix = "";

		for (int i = preName.length(); i < length; i++) {
			int random = rand.nextInt(26);

			suffix += alphabet.get(random);
		}

		String fullName = preName + suffix;

		String result = fullName.substring(0, 1).toUpperCase() + fullName.substring(1);

		return result;

	}

}
