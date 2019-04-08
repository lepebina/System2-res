package com.scholastic.main;


import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.isEmptyString;


import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.http.ContentType;


import com.jayway.restassured.specification.ResponseSpecification;

public class SpsLookupServiceSupportClass 
{
	public static final String ENDPOINT_ALLSTATE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/states";
	public static final String ENDPOINT_ALLCITY="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/states/NY/cities";
	public static final String ENDPOINT_ALLCOUNTRY="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/countries";
	public static final String ENDPOINT_COUNTRYSCHOOLS="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/countries/BD/school";
	public static final String ENDPOINT_SCHOOLBYZIPCODE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/zipcode/{zipCode}/school?forceClient=&";
	public static final String ENDPOINT_SCHOOLBYCITYSATATE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/states/NY/cities/Alcove/school?forceClient=&";
	public static final String ENDPOINT_ALLTEACHERS="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/sps/school/{schoolId}/educator?fat=&";
	public static final String ENDPOINT_ALTERNATETEACHER="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/sps/school/{schoolId}/educator/alternate";
	public static final String ENDPOINT_EXPOSECONSUMER="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/user?type=*&userType=consumer&";
	public static final String ENDPOINT_EXPOSEEDUCATOR="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/user?type=*&userType=educator&";
	public static final String ENDPOINT_PRIMARYSCHOOLADDRESS="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/user/{userId}/organization";
	public static final String ENDPOINT_EXSISTINGSHIPPINGADDRESS="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsaddressbook/{userId}/";
	public static final String ENDPOINT_ONLYTEACHERS="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/lookup/sps/school/{schoolId}/educator?fat=true&";
	public static final String ENDPOINT_ALLGRADECLASSSIZE="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{userId}/gradeclasssize";
	public static final String ENDPOINT_CRIDTCARDSWALLET="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spsuser/{userId}/cybersource/creditcard";
	public static final String ENDPOINT_EXISTINGASSOCIATEDSOCIALACCOUNTS="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spssocial/{userId}";
	public static final String ENDPOINT_CHILDUSERS="http://fs-iam-spsapifacade-qa1.scholastic-labs.io:80/sps-api-facade/spschilduser/{childUserId}";
	
	public ResponseSpecification getAllStateResponseValidator()
	{
		final String[][] keyValues = 
			{ 
			{ "AK", "AK - Alaska" }, { "AL", "AL - Alabama" }, { "AR", "AR - Arkansas" },
			{ "AS", "AS - American Samoa" }, { "AZ", "AZ - Arizona" },{"CA","CA - California" }, { "CO", "CO - Colorado" },
			{ "CT", "CT - Connecticut" }, { "DC", "DC - District of Columbia" }, { "DE", "DE - Delaware" }, 
			{ "FL", "FL - Florida" }, { "FM", "FM - Micronesia" }, { "GA", "GA - Georgia" }, { "GU", "GU - Guam" },
			{ "HI", "HI - Hawaii" }, { "IA", "IA - Iowa" }, { "ID", "ID - Idaho" }, { "IL", "IL - Illinois" }, 
			{ "IN", "IN - Indiana" }, { "KS", "KS - Kansas" }, { "KY", "KY - Kentucky" }, { "LA", "LA - Louisiana"}, 
			{ "MA", "MA - Massachusetts" }, { "MD", "MD - Maryland" }, { "ME", "ME - Maine" }, { "MH", "MH - Marshall Isl"},
			{ "MI", "MI - Michigan" }, { "MN", "MN - Minnesota" }, { "MO", "MO - Missouri" }, { "MP", "MP - Northern Mariana Isls" },
			{ "MS", "MS - Mississippi" }, { "MT", "MT - Montana" }, { "NC", "NC - North Carolina" }, { "ND", "ND - North Dakota" },
			{ "NE", "NE - Nebraska" }, { "NH", "NH - New Hampshire" }, { "NJ", "NJ - New Jersey" }, { "NM", "NM - New Mexico" },
			{ "NV", "NV - Nevada" }, { "NY", "NY - New York" }, { "OH", "OH - Ohio" }, { "OK", "OK - Oklahoma" }, { "OR", "OR - Oregon" },
			{ "PA", "PA - Pennsylvania" }, { "PR", "PR - Puerto Rico" }, { "PW", "PW - Palau" }, { "RI", "RI - Rhode Island" }, 
			{ "SC", "SC - South Carolina" }, { "SD", "SD - South Dakota" }, { "TN", "TN - Tennessee" }, { "TX", "TX - Texas" }, 
			{ "UM", "UM - US Minor Outlying Isls" }, { "UT", "UT - Utah" }, { "VA", "VA - Virginia" }, { "VI", "VI - Virgin Islands" },
			{ "VT", "VT - Vermont" }, { "WA", "WA - Washington" }, { "WI", "WI - Wisconsin" }, { "WV", "WV - West Virginia" }, { "WY", "WY - Wyoming" }
			};

			return createEnumResponseValidator(keyValues);
	}
	
