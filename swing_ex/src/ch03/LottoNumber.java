package ch03;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	static final int LOTTO_NUMBER_SIZE = 6;

	public int[] getLottoNumber() {
		// 번호를 담을 공간 만들기
		int[] numbers = new int[LOTTO_NUMBER_SIZE];

		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			int selectedNumber = random.nextInt(45) + 1;
			numbers[i] = selectedNumber;

			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i = i - 1;
					break;
				}
			}
		}
		// 배열정렬
		Arrays.sort(numbers);
		return numbers;
	}

}
