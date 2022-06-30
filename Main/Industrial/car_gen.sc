
car_generators:

// *************************************INDUSTRIAL CAR GENERATORS***************************
VAR_INT gen_car1  gen_car2  gen_car3  gen_car4  gen_car5  gen_car6  gen_car8  gen_car9  gen_car10
VAR_INT gen_car11 gen_car12 gen_car13 gen_car14 gen_car15 gen_car16 gen_car17 gen_car18 gen_car19 gen_car20
VAR_INT gen_car21 gen_car22 gen_car23 gen_car24 gen_car25 gen_car26 gen_car28 gen_car29 gen_car30
VAR_INT gen_car31 gen_car32 gen_car33 gen_car34 gen_car35 gen_car36 gen_car37 gen_car38 gen_car39 gen_car40
VAR_INT gen_car41 gen_car42 gen_car43 gen_car44 gen_car45 gen_car46 gen_car47 gen_car48 gen_car49 gen_car50
VAR_INT gen_car51 gen_car52 gen_car53 gen_car54 gen_car55 gen_car56 gen_car57 gen_car58 gen_car59 gen_car60
VAR_INT gen_car61 gen_car62 gen_car63 gen_car64
VAR_INT joeys_buggy, swank_taxi //SPECIALS

//CREATE_CAR_GENERATOR Remap1 Remap2 ParkedFlag ChanceOfCarAlarm ChanceOfLocked MinDelay MaxDelay CarGenID

//PORTLAND VIEW
CREATE_CAR_GENERATOR 1140.7 -630.2 -100.0 0.0 CAR_AMBULANCE -1 -1 0 0 30 0 10000 gen_car1 //At hospital
//SWITCH_CAR_GENERATOR gen_car1 101

CREATE_CAR_GENERATOR 1139.0 -646.0 -100.0 90.0 CAR_POLICE -1 -1 0 0 60 0 10000 gen_car2 //At police station
//SWITCH_CAR_GENERATOR gen_car2 101

CREATE_CAR_GENERATOR 1139.7 -684.7 -100.0 270.0 CAR_POLICE -1 -1 0 0 70 0 10000 gen_car3 //At police station
//SWITCH_CAR_GENERATOR gen_car3 101 
	 
CREATE_CAR_GENERATOR 1284.3 -620.5 11.7 0.0 CAR_IDAHO -1 -1 0 40 0 0 10000 gen_car4 //Supa save car park
//SWITCH_CAR_GENERATOR gen_car4 101

CREATE_CAR_GENERATOR 1299.0 -641.8 11.7 0.0 CAR_PATRIOT -1 -1 0 40 0 0 10000 gen_car5 //Supa save car park
//SWITCH_CAR_GENERATOR gen_car5 101 

CREATE_CAR_GENERATOR 1265.9 -620.8 11.7 180.0 CAR_BOBCAT -1 -1 0 40 0 0 10000 gen_car6 //Supa save car park
//SWITCH_CAR_GENERATOR gen_car6 101

CREATE_CAR_GENERATOR 1378.4 -607.2 -100.0 180.0 CAR_PONY -1 -1 0 0 0 0 10000 gen_car6 //Behind Supa save car park
//SWITCH_CAR_GENERATOR gen_car6 101

//SAINT MARKS
CREATE_CAR_GENERATOR 1208.67 -258.26 24.5 270.0	CAR_MOONBEAM -1 -1 0 90 0 0 10000 gen_car9 //Little Italy garages up from Tonis
//SWITCH_CAR_GENERATOR gen_car9 101

CREATE_CAR_GENERATOR 1347.04 -448.44 49.5 0.0 CAR_BOBCAT -1 -1 0 60 0 0 10000 gen_car10	//Bistro car park
//SWITCH_CAR_GENERATOR gen_car10 101

CREATE_CAR_GENERATOR 1336.0 -452.19 49.3 270.0 CAR_SENTINEL -1 -1 0 90 0 0 10000 gen_car11 //Bistro car park
//SWITCH_CAR_GENERATOR gen_car11 101

CREATE_CAR_GENERATOR 1223.13 -325.3 25.6 180.0 CAR_KURUMA  -1 -1 0 10 0 0 10000 gen_car12 //Tonis car park
//SWITCH_CAR_GENERATOR gen_car12 101

CREATE_CAR_GENERATOR 1285.4  -306.18 39.4 270.0	CAR_MAFIA -1 -1 0 90 0 0 10000 gen_car13	//Behind tonis retaurant
//SWITCH_CAR_GENERATOR gen_car13 101

//CREATE_CAR_GENERATOR 1285.38 -318.56 39.4 90.0 CAR_IDAHO -1 -1 0 40 0 0 10000 gen_car14 //Behind tonis retaurant
//SWITCH_CAR_GENERATOR gen_car14 101

CREATE_CAR_GENERATOR 1142.14 -95.59 7.0 180.0 CAR_BOBCAT -1 -1 0 50 0 0 10000 gen_car15	 //Petrol station car park
//SWITCH_CAR_GENERATOR gen_car15 101

CREATE_CAR_GENERATOR 1147.35 -95.49 7.0 0.0 CAR_ESPERANTO -1 -1 0 50 0 0 10000 gen_car16 //Petrol station car park
//SWITCH_CAR_GENERATOR gen_car16 101

