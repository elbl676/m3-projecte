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

Una altra opció que tenim seria clicar al botó Retirar diners,que seria seleccionar la quantitat de diners a extreure.

![Captura de 2023-05-04 08-38-04](https://user-images.githubusercontent.com/119842178/236128692-c1a05409-9956-4796-8474-e14c93bd6e89.png)

Aqui podem veure l'exemple d'execució,on podem veure on seleccionem la quantitat de diners a extreure,un cop hem seleccionat la quantitat ens actualitzará el saldo,i ens sorrtirá la quantitat total que hem extret.
Per acabar veiem que disposa del botó menu per tornar al menu principal.
 
5. Canviar clau

![Captura de 2023-05-04 08-41-53](https://user-images.githubusercontent.com/119842178/236129182-a593386c-1d2c-4276-ae54-8c0434684f72.png)

Aquesta acció es per canviar la clau del nostre usuari,pero no vaig aconseguir que funcionés correctament,ja que només es veu com fiquem la clau actual i la nova i teoricament s'hauria d'actualitzar pero no ho fa per que no vaig arribar a aconsiguir l'objectiu principal.
Té un botó que retorna al menu.

6. Ingresar Diners

![Captura de 2023-05-04 08-50-01](https://user-images.githubusercontent.com/119842178/236131120-004b5c6f-7f1e-47c5-a544-04d9d6868e88.png)

En l'acció de ingresar diners seria semblant a la d'extreure,seleccionarem la quantitat de diners que volem,ens actualitzará el saldo i ens mostrará la quantitat total de diners importada.

7. Transferencia

![Captura de 2023-05-04 08-54-08](https://user-images.githubusercontent.com/119842178/236131791-ac35a257-f64e-4473-bf34-73e1cd1d662a.png)

Ara tenim l'accio de realitzar una transferéncia,per començar seleccionem la quantitat de diners que volem per realitzar la transferencia,com sempre ens indicará la quantitat de diners que realitzarem la transferencia,escollirem el compte al qual realitzarem la transferencia,i clicarem al botó transferir.

![Captura de 2023-05-04 08-58-00](https://user-images.githubusercontent.com/119842178/236132526-2ea6e44e-8e6f-4f8d-a1a3-68dce91589a1.png)

Ens obrirá aquesta pantalla que indica que s'ha realitzat la transferencia,llavors els diners que hem retirat haurien d'arribar a la conta corresponent,pero no he estat capaç d'aconseguir-ho. Tindrá un botó menu per tornar al menu principal.

8. Logout

Per acabar tenim el Logout,que la seva funció es que al clicar el botó logout desconnectara de la conta corresponent. 

9. Diagrama UML

![Diagrama UML Caixer_Automàtic](https://user-images.githubusercontent.com/119842178/236133457-9c382b40-cbfa-433f-a1c2-32cf0a49c199.png)

Aqui podem veure el nostre diagrama UML

10. CONCLUSIO

Com a conclusió trec que ha estat un projecte bastant complet i dificil en certes parts que he pogut realitzar gracies a l'ajuda del professor i de llocs web que he pogut trobar,també m'ha servit per realitzar la meva 1a aplicació web i m'ha servit per aprendre el que hem treballat durant el curs,i crec que puc estar satisfet amb el treball realitzat i el resultat obtingut.



