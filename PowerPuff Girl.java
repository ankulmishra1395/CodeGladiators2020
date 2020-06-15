BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long numberOfIng = Long.parseLong(br.readLine().trim());
        if(1<= numberOfIng && numberOfIng <=10000000) {
        	long[] reqQuan = Arrays.asList(br.readLine().trim().split(" ")).stream().mapToLong(Long::parseLong).toArray();
            long[] availQuan = Arrays.asList(br.readLine().trim().split(" ")).stream().mapToLong(Long::parseLong).toArray();
            long min = 0;
            boolean first = true;
            for(int i=1;i<numberOfIng;i++){
               if(reqQuan[i]!=0) {
            	   long temp = availQuan[i]/reqQuan[i];
	                   if(first) {
	               		min = temp;
	               		first = false;
	               	}
	                   if(temp<min){
	                       min = temp;
	                   }
               }
            }
            System.out.println(min);
