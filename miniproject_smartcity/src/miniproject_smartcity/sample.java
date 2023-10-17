package miniproject_smartcity;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("cost estimate");
		System.out.println("Enter the hotel u want to stay in");
		String hotelname=sc.nextLine();

		System.out.println("Enter the flight u want to fly in");
		String flightname=sc.nextLine();

		System.out.println("Enter the means of transportation");
		String transport=sc.nextLine();
		System.out.println("hotelname: "+hotelname+" "+"flightname: "+flightname+" "+"transport: "+transport);

		if(hotelname=="TridentUdaipur") {
			System.out.println("amount");
//			if(flightname=="Vistara") {
//				if(transport=="Bus") {
//					int amount=28500;
//					System.out.println(amount);
//				}
//				else if(transport=="flight") {
//					int amount=48500;
//					System.out.println(amount);
//					
//				}
//				else if(transport=="cab") {
//					int amount=38500;
//					System.out.println(amount);
//			}
//			}
//				else if(flightname=="Air India") {
//					if(transport=="Bus") {
//						int amount=30000;
//						System.out.println(amount);
//					}
//					else if(transport=="flight") {
//						int amount=50000;
//						System.out.println(amount);
//						
//					}
//					else if(transport=="cab") {
//						int amount=40000;
//						System.out.println(amount);
//				}
//				}
//					else if(flightname=="spice jet") {
//						if(transport=="Bus") {
//							int amount=29000;
//							System.out.println(amount);
//						}
//						else if(transport=="flight") {
//							int amount=49000;
//							System.out.println(amount);
//							
//						}
//						else if(transport=="cab") {
//							int amount=39000;
//							System.out.println(amount);
//					}
//					}	
//				}
//		            
//		       else if(hotelname=="TajLakeView") {
//				if(flightname=="Vistara") {
//					if(transport=="Bus") {
//						int amount=38500;
//						System.out.println(amount);
//					}
//					else if(transport=="flight") {
//						int amount=58500;
//						System.out.println(amount);
//						
//					}
//					else if(transport=="cab") {
//						int amount=48500;
//						System.out.println(amount);
//				}
//				}
//					else if(flightname=="Air India") {
//						if(transport=="Bus") {
//							int amount=40000;
//							System.out.println(amount);
//						}
//						else if(transport=="flight") {
//							int amount=60000;
//							System.out.println(amount);
//							
//						}
//						else if(transport=="cab") {
//							int amount=50000;
//							System.out.println(amount);
//					}
//					}
//						else if(flightname=="spice jet") {
//							if(transport=="Bus") {
//								int amount=39000;
//								System.out.println(amount);
//							}
//							else if(transport=="flight") {
//								int amount=59000;
//								System.out.println(amount);
//								
//							}
//							else if(transport=="cab") {
//								int amount=49000;
//								System.out.println(amount);
//						}
//						}
//			}
//						else if(hotelname=="Leela Palace") {
//							if(flightname=="Vistara") {
//								if(transport=="Bus") {
//									int amount=23500;
//									System.out.println(amount);
//								}
//								else if(transport=="flight") {
//									int amount=43500;
//									System.out.println(amount);
//									
//								}
//								else if(transport=="cab") {
//									int amount=33500;
//									System.out.println(amount);
//							}
//							}
//								else if(flightname=="Air India") {
//									if(transport=="Bus") {
//										int amount=25000;
//										System.out.println(amount);
//									}
//									else if(transport=="flight") {
//										int amount=45000;
//										System.out.println(amount);
//										
//									}
//									else if(transport=="cab") {
//										int amount=35000;
//										System.out.println(amount);
//								}
//								}
//									else if(flightname=="spice jet") {
//										if(transport=="Bus") {
//											int amount=24000;
//											System.out.println(amount);
//										}
//										else if(transport=="flight") {
//											int amount=44000;
//											System.out.println(amount);
//											
//										}
//										else if(transport=="cab") {
//											int amount=34000;
//											System.out.println(amount);
//									}	
//						}
//						}
//						else if(hotelname=="Lakend") {
//			if(flightname=="Vistara") {
//				if(transport=="Bus") {
//					int amount=28500;
//					System.out.println(amount);
//				}
//				else if(transport=="flight") {
//					int amount=48500;
//					System.out.println(amount);
//					
//				}
//				else if(transport=="cab") {
//					int amount=38500;
//					System.out.println(amount);
//			}
//			}
//				else if(flightname=="Air India") {
//					if(transport=="Bus") {
//						int amount=30000;
//						System.out.println(amount);
//					}
//					else if(transport=="flight") {
//						int amount=50000;
//						System.out.println(amount);
//						
//					}
//					else if(transport=="cab") {
//						int amount=40000;
//						System.out.println(amount);
//				}
//				}
//					else if(flightname=="spice jet") {
//						if(transport=="Bus") {
//							int amount=29000;
//							System.out.println(amount);
//						}
//						else if(transport=="flight") {
//							int amount=49000;
//							System.out.println(amount);
//							
//						}
//						else if(transport=="cab") {
//							int amount=39000;
//							System.out.println(amount);
//					}
//					}
//					
//					
//				}
//						else if(hotelname=="Lalit Laxmi Vilas") {
//							if(flightname=="Vistara") {
//								if(transport=="Bus") {
//									int amount=33500;
//									System.out.println(amount);
//								}
//								else if(transport=="flight") {
//									int amount=53500;
//									System.out.println(amount);
//									
//								}
//								else if(transport=="cab") {
//									int amount=43500;
//									System.out.println(amount);
//							}
//							}
//								else if(flightname=="Air India") {
//									if(transport=="Bus") {
//										int amount=35000;
//										System.out.println(amount);
//									}
//									else if(transport=="flight") {
//										int amount=55000;
//										System.out.println(amount);
//										
//									}
//									else if(transport=="cab") {
//										int amount=45000;
//										System.out.println(amount);
//								}
//								}
//									else if(flightname=="spice jet") {
//										if(transport=="Bus") {
//											int amount=34000;
//											System.out.println(amount);
//										}
//										else if(transport=="flight") {
//											int amount=54000;
//											System.out.println(amount);
//											
//										}
//										else if(transport=="cab") {
//											int amount=44000;
//											System.out.println(amount);
//									}
//									}
//									
									
								}
						else {
							System.out.println("please select hotel from the above list only");
						}
				
	}

}
