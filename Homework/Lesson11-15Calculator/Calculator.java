package Lesson11-15Calculator;
// comentariu ce face programul
// adunarea, scadearea, imultirea, impartirea
// 1. accesibilitatea : public, private ,protected 
// 2. otional adaug : sattic / _________ / void - nu vreau nimic sa returnez
// 3. private / String, Casa, Automobil
// 4 denumire (e. add, growTre)
// 5. () -  casuta parametrilor (tip denumire)
// 6. {} - blocul metodei , in interior scriem codul are face ceva , 
// 7. dac in 3 nu e void , la urma trebuie sa scrim return // in return - poate fi : variabile, constante, expresii (matematica , chemari de metode , expresii logice )
public class Calculator {
    public double adunarea(double x,double y){
    double suma = x + y;
    return suma;}
    public double scaderea (double x,double y){
    double scad = x -y;
    return scad;}
    public double imultirea(double x,double y){ 
    double imul = x*y;
    return imul;}
    public double impartirea(double x,double y){ 
    double ipart = x/y;
    return ipart;}

     
    }
    
// 
//
//public void impartirea (){
//double impart = x/y;}



