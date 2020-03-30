import java.util.*;

Random rand = new Random();

public static String flip(){
    int i = rand.nextInt(3);
    if (i < 2)
        return "heads";
    else
        return "tails";
}

public static boolean arePermutations(int[] a, int[] b){
	for (int j = 0; j < 100000 && !Arrays.equals(a, b); j++){
		for (int k = a.length - 1; k > 0; k--){
			int r = rand.nextInt(k + 1);
			int temp = a[k];
			a[k] = a[r];
			a[r] = temp;
		}
	}
	if (Arrays.equals(a, b))
		return true;
	else
		return false;
}

3. 0, 1, 1