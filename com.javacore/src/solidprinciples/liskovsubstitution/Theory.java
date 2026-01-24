package solidprinciples.liskovsubstitution;

public class Theory {

/**
 * subclass should be substituable for their base class
 *
 * yeh bht basic lagte lekin sabse jyada yahi break hote hai production m
 *
 *
 *
 * -> A (parent) class - a(),b(),c()
 * -> B (child) class - a(),b(),c(),d(),e()
 * child class should never narrow down the functionlity of parent class
 * -> yahi inheritance bolta haii..
 *
 * -> client hai usne  A ka refernce banaya hai then it should get all the  A methods from B objects too
 *
 * Account (interface ) -> deposit(),withdraw()
 * SavingAccount -> extends Account and we can access deposit and withdraw
 * CurrentAccount -> extends Account and we can access deposit,withdraw
 * FixedDeposit -> extends Account we can't have withdraw()
 * */

}