	public ResponseSpecification getAllCityResponseValidator()
	{
		final String[][] keyValues = 
			{ 
				{ "Accord", "Accord" }, { "Acra", "Acra" }, { "Adams", "Adams" }, { "Adams Basin", "Adams Basin" }, { "Adams Center", "Adams Center" }, 
			    { "Addisleigh Park", "Addisleigh Park" }, { "Addison", "Addison" }, { "Adirondack", "Adirondack" }, { "Afton", "Afton" }, { "Airmont", "Airmont" },
			    { "Akron", "Akron" }, { "Akwesasne", "Akwesasne" }, { "Alabama", "Alabama" }, { "Albany", "Albany" }, { "Albertson", "Albertson" }, 
			    { "Albion", "Albion" }, { "Alcove", "Alcove" }, { "Alden", "Alden" }, { "Alden Manor", "Alden Manor" }, { "Alder Creek", "Alder Creek" },
			    { "Alexander", "Alexander" }, { "Alexandria Bay", "Alexandria Bay" }, { "Alfred", "Alfred" }, { "Alfred Station", "Alfred Station" },
			    { "Allegany", "Allegany" }, { "Allentown", "Allentown" }, { "Alma", "Alma" }, { "Almond", "Almond" }, { "Alpine", "Alpine" }, { "Alplaus", "Alplaus" },
			    { "Altamont", "Altamont" }, { "Altmar", "Altmar" }, { "Alton", "Alton" }, { "Altona", "Altona" }, { "Amagansett", "Amagansett" }, { "Amawalk", "Amawalk" },
			    { "Amenia", "Amenia" }, { "Ames", "Ames" }, { "Amherst", "Amherst" }, { "Amity Harbor", "Amity Harbor" }, { "Amityville", "Amityville" }, 
			    { "Amsterdam", "Amsterdam" }, { "Ancram", "Ancram" }, { "Ancramdale", "Ancramdale" }, { "Andes", "Andes" }, { "Andover", "Andover" },
			    { "Angelica", "Angelica" }, { "Angola", "Angola" }, { "Annandale", "Annandale" }, { "Annandale On Hudson", "Annandale On Hudson" }, { "Antwerp", "Antwerp" },
			    { "Apalachin", "Apalachin" }, { "Appleton", "Appleton" }, { "Apulia Station", "Apulia Station" }, { "Aquebogue", "Aquebogue" }, { "Arcade", "Arcade" },
			    { "Arden", "Arden" }, { "Ardsley", "Ardsley" }, { "Ardsley On Hudson", "Ardsley On Hudson" }, { "Argyle", "Argyle" }, { "Arkport", "Arkport" },
			    { "Arkville", "Arkville" }, { "Arlington", "Arlington" }, { "Armonk", "Armonk" }, { "Arverne", "Arverne" }, { "Ashland", "Ashland" }, { "Ashville", "Ashville" },
			    { "Astoria", "Astoria" }, { "Athens", "Athens" }, { "Athol", "Athol" }, { "Athol Springs", "Athol Springs" }, { "Atlanta", "Atlanta" }, 
			    { "Atlantic Beach", "Atlantic Beach" }, { "Attica", "Attica" }, { "Au Sable Chasm", "Au Sable Chasm" }, { "Au Sable Forks", "Au Sable Forks" },
			    { "Auburn", "Auburn" }, { "Auburndale", "Auburndale" }, { "Auriesville", "Auriesville" }, { "Aurora", "Aurora" }, { "Ausable Chasm", "Ausable Chasm" },
			    { "Austerlitz", "Austerlitz" }, { "Ava", "Ava" }, { "Averill Park", "Averill Park" }, { "Avoca", "Avoca" }, { "Avon", "Avon" }, { "Babylon", "Babylon" },
			    { "Bainbridge", "Bainbridge" }, { "Baiting Hollow", "Baiting Hollow" }, { "Bakers Mills", "Bakers Mills" }, { "Baldwin", "Baldwin" },
			    { "Baldwin Place", "Baldwin Place" }, { "Baldwinsville", "Baldwinsville" }, { "Ballston Lake", "Ballston Lake" }, { "Ballston Spa", "Ballston Spa" },
			    { "Balmat", "Balmat" }, { "Bangall", "Bangall" }, { "Bangor", "Bangor" }, { "Bardonia", "Bardonia" }, { "Barker", "Barker" },
			    { "Barnes Corners", "Barnes Corners" }, { "Barneveld", "Barneveld" }, { "Barrytown", "Barrytown" }, { "Barryville", "Barryville" },
			    { "Barton", "Barton" }, { "Basom", "Basom" }, { "Batavia", "Batavia" }, { "Bath", "Bath" }, { "Bay Shore", "Bay Shore" }, { "Bayberry", "Bayberry" },
			    { "Bayport", "Bayport" }, { "Bayside", "Bayside" }, { "Bayside Hills", "Bayside Hills" }, { "Bayville", "Bayville" }, { "Beacon", "Beacon" }, 
			    { "Bear Mountain", "Bear Mountain" }, { "Bearsville", "Bearsville" }, { "Beaver Dams", "Beaver Dams" }, { "Beaver Falls", "Beaver Falls" }, 
			    { "Beaver River", "Beaver River" }, { "Bedford", "Bedford" }, { "Bedford Corners", "Bedford Corners" }, { "Bedford Hills", "Bedford Hills" }, 
			    { "Beechhurst", "Beechhurst" }, { "Belfast", "Belfast" }, { "Belle Harbor", "Belle Harbor" }, { "Bellerose", "Bellerose" }, 
			    { "Bellerose Manor", "Bellerose Manor" }, { "Bellerose Village", "Bellerose Village" }, { "Belleville", "Belleville" }, { "Bellmore", "Bellmore" },
			    { "Bellona", "Bellona" }, { "Bellport", "Bellport" }, { "Bellvale", "Bellvale" }, { "Belmont", "Belmont" }, { "Bemus Point", "Bemus Point" },
			    { "Bergen", "Bergen" }, { "Berkshire", "Berkshire" }, { "Berlin", "Berlin" }, { "Berne", "Berne" }, { "Bernhards Bay", "Bernhards Bay" }, 
			    { "Bethel", "Bethel" }, { "Bethpage", "Bethpage" }, { "Bible School Park", "Bible School Park" }, { "Big Flats", "Big Flats" },
			    { "Big Indian", "Big Indian" }, { "Billings", "Billings" }, { "Binghamton", "Binghamton" }, { "Black Creek", "Black Creek" },
			    { "Black River", "Black River" }, { "Blasdell", "Blasdell" }, { "Blauvelt", "Blauvelt" }, { "Bliss", "Bliss" }, { "Blodgett Mills", "Blodgett Mills" },
			    { "Bloomfield", "Bloomfield" }, { "Blooming Grove", "Blooming Grove" }, { "Bloomingburg", "Bloomingburg" }, { "Bloomingdale", "Bloomingdale" },
			    { "Bloomington", "Bloomington" }, { "Bloomville", "Bloomville" }, { "Blossvale", "Blossvale" }, { "Blue Mountain Lake", "Blue Mountain Lake" },
			    { "Blue Point", "Blue Point" }, { "Bluff Point", "Bluff Point" }, { "Bohemia", "Bohemia" }, { "Boiceville", "Boiceville" }, { "Bolivar", "Bolivar" },
			    { "Bolton Landing", "Bolton Landing" }, { "Bombay", "Bombay" }, { "Boonville", "Boonville" }, { "Boston", "Boston" }, { "Bouckville", "Bouckville" },
			    { "Bovina Center", "Bovina Center" }, { "Bowmansville", "Bowmansville" }, { "Bradford", "Bradford" }, { "Brainard", "Brainard" }, 
			    { "Brainardsville", "Brainardsville" }, { "Branchport", "Branchport" }, { "Brant", "Brant" }, { "Brant Lake", "Brant Lake" },
			    { "Brantingham", "Brantingham" }, { "Brasher Falls", "Brasher Falls" }, { "Breesport", "Breesport" }, { "Breezy Point", "Breezy Point" },
			    { "Brentwood", "Brentwood" }, { "Brewerton", "Brewerton" }, { "Brewster", "Brewster" }, { "Briarcliff", "Briarcliff" }, 
			    { "Briarcliff Manor", "Briarcliff Manor" }, { "Briarwood", "Briarwood" }, { "Bridgehampton", "Bridgehampton" }, { "Bridgeport", "Bridgeport" },
			    { "Bridgewater", "Bridgewater" }, { "Brier Hill", "Brier Hill" }, { "Brighton", "Brighton" }, { "Brightwaters", "Brightwaters" }, { "Brisben", "Brisben" },
			    { "Broad Channel", "Broad Channel" }, { "Broadalbin", "Broadalbin" }, { "Brockport", "Brockport" }, { "Brocton", "Brocton" }, { "Bronx", "Bronx" },
			    { "Bronxville", "Bronxville" }, { "Brookfield", "Brookfield" }, { "Brookhaven", "Brookhaven" }, { "Brooklyn", "Brooklyn" },
			    { "Brooklyn Heights", "Brooklyn Heights" }, { "Brooktondale", "Brooktondale" }, { "Brookview", "Brookview" }, { "Brownville", "Brownville" }, 
			    { "Brushton", "Brushton" }, { "Buchanan", "Buchanan" }, { "Buffalo", "Buffalo" }, { "Bullville", "Bullville" }, { "Burdett", "Burdett" },
			    { "Burke", "Burke" }, { "Burlingham", "Burlingham" }, { "Burlington Flats", "Burlington Flats" }, { "Burnt Hills", "Burnt Hills" }, { "Burt", "Burt" },
			    { "Buskirk", "Buskirk" }, { "Byron", "Byron" }, { "Cadosia", "Cadosia" }, { "Cadyville", "Cadyville" }, { "Cairo", "Cairo" }, { "Calcium", "Calcium" },
			    { "Caledonia", "Caledonia" }, { "Callicoon", "Callicoon" }, { "Callicoon Center", "Callicoon Center" }, { "Calverton", "Calverton" }, 
			    { "Cambria Heights", "Cambria Heights" }, { "Cambridge", "Cambridge" }, { "Camden", "Camden" }, { "Cameron", "Cameron" }, { "Cameron Mills", "Cameron Mills" },
			    { "Camillus", "Camillus" }, { "Campbell", "Campbell" }, { "Campbell Hall", "Campbell Hall" }, { "Canaan", "Canaan" }, { "Canajoharie", "Canajoharie" },
			    { "Canandaigua", "Canandaigua" }, { "Canaseraga", "Canaseraga" }, { "Canastota", "Canastota" }, { "Candor", "Candor" }, { "Caneadea", "Caneadea" },
			    { "Canisteo", "Canisteo" }, { "Canton", "Canton" }, { "Cape Vincent", "Cape Vincent" }, { "Captree Island", "Captree Island" }, 
			    { "Carle Place", "Carle Place" }, { "Carlisle", "Carlisle" }, { "Carmel", "Carmel" }, { "Caroga Lake", "Caroga Lake" }, { "Carthage", "Carthage" },
			    { "Cassadaga", "Cassadaga" }, { "Cassville", "Cassville" }, { "Castile", "Castile" }, { "Castle Creek", "Castle Creek" }, { "Castle Point", "Castle Point" },
			    { "Castleton", "Castleton" }, { "Castleton On Hudson", "Castleton On Hudson" }, { "Castorland", "Castorland" }, { "Cato", "Cato" }, { "Catskill", "Catskill" },
			    { "Cattaraugus", "Cattaraugus" }, { "Cayuga", "Cayuga" }, { "Cayuta", "Cayuta" }, { "Cazenovia", "Cazenovia" }, { "Cedarhurst", "Cedarhurst" },
			    { "Celoron", "Celoron" }, { "Cementon", "Cementon" }, { "Center Moriches", "Center Moriches" }, { "Centereach", "Centereach" }, 
			    { "Centerport", "Centerport" }, { "Centerville", "Centerville" }, { "Central Bridge", "Central Bridge" }, { "Central Islip", "Central Islip" },
			    { "Central Square", "Central Square" }, { "Central Valley", "Central Valley" }, { "Ceres", "Ceres" }, { "Chadwicks", "Chadwicks" },
			    { "Chaffee", "Chaffee" }, { "Champlain", "Champlain" }, { "Chappaqua", "Chappaqua" }, { "Charlotteville", "Charlotteville" }, 
			    { "Charlton", "Charlton" }, { "Chase Mills", "Chase Mills" }, { "Chateaugay", "Chateaugay" }, { "Chatham", "Chatham" }, { "Chaumont", "Chaumont" },
			    { "Chautauqua", "Chautauqua" }, { "Chazy", "Chazy" }, { "Cheektowaga", "Cheektowaga" }, { "Chelsea", "Chelsea" }, { "Chemung", "Chemung" },
			    { "Chenango Bridge", "Chenango Bridge" }, { "Chenango Forks", "Chenango Forks" }, { "Cherry Creek", "Cherry Creek" }, { "Cherry Grove", "Cherry Grove" },
			    { "Cherry Plain", "Cherry Plain" }, { "Cherry Valley", "Cherry Valley" }, { "Chester", "Chester" }, { "Chestertown", "Chestertown" },
			    { "Chestnut Ridge", "Chestnut Ridge" }, { "Chichester", "Chichester" }, { "Childwold", "Childwold" }, { "Chippewa Bay", "Chippewa Bay" },
			    { "Chittenango", "Chittenango" }, { "Churchville", "Churchville" }, { "Churubusco", "Churubusco" }, { "Cicero", "Cicero" }, 
			    { "Cincinnatus", "Cincinnatus" }, { "Circleville", "Circleville" }, { "Clarence", "Clarence" }, { "Clarence Center", "Clarence Center" }, 
			    { "Clarendon", "Clarendon" }, { "Clark Mills", "Clark Mills" }, { "Clarkson", "Clarkson" }, { "Clarksville", "Clarksville" },
			    { "Claryville", "Claryville" }, { "Claverack", "Claverack" }, { "Clay", "Clay" }, { "Clayton", "Clayton" }, { "Clayville", "Clayville" }, 
			    { "Clemons", "Clemons" }, { "Cleveland", "Cleveland" }, { "Cleverdale", "Cleverdale" }, { "Clifton", "Clifton" }, { "Clifton Park", "Clifton Park" },
			    { "Clifton Springs", "Clifton Springs" }, { "Climax", "Climax" }, { "Clinton", "Clinton" }, { "Clinton Corners", "Clinton Corners" }, 
			    { "Clintondale", "Clintondale" }, { "Clintonville", "Clintonville" }, { "Clockville", "Clockville" }, { "Clyde", "Clyde" },
			    { "Clymer", "Clymer" }, { "Cobleskill", "Cobleskill" }, { "Cochecton", "Cochecton" }, { "Cochecton Center", "Cochecton Center" },
			    { "Coeymans", "Coeymans" }, { "Coeymans Hollow", "Coeymans Hollow" }, { "Cohocton", "Cohocton" }, { "Cohoes", "Cohoes" }, { "Cold Brook", "Cold Brook" },
			    { "Cold Spring", "Cold Spring" }, { "Cold Spring Harbor", "Cold Spring Harbor" }, { "Colden", "Colden" }, { "College Point", "College Point" },
			    { "Colliersville", "Colliersville" }, { "Collins", "Collins" }, { "Collins Center", "Collins Center" }, { "Colonie", "Colonie" }, 
			    { "Colton", "Colton" }, { "Columbiaville", "Columbiaville" }, { "Commack", "Commack" }, { "Comstock", "Comstock" }, { "Concord", "Concord" },
			    { "Conesus", "Conesus" }, { "Conewango Valley", "Conewango Valley" }, { "Congers", "Congers" }, { "Conklin", "Conklin" }, { "Connelly", "Connelly" },
			    { "Constable", "Constable" }, { "Constableville", "Constableville" }, { "Constantia", "Constantia" }, { "Coopers Plains", "Coopers Plains" },
			    { "Cooperstown", "Cooperstown" }, { "Copake", "Copake" }, { "Copake Falls", "Copake Falls" }, { "Copenhagen", "Copenhagen" }, { "Copiague", "Copiague" },
			    { "Coram", "Coram" }, { "Corbettsville", "Corbettsville" }, { "Corfu", "Corfu" }, { "Corinth", "Corinth" }, { "Corning", "Corning" }, { "Cornwall", "Cornwall" },
			    { "Cornwall On Hudson", "Cornwall On Hudson" }, { "Cornwallville", "Cornwallville" }, { "Corona", "Corona" }, { "Cortland", "Cortland" }, 
			    { "Cortlandt Manor", "Cortlandt Manor" }, { "Cossayuna", "Cossayuna" }, { "Cottekill", "Cottekill" }, { "Cowlesville", "Cowlesville" },
			    { "Coxsackie", "Coxsackie" }, { "Cragsmoor", "Cragsmoor" }, { "Cranberry Lake", "Cranberry Lake" }, { "Craryville", "Craryville" },
			    { "Crittenden", "Crittenden" }, { "Croghan", "Croghan" }, { "Crompond", "Crompond" }, { "Cropseyville", "Cropseyville" }, { "Cross River", "Cross River" },
			    { "Croton Falls", "Croton Falls" }, { "Croton On Hudson", "Croton On Hudson" }, { "Crown Point", "Crown Point" }, { "Crugers", "Crugers" },
			    { "Cuba", "Cuba" }, { "Cuddebackville", "Cuddebackville" }, { "Cutchogue", "Cutchogue" }, { "Cuyler", "Cuyler" }, { "Dale", "Dale" }, 
			    { "Dalton", "Dalton" }, { "Dannemora", "Dannemora" }, { "Dansville", "Dansville" }, { "Darien Center", "Darien Center" }, 
			    { "Davenport", "Davenport" }, { "Davenport Center", "Davenport Center" }, { "Davis Park", "Davis Park" }, { "Dayton", "Dayton" }, 
			    { "De Peyster", "De Peyster" }, { "De Ruyter", "De Ruyter" }, { "Deansboro", "Deansboro" }, { "Deer Park", "Deer Park" }, 
			    { "Deer River", "Deer River" }, { "Deerfield", "Deerfield" }, { "Deferiet", "Deferiet" }, { "Degrasse", "Degrasse" },
			    { "Dekalb Jct", "Dekalb Jct" }, { "Dekalb Junction", "Dekalb Junction" }, { "Delancey", "Delancey" }, { "Delanson", "Delanson" },
			    { "Delevan", "Delevan" }, { "Delhi", "Delhi" }, { "Delmar", "Delmar" }, { "Delphi Falls", "Delphi Falls" }, { "Denmark", "Denmark" },
			    { "Denver", "Denver" }, { "Depauville", "Depauville" }, { "Depew", "Depew" }, { "Deposit", "Deposit" }, { "Derby", "Derby" }, 
			    { "Dewittville", "Dewittville" }, { "Dexter", "Dexter" }, { "Diamond Point", "Diamond Point" }, { "Dickinson Center", "Dickinson Center" },
			    { "Dix Hills", "Dix Hills" }, { "Dobbs Ferry", "Dobbs Ferry" }, { "Dolgeville", "Dolgeville" }, { "Dormansville", "Dormansville" }, 
			    { "Douglaston", "Douglaston" }, { "Dover Plains", "Dover Plains" }, { "Downsville", "Downsville" }, { "Dresden", "Dresden" }, 
			    { "Dryden", "Dryden" }, { "Duanesburg", "Duanesburg" }, { "Dundee", "Dundee" }, { "Dunkirk", "Dunkirk" }, { "Durham", "Durham" },
			    { "Durhamville", "Durhamville" }, { "Eagle Bay", "Eagle Bay" }, { "Eagle Bridge", "Eagle Bridge" }, { "Eagle Harbor", "Eagle Harbor" },
			    { "Earlton", "Earlton" }, { "Earlville", "Earlville" }, { "East Amherst", "East Amherst" }, { "East Atlantic Beach", "East Atlantic Beach" },
			    { "East Aurora", "East Aurora" }, { "East Berne", "East Berne" }, { "East Bethany", "East Bethany" }, { "East Bloomfield", "East Bloomfield" },
			    { "East Branch", "East Branch" }, { "East Chatham", "East Chatham" }, { "East Concord", "East Concord" }, { "East Durham", "East Durham" },
			    { "East Elmhurst", "East Elmhurst" }, { "East Fishkill", "East Fishkill" }, { "East Freetown", "East Freetown" }, { "East Greenbush", "East Greenbush" },
			    { "East Greenwich", "East Greenwich" }, { "East Hampton", "East Hampton" }, { "East Homer", "East Homer" }, { "East Islip", "East Islip" },
			    { "East Jewett", "East Jewett" }, { "East Marion", "East Marion" }, { "East Meadow", "East Meadow" }, { "East Meredith", "East Meredith" },
			    { "East Moriches", "East Moriches" }, { "East Nassau", "East Nassau" }, { "East Northport", "East Northport" }, { "East Norwich", "East Norwich" },
			    { "East Otto", "East Otto" }, { "East Palmyra", "East Palmyra" }, { "East Patchogue", "East Patchogue" }, { "East Pembroke", "East Pembroke" },
			    { "East Pharsalia", "East Pharsalia" }, { "East Quogue", "East Quogue" }, { "East Randolph", "East Randolph" }, { "East Rochester", "East Rochester" },
			    { "East Rockaway", "East Rockaway" }, { "East Schodack", "East Schodack" }, { "East Setauket", "East Setauket" }, { "East Springfield", "East Springfield" },
			    { "East Syracuse", "East Syracuse" }, { "East Williamson", "East Williamson" }, { "East Williston", "East Williston" }, { "East Windham", "East Windham" },
			    { "East Worcester", "East Worcester" }, { "East Yaphank", "East Yaphank" }, { "Eastchester", "Eastchester" }, { "Eastport", "Eastport" }, { "Eaton", "Eaton" },
			    { "Eddyville", "Eddyville" }, { "Eden", "Eden" }, { "Edgemere", "Edgemere" }, { "Edgewood", "Edgewood" }, { "Edmeston", "Edmeston" }, { "Edwards", "Edwards" },
			    { "Eggertsville", "Eggertsville" }, { "Elba", "Elba" }, { "Elbridge", "Elbridge" }, { "Eldred", "Eldred" }, { "Elizabethtown", "Elizabethtown" },
			    { "Elizaville", "Elizaville" }, { "Elka Park", "Elka Park" }, { "Ellenburg", "Ellenburg" }, { "Ellenburg Center", "Ellenburg Center" },
			    { "Ellenburg Depot", "Ellenburg Depot" }, { "Ellenville", "Ellenville" }, { "Ellicottville", "Ellicottville" }, { "Ellington", "Ellington" },
			    { "Ellisburg", "Ellisburg" }, { "Elma", "Elma" }, { "Elmhurst", "Elmhurst" }, { "Elmira", "Elmira" }, { "Elmira Heights", "Elmira Heights" },
			    { "Elmont", "Elmont" }, { "Elmsford", "Elmsford" }, { "Elwood", "Elwood" }, { "Endicott", "Endicott" }, { "Endwell", "Endwell" },
			    { "Erieville", "Erieville" }, { "Erin", "Erin" }, { "Esopus", "Esopus" }, { "Esperance", "Esperance" }, { "Essex", "Essex" },
			    { "Etna", "Etna" }, { "Evans Mills", "Evans Mills" }, { "Fabius", "Fabius" }, { "Fair Harbor", "Fair Harbor" }, { "Fair Haven",
			    "Fair Haven" }, { "Fairport", "Fairport" }, { "Falconer", "Falconer" }, { "Fallsburg", "Fallsburg" }, { "Fancher", "Fancher" },
			    { "Far Rockaway", "Far Rockaway" }, { "Farmersville Station", "Farmersville Station" }, { "Farmingdale", "Farmingdale" },
			    { "Farmington", "Farmington" }, { "Farmingville", "Farmingville" }, { "Farnham", "Farnham" }, { "Fayette", "Fayette" },
			    { "Fayetteville", "Fayetteville" }, { "Felts Mills", "Felts Mills" }, { "Ferndale", "Ferndale" }, { "Feura Bush", "Feura Bush" },
			    { "Fillmore", "Fillmore" }, { "Findley Lake", "Findley Lake" }, { "Fine", "Fine" }, { "Fineview", "Fineview" }, { "Fire Island Pines", "Fire Island Pines" },
			    { "Fishers", "Fishers" }, { "Fishers Island", "Fishers Island" }, { "Fishers Landing", "Fishers Landing" }, { "Fishkill", "Fishkill" },
			    { "Fishs Eddy", "Fishs Eddy" }, { "Flanders", "Flanders" }, { "Fleetwood", "Fleetwood" }, { "Fleischmanns", "Fleischmanns" }, 
			    { "Floral Park", "Floral Park" }, { "Florida", "Florida" }, { "Flushing", "Flushing" }, { "Fly Creek", "Fly Creek" }, { "Fonda", "Fonda" },
			    { "Forest Hills", "Forest Hills" }, { "Forestburgh", "Forestburgh" }, { "Forestport", "Forestport" }, { "Forestville", "Forestville" },
			    { "Fort Ann", "Fort Ann" }, { "Fort Covington", "Fort Covington" }, { "Fort Drum", "Fort Drum" }, { "Fort Edward", "Fort Edward" },
			    { "Fort Hamilton", "Fort Hamilton" }, { "Fort Hunter", "Fort Hunter" }, { "Fort Jackson", "Fort Jackson" }, { "Fort Johnson", "Fort Johnson" },
			    { "Fort Montgomery", "Fort Montgomery" }, { "Fort Plain", "Fort Plain" }, { "Fort Salonga", "Fort Salonga" }, { "Fort Tilden", "Fort Tilden" },
			    { "Frankfort", "Frankfort" }, { "Franklin", "Franklin" }, { "Franklin Springs", "Franklin Springs" }, { "Franklin Square", "Franklin Square" },
			    { "Franklinville", "Franklinville" }, { "Fredonia", "Fredonia" }, { "Freedom", "Freedom" }, { "Freehold", "Freehold" }, { "Freeport", "Freeport" },
			    { "Freeville", "Freeville" }, { "Fremont Center", "Fremont Center" }, { "Fresh Meadows", "Fresh Meadows" }, { "Frewsburg", "Frewsburg" },
			    { "Friendship", "Friendship" }, { "Frontenac", "Frontenac" }, { "Fulton", "Fulton" }, { "Fultonham", "Fultonham" }, { "Fultonville", "Fultonville" },
			    { "Gabriels", "Gabriels" }, { "Gainesville", "Gainesville" }, { "Gallupville", "Gallupville" }, { "Galway", "Galway" }, { "Gansevoort", "Gansevoort" },
			    { "Garden City", "Garden City" }, { "Garden City Park", "Garden City Park" }, { "Garden City South", "Garden City South" }, { "Gardiner", "Gardiner" },
			    { "Garnerville", "Garnerville" }, { "Garrattsville", "Garrattsville" }, { "Garrison", "Garrison" }, { "Gasport", "Gasport" }, { "Gates", "Gates" },
			    { "Geneseo", "Geneseo" }, { "Geneva", "Geneva" }, { "Genoa", "Genoa" }, { "Georgetown", "Georgetown" }, { "Germantown", "Germantown" }, { "Gerry", "Gerry" },
			    { "Getzville", "Getzville" }, { "Ghent", "Ghent" }, { "Gilbertsville", "Gilbertsville" }, { "Gilboa", "Gilboa" }, { "Gilgo Beach", "Gilgo Beach" },
			    { "Glasco", "Glasco" }, { "Glen Aubrey", "Glen Aubrey" }, { "Glen Cove", "Glen Cove" }, { "Glen Head", "Glen Head" }, { "Glen Oaks", "Glen Oaks" },
			    { "Glen Park", "Glen Park" }, { "Glen Spey", "Glen Spey" }, { "Glen Wild", "Glen Wild" }, { "Glendale", "Glendale" }, { "Glenfield", "Glenfield" },
			    { "Glenford", "Glenford" }, { "Glenham", "Glenham" }, { "Glenmont", "Glenmont" }, { "Glens Falls", "Glens Falls" }, { "Glenville", "Glenville" },
			    { "Glenwood", "Glenwood" }, { "Glenwood Landing", "Glenwood Landing" }, { "Gloversville", "Gloversville" }, { "Godeffroy", "Godeffroy" },
			    { "Goldens Brg", "Goldens Brg" }, { "Goldens Bridge", "Goldens Bridge" }, { "Gorham", "Gorham" }, { "Goshen", "Goshen" }, { "Gouverneur", "Gouverneur" },
			    { "Gowanda", "Gowanda" }, { "Grafton", "Grafton" }, { "Grahamsville", "Grahamsville" }, { "Grand Gorge", "Grand Gorge" },
			    { "Grand Island", "Grand Island" }, { "Grandview On Hudson", "Grandview On Hudson" }, { "Granite Springs", "Granite Springs" },
			    { "Granville", "Granville" }, { "Great Bend", "Great Bend" }, { "Great Neck", "Great Neck" }, { "Great Neck Plaza", "Great Neck Plaza" },
			    { "Great River", "Great River" }, { "Great Valley", "Great Valley" }, { "Greece", "Greece" }, { "Green Island", "Green Island" }, { "Greene", "Greene" },
			    { "Greenfield Center", "Greenfield Center" }, { "Greenfield Park", "Greenfield Park" }, { "Greenhurst", "Greenhurst" }, { "Greenlawn", "Greenlawn" },
			    { "Greenport", "Greenport" }, { "Greenvale", "Greenvale" }, { "Greenville", "Greenville" }, { "Greenwich", "Greenwich" }, { "Greenwood", "Greenwood" },
			    { "Greenwood Lake", "Greenwood Lake" }, { "Greig", "Greig" }, { "Grenell", "Grenell" }, { "Groton", "Groton" }, { "Groveland", "Groveland" },
			    { "Guilderland", "Guilderland" }, { "Guilderland Center", "Guilderland Center" }, { "Guilford", "Guilford" }, { "Hadley", "Hadley" }, { "Hagaman",
			    "Hagaman" }, { "Hague", "Hague" }, { "Hailesboro", "Hailesboro" }, { "Haines Falls", "Haines Falls" }, { "Halcott Center", "Halcott Center" },
			    { "Halcottsville", "Halcottsville" }, { "Halesite", "Halesite" }, { "Halfmoon", "Halfmoon" }, { "Hall", "Hall" }, { "Hamburg", "Hamburg" },
			    { "Hamden", "Hamden" }, { "Hamilton", "Hamilton" }, { "Hamlin", "Hamlin" }, { "Hammond", "Hammond" }, { "Hammondsport", "Hammondsport" },
			    { "Hampton", "Hampton" }, { "Hampton Bays", "Hampton Bays" }, { "Hancock", "Hancock" }, { "Hankins", "Hankins" }, { "Hannacroix", "Hannacroix" },
			    { "Hannawa Falls", "Hannawa Falls" }, { "Hannibal", "Hannibal" }, { "Harford", "Harford" }, { "Harford Mills", "Harford Mills" },
			    { "Harpersfield", "Harpersfield" }, { "Harpursville", "Harpursville" }, { "Harriman", "Harriman" }, { "Harris", "Harris" }, { "Harrison", "Harrison" },
			    { "Harrisville", "Harrisville" }, { "Hartford", "Hartford" }, { "Hartsdale", "Hartsdale" }, { "Hartwick", "Hartwick" },
			    { "Hartwick Seminary", "Hartwick Seminary" }, { "Hastings", "Hastings" }, { "Hastings On Hudson", "Hastings On Hudson" },
			    { "Hauppauge", "Hauppauge" }, { "Haverstraw", "Haverstraw" }, { "Hawthorne", "Hawthorne" }, { "Hayt Corners", "Hayt Corners" },
			    { "Heathcote", "Heathcote" }, { "Hector", "Hector" }, { "Helena", "Helena" }, { "Hemlock", "Hemlock" }, { "Hempstead", "Hempstead" },
			    { "Henderson", "Henderson" }, { "Henderson Harbor", "Henderson Harbor" }, { "Henrietta", "Henrietta" }, { "Hensonville", "Hensonville" },
			    { "Herkimer", "Herkimer" }, { "Hermon", "Hermon" }, { "Heuvelton", "Heuvelton" }, { "Hewlett", "Hewlett" }, { "Hicksville", "Hicksville" },
			    { "High Falls", "High Falls" }, { "Highland", "Highland" }, { "Highland Falls", "Highland Falls" }, { "Highland Lake", "Highland Lake" },
			    { "Highland Mills", "Highland Mills" }, { "Highmount", "Highmount" }, { "Hillburn", "Hillburn" }, { "Hillsdale", "Hillsdale" },
			    { "Hillside Manor", "Hillside Manor" }, { "Hilton", "Hilton" }, { "Himrod", "Himrod" }, { "Hinckley", "Hinckley" }, { "Hinsdale", "Hinsdale" },
			    { "Hobart", "Hobart" }, { "Hoffmeister", "Hoffmeister" }, { "Hofstra University", "Hofstra University" }, { "Hogansburg", "Hogansburg" },
			    { "Holbrook", "Holbrook" }, { "Holland", "Holland" }, { "Holland Patent", "Holland Patent" }, { "Holley", "Holley" }, { "Hollis", "Hollis" },
			    { "Hollis Hills", "Hollis Hills" }, { "Hollowville", "Hollowville" }, { "Holmes", "Holmes" }, { "Holtsville", "Holtsville" }, { "Homer", "Homer" },
			    { "Honeoye", "Honeoye" }, { "Honeoye Falls", "Honeoye Falls" }, { "Hoosick", "Hoosick" }, { "Hoosick Falls", "Hoosick Falls" }, { "Hopewell", "Hopewell" },
			    { "Hopewell Junction", "Hopewell Junction" }, { "Hopkinton", "Hopkinton" }, { "Hornell", "Hornell" }, { "Horseheads", "Horseheads" },
			    { "Hortonville", "Hortonville" }, { "Houghton", "Houghton" }, { "Howard Beach", "Howard Beach" }, { "Howells", "Howells" },
			    { "Howes Cave", "Howes Cave" }, { "Hubbardsville", "Hubbardsville" }, { "Hudson", "Hudson" }, { "Hudson Falls", "Hudson Falls" },
			    { "Hughsonville", "Hughsonville" }, { "Huguenot", "Huguenot" }, { "Hulberton", "Hulberton" }, { "Huletts Landing", "Huletts Landing" },
			    { "Hume", "Hume" }, { "Hunt", "Hunt" }, { "Hunter", "Hunter" }, { "Huntington", "Huntington" }, { "Huntington Station", "Huntington Station" },
			    { "Hurley", "Hurley" }, { "Hurleyville", "Hurleyville" }, { "Hyde Park", "Hyde Park" }, { "Ilion", "Ilion" }, { "Indian Lake", "Indian Lake" },
			    { "Industry", "Industry" }, { "Inlet", "Inlet" }, { "Interlaken", "Interlaken" }, { "Inwood", "Inwood" }, { "Ionia", "Ionia" }, { "Irondequoit",
			    "Irondequoit" }, { "Irving", "Irving" }, { "Irvington", "Irvington" }, { "Ischua", "Ischua" }, { "Island Park", "Island Park" }, { "Islandia", "Islandia" },
			    { "Islip", "Islip" }, { "Islip Terrace", "Islip Terrace" }, { "Ithaca", "Ithaca" }, { "Jackson Heights", "Jackson Heights" }, { "Jacksonville", "Jacksonville" },
			    { "Jamaica", "Jamaica" }, { "Jamesport", "Jamesport" }, { "Jamestown", "Jamestown" }, { "Jamesville", "Jamesville" }, { "Jasper", "Jasper" },
			    { "Java Center", "Java Center" }, { "Java Village", "Java Village" }, { "Jay", "Jay" }, { "Jefferson", "Jefferson" },
			    { "Jefferson Valley", "Jefferson Valley" }, { "Jeffersonville", "Jeffersonville" }, { "Jericho", "Jericho" }, { "Jewett", "Jewett" },
			    { "Jfk Airport", "Jfk Airport" }, { "John F Kennedy Airport", "John F Kennedy Airport" }, { "Johnsburg", "Johnsburg" }, { "Johnson", "Johnson" },
			    { "Johnson City", "Johnson City" }, { "Johnsonville", "Johnsonville" }, { "Johnstown", "Johnstown" }, { "Jordan", "Jordan" }, { "Jordanville", "Jordanville" },
			    { "Kanona", "Kanona" }, { "Kaser", "Kaser" }, { "Katonah", "Katonah" }, { "Kattskill Bay", "Kattskill Bay" }, { "Kauneonga Lake", "Kauneonga Lake" },
			    { "Keene", "Keene" }, { "Keene Valley", "Keene Valley" }, { "Keeseville", "Keeseville" }, { "Kendall", "Kendall" }, { "Kenmore", "Kenmore" },
			    { "Kennedy", "Kennedy" }, { "Kenoza Lake", "Kenoza Lake" }, { "Kent", "Kent" }, { "Kent Cliffs", "Kent Cliffs" }, { "Kent Lakes", "Kent Lakes" },
			    { "Kerhonkson", "Kerhonkson" }, { "Keuka Park", "Keuka Park" }, { "Kew Gardens", "Kew Gardens" }, { "Kew Gardens Hills", "Kew Gardens Hills" },
			    { "Kiamesha Lake", "Kiamesha Lake" }, { "Kill Buck", "Kill Buck" }, { "Killawog", "Killawog" }, { "Kinderhook", "Kinderhook" },
			    { "King Ferry", "King Ferry" }, { "Kings Park", "Kings Park" }, { "Kings Point", "Kings Point" }, { "Kingston", "Kingston" }, { "Kirkville", "Kirkville" },
			    { "Kirkwood", "Kirkwood" }, { "Kiryas Joel", "Kiryas Joel" }, { "Kismet", "Kismet" }, { "Knapp Creek", "Knapp Creek" }, { "Knowlesville", "Knowlesville" },
			    { "Knox", "Knox" }, { "Knoxboro", "Knoxboro" }, { "Krumville", "Krumville" }, { "La Fargeville", "La Fargeville" }, { "La Fayette", "La Fayette" },
			    { "La Guardia Airport", "La Guardia Airport" }, { "Lackawanna", "Lackawanna" }, { "Lacona", "Lacona" }, { "Lagrangeville", "Lagrangeville" },
			    { "Lake Clear", "Lake Clear" }, { "Lake George", "Lake George" }, { "Lake Grove", "Lake Grove" }, { "Lake Hill", "Lake Hill" },
			    { "Lake Huntington", "Lake Huntington" }, { "Lake Katrine", "Lake Katrine" }, { "Lake Lincolndale", "Lake Lincolndale" }, { "Lake Luzerne", "Lake Luzerne" },
			    { "Lake Peekskill", "Lake Peekskill" }, { "Lake Placid", "Lake Placid" }, { "Lake Pleasant", "Lake Pleasant" }, { "Lake Ronkonkoma", "Lake Ronkonkoma" },
			    { "Lake Success", "Lake Success" }, { "Lake View", "Lake View" }, { "Lakemont", "Lakemont" }, { "Lakeville", "Lakeville" }, { "Lakewood", "Lakewood" },
			    { "Lancaster", "Lancaster" }, { "Lanesville", "Lanesville" }, { "Lansing", "Lansing" }, { "Larchmont", "Larchmont" }, { "Latham", "Latham" },
			    { "Laurel", "Laurel" }, { "Laurelton", "Laurelton" }, { "Laurens", "Laurens" }, { "Lawrence", "Lawrence" }, { "Lawrenceville", "Lawrenceville" },
			    { "Lawtons", "Lawtons" }, { "Lawyersville", "Lawyersville" }, { "Le Roy", "Le Roy" }, { "Lebanon", "Lebanon" }, { "Lebanon Springs", "Lebanon Springs" },
			    { "Lee Center", "Lee Center" }, { "Leeds", "Leeds" }, { "Leicester", "Leicester" }, { "Leon", "Leon" }, { "Leonardsville", "Leonardsville" },
			    { "Levittown", "Levittown" }, { "Lew Beach", "Lew Beach" }, { "Lewis", "Lewis" }, { "Lewiston", "Lewiston" }, { "Lexington", "Lexington" }, 
			    { "Liberty", "Liberty" }, { "Lido Beach", "Lido Beach" }, { "Lily Dale", "Lily Dale" }, { "Lima", "Lima" }, { "Limerick", "Limerick" },
			    { "Limestone", "Limestone" }, { "Lincolndale", "Lincolndale" }, { "Lindenhurst", "Lindenhurst" }, { "Lindley", "Lindley" }, { "Linwood", "Linwood" },
			    { "Lisbon", "Lisbon" }, { "Lisle", "Lisle" }, { "Little Falls", "Little Falls" }, { "Little Genesee", "Little Genesee" }, { "Little Neck", "Little Neck" },
			    { "Little Valley", "Little Valley" }, { "Little York", "Little York" }, { "Liverpool", "Liverpool" }, { "Livingston", "Livingston" }, 
			    { "Livingston Manor", "Livingston Manor" }, { "Livonia", "Livonia" }, { "Livonia Center", "Livonia Center" }, { "Lloyd Harbor", "Lloyd Harbor" },
			    { "Loch Sheldrake", "Loch Sheldrake" }, { "Locke", "Locke" }, { "Lockport", "Lockport" }, { "Lockwood", "Lockwood" }, { "Locust Valley", "Locust Valley" },
			    { "Lodi", "Lodi" }, { "Loehmanns Plaza", "Loehmanns Plaza" }, { "Long Beach", "Long Beach" }, { "Long Eddy", "Long Eddy" }, 
			    { "Long Island City", "Long Island City" }, { "Long Lake", "Long Lake" }, { "Loon Lake", "Loon Lake" }, { "Lorraine", "Lorraine" },
			    { "Loudonville", "Loudonville" }, { "Lowman", "Lowman" }, { "Lowville", "Lowville" }, { "Lycoming", "Lycoming" }, { "Lynbrook", "Lynbrook" }, 
			    { "Lyndonville", "Lyndonville" }, { "Lyon Mountain", "Lyon Mountain" }, { "Lyons", "Lyons" }, { "Lyons Falls", "Lyons Falls" }, { "Lysander", "Lysander" },
			    { "Mac Dougall", "Mac Dougall" }, { "Macedon", "Macedon" }, { "Machias", "Machias" }, { "Madison", "Madison" }, { "Madrid", "Madrid" }, { "Mahopac", "Mahopac" },
			    { "Mahopac Falls", "Mahopac Falls" }, { "Maine", "Maine" }, { "Malba", "Malba" }, { "Malden Bridge", "Malden Bridge" }, { "Malden Hudson", "Malden Hudson" },
			    { "Malden On Hudson", "Malden On Hudson" }, { "Mallory", "Mallory" }, { "Malone", "Malone" }, { "Malta", "Malta" }, { "Malverne", "Malverne" },
			    { "Mamaroneck", "Mamaroneck" }, { "Manchester", "Manchester" }, { "Manhasset", "Manhasset" }, { "Manhasset Hills", "Manhasset Hills" },
			    { "Manlius", "Manlius" }, { "Mannsville", "Mannsville" }, { "Manorville", "Manorville" }, { "Maple Springs", "Maple Springs" }, 
			    { "Maple View", "Maple View" }, { "Maplecrest", "Maplecrest" }, { "Marathon", "Marathon" }, { "Marcellus", "Marcellus" }, { "Marcy", "Marcy" },
			    { "Margaretville", "Margaretville" }, { "Marietta", "Marietta" }, { "Marilla", "Marilla" }, { "Marion", "Marion" }, { "Marlboro", "Marlboro" },
			    { "Martinsburg", "Martinsburg" }, { "Martville", "Martville" }, { "Maryknoll", "Maryknoll" }, { "Maryland", "Maryland" }, { "Masonville", "Masonville" },
			    { "Maspeth", "Maspeth" }, { "Massapequa", "Massapequa" }, { "Massapequa Park", "Massapequa Park" }, { "Massawepie", "Massawepie" },
			    { "Massena", "Massena" }, { "Mastic", "Mastic" }, { "Mastic Beach", "Mastic Beach" }, { "Mattituck", "Mattituck" }, { "Mattydale", "Mattydale" },
			    { "Maybrook", "Maybrook" }, { "Mayfield", "Mayfield" }, { "Mayville", "Mayville" }, { "Mcconnellsville", "Mcconnellsville" }, { "Mcdonough", "Mcdonough" },
			    { "Mcgraw", "Mcgraw" }, { "Mclean", "Mclean" }, { "Meacham", "Meacham" }, { "Mechanicville", "Mechanicville" }, { "Mecklenburg", "Mecklenburg" },
			    { "Medford", "Medford" }, { "Medina", "Medina" }, { "Medusa", "Medusa" }, { "Mellenville", "Mellenville" }, { "Melrose", "Melrose" },
			    { "Melville", "Melville" }, { "Memphis", "Memphis" }, { "Menands", "Menands" }, { "Mendon", "Mendon" }, { "Meredith", "Meredith" },
			    { "Meridale", "Meridale" }, { "Meridian", "Meridian" }, { "Merrick", "Merrick" }, { "Merrill", "Merrill" }, { "Mexico", "Mexico" },
			    { "Mid Hudson", "Mid Hudson" }, { "Middle Falls", "Middle Falls" }, { "Middle Granville", "Middle Granville" }, { "Middle Grove", "Middle Grove" },
			    { "Middle Island", "Middle Island" }, { "Middle Village", "Middle Village" }, { "Middleburgh", "Middleburgh" }, { "Middleport", "Middleport" },
			    { "Middlesex", "Middlesex" }, { "Middletown", "Middletown" }, { "Middleville", "Middleville" }, { "Milan", "Milan" }, { "Milford", "Milford" },
			    { "Mill Neck", "Mill Neck" }, { "Millbrook", "Millbrook" }, { "Miller Place", "Miller Place" }, { "Millerton", "Millerton" }, { "Millport", "Millport" },
			    { "Millwood", "Millwood" }, { "Milton", "Milton" }, { "Mineola", "Mineola" }, { "Minerva", "Minerva" }, { "Minetto", "Minetto" }, 
			    { "Mineville", "Mineville" }, { "Minoa", "Minoa" }, { "Model City", "Model City" }, { "Modena", "Modena" }, { "Mohawk", "Mohawk" },
			    { "Mohegan Lake", "Mohegan Lake" }, { "Moira", "Moira" }, { "Mongaup Valley", "Mongaup Valley" }, { "Monroe", "Monroe" }, 
			    { "Monsey", "Monsey" }, { "Montauk", "Montauk" }, { "Montebello", "Montebello" }, { "Montezuma", "Montezuma" }, { "Montgomery", "Montgomery" }, 
			    { "Monticello", "Monticello" }, { "Montour Falls", "Montour Falls" }, { "Montrose", "Montrose" }, { "Mooers", "Mooers" }, { "Mooers Forks", "Mooers Forks" },
			    { "Moravia", "Moravia" }, { "Moriah", "Moriah" }, { "Moriah Center", "Moriah Center" }, { "Moriches", "Moriches" }, { "Morris", "Morris" },
			    { "Morrisonville", "Morrisonville" }, { "Morristown", "Morristown" }, { "Morrisville", "Morrisville" }, { "Morton", "Morton" },
			    { "Mottville", "Mottville" }, { "Mount Kisco", "Mount Kisco" }, { "Mount Marion", "Mount Marion" }, { "Mount Morris", "Mount Morris" },
			    { "Mount Sinai", "Mount Sinai" }, { "Mount Tremper", "Mount Tremper" }, { "Mount Upton", "Mount Upton" }, { "Mount Vernon", "Mount Vernon" },
			    { "Mount Vision", "Mount Vision" }, { "Mountain Dale", "Mountain Dale" }, { "Mountainville", "Mountainville" }, { "Mumford", "Mumford" },
			    { "Munnsville", "Munnsville" }, { "Murray Isle", "Murray Isle" }, { "Nanuet", "Nanuet" }, { "Napanoch", "Napanoch" }, { "Naples", "Naples" },
			    { "Narrowsburg", "Narrowsburg" }, { "Nassau", "Nassau" }, { "Natural Bridge", "Natural Bridge" }, { "Nedrow", "Nedrow" }, { "Nelliston", "Nelliston" },
			    { "Nelsonville", "Nelsonville" }, { "Neponsit", "Neponsit" }, { "Nesconset", "Nesconset" }, { "Neversink", "Neversink" },
			    { "New Baltimore", "New Baltimore" }, { "New Berlin", "New Berlin" }, { "New City", "New City" }, { "New Hamburg", "New Hamburg" },
			    { "New Hampton", "New Hampton" }, { "New Hartford", "New Hartford" }, { "New Haven", "New Haven" }, { "New Hyde Park", "New Hyde Park" },
			    { "New Kingston", "New Kingston" }, { "New Lebanon", "New Lebanon" }, { "New Lisbon", "New Lisbon" }, { "New Milford", "New Milford" }, 
			    { "New Paltz", "New Paltz" }, { "New Rochelle", "New Rochelle" }, { "New Russia", "New Russia" }, { "New Square", "New Square" },
			    { "New Suffolk", "New Suffolk" }, { "New Windsor", "New Windsor" }, { "New Woodstock", "New Woodstock" }, { "New York", "New York" },
			    { "New York Mills", "New York Mills" }, { "Newark", "Newark" }, { "Newark Valley", "Newark Valley" }, { "Newburgh", "Newburgh" }, 
			    { "Newcomb", "Newcomb" }, { "Newfane", "Newfane" }, { "Newfield", "Newfield" }, { "Newport", "Newport" }, { "Newton Falls", "Newton Falls" },
			    { "Newtonville", "Newtonville" }, { "Niagara Falls", "Niagara Falls" }, { "Niagara University", "Niagara University" }, { "Nichols", "Nichols" },
			    { "Nicholville", "Nicholville" }, { "Nineveh", "Nineveh" }, { "Niobe", "Niobe" }, { "Niskayuna", "Niskayuna" }, { "Niverville", "Niverville" },
			    { "Norfolk", "Norfolk" }, { "North Babylon", "North Babylon" }, { "North Baldwin", "North Baldwin" }, { "North Bangor", "North Bangor" },
			    { "North Bay", "North Bay" }, { "North Bellmore", "North Bellmore" }, { "North Blenheim", "North Blenheim" }, { "North Boston", "North Boston" },
			    { "North Branch", "North Branch" }, { "North Brookfield", "North Brookfield" }, { "North Castle", "North Castle" }, { "North Chatham", "North Chatham" },
			    { "North Chili", "North Chili" }, { "North Cohocton", "North Cohocton" }, { "North Collins", "North Collins" }, { "North Creek", "North Creek" },
			    { "North Evans", "North Evans" }, { "North Granville", "North Granville" }, { "North Greece", "North Greece" }, { "North Hills", "North Hills" }, 
			    { "North Hoosick", "North Hoosick" }, { "North Hornell", "North Hornell" }, { "North Hudson", "North Hudson" }, { "North Java", "North Java" },
			    { "North Lawrence", "North Lawrence" }, { "North Massapequa", "North Massapequa" }, { "North Merrick", "North Merrick" }, 
			    { "North New Hyde Park", "North New Hyde Park" }, { "North Norwich", "North Norwich" }, { "North Pitcher", "North Pitcher" },
			    { "North River", "North River" }, { "North Rose", "North Rose" }, { "North Salem", "North Salem" }, { "North Syracuse", "North Syracuse" },
			    { "North Tarrytown", "North Tarrytown" }, { "North Tonawanda", "North Tonawanda" }, { "Northport", "Northport" }, { "Northville", "Northville" },
			    { "Norton Hill", "Norton Hill" }, { "Norwich", "Norwich" }, { "Norwood", "Norwood" }, { "Nunda", "Nunda" }, { "Nyack", "Nyack" }, 
			    { "Oak Beach", "Oak Beach" }, { "Oak Hill", "Oak Hill" }, { "Oak Island", "Oak Island" }, { "Oakdale", "Oakdale" },
			    { "Oakfield", "Oakfield" }, { "Oakland Gardens", "Oakland Gardens" }, { "Oaks Corners", "Oaks Corners" }, { "Obernburg", "Obernburg" }, 
			    { "Ocean Beach", "Ocean Beach" }, { "Oceanside", "Oceanside" }, { "Odessa", "Odessa" }, { "Ogdensburg", "Ogdensburg" }, { "Ohio", "Ohio" },
			    { "Olcott", "Olcott" }, { "Old Bethpage", "Old Bethpage" }, { "Old Chatham", "Old Chatham" }, { "Old Forge", "Old Forge" }, { "Old Westbury", "Old Westbury" },
			    { "Olean", "Olean" }, { "Olivebridge", "Olivebridge" }, { "Oliverea", "Oliverea" }, { "Olmstedville", "Olmstedville" }, 
			    { "Onchiota", "Onchiota" }, { "Oneida", "Oneida" }, { "Oneonta", "Oneonta" }, { "Ontario", "Ontario" }, { "Ontario Center", "Ontario Center" },
			    { "Orangeburg", "Orangeburg" }, { "Orchard Park", "Orchard Park" }, { "Orient", "Orient" }, { "Oriskany", "Oriskany" }, { "Oriskany Falls", "Oriskany Falls" },
			    { "Orwell", "Orwell" }, { "Ossining", "Ossining" }, { "Oswegatchie", "Oswegatchie" }, { "Oswego", "Oswego" }, { "Otego", "Otego" },
			    { "Otisville", "Otisville" }, { "Otto", "Otto" }, { "Ouaquaga", "Ouaquaga" }, { "Ovid", "Ovid" }, { "Owasco", "Owasco" },
			    { "Owego", "Owego" }, { "Owls Head", "Owls Head" }, { "Oxbow", "Oxbow" }, { "Oxford", "Oxford" }, { "Oyster Bay", "Oyster Bay" }, 
			    { "Ozone Park", "Ozone Park" }, { "Painted Post", "Painted Post" }, { "Palatine Bridge", "Palatine Bridge" }, { "Palenville", "Palenville" },
			    { "Palisades", "Palisades" }, { "Palmyra", "Palmyra" }, { "Panama", "Panama" }, { "Panorama", "Panorama" }, { "Paradox", "Paradox" },
			    { "Paris", "Paris" }, { "Parish", "Parish" }, { "Parishville", "Parishville" }, { "Parksville", "Parksville" }, { "Patchogue", "Patchogue" },
			    { "Patterson", "Patterson" }, { "Pattersonville", "Pattersonville" }, { "Paul Smiths", "Paul Smiths" }, { "Pavilion", "Pavilion" }, 
			    { "Pawling", "Pawling" }, { "Pearl River", "Pearl River" }, { "Peconic", "Peconic" }, { "Peekskill", "Peekskill" }, { "Pelham", "Pelham" },
			    { "Penfield", "Penfield" }, { "Penn Yan", "Penn Yan" }, { "Pennellville", "Pennellville" }, { "Perkinsville", "Perkinsville" }, { "Perry", "Perry" },
			    { "Perrysburg", "Perrysburg" }, { "Perryville", "Perryville" }, { "Peru", "Peru" }, { "Peterboro", "Peterboro" }, { "Petersburg", "Petersburg" },
			    { "Petersburgh", "Petersburgh" }, { "Phelps", "Phelps" }, { "Philadelphia", "Philadelphia" }, { "Phillipsport", "Phillipsport" }, { "Philmont", "Philmont" },
			    { "Phoenicia", "Phoenicia" }, { "Phoenix", "Phoenix" }, { "Piercefield", "Piercefield" }, { "Piermont", "Piermont" }, 
			    { "Pierrepont Manor", "Pierrepont Manor" }, { "Piffard", "Piffard" }, { "Pike", "Pike" }, { "Pilot Knob", "Pilot Knob" }, 
			    { "Pine Bush", "Pine Bush" }, { "Pine City", "Pine City" }, { "Pine Hill", "Pine Hill" }, { "Pine Island", "Pine Island" }, 
			    { "Pine Plains", "Pine Plains" }, { "Pine Valley", "Pine Valley" }, { "Piseco", "Piseco" }, { "Pitcher", "Pitcher" }, 
			    { "Pittsford", "Pittsford" }, { "Plainview", "Plainview" }, { "Plainville", "Plainville" }, { "Plandome", "Plandome" }, 
			    { "Plattekill", "Plattekill" }, { "Plattsburgh", "Plattsburgh" }, { "Pleasant Valley", "Pleasant Valley" }, { "Pleasantville", "Pleasantville" },
			    { "Plessis", "Plessis" }, { "Plymouth", "Plymouth" }, { "Poestenkill", "Poestenkill" }, { "Point Lookout", "Point Lookout" }, 
			    { "Point O Woods", "Point O Woods" }, { "Point Vivian", "Point Vivian" }, { "Poland", "Poland" }, { "Pomona", "Pomona" }, 
			    { "Pompey", "Pompey" }, { "Pond Eddy", "Pond Eddy" }, { "Poolville", "Poolville" }, { "Poplar Ridge", "Poplar Ridge" },
			    { "Port Byron", "Port Byron" }, { "Port Chester", "Port Chester" }, { "Port Crane", "Port Crane" }, { "Port Ewen", "Port Ewen" }, 
			    { "Port Gibson", "Port Gibson" }, { "Port Henry", "Port Henry" }, { "Port Jefferson", "Port Jefferson" }, 
			    { "Port Jefferson Station", "Port Jefferson Station" }, { "Port Jervis", "Port Jervis" }, { "Port Kent", "Port Kent" },
			    { "Port Leyden", "Port Leyden" }, { "Port Washington", "Port Washington" }, { "Portageville", "Portageville" }, { "Porter Corners", "Porter Corners" },
			    { "Portland", "Portland" }, { "Portlandville", "Portlandville" }, { "Portville", "Portville" }, { "Potsdam", "Potsdam" }, { "Pottersville", "Pottersville" },
			    { "Poughkeepsie", "Poughkeepsie" }, { "Poughquag", "Poughquag" }, { "Pound Ridge", "Pound Ridge" }, { "Pratts Hollow", "Pratts Hollow" }, 
			    { "Prattsburgh", "Prattsburgh" }, { "Prattsville", "Prattsville" }, { "Preble", "Preble" }, { "Preston Hollow", "Preston Hollow" },
			    { "Prospect", "Prospect" }, { "Pulaski", "Pulaski" }, { "Pulteney", "Pulteney" }, { "Pultneyville", "Pultneyville" }, { "Purchase", "Purchase" },
			    { "Purdys", "Purdys" }, { "Purling", "Purling" }, { "Putnam Station", "Putnam Station" }, { "Putnam Valley", "Putnam Valley" },
			    { "Pyrites", "Pyrites" }, { "Quaker Street", "Quaker Street" }, { "Queens Village", "Queens Village" }, { "Queensbury", "Queensbury" },
			    { "Quogue", "Quogue" }, { "Rainbow Lake", "Rainbow Lake" }, { "Randolph", "Randolph" }, { "Ransomville", "Ransomville" },
			    { "Raquette Lake", "Raquette Lake" }, { "Ravena", "Ravena" }, { "Ray Brook", "Ray Brook" }, { "Raymondville", "Raymondville" },
			    { "Reading Center", "Reading Center" }, { "Red Creek", "Red Creek" }, { "Red Hook", "Red Hook" }, { "Redfield", "Redfield" },
			    { "Redford", "Redford" }, { "Redwood", "Redwood" }, { "Rego Park", "Rego Park" }, { "Remsen", "Remsen" }, { "Remsenburg", "Remsenburg" },
			    { "Rensselaer", "Rensselaer" }, { "Rensselaer Falls", "Rensselaer Falls" }, { "Rensselaerville", "Rensselaerville" }, { "Retsof", "Retsof" },
			    { "Rexford", "Rexford" }, { "Rexville", "Rexville" }, { "Rhinebeck", "Rhinebeck" }, { "Rhinecliff", "Rhinecliff" }, { "Richburg", "Richburg" },
			    { "Richfield Springs", "Richfield Springs" }, { "Richford", "Richford" }, { "Richland", "Richland" }, { "Richmond Hill", "Richmond Hill" },
			    { "Richmondville", "Richmondville" }, { "Richville", "Richville" }, { "Ridge", "Ridge" }, { "Ridgemont", "Ridgemont" }, { "Ridgewood", "Ridgewood" },
			    { "Rifton", "Rifton" }, { "Riparius", "Riparius" }, { "Ripley", "Ripley" }, { "Riverhead", "Riverhead" }, { "Rochdale Village", "Rochdale Village" },
			    { "Rochester", "Rochester" }, { "Rock City Falls", "Rock City Falls" }, { "Rock Glen", "Rock Glen" }, { "Rock Hill", "Rock Hill" },
			    { "Rock Stream", "Rock Stream" }, { "Rock Tavern", "Rock Tavern" }, { "Rockaway Beach", "Rockaway Beach" }, { "Rockaway Park", "Rockaway Park" },
			    { "Rockaway Point", "Rockaway Point" }, { "Rockville Centre", "Rockville Centre" }, { "Rocky Point", "Rocky Point" }, { "Rodman", "Rodman" },
			    { "Roessleville", "Roessleville" }, { "Rome", "Rome" }, { "Romulus", "Romulus" }, { "Ronkonkoma", "Ronkonkoma" }, { "Roosevelt", "Roosevelt" },
			    { "Roosevelt Island", "Roosevelt Island" }, { "Rooseveltown", "Rooseveltown" }, { "Roscoe", "Roscoe" }, { "Rose", "Rose" }, { "Roseboom", "Roseboom" },
			    { "Rosedale", "Rosedale" }, { "Rosendale", "Rosendale" }, { "Roslyn", "Roslyn" }, { "Roslyn Heights", "Roslyn Heights" }, { "Rossburg", "Rossburg" },
			    { "Rotterdam", "Rotterdam" }, { "Rotterdam Junction", "Rotterdam Junction" }, { "Round Lake", "Round Lake" }, { "Round Top", "Round Top" },
			    { "Rouses Point", "Rouses Point" }, { "Roxbury", "Roxbury" }, { "Ruby", "Ruby" }, { "Rush", "Rush" }, { "Rushford", "Rushford" },
			    { "Rushville", "Rushville" }, { "Russell", "Russell" }, { "Rye", "Rye" }, { "Rye Brook", "Rye Brook" }, { "Sabael", "Sabael" },
			    { "Sackets Harbor", "Sackets Harbor" }, { "Sag Harbor", "Sag Harbor" }, { "Sagaponack", "Sagaponack" }, { "Saint Albans", "Saint Albans" },
			    { "Saint Bonaventure", "Saint Bonaventure" }, { "Saint Huberts", "Saint Huberts" }, { "Saint James", "Saint James" }, 
			    { "Saint Johnsville", "Saint Johnsville" }, { "Saint Regis Falls", "Saint Regis Falls" }, { "Saint Remy", "Saint Remy" }, 
			    { "Salamanca", "Salamanca" }, { "Salem", "Salem" }, { "Salisbury Center", "Salisbury Center" }, { "Salisbury Mills", "Salisbury Mills" },
			    { "Salt Point", "Salt Point" }, { "Saltaire", "Saltaire" }, { "Sanborn", "Sanborn" }, { "Sand Lake", "Sand Lake" }, { "Sands Point", "Sands Point" },
			    { "Sandusky", "Sandusky" }, { "Sandy Creek", "Sandy Creek" }, { "Sangerfield", "Sangerfield" }, { "Sanitaria Springs", "Sanitaria Springs" },
			    { "Saranac", "Saranac" }, { "Saranac Lake", "Saranac Lake" }, { "Saratoga Springs", "Saratoga Springs" }, { "Sardinia", "Sardinia" }, 
			    { "Saugerties", "Saugerties" }, { "Sauquoit", "Sauquoit" }, { "Savannah", "Savannah" }, { "Savona", "Savona" }, { "Sayville", "Sayville" },
			    { "Scarborough", "Scarborough" }, { "Scarsdale", "Scarsdale" }, { "Schaghticoke", "Schaghticoke" }, { "Schenectady", "Schenectady" }, 
			    { "Schenevus", "Schenevus" }, { "Schodack Landing", "Schodack Landing" }, { "Schoharie", "Schoharie" }, { "Schroon Lake", "Schroon Lake" },
			    { "Schuyler", "Schuyler" }, { "Schuyler Falls", "Schuyler Falls" }, { "Schuyler Lake", "Schuyler Lake" }, { "Schuylerville", "Schuylerville" },
			    { "Scio", "Scio" }, { "Scipio Center", "Scipio Center" }, { "Scotchtown", "Scotchtown" }, { "Scotia", "Scotia" }, { "Scottsburg", "Scottsburg" },
			    { "Scottsville", "Scottsville" }, { "Sea Cliff", "Sea Cliff" }, { "Seaford", "Seaford" }, { "Selden", "Selden" }, { "Selkirk", "Selkirk" },
			    { "Seneca Castle", "Seneca Castle" }, { "Seneca Falls", "Seneca Falls" }, { "Setauket", "Setauket" }, { "Severance", "Severance" }, { "Shady", "Shady" },
			    { "Shandaken", "Shandaken" }, { "Sharon Springs", "Sharon Springs" }, { "Shelter Island", "Shelter Island" }, 
			    { "Shelter Island Heights", "Shelter Island Heights" }, { "Shenorock", "Shenorock" }, { "Sherburne", "Sherburne" }, { "Sheridan", "Sheridan" },
			    { "Sherman", "Sherman" }, { "Sherrill", "Sherrill" }, { "Shinhopple", "Shinhopple" }, { "Shirley", "Shirley" }, { "Shokan", "Shokan" },
			    { "Shoreham", "Shoreham" }, { "Shortsville", "Shortsville" }, { "Shrub Oak", "Shrub Oak" }, { "Shushan", "Shushan" }, { "Sidney", "Sidney" },
			    { "Sidney Center", "Sidney Center" }, { "Siena", "Siena" }, { "Silver Bay", "Silver Bay" }, { "Silver Creek", "Silver Creek" },
			    { "Silver Lake", "Silver Lake" }, { "Silver Springs", "Silver Springs" }, { "Sinclairville", "Sinclairville" }, { "Skaneateles", "Skaneateles" },
			    { "Skaneateles Falls", "Skaneateles Falls" }, { "Slate Hill", "Slate Hill" }, { "Slaterville Springs", "Slaterville Springs" },
			    { "Sleepy Hollow", "Sleepy Hollow" }, { "Slingerlands", "Slingerlands" }, { "Sloan", "Sloan" }, { "Sloansville", "Sloansville" }, 
			    { "Sloatsburg", "Sloatsburg" }, { "Smallwood", "Smallwood" }, { "Smith Point", "Smith Point" }, { "Smithboro", "Smithboro" }, 
			    { "Smithtown", "Smithtown" }, { "Smithville", "Smithville" }, { "Smithville Flats", "Smithville Flats" }, { "Smyrna", "Smyrna" }, 
			    { "Snyder", "Snyder" }, { "Sodus", "Sodus" }, { "Sodus Center", "Sodus Center" }, { "Sodus Point", "Sodus Point" }, { "Solsville", "Solsville" }, 
			    { "Solvay", "Solvay" }, { "Somers", "Somers" }, { "Sonyea", "Sonyea" }, { "Sound Beach", "Sound Beach" }, { "South Bethlehem", "South Bethlehem" },
			    { "South Butler", "South Butler" }, { "South Byron", "South Byron" }, { "South Cairo", "South Cairo" }, { "South Cheektowaga", "South Cheektowaga" }, 
			    { "South Colton", "South Colton" }, { "South Corning", "South Corning" }, { "South Dayton", "South Dayton" }, { "South Edmeston", "South Edmeston" },
			    { "South Fallsburg", "South Fallsburg" }, { "South Farmingdale", "South Farmingdale" }, { "South Floral Park", "South Floral Park" }, 
			    { "South Glens Falls", "South Glens Falls" }, { "South Hempstead", "South Hempstead" }, { "South Huntington", "South Huntington" }, 
			    { "South Jamesport", "South Jamesport" }, { "South Kortright", "South Kortright" }, { "South Lima", "South Lima" }, 
			    { "South New Berlin", "South New Berlin" }, { "South Otselic", "South Otselic" }, { "South Ozone Park", "South Ozone Park" }, 
			    { "South Plymouth", "South Plymouth" }, { "South Richmond Hill", "South Richmond Hill" }, { "South Rutland", "South Rutland" }, { "South Salem", "South Salem" },
			    { "South Schodack", "South Schodack" }, { "South Setauket", "South Setauket" }, { "South Wales", "South Wales" }, { "South Westerlo", "South Westerlo" },
			    { "Southampton", "Southampton" }, { "Southfields", "Southfields" }, { "Southold", "Southold" }, { "Sparkill", "Sparkill" }, { "Sparrow Bush", "Sparrow Bush" },
			    { "Sparrowbush", "Sparrowbush" }, { "Speculator", "Speculator" }, { "Spencer", "Spencer" }, { "Spencerport", "Spencerport" }, { "Spencertown", "Spencertown" },
			    { "Speonk", "Speonk" }, { "Sprakers", "Sprakers" }, { "Spring Brook", "Spring Brook" }, { "Spring Glen", "Spring Glen" }, { "Spring Valley", "Spring Valley" },
			    { "Springfield Center", "Springfield Center" }, { "Springfield Gardens", "Springfield Gardens" }, { "Springville", "Springville" }, 
			    { "Springwater", "Springwater" }, { "Staatsburg", "Staatsburg" }, { "Stafford", "Stafford" }, { "Stamford", "Stamford" }, 
			    { "Stanfordville", "Stanfordville" }, { "Stanley", "Stanley" }, { "Star Lake", "Star Lake" }, { "Staten Island", "Staten Island" }, 
			    { "Steamburg", "Steamburg" }, { "Stella Niagara", "Stella Niagara" }, { "Stephentown", "Stephentown" }, { "Sterling", "Sterling" },
			    { "Sterling Forest", "Sterling Forest" }, { "Stewart Manor", "Stewart Manor" }, { "Stillwater", "Stillwater" }, { "Stittville", "Stittville" },
			    { "Stockton", "Stockton" }, { "Stone Ridge", "Stone Ridge" }, { "Stony Brook", "Stony Brook" }, { "Stony Creek", "Stony Creek" },
			    { "Stony Point", "Stony Point" }, { "Stormville", "Stormville" }, { "Stottville", "Stottville" }, { "Stow", "Stow" }, { "Stratford", "Stratford" }, 
			    { "Strykersville", "Strykersville" }, { "Stuyvesant", "Stuyvesant" }, { "Stuyvesant Falls", "Stuyvesant Falls" }, { "Suffern", "Suffern" },
			    { "Sugar Loaf", "Sugar Loaf" }, { "Summit", "Summit" }, { "Summitville", "Summitville" }, { "Sundown", "Sundown" }, { "Sunnyside", "Sunnyside" },
			    { "Surprise", "Surprise" }, { "Swain", "Swain" }, { "Swan Lake", "Swan Lake" }, { "Swormville", "Swormville" }, { "Sylvan Beach", "Sylvan Beach" },
			    { "Syosset", "Syosset" }, { "Syracuse", "Syracuse" }, { "Taberg", "Taberg" }, { "Taconic Lake", "Taconic Lake" }, { "Taghkanic", "Taghkanic" },
			    { "Tahawus", "Tahawus" }, { "Tallman", "Tallman" }, { "Tannersville", "Tannersville" }, { "Tappan", "Tappan" }, { "Tarrytown", "Tarrytown" },
			    { "Thendara", "Thendara" }, { "Theresa", "Theresa" }, { "Thiells", "Thiells" }, { "Thompson Ridge", "Thompson Ridge" }, { "Thompsonville", "Thompsonville" },
			    { "Thomson", "Thomson" }, { "Thornwood", "Thornwood" }, { "Thousand Island Park", "Thousand Island Park" }, { "Three Mile Bay", "Three Mile Bay" },
			    { "Thurman", "Thurman" }, { "Ticonderoga", "Ticonderoga" }, { "Tillson", "Tillson" }, { "Tioga Center", "Tioga Center" }, { "Tivoli", "Tivoli" },
			    { "Tomkins Cove", "Tomkins Cove" }, { "Tonawanda", "Tonawanda" }, { "Town Of Tonawanda", "Town Of Tonawanda" }, { "Treadwell", "Treadwell" },
			    { "Tribes Hill", "Tribes Hill" }, { "Troupsburg", "Troupsburg" }, { "Trout Creek", "Trout Creek" }, { "Troy", "Troy" }, { "Trumansburg", "Trumansburg" },
			    { "Truxton", "Truxton" }, { "Tuckahoe", "Tuckahoe" }, { "Tully", "Tully" }, { "Tunnel", "Tunnel" }, { "Tupper Lake", "Tupper Lake" }, 
			    { "Turin", "Turin" }, { "Tuscarora", "Tuscarora" }, { "Tuxedo Park", "Tuxedo Park" }, { "Tyrone", "Tyrone" }, { "Ulster Park", "Ulster Park" },
			    { "Unadilla", "Unadilla" }, { "Union Hill", "Union Hill" }, { "Union Springs", "Union Springs" }, { "Uniondale", "Uniondale" }, 
			    { "Unionville", "Unionville" }, { "Upper Jay", "Upper Jay" }, { "Upper Saint Regis", "Upper Saint Regis" }, { "Upton", "Upton" }, 
			    { "Utica", "Utica" }, { "Vails Gate", "Vails Gate" }, { "Valatie", "Valatie" }, { "Valhalla", "Valhalla" }, { "Valley Cottage", "Valley Cottage" },
			    { "Valley Falls", "Valley Falls" }, { "Valley Stream", "Valley Stream" }, { "Valois", "Valois" }, { "Van Buren Bay", "Van Buren Bay" },
			    { "Van Buren Point", "Van Buren Point" }, { "Van Etten", "Van Etten" }, { "Van Hornesville", "Van Hornesville" }, { "Varysburg", "Varysburg" },
			    { "Venice Center", "Venice Center" }, { "Verbank", "Verbank" }, { "Vermontville", "Vermontville" }, { "Vernon", "Vernon" }, { "Vernon Center",
			    "Vernon Center" }, { "Verona", "Verona" }, { "Verona Beach", "Verona Beach" }, { "Verplanck", "Verplanck" }, { "Versailles", "Versailles" },
			    { "Vestal", "Vestal" }, { "Veterans Administration", "Veterans Administration" }, { "Victor", "Victor" }, { "Victory Mills", "Victory Mills" },
			    { "Village Of Garden City", "Village Of Garden City" }, { "Voorheesville", "Voorheesville" }, { "Waccabuc", "Waccabuc" }, { "Waddington", "Waddington" }, 
			    { "Wadhams", "Wadhams" }, { "Wading River", "Wading River" }, { "Wadsworth", "Wadsworth" }, { "Wainscott", "Wainscott" }, { "Walden", "Walden" },
			    { "Wales Center", "Wales Center" }, { "Walker Valley", "Walker Valley" }, { "Wallace", "Wallace" }, { "Wallkill", "Wallkill" }, { "Walton", "Walton" },
			    { "Walworth", "Walworth" }, { "Wampsville", "Wampsville" }, { "Wanakena", "Wanakena" }, { "Wantagh", "Wantagh" }, { "Wappingers Falls", "Wappingers Falls" },
			    { "Warners", "Warners" }, { "Warnerville", "Warnerville" }, { "Warrensburg", "Warrensburg" }, { "Warsaw", "Warsaw" }, { "Warwick", "Warwick" }, 
			    { "Washington Mills", "Washington Mills" }, { "Washingtonville", "Washingtonville" }, { "Wassaic", "Wassaic" }, { "Water Mill", "Water Mill" }, 
			    { "Waterford", "Waterford" }, { "Waterloo", "Waterloo" }, { "Waterport", "Waterport" }, { "Watertown", "Watertown" }, { "Waterville", "Waterville" },
			    { "Watervliet", "Watervliet" }, { "Watkins Glen", "Watkins Glen" }, { "Wave Crest", "Wave Crest" }, { "Waverly", "Waverly" }, { "Wawarsing", "Wawarsing" },
			    { "Wayland", "Wayland" }, { "Wayne", "Wayne" }, { "Webster", "Webster" }, { "Webster Crossing", "Webster Crossing" }, { "Weedsport", "Weedsport" }, 
			    { "Wellesley Island", "Wellesley Island" }, { "Wells", "Wells" }, { "Wells Bridge", "Wells Bridge" }, { "Wellsburg", "Wellsburg" }, 
			    { "Wellsville", "Wellsville" }, { "West Amherst", "West Amherst" }, { "West Babylon", "West Babylon" }, { "West Bangor", "West Bangor" }, 
			    { "West Bloomfield", "West Bloomfield" }, { "West Brentwood", "West Brentwood" }, { "West Burlington", "West Burlington" }, { "West Camp", "West Camp" },
			    { "West Charlton", "West Charlton" }, { "West Chazy", "West Chazy" }, { "West Clarksville", "West Clarksville" }, { "West Coxsackie", "West Coxsackie" },
			    { "West Danby", "West Danby" }, { "West Davenport", "West Davenport" }, { "West Eaton", "West Eaton" }, { "West Edmeston", "West Edmeston" }, 
			    { "West Ellicott", "West Ellicott" }, { "West Exeter", "West Exeter" }, { "West Falls", "West Falls" }, { "West Fishkill", "West Fishkill" }, 
			    { "West Fulton", "West Fulton" }, { "West Gilgo Beach", "West Gilgo Beach" }, { "West Harrison", "West Harrison" }, { "West Haverstraw", "West Haverstraw" },
			    { "West Hempstead", "West Hempstead" }, { "West Henrietta", "West Henrietta" }, { "West Hurley", "West Hurley" }, { "West Islip", "West Islip" }, 
			    { "West Kill", "West Kill" }, { "West Lebanon", "West Lebanon" }, { "West Leyden", "West Leyden" }, { "West Monroe", "West Monroe" },
			    { "West Nyack", "West Nyack" }, { "West Oneonta", "West Oneonta" }, { "West Park", "West Park" }, { "West Point", "West Point" }, 
			    { "West Rush", "West Rush" }, { "West Sand Lake", "West Sand Lake" }, { "West Sayville", "West Sayville" }, { "West Seneca", "West Seneca" },
			    { "West Shokan", "West Shokan" }, { "West Stockholm", "West Stockholm" }, { "West Valley", "West Valley" }, { "West Windsor", "West Windsor" },
			    { "West Winfield", "West Winfield" }, { "Westbrookville", "Westbrookville" }, { "Westbury", "Westbury" }, { "Westdale", "Westdale" }, 
			    { "Westerlo", "Westerlo" }, { "Westernville", "Westernville" }, { "Westfield", "Westfield" }, { "Westford", "Westford" }, { "Westgate", "Westgate" },
			    { "Westhampton", "Westhampton" }, { "Westhampton Beach", "Westhampton Beach" }, { "Westmoreland", "Westmoreland" }, { "Westons Mills", "Westons Mills" }, 
			    { "Westport", "Westport" }, { "Westtown", "Westtown" }, { "Wevertown", "Wevertown" }, { "Whallonsburg", "Whallonsburg" }, 
			    { "Wheatley Heights", "Wheatley Heights" }, { "Whippleville", "Whippleville" }, { "White Creek", "White Creek" }, { "White Lake", "White Lake" },
			    { "White Plains", "White Plains" }, { "White Sulphur Springs", "White Sulphur Springs" }, { "Whiteface Mountain", "Whiteface Mountain" },
			    { "Whitehall", "Whitehall" }, { "Whitesboro", "Whitesboro" }, { "Whitestone", "Whitestone" }, { "Whitesville", "Whitesville" },
			    { "Whitney Point", "Whitney Point" }, { "Wiccopee", "Wiccopee" }, { "Willard", "Willard" }, { "Willet", "Willet" }, { "Williamson", "Williamson" },
			    { "Williamstown", "Williamstown" }, { "Williamsville", "Williamsville" }, { "Williston Park", "Williston Park" }, { "Willow", "Willow" }, 
			    { "Willsboro", "Willsboro" }, { "Willseyville", "Willseyville" }, { "Wilmington", "Wilmington" }, { "Wilson", "Wilson" }, { "Wilton", "Wilton" },
			    { "Windham", "Windham" }, { "Windsor", "Windsor" }, { "Wingdale", "Wingdale" }, { "Winthrop", "Winthrop" }, { "Witherbee", "Witherbee" },
			    { "Wolcott", "Wolcott" }, { "Woodbourne", "Woodbourne" }, { "Woodbury", "Woodbury" }, { "Woodgate", "Woodgate" }, { "Woodhaven", "Woodhaven" },
			    { "Woodhull", "Woodhull" }, { "Woodmere", "Woodmere" }, { "Woodridge", "Woodridge" }, { "Woodside", "Woodside" }, { "Woodstock", "Woodstock" },
			    { "Woodville", "Woodville" }, { "Worcester", "Worcester" }, { "Wurtsboro", "Wurtsboro" }, { "Wyandanch", "Wyandanch" }, { "Wykagyl", "Wykagyl" },
			    { "Wynantskill", "Wynantskill" }, { "Wyoming", "Wyoming" }, { "Yaphank", "Yaphank" }, { "Yonkers", "Yonkers" }, { "York", "York" }, { "Yorkshire",
			    "Yorkshire" }, { "Yorktown Heights", "Yorktown Heights" }, { "Yorkville", "Yorkville" }, { "Youngstown", "Youngstown" }, { "Youngsville", "Youngsville" },
			    { "Yulan", "Yulan"}
			};

			return createEnumResponseValidator(keyValues);
	}
	
