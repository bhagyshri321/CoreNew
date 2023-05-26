
		
		package in.co.collection;

	  import java.util.ArrayList;
      import java.util.Collections;
      import java.util.stream.Collectors;

		

	public 	 class stream_api {

			public String contact;
			public String name;

			public stream_api(String n, String c) {
				name = n;
				contact = c;
			}

			public static void main(String[] args) {

				ArrayList<stream_api > list = new ArrayList<>();
				list.add(new stream_api ("kapil", "9874563210"));
				list.add(new stream_api ("Yash", "9597499655"));
				list.add(new stream_api ("Dheeraj", "987"));
				list.add(new stream_api ("Vineet", "9811144785"));
				list.add(new stream_api ("Vishu", "93214569"));
				list.add(new stream_api ("Rohan", "7895541203"));
				list.add(new stream_api ("Mayank", "9846532710"));

				list.stream().map(e -> e.contact).filter(e -> e.length() == 10).distinct()
						.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
							Collections.shuffle(e);
							return e.stream();
						})).limit(3).forEach(e -> System.out.println(e));
			}

		}

	