CREATE_CAR_GENERATOR 1233.1 -127.2 15.0 38.0 CAR_BANSHEE -1 -1 0 0 0 0 10000 gen_car17 //Swank car in showroom
//SWITCH_CAR_GENERATOR gen_car17 101

CREATE_CAR_GENERATOR 1338.13 -257.11 49.3 270.0	CAR_TAXI -1 -1 0 0 0 0 10000 gen_car18	//Park north east little italy
//SWITCH_CAR_GENERATOR gen_car18 101

CREATE_CAR_GENERATOR 1407.6 -176.1 -100.0 140.0	CAR_MAFIA -1 -1 0 0 0 0 10000 gen_car57	//Park north east little italy
//SWITCH_CAR_GENERATOR gen_car57 101

CREATE_CAR_GENERATOR 1405.0 -163.4 -100.0 280.0	CAR_MAFIA -1 -1 0 0 0 0 10000 gen_car58	//Park north east little italy
//SWITCH_CAR_GENERATOR gen_car58 101

//HARWOOD
CREATE_CAR_GENERATOR 1217.0 -70.0 -100.0 0.0 CAR_BOBCAT -1 -1 0 60 0 0 10000 gen_car19 //Used car lot
//SWITCH_CAR_GENERATOR gen_car19 101

CREATE_CAR_GENERATOR 1234.0 -97.0 -100.0 0.0 CAR_PERENNIAL -1 -1 0 60 0 0 10000 gen_car20 //Used car lot
//SWITCH_CAR_GENERATOR gen_car20 101

CREATE_CAR_GENERATOR 1107.5 -58.0 -100.0 270.0 CAR_FIRETRUCK -1 -1 0 0 0 0 10000 gen_car21 //AT fire station
//SWITCH_CAR_GENERATOR gen_car21 101

CREATE_CAR_GENERATOR 1226.7 -68.0 -100.0 0.0 CAR_KURUMA -1 -1 0 0 0 0 10000 gen_car22 //Used car lot
//SWITCH_CAR_GENERATOR gen_car22 101

CREATE_CAR_GENERATOR 973.3 -55.1 -100.0 270.0 CAR_MOONBEAM -1 -1 0 40 0 0 10000 gen_car24 //Car park near radio station
//SWITCH_CAR_GENERATOR gen_car24 101

CREATE_CAR_GENERATOR 982.15 -36.61 -100.0 90.0 CAR_KURUMA -1 -1 0 90 0 0 10000 gen_car25 //Car park near radio station
//SWITCH_CAR_GENERATOR gen_car25 101

CREATE_CAR_GENERATOR 1263.5 -69.5 -100.0 270.0 CAR_RUMPO -1 -1 0 0 0 0 10000 gen_car59 //By 8Balls garage 
//SWITCH_CAR_GENERATOR gen_car59 101

//HEPBURN HEIGHTS
CREATE_CAR_GENERATOR 986.2 -146.3 4.5 270.0 CAR_STALLION -1 -1 0 10 0 0 10000 gen_car23 //Tower block carpark North east
//SWITCH_CAR_GENERATOR gen_car23 101

//CHINATOWN

CREATE_CAR_GENERATOR 1027.5 -873.1 14.5 270.0 CAR_IDAHO -1 -1 0 40 0 0 10000 gen_car28 //Fuzzball car park
//SWITCH_CAR_GENERATOR gen_car28 0

CREATE_CAR_GENERATOR 1006.18 -838.49 14.5 90.0 CAR_ESPERANTO -1 -1 0 50 0 0 10000 gen_car29 //Fuzzball car park
//SWITCH_CAR_GENERATOR gen_car29 0

CREATE_CAR_GENERATOR 857.1 -790.19 14.5 0.0 CAR_PONY -1 -1 0 90 0 0 10000 gen_car30 //South west Chinatown (down alleyway that leads to roof)
//SWITCH_CAR_GENERATOR gen_car30 101

CREATE_CAR_GENERATOR 866.9 -663.7 -100.0 270.0 CAR_MRWONGS -1 -1 0 100 0 0 10000 gen_car31 //Back of laundrette 
//SWITCH_CAR_GENERATOR gen_car31 101

CREATE_CAR_GENERATOR 861.9 -546.0 -100.0 177.0 CAR_BELLYUP -1 -1 0 0 0 0 10000 gen_car53 //Fish warehouses
//SWITCH_CAR_GENERATOR gen_car53 101

//TRENTON
//CREATE_CAR_GENERATOR 1119.0 -763.0 -100.0 0.0 CAR_MANANA -1 -1 0 10 0 0 10000 gen_car7 //Just south of the police station
//SWITCH_CAR_GENERATOR gen_car7 101

CREATE_CAR_GENERATOR 1119.04 -770.45 14.3 180.0 CAR_PERENNIAL -1 -1 0 10 0 0 10000 gen_car8 //Just south of the police station
//SWITCH_CAR_GENERATOR gen_car8 101

CREATE_CAR_GENERATOR 1102.84 -983.51 14.6 270.0 CAR_RUMPO -1 -1 0 90 0 0 10000 gen_car32 // South west trenton (nect to the sawmill)  
//SWITCH_CAR_GENERATOR gen_car32 101

