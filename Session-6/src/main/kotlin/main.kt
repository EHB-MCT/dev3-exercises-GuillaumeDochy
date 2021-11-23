import java.sql.*
import java.util.*

fun main(){
    val credentials = Cred()
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
// Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password
// Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    var inputCity = readLine()

    val statement = connection.prepareStatement("SELECT * FROM rides WHERE destination = '$inputCity' ORDER BY departure_time ASC LIMIT 1")
    val result = statement.executeQuery()

    while (result.next()){
        var id = result.getInt("id")
        var departure_city = result.getString("departure_city")
        var destination = result.getString("destination")
        var departure_time = result.getString("departure_time")

        println("The next train from " +departure_city+ " to " +destination+ " departs at " +departure_time)
    }
}