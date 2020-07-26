Requirements:
1. Admin should be able to login/logout - done
2. Admin should be able to change password - done
3. Admin can add/delete/modify products
4. Admin can change product categories
5. Admin can view list of all users
6. Admin can search users by name
7. Admin can view purchase reports
8. Admin can filter the purchase reports by date and categorys


Technologies Used:
Spring Boot
MySQL
Lombok
Spring Security
Spring MVC
Thymeleaf
Spring JPA (Hibernate implementation)
Spring REST
Swagger 2

Login:
Username: admin
Password: admin (store as encrypted in mysql db)
You will see the index.html page where the admin can logout or change password


Swagger UI
http://localhost:8080/swagger-ui.html


Request URL:
http://localhost:8080/product/add

Request:
curl -X POST "http://localhost:8080/product/add" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"cost\": 0, \"dateCreated\": \"2020-07-26T13:13:39.767Z\", \"description\": \"string\", \"id\": 0, \"manufacturerName\": \"string\", \"model\": \"string\", \"name\": \"string\"}"

Response:
Code	200	
Response headers
 connection: keep-alive 
 content-length: 0 
 date: Sun, 26 Jul 2020 13:13:49 GMT 
 keep-alive: timeout=60 


