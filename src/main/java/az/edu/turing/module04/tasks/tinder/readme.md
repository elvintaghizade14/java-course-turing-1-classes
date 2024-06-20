## The task

#### Create the MVP of a dating app similar to Tinder

You can find ready HTML templates of all needed pages in the [templates](./templates) folder.

#### Teamwork

All students will work on this project in groups of three persons. Group members may split the tasks on their own
discretion.

## A list of the working endpoints in a fully finished application:

- /users
- /liked
- /messages/{id}
- /login

## Suggested order of tasks execution (you are not required to follow it):

1. Create a new Maven app. Add required dependencies
2. Launch Jetty web-server
3. Create a test servlet which will output simple message 'Hello world' in the browser window
4. Map the test servlet to the "/users" path
5. Output a static HTML page with four elements - name, photo (a link to any picture from the web) and two buttons -
   Yes/No when requesting the "/users" path
6. Wrap the page in an HTML form
7. When a Yes/No button is pressed - send a POST request to the server (there is no handler there at the moment)
8. Add POST request handler on the server and store the user's choice (yes or no) on the server (in any form)
9. The doPost method should forward the request to the "/users" GET path
10. Create a few profiles (name + link to a picture from the web)
11. When a Yes/No button is pressed - show the next profile, the picture and name on the page should change
12. When the list of the available profiles runs out - start showing them again
13. Create a DAO class, store collection of profiles there
14. Add a servlet with the "/liked" address, output a static (hardcoded) list of profiles that user "liked"
15. After the user had clicked on all the available profiles, redirect him to the "/liked" page
16. "/liked" page should only show the profiles for which we pressed Yes
17. Add an "id" field to all profiles
18. Add a servlet with the "/messages/{id}" address, show a static chat with hardcoded messages there
19. When clicking on some profile on the "/liked" page, redirect to the "/messages/{id}" page where you will show a
    hardcoded dialogue with the user
20. Connect app to MySQL/PostgresSQL database (local or remote)
21. Write a new implementation of the DAO classes so that all the users are stored in the database
22. Show real messages between users on the "/messages/{id}" page
23. Add a possibility to make a POST request on the server with a new message on this page
24. Create a doPost method in the corresponding servlet, which will save the new message to the database
25. Add a simple login page to the "/login" path
26. Use Bootstrap templates as a base for all webpages
27. Use Freemarker template to output HTML pages
28. Handle POST method from the login page that will allow the user to log into the app. Store the data about the
    current user in cookies
29. Create an HttpFilter, which will redirect the non-logged in user to the login page
30. Add a possibility to log in from different accounts. Store each user's likes separately
31. Use remote database
32. Assemble the project into the executable JAR archive. Test locally that it is working
33. Deploy the project on Heroku (or AWS)
