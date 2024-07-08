# Library Project
### Desktop System developed in Java Language for a books loan management of a library

## Techs used
- Java 17.0.6 (libraries Swing, Date, LocalDate, SimpleDateFormat, SQL*, Connection, DriveManager, List, Litenner)
- Jasperreports 6.21.3
- Driver MySQL Connector/J 8.0.33

## Aplication Architecture
### Design Model View Control (MVC) with connection Singleton
<pre>
> ###### |./java
> ###### |     ./br.unimontes.library.management
> ###### |        ./controller -> Integration between view and services with addListenner
> ###### |        ./model 
> ###### |            ./dao -> Data Access Object of all systems entities, connection unit with JDBC in DBSingleton
> ###### |            ./entity -> POJO entities
> ###### |            ./services -> Service rules
> ###### |        ./view -> Display screen desktop
</pre>
## Functionalities
- Signup user and employee
- Registration books, author and publisher
- Reports generation
- To make loan
  
## How to work
- Install JVM 17
- Clone then repositoty
- Execute 'java java/Library1' in console or terminal command