	public ResponseSpecification getAllCountryResponseValidator()
	{
		final String[][] keyValues = 
			{ 
				 { "AD", "Andorra" }, { "AE", "United Arab Emirates" }, { "AF", "Afghanistan" }, { "AG", "Antigua And Barbuda" }, { "AI", "Anguilla" },
				 { "AL", "Albania" }, { "AM", "Armenia" }, { "AN", "Netherlands Antilles" }, { "AO", "Angola" }, { "AQ", "Antarctica" }, { "AR", "Argentina" },
				 { "AT", "Austria" }, { "AU", "Australia" }, { "AW", "Aruba" }, { "AX", "And Islands" }, { "AZ", "Azerbaijan" }, { "BA", "Bosnia And Herzegovina" },
				 { "BB", "Barbados" }, { "BD", "Bangladesh" }, { "BE", "Belgium" }, { "BF", "Burkina Faso" }, { "BG", "Bulgaria" }, { "BH", "Bahrain" }, 
				 { "BI", "Burundi" }, { "BJ", "Benin" }, { "BM", "Bermuda" }, { "BN", "Brunei Darussalam" }, { "BO", "Bolivia" }, { "BR", "Brazil" }, 
				 { "BS", "Bahamas" }, { "BT", "Bhutan" }, { "BV", "Bouvet Island" }, { "BW", "Botswana" }, { "BY", "Belarus" }, { "BZ", "Belize" },
				 { "CA", "Canada" }, { "CC", "Cocos (keeling) Islands" }, { "CD", "Congo, Democratic Rep Of" }, { "CF", "Central African Republic" },
				 { "CG", "Congo" }, { "CH", "Switzerland" }, { "CI", "Cote D'ivoire" }, { "CK", "Cook Islands" }, { "CL", "Chile" }, { "CM", "Cameroon" },
				 { "CN", "China" }, { "CO", "Colombia" }, { "CR", "Costa Rica" }, { "CS", "Serbia And Montenegro" }, { "CV", "Cape Verde" }, { "CX", "Christmas Island" },
				 { "CY", "Cyprus" }, { "CZ", "Czech Republic" }, { "DE", "Germany" }, { "DJ", "Djibouti" }, { "DK", "Denmark" }, { "DM", "Dominica" }, 
				 { "DO", "Dominican Republic" }, { "DZ", "Algeria" }, { "EC", "Ecuador" }, { "EE", "Estonia" }, { "EG", "Egypt" }, { "EH", "Western Sahara" },
				 { "ER", "Eritrea" }, { "ES", "Spain" }, { "ET", "Ethiopia" }, { "FI", "Finland" }, { "FJ", "Fiji" }, { "FK", "Falkland Islands" }, 
				 { "FM", "Micronesia, Fed States Of" }, { "FO", "Faroe Islands" }, { "FR", "France" }, { "GA", "Gabon" }, { "GB", "United Kingdom" }, 
				 { "GD", "Grenada" }, { "GE", "Georgia" }, { "GF", "French Guiana" }, { "GH", "Ghana" }, { "GI", "Gibraltar" }, { "GL", "Greenland" }, 
				 { "GM", "Gambia" }, { "GN", "Guinea" }, { "GP", "Guadeloupe" }, { "GQ", "Equatorial Guinea" }, { "GR", "Greece" }, { "GS", "S Georgia-s Sandwich Isls" },
				 { "GT", "Guatemala" }, { "GW", "Guinea-bissau" }, { "GY", "Guyana" }, { "HK", "Hong Kong" }, { "HM", "Heard Isl-mcdonald Isl" }, 
				 { "HN", "Honduras" }, { "HR", "Croatia" }, { "HT", "Haiti" }, { "HU", "Hungary" }, { "ID", "Indonesia" }, { "IE", "Ireland" },
				 { "IL", "Israel" }, { "IN", "India" }, { "IO", "British Indian Ocean Terr" }, { "IQ", "Iraq" }, { "IS", "Iceland" }, { "IT", "Italy" }, { "JM", "Jamaica" },
				 { "JO", "Jordan" }, { "JP", "Japan" }, { "KE", "Kenya" }, { "KG", "Kyrgyzstan" }, { "KH", "Cambodia" }, { "KI", "Kiribati" }, { "KM", "Comoros" }, 
				 { "KN", "Saint Kitts And Nevis" }, { "KR", "Korea, Republic Of" }, { "KW", "Kuwait" }, { "KY", "Cayman Islands" }, { "KZ", "Kazakhstan" }, 
				 { "LA", "Lao People's Dem Rep" }, { "LB", "Lebanon" }, { "LC", "Saint Lucia" }, { "LI", "Liechtenstein" }, { "LK", "Sri Lanka" }, { "LR", "Liberia" }, 
				 { "LS", "Lesotho" }, { "LT", "Lithuania" }, { "LU", "Luxembourg" }, { "LV", "Latvia" }, { "MA", "Morocco" }, { "MC", "Monaco" }, { "MD", "Moldova, Republic Of" },
				 { "ME", "Montenegro" }, { "MG", "Madagascar" },  { "MH", "Marshall Islands" }, { "MK", "Macedonia, The Fyr Of" }, { "ML", "Mali" }, { "MN", "Mongolia" }, 
				 { "MO", "Macao" }, { "MQ", "Martinique" },  { "MR", "Mauritania" }, { "MS", "Montserrat" }, { "MT", "Malta" }, { "MU", "Mauritius" }, { "MV", "Maldives" },
				 { "MW", "Malawi" }, { "MX", "Mexico" }, { "MY", "Malaysia" }, { "MZ", "Mozambique" }, { "NA", "Namibia" }, { "NC", "New Caledonia" }, { "NE", "Niger" }, 
				 { "NF", "Norfolk Island" }, { "NG", "Nigeria" }, { "NI", "Nicaragua" }, { "NL", "Netherlands" }, { "NO", "Norway" }, { "NP", "Nepal" }, { "NR", "Nauru" },
				 { "NU", "Niue" }, { "NZ", "New Zealand" }, { "OM", "Oman" }, { "PA", "Panama" }, { "PE", "Peru" }, { "PF", "French Polynesia" }, { "PG", "Papua New Guinea" }, 
				 { "PH", "Philippines" }, { "PK", "Pakistan" }, { "PL", "Poland" }, { "PM", "Saint Pierre And Miquelon" }, { "PN", "Pitcairn" }, { "PR", "Puerto Rico" }, 
				 { "PS", "Palestinian Territory" }, { "PT", "Portugal" }, { "PW", "Palau" }, { "PY", "Paraguay" }, { "QA", "Qatar" }, { "RE", "Reunion" }, { "RO", "Romania" }, 
				 { "RS", "Serbia" }, { "RU", "Russian Federation" }, { "RW", "Rwanda" }, { "SA", "Saudi Arabia" }, { "SB", "Solomon Islands" }, { "SC", "Seychelles" }, 
				 { "SE", "Sweden" }, { "SG", "Singapore" }, { "SH", "Saint Helena" }, { "SI", "Slovenia" }, { "SJ", "Svalbard And Jan Mayen" }, { "SK", "Slovakia" }, 
				 { "SL", "Sierra Leone" }, { "SM", "San Marino" }, { "SN", "Senegal" }, { "SO", "Somalia" }, { "SR", "Suriname" }, { "ST", "Sao Tome And Principe" }, 
				 { "SV", "El Salvador" }, { "SZ", "Swaziland" }, { "TC", "Turks And Caicos Islands" }, { "TD", "Chad" }, { "TF", "French Southern Terr" }, { "TG", "Togo" },
				 { "TH", "Thailand" }, { "TJ", "Tajikistan" }, { "TK", "Tokelau" }, { "TL", "Timor-leste" }, { "TM", "Turkmenistan" }, { "TN", "Tunisia" }, { "TO", "Tonga" },
				 { "TR", "Turkey" }, { "TT", "Trinidad And Tobago" }, { "TV", "Tuvalu" }, { "TW", "Taiwan" }, { "TZ", "Tanzania, United Rep Of" }, { "UA", "Ukraine" },
				 { "UG", "Uganda" }, { "US", "United States Of America" }, { "UY", "Uruguay" }, { "UZ", "Uzbekistan" }, { "VA", "Holy See (vatican)" }, 
				 { "VC", "St Vincent-grenadines" }, { "VE", "Venezuela" }, { "VG", "Virgin Islands, British" }, { "VN", "Viet Nam" }, { "VU", "Vanuatu" }, 
				 { "WF", "Wallis And Futuna" }, { "WS", "Samoa" }, { "YE", "Yemen" }, { "YT", "Mayotte" }, { "ZA", "South Africa" }, { "ZM", "Zambia" }, { "ZW", "Zimbabwe" } 
			};

				
			return createEnumResponseValidator(keyValues);
	}
	
