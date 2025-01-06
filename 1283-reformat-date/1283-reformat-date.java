class Solution {
    public String reformatDate(String date) {

        String year= date.substring(date.length()-4);
        String month= date.substring(date.indexOf(" ") + 1, date.indexOf(" ") + 4);
        String day= date.substring(0, date.indexOf(" ")).replaceAll("\\D", "");
        
        String monthSet[]= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        String mon="";
        for(int i=0; i<monthSet.length; i++){
            if(month.compareTo(monthSet[i])==0){

                if((i+1)<10){
                    mon= "0"+(i+1);
                }else{
                    mon= Integer.toString(i+1);
                }
                break;
                }
            }
            if (day.length() == 1) {
            day = "0" + day;
        }
            
        return year+"-"+mon+"-"+day;
    }
}