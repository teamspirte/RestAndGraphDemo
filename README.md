Steps

Reload the project as maven
Create the data in my sql create database emptestdb; use emptestdb; commit;
Endpoint testing: GraphQL: http://localhost:8085/graphql Rest Endpoints: GET: localhost:8085/api/employee GET: localhost:8085/api/employee/{empId} --empId replace with 1, 2, or etc POST: localhost:8085/api/employee Json rawInput: { "name": "Sachin", "age": 45.2, "city": "Mumbai" }
