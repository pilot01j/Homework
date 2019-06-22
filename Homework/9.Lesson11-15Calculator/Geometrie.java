package Lesson11-15Calculator;
/*@author pilot*/
//calculeaza aria si perimetru unui dreptungi si unui patrat 
public class Geometrie {
 
    public double patrat_aria (double p){ 
    double aria = p*p;
    return aria;}
    public double patrat_perimetru (double p){
    double perimetru = 4*p;
    return perimetru;}
    public double deptungi_aria (double lat, double lon){ 
    double aria = lat*lon;
    return aria;}
    public double dreptunghi_perimetru (double lat, double lon){
    double perimetru = (lat+lon)*2;
    return perimetru;}
    
    
    }
    


