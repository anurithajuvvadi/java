package miniproject_smartcity;

import java.util.Scanner;

public class smartcity {

	public static void main(String[] args) {
	
while(true) {
		
System.out.println("Please select the appropriate option");

System.out.println("1.Hotels information");

System.out.println("2.Transportation facilties");

System.out.println("3.Airticket booking");

System.out.println("4.Shopping details");

System.out.println("5.City news");

System.out.println("6.Cost estimate");



System.out.println("Enter Your Choice");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
switch(choice) {
case 1:System.out.println("Following are the 5 best top hotels in udaipur");

System.out.println(">Trident Udaipur ");

System.out.println("         OVERVIEW:Built over 64749.7 square metres on the banks of Lake Pichola, Trident, Udaipur is ranked amongst the best hotels near the lake.It is a comfortable 27 kilometres from the airport and is perfectly located to explore the famed sites of the city, such as the City Palace, the Crystal Gallery, the Monsoon Palace or the beautiful Jagmandir.");

System.out.println("		 COST PER DAY:Rs 15000");

System.out.println("		 RATING:4.5/5 by 1000 people");

System.out.println(">The TajLakeView Palace ");

System.out.println("		OVERVIEW:Situated in the middle of the picturesque Lake Pichola, Taj Lake Palace Udaipur offers a peaceful ambience and alluring views.Organises unique experiences like heritage walks and private dinners at Taj Lake Palace Udaipur. ");

System.out.println("		COST PER DAY:Rs 25000");

System.out.println("		RATING:4.5/5 by 1000 people");

System.out.println(">The Leela Palace");

System.out.println("		OVERVIEW:Perched on the banks of the serene Lake Pichola, The Leela Palace Udaipur exemplifies Rajasthani architecture and evokes the grandeur of Udaipur's rich and royal heritage.Its unparalleled opulence is an ode to the Land of the Mewars using traditional artisanal crafts and exquisite embellishments that are inspired by the rich cultural heritage of Rajasthan.Revel in charming views of the heritage city, the tranquil waters of Lake Pichola and City Palace, while you indulge in a lifestyle befitting royalty.");

System.out.println("		COST PER DAY:Rs 10000");

System.out.println("		RATING:4.5/5 by 1000 people");


System.out.println(">Hotel Lakend");

System.out.println("		OVERVIEW:Hotel Lakend (A part of Alka Group of Hotels), located on the Shore of Fatehsagar Lake, Udaipur. A luxury hotel designed and dedicatedfor domestic & International guests, royal weddings & special events like conferences, reunions and more. Hotel Lakend is a 5 Star Deluxe Hotel with the facilities and staff that are inclined and groomed to provide a valuable experience to the guests in all spheres of hospitality, offering excellent services to domestic and International travellers, a family or a group.");

System.out.println("		COST PER DAY:Rs 15000");

System.out.println("		RATING:4.5/5 by 1000 people");

System.out.println(">Lalit Laxmi Vilas Palace");

System.out.println("		 OVERVIEW:Nestled amidst the Aravali Hills with captivating view of FatehSagar Lake, The Lalit Laxmi Vilas Palace Udaipur showcases the rich history and culture of the vibrant state of Rajasthan. The hotel is located just 4 Kms away from the city centre, 27 Kms from Airport and 5 Kms from Railway Station.");

System.out.println("		 COST PER DAY:Rs 20000");

System.out.println("		 RATING:4.5/5 by 1000 people");

break;

case 2:System.out.println("Following are the different transportation services available in udaipur");

System.out.println(">Bus services");
System.out.println("	 COST:10000");

System.out.println(">Flight services");
System.out.println("	 COST:30000");

System.out.println(">Private cabs");
System.out.println("	 COST:20000");
break;

case 3:System.out.println("Following are some of the flight details to and from udaipur");

System.out.println(">udaipur to delhi");

System.out.println("		AIRWAYS:Vistara");

System.out.println("		DURATION:1hr 20min");

System.out.println("		COST:Rs 3500 per adult");

System.out.println(">udaipur to Hyderabad");

System.out.println("		AIRWAYS:Air India");

System.out.println("		DURATION:1hr 50min");

System.out.println("		COST:Rs 5000 per adult");

System.out.println(">udaipur to Mumbai");

System.out.println("		AIRWAYS:Spicejet");

System.out.println("		DURATION:1hr 35min");

System.out.println("		COST:Rs 4000 per adult");

System.out.println(">hyderabad to udaipur");

System.out.println("		AIRWAYS:Air India");

System.out.println("		DURATION:1hr 35min");

System.out.println("		COST:Rs 4000 per adult");

System.out.println("> Banglore to udaipur");

System.out.println("		AIRWAYS:Vistara");

System.out.println("		DURATION:2hr 20min");

System.out.println("		COST:Rs 6000 per adult");
break;

case 4:System.out.println("Best places to shop in udaipur");

System.out.println(">HathiPol Bazar");

System.out.println("		FAMOUS FOR:The Rajasthani miniature paintings, Pichwai and Phad paintings");

System.out.println("		TIMINGS:9.30 am to 5.30 pm");

System.out.println("		CLOSED ON: The market remains closed on Sundays");

System.out.println(">Bada Bazaar");

System.out.println("		FAMOUS FOR:Batik and Bandhani print sarees and textiles");

System.out.println("		TIMINGS:9.30 am to 6 pm");

System.out.println("		CLOSED ON: The market remains closed on Sundays");

System.out.println(">Chetak Circle");

System.out.println("		FAMOUS FOR:dancing puppets, wall decorations, pens, pen stands, traditional lanterns");

System.out.println("		TIMINGS:10 am to 7 pm");

System.out.println("		CLOSED ON: The market remains closed on Sundays");

System.out.println(">Shilpgram");

System.out.println("		FAMOUS FOR: handicrafts and artwork ");

System.out.println("		TIMINGS:11 am to 7 pm");

System.out.println("		CLOSED ON: The market remains closed on Sundays");
break;

case 5:System.out.println("Top News Of Udaipur city");
System.out.println(">Udaipur has imposed a strict regulation and restriction of travel in order to keep it safe and protected from COVID.");

System.out.println(">Udaipur’s Rohitesh Upadhyay Bags 2 World Records (National & World) in Motorsports");

System.out.println(">Udaipur Airport Ranked 2nd Among Non Metro Airports of India");
break;

case 6:System.out.println("cost estimate");
System.out.println("Enter the hotel u want to stay in");
String hotelname=sc.next();

System.out.println("Enter the flight u want to fly in");
String flightname=sc.next();

System.out.println("Enter the means of transportation");
String transport=sc.next();
System.out.println("hotelname: "+hotelname+" "+"flightname: "+flightname+" "+"transport: "+transport);

if(hotelname.equalsIgnoreCase("TridentUdaipur")) {
	if(flightname.equalsIgnoreCase("Vistara")) {
		if(transport.equalsIgnoreCase("Bus")) {
			int amount=28500;
			System.out.println("cost estimate based on selected options is: Rs "+amount);
		}
		else if(transport.equalsIgnoreCase("flight")) {
			int amount=48500;
			System.out.println("cost estimate based on selected options is: Rs "+amount);
			
		}
		else if(transport.equalsIgnoreCase("cab")) {
			int amount=38500;
			System.out.println("cost estimate based on selected options is: Rs "+amount);
	}
	}
		else if(flightname.equalsIgnoreCase("Air India")) {
			if(transport.equalsIgnoreCase("Bus")) {
				int amount=30000;
				System.out.println("cost estimate based on selected options is: Rs "+amount);
			}
			else if(transport.equalsIgnoreCase("flight")) {
				int amount=50000;
				System.out.println("cost estimate based on selected options is: Rs "+amount);
				
			}
			else if(transport.equalsIgnoreCase("cab")) {
				int amount=40000;
				System.out.println("cost estimate based on selected options is: Rs "+amount);
		}
		}
			else if(flightname.equalsIgnoreCase("spice jet")) {
				if(transport.equalsIgnoreCase("Bus")) {
					int amount=29000;
					System.out.println("cost estimate based on selected options is: Rs "+amount);
				}
				else if(transport.equalsIgnoreCase("flight")) {
					int amount=49000;
					System.out.println("cost estimate based on selected options is: Rs "+amount);
					
				}
				else if(transport.equalsIgnoreCase("cab")) {
					int amount=39000;
					System.out.println("cost estimate based on selected options is: Rs "+amount);
			}
			}	
		}
            
 else if(hotelname.equalsIgnoreCase("TajLakeView")) {
		if(flightname.equalsIgnoreCase("Vistara")) {
			if(transport.equalsIgnoreCase("Bus")) {
				int amount=38500;
				System.out.println("cost estimate based on selected options is: Rs "+amount);
			}
			else if(transport.equalsIgnoreCase("flight")) {
				int amount=58500;
				System.out.println("cost estimate based on selected options is: Rs "+amount);
				
			}
			else if(transport.equalsIgnoreCase("cab")) {
				int amount=48500;
				System.out.println("cost estimate based on selected options is: Rs "+amount);
		}
		}
			else if(flightname.equalsIgnoreCase("Air India")) {
				if(transport.equalsIgnoreCase("Bus")) {
					int amount=40000;
					System.out.println("cost estimate based on selected options is: Rs "+amount);
				}
				else if(transport.equalsIgnoreCase("flight")) {
					int amount=60000;
					System.out.println("cost estimate based on selected options is: Rs "+amount);
					
				}
				else if(transport.equalsIgnoreCase("cab") ){
					int amount=50000;
					System.out.println("cost estimate based on selected options is: Rs "+amount);
			}
			}
				else if(flightname.equalsIgnoreCase("spice jet")) {
					if(transport.equalsIgnoreCase("Bus")) {
						int amount=39000;
						System.out.println("cost estimate based on selected options is: Rs "+amount);
					}
					else if(transport.equalsIgnoreCase("flight")) {
						int amount=59000;
						System.out.println("cost estimate based on selected options is: Rs "+amount);
						
					}
					else if(transport.equalsIgnoreCase("cab")) {
						int amount=49000;
						System.out.println("cost estimate based on selected options is: Rs "+amount);
				}
				}
	}
				else if(hotelname.equalsIgnoreCase("Leela Palace") ){
					if(flightname.equalsIgnoreCase("Vistara")) {
						if(transport.equalsIgnoreCase("Bus")) {
							int amount=23500;
							System.out.println("cost estimate based on selected options is: Rs "+amount);
						}
						else if(transport.equalsIgnoreCase("flight")) {
							int amount=43500;
							System.out.println("cost estimate based on selected options is: Rs "+amount);
							
						}
						else if(transport.equalsIgnoreCase("cab")) {
							int amount=33500;
							System.out.println("cost estimate based on selected options is: Rs "+amount);
					}
					}
						else if(flightname.equalsIgnoreCase("Air India")) {
							if(transport.equalsIgnoreCase("Bus")) {
								int amount=25000;
								System.out.println("cost estimate based on selected options is: Rs "+amount);
							}
							else if(transport.equalsIgnoreCase("flight") ){
								int amount=45000;
								System.out.println("cost estimate based on selected options is: Rs "+amount);
								
							}
							else if(transport.equalsIgnoreCase("cab")) {
								int amount=35000;
								System.out.println("cost estimate based on selected options is: Rs "+amount);
						}
						}
							else if(flightname.equalsIgnoreCase("spice jet")) {
								if(transport.equalsIgnoreCase("Bus")) {
									int amount=24000;
									System.out.println("cost estimate based on selected options is: Rs "+amount);
								}
								else if(transport.equalsIgnoreCase("flight")) {
									int amount=44000;
									System.out.println("cost estimate based on selected options is: Rs "+amount);
								
								}
								else if(transport.equalsIgnoreCase("cab")) {
									int amount=34000;
									System.out.println("cost estimate based on selected options is: Rs "+amount);
							}	
				}
				}
				else if(hotelname.equalsIgnoreCase("Lakend")) {
	if(flightname.equalsIgnoreCase("Vistara")) {
		if(transport.equalsIgnoreCase("Bus")) {
			int amount=28500;
			System.out.println("cost estimate based on selected options is: Rs "+amount);
		}
		else if(transport.equalsIgnoreCase("flight")) {
			int amount=48500;
			System.out.println("cost estimate based on selected options is: Rs "+amount);
			
		}
		else if(transport.equalsIgnoreCase("cab")) {
			int amount=38500;
			System.out.println("cost estimate based on selected options is: Rs "+amount);
	}
	}
		else if(flightname.equalsIgnoreCase("Air India")) {
			if(transport.equalsIgnoreCase("Bus")) {
				int amount=30000;
				System.out.println("cost estimate based on selected options is: Rs "+amount);
			}
			else if(transport.equalsIgnoreCase("flight")) {
				int amount=50000;
				System.out.println("cost estimate based on selected options is: Rs "+amount);
				
			}
			else if(transport.equalsIgnoreCase("cab")) {
				int amount=40000;
				System.out.println("cost estimate based on selected options is: Rs "+amount);
		}
		}
			else if(flightname.equalsIgnoreCase("spice jet")) {
				if(transport.equalsIgnoreCase("Bus") ){
					int amount=29000;
					System.out.println("cost estimate based on selected options is: Rs "+amount);
				}
				else if(transport.equalsIgnoreCase("flight")) {
					int amount=49000;
					System.out.println("cost estimate based on selected options is: Rs "+amount);
					
				}
				else if(transport.equalsIgnoreCase("cab")) {
					int amount=39000;
					System.out.println("cost estimate based on selected options is: Rs "+amount);
			}
			}
			
			
		}
				else if(hotelname.equalsIgnoreCase("Lalit Laxmi Vilas")) {
					if(flightname.equalsIgnoreCase("Vistara")) {
						if(transport.equalsIgnoreCase("Bus")) {
							int amount=33500;
							System.out.println("cost estimate based on selected options is: Rs "+amount);
						}
						else if(transport.equalsIgnoreCase("flight")) {
							int amount=53500;
							System.out.println("cost estimate based on selected options is: Rs "+amount);
							
						}
						else if(transport.equalsIgnoreCase("cab")) {
							int amount=43500;
							System.out.println("cost estimate based on selected options is: Rs "+amount);
					}
					}
						else if(flightname.equalsIgnoreCase("Air India")) {
							if(transport.equalsIgnoreCase("Bus")) {
								int amount=35000;
								System.out.println("cost estimate based on selected options is: Rs "+amount);
							}
							else if(transport.equalsIgnoreCase("flight")) {
								int amount=55000;
								System.out.println("cost estimate based on selected options is: Rs "+amount);
								
							}
							else if(transport.equalsIgnoreCase("cab")) {
								int amount=45000;
								System.out.println("cost estimate based on selected options is: Rs "+amount);
						}
						}
							else if(flightname.equalsIgnoreCase("spice jet")) {
								if(transport.equalsIgnoreCase("Bus")) {
									int amount=34000;
									System.out.println("cost estimate based on selected options is: Rs "+amount);
								}
								else if(transport.equalsIgnoreCase("flight")) {
									int amount=54000;
									System.out.println("cost estimate based on selected options is: Rs "+amount);
									
								}
								else if(transport.equalsIgnoreCase("cab")) {
									int amount=44000;
									System.out.println("cost estimate based on selected options is: Rs "+amount);
							}
							}
							
							
						}
				else {
					System.out.println("please select hotel from the above list only");
				}
		
	 break;

case 7|8|9|10:break;
	 
default:
    System.out.println("Invalid choice");
}




System.out.println("Enjoy visiting udaipur");

	}
}
	
}


