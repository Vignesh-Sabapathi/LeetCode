class MyCalendar {
    public List<int[]> calendar;
    public MyCalendar() {
         calendar = new ArrayList();
    }
    
    public boolean book(int start, int end) {
         for (int[] arr:calendar) {
             
             if(start<arr[1] && end>arr[1]){
                 return false;
             }
             if(start<arr[0] && end>arr[0]){
                 return false;
             }
             if(start>=arr[0] && end<=arr[1])return false;
         }
        calendar.add(new int[]{start,end});
        return true;
            
    }
}
