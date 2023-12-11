**REST API in Detail**

A REST API (Representational State Transfer API) is a set of web addresses (URLs) that respond to HTTP requests in a way that allows systems to communicate and exchange data over the internet. RESTful APIs adhere to certain constraints, such as statelessness and a uniform interface, making them scalable and flexible.

**Key Principles of REST API**:

- **Statelessness**: Every HTTP request from a client to server must contain all the information the server needs to fulfill the request. The server does not store any session information.
  
- **Client-Server Architecture**: The client (user interface) and server (data storage) operate independently of each other.
  
- **Uniform Interface**: The method of communication between client and server is uniform (using standard HTTP methods such as GET, POST, PUT, DELETE).
  
- **Cacheable**: Responses must be defined as cacheable or non-cacheable to prevent clients from reusing stale data.
  
- **Layered System**: The client cannot ordinarily tell whether it is connected directly to the end server or to an intermediary along the way.

**HTTP Methods**:
- **GET**: Retrieve data from the server.
- **POST**: Send data to the server to create a new resource.
- **PUT**: Send data to the server to update an existing resource.
- **DELETE**: Remove an existing resource from the server.

**Example of REST API Usage**:

Here's a simple example in Java using the Spring Framework to create a RESTful API endpoint:

```java
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // GET method to retrieve user details
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // Logic to fetch user using id
        return userService.getUserById(id);
    }

    // POST method to create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        // Logic to save user to the database
        return userService.saveUser(user);
    }

    // PUT method to update user details
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        // Logic to update user details
        return userService.updateUser(id, user);
    }

    // DELETE method to delete a user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        // Logic to delete user
        userService.deleteUser(id);
    }
}
```

In this code snippet, we have a `UserController` class that defines four methods, each corresponding to an HTTP method. Each method is mapped to a URL pattern, and they use annotations provided by Spring to handle HTTP requests.

- `getUser` handles GET requests and is used to retrieve user information.
- `createUser` handles POST requests and is used to create a new user.
- `updateUser` handles PUT requests and is used to update an existing user's details.
- `deleteUser` handles DELETE requests and is used to remove a user from the system.

Each method calls a hypothetical `userService` to perform operations like fetching, saving, updating, or deleting a user. This service would contain the business logic and interact with the database.

The `@RestController` annotation tells Spring that this class will handle HTTP requests. The `@RequestMapping("/api/users")` annotation indicates that all the URLs in this controller will start with `/api/users`.

Using such a REST API, a client (like a web application or mobile app) can perform CRUD (Create, Read, Update, Delete) operations on user resources by sending HTTP requests to the URLs defined in the controller.
