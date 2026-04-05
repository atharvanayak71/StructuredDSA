package StructuredDSA;
public class AddDigits {
    int AddDigits() {
        int num = 55;
        int original = num;
        while (num >= 10) {
            int Add = 0;
            while (num != 0) {
                if (num < 0 || num > Math.pow(2, 31) - 1) {
                    return 0;
                }
                int lastDigit = num % 10;
                Add = Add + lastDigit;
                num = num / 10;

            }
            num = Add;
        }
        return num;
    }
    public static void main(String[] args) {
        AddDigits ab = new AddDigits();
        System.out.println(ab.AddDigits());
    }
}
