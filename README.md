<div align="center">
<table>
    <theader>
        <tr>
            <th><img src="https://github.com/rescobedoulasalle/git_github/blob/main/ulasalle.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></th>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD LA SALLE</span><br />
                <span style="font-weight:bold;">CARRERA PROFESIONAL DE INGENIERÍA DE SOFTWARE</span>
            </th>            
        </tr>
    </theader>
</table>
</div>

## PATRONES DE DISEÑO: FLYWEIGHT
Flyweight o peso ligero, también conocido como Caché, es un patrón de diseño estructural que permite encajar más objetos en la cantidad de RAM disponible compartiendo partes de su estado entre múltiples objetos en lugar de mantener toda la información en cada objeto.

<h1 align="center">
  <a href="https://animejs.com"><img src="https://refactoring.guru/images/patterns/content/flyweight/flyweight.png?id=e34fbacb847dd609b5e68aaf252c4db0"  width="400"/></a>
</h1>


## Creacion de proyecto
Este proyecto esta divido en en 4 partes. Donde tenemos 4 carpetas creadas

<h1 align="center">
  <a href="two"><img src= "https://i.postimg.cc/wvFTbZWs/Captura-de-pantalla-2022-06-27-091503.png" width="600"/></a>
</h1>


En cada una de estas tendremos las diferentes clases:

## Clase principal
La clase principal es donde vamos a llamar a todas las clases, practicamente se utiliza tambien para poder generar un random acerca de las variables que se van insertando. 
<h1 align="center">
  <a href="two"><img src= "https://i.postimg.cc/BvYVYCTn/Captura-de-pantalla-2022-06-27-091108.png" width="600"/></a>
</h1>



## Clase Empleado
La clase empleado es una interfz donde añadimos los metodos que vamos a utilizar.
<h1 align="center">
  <a href="two"><img src= "https://i.postimg.cc/MTJdrrcx/Captura-de-pantalla-2022-06-27-092006.png" width="600"/></a>
</h1>


## Clase FactoryEmpleado
En FactoryEmpleado tenemos los tipos de empleos que se vana asignando dependiendo del random que se obtenga.
<h1 align="center">
  <a href="two"><img src= "https://i.postimg.cc/QCQtJC2h/Captura-de-pantalla-2022-06-27-092314.png" width="600"/></a>
</h1>


## Clase Desarrollador

<h1 align="center">
  <a href="two"><img src= "https://i.postimg.cc/j5Vt3KQ5/Captura-de-pantalla-2022-06-27-092409.png" width="600"/></a>
</h1>

## Clase Tester
<h1 align="center">
  <a href="two"><img src= "https://i.postimg.cc/52TVj1r3/Captura-de-pantalla-2022-06-27-092446.png" width="600"/></a>
</h1>


## Clase Director

<h1 align="center">
  <a href="two"><img src= "https://i.postimg.cc/YqycyMtH/Captura-de-pantalla-2022-06-27-092522.png" width="600"/></a>
</h1>
