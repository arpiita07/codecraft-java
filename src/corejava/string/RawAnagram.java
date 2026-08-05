package corejava.string;

public class RawAnagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listenk";
        System.out.println(isAnagram(s1,s2));


    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    arr2[j] = '#';      // Mark as used
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }


}
