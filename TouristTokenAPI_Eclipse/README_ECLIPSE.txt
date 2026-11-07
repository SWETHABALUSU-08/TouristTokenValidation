ECLIPSE-READY TOURIST TOKEN API

REQUIREMENTS
- Eclipse IDE for Enterprise Java and Web Developers, or Eclipse with Maven (m2e) support
- JDK 17 configured in Eclipse
- Internet connection for the first Maven dependency download

IMPORT INTO ECLIPSE
1. Extract this ZIP to a normal folder.
2. Open Eclipse.
3. Select File > Import...
4. Select Maven > Existing Maven Projects, then Next.
5. For Root Directory, Browse to the extracted TouristTokenAPI_Eclipse folder.
6. Confirm pom.xml is listed and checked.
7. Click Finish.
8. Wait for Maven dependencies to finish downloading.
9. If prompted, right-click project > Maven > Update Project... > select project > OK.

RUN
1. In Package Explorer, expand src/main/java > com.example.touristapi.
2. Open TouristApiApplication.java.
3. Right-click the file > Run As > Java Application.
4. Wait for "Started TouristApiApplication" in the Console.

SWAGGER
Open http://localhost:8080/swagger-ui/index.html
Expand GET /api/tourists > Try it out.
Enter Token header value: tourist123
Click Execute.

Expected valid token: 200 OK and three sample tourist records.
Missing/wrong token: 500 and {"message":"Unauthorized: Invalid Token Provided"}

The project uses an in-memory H2 database. The sample records are inserted automatically.
Database name: tourismdb
H2 JDBC URL: jdbc:h2:mem:tourismdb
H2 console: http://localhost:8080/h2-console

IMPORTANT
Open the extracted project folder as a Maven project using the import steps above. Do not open individual .java files directly from File Explorer.
The lab specification requests 500 for invalid tokens. A production API would normally return 401 Unauthorized.
