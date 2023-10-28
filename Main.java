public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: number <position>");
            System.exit(1);
        }

        try {
            int position = Integer.parseInt(args[0]);
            long result = calculateFibonacci(position);
            System.out.println("fibonacci number here " + position + " is: " + result);
        } catch (NumberFormatException e) {
            System.err.println("its needs to be an intager.");
            System.exit(1);
        }
    }

    public static long calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long prev = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }
}
