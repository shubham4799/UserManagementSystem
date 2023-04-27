# USER MANAGEMENT SYSTEM
## This Spring project is a user management system with CRUD operations for managing user information. The system includes attributes for UserId, Name, UserName, Address, and Phone Number. The application allows for adding, updating, and deleting user data. The project can be used as a template for creating a user management system and can be customized further to fit specific business needs.
## LANGUAGE AND FREAMWORK
### JAVA, SPRING BOOT
## DATA ATTRIBUTES
### 
    userId
    userName
    Email
    Address
    phoneNumber
## DATA STRUCTURE
     CONTROLLER
     SERVICE
     REPOSITORY
     USER
## OPERATION TO RUN PROGRAM
    1) Add user info
    In AddUser functionality we Post User info through Postman and it gets added to the User list -
    - localhost:8080/addUser
    
    2) Update user 
    In Update user functionality we update the user info through postman.
    - localhost:8080/updateUserInfo/

    3) GetAll user
    In GetAll user functionlity we can see all user in our list.
    - localhost:8080/getAllUsers

    4) Getuser By id
    In this functinality we wil get the particular user 
    - localhost:8080/getUser/{userId}
    
    5) Delete user
    In delete user functionality we can remove the user in userlist 
    - localhost:8080/getAllUsers/deleteUser/{userid}

