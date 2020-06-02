DROP DATABASE IF EXISTS central_modas;
CREATE DATABASE central_modas;
USE central_modas;

CREATE TABLE IF NOT EXISTS c_users(
	u_username VARCHAR(45) NOT NULL PRIMARY KEY,
	u_email VARCHAR(45) NOT NULL,
    u_password VARCHAR(45) NOT NULL,
    u_name VARCHAR(45) NOT NULL,
    u_avatar VARCHAR(200)
);

CREATE TABLE IF NOT EXISTS c_store(
    s_cnpj VARCHAR(45) PRIMARY KEY NOT NULL,
    s_name VARCHAR(45) NOT NULL,
    s_city VARCHAR(45) NOT NULL,
    s_uf VARCHAR(2) NOT NULL,
    s_cep VARCHAR(9) NOT NULL,
    s_neighborhood VARCHAR(45) NOT NULL,
    s_street VARCHAR(45) NOT NULL,
    s_number INT NOT NULL
);

CREATE TABLE IF NOT EXISTS users_has_store(
	u_user VARCHAR(45) NOT NULL,
	s_cnpj VARCHAR(45) NOT NULL,
    CONSTRAINT fk_users_store1 FOREIGN KEY(s_cnpj) REFERENCES c_store(s_cnpj) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_users_store2 FOREIGN KEY (u_user) REFERENCES c_users(u_username) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS c_product(
	p_cod VARCHAR(45) PRIMARY KEY,
    p_name VARCHAR(45) NOT NULL,
    p_price FLOAT NOT NULL,
    p_mark FLOAT NOT NULL,
    p_model VARCHAR(45),
    p_quantity INT NOT NULL,
    s_cnpj VARCHAR(45) NOT NULL,
    CONSTRAINT fk_product_store FOREIGN KEY(s_cnpj) REFERENCES c_store(s_cnpj) ON DELETE CASCADE ON UPDATE CASCADE
);
