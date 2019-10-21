# nyc-neighborhood-database
  Back end server for NYC Neighborhood project
  
  ## About NYC Neighborhood
  
  NYC Neighborhood is a web application that uses the data from 311 calls to explore how
  different complaints (e.g. noise) are distributed across the city by neighborhood.  There
  are three parts to the project:
  
  1. A Mongo db (github repo nyc-neighborhood-server)
  2. Vue front end (github repo nyc-neighborhood-client)
  3. Spring Boot server (this github repo)
  
  The URL for the live app is
  
  ## Software Requirements
  
  1. maven 3.6.1+
  2. java 1.8
  
  ## Intallation
  
  1. Clone this repo to your machine.
  2. In root directory:
  
  >```./mvnw package```
  
  ## Running the Server
  
  In root directory:
  
  >```java -jar target/nyc-neighborhood-server-1.0.jar```
  
  ## API for This Project
  
  |endpoint        | description                          |
  |----------------|--------------------------------------|
  | /complaints    | get list of complaint types       |
  | /neighborhoods | get list of neighborhoods |
  | /boroughs      | get geo polygons for boundaries of the boroughs |
  | /nhoodgeo      | post list of neighborhoods get back their geo polygons. |
  | /choropleth    | post list of neighborhoods and list of complaints, get back a ranking of neighborhoods.|