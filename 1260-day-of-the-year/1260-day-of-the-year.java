class Solution {
    public int dayOfYear(String date) {
        
        int year= Integer.parseInt(date.substring(0,4));
        int month= Integer.parseInt(date.substring(5,7));
        int day= Integer.parseInt(date.substring(8,10));

        int dayInMonth[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(isLeapYear(year)){
            dayInMonth[1]= 29;
        }

         if (month < 1 || month > 12 || day < 1 || day > dayInMonth[month - 1]) {
            return 0;
        }

        for(int i=0; i<month-1; i++){
            day= day+dayInMonth[i];
        }

        return day;

    }

    private boolean isLeapYear(int year){
            return (year %4 ==0 && year %100 !=0) || (year % 400 ==0);
        }
}