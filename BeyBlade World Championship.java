BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long testCases = Long.parseLong(br.readLine().trim());
        while(testCases-->0){
            long numberOfMembers = Long.parseLong(br.readLine().trim());
            long[] teamG = Arrays.asList(br.readLine().trim().split(" ")).stream().mapToLong(Long::parseLong).toArray();
            long[] otherTeam = Arrays.asList(br.readLine().trim().split(" ")).stream().mapToLong(Long::parseLong).toArray();
            Arrays.sort(otherTeam);
            Arrays.sort(teamG);
            int count = 0;
            int countIndex = teamG.length-1;
            for(int j =teamG.length-1;j>=0;j--){
                for(int i=countIndex;i>=0;i--){
                    if(teamG[j]>otherTeam[i]){
                        count+=1;
                        countIndex=i-1;
                        break;
                    }
                }
            }
            System.out.println(count);
