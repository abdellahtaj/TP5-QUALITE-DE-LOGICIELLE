package library.util;

// Responsabilité extraite de Book (SRP) : classification de nombres
public class NumberClassifier {

    public String classify(int i) {
        if (i % 2 == 0) {
            return i + " is even";
        } else if (i % 3 == 0) {
            return i + " divisible by 3";
        }
        return i + " something else";
    }

    public void printUpTo(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(classify(i));
        }
    }
}
