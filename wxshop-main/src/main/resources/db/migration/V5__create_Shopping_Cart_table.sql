CREATE TABLE tb_shopping_cart(
id         int PRIMARY KEY AUTO_INCREMENT,
user_id    int,
goods_id   int,
number     int,
status     VARCHAR(16),
created_at TIMESTAMP NOT NULL DEFAULT current_timestamp,
updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1;