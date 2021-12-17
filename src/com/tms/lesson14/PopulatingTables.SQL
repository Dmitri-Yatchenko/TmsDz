INSERT INTO humans (name, sex, dateofbirth) VALUES
                                                ('Human1', true, '1991-04-19'),
                                                ('Human2', false, '1992-07-15'),
                                                ('Human3', true, '1995-06-20'),
                                                ('Human4', true, '1994-04-19'),
                                                ('Human5', false, '1991-03-06'),
                                                ('Human6', true, '1995-05-19'),
                                                ('Human7', true, '1995-04-27'),
                                                ('Human8', false, '1990-02-01'),
                                                ('Human9', true, '1999-06-13'),
                                                ('Human10', false, '1994-01-01');
SELECT * FROM humans;


INSERT INTO hobbyTypes (name) VALUES
                                  ('Active'),
                                  ('Passive');
SELECT * FROM hobbyTypes;


INSERT INTO hobby (name, hobbyType_id) VALUES
                                           ('Football', 1),
                                           ('Hockey', 1),
                                           ('checkers', 2),
                                           ('Chess', 2);
SELECT * FROM hobby;


INSERT INTO hobbiesOfPeople (human_id, hobby_id) VALUES
                                                     (1, 1),
                                                     (1, 2),
                                                     (1, 3),
                                                     (1, 4),
                                                     (2, 4),
                                                     (3, 2),
                                                     (3, 3),
                                                     (4, 3),
                                                     (5, 2),
                                                     (6, 1),
                                                     (7, 1),
                                                     (8, 3),
                                                     (9, 2),
                                                     (9, 1),
                                                     (10, 4),
                                                     (10, 3);

SELECT * FROM hobbiesOfPeople;