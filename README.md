# Problem Domain
- Time management
- Optimization

# Project Description
A webapp that utilizes the google maps api to optimize student's schedules by considering factors such as distance between classes, average hours of classes per day, and time between classes. The user interface would show the top X results, as well as a map of uoft with pinpoints and routs showing where all the users classes are and the most optimal route to take.

# Link to API
https://developers.google.com/maps/documentation/distance-matrix/distance-matrix
https://github.com/googlemaps/google-maps-services-java#readme

# Screenshot of GET request
![Get request output example](img.png)
# Example output of running Java code
![output of example GET request](img_2.png)
# Techinical problems
- We needed an efficient way to access all of UofT's courses and their location and time, but we couldn't find a public API that offered that service.