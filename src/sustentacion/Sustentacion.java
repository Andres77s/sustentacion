/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author Vanegas
 */
public class Sustentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        productos arreglo[] = new productos[10];
        ventas arreglo1[]= new ventas[10];
        Scanner lector = new Scanner(System.in);
        int opcion,x=0,i=0;
        String nombre;
        int cantidad;
        int valor,tot=0;
        int venta,ganancia;
        
        do{
            System.out.println("Digite la opción deseada");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. mostrar inventario");
            System.out.println("5. Realizar venta");
            System.out.println("6. Mostrar ganacias totales");
            System.out.println("7. Salir");
            opcion = lector.nextInt();

            switch (opcion){
                case 7: System.out.println("Hasta luego");
                    break;
                case 1: 
                        System.out.println("Ingrese el nombre del producto");
                        lector.nextLine();
                        nombre = lector.nextLine();
                        System.out.println("Ingrese la cantidad de producots");
                        cantidad = lector.nextInt();
                        System.out.println("Ingrese el valor del producto");
                        valor = lector.nextInt();                        
                        arreglo[i] = new productos(nombre,cantidad,valor);
                        tot++;
                        i++;                        
                    break;
                case 2: System.out.println("Ingrese producto a buscar");
                        lector.nextLine();
                        String buscar = lector.nextLine();
                                               
                            for(i=0;i<=arreglo.length;++i) { 
                                if(buscar.equals(arreglo[i].getNombre())){
                                    System.out.println("Disponible");
                                    System.out.println("Producto:"+arreglo[i].getNombre()+
                                    "\nCantidad:"+arreglo[i].getCantidad()+
                                    "\nValor:"+arreglo[i].getValor());                                
                                }
                                else{
                                    System.out.println("No disponible");
                                }                               
                            }                             
                                                       
                    break;
                case 3: System.out.println("Ingrese producto a buscar");
                        lector.nextLine();
                        String buscar1 = lector.nextLine();                                               
                            for(i=0;i<=arreglo.length;++i) { 
                                if(buscar1.equals(arreglo[i].getNombre())){
                                    System.out.println("Disponible");  
                                    nombre = "";
                                    cantidad=0;
                                    valor=0;
                                    arreglo[i] = new productos(nombre,cantidad,valor);
                                }
                                else{
                                    System.out.println("No disponible");
                                }                               
                            }                   
                    break;
                case 4: for(i=0;i <= tot ;i++){
                          System.out.println("Producto:"+arreglo[i].getNombre()+
                                    "\n Cantidad:"+arreglo[i].getCantidad()+
                                    "\n Valor:"+arreglo[i].getValor());
                        }
                    break;
                case 5: System.out.println("Ingrese producto a buscar");
                        lector.nextLine();
                        String buscar2 = lector.nextLine();                                               
                            for(i=0;i<=arreglo.length;++i) { 
                                if(buscar2.equals(arreglo[i].getNombre())){
                                    System.out.println("Disponible");  
                                    System.out.println("ingrese la catidad que "
                                            + "desea vender");
                                    venta = lector.nextInt();
                                    arreglo1[i] = new ventas(venta); 
                                    break;
                                }else{
                                    System.out.println("No disponible");
                                }                               
                            }                   
                    break;
                case 6: for(i=0;i <= tot ;i++){
                          System.out.println("Producto:"+arreglo[i].getNombre()+
                                    "\n Cantidad:"+arreglo[i].getCantidad()+
                                    "\n Valor:"+arreglo[i].getValor()+"\nCantidad:"
                                  + "ventas:"+arreglo1[i].getVenta());
                          int vventas = arreglo1[i].getVenta()*arreglo[i].getValor();
                          System.out.println("Valor total venta:"+vventas);
                          
                        }
                    break; 
                default: System.out.println("Opción invalida");
            }
        }while(opcion!=7);
        
    }
    
}
