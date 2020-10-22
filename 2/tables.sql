create table Client (
    id int,
    name varchar(255),
    address varchar(255),
    date varchar(1000),
    primary key(id)   
);

create table Product (
    id int, 
    description varchar(255),
    date varchar(1000), 
    primary key(id)
);

create table Invoice (
    id int, 
    ClientID int,
    ProductID int, 
    date varchar(1000),
    constraint fk_client 
        foreign key (ClientID) 
            references Client(id),
    constraint fk_product 
        foreign key (ProductID) 
            references Product(id)
);