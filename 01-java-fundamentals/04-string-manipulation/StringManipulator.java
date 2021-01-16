public class StringManipulator {
    public String trimAndConcat(String string1 , String string2) {
        String trimCat = string1.trim() + string2.trim();
        return trimCat;
    }
    public Integer getIndexOrNull(String string1, char char1) {
        Integer index = string1.indexOf(char1);
        return index;
    }
    public Integer getIndexOrNull(String string1, String string2) {
        Integer index = string1.indexOf(string2);
        return index;
    }
    public String concatSubstring(String string1, int int1, int int2, String string2) {
        String newString = string1.substring(int1, int2) + string2;
        return newString;
    }
}