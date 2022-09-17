package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willg
 */
public class clsCodigos {
    public String CodigoEx1 = "static void burbuja(int arreglo[]){"
            + "for(int i = 0; i < arreglo.lenght -1; i++){"
            + "for(int j = 0; j < arreglo.length -1; j++){"
            + "if (arreglo[j] < arreglo[j +1]){"
            + "int tmp = arreglo[j+1];"
            + "arreglo[j+1] = arreglo[j];"
            + "arreglo[j] = tmp;"
            + "}"
            + "}"
            + "}"
            + "}";
    
    public String CodigoEx2 = "<ul>"
            + "<li><a href='Page1.html'>Other Page</a></li>"
            + "<li><a href='Page2.html'>One more</a></li>"
            + "<li><a href='Page3.html'>About me</a></li>"
            + "</ul>";
}
