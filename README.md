//Paper Stone and Scissor (PSS) Gaming
User Can Choose from between 1 to 3 （likewise Stone, Scissor and Paper).
Required :
1. Spring boot framework.
2. MYSQL 

How to run:
•	Find Main Class from package class "Application"
•	Run as Spring boot or Server Application
To Check or review source code please find "PSSController" from web.controller package.

Example 1:
http://localhost:8080/API/wanttoplay?name=Zhen
result :message :ok 

Example 2: 
http://localhost:8080/API/choice?choice=2&name=Tom
result :
{
    "id": 18,
    "userName1": "Tom",
    "choice": "paper",
    "userName2": null,
    "message": "lose"
}
Example 3:
http://localhost:8080/API/result
[
    [
        10,
        "Tom",
        "scissor",
        "win"
    ],
    [
        11,
        "Zhen",
        "paper",
        "lose"
    ],]

Note : Finally we can convert to Json.parse using Angular or Ajax in front-end frame work .
