package ua.university;


/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        return new double[]{sum, average};
    }

    /**
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } 
        return c;
    }

    /**
     /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else if (score >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new IllegalArgumentException("Day must be between 1 and 7");
        }
    }

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers do not have factorials.");
        }
         if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
            if (arr == null) {
                throw new IllegalArgumentException("Matrix must not be null");
            }
            int[] reversed = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                reversed[i] = arr[arr.length - 1 - i];
            }
        return reversed;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
    if (matrix == null) {
        throw new IllegalArgumentException("Matrix must not be null");
    }
        int sum = 0;    
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Matrix must not be null");
        }
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        return true;
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
    if (n <= 0) {
        throw new IllegalArgumentException("n must be positive");
    }
    int[][] table = new int[n][n];
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            table[i - 1][j - 1] = i * j;
        }
    }
    return table;
}

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        if (n < 2) {
            return new int[0];
        }
        int[] evens = new int[n / 2];
        int index = 0;
        for (int i = 2; i <= n; i += 2) {
            evens[index++] = i;
        }
        return evens;
    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
        return false; 
    }
    if (n == 2) {
        return true; 
    }
    if (n % 2 == 0) {
        return false; 
    }

    int limit = (int) Math.sqrt(n); 
    for (int i = 3; i <= limit; i += 2) { 
        if (n % i == 0) {
            return false;
        }
    }
    return true;
    
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        if (s == null) {
            return 0;
        }
        s = s.toLowerCase();
        int count = 0;
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        } else if (n == 1) {
            return new int[]{0};
        } else if (n == 2) {
            return new int[]{0, 1};
        }
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }
        for (int[] row : matrix) {
            if (row.length != matrix[0].length) {
                throw new IllegalArgumentException("All rows must have the same length");
            }
        }
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     */
public static int[] sortArray(int[] arr) {
 if (arr == null) {
        return null; 
    }

    int[] copy = arr.clone(); 
    int n = copy.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (copy[j] > copy[j + 1]) {

                int temp = copy[j];
                copy[j] = copy[j + 1];
                copy[j + 1] = temp;
            }
        }
    }

    return copy;
}
}