//CREATE_CAR_GENERATOR 1103.05 -976.43 14.6 270.0 CAR_MULE -1 -1 0 0 0 0 10000 gen_car33	// South west trenton (nect to the sawmill)
//SWITCH_CAR_GENERATOR gen_car33 101

CREATE_CAR_GENERATOR 1242.9 -730.5 14.8 311.0 CAR_CABBIE -1 -1 0 0 0 0 10000 gen_car34 //At Taxi depot
//SWITCH_CAR_GENERATOR gen_car34 101

//CREATE_CAR_GENERATOR 1244.4 -732.2 14.8 135.0 CAR_TAXI -1 -1 0 0 0 0 10000 gen_car35 //At Taxi depot
//SWITCH_CAR_GENERATOR gen_car35 101

CREATE_CAR_GENERATOR 1220.9 -899.0 -100.0 177.4 CAR_STALLION -1 -1 0 80 0 0 10000 gen_car36 //Next to Joeys (AMco car park)
//SWITCH_CAR_GENERATOR gen_car36 101

CREATE_CAR_GENERATOR 1226.4 -882.1 -100.0 314.9 CAR_PONY -1 -1 0 10 0 0 10000 gen_car37 //Next to Joeys (AMco car park)
//SWITCH_CAR_GENERATOR gen_car37 101

CREATE_CAR_GENERATOR 1277.5 -990.0 14.2 225.0 CAR_COACH -1 -1 0 100 0 0 10000 gen_car38 //At bus Depot
//SWITCH_CAR_GENERATOR gen_car38 101

//CREATE_CAR_GENERATOR 1256.6 -992.3 14.2 45.0 CAR_COACH -1 -1 0 100 0 0 10000 gen_car39 //At bus Depot
//SWITCH_CAR_GENERATOR gen_car39 101

CREATE_CAR_GENERATOR 1278.0 -973.3 14.2 45.0 CAR_COACH -1 -1 0 100 0 0 10000 gen_car40 //At bus Depot
//SWITCH_CAR_GENERATOR gen_car40 101	


//PORTLAND HARBOUR (DOCKS)
CREATE_CAR_GENERATOR 1427.01 -786.75 -100.0 90.0 CAR_PERENNIAL -1 -1 0 0 0 0 10000 gen_car41 //Docks car park
//SWITCH_CAR_GENERATOR gen_car41 101

CREATE_CAR_GENERATOR 1407.59 -791.2 -100.0 270.0 CAR_MULE -1 -1 0 20 0 0 10000 gen_car42 //Docks car park
//SWITCH_CAR_GENERATOR gen_car42 101

CREATE_CAR_GENERATOR 1427.43 -799.69 -100.0 270.0 CAR_KURUMA -1 -1 0 90 0 0 10000 gen_car43 //Docks car park
//SWITCH_CAR_GENERATOR gen_car43 101

CREATE_CAR_GENERATOR 1545.1 -845.6 -100.0 269.9 CAR_YANKEE -1 -1 0 0 0 0 10000 gen_car54 //Docks 
//SWITCH_CAR_GENERATOR gen_car54 101

CREATE_CAR_GENERATOR 1495.1 -810.9 11.9 182.4 CAR_MULE -1 -1 0 0 0 0 10000 gen_car55 //Docks 
//SWITCH_CAR_GENERATOR gen_car55 101

CREATE_CAR_GENERATOR 1576.8 -715.1 -100.0 93.0 CAR_YANKEE -1 -1 0 0 0 0 10000 gen_car56 //Docks 
//SWITCH_CAR_GENERATOR gen_car56 101

CREATE_CAR_GENERATOR 1368.1 -1026.0 -100.0 0.0 CAR_LINERUNNER -1 -1 0 0 0 0 10000 gen_car33 //Docks by unique jump
//SWITCH_CAR_GENERATOR gen_car33 101
	 

//CALLAHAN POINT
CREATE_CAR_GENERATOR 856.38 -993.76 4.6 0.0 CAR_KURUMA -1 -1 0 0 0 0 10000 gen_car44 //Greasy joes car park
//SWITCH_CAR_GENERATOR gen_car44 0

CREATE_CAR_GENERATOR 898.21 -996.86 4.6 90.0 CAR_LINERUNNER -1 -1 0 0 0 0 10000 gen_car45 //Greasy joes car park
//SWITCH_CAR_GENERATOR gen_car45 0

CREATE_CAR_GENERATOR 874.3 -983.74 4.6 90.0 CAR_MOONBEAM -1 -1 0 0 0 0 10000 gen_car46 //Greasy joes car park
//SWITCH_CAR_GENERATOR gen_car46 0

CREATE_CAR_GENERATOR 978.6 -1093.0 13.3 0.0 CAR_BELLYUP -1 -1 0 0 0 0 10000 gen_car47 //Fish Factory
//SWITCH_CAR_GENERATOR gen_car47 0

CREATE_CAR_GENERATOR 996.3 -1127.5 13.3 270.0 CAR_BELLYUP -1 -1 0 100 0 0 10000 gen_car48 //Fish Factory
//SWITCH_CAR_GENERATOR gen_car48 0

CREATE_CAR_GENERATOR 1012.5 -1141.0 13.3 180.0 CAR_BELLYUP -1 -1 0 0 0 0 10000 gen_car49 //Fish Factory
//SWITCH_CAR_GENERATOR gen_car49 0


