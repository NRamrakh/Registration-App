# To Do App

This is an android application. 
**Frame work used:** Android Studio
**Languages used:** XML, Java

## Problem Statement

Build an  application  that  uses  multiple  activities  and exchanges data among these activities. 
![image](https://user-images.githubusercontent.com/70915043/137659661-184e2bf6-14f6-4af2-bd83-483ed415eeb1.png)
![image](https://user-images.githubusercontent.com/70915043/137659749-432a2164-38f2-4bdf-a472-446d874cf285.png)


**1) Part 1 :  Registration activity (35 Points):**
The  main  activity  displays  a  form  as  shown  in  Figure  1(a).  Please  follow  the  steps  to build this activity: 
1.The   activity   requests   the   user’s   name,   email,   id   and   department   info.   The department info is retrieved by clicking the “Select” button.  Make appropriate Toasts whenever any invalid input is detected after you click Submit. 
2.Clicking  the  “Select”  button  should  start  for  result  the  “Select  Department”  activity. Upon returning from the from the “Select Department” activity, the department value selected should be displayed as shown in Figure 1(c). 
3.Clicking on the Submit button should start the “Profile” activity to display the current user profile.

**Part 2: Select Department Activity (35 Points):** 
1.Clicking  on  the  “Select”  button  in  the  Registration  activity  should  start  the  “Select Department” activity for result. This is shown in Figure 1(b). 
2.The  user  is  able  to  select  a  department  from  the  displayed  Radio  Group.  Clicking “Submit” should send back the selected department to the “Registration” activity and finish  the  current  activity.  Clicking  “Cancel”  should  simply  finish  the  current  activity which will show the “Registration” activity. 
3.You should  start this activity for result.  

**Part 3: Profile Activity (30 Points):** 
1.After you fill up the form, and click on Submit, the app should take you to the Profile Activity as shown in Figure 2(a). 
2.You should create a Profile class implementing Serializable or Parcelable interface. Profile  class  should  have  all  the  elements  needed  to  display  them  in  a  different activity.
3.Use  explicit  intent  to  start  this  activity  from  the  registration  activity,  and  send  the Serializable or Parcelable data from the main activity to this activity. 4.Display the Name, Email, ID and Department. 

## Snapshots of App
![choose department](https://user-images.githubusercontent.com/70915043/137659866-25edfba1-a274-4997-8a00-83aecb6cbe2c.PNG)
![register](https://user-images.githubusercontent.com/70915043/137659873-9383006f-0a3f-45f5-8602-8836b22d58ac.PNG)
![view profile](https://user-images.githubusercontent.com/70915043/137659881-74737fdd-3a45-43b8-9074-a93ebe523323.PNG)



