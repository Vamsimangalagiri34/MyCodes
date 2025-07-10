class RemoveWhiteSpace{
    public static void main(String ae[]){
        String str="hello india im frmm guess";
        String sa[]=str.split("\\s+");//it will remove what spaces
        System.out.println(java.util.Arrays.toString(sa));
        String input = "Hello, World! 123.";
        String result = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);  // Output: HelloWorld123
    }
}
//The replaceAll method replaces all characters that are not letters (a-zA-Z) or digits (0-9) with an empty string ("").
//if we remove ^ in replaceAll() it will leave the characters and print special symbols