//REDLIGHT DISTRICT
CREATE_CAR_GENERATOR 973.0 -420.0 14.5 0.0 CAR_PERENNIAL -1 -1 0 0 0 0 10000 gen_car51 //Back alleyway in Redlight district
//SWITCH_CAR_GENERATOR gen_car51 101 								   

//CRUSHER
CREATE_CAR_GENERATOR 1111.8  45.0 -100.0 266.0 CAR_PONY -1 -1 0 0 0 0 10000 gen_car52 //By crusher
//SWITCH_CAR_GENERATOR gen_car52 101

//BEACH
CREATE_CAR_GENERATOR 1460.5 -345.0 -100.0 270.0 CAR_BOBCAT -1 -1 0 0 0 0 10000 gen_car64 //Fish Factory
//SWITCH_CAR_GENERATOR gen_car64 101

// *************************************COMMERCIAL CAR GENERATORS*****************************
VAR_INT com_car1 com_car2 com_car3 com_car4 com_car5 com_car6 com_car7 com_car8 com_car9 com_car10 phil_car 
VAR_INT	com_car11 com_car12 com_car13 com_car14 com_car15 com_car16 com_car17 com_car18 com_car19 com_car20
VAR_INT com_car21 com_car22 com_car23 com_car24	com_car25 com_car26 com_car27 com_car28 com_car29 com_car30
VAR_INT com_car31 com_car32 com_car33 com_car34	com_car35 com_car36 com_car37 com_car38 com_car39 com_car40
VAR_INT com_car41 com_car42 com_car43 com_car44	com_car45 com_car46 com_car47 com_car48 com_car49 special_tank

//CREATE_CAR_GENERATOR CarModel Remap1 Remap2 ParkedFlag ChanceOfCarAlarm ChanceOfLocked MinDelay MaxDelay CarGenID

CREATE_CAR_GENERATOR 354.2 -1055.9 -100.0 0.0 CAR_POLICE -1 -1 0 0 0 0 10000 com_car1 //At police station
//SWITCH_CAR_GENERATOR com_car1 101

CREATE_CAR_GENERATOR 340.1 -1055.9 -100.0 90.0 CAR_ENFORCER -1 -1 0 0 0 0 10000 com_car2 //At police station
//SWITCH_CAR_GENERATOR com_car2 101

CREATE_CAR_GENERATOR 356.5 -1170.3 22.0 0.0 CAR_POLICE -1 -1 0 0 0 0 10000 com_car25 //At police station
//SWITCH_CAR_GENERATOR com_car25 101

CREATE_CAR_GENERATOR 334.4 -1151.0 22.0 90.0 CAR_SENTINEL -1 -1 0 70 0 0 10000 com_car26 //At police station
//SWITCH_CAR_GENERATOR com_car26 101

//HOSPITAL
CREATE_CAR_GENERATOR 194.7 -41.1 -100.0 0.0 CAR_AMBULANCE -1 -1 0 0 0 0 10000 com_car3 //At Hospital
//SWITCH_CAR_GENERATOR com_car3 101

CREATE_CAR_GENERATOR 216.5 -40.8 -100.0 180.0 CAR_AMBULANCE -1 -1 0 0 0 0 10000 com_car4 //At Hospital
//SWITCH_CAR_GENERATOR com_car4 101

CREATE_CAR_GENERATOR 315.9 -7.0 -100.0 212.1 CAR_MOONBEAM -1 -1 0 50 0 0 10000 com_car5 //At Hospital car park
//SWITCH_CAR_GENERATOR com_car5 101

CREATE_CAR_GENERATOR 216.5 -40.8 -100.0 180.0 CAR_ESPERANTO -1 -1 0 50 0 0 10000 com_car6 //At Hospital car park
//SWITCH_CAR_GENERATOR com_car6 101

CREATE_CAR_GENERATOR 315.9 -7.0 -100.0 212.1 CAR_KURUMA -1 -1 0 50 0 0 10000 com_car7 //At Hospital car park
//SWITCH_CAR_GENERATOR com_car7 101

CREATE_CAR_GENERATOR 299.3 10.8 -100.0 35.5 CAR_BOBCAT -1 -1 0 50 0 0 10000 com_car8 //At Hospital car park
//SWITCH_CAR_GENERATOR com_car8 101

CREATE_CAR_GENERATOR 338.7 -4.6 -100.0 267.7 CAR_STALLION -1 -1 0 50 0 0 10000 com_car9 //At Hospital car park
//SWITCH_CAR_GENERATOR com_car9 101

CREATE_CAR_GENERATOR 358.7 11.7 -100.0 272.7 CAR_RUMPO -1 -1 0 50 0 0 10000 com_car10 //At Hospital car park
//SWITCH_CAR_GENERATOR com_car10 101

//ASUKAS
CREATE_CAR_GENERATOR 500.0 -659.4 -100.0 0.0 CAR_YAKUZA -1 -1 0 0 0 0 10000 com_car11 //By Asukas place
//SWITCH_CAR_GENERATOR com_car11 101

CREATE_CAR_GENERATOR 486.5 -643.6 -100.0 180.0 CAR_BLISTA -1 -1 0 40 0 0 10000 com_car12 //By Asukas place
//SWITCH_CAR_GENERATOR com_car12 101

