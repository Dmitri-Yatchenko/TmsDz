SELECT * FROM humans WHERE dateOfBirth > '1994-01-01';

SELECT count(*), sex FROM humans group by sex;

SELECT
    humans.name,
    hobby.name
FROM humans humans
         left join hobbiesofpeople hobbiesofpeople on humans.id = hobbiesofpeople.human_id
         left join hobby hobby on hobbiesofpeople.hobby_id = hobby.id;

SELECT
    humans.name    As name,
    count(hobby.name) AS col
FROM humans humans
         left join hobbiesofpeople hobbiesofpeople on humans.id = hobbiesofpeople.human_id
         left join hobby hobby on hobbiesofpeople.hobby_id = hobby.id
GROUP BY humans.name
HAVING  count(hobby.name) > 1;


SELECT
    humans.name As name
FROM humans humans
         left join hobbiesofpeople hobbiesofpeople on humans.id = hobbiesofpeople.human_id
         left join hobby hobby on hobbiesofpeople.hobby_id = hobby.id
         left join hobbyTypes hobbyTypes on hobby.hobbyType_id = hobbyTypes.id
WHERE  hobbyTypes.name = 'Passive'
GROUP BY humans.name;


SELECT
    hobbyTypes.name,
    count(hobbyTypes.name) AS col
FROM hobby hobby
         left join hobbyTypes hobbyTypes on hobby.hobbyType_id = hobbyTypes.id
GROUP BY hobbyTypes.name;


SELECT
    hobby.name,
    hobbyTypes.name
FROM hobby hobby
         left join hobbyTypes hobbyTypes on hobby.hobbyType_id = hobbyTypes.id


