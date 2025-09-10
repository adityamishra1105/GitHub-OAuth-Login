<h1 align="center"> GitHub OAuth Login Implementation </h1>

## Features
```bash
1 - Complete OAuth 2.0 Authorisation Code flow implementation
2 - GitHub authentication integration
3 - User profile data retrieval and display
4 - Responsive UI with Bootstrap and custom CSS
5 - Spring Security configuration
```
## Technologies
```bash
Technologies
Java 17
Spring Boot 3.1.0
Spring Security OAuth2 Client
Thymeleaf
Bootstrap 5
```
## Configuration
<li> 1 - Go to GitHub Settings > Developer Settings > OAuth Apps </li>
<li> 2 - Create a new OAuth application with: </li>
<li> 3 - Homepage URL: http://localhost:8080 </li>
<li> 4 - Authorisation callback URL: http://localhost:8080/login/oauth2/code/github </li>
<li> -> Copy the Client ID and Client Secret
-> Update src/main/resources/application.properties: </li>

```bash
spring.security.oauth2.client.registration.github.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_CLIENT_SECRET
```
## Running the Application
```bash
mvn spring-boot:run
```
-> Access the application at: http://localhost:8080  (change the port if you want to)
## How It Works
1 - User clicks "Sign in with GitHub"
2 - Application redirects to GitHub's authorisation endpoint
3 - After authentication, GitHub redirects back with an authorisation code
4 - Spring Security exchanges the code for an access token
5 - The access token is used to fetch user data from GitHub's API
6 - User profile information is displayed

## Project Structure
<pre>
  src/main/java/com/example/githubauth/
  ├── config/SecurityConfig.java
  ├── controller/MainController.java
  └── GithubAuthApplication.java

src/main/resources/
  ├── static/css/style.css
  ├── templates/
  │   ├── index.html
  │   ├── login.html
  │   └── profile.html
  └── application.properties
</pre>

## License
MIT LICENSE

## By 
Aditya Mishra. 
Happy Coding </>.
