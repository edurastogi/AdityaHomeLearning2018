CREATE TABLE #car
(
    car_id int
)

CREATE TABLE #driver
(
    driver_id int,
    car_id    int
)

TRUNCATE TABLE #car

INSERT INTO #car(car_id)
VALUES (1),
       (2),
       (3),
       (4),
       (5),
       (6)

INSERT INTO #driver(driver_id, car_id)
VALUES (1, 1),
       (2, 1),
       (3, 2),
       (4, 2),
       (5, 3)

SELECT TOP 10 *
FROM #car
SELECT TOP 10 *
FROM #driver

SELECT a.car_id
FROM #car a
         LEFT OUTER JOIN #driver b ON a.car_id = b.car_id and b.driver_id IS NULL

SELECT DISTINCT a.car_id
FROM #car a
         LEFT OUTER JOIN #driver b ON a.car_id = b.car_id
WHERE b.driver_id IS NULL