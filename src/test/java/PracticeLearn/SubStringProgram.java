package PracticeLearn;

public class SubStringProgram {

	public static void main(String[] args) {

		String name = "abcabcabcabxabcabcagdhadbfkwbribwvafbvhsfbvbabc";
		int num = name.length();
		int count = 0;

		for (int i = 0; i <= num-3; i = i + 3) {

			if ("abc".equals(name.substring(i, i + 3))) {
				count++;

			}

		}
		System.out.println(count);
	}

}
