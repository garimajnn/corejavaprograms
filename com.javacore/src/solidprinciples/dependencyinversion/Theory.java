package solidprinciples.dependencyinversion;

public class Theory {

/**
 * Terminologies
 * High level module usko bolte hai jisme business logic hai(
 * Low level module usko bolte hai jo system s interact kre(file system se, database se,)
 * *
 */


/**
 * High level modules should not depend on low level
 * module but rather both should depend on abstraction
 * *
 */


/**
 * High level should not directly interact with low level
 *
 * */



/**
 *  // high level module
 * Application ->saveToDb()
 * Main kya krunge  ki Application m has a relation bana lungi (sqldb,mongodb) and data ko database m save krlungi
 * but yaha pr high level module directly low level s baate kr rha via has a relation k through
 *
 *
 *
 * // low level module
 * SQLDB class hai jo sql m save krega
 * MongoDB class hai jo mongoDB m data save krega



 And if kl ko mujhe data mongodb ki jagha cassandra m store krna
 toh phir mujhe application class m logic change krna padega
 doosre k object laaun and then change kru

    THIS WILL BREAK OPEN CLOSE PRINCIPLE
 THEREFORE I SHOULD INTRODUCE INTERFACE BETWEEN IT JO KI INN DONO K BEECH M INTERACT KRE
 * */
 }
