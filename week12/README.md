Create project for Movie Search using Angular. 

1. Set up Angular project.
2. Create a search Movie component. The form should contain the title, type, and year.
3. Create a Movie details component that shows information about the movie.
4. Create a Movie list component that shows all found movies.
5. Create a model with the following properties: title, year, imdbId, type, and poster.
6. Create a service that fetches information for movies from https://www.omdbapi.com/.
    One path looks like : https://www.omdbapi.com/?s=Break&type=series&y2015&apikey=739f867a
    #### Path explation: 
    - s - title
    - type = movie, series, episode
    - y - year

    The result from the call: 
    ```json
    {"Search":[{"Title":"Prison Break","Year":"2005–2017","imdbID":"tt0455275","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BMTg3NTkwNzAxOF5BMl5BanBnXkFtZTcwMjM1NjI5MQ@@._V1_SX300.jpg"},{"Title":"Make It or Break It","Year":"2009–2012","imdbID":"tt1332030","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BN2MyZjZlMDMtNDM0Yy00ZjA3LThkNWEtYzY4MTEyNjEzOTk2XkEyXkFqcGdeQXVyMTkzODUwNzk@._V1_SX300.jpg"},{"Title":"Day Break","Year":"2006–2007","imdbID":"tt0801425","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BYjNmNTI0OTAtYWI3NS00OTI2LTgyOGUtZTk1YTRmNGM4MmI3XkEyXkFqcGdeQXVyNTA4NzExMDg@._V1_SX300.jpg"},{"Title":"The Break","Year":"2016–2018","imdbID":"tt4792480","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BYjg3NjkyMzYtYWRiMi00ZDE3LWIzZGEtMTAwYWJiNWFlZGQ1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg"},{"Title":"Gimme a Break!","Year":"1981–1987","imdbID":"tt0081869","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BNTE5NTAxYTctYjI5Yi00ZTc5LWI3NDktMmQ0NWYwYTFhMjQ2XkEyXkFqcGdeQXVyODk1MjAxNzQ@._V1_SX300.jpg"},{"Title":"Break Point","Year":"2023–","imdbID":"tt17048442","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BNGFiMThhZmMtYjdiOC00YmI4LWI0YjItNDAwNTZmMWM2NjIxXkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_SX300.jpg"},{"Title":"Reef Break","Year":"2019","imdbID":"tt8892926","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BNTZjM2E3MDAtMjY5Yi00ZmY3LWFmYTYtNWNjMmM4YWE3Yzg3XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg"},{"Title":"Quantum Break","Year":"2016","imdbID":"tt4576352","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BMjZkYTY2YzQtMGVhNC00OTZmLTk1MmYtZjJlNGJlMzY3MDFmXkEyXkFqcGdeQXVyMTA1OTAyOTI@._V1_SX300.jpg"},{"Title":"The Break with Michelle Wolf","Year":"2018","imdbID":"tt8010342","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BNzM5Nzk1MTUxNF5BMl5BanBnXkFtZTgwNjc3OTU1NTM@._V1_SX300.jpg"},{"Title":"Break It All: The History of Rock in Latin America","Year":"2020","imdbID":"tt13570366","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BNTYxMTA5Y2YtNjBjYy00OWZiLTk4NzMtNzc5YjE3MGFiMTkxXkEyXkFqcGdeQXVyNjEwNTM2Mzc@._V1_SX300.jpg"}],"totalResults":"163","Response":"True"}
    ```

