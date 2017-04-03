# Films


Films is a Spring application to store films rating.

# Evaluation CRUD
Full implementation of CRUD for Evaluation. You can:

  - GET by ID.
  - GET by Category, Film and/or User.
  - POST new evaluations.
  - PUT any evaluation.
  - DELETE any evalution.




## Manual
### GET

#### Option 1
Request with ID:
```http
http://localhost:8080/evaluation/id
```
Response:
```json
{
    "points": points,
    "user": userName,
    "film": filmTitle
}
```

#### Option 2
Request with CategoryID, FilmID and/or UserID:
```http
http://localhost:8080/evaluation?IdCategory=x&IdUser=x&IdFilm=x
```
Response:
```json
[{
    "points": points,
    "user": userName,
    "film": filmTitle
}]
```
### POST
Request:
```html
http://localhost:8080/evaluation
```
Body:
```json
{
    "points": points,
    "user": userID,
    "film": filmID
}
```
Response:
```json
{
    "points": points,
    "user": userName,
    "film": filmTitle
}
```

### PUT
Request:
```http
http://localhost:8080/evaluation/id
```
Body:
```json
{
    "points": points,
    "user": userID,
    "film": filmID
}
```
Response:
```json
{
    "points": points,
    "user": userName,
    "film": filmTitle
}
```

### DELETE
Request:
```http
http://localhost:8080/evaluation/id
```