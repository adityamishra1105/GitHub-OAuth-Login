<h1 align="center"> GitHub OAuth Login Implementation </h1>

This project implements a complete OAuth 2.0 authentication system with GitHub integration. It showcases the Authorization Code flow, where users can sign in with their GitHub accounts, and the application retrieves and displays their profile information. Built with Spring Boot, Spring Security, and Thymeleaf, this project demonstrates real-world OAuth implementation skills that are valuable for web development roles.

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
<li> Go to GitHub Settings > Developer Settings > OAuth Apps </li>
<li> Create a new OAuth application with: </li>
<li> Homepage URL: http://localhost:8080 </li>
<li> Authorisation callback URL: http://localhost:8080/login/oauth2/code/github </li>
<li> Copy the Client ID and Client Secret </li>
<li> Update src/main/resources/application.properties: </li>

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
<li> User clicks "Sign in with GitHub" </li>
<li> Application redirects to GitHub's authorisation endpoint </li>
<li>  After authentication, GitHub redirects back with an authorisation code </li>
<li> Spring Security exchanges the code for an access token </li>
<li> The access token is used to fetch user data from GitHub's API </li>
<li> User profile information is displayed </li>

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
