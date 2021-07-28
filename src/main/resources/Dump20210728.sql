-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: travel
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `blog`
--

DROP TABLE IF EXISTS `blog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blog` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(80) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `body` mediumtext,
  `description` varchar(200) DEFAULT NULL,
  `creation` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `blogtype` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog`
--

LOCK TABLES `blog` WRITE;
/*!40000 ALTER TABLE `blog` DISABLE KEYS */;
INSERT INTO `blog` VALUES (2,'Discover the Beauty of the Valley of Flowers National Park.','Summer','<p>Valley of flowers is 300 km north away from the Rishikesh. The road journey is possible till Govindghat. The trekking path gets started after reaching to Govind Ghat, which is 20 km away from Badrinath. Alluring pastures, clouds amongst touching sky hills and intriguing cascades make tourists feel like a paradise.</p><p>This marvelous sight was acknowledged as the national park around the year of 1982. It was also declared as the world heritage site. The magnificence of the valley attracts the pro photographers, nature enthusiasts, and backpackers.</p><p>Heavy snowfall takes place in this region during the winter season. It seems like Park wears a veil of snow during winter. The flowers blossom between July and September. In fact, it is the perfect time to visit this heaven; whereas, October is the duration when grass stop growing and flowers stop blooming. Well, regional people also believe that fairies lived in Valley. I think beyond any shadow of a doubt one should admit this belief because truly it seems like a land of fairies.</p>','Alley of flowers is the ultimate destination to experience the magic, which is performed by the Mother Nature.','2021-07-05 11:58:20','D'),(3,'Experiences You Can Have Only during Monsoon in Mumbai','Monsoon','<h2 class=\"rtejustify\"><b>1. Walk down Bandra\'s bandstand</b></h2><div><span>Get a cuppa coffee overlooking the stormy sea. End the walk in Bandra with&#160;</span><em>bhutta&#160;</em><span>from one of the roadside stalls.</span><b><br></b></div><div><span><br></span></div><div><h2 class=\"rtejustify\"><b>2. Go for a drive in Aarey Milk Colony</b></h2></div><div><span>The maximum cover of green Mumbai has in one location. Situated in Goregaon East, the colony has lakes, restaurants overlooking lush green gardens, space for boating, and even an observatory called&#160;</span><em>Chota Kashmir</em><span>.</span><b><br></b></div><div><span><br></span></div><div><h2 class=\"rtejustify\"><b>3. Get up early and go to SGNP (Sanjay Gandhi National Park) to explore Kanheri caves</b></h2></div><div><span>Photographers, don\'t forget to take your shooting equipment to capture these Spartan caves sprinkled with Buddhist inscriptions on the basalt walls. Later, spend the evening with&#160;wildlife, birds and numerous plants the national&#160;park is home to.</span><b><br></b></div><div><span><br></span></div><div><h2 class=\"rtejustify\"><b>4. Dare to take a walk along Marine Drive during monsoon?</b></h2></div><div><span>If you haven\'t, we suggest you indulge the wave lashes a little.&#160;Don\'t get&#160;too close to the edge or you could get swept way! When you have had a sufficient dose of adrenalin, feed the growling stomach with a plate of&#160;</span><em>bhajiyas</em><span>&#160;or&#160;</span><em>bhel puri</em><span>&#160;from the roadside&#160;food stall.</span><b><br></b></div><div><span><br></span></div><div><h2 class=\"rtejustify\"><b>5. Drive down to Juhu or Aksa&#160;beach and watch the sea growl</b></h2></div><div><span>&#160;It\'s at moments like these, when you comprehend&#160;your powerlessness against&#160;nature in all its fury, that leaves you both enchanted and stumped for words.</span><br></div>','You can try but you can\'t escape the horrid splashes.','2021-07-05 12:03:01','P'),(4,'Summer in Shimla','Summer','<p><span><a href=\"https://www.tourism-of-india.com/shimla/\">Shimla</a></span>&#160;is an ideal destination to spend summer season in India. The &#8216;Queen of Hill Stations&#8217; in&#160;<span><a href=\"https://www.tourism-of-india.com/himachal-pradesh/\">Himachal Pradesh</a></span>&#160;is one of the favorite holiday getaways. The salubrious climate was in fact the reason that the British colonials settled here every summer. There are several accommodation options, and amazements. Come with your loved ones to the town, listed among the top places for a summer vacations in India.</p><h4>Things to do in Shimla:</h4><ul><li>Hop on the Toy Train from Kalka to Shimla.</li><li>White water rafting at Tattapani.</li><li>Linger around the Mall Road to eat, shop and enjoy.</li><li>Visit the beautiful Christ Church on the Ridge near the mall.</li><li>Trek to Jakhu Hanuman Temple, perched on top of a hill.</li><li>Explore the British architecture of Viceregal Lodge, Christ Church, etc.</li><li>A&#160;<span><a href=\"https://www.tourism-of-india.com/himachal-pradesh/things-to-do/kufri.html\">visit to Kufri</a></span>,&#160;<span><a href=\"https://www.tourism-of-india.com/himachal-pradesh/things-to-do/chail.html\">Chail</a>&#160;</span>and Mashobra, beautiful hill getaways.</li><li>Get a family photo in the traditional attire for a fond memory.</li></ul>','The ‘Queen of Hill Stations’ in Himachal Pradesh is one of the favorite holiday getaways.','2021-07-05 12:04:27','D'),(5,'Auli, Uttarakhand','Winter','<div><span>When you search for some amazing places to see snow in India, Auli is sure to get into your itinerary. This snow-covered hill station provides a beautiful view of Mana Parwat, Dunagiri, Mt. Nanda DeviKamat and NarParbat. Auli also provides the best skiing ground for you to ski; you can also go around seeing various lovely scenarios that are blessed in this place.</span></div><div><span>The city has a magnificent view of the Himalayan range as you board the Auli ropeway.</span></div><div><span><br></span></div><div><span>Activities to do: Skiing in Auli, Some leisure time at the Auli artificial lake, Catch a glimpse of Gorson Bugyal green pastures, Taste some sweet water at Chattrakund, Trek to the Himalayas at Kwani Bugyal.</span></div><div><span>Distance from Haridwar: 8 Hours</span></div><div><span>Cheapest hotels start at Rs. 600</span></div><div><span>Mode of Transport: Cab or Bus ( Rs.800- 1000)</span></div><div><span>Expenditure: Rs.7000</span></div><div><br></div>','Ride, Play, Ski, Repeat!','2021-07-05 12:05:06','D'),(6,'Rishikesh during Summer','Summer','<p>Rishikesh is one of the best places for summer holidays in India, as you will spend time on the banks of River Ganga at the foothills of Himalayas in&#160;<span><a href=\"https://www.tourism-of-india.com/uttarakhand/\">Uttarakhand</a></span>. Rishikesh has the reputation of World Capital of Yoga and a hub of adventures. Find bliss in yoga centers,&#160;<span><a href=\"https://www.tourism-of-india.com/ashrams/\">ashrams</a></span>, temples and river banks and shot of adrenalin with river rafting, cliff jumping, fox flying, India highest bungee jump and other adventure sports.</p><h4>What to do?</h4><ul><li>River rafting in River Ganga</li><li>Camping on the river banks</li><li>Body surfing</li><li>Fox-flying on wires suspended between two mountains.</li><li>Visit ancient temples</li><li>Learn all about Yoga</li><li>Indulge in Ayurveda and meditation at the Ashrams.</li></ul><h4>How to reach</h4><p>Nestled at the foothills of&#160;<span><a href=\"https://www.tourism-of-india.com/himalayas/\">Himalayas</a></span>&#160;in Uttarakhand, Rishikesh has closest international connection with Delhi Airport or Jolly Grant Airport in Dehradun. The nearest railway station is in Haridwar</p>','Rishikesh is one of the best places for summer holidays in India','2021-07-05 12:07:19','P'),(7,'nhjftjyt','Monsoon','gfyjugtjyu','dhfjutyj','2021-07-08 07:31:21','P'),(8,'rguxddfhjk','Monsoon','dyhrtyuryu','edhyrhyu','2021-07-09 07:11:37','P'),(10,'RecentlyUpdated','Monsoon','bshefise sbgfij&#160; fbsnjefsk fjkkd kdmd&#160;','This blog is being updated from the draft section','2021-07-19 18:30:00','D');
/*!40000 ALTER TABLE `blog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `campaigns`
--

