# Pokemon

For this workshop we are going to create an API to handle pokemons `rosters` and `party`.

## Authentication

The authentication is going to have a time limit of `1 minute`.

## Storage
- The application needs to work with in memory storage at the start.
- The application needs to have a permanent storage mechanism once all the endpoints are implemented using the in `memory` mechanism.

## Rosters

This are a group of all the pokemons that are available to the user. This is a list of restriction regarding `rosters`:
- There is a max of `10` pokemons per `roster`. 
- Pokemons are unique in the `roster`
- If a pokemon is remove from a `roster` and that pokemon existen in a `party` it needs to be remove form the `party`  as well.

## Party

This is a group of pokemons that a user is going to use to battle, this are the restrictions for a `party`:
- There is a max of `6` pokemon per `party`.
- Pokemons are unique in the `party`
- Pokemons needs to exist first in the `roster` before they are added to a `party`