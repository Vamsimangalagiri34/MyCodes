class GratestOfTwoN{
    public static void main(String ar[]){
        int a=34;
        int b=98;
        String res=a>b?"a is big":"b is big";
        System.out.println(res);
    }
}

// The time complexity of your code is O(1).

// Here's why:

// Variable Assignments: The assignments int a = 34; and int b = 98; are constant time operations.

// Ternary Operator: The ternary operation String res = a > b ? "a is big" : "b is big"; is a constant time operation because it evaluates the condition a > b and assigns one of the two string values based on the result. This evaluation and assignment take a constant amount of time.

// Printing: The System.out.println(res); statement is also a constant time operation.

// Since there are no loops or recursive calls in the code, all operations are performed in a fixed amount of time. Therefore, the overall time complexity is O(1), or constant time.