	public ResponseSpecification getCountrySchoolsResponseValidator()
	
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("schoolUCN[0]",equalTo("600222805"))
		.expectBody("schoolStatus[0]",equalTo("1"))
		.expectBody("groupType[0]",equalTo("I_CD"))
		.expectBody("creditCardState[0]",isEmptyString())
		.expectBody("zipcode[0]",equalTo("1212"))
		.expectBody("address1[0]",equalTo("UNITED NATION ROAD"))
		.expectBody("city[0]",equalTo("DHAKA"))
		.expectBody("name[0]",equalTo("AMER INTL SCH DHAKA"))
		.expectBody("state[0]",isEmptyString())
		.expectBody("spsId[0]",equalTo("30128319"))

		.expectBody("schoolUCN[1]",equalTo("600340507"))
		.expectBody("schoolStatus[1]",equalTo("1"))
		.expectBody("groupType[1]",equalTo("I_CD"))
		.expectBody("creditCardState[1]",isEmptyString())
		.expectBody("zipcode[1]",equalTo("4000"))
		.expectBody("address1[1]",equalTo("321 SARSON ROAD"))
		.expectBody("city[1]",equalTo("CHITTAGONG"))
		.expectBody("name[1]",equalTo("CHITTAGONG GRAMMAR SCHOOL"))
		.expectBody("state[1]",isEmptyString())
		.expectBody("spsId[1]",equalTo("30152192"))
					
