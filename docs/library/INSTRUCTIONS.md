# Library

For this workshop we are going to create an api that handle `books` in a 
`library` and `collections`.

## Authentication

The authentication is going to have a time limit of `1 minute`.

## Storage

- The application needs to work with in memory storage at the start.
- The application needs to have a permanent storage mechanism once all the 
endpoints are implemented using the in `memory` mechanism.

## Library

This is a group of books that belongs to the user. This is a list of 
restriction regarding `library`:
- You can only have one book with the unique identifier `isbn`
- There is no max to the amount of books in the library
- If you remove a book from the library you remove from all of the collections

## Collections

This are group of books from the library, the restrictions for a collection 
are:
- You can only have one book with the unique identifier `isbn`
- There is no max to the amount of books in the collection
- The book needs to exist in the library to be added to the collection.