CREATE_CAR_GENERATOR 475.5 -617.4 15.2 0.0 CAR_YAKUZA -1 -1 0 0 0 0 10000 com_car20 //By Asukas place
//SWITCH_CAR_GENERATOR com_car20 101

CREATE_CAR_GENERATOR 485.0 -710.0 -100.0 270.0 CAR_LANDSTALKER -1 -1 0 60 0 0 10000 com_car21 //By Asukas place
//SWITCH_CAR_GENERATOR com_car21 101

CREATE_CAR_GENERATOR 477.6 -731.4 -100.0 90.0 CAR_BANSHEE -1 -1 0 80 0 0 10000 com_car27 //By Asukas place
//SWITCH_CAR_GENERATOR com_car27 101

//BELLEVILLE PARK
CREATE_CAR_GENERATOR 63.4 -591.3 25.9 90.0 CAR_LANDSTALKER -1 -1 0 0 0 0 10000 com_car28 //By cottage
//SWITCH_CAR_GENERATOR com_car28 101

//TORRINGTON
CREATE_CAR_GENERATOR 233.5 -1236.7 20.5 0.0 CAR_MANANA -1 -1 0 20 0 0 10000 com_car29 //Underground car park
//SWITCH_CAR_GENERATOR com_car29 101

CREATE_CAR_GENERATOR 259.2 -1196.7 20.5 90.0 CAR_YAKUZA -1 -1 0 60 40 0 10000 com_car30 //Underground car park
//SWITCH_CAR_GENERATOR com_car30 101

CREATE_CAR_GENERATOR 228.8 -1205.7 20.5 180.0 CAR_BLISTA -1 -1 0 30 40 0 10000 com_car31 //Underground car park
//SWITCH_CAR_GENERATOR com_car31 101

CREATE_CAR_GENERATOR 211.5 -1213.5 20.5 90.0 CAR_KURUMA -1 -1 0 20 70 0 10000 com_car32 //Underground car park
//SWITCH_CAR_GENERATOR com_car32 101

CREATE_CAR_GENERATOR 458.9 -1503.4 -100.0 0.0 CAR_SENTINEL -1 -1 0 20 70 0 10000 com_car33 //Casino car park
//SWITCH_CAR_GENERATOR com_car33 101

CREATE_CAR_GENERATOR 442.7 -1465.7 18.4 180.0 CAR_YAKUZA -1 -1 0 50 50 0 10000 com_car34 //Casino car park
//SWITCH_CAR_GENERATOR com_car34 101

CREATE_CAR_GENERATOR 424.4 -1501.0 -100.0 90.0 CAR_IDAHO -1 -1 0 30 30 0 10000 com_car35 //Casino car park
//SWITCH_CAR_GENERATOR com_car35 101

CREATE_CAR_GENERATOR 476.1 -1496.4 -100.0 220.0 CAR_BANSHEE -1 -1 0 80 0 0 10000 com_car36 //Casino car park
//SWITCH_CAR_GENERATOR com_car36 101


//FORT STAUNTON
CREATE_CAR_GENERATOR 352.4 -345.5 -100.0 180.0 CAR_COLUMB -1 -1 0 0 30 0 10000 com_car37 //Construction site
//SWITCH_CAR_GENERATOR com_car37 101

CREATE_CAR_GENERATOR 394.7 -171.4 -100.0 295.0 CAR_COLUMB -1 -1 0 20 30 0 10000 com_car38 //Construction site
//SWITCH_CAR_GENERATOR com_car38 101

CREATE_CAR_GENERATOR 388.0 -95.0 -100.0 65.0 CAR_PANLANT -1 -1 0 0 0 0 10000 com_car39 //Construction site
//SWITCH_CAR_GENERATOR com_car39 101

CREATE_CAR_GENERATOR 302.9 -245.2 -100.0 270.0 CAR_PANLANT -1 -1 0 0 0 0 10000 com_car40 //Construction site
//SWITCH_CAR_GENERATOR com_car40 101

CREATE_CAR_GENERATOR 339.8449 -290.6314 16.0 158.2191 CAR_YAKUZA -1 -1 0 0 0 0 10000 gen_car60 //Construction site
//SWITCH_CAR_GENERATOR gen_car60 0

CREATE_CAR_GENERATOR 359.1079 -291.0880 16.0 146.8412 CAR_YAKUZA -1 -1 0 0 0 0 10000 gen_car61 //Construction site
//SWITCH_CAR_GENERATOR gen_car61 0

CREATE_CAR_GENERATOR 361.9012 -339.1167 16.0 339.3615 CAR_YAKUZA -1 -1 0 0 0 0 10000 gen_car62 //Construction site
//SWITCH_CAR_GENERATOR gen_car62 0



//ASPATRIA
CREATE_CAR_GENERATOR -51.6 -324.0 -100.0 90.0 CAR_BOBCAT -1 -1 0 30 30 0 10000 com_car41 //Stadium Parking Lot
//SWITCH_CAR_GENERATOR com_car41 101

CREATE_CAR_GENERATOR -40.5 -346.8 -100.0 270.0 CAR_IDAHO -1 -1 0 30 30 0 10000 com_car42 //Stadium Parking Lot
//SWITCH_CAR_GENERATOR com_car42 101

