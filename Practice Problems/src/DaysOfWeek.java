import java.util.HashMap;

public class DaysOfWeek {

    public static void main(String[] args) { 
        String date = "28 Feb 0003";
        String[] date_conversion_helper = date.split("\\s");
        
        int date_1 = Integer.parseInt(date_conversion_helper[0]);
        String date_2_str = "";
        int date_2 = 0;
        
        date_2_str = date.substring(date.length()-2);
        date_2 = Integer.parseInt(date_2_str);
        
        int date_3 = date_2 / 4;
        
        String str_date = date_conversion_helper[2];
        
        if(str_date.length() != 4) {
        	System.out.println("Year not entered in proper format");
        	return;
        }
        
        int year = Integer.parseInt(str_date);
        
        String month = date_conversion_helper[1];
        
        if(month.length() != 3) {
        	System.out.println("Month not entered in proper format");
        	return;
        }
        
        
        if((month.equals("Jan") && date_1 > 31) || (month.equals("Feb") && year % 4 != 0 && date_1 > 28) || (month.equals("Feb") && year % 4 == 0 && date_1 > 29)
        		|| (month.equals("Mar") && date_1 > 31) || (month.equals("Apr") && date_1 > 30) || (month.equals("May") && date_1 > 31) 
        		|| (month.equals("Jun") && date_1 > 30) || (month.equals("Jul") && date_1 > 31) || (month.equals("Aug") && date_1 > 31) 
        		|| (month.equals("Sep") && date_1 > 30) || (month.equals("Oct") && date_1 > 31) || (month.equals("Nov") && date_1 > 30)
        		|| (month.equals("Dec") && date_1 > 31)) {
        	System.out.println("Date exceeding the limit");
        	return;
        }
        
        int ans = date_1 + findMonthCode(date.substring(3,6)) + findCenturyCode(year)  + date_2 + date_3;
        
        int day_code = ans % 7;
        
        System.out.println("The day at "+date+" is "+ returnDayFromCode(day_code));
        		
    }
    
    public static String returnDayFromCode(int code) {
    	HashMap<Integer, String> hm = new HashMap<>();
    	
    	hm.put(1, "Sunday");
    	hm.put(2, "Monday");
    	hm.put(3, "Tuesday");
    	hm.put(4, "Wednesday");
    	hm.put(5, "Thrusday");
    	hm.put(6, "Friday");
    	hm.put(0, "Saturday");
    	
    	return hm.get(code);
    	
    }
    


    public static int findCenturyCode(int year) {
        int ans[] = {6, 4, 2, 0};
        int index = 0;
        int i = -1;
        
        while (i < year) {
            i = i + 100;
            if (year <= i) {
                return ans[index];
            }
            index++;
            if (index == 4) {
                index = 0;
            }
        }
        return -1;
    }
    
    public static int findMonthCode(String str) {
    	HashMap<String, Integer> hm = new HashMap<>();
    	
    	hm.put("Jan", 1);
    	hm.put("Feb", 4);
    	hm.put("Mar", 4);
    	hm.put("Apr", 0);
    	hm.put("May", 2);
    	hm.put("Jun", 5);
    	hm.put("Jul", 0);
    	hm.put("Aug", 3);
    	hm.put("Sep", 6);
    	hm.put("Oct", 1);
    	hm.put("Nov", 4);
    	hm.put("Dec", 6);
    	
    	return hm.get(str);
    	
    }
    
    
}
