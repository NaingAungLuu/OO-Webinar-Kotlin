import classes.GalaxyNote10
import classes.IPadPro
import classes.Iphone11
import classes.Person
/*
    Generated By Harry
 */
fun main(args: Array<String>) {

    val iPadPro = IPadPro("12.9 Inches")

    iPadPro.callSiri()
    iPadPro.playFortnite()
    iPadPro.connectToInternet()

    val iphone11 = Iphone11("6.1 Inches")

    iphone11.callSiri()
    iphone11.callToNumber("09123456789")
    iphone11.connectToInternet()


    val galaxyNote10 = GalaxyNote10("6.3 Inches")

    galaxyNote10.callGoogleAssistant()
    galaxyNote10.callToNumber("09123456789")
    galaxyNote10.connectToInternet()

    //Function Extensions Demo
    val person = Person("Harry" , "Potter")
    person.greet()
    //Prints "Hello Harry Potter"

}

//Extension Functions
fun Person.greet() {
    println("Hello $firstName $lastName")
}