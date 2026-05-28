package designpatterns.creational.Builder;

public class BuilderTheory {

    private String url;
    private String method;
    private int timeout;
    private String header; // content type header
    private String queryParam;
    private String body; // post request m bhejte h

    // jab hum http call krte hai ek service s doosre service tk call jata hai toh
    // hum yh parameters bhejte hai..


/**
 * Agr hum isko object banayenge toh problems that may occur -
 * 1. constructor overloading (telescoping)
 * 2. Lets constructor overloading ki problem ko dhoor krne k liye ->
 * say ki maine constructor main main fields lelia uske baad main settters k through
 * field set krde in my client code.
 * 3.INCONSISTENT  STATE PROBLEM   And jaise hi req.execute() or req.build() ko call krunge toh mera final object ban jana chaiye
 * but It can also be possible ki maine post req kre aur body ni bjeje toh runtime errors k chances
 * ho sakte hai , and runtime errors are worst . Kyuki jb req.exectue() ko call krenge
 * toh hamare pass poore fields ni ho sakte
 * 4.validation  ki problem ki jagha jagha hum different different validation lagane padenge
 * in differnt differnt constructor .
 * Agr maine sab kuch sahi likha hai toh req.execute m bhi mujhe validation laga padega
 * if(req.url == null) then throw exception jaha jaha bhi maine req object ko use krunge wha wha pr mujhe
 * validation check krne padenge
 *
 * */

}
