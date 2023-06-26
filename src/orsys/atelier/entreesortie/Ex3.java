package orsys.atelier.entreesortie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) throws IOException {

		String chemin = "ex3.txt";
		Stream<String> stream = new BufferedReader(new FileReader(chemin)).lines();
		List<String> strings = stream.collect(Collectors.toList());
		File newFile = new File("resultat.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
		strings.forEach((line) -> {
			if (line.contains("WARNING")) {
				try {
					writer.write(line + "\n");
					System.out.println(line);
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		});
		writer.close();
	}
}
