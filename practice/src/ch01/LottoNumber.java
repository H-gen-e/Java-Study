package ch01;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {
	
	final int LOTTO_NUMBER_CNT = 6;

	public int[] getLottoNumber() {
		
		int[] numbers = new int[LOTTO_NUMBER_CNT];
		Random rd = new Random();
		
		for(int i=0;i<numbers.length;i++) {
			int selectedNumber = rd.nextInt(45)+1;
			numbers[i] = selectedNumber;
			
			for(int j=0;j<i;j++) {
				if(numbers[i]==numbers[j]) {
					i = i -1;
					break;
				}
			}
		}
		
		Arrays.sort(numbers);
		return numbers;
		
	}
	
}
