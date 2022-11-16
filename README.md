# coding-events-demo


1. You need to add a Person class to hold necessary info about users of our app. What fields and methods would this class hold?
2. Would you need to add any additional classes to Person to make the app work? If so, what classes would be necessary?
3. What kinds of relationships would Person have to the other classes you already created, such as the Event class?

You should write three sections. The first should describe the purpose of the app. The second should describe the current state of the app. The third and final section should describe the future improvements you want to make to the app including your notes about the Person class.

Person Class:
int id - unique to each user
String firstName
String lastName
String email
String password
---getters and setters for each field EXCEPT id, which will only have a getter

Additional classes tied into Person:
Profile class - that collects all of the above information
List<Events> eventsAttending - list of the events the user wants to attend
List<Events> eventsCreated - list of events the user has created
  
Person to List<Events> eventsAttending: many to many
Person to List<Events> eventsCreated: one to many


Section 1:
purpose of the app is for a user to be able to browse, register, and create events they are interested in attending. They would be able to create a user profile so they can register to and create events. 


Section 2:
Current state does not have the user profile capability.


Section 3:
Future improvements would be a user validation: if they are already registered under a specific email address, the site will alert them that an account with that username already exists.