CREATE_CAR_GENERATOR -30.0 -366.9 -100.0 270.0 CAR_MULE -1 -1 0 30 30 0 10000 com_car43 //Stadium Parking Lot
//SWITCH_CAR_GENERATOR com_car43 101

CREATE_CAR_GENERATOR -62.3 -344.1 -100.0 90.0 CAR_BLISTA -1 -1 0 30 30 0 10000 com_car44 //Stadium Parking Lot
//SWITCH_CAR_GENERATOR com_car44 101

CREATE_CAR_GENERATOR -72.2 -332.5 -100.0 270.0 CAR_STALLION -1 -1 0 30 30 0 10000 com_car45 //Stadium Parking Lot
//SWITCH_CAR_GENERATOR com_car45 101

CREATE_CAR_GENERATOR -83.9 -443.6 -100.0 90.0 CAR_FIRETRUCK -1 -1 0 0 0 0 10000 gen_car35 //AT fire station
//SWITCH_CAR_GENERATOR gen_car35 101

//NEWPORT 
CREATE_CAR_GENERATOR 301.71 -582.55 25.9 270.72 CAR_ESPERANTO -1 -1 0 70 0 0 10000 com_car15 //Multi story car park
//SWITCH_CAR_GENERATOR com_car15 101

CREATE_CAR_GENERATOR 302.42 -562.54 25.9 88.21 CAR_RUMPO -1 -1 0 70 0 0 10000 com_car16 //Multi story car park
//SWITCH_CAR_GENERATOR com_car16 101

CREATE_CAR_GENERATOR 283.21 -566.47 25.9 91.84 CAR_STALLION -1 -1 0 70 0 0 10000 com_car17 //Multi story car park
//SWITCH_CAR_GENERATOR com_car17 101

CREATE_CAR_GENERATOR 302.2400 -510.4034 25.9 269.54 CAR_BLISTA -1 -1 0 70 0 0 10000 com_car19 //Multi story car park
//SWITCH_CAR_GENERATOR com_car19 101

CREATE_CAR_GENERATOR 324.5 -455.9 22.5 90.0 CAR_BLISTA -1 -1 0 50 0 0 10000 com_car24 //Behind Multi story
//SWITCH_CAR_GENERATOR com_car24 101


//BOATS
CREATE_CAR_GENERATOR 593.3 -664.0 0.0 0.0 BOAT_SPEEDER -1 -1 0 0 0 0 10000 com_car13 //At Asukas Jetty
//SWITCH_CAR_GENERATOR com_car13 101

CREATE_CAR_GENERATOR 568.0 -686.0 0.0 180.0 BOAT_REEFER -1 -1 0 0 0 0 10000 com_car23 //At Asukas Jetty
//SWITCH_CAR_GENERATOR com_car23 0

CREATE_CAR_GENERATOR 592.4 -766.7 0.0 0.0 BOAT_REEFER -1 -1 0 0 0 0 10000 com_car14 //Jetty south of Asukas
//SWITCH_CAR_GENERATOR com_car14 101

CREATE_CAR_GENERATOR 554.8 -767.6 0.0 0.0 BOAT_PREDATOR	-1 -1 0 0 0 0 10000 com_car22 //Jetty south of Asukas
//SWITCH_CAR_GENERATOR com_car22 101

CREATE_CAR_GENERATOR 133.56 208.76 11.93 180.0 CAR_BARRACKS -1 -1 0 0 0 10000 40000 phil_car //PHIL'S TRUCK--------
//SWITCH_CAR_GENERATOR phil_car 101

//Kingdom Come carpark
CREATE_CAR_GENERATOR -52.28 -1458.3 26.15 90.0 CAR_MOONBEAM -1 -1 0 20 20 0 10000 com_car46
//SWITCH_CAR_GENERATOR com_car46 101

CREATE_CAR_GENERATOR -77.5 -1485.0 26.0 90.0 CAR_KURUMA -1 -1 0 20 20 0 10000 com_car47
//SWITCH_CAR_GENERATOR com_car47 101

CREATE_CAR_GENERATOR -70.9 -1443.6 25.8 180.0 CAR_STINGER -1 -1 0 40 40 0 10000 com_car48
//SWITCH_CAR_GENERATOR com_car48 101

//Underground Bedford Point

CREATE_CAR_GENERATOR 9.5 -1475.7 19.7 0.0 CAR_RUMPO -1 -1 0 40 40 0 10000 com_car49
//SWITCH_CAR_GENERATOR com_car49 101

CREATE_CAR_GENERATOR 132.0 173.9 11.6 0.0 CAR_RHINO -1 -1 0 0 0 0 10000 special_tank
//SWITCH_CAR_GENERATOR special_tank 0

// *************************************SUBURBAN CAR GENERATORS******************************
VAR_INT sub_car1 sub_car2 sub_car3 sub_car4 sub_car5 sub_car6 sub_car7 sub_car8 sub_car9  
VAR_INT sub_car10 sub_car11 sub_car12 sub_car13 sub_car14 sub_car15 sub_car16 sub_car17 sub_car18 sub_car19  
VAR_INT sub_car20 sub_car21 sub_car22 sub_car23 sub_car24 sub_car25 sub_car26 sub_car27 sub_car28 sub_car29  
VAR_INT sub_car30 sub_car31 sub_car32 sub_car33 sub_car34 sub_car35 sub_car36 sub_car37 sub_car38 sub_car39 
VAR_INT sub_car40 sub_car41 sub_car42 sub_car43 sub_car44 sub_car45 sub_car46 

