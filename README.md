# Albums : 

<br>

## When the user vists the website, the pages that will be available are the following : 

<br>

1- The album page, it contains a set of albums with some information like : **/albums**

  - The title of the album.

  - The cover of the album. 

  - The artist.

  - Number of songs.

  - The length of the album (In seconds).

<br>

2- Capitalized page : **/capitalize/{word}**

  - This page takes the **{word}** from the endpoint that has been added by the user and returns it in the page with capital letters.

<br>

3- A Form that allows the user to add a new album with the saame given information. 



```
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/albums
spring.datasource.username=miral
spring.datasource.password=0000
spring.jpa.hibernate.ddl-auto=update
spring.datasource.initialization-mode=always
```