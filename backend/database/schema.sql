BEGIN TRANSACTION;

DROP TABLE IF EXISTS restaurant;

CREATE TABLE restaurant (
	id serial NOT NULL,
	name VARCHAR(50) NOT NULL,
	city VARCHAR(20) NOT NULL,
	type VARCHAR(20) NOT NULL,
	menu_url VARCHAR(100),
	CONSTRAINT PK_id PRIMARY KEY (id)
);

INSERT INTO restaurant (name, city, type, menu_url)
	VALUES ('Crafters Pizza and Draft House', 'Carmel', 'Pizza', 'https://www.craftersdrafthouse.com/menus/'),
		('MashCraft', 'Fishers', 'American Pub', 'https://mashcraft.com/wp-content/uploads/2022/03/MashCraft-Menu-Fishers.pdf'),
		('Sushiyama', 'Noblesville', 'Sushi', ''),
		('Grand Junction Brewing Co.', 'Westfield', 'BBQ', 'https://grandjunctionbrewing.com/menu/'),
		('Condado Tacos', 'Noblesville', 'Tacos', 'https://condadotacos.com/menu-food/'),
		('Primeval Brewing', 'Noblesville', 'Brewery', 'https://primevalbrewing.com/menu'),
		('Grindstone Public House', 'Noblesville', 'American Pub', 'https://www.grindstonepublichouse.com/menu/'),
		('Thai Garden Restaurant', 'Fishers', 'Thai', 'https://qmenu.us/#/thai-garden-fishers/menu/1584621050807')
;

COMMIT;