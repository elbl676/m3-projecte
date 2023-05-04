# m3-projecte

Eloy Blasco Tortajada 1r DAW
![Untitled](https://user-images.githubusercontent.com/119842178/235850357-caec9232-e442-406d-bc7e-b723ad9d799f.png)
1. Login
![Captura de 2023-05-03 08-55-10](https://user-images.githubusercontent.com/119842178/235850553-f12b244e-d789-4167-80c9-ea94ae046a52.png)
Començarem amb el Login,tenim una serie d'usuaris i contrasenya amb les seves dades enmagatzemades en un array-List on amb aquests usuaris haurem d'iniciar sessió,tenim la condició de que només tenim 3 intents per realitzar l'inici de sessió,1 cop haguem realitzat els 3 intents i no haguem encertat se'ns bloquejarà el nostre usuari.
2. Menu
![Captura de 2023-05-03 09-07-09](https://user-images.githubusercontent.com/119842178/235851615-6e14e796-eb45-4fb9-8710-03be7e7bef5c.png)
Un cop hem realitzat l'inici de sessió correctament,ens redirigirà a la pàgina de menu que veiem a sobre,llavors podrem anar consultant les accions que a l'usuari l'interesi en aquell moment,com pot ser saldo client,ingresar o retirar diners o realitzar una transferéncia.
3. Saldo_client
![Captura de 2023-05-03 09-12-59](https://user-images.githubusercontent.com/119842178/235852587-3c40c9fb-11ab-48b7-8630-7c79aafb9abd.png)
Un cop entrem al botó saldo client veurem la pantalla que es veu a sobre,per començar es veuran les dades del nostre client,per veure les dades del nostre client corresponent,haurem d'haber creat els getters i setters corresponents a la classe Usuario,on s'emmagatzemen les dades.
Ho mostrarem amb un u.get i la variable corresponent amb el nom del textField corresponent.
3.1 Botons dintre de saldo_client
Dintre de saldo_client tenim 5 botons adicionals com son: comptes,on podrem escullir el tipus de compte que a nosaltres ens interesi en aquell moment,prestec per demanar un prestec,facturas per realitzar el pagament de les nostres factures,xecs per realitzar el pagament d'un xec i per acabar switch to Primary view per tornar al menu.
3.1.1 comptes
Com he dit abans si cliquem el botó comptes,ens redirigirá a una pantalla on podrem escollir entre compte corrent i compte d'estalvis.
-Compte corrent:Dintre del compte corrent ens sortirà les dades del client i el saldo que tenim actualment en la conta.
Per poder ficar el sou ens ho calcula a través del botó sou,després tenim el botó menu per poder tornar al nostre menu principal.
-Compte d'estalvis: Sortirien les mateixes dades que el compte corrent,pero en el sou sería diferent,per que tindriem un saldo d'estalvis assignat,també tindriem el botó menu per tornar al menu principal.
3.1.2 Prestec
![Captura de 2023-05-03 09-54-20](https://user-images.githubusercontent.com/119842178/235860455-0c979796-9880-4789-8466-35009dcba383.png)
Dintre del botó Prestec podem veure com seleccionarem la quantitat que volem demanar un prestec,llavors en redirigirá a una pantalla on ens dirá que haurem d'esperar a que ens el concedeixin o no,per accedir a aquesta pantalla clicarem el botó finalitzar.
![Captura de 2023-05-03 09-59-48](https://user-images.githubusercontent.com/119842178/235861299-0ff2137e-6425-4e80-9c2e-350dd05a28ad.png)
Un cop entrem en aquesta pantalla anirem al botó veure peticions per veure l'historial de peticions amb informació corresponent
![Captura de 2023-05-03 10-01-22](https://user-images.githubusercontent.com/119842178/235861609-23b6d5a7-41ae-4b5f-a801-1aa01b257ec4.png)

Ens apareixerà aquesta pantalla on tenim el botó menú que retornará al menu principal.



3.1.3 Facturas

![Captura](https://user-images.githubusercontent.com/119842178/236003916-b6f737da-226a-4f91-8cbe-6eba08a76f09.PNG)

Un cop entrem a factures veurem aquesta pantalla on introduirem el preu que ens indica amb un assumpte i clicarem a realitzar pagament

![Captura1](https://user-images.githubusercontent.com/119842178/236004349-4da5c92e-1262-431a-acb5-fee34dc47811.PNG)

Llavors ens sortirà la factura completa de totes les accions per obtenir la factura final.

També tenim un botó menu on podrem tornar al nostre menu.

3.1.4 Xecs

![Captura2](https://user-images.githubusercontent.com/119842178/236004803-62162138-c4d0-425e-9d94-942168e13373.PNG)

Per acabar aquesta secció tenim els xecs que haurem d'introduir la quantitat a pagar i ens anira actualitzant el saldo,es a dir introuirem una quantitat de diners ens sortirá el total i ens ho restarà del saldo degut a que es per realitzar un pagament.

Per acabar aquesta secció tenim el botó menu que torna al menu.

Com a conclusió diré que he tret la mateixa plantilla pels xecs,factures,prestecs i ingresar i retirar diners per que em va agradar la visualitzacio.

4.Retirar diners
