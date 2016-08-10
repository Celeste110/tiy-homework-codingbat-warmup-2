    /**
     * Created by katherine_celeste on 8/8/16.
     */
    public class Kata {

        // Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        //CHECKED
        public String stringTimes(String str, int n) {
            String contents = "";

            while (n > 0){

                contents+= str;
                n--;
            }
            return contents;
        }


        // Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        //DOES NOT PASS ALL TEST CASES - modify later
        boolean doubleX(String str) {
            boolean isTrue = false;

            if (str.charAt(str.indexOf('x')) == str.charAt(str.indexOf('x') + 1))
                isTrue = true;

            return isTrue;

        }


        /* Given a string, return the count of the number of times that a substring length 2
           appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1
           (we won't count the end substring). */
        //Does NOT pass all tests - need to revise later
        public int last2(String str) {
            int count = 0;
            String last2Chars = str.substring(str.length() - 2, str.length());
            String newString = str.substring(0, str.length() - 2);

                while ((newString.indexOf(last2Chars) != -1))
                {
                    newString = newString.substring(newString.indexOf(last2Chars)+2, newString.length());
                    count++;
                }
            return count;
        }

        // Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
        //CHECKED
        public boolean array123(int[] nums) {

            boolean numSequenceExists = false;
            for (int i = 0; i + 2 < nums.length; i++)
            {
                if ((nums[i] == 1) && (nums[i+1] == 2) && (nums[i+2] == 3))
                {
                    numSequenceExists = true;
                    break;
                }
            }
            return numSequenceExists;
        }

        // Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
        //CHECKED
        public String altPairs(String str) {
            String aString = "";
            if(str.length() > 0) aString += str.charAt(0); //I know this is repetitive code :)
            if(str.length() > 1) aString += str.charAt(1);
            if(str.length() > 4) aString += str.charAt(4);
            if(str.length() > 5) aString += str.charAt(5);
            if(str.length() > 8) aString += str.charAt(8);
            if(str.length() > 9) aString += str.charAt(9);
            return  aString;
        }

        // Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
        // Return true if the array does not contain any triples.
        //CHECKED
        public boolean noTriples(int[] nums) {
            boolean triples = true;
            for (int i = 0; i +2 < nums.length; i++)
            {
                if ((nums[i] == nums[i+1]) && (nums[i+1] == nums[i+2]))
                {
                    triples = false;
                    break;
                }
            }
            return triples;
        }

        // Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
        // or whatever is there if the string is less than length 3. Return n copies of the front;
        //CHECKED
        public String frontTimes(String str, int n) {
            String aString = "";
            if (str.length() >=3)
            {
                while (n >0)
                {
                    aString += str.substring(0, 3);
                    n--;
                }
            }
            else
                {
                    while (n >0)
                    {
                        aString += str.substring(0, str.length());
                        n--;
                    }
                }

            return aString;
        }
        //Given a string, return a new string made of every other char starting
        // with the first, so "Hello" yields "Hlo".
        //CHECKED
        public String stringBits(String str) {
            String a = "";
            for(int i = 0; i < str.length(); i=i+2)
            {
               a += "" + str.charAt(i);
            }

            return a;
        }

        //Given an array of ints, return the number of 9's in the array.
        //CHECKED
        public int arrayCount9(int[] nums) {
            int counter = 0;
            for(int i =0; i<nums.length; i++)
            {
                if(nums[i] == 9)
                {
                    counter++;
                }
            }
            return counter;
        }

        // Given 2 strings, a and b, return the number of the positions where they
        // contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
        // since the "xx", "aa", and "az" substrings appear in the same place in both strings.
        //CHECKED
        public int stringMatch(String a, String b) {
            // Steps:
            // get substring 2 from first String (i), (i+1)
            // loop through second string and see if the first substring matches (i), (i+1)
            // substring must be in the same position in both strings (i==counter)
            // increment counter by 1

            int tally = 0;
            int z = 1;
            for (int i = 0; i+1 < a.length(); i++)
            {
                String stringA = a.substring(i, i+2);

                for (int counter = 0; counter+1 < b.length(); counter++)
                {
                    String stringB = b.substring(counter, counter+2);

                    if (stringA.equals(stringB) && (i==counter))
                    {
                        tally++;
                    }
                }
            }
            return tally;
        }

        // Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak"
        // are removed, but the "a" can be any char. The "yak" strings will not overlap.
        //CHECKED
        public String stringYak(String str) {
            String secondPart = "";
            String firstPart = "";
            for (int i = 0; i+2 < str.length(); i++)
            {
                if(str.substring(i, i+3).equals("yak"))
                {
                        firstPart = str.substring(0, i);
                        secondPart = str.substring(i + 3, str.length());
                        str = firstPart + secondPart;
                }
            }
            return str;
        }

        // Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by
        // the value plus 5, followed by the value minus 1. ***Additionally the 271 counts even if the "1"
        // differs by 2 or less from the correct value.
        //CHECKED
        public boolean has271(int[] nums) {
            //Steps:
            // Pattern: a , a+5, a-1
            boolean isTrue = false;
            for(int a =0; a+2 < nums.length; a++)
            {
                int position0 = nums[a];
                int position1 = nums[a+1];
                int position2 = nums[a+2];
                if ((position1==(position0+5))&&((position2<=(position0+1))&&((position2)>=(position0-3)))) {
                    isTrue = true;
                    break;
                }

            }

            return isTrue;
        }

        //Count the number of "xx" in the given string. We'll say that overlapping is allowed,
        // so "xxx" contains 2 "xx".
        //CHECKED
        int countXX(String str) {
            //Steps:
            //a, a+1
            int count = 0;
            for (int i = 0; i + 1 < str.length(); i++)
            {
                char first = str.charAt(i);
                char second = str.charAt(i+1);

                if ((first == second) && second == 'x')
                {
                    count++;
                }
            }
            return count;
        }


        // Given a non-empty string like "Code" return a string like "CCoCodCode".
        //CHECKED
        public String stringSplosion(String str) {

            String newString = "";
            for (int i = 0; i < str.length(); i++)
            {

                    newString += str.substring(0, i+1);
            }

            return newString;
        }

        //Given an array of ints, return true if one of the first 4 elements in the
        // array is a 9. The array length may be less than 4.
        //CHECKED
        public boolean arrayFront9(int[] nums) {
            //Steps: loop through array <=4 times
            boolean value9 = false;
            for (int i = 0; i<4 && i<nums.length; i++)
            {
                if (nums[i]==9)
                {
                    value9 = true;
                }

            }
            return value9;
        }

        //Given a string, return a version where all the "x" have been removed.
        // Except an "x" at the very start or end should not be removed.
        //CHECKED
        public String stringX(String str) {
            String temp = "";

            if (str.length()>0) {

                if (str.charAt(0) == 'x') {
                    temp += 'x';
                }

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != 'x') {
                        temp += str.charAt(i);
                    }

                }

                if ((str.charAt(str.length() - 1) == 'x') && (str.length() > 1)) {
                    temp += 'x';
                }
            }

            return temp;
        }

        // Given an array of ints, return the number of times that two 6's are next to each
        // other in the array. Also count instances where the second "6" is actually a 7.
        //CHECKED
        public int array667(int[] nums) {
            // a, a+1 = 6 || 7

            int counter =0;
            for (int i = 0; i+1 < nums.length; i++)
            {

                if ((nums[i]==6))
                {
                    if (nums[i]==nums[i+1]) counter++;
                    else if ((nums[i+1]==7)) counter++;
                }
            }

            return counter;
        }
    }


