-- qlit用户表
create table if not exists qlit_campus.`users`
(
    `id` varchar(256) not null comment '主键' primary key,
    `create_time` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `update_time` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)',
    `user_name` varchar(256) not null comment '用户名',
    `user_password` varchar(256) not null comment '用户密码',
    `user_id` varchar(256) not null comment '学号',
    `user_college` varchar(256) default '荔枝学院' null comment '学院',
    `user_major` varchar(256) default '炒荔枝专业' null comment '专业',
    `user_introduce` varchar(256) default '无' null comment '个人介绍',
    `user_photo` varchar(256) default '头像' not null comment '头像',
    `user_sex` varchar(256) default '外星人' null comment '性别',
    `user_age` varchar(256) default '18' null comment '年龄'
    ) comment 'qlit用户表';


# 插入
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('7d204bc5-3798-4bcd-91ee-36f885e5a853', '田伟泽', 'gIYp', '17343621938', '中南民族大学', '软件工程', '女', '10');
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('0949f235-35ad-4ca8-8392-b118bdd8976e', '史志强', '4A', '15067886439', '中国民用航空学院', '计算机科学与技术', '男', '17');
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('b2739ce2-bafd-406b-bc1c-16744326a5c5', '白明杰', 'zkJ', '17788423447', '宁波大学', '计算机科学与技术', '女', '41');
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('04d90352-4bdc-4ed8-9962-c56a6c9bcc97', '韩晋鹏', '5Ui', '15801868362', '江西理工大学', '大数据科学与技术', '男', '65');
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('9388994a-33a9-4719-bbd1-a9677f4ac391', '龚立果', 'q5en', '15623179208', '安徽理工大学', '计算机科学与技术', '女', '62');
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('8506b114-8117-4fcd-975e-12919cad6155', '姜智渊', 'GPHoZ', '15710810872', '景德镇陶瓷学院', '软件工程', '女', '32');
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('04d90352-4bdc-4ed8-9962-c56a6c9bcc97', '戴哲瀚', 'VS', '17264517639', '青岛港湾职业技术学院', '计算机科学与技术', '男', '60');
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('b2739ce2-bafd-406b-bc1c-16744326a5c5', '任展鹏', 'ZT06', '15082510092', '中央财经大学', '大数据科学与技术', '男', '47');
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('f2b3d1e5-59b6-4a03-a9b6-a0d4bbc41d48', '秦子默', 'Xj', '15758484365', '天津科技大学', '软件工程', '男', '94');
insert into qlit_campus.`users` (`id`, `user_name`, `user_password`, `user_id`, `user_college`, `user_major`, `user_sex`, `user_age`) values ('7d204bc5-3798-4bcd-91ee-36f885e5a853', '郭雨泽', '1D6G', '15865336886', '河北经贸大学', '大数据科学与技术', '女', '76');