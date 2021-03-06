package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		
		int startingNumberOfBirds = 4;
		int flyAway = 1;
		int remainingBirds = startingNumberOfBirds - flyAway;
		
		System.out.println(remainingBirds);
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		
		System.out.println(numberOfExtraBirds);
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlaying = 3;
		int raccoonsLeftForDinner = 2;
		int raccoonsRemaining = raccoonsPlaying - raccoonsLeftForDinner;
		System.out.println(raccoonsRemaining);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int differenceOfFlowersAndBees = flowers - bees;

		System.out.println(differenceOfFlowersAndBees);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int totalPigeonsEatingBreadCrumbs = lonelyPigeon + anotherPigeon;
		
		System.out.println(totalPigeonsEatingBreadCrumbs);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsSitting = 3;
		int owlsJoined = 2;
		int totalOwls = owlsSitting + owlsJoined;
        
		System.out.println(totalOwls);
		/*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beaversSwimming = 1;
		int beaversStillWorking = beaversWorking - beaversSwimming;
		
		System.out.println(beaversStillWorking);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		int toucansFlyingIn = 1;
		int totalToucans = toucansSitting + toucansFlyingIn;
		
		System.out.println(totalToucans);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nuts = 2;
		int differenceInSquirrelsAndNuts = squirrelsInTree - nuts;
		
		System.out.println(differenceInSquirrelsAndNuts);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
        int numberOfQuarters = 1;
        int numberOfDimes = 1;
        int numberOfNickles = 2;
        
        double quarterAmount = 0.25;
        double dimeAmount = 0.10;
        double nickleAmount = 0.10;
        double totalMoneyFound = (numberOfQuarters * quarterAmount) + (numberOfDimes * dimeAmount) + (numberOfNickles * nickleAmount);
        
        System.out.println(totalMoneyFound);
        
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
        
        int briersClass = 18;
        int macadamsClass = 20;
        int flannerysClass = 17;
        int totalMuffinsBaked = briersClass + macadamsClass + flannerysClass;
        
        System.out.println(totalMuffinsBaked);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        double yoyoCost = 0.24;
        double whistleCost = 0.14;
        
        double totalCost = yoyoCost + whistleCost;
        
        System.out.println(totalCost);
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        
        int largeMarshmallow = 8;
        int miniMarshmallow = 10;
        int numberOfRiceKrispies = 5;
        
        int totalMarshmallows = (largeMarshmallow + miniMarshmallow) * 5;
        
        System.out.println(totalMarshmallows);
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int inchesOfSnowAtHilts = 29;
        int inchesOfSnowAtBrecknock = 17;
        int differenceInSnowAtLocations = inchesOfSnowAtHilts - inchesOfSnowAtBrecknock;
        
        System.out.println(differenceInSnowAtLocations);
        
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        double hiltMoney = 10.00;
        double toyTruckCost = 3.00;
        double pencilCost = 2.00;
        double moneyLeft = hiltMoney - toyTruckCost - pencilCost;
        
        System.out.println(moneyLeft);
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int collectionOfMarbles = 16;
        int marblesLost = 7;
        int marblesLeft = collectionOfMarbles - marblesLost;
        
        System.out.println(marblesLeft);
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int seashellsInCollection = 19;
        int seashellsWantedInCollection = 25;
        int seashellsNeeded = seashellsWantedInCollection - seashellsInCollection;
        
        System.out.println(seashellsNeeded);

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int redBalloons = 8;
        int totalBalloons = 17;
        int greenBalloons = totalBalloons - redBalloons; 
        
        System.out.println(greenBalloons);

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksAlreadyOnShelf = 38;
        int booksMartaAdded = 10;
        int totalBooksOnShelf = booksAlreadyOnShelf + booksMartaAdded;
        
        System.out.println(totalBooksOnShelf);

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int totalLegsOnBees = 6;
        int totalOfBees = 8;
        int totalLegs = totalLegsOnBees * totalOfBees;
        
        System.out.println(totalLegs);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        double iceCreamConeCost = 0.99;
        int numberOfCones = 2;
        double totalPaidForCones = iceCreamConeCost * numberOfCones;
        
        System.out.println(totalPaidForCones);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int rocksNeededForBorder = 125;
        int rocksAlreadyHave = 64;
        int additionalRocksNeeded = rocksNeededForBorder - rocksAlreadyHave; 
        
        System.out.println(additionalRocksNeeded);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int startingMarbles = 38;
        int lostMarbles = 15;
        int totalMarblesLeft = startingMarbles - lostMarbles;
        
        System.out.println(totalMarblesLeft);

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int milesAway = 78;
        int milesBeforeStop = 32;
        int milesLeftToGo = milesAway - milesBeforeStop;
        
        System.out.println(milesLeftToGo);

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        
        int timeShoveledSaturday = 90;
        int timeShoveledSunday = 45;
        int totalTime = timeShoveledSaturday + timeShoveledSunday;
        
        System.out.println(totalTime);

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int hotDogsBought = 6;
        double costOfHotDog = 0.50;
        double totalPaid = costOfHotDog *  hotDogsBought;
        
        System.out.println(totalPaid);
        
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        double totalCash = 0.50;
        double costPerPencil = 0.07;
        double pencilsThatCanBeBought = totalCash / costPerPencil;
        
        System.out.println(pencilsThatCanBeBought);

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int totalButterflies = 33;
        int totalOrangeButterflies = 20;
        int totalRedButterflies = totalButterflies - totalOrangeButterflies;
        
        System.out.println(totalRedButterflies);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        double cashGiven = 1.00;
        double candyCost = 0.54;
        double totalChange = cashGiven - candyCost;
        
        System.out.println(totalChange);

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int treesAlreadyInBackyard = 13;
        int treesNewlyPlanted = 12;
        int totalTreesInYard = treesAlreadyInBackyard + treesNewlyPlanted;
        
        System.out.println(totalTreesInYard);

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int hoursInADay = 24;
        int daysAway = 2;
        int totalHours = hoursInADay * daysAway;
        
        System.out.println(totalHours);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int totalCousins = 4;
        int piecesOfGumPerCousin = 5;
        int totalGumNeeded = totalCousins + piecesOfGumPerCousin;
        
        System.out.println(totalGumNeeded);
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        double moneyDanHas = 3.00;
        double moneySpent = 1.00;
        double moneyLeftOver = moneyDanHas - moneySpent;
        
        System.out.println(moneyLeftOver);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int boatsInLake = 5;
        int peoplePerBoat = 3;
        int totalPeople = boatsInLake * peoplePerBoat; 
        
        System.out.println(totalPeople);
        
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int startingLegos = 380;
        int lostLegos = 57;
        int remainingLegos = startingLegos - lostLegos;
        
        System.out.println(remainingLegos);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int muffinsBaked = 35;
        int muffinsNeeded = 83;
        int totalMuffinsLeftToBake = muffinsNeeded - muffinsBaked;
        
        System.out.println(totalMuffinsLeftToBake);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyCrayons = 1400;
        int lucyCrayons = 290;
        int differenceInCrayons = willyCrayons - lucyCrayons;
        
        System.out.println(differenceInCrayons);

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersPerPage = 10;
        int numberOfPages = 22;
        int totalStickers = stickersPerPage * numberOfPages;
        
        System.out.println(totalStickers);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int totalCupcakes = 96;
        int totalChildren = 8;
        int totalCupcakesPerChild = totalCupcakes / totalChildren;
        
        System.out.println(totalCupcakesPerChild);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int totalCookiesBaked = 47;
        int totalCookiesPerJar = 6;
        int totalCookiesLeftOut = totalCookiesBaked % totalCookiesPerJar;
        
        System.out.println(totalCookiesLeftOut);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int criossantsPrepared = 59;
        int totalNeighbors = 8;
        int criossantsLeftOut = criossantsPrepared % totalNeighbors;
        
        System.out.println(criossantsLeftOut);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int oatmealCookies = 276;
        int cookiesPerTray = 12;
        int totalTrays = oatmealCookies / cookiesPerTray;
        
        System.out.println(totalTrays);
        
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int pretzelsMade = 480;
        int servingSize = 12;
        int totalServings = pretzelsMade / servingSize;
        
        System.out.println(totalServings);

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int cupcakesBaked = 53;
        int cupCakesLeftAtHome = 2;
        int cupCakesPerBox = 3;
        int totalBoxes = (cupcakesBaked - cupCakesLeftAtHome) / cupCakesPerBox;
        
        System.out.println(totalBoxes);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrotSticksPrepared = 74;
        int amountOfPeople = 12;
        int carrotsLeftOver = carrotSticksPrepared % amountOfPeople;

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int totalTeddyBears = 98;
        int teddyBearPerShelf = 7;
        int totalShelvesFilled = totalTeddyBears % teddyBearPerShelf;
        
        System.out.println(totalShelvesFilled);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int totalPictures = 480;
        int totalPicturesPerAlbum = 20;
        int totalAlbumsNeeded = totalPictures / totalPicturesPerAlbum;
        
        System.out.println(totalAlbumsNeeded);

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int cardsCollected = 94;
        int maxCardsPerBox = 8;
        int totalBoxesFilled = cardsCollected % maxCardsPerBox;
        
        System.out.println(totalBoxesFilled);

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int numberOfBooks = 210;
        int numberOfShelves = 10;
        int numberOfBooksPerShelf = numberOfBooks / numberOfShelves; 
        
        System.out.println(numberOfBooksPerShelf);
        

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int croissantsBaked = 17;
		int totalGuests = 7;
		int croissantsPerGuest = croissantsBaked % totalGuests; 
		
		System.out.println(croissantsPerGuest);

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		double billPaintTime = 2.15;
		double jillPaintTime = 1.90;
		int numberOfRooms = 5;
		double totalTimeBetweenBoth = 4.05;
		
		double totalPaintTime = totalTimeBetweenBoth / numberOfRooms;
		
		System.out.println(totalPaintTime);
		
		
		

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		String firstName = "Tiara";
		String lastName = "Hatch";
		char middleInitial = 'S';
		String fullName = lastName  + firstName +  middleInitial;
		
		System.out.println(fullName);
	

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		double totalDistance = 800.0;
		double milesTraveled = 537.0;
		double percentCompleted =  milesTraveled / totalDistance;
		
		System.out.println(percentCompleted);


	}

}
