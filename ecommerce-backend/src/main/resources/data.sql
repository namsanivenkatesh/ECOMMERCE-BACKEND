INSERT INTO USER (id, username, password, role) VALUES (1, 'admin', 'adminpassword', 'ADMIN');
INSERT INTO USER (id, username, password, role) VALUES (2, 'user', 'userpassword', 'USER');

INSERT INTO PRODUCT (id, name, category, price, stock) VALUES (1, 'Laptop', 'Electronics', 1000.00, 50);
INSERT INTO PRODUCT (id, name, category, price, stock) VALUES (2, 'Phone', 'Electronics', 500.00, 100);

INSERT INTO CART_ITEM (id, product_id, user_id, quantity) VALUES (1, 1, 2, 2);
INSERT INTO CART_ITEM (id, product_id, user_id, quantity) VALUES (2, 2, 2, 1);