//CREATE_CAR_GENERATOR X Y Z Rot CarModel Remap1 Remap2 ParkedFlag ChanceOfCarAlarm ChanceOfLocked MinDelay MaxDelay CarGenID

CREATE_CAR_GENERATOR -458.4 268.0 -100.0 180.0 CAR_CHEETAH -1 -1 0 100 0 0 10000 sub_car1 //Swankville carpark
//SWITCH_CAR_GENERATOR sub_car1 101

CREATE_CAR_GENERATOR -585.1 265.0 -100.0 0.0 CAR_LANDSTALKER -1 -1 0 100 0 0 10000 sub_car2 //Swankville carpark
//SWITCH_CAR_GENERATOR sub_car2 101

CREATE_CAR_GENERATOR -712.1 263.6 -100.0 180.0 CAR_STINGER -1 -1 0 100 0 0 10000 sub_car3 //Swankville carpark
//SWITCH_CAR_GENERATOR sub_car3 101

CREATE_CAR_GENERATOR -1249.1 -92.5 -100.0 90.0 CAR_AMBULANCE -1 -1 0 0 0 0 10000 sub_car4 //At Hospital
//SWITCH_CAR_GENERATOR sub_car4 101

CREATE_CAR_GENERATOR -1266.0 -37.7 -100.0 160.0 CAR_POLICE -1 -1 0 0 50 0 10000 sub_car5 //At police station
//SWITCH_CAR_GENERATOR sub_car5 101

CREATE_CAR_GENERATOR -402.0 291.6 -100.0 252.0 CAR_COLUMB -1 -1 0 0 0 0 10000 sub_car6 //Swankville carpark
//SWITCH_CAR_GENERATOR sub_car6 101

CREATE_CAR_GENERATOR -218.5 263.7 3.5 90.0 CAR_PATRIOT -1 -1 0 0 0 0 10000 sub_car7 //Picnic area
//SWITCH_CAR_GENERATOR sub_car7 101

CREATE_CAR_GENERATOR -839.4 -463.8 -100.0 90.0 CAR_FIRETRUCK -1 -1 0 0 0 0 10000 sub_car25 //AT airport
//SWITCH_CAR_GENERATOR sub_car25 101	  

CREATE_CAR_GENERATOR -1268.4851 -528.6431 10.2 180.0 PLANE_DODO -1 -1 0 0 0 0 10000 gen_car63 //At airport
//SWITCH_CAR_GENERATOR gen_car63 0

CREATE_CAR_GENERATOR -755.0409 204.3065 27.7 179.8454 CAR_BANSHEE -1 -1 0 80 0 0 10000 sub_car40//projects
//SWITCH_CAR_GENERATOR sub_car40 101

CREATE_CAR_GENERATOR -724.7776 180.2350 27.7 182.0509 CAR_STALLION -1 -1 0 70 5 0 10000 sub_car41//projects
//SWITCH_CAR_GENERATOR sub_car41 101

CREATE_CAR_GENERATOR -668.2543 99.3071 17.8 359.5899 CAR_BLISTA -1 -1 0 70 5 0 10000 sub_car42//projects 
//SWITCH_CAR_GENERATOR sub_car42 101

CREATE_CAR_GENERATOR -449.9598 -13.2082 2.9 0.6847 CAR_COLUMB -1 -1 0 70 5 0 10000 sub_car43//projects 
//SWITCH_CAR_GENERATOR sub_car43 101

CREATE_CAR_GENERATOR -510.8174 74.5390 2.9 0.2808 CAR_LANDSTALKER -1 -1 0 70 5 0 10000 sub_car44//projects 
//SWITCH_CAR_GENERATOR sub_car44 101

CREATE_CAR_GENERATOR -217.6635 318.7584 2.5 358.8526 CAR_BOBCAT -1 -1 0 70 2 0 10000 sub_car45//projects
//SWITCH_CAR_GENERATOR sub_car45 101

CREATE_CAR_GENERATOR -561.3663 -6.3410 2.9 91.0259 CAR_KURUMA -1 -1 0 70 1 0 10000 sub_car46//projects
//SWITCH_CAR_GENERATOR sub_car46 101

// ********************AIRPORT CARPARK********************************************************

CREATE_CAR_GENERATOR -896.68 -414.2 11.25 90.0 CAR_LANDSTALKER -1 -1 0 20 20 0 10000 sub_car8 //AT airport
//SWITCH_CAR_GENERATOR sub_car8 101	  

CREATE_CAR_GENERATOR -896.68 -395.2 11.25 270.0 CAR_BLISTA -1 -1 0 20 40 0 10000 sub_car9 //AT airport
//SWITCH_CAR_GENERATOR sub_car9 101	  

CREATE_CAR_GENERATOR -882.1 -391.7 11.0 0.0 CAR_STALLION -1 -1 0 30 20 0 10000 sub_car10 //AT airport
//SWITCH_CAR_GENERATOR sub_car10 101	  

