/**
 * Created by katherine_celeste on 8/8/16.
 */

public class Main {
    public static void main (String[] args)
    {

                Kata aKata = new Kata();

                // 1). call stringTimes
                System.out.println(aKata.stringTimes("Hi", 2));

                // 2). call doubleX
                System.out.println(aKata.doubleX("axxbb"));
                System.out.println(aKata.doubleX("axaxax"));
                System.out.println(aKata.doubleX("xxxx"));

                // 3). call last2
                 System.out.println(aKata.last2("hixhixhi")); // output: 2
                 System.out.println(aKata.last2("xaxxaxaxx")); // output: 1
                 System.out.println(aKata.last2("axxxxaxxaxx")); // output: 3

                // 4). call array123
                int [] nums = new int[]{ 1,1,2,4};
                System.out.println(aKata.array123(nums));

                // 5). call altPairs
                System.out.println(aKata.altPairs("CodingHorror"));

                // 6). call noTriples
                int [] aNums = new int[]{1,9};
                System.out.println(aKata.noTriples(aNums));

                // 7). call frontTimes
                System.out.println(aKata.frontTimes("Ab", 3));

                // 8). call stringBits
                System.out.println(aKata.stringBits("Heeololeo"));

                // 9). call arrayCount9
                int [] numsArray = new int[]{1,9,9,3,9};
                System.out.println(aKata.arrayCount9(numsArray));

                // 10). call stringMatch
                System.out.println(aKata.stringMatch("iaxxai","aaxxaaxx"));

                // 11). call stringYak
                System.out.println(aKata.stringYak("yak123ya"));

                // 12). call has271
                int [] aNumsArray = new int[]{2,7,4};
                System.out.println(aKata.has271(aNumsArray));

                // 13). call countXX
                System.out.println(aKata.countXX("xxxx"));

                // 14). stringSplosion
                System.out.println(aKata.stringSplosion("Code"));

                // 15). arrayFront9
                int [] practiceArray = new int[]{1,2,9,3,4};
                System.out.println(aKata.arrayFront9(practiceArray));

                // 16). stringX
                System.out.println(aKata.stringX(""));

                // 17). array667
                int [] anArray = new int[]{6,7,2,6};
                System.out.println(aKata.array667(anArray));
            }
}
