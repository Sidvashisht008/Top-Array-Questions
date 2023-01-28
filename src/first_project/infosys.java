package first_project;

import java.util.*;

public class infosys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> Queries = new ArrayList<>();
		List<Integer> query= new ArrayList<>();
		query.add(2);
		query.add(3);
		Queries.add(query);
		query= new ArrayList<>();
		query.add(1);
		query.add(3);
		Queries.add(query);
		System.out.println(solve(3,2, Queries));
	}
	public static int solve(int N,int Q, List<List<Integer>> Queries) {
		int idx = 0;
		int cnt = 0;
		while(Q-->0) {
				List<Integer> query = Queries.get(idx);
				int L = query.get(0);
				int R = query.get(1);
				for(int i = 1;i<=N;i++) {
					int count = 0;
					for(int j = 1;j<=Math.sqrt(i);j++) {
						if(i%j==0) {
							if(i/j==j) {
								count++;
							}else {
								count+=2;
							}
						}
					}
					if(count>=L && count<=R) {
						cnt++;
					}
				}
				idx++;
			}
		return cnt;
		}
	}
