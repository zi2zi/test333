class Solution {
    public long solution(int[] classes, int k) {
        int attempts = 0;
        try {
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
   
        } catch (Exception e) {
            e.printStacktrace();
        }
        
        String str=readString(); // read lengthy string any source db,textbox/jsp etc..
        // This will place the string in memory pool from which you can't remove
        str.intern();
        
         while(attempts < 5) {
            try {
                DescribeTableRequest request = new DescribeTableRequest(tableName);
                DescribeTableResult result = client.describeTable(request);
                String status = res.getTable().getTableStatus();
                if(status.equals("ACTIVE")) {
                break;
                }
                Thread.sleep(5000);
                attempts++;
            }
            catch(ResourceNotFoundException e) {
                
                
                
            }   
         }
    }
}
