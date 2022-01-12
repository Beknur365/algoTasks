public class ExcelSheet {
    public int titleToNumber(String columnTitle) {
        int count = 0, countNext = 1;
        for(int i = 0; i < columnTitle.length(); i++){
            count = count*26 + (columnTitle.charAt(i) - 64);
        }
        return count;
    }

    public static void main(String[] args) {
        ExcelSheet ex = new ExcelSheet();
        ex.titleToNumber("AB");
    }
}
