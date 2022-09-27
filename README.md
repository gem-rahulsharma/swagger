
# Forms and Policy Service

Forms and Policy Service is the MIS Revamp project Micro-service. It is made to handle the functions for the Forms and the Policy module. It is developed in Java Spring Boot.\
Open Api 3.0 is used for designing the interface of the Restful APi's. \
The Forms and the Policies that are uploaded are not stored in the database. Those are stored on the server whose path can be changed from application.properties file. 

### Access link

[Swagger-ui](https://formsandpolicysvcapi.geminisolutions.com/) for Forms and Policy Service

## Different Branches
- **OpenApiTest:** It is for the code changes made in the open API Specification (OAS 3.0). 
- **Master:** It is the main branch for the deployment. It contains the final code changes after resolving the merge conflicts.  


## Installation

#### Pre-Requisites: 
- Java 8 or higher
- Maven 3.0+
- An IDE (IntelliJ is recommended).
- MySQL database
- Postman Tool

### Clone Project: 
```git
git clone https://github.com/Gemini-Solutions/FormsAndPolicySvc.git
```
## How to Install and Run the Project on Local

   * Clone the repo in your local from https://github.com/Gemini-Solutions/FormsAndPolicySvc.git using GitHub Desktop or gitbash.
   * Checkout or create new branch as per task.
   * Change active profile to dev in application.properties file.
   * Create a database in MySQL and add its name along with your database credentials i.e. username and password, in application.properties file.
   * Modify path for log file.
   * Build the project using mvn clean install.
   * Run service by running MisApplication class.
   * Application running on port no 8080 by default.

## Dependencies

There is mysql are a number of third-party dependencies used in the project. 

```dependencies
<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
</dependency>
<dependency>
			<groupId>org.openapitools</groupId>
			<artifactId>openapi-generator</artifactId>
			<version>${openapiGenerator.version}</version>
</dependency>
```
## Request methods
The request method is the way we distinguish what kind of action our endpoint is being "asked" to perform
| Method   | Description                              |
| -------- | ---------------------------------------- |
| `GET`    | Used to retrieve a single item or a collection of items. |
| `POST`   | Used when creating new items e.g. a new user, post, comment etc. |
| `PATCH`  | Used to update one or more fields on an item e.g. update e-mail of user. |
| `PUT`    | Used to replace a whole item (all fields) with new data. |
| `DELETE` | Used to delete an item.                  |

## EndPoints and  Request methods for FormsAPI
| Method   | URL                                      | Description                              |
| -------- | ---------------------------------------- | ---------------------------------------- |
| `GET`    | `/forms`                             | get the Forms Details                      |
| `GET`    | `/forms/get-form`                          | get Form File                       |
| `PATCH`  | `/forms/update`                          | to update the Form details                 |
| `DELETE` | `/forms` | to delete the Form                    |
| `PATCH`    | `/forms` | to change the Active status |

## EndPoints and Request methods for PolicyAPI
| Method   | URL                                      | Description                              |
| -------- | ---------------------------------------- | ---------------------------------------- |
| `GET`    | `/policy`                             | get the Policy Details                      |
| `GET`    | `/policy/get-policy`                          | get Policy File                       |
| `PATCH`  | `/policy/update`                          | to update the Policy details                 |
| `DELETE` | `/policy` | to delete the Policy                    |
| `PATCH`    | `/policy` | to change the Active status |

## EndPoints and Request methods for UserFormsAPI
| Method   | URL                                      | Description                              |
| -------- | ---------------------------------------- | ---------------------------------------- |
| `GET`    | `/user-forms`                             | Get User Forms                      |
| `GET`    | `/user-forms/get-form`                          | get User Form File                       |
| `DELETE` | `/user-forms` | To delete the user Form details                    |

## Developers
- Nikhil Sharma 
  ###### Email: <nikhil.sharma@geminisolutions.in>
- Vinay Kumar Prashar 
  ###### Email: <vinay.prashar@geminisolutions.in>
- Vivek Kumar Shukla
  ###### Email: <vivek.shukla@geminisolutions.com>
- Akansha Yadav 
  ###### Email: <akansha.a.yadav@geminisolutions.com>
- Rahul Sharma
  ###### Email: <rahul.sharma@geminisolutions.com>

## Contributing
Pull requests are welcome for any Vulnerability. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[Gemini Solutions](https://www.geminisolutions.com/)    












