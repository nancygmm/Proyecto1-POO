import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mar extends SMar
{

    /**
     * Constructor for objects of class Mar.
     * 
     */
    public Mar()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Delfin delfin = new Delfin();
        addObject(delfin,69,65);
        Langosta langosta = new Langosta();
        addObject(langosta,293,87);
        Langosta langosta2 = new Langosta();
        addObject(langosta2,228,329);
        Langosta langosta3 = new Langosta();
        addObject(langosta3,440,228);
        Pez pez = new Pez();
        addObject(pez,428,105);
        Pez pez2 = new Pez();
        addObject(pez2,100,226);
        Pez pez3 = new Pez();
        addObject(pez3,279,192);
        Pez pez4 = new Pez();
        addObject(pez4,406,340);
        Pez pez5 = new Pez();
        addObject(pez5,548,221);
        Obstaculo obstaculo = new Obstaculo();
        addObject(obstaculo,209,191);
        Obstaculo obstaculo2 = new Obstaculo();
        addObject(obstaculo2,358,192);
        Obstaculo obstaculo3 = new Obstaculo();
        addObject(obstaculo3,357,39);
        Obstaculo obstaculo4 = new Obstaculo();
        addObject(obstaculo4,515,334);
        Obstaculo obstaculo5 = new Obstaculo();
        addObject(obstaculo5,292,334);
        Obstaculo obstaculo6 = new Obstaculo();
        addObject(obstaculo6,90,328);
        Obstaculo obstaculo7 = new Obstaculo();
        addObject(obstaculo7,151,42);
        Obstaculo obstaculo8 = new Obstaculo();
        addObject(obstaculo8,51,126);
        Obstaculo obstaculo9 = new Obstaculo();
        addObject(obstaculo9,505,157);
    }
}
