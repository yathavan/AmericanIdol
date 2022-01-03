--sample data

insert into category (category_id, name) values(1, 'Vehicles');
insert into category (category_id, name) values(2, 'Animals');
insert into category (category_id, name) values(3, 'Food');

insert into item (item_id, name, category_id) values(1, 'Car', 1);
insert into item (item_id, name, category_id) values(2, 'Bike', 1);
insert into item (item_id, name, category_id) values(3, 'Dog', 2);
insert into item (item_id, name, category_id) values(4, 'Burger', 3);

insert into response (response_id, description, item_id) values(1, 'What model is this car?', 1);
insert into response (response_id, description, item_id) values(2, 'What is the price of this car?', 1);
insert into response (response_id, description, item_id) values(3, 'What is the price of this bike?', 2);
insert into response (response_id, description, item_id) values(4, 'What breed is this dog', 3);
insert into response (response_id, description, item_id) values(5, 'Does it come with cheese?', 4);