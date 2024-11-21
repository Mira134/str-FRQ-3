public String replaceSubstring(String str, String oldSub,String newSub){
    String replaced = "";
    int index = str.indexOf(oldSub);
    while(index >= 0){
        replaced += str.substring(0, index) + newSub;
        index = str.indexOf(oldSub, index + newSub.length());
    }
    replaced += str.substring(index);
    return replaced;
}