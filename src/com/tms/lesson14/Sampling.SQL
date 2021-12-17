SELECT * FROM humans WHERE dateOfBirth > '1994-01-01';

SELECT count(*), sex FROM humans group by sex;

SELECT
    h1.name,
    h3.name
FROM humans h1
         left join hobbiesofpeople h2 on h1.id = h2.human_id
         left join hobby h3 on h2.hobby_id = h3.id;

SELECT
    h1.name As name,
    count(h3.name) AS col
FROM humans h1
         left join hobbiesofpeople h2 on h1.id = h2.human_id
         left join hobby h3 on h2.hobby_id = h3.id
GROUP BY h1.name
HAVING  count(h3.name) > 1;


SELECT
    h1.name As name
FROM humans h1
         left join hobbiesofpeople h2 on h1.id = h2.human_id
         left join hobby h3 on h2.hobby_id = h3.id
         left join hobbyTypes h4 on h3.hobbyType_id = h4.id
WHERE  h4.name = 'Passive'
GROUP BY h1.name;


SELECT
    h2.name,
    count(h2.name) AS col
FROM hobby h1
         left join hobbyTypes h2 on h1.hobbyType_id = h2.id
GROUP BY h2.name;


SELECT
    h1.name,
    h2.name
FROM hobby h1
         left join hobbyTypes h2 on h1.hobbyType_id = h2.id


