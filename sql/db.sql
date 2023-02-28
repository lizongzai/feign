create table t_product
(
    id           int auto_increment comment '商品ID'
        primary key,
    productName  varchar(32) null comment '商品名称',
    productNum   int null comment '商品数量',
    productPrice double null comment '商品价格'
);


create table t_order
(
    id           int auto_increment comment '订单ID'
        primary key,
    orderNo      varchar(32)  null comment '订单编码',
    orderAddress varchar(250) null comment '订单地址',
    totalPrice   double       null comment '订单总格'
);
