public class Removedupls {

    public static void remove_duplicates(String str, int idx, StringBuilder newstr, boolean map[]) {
        // base case
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        // kaam or work
        char currchar = str.charAt(idx);
        if(map[currchar-'a'] == true){
            // Duplicate
            remove_duplicates(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a'] = true;
            remove_duplicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollage";
        remove_duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