CREATE_CAR_GENERATOR -862.9 -404.4 11.0 180.0 CAR_INFERNUS -1 -1 0 60 20 0 10000 sub_car11 //AT airport
//SWITCH_CAR_GENERATOR sub_car11 101	  

CREATE_CAR_GENERATOR -846.65 -413.6 11.0 180.0 CAR_SENTINEL -1 -1 0 30 40 0 10000 sub_car12 //AT airport
//SWITCH_CAR_GENERATOR sub_car12 101	  

CREATE_CAR_GENERATOR -814.85 -372.4 11.0 180.0 CAR_MANANA -1 -1 0 10 20 0 10000 sub_car13 //AT airport
//SWITCH_CAR_GENERATOR sub_car13 101	  

CREATE_CAR_GENERATOR -821.2 -404.7 11.0 180.0 CAR_RUMPO -1 -1 0 10 10 0 10000 sub_car14 //AT airport
//SWITCH_CAR_GENERATOR sub_car14 101	  

CREATE_CAR_GENERATOR -767.9 -404.65 11.0 0.0 CAR_TAXI -1 -1 0 10 20 0 10000 sub_car15 //AT airport
//SWITCH_CAR_GENERATOR sub_car15 101	  

CREATE_CAR_GENERATOR -773.4 -373.13 11.0 180.0 CAR_ESPERANTO -1 -1 0 20 20 0 10000 sub_car16 //AT airport
//SWITCH_CAR_GENERATOR sub_car16 101	  

// *****************************OUT FRONT OF AIRPORT**************************************

CREATE_CAR_GENERATOR -750.4 -603.13 11.0 270.0 CAR_TAXI -1 -1 0 20 20 0 10000 sub_car19 //AT airport
//SWITCH_CAR_GENERATOR sub_car19 101	  

CREATE_CAR_GENERATOR -750.4 -567.13 11.0 270.0 CAR_TAXI -1 -1 0 20 20 0 10000 sub_car20 //AT airport
//SWITCH_CAR_GENERATOR sub_car20 101	  

//  **************************AIRSTRIP*************************************************
CREATE_CAR_GENERATOR -856.4 -1228.13 1.0 250.0 BOAT_SPEEDER -1 -1 0 0 0 0 10000 sub_car17 //Runway
//SWITCH_CAR_GENERATOR sub_car17 101	  

CREATE_CAR_GENERATOR -1126.4 -1034.13 1.0 270.0 BOAT_PREDATOR -1 -1 0 0 0 0 10000 sub_car18 //Runway
//SWITCH_CAR_GENERATOR sub_car18 101	  

CREATE_CAR_GENERATOR -1574.0 -873.0 11.0 90.0 CAR_POLICE -1 -1 0 0 0 0 10000 sub_car21 //POLICE HELIPAD
//SWITCH_CAR_GENERATOR sub_car21 101	  

CREATE_CAR_GENERATOR -1073.0 -753.0 11.0 360.0 CAR_RUMPO -1 -1 0 20 10 0 10000 sub_car22 //FREIGHT TERMINAL
//SWITCH_CAR_GENERATOR sub_car22 101	  

CREATE_CAR_GENERATOR -1088.0 -753.0 11.0 360.0 CAR_RUMPO -1 -1 0 20 10 0 10000 sub_car23 //FREIGHT TERMINAL
//SWITCH_CAR_GENERATOR sub_car23 101	  

CREATE_CAR_GENERATOR -848.0 -657.0 11.0 90.0 CAR_RUMPO -1 -1 0 20 10 0 10000 sub_car24 //FREIGHT TERMINAL
//SWITCH_CAR_GENERATOR sub_car24 101	  

CREATE_CAR_GENERATOR -847.5811 -753.2242 10.2 143.6972 PLANE_DODO -1 -1 0 0 0 0 10000 sub_car30 //IN HANGAR
//SWITCH_CAR_GENERATOR sub_car30 101

CREATE_CAR_GENERATOR -1525.3434 -924.3124 10.2 246.7710 PLANE_DODO -1 -1 0 0 0 0 10000 sub_car31 //WEST AIRPORT BY CHOPPERS
//SWITCH_CAR_GENERATOR sub_car31 101

 
 

// ******************RC DESTRUCTION DERBY******************************************************
VAR_INT rc_van1 rc_van2 rc_van3 rc_van4 rc_van5 rc_van6

CREATE_CAR_GENERATOR 1014.0 -120.0 5.0 270.0 CAR_TOYZ -1 -1 0 0 0 0 10000 rc_van1 //Diablos
//SWITCH_CAR_GENERATOR rc_van1 101

CREATE_CAR_GENERATOR 1158.0 -309.0 23.0 180.0 CAR_TOYZ -1 -1 0 0 0 0 10000 rc_van2 //Mafia
//SWITCH_CAR_GENERATOR rc_van2 101

CREATE_CAR_GENERATOR -633.8 64.6 19.0 175.0 CAR_TOYZ -1 -1 0 0 0 0 10000 rc_van3 //Hood
//SWITCH_CAR_GENERATOR rc_van3 101

CREATE_CAR_GENERATOR 366.0 -1312.0 26.0 180.0 CAR_TOYZ -1 -1 0 0 0 0 10000 rc_van4 //Yakuza
//SWITCH_CAR_GENERATOR rc_van4 101



RETURN