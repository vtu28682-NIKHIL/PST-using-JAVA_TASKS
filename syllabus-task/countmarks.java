// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class countmarks {
   public countmarks() {
   }

   public static int countmarksofstudent(int[] var0) {
      int var1 = 0;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == 75) {
            ++var1;
         }
      }

      return var1;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{45, 56, 75, 34, 75, 100, 75};
      System.out.println("the count of student marks is : " + countmarksofstudent(var1));
   }
}
