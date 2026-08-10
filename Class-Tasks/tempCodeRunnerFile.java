public class avg {

    public static int avgmarks(int marks[]) {
        int mark = 0;

        for(int i = 0; i < marks.length; i++) {
            mark += marks[i];
        }

        return mark / marks.length;
    }

    public static void main(String[] args) {
        int marks[] = {23, 45, 65, 70};

        System.out.println(avgmarks(marks));
    }
}