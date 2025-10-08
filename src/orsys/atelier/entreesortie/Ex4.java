package orsys.atelier.entreesortie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader fichiertxt = new BufferedReader(new FileReader("ex3.txt"));
		 
        List<String> fichiertxtWARNING = fichiertxt.lines()
                .filter(x -> x.contains("WARNING")).collect(Collectors.toList());

        System.out.println(fichiertxtWARNING);
	}
}