DROP TABLE IF EXISTS `campaigns`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `campaigns` (
  `festivalid` int NOT NULL AUTO_INCREMENT,
  `festivalname` varchar(25) DEFAULT NULL,
  `startdate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `offer` varchar(45) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`festivalid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campaigns`
--

LOCK TABLES `campaigns` WRITE;
/*!40000 ALTER TABLE `campaigns` DISABLE KEYS */;
INSERT INTO `campaigns` VALUES (1,'Diwali','2021-11-18','2021-11-23','10%','Active'),(2,'Holi','2022-03-04','2022-03-06','15%','Inactive');
/*!40000 ALTER TABLE `campaigns` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedbacks`
--

DROP TABLE IF EXISTS `feedbacks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedbacks` (
  `id` int NOT NULL AUTO_INCREMENT,
  `magname` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `comments` varchar(200) DEFAULT NULL,
  `rating` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedbacks`
--

LOCK TABLES `feedbacks` WRITE;
/*!40000 ALTER TABLE `feedbacks` DISABLE KEYS */;
INSERT INTO `feedbacks` VALUES (1,'LA Travel','nina@gml.com','Came accross a great travel magazine',4),(3,'Wanderlust','Krish@gml.com','Could work a little on this one.',0),(4,'Planet Goa','sonal@gml.com','A great place to visit indeed',4),(5,'Planet Goa','sonal@gml.com','A great place to visit indeed',4);
/*!40000 ALTER TABLE `feedbacks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `magazine`
--

DROP TABLE IF EXISTS `magazine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `magazine` (
  `magid` int NOT NULL AUTO_INCREMENT,
  `magname` varchar(45) DEFAULT NULL,
  `magprice` double DEFAULT NULL,
  `magtype` varchar(10) DEFAULT NULL,
  `coverimage` varchar(45) DEFAULT NULL,
  `discountprice` int DEFAULT NULL,
  PRIMARY KEY (`magid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `magazine`
--

LOCK TABLES `magazine` WRITE;
/*!40000 ALTER TABLE `magazine` DISABLE KEYS */;
INSERT INTO `magazine` VALUES (1,'Travel+Leisure',522,'Summer','summer1.png',469),(2,'The Newyorker',460,'Winter','winter1.png',414),(3,'World Travel',630,'Monsoon','monsoon1.png',567),(4,'Traveller',530,'Winter','winter3.png',477),(5,'LA Travel',800,'Summer','summer3.png',720),(6,'Planet Goa',428,'Monsoon','monsoon2.png',385),(7,'Budget Travel',586,'Summer','summer2.png',527),(8,'Travel+Leisure',713,'Winter','winter2.png',641),(9,'Wanderlust',560,'Monsoon','monsoon3.png',504);
/*!40000 ALTER TABLE `magazine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profiles`
--

DROP TABLE IF EXISTS `profiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profiles` (
  `pid` int NOT NULL,
  `profile_name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profiles`
--

LOCK TABLES `profiles` WRITE;
/*!40000 ALTER TABLE `profiles` DISABLE KEYS */;
INSERT INTO `profiles` VALUES (1,'Customer'),(2,'Employee'),(3,'Artist');
/*!40000 ALTER TABLE `profiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `empid` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `username` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `email` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `password` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `gender` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `pid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `pid_idx` (`pid`),
  CONSTRAINT `pid` FOREIGN KEY (`pid`) REFERENCES `profiles` (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'','Nina','1989-08-09','nina@gna.com','123','female',1),(2,'','Riya','2000-06-03','riya@gml.com','85926134','female',1),(3,'','Tanay','1996-11-18','tanay@bcd.com','123','',3),(4,'A752634','Krish','2006-08-25','krish@nmi.com','456','male',2),(6,'','Yuvan','1997-12-09','Yuvan@gml.com','','male',1),(7,'W5294','tanya','2001-09-25','tan@sdb.com','89647347','female',2),(8,'','Sonal','2001-11-20','sonal@gmil.com','789','',3),(9,'G52346','Ashley','1993-04-27','ash@edg.com','491563','female',2);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-28 15:32:35