		.expectBody("schoolUCN[2]",isEmptyString())
		.expectBody("schoolStatus[2]",equalTo("1"))
		.expectBody("groupType[2]",equalTo("D_ADM"))
		.expectBody("creditCardState[2]",equalTo("Dhaka"))
		.expectBody("zipcode[2]",equalTo("1000"))
		.expectBody("address1[2]",equalTo("1000 Main Street"))
		.expectBody("city[2]",equalTo("Dhaka"))
		.expectBody("name[2]",equalTo("Foreign Test School 1"))
		.expectBody("state[2]",equalTo("Dhaka"))
		.expectBody("spsId[2]",equalTo("23242776"));
		return rspec.build();			
	}
	
	public ResponseSpecification getSchoolByZipcodeResponseValidator()
	
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("creditCardState[0]",equalTo("NY"))
		.expectBody("zipcode[0]",equalTo("11431"))
		.expectBody("schoolStatus[0]",equalTo("1"))
		.expectBody("groupType[0]",equalTo("EC_PS"))
		.expectBody("address1[0]",equalTo("PO BOX 311215"))
		.expectBody("city[0]",equalTo("JAMAICA"))
		.expectBody("schoolUCN[0]",equalTo("610166776"))
		.expectBody("name[0]",equalTo("EARLY SUNRISE PRE - SCH AND KN"))
		.expectBody("state[0]",equalTo("NY"))
		.expectBody("spsId[0]",equalTo("30097347"))

		.expectBody("creditCardState[1]",equalTo("NY"))
		.expectBody("zipcode[1]",equalTo("11431"))
		.expectBody("schoolStatus[1]",equalTo("1"))
		.expectBody("groupType[1]",equalTo("EC_PS"))
		.expectBody("address1[1]",equalTo("PO BOX 311215"))
		.expectBody("city[1]",equalTo("JAMAICA"))
		.expectBody("schoolUCN[1]",equalTo("610166776"))
		.expectBody("name[1]",equalTo("EARLY SUNRISE PRE-SCHOOL AND KINDERGARTEN II"))
		.expectBody("state[1]",equalTo("NY"))
		.expectBody("spsId[1]",equalTo("30160821"));
		return rspec.build();
	}
	
	public ResponseSpecification getSchoolByCityStateResponseValidator()
	
	{ 
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("creditCardState[0]",equalTo("NY"))
		.expectBody("zipcode[0]",equalTo("12007"))
		.expectBody("schoolStatus[0]",equalTo("1"))
		.expectBody("groupType[0]",equalTo("EC_DR"))
		.expectBody("address1[0]",equalTo("45 ALCOVE RD"))
		.expectBody("city[0]",equalTo("ALCOVE"))
		.expectBody("schoolUCN[0]",equalTo("600389789"))
		.expectBody("name[0]",equalTo("FUN AND FRIENDS PRESCHOOL"))
		.expectBody("state[0]",equalTo("NY"))
		.expectBody("spsId[0]",equalTo("11943489"));
		return rspec.build();
	}
	
	public ResponseSpecification getAllTeachersResponseValidator()
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
				.expectBody("[0].modifiedDate",equalTo("20151021"))
				.expectBody("password[0]",equalTo("iexecxGaERY="))
					.expectBody("readingLevel[0]",equalTo("20"))
					.expectBody("salutation[0]",equalTo("MR"))
					.expectBody("grades[0]",hasItem("02"))
					.expectBody("schoolId[0]",equalTo("411778"))
					.expectBody("cac[0]",equalTo("PVWGW"))
					//.expectBody("userType[0]",hasItem("TEACHER"))
					.expectBody("isEducator[0]",equalTo("1"))
					.expectBody("cacId[0]",equalTo("10016051"))
					.expectBody("isIdUsed[0]",equalTo("2"))
					.expectBody("termsConditionsAcceptedVersion[0]",equalTo("1.2"))
					.expectBody("termsConditionsAcceptedTimestamp[0]",equalTo("Oct 16, 2015, 4:21 PM (EDT)"))
					.expectBody("mentorTeacher[0]",equalTo("1"))
					.expectBody("usedBookclubs[0]",equalTo("0"))
					.expectBody("gradeClasssizeId[0]",hasItem("2628651"))
					.expectBody("firstLoginSchoolYear[0]",equalTo("1"))
					.expectBody("ucn[0]",equalTo("636156851"))
					.expectBody("schoolUcn[0]",equalTo("600190609"))
					.expectBody("email[0]",equalTo("dmalala@juno1.com"))
					.expectBody("firstName[0]",equalTo("David"))
					.expectBody("lastName[0]",equalTo("Malala"))
					.expectBody("birthMonth[0]",equalTo("02"))
					.expectBody("birthDay[0]",equalTo("04"))
					.expectBody("privacyPolicyAcceptedVersion[0]",equalTo("1.2"))
					.expectBody("orgZip[0]",equalTo("11426"))
					.expectBody("positions[0]",hasItem("10026"))
					.expectBody("emailCaptureDate[0]",equalTo("2015-10-16"))
					.expectBody("level1RegistrationDate[0]",equalTo("Oct 16, 2015, 4:21 PM (EDT)"))
					.expectBody("lastmodifiedDate[0]",equalTo("Oct 21, 2015, 0:20 PM (EDT)"))
					.expectBody("isEnabled[0]",equalTo("1"))
					.expectBody("newTeacher[0]",equalTo("0"))
					.expectBody("registrationDate[0]",equalTo("Oct 16, 2015, 4:21 PM (EDT)"))
					.expectBody("privacyPolicyAcceptedTimestamp[0]",equalTo("Oct 16, 2015, 4:21 PM (EDT)"))
					.expectBody("userName[0]",equalTo("dmalala@juno1.com"))
					.expectBody("spsId[0]",equalTo("88110574"))
					
					.expectBody("note[1]" ,hasItems("51154809|scsToolsApp|Dec 23, 2009, 0:51:16 AM (GMT-05:00)|SYS: Modification:<br>COOL Flag: false<br>COOL Opt Out Option: [null]->[]", 
													"51154809|csiMessageApp|Dec 17, 2009, 4:43:07 PM (EST)|SYS: Modification:<br>BCOE Number\n\t\t\t\n\t\t\t\n\t\t: [null]->[0927247569]<br>Corporate Status: [null]->[]",
													"51154809|csiMessageApp|Dec 17, 2009, 4:43:05 PM (EST)|SYS: Modification:<br>Enterprise E-mail", 
													"51154809|csiMessageApp|Dec 17, 2009, 4:43:05 PM (EST)|SYS: Modification:<br>User UCN\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t: [null]->[616706716]",
													"51154809|myAccountApp|Dec 17, 2009, 4:43:02 PM (EST)|SYS: Modification:<br>Grades<br>Position(s)<br>COOL Subscription: true<br>Educator Subscription\n\t\t\t\n\t\t: true",
													"51154809|myAccountApp|Dec 17, 2009, 4:43:01 PM (EST)|SYS: Creation",
													"51154809|scsToolsApp|Feb 05, 2010, 5:37:46 PM (GMT-05:00)|SYS: Modification:<br>Link to org\n\t\t\t\n\t\t: [570699]->[411778]<br>School Zip/Postal<br>School UCN\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t: [600207218]->[600190609]" ))
					.expectBody("modifiedDate[1]",equalTo("20100205"))
					.expectBody("password[1]",equalTo("iexecxGaERY="))
					.expectBody("grades[1]",hasItem("99"))
					.expectBody("schoolId[1]",equalTo("411778"))
					//.expectBody("userType[1]",hasItem("TEACHER"))
					.expectBody("isEducator[1]",equalTo("1"))
					.expectBody("subscriptionCool",hasItem("1"))
					.expectBody("subscriptionEducator[1]",equalTo("1"))
					.expectBody("ucn[1]",equalTo("616706716"))
					.expectBody("schoolUcn[1]",equalTo("600190609"))
					.expectBody("email[1]",equalTo("cooltemail60836@scholastic.com"))
					.expectBody("firstName[1]",equalTo("COOLTfirst60836"))
					.expectBody("lastName[1]",equalTo("COOLTlast60836"))
					.expectBody("corpStatus[1]",isEmptyString())
					.expectBody("orgZip[1]",equalTo("11426"))
					.expectBody("positions[1]",hasItem("10000"))
					.expectBody("emailCaptureDate[1]",equalTo("Dec"))
					.expectBody("level1RegistrationDate[1]",equalTo("Dec 17, 2009, 4:43 PM (EST)"))
					.expectBody("lastmodifiedDate[1]",equalTo("Feb 05, 2010, 5:37 PM (GMT-05:00)"))
					.expectBody("coolFlag[1]",equalTo("0"))
					.expectBody("appSourceCode[1]",isEmptyString())
					.expectBody("bcoe[1]",equalTo("0927247569"))
					.expectBody("coolOptOut[1]",isEmptyString())
					.expectBody("enterpriseEmail[1]",equalTo("cooltemail60836@scholastic.com"))
					.expectBody("isEnabled[1]",equalTo("1"))
					.expectBody("registrationDate[1]",equalTo("Dec 17, 2009, 4:43 PM (EST)"))
					.expectBody("userName[1]",equalTo("coolt60836"))
					.expectBody("spsId[1]",equalTo("51154809"));
					return rspec.build();
	}
	
	public ResponseSpecification getAlternateTeacherResponseValidator()
	{
		
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("modifiedDate[0]",equalTo("20141215"))
		.expectBody("password[0]",equalTo("iexecxGaERY="))
		.expectBody("readingLevel[0]",equalTo("20"))
		.expectBody("salutation[0]",equalTo("MR"))
		.expectBody("grades[0]",hasItems("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "98", "99"))
		.expectBody("schoolId[0]",equalTo("348537"))
		.expectBody("cac[0]",equalTo("LVPZ6"))
		//.expectBody("userType[0]",hasItem("TEACHER"))
		.expectBody("isEducator[0]",equalTo("1"))
		.expectBody("cacId[0]",equalTo("8418468"))
		.expectBody("isIdUsed[0]",equalTo("2"))
		.expectBody("termsConditionsAcceptedVersion[0]",equalTo("1.2"))
		.expectBody("termsConditionsAcceptedTimestamp[0]",equalTo("Jul 23, 2014, 3:38 PM (EDT)"))
		.expectBody("mentorTeacher[0]",equalTo("0"))
		.expectBody("usedBookclubs[0]",equalTo("0"))
		.expectBody("gradeClasssizeId[0]",hasItems("775051", "775060", "775062", "775061", "662341", "775059", "775058", "775057", "775056", "775055", "775063", "775054", "775053", "775052"))
		.expectBody("firstLoginSchoolYear[0]",equalTo("1"))
		.expectBody("ucn[0]",equalTo("632162938"))
		.expectBody("schoolUcn[0]",equalTo("600078822"))
		.expectBody("email[0]",equalTo("jtoad@juno1.com"))
		.expectBody("firstName[0]",equalTo("James"))
		.expectBody("lastName[0]",equalTo("Toad"))
		.expectBody("corpStatus[0]",isEmptyString())
		.expectBody("privacyPolicyAcceptedVersion[0]",equalTo("1.2"))
		.expectBody("orgZip[0]",equalTo("11372"))
		.expectBody("positions[0]",hasItem("10025"))
		.expectBody("schlAppUserType[0]",hasItem("2"))
		.expectBody("emailCaptureDate[0]",equalTo("2014-07-23"))
		.expectBody("level1RegistrationDate[0]",equalTo("Jul 23, 2014, 3:38 PM (EDT)"))
		.expectBody("lastmodifiedDate[0]",equalTo("Dec 15, 2014, 4:34 PM (EST)"))
		.expectBody("altTeacher[0]",equalTo("1"))
		.expectBody("bcoe[0]",equalTo("1391586128"))
		.expectBody("enterpriseEmail[0]",equalTo("JTOAD@JUNO1.COM"))
		.expectBody("isEnabled[0]",equalTo("1"))
		.expectBody("newTeacher[0]",equalTo("0"))
		.expectBody("registrationDate[0]",equalTo("Jul 23, 2014, 3:38 PM (EDT)"))
		.expectBody("privacyPolicyAcceptedTimestamp[0]",equalTo("Jul 23, 2014, 3:38 PM (EDT)"))
		.expectBody("userName[0]",equalTo("jtoad@juno1.com"))
		.expectBody("spsId[0]",equalTo("84247169"))

		.expectBody("modifiedDate[1]",equalTo("20140731"))
		.expectBody("password[1]",equalTo("iexecxGaERY="))
		.expectBody("readingLevel[1]",equalTo("20"))
		.expectBody("salutation[1]",equalTo("MR"))
		.expectBody("grades[1]",hasItems("98", "04", "05", "99", "01", "02", "03"))
		.expectBody("schoolId[1]",equalTo("348537"))
		.expectBody("cac[1]",equalTo("LX8YV"))
		//.expectBody("userType[1]",hasItem("TEACHER"))
		.expectBody("isEducator[1]",equalTo("1"))
		.expectBody("cacId[1]",equalTo("8448349"))
		.expectBody("isIdUsed[1]",equalTo("2"))
		.expectBody("termsConditionsAcceptedVersion[1]",equalTo("1.2"))
		.expectBody("termsConditionsAcceptedTimestamp[1]",equalTo("Jul 31, 2014, 0:33 PM (EDT)"))
		.expectBody("alsoParent[1]",equalTo("1"))
		.expectBody("mentorTeacher[1]",equalTo("1"))
		.expectBody("usedBookclubs[1]",equalTo("1"))
		.expectBody("gradeClasssizeId[1]",hasItems("693160", "693161", "693156", "693157", "693155", "693158", "693159"))
		.expectBody("firstLoginSchoolYear[1]",equalTo("1"))
		.expectBody("ucn[1]",equalTo("632192109"))
		.expectBody("schoolUcn[1]",equalTo("600078822"))
		.expectBody("email[1]",equalTo("jplavani@juno1.com"))
		.expectBody("firstName[1]",equalTo("James"))
		.expectBody("lastName[1]",equalTo("Plavani"))
		.expectBody("corpStatus[1]",isEmptyString())
		.expectBody("privacyPolicyAcceptedVersion[1]",equalTo("1.2"))
		.expectBody("birthMonth[1]",equalTo("03"))
		.expectBody("birthDay[1]",equalTo("17"))
		.expectBody("orgZip[1]",equalTo("11372"))
		.expectBody("positions[1]",hasItems("10027", "10028", "10025", "10026", "10023", "10024", "10029"))
		.expectBody("schlAppUserType[1]",hasItems("2", "1"))
		.expectBody("emailCaptureDate[1]",equalTo("2014-07-31"))
		.expectBody("level1RegistrationDate[1]",equalTo("Jul 31, 2014, 0:33 PM (EDT)"))
		.expectBody("lastmodifiedDate[1]",equalTo("Jul 31, 2014, 1:53 PM (EDT)"))
		.expectBody("altTeacher[1]",equalTo("1"))
		.expectBody("bcoe[1]",equalTo("1393826423"))
		.expectBody("enterpriseEmail[1]",equalTo("JPLAVANI@JUNO1.COM"))
		.expectBody("isEnabled[1]",equalTo("1"))
		.expectBody("newTeacher[1]",equalTo("1"))
		.expectBody("registrationDate[1]",equalTo("Jul 31, 2014, 0:33 PM (EDT)"))
		.expectBody("privacyPolicyAcceptedTimestamp[1]",equalTo("Jul 31, 2014, 0:33 PM (EDT)"))
		.expectBody("userName[1]",equalTo("jplavani@juno1.com"))
		.expectBody("spsId[1]",equalTo("84283978"));
		return rspec.build();
	}
	
	public ResponseSpecification getPrimarySchoolAddressResponseValidator()
		
	{ 
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("addressTypeCode",equalTo("05"))
		.expectBody("uspsTypeCode",equalTo("2"))
		.expectBody("borderId",equalTo("37405015"))
		.expectBody("creditCardState",equalTo("TN"))
		.expectBody("zipcode",equalTo("37405"))
		.expectBody("poBox",equalTo("0"))
		.expectBody("schoolStatus",equalTo("1"))
		.expectBody("groupType",equalTo("S_6E"))
		.expectBody("internatIonalDomestIcCode",equalTo("01"))
		.expectBody("publicPrivateKey",equalTo("01"))
		.expectBody("reportingSchoolType",equalTo("0"))
		.expectBody("createDate",equalTo("2004-05-22 10:20:13.047497"))
		.expectBody("createdSource",equalTo("DATA DUMP"))
		.expectBody("address1",equalTo("1100 MOUNTAIN CREEK RD"))
		.expectBody("phone",equalTo("4238741917|0"))
		.expectBody("city",equalTo("CHATTANOOGA"))
		.expectBody("country",equalTo("US"))
		.expectBody("schoolUCN",equalTo("600094778"))
		.expectBody("name",equalTo("RED BANK ELEM SCHOOL"))
		.expectBody("state",equalTo("TN"))
		.expectBody("spsId",equalTo("205655"));
		return rspec.build();
	}
	
	public ResponseSpecification getExistingShippingAddressResponseValidator(  )
	
	{ 
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("spsId",equalTo("83931883"))
		.rootPath("objectList")
		.expectBody("id[0]",equalTo("1"))
		.expectBody("addressBookZip[0]",equalTo("11372"))
		.expectBody("isHome[0]",equalTo("0"))
		.expectBody("addressBookNickName[0]",equalTo("home"))
		.expectBody("addressBookAddress1[0]",equalTo("3443 75TH ST"))
		.expectBody("addressBookAddress2[0]",isEmptyString())
		.expectBody("addressBookAddress3[0]",isEmptyString())
		.expectBody("addressBookAddress4[0]",isEmptyString())
		.expectBody("addressBookAddress5[0]",isEmptyString())
		.expectBody("addressBookFirstName[0]",equalTo("Andrew1"))
		.expectBody("addressBookLastName[0]",equalTo("Moore1"))
		.expectBody("addressBookCity[0]",equalTo("FLUSHING"))
		.expectBody("addressBookState[0]",equalTo("NY"))
		.expectBody("addressBookPhone[0]",equalTo("7184456685|"))
		.expectBody("addressBookCountry[0]",equalTo("US"))

		.expectBody("id[1]",equalTo("2"))
		.expectBody("addressBookZip[1]",equalTo("11377"))
		.expectBody("isHome[1]",isEmptyString())
		.expectBody("addressBookNickName[1]",equalTo("Temporary Address"))
		.expectBody("addressBookAddress1[1]",equalTo("43-11 58th Street"))
		.expectBody("addressBookAddress2[1]",isEmptyString())
		.expectBody("addressBookAddress3[1]",isEmptyString())
		.expectBody("addressBookAddress4[1]",isEmptyString())
		.expectBody("addressBookAddress5[1]",isEmptyString())
		.expectBody("addressBookFirstName[1]",equalTo("John"))
		.expectBody("addressBookLastName[1]",equalTo("Smith"))
		.expectBody("addressBookCity[1]",equalTo("Flushing"))
		.expectBody("addressBookState[1]",equalTo("NY"))
		.expectBody("addressBookPhone[1]",equalTo("7183358836|"))
		.expectBody("addressBookCountry[1]",equalTo("US"))

		.expectBody("id[2]",equalTo("3"))
		.expectBody("addressBookZip[2]",equalTo("11377"))
		.expectBody("isHome[2]",isEmptyString())
		.expectBody("addressBookPOBox[2]",isEmptyString())
		.expectBody("addressBookNickName[2]",equalTo("Private"))
		.expectBody("addressBookAddress1[2]",equalTo("43-11 58th Street"))
		.expectBody("addressBookAddress2[2]",isEmptyString())
		.expectBody("addressBookAddress3[2]",isEmptyString())
		.expectBody("addressBookAddress4[2]",isEmptyString())
		.expectBody("addressBookAddress5[2]",isEmptyString())
		.expectBody("addressBookFirstName[2]",equalTo("Ashley"))
		.expectBody("addressBookLastName[2]",equalTo("Moore"))
		.expectBody("addressBookCity[2]",equalTo("Flushing"))
		.expectBody("addressBookState[2]",equalTo("NY"))
		.expectBody("addressBookEmail[2]",isEmptyString())
		.expectBody("addressBookPhone[2]",equalTo("|"))
		.expectBody("addressBookCountry[2]",equalTo("US"))

		.expectBody("id[3]",equalTo("4"))
		.expectBody("addressBookZip[3]",equalTo("11372"))
		.expectBody("isHome[3]",isEmptyString())
		.expectBody("addressBookNickName[3]",equalTo("Personal"))
		.expectBody("addressBookAddress1[3]",equalTo("34-34 75th Street"))
		.expectBody("addressBookAddress2[3]",isEmptyString())
		.expectBody("addressBookAddress3[3]",isEmptyString())
		.expectBody("addressBookAddress4[3]",isEmptyString())
		.expectBody("addressBookAddress5[3]",isEmptyString())
		.expectBody("addressBookFirstName[3]",equalTo("Ashley"))
		.expectBody("addressBookLastName[3]",equalTo("Moore"))
		.expectBody("addressBookCity[3]",equalTo("Flushing"))
		.expectBody("addressBookState[3]",equalTo("NY"))
		.expectBody("addressBookPhone[3]",equalTo("7186654433|"))
		.expectBody("addressBookCountry[3]",equalTo("US"));
		return rspec.build();
	}
	public ResponseSpecification getOnlyTeachersResponseValidator()
	
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("[0].modifiedDate",equalTo("20151021"))
		.expectBody("password[0]",equalTo("iexecxGaERY="))
		.expectBody("readingLevel[0]",equalTo("20"))
		.expectBody("salutation[0]",equalTo("MR"))
		.expectBody("grades[0]",hasItem("02"))
		.expectBody("schoolId[0]",equalTo("411778"))
		.expectBody("cac[0]",equalTo("PVWGW"))
		//.expectBody("userType[0]",hasItem("TEACHER"))
		.expectBody("isEducator[0]",equalTo("1"))
		.expectBody("cacId[0]",equalTo("10016051"))
		.expectBody("isIdUsed[0]",equalTo("2"))
		.expectBody("termsConditionsAcceptedVersion[0]",equalTo("1.2"))
		.expectBody("termsConditionsAcceptedTimestamp[0]",equalTo("Oct 16, 2015, 4:21 PM (EDT)"))
		.expectBody("mentorTeacher[0]",equalTo("1"))
		.expectBody("usedBookclubs[0]",equalTo("0"))
		.expectBody("gradeClasssizeId[0]",hasItem("2628651"))
		.expectBody("firstLoginSchoolYear[0]",equalTo("1"))
		.expectBody("ucn[0]",equalTo("636156851"))
		.expectBody("schoolUcn[0]",equalTo("600190609"))
		.expectBody("email[0]",equalTo("dmalala@juno1.com"))
		.expectBody("firstName[0]",equalTo("David"))
		.expectBody("lastName[0]",equalTo("Malala"))
		.expectBody("birthMonth[0]",equalTo("02"))
		.expectBody("birthDay[0]",equalTo("04"))
		.expectBody("privacyPolicyAcceptedVersion[0]",equalTo("1.2"))
		.expectBody("orgZip[0]",equalTo("11426"))
		.expectBody("positions[0]",hasItem("10026"))
		.expectBody("emailCaptureDate[0]",equalTo("2015-10-16"))
		.expectBody("level1RegistrationDate[0]",equalTo("Oct 16, 2015, 4:21 PM (EDT)"))
		.expectBody("lastmodifiedDate[0]",equalTo("Oct 21, 2015, 0:20 PM (EDT)"))
		.expectBody("isEnabled[0]",equalTo("1"))
		.expectBody("newTeacher[0]",equalTo("0"))
		.expectBody("registrationDate[0]",equalTo("Oct 16, 2015, 4:21 PM (EDT)"))
		.expectBody("privacyPolicyAcceptedTimestamp[0]",equalTo("Oct 16, 2015, 4:21 PM (EDT)"))
		.expectBody("userName[0]",equalTo("dmalala@juno1.com"))
		.expectBody("spsId[0]",equalTo("88110574"));
		return rspec.build();
	}
	
	public ResponseSpecification getAllGradeClassSizeResponseValidator()
	
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("spsUserId",hasItem("88890958"))
		.expectBody("spsId",hasItem("3312845"))
		.expectBody("classSize",hasItem("25"))
		.expectBody("grade",hasItem("02"));		
		//.expectBody("spsUserId",hasItems("83931883","83931883","83931883","83931883","83931883","83931883","83931883","83931883","83931883","83931883","83931883","83931883"))
		//.expectBody("spsId",hasItems("1973114","1973101","1973109","1973107","1973110","1973105","1973111","1973106","1973112","1973103","1973113","1973104"))
		//.expectBody("classSize",hasItems("30","26","18","15","19","15","20","15","21","15","22","15" ))
		//.expectBody("grade",hasItems("12","04","06","03","07","01","09","02","10","98","11","99" ));
		return rspec.build();
	}
	
	public ResponseSpecification getCreditCardWalletResponseValidator()
	
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		.expectBody("count",equalTo(3))
		.rootPath("wallet")
		.expectBody("id[0]",equalTo("1"))
		.expectBody("ccmonth[0]",equalTo("12"))
		.expectBody("cbspt[0]",equalTo("0101648593191004"))
		.expectBody("cnm[0]",equalTo("xxxxxxxxxxx1004"))
		.expectBody("phoneExtNumber[0]",isEmptyString())
		.expectBody("email[0]",isEmptyString())
		.expectBody("zip[0]",equalTo("11372"))
		.expectBody("firstName[0]",equalTo("David"))
		.expectBody("address1[0]",equalTo("34-10 75th Street"))
		.expectBody("address2[0]",isEmptyString())
		.expectBody("ccBrand[0]",equalTo("A"))
		.expectBody("phoneNumber[0]",equalTo("7184451241"))
		.expectBody("lastName[0]",equalTo("Dong"))
		.expectBody("ccnumber[0]",equalTo("xxxxxxxxxxx1004"))
		.expectBody("city[0]",equalTo("Flushing"))
		.expectBody("success[0]",equalTo("test"))
		.expectBody("default[0]",equalTo("true"))
		.expectBody("state[0]",equalTo("NY"))
		
		.expectBody("id[1]",equalTo("0"))
		.expectBody("ccmonth[1]",equalTo("12"))
		.expectBody("cbspt[1]",equalTo("0138322638711732"))
		.expectBody("cnm[1]",equalTo("xxxxxxxxxxxx1732"))
		//.expectHeader("phoneExtNumber[1]","null")
		.expectBody("email[1]",isEmptyString())
		.expectBody("zip[1]",equalTo("11372"))
		.expectBody("firstName[1]",equalTo("Andrew"))
		.expectBody("address1[1]",equalTo("34-21 70th Street"))
		.expectBody("address2[1]",isEmptyString())
		.expectBody("ccBrand[1]",equalTo("M"))
		//.expectHeader("phoneNumber[1]", "null")
		.expectBody("lastName[1]",equalTo("Moore"))
		.expectBody("ccnumber[1]",equalTo("xxxxxxxxxxxx1732"))
		.expectBody("city[1]",equalTo("Flushing"))
		.expectBody("success[1]",equalTo("test"))
		.expectBody("default[1]",equalTo("false"))
		.expectBody("state[1]",equalTo("NY"));
		return rspec.build();
	}
	
	public ResponseSpecification getExistingAssociatedSocialAccountsResponseValidator()
	
	{
			ResponseSpecBuilder rspec=new ResponseSpecBuilder()
			.expectBody("[0]",equalTo("facebook"))
			.expectBody("[1]",equalTo("googleplus"));
			return rspec.build();
	}
	
	public ResponseSpecification getChildUsersResponseValidator()
	
	{
		ResponseSpecBuilder rspec=new ResponseSpecBuilder()
		//.expectBody("birthYear",equalTo("2005"))
		.expectBody("cac",equalTo("R6F69"))
		//.expectBody("firstName",equalTo("Tim"))
		//.expectBody("lastName",equalTo("Green"))
		.expectBody("parentIds",hasItem("89483339"))
		.expectBody("teacherIds",hasItem("89483338"))
		//.expectBody("birthMonth",equalTo("08"))
		.expectBody("birthDay",equalTo("26"))
		//.expectBody("interestIds",hasItem("10"))
		//.expectBody("readingLevelIds",hasItems("100", "200"))
		//.expectBody("grade",equalTo("05"))
		.expectBody("spsId",equalTo("13494551"));
		return rspec.build();
	}
	public ResponseSpecification createEnumResponseValidator(String[][] keyvalues )
	{
		ResponseSpecBuilder respec=new ResponseSpecBuilder()
			.expectStatusCode(200)
			.expectContentType(ContentType.JSON);
			addKeyValueValidations(respec,keyvalues);
			return respec.build();
	}
	
	public static void addKeyValueValidations(ResponseSpecBuilder specBuilder,	String[][] keyValues) 
	{
		specBuilder.expectBody("size()", equalTo(keyValues.length));
		for (int i = 0; i < keyValues.length; i++) 
		{
			specBuilder.expectBody("get(" + i + ").key",
			equalTo(keyValues[i][0]));
			specBuilder.expectBody("get(" + i + ").name",
			equalTo(keyValues[i][1]));
		}
	}

}
