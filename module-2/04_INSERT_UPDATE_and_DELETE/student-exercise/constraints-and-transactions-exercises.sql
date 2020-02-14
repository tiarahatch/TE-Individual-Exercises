-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name)
VALUES ('Hampton', 'Avenue'),('Lisa', 'Byway');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in 
ancient Greece', 2008, 1, 198);
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor (actor_id, film_id)
VALUES (202, 1001);

-- 4. Add Mathmagical to the category table.
INSERT INTO category (category_id, name)
VALUES (17, 'Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
UPDATE film_category
SET category_id = 17
WHERE film_id IN (274, 494, 714, 996, 1001);

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
UPDATE film
SET rating = 'G'
WHERE film_id IN (SELECT film_id FROM film_category WHERE category_id = 17);
-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (inventory_id, film_id, store_id) 
VALUES (4581, 1001, 1);
INSERT INTO inventory (inventory_id, film_id, store_id) 
VALUES (4582, 1001, 2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM film 
WHERE film_id = 1001;
--NO, B/C THE FILM_ID IS BEING USED IN ADDITIONAL TABLES

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM category
WHERE name = 'Mathmagical';
-- NO, B/C THIS IS BEING USED IN THE OTHER TABLES

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM film_category 
WHERE category_id = 17;
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM category 
WHERE name = 'Mathmagical';
DELETE FROM film
WHERE title = 'EUCLIDEAN PI';
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
SELECT * FROM inventory WHERE film_id = 1001
SELECT * FROM film_actor WHERE film_id = 1001
SELECT * FROM film WHERE film_id = 1001

DELETE FROM inventory WHERE film_id = 1001
DELETE FROM film_actor WHERE film_id = 1001
DELETE FROM film WHERE film_id = 1001;
