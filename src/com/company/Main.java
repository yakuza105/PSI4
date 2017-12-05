package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static  double p = 0.01;
    private static  double p2 = 0.1;
    private static double tabA[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1};
    private static double tabB[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0};
    private static double tabC[] = {0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0};
    private static double tabD[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0};
    private static double tabE[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
    private static double tabF[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0};
    private static double tabG[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1};
    private static double tabH[] = {1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1};
    private static double tabI[] = {1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0};
    private static double tabJ[] = {0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0};
    private static double tabK[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1};
    private static double tabL[] = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1};
    private static double tabM[] = {1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1};
    private static double tabN[] = {1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1};
    private static double tabO[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0};
    private static double tabP[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0};
    private static double tabQ[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1};
    private static double tabR[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1};
    private static double tabS[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1};
    private static double tabT[] = {0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0};
    // testowe
    private static double tabPP[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
    private static double tabAA[] = {0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0};
    private static double tabBB[] = {1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0};
    private static double tabCC[] = {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0};












    public static void main(String[] args) {
        int k = 20;
        int liczbaliter = 4;
        int lneuronów = 20;


        List<NeuralCell> neuronList = new ArrayList<>();
        List<Double> wagiNeuronu;
        List<Double> wejscia ;
        for (int i = 0; i < lneuronów; i++) {
            wagiNeuronu = new ArrayList<>();
            wejscia = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                double losowa = ThreadLocalRandom.current().nextDouble(-1.0, 1.0);
                double losowa2 = ThreadLocalRandom.current().nextDouble(0.0, 1.0);
                wagiNeuronu.add(losowa);
                wejscia.add(losowa2);
            }
            neuronList.add(new NeuralCell(wagiNeuronu , wejscia));

        }






//uczenie bez współczynika
     /* for (int i = 0; i <500 ; i++) {
            zmienwejscie(neuronList, tabA);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabB);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabC);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabD);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabE);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabF);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabG);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabH);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabI);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabJ);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabK);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabL);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabM);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabN);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabO);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabP);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabQ);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabR);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabS);
            lernmore(neuronList , p);
            zmienwejscie(neuronList, tabT);
            lernmore(neuronList , p);



        }*/
     // uczenie z wsp zapominania
        for (int i = 0; i <500 ; i++) {
            zmienwejscie(neuronList, tabA);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabB);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabC);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabD);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabE);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabF);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabG);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabH);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabI);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabJ);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabK);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabL);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabM);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabN);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabO);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabP);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabQ);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabR);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabS);
            lernmore2(neuronList , p,p2);
            zmienwejscie(neuronList, tabT);
            lernmore2(neuronList , p,p2);



        }
        // wyświetlanie
        System.out.println("    A      B      C     D      E      F      G      H      I      J      K      L      M      N      O      P      Q      R      S      T ");
        zmienwejscie(neuronList, tabAA);
        wys(neuronList);
        zmienwejscie(neuronList, tabBB);
        wys(neuronList);
        zmienwejscie(neuronList, tabCC);
        wys(neuronList);
        zmienwejscie(neuronList, tabPP);
        wys(neuronList);/*
        zmienwejscie(neuronList, tabE);
        wys(neuronList);
        zmienwejscie(neuronList, tabF);
        wys(neuronList);
        zmienwejscie(neuronList, tabG);
        wys(neuronList);
        zmienwejscie(neuronList, tabH);
        wys(neuronList);
        zmienwejscie(neuronList, tabI);
        wys(neuronList);
        zmienwejscie(neuronList, tabJ);
        wys(neuronList);
        zmienwejscie(neuronList, tabK);
        wys(neuronList);
        zmienwejscie(neuronList, tabL);
        wys(neuronList);
        zmienwejscie(neuronList, tabM);
        wys(neuronList);
        zmienwejscie(neuronList, tabN);
        wys(neuronList);
        zmienwejscie(neuronList, tabO);
        wys(neuronList);
        zmienwejscie(neuronList, tabP);
        wys(neuronList);
        zmienwejscie(neuronList, tabQ);
        wys(neuronList);
        zmienwejscie(neuronList, tabR);
        wys(neuronList);
        zmienwejscie(neuronList, tabS);
        wys(neuronList);
        zmienwejscie(neuronList, tabT);
        wys(neuronList);
        System.out.println("    A      B      C     D      E      F      G      H      I      J      K      L      M      N      O      P      Q      R      S      T ");
wys2(neuronList);



*/














    }


    public  static  void  wys(List<NeuralCell> x){

            for (int j = 0; j <x.get(0).getInputSize() ; j++) {
                java.text.DecimalFormat dff = new java.text.DecimalFormat("0.000");
                java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
                if(x.get(j).finalizeData(x.get(j).getMembranePotential()) > 0.9 )

                System.out.print("\033[31m"+"  " + dff.format(x.get(j).finalizeData(x.get(j).getMembranePotential()))  );
                else
                    System.out.print("\033[37m"+"  " + df.format(x.get(j).finalizeData(x.get(j).getMembranePotential())));



            }
            System.out.println();
        }


    public  static  void  wys2(List<NeuralCell> x){
        for (int i = 0; i < x.size(); i++) {


            for (int j = 0; j < x.get(0).getInputSize(); j++) {
                java.text.DecimalFormat dff = new java.text.DecimalFormat("0.000");
                java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
                if (x.get(i).getInputWeight(j) > 0 && x.get(i).getInputWeight(j)<10 ) {

                    System.out.print("\033[31m" + "  " + dff.format(x.get(i).getInputWeight(j)));
                }
                 else if (x.get(i).getInputWeight(j) >= 10 ) {


                     System.out.print("\033[34m" + "  " + df.format(x.get(i).getInputWeight(j)));
                 }

                else if (x.get(i).getInputWeight(j) <= -10 ) {

                    java.text.DecimalFormat dfff = new java.text.DecimalFormat("0.0");
                    System.out.print("\033[34m" + "  " + dfff.format(x.get(i).getInputWeight(j)));
                }

                else
                    System.out.print("\033[37m" + "  " + df.format(x.get(i).getInputWeight(j)));


            }
            System.out.println();
        }
    }



   // }





    public static void zmienwejscie(List<NeuralCell> x ,double[] tab ){



        for (int j = 0; j <20; j++) {
            for (int i = 0; i <x.size() ; i++) {
                x.get(i).setInputData(j,tab[j]);
            }



        }



    }




    public static void lernmore(List<NeuralCell> x ,double wsp){
        for (int j = 0; j <x.size() ; j++) {



                x.get(j).ucz(wsp);



        }


    }
    public static void lernmore2(List<NeuralCell> x ,double wsp , double wsp2){
        for (int j = 0; j <x.size() ; j++) {



            x.get(j).ucz2(wsp, wsp2 );



        }


    }




    public static void rysuj(double[] tab ){
        System.out.print("\n");
        int k = 0 ;
        for (int i = 0; i <5 ; i++) {

            System.out.print("");
            for (int j = 0; j <4 ; j++) {
                if(tab[k]>0){
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
                k++;


            }
            System.out.print("\n");

        }

        System.out.print("\n");

    }


}

