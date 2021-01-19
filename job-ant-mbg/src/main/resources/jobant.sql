--user
create user jobant_rw@'192.168.%.%' identified by 'jumpjump' with max_user_connections 100;
GRANT USAGE ON *.* TO 'jobant_rw'@'192.168.%.%' WITH GRANT OPTION;
grant select, insert, update, delete on jobant.* to 'jobant_rw'@'192.168.%.%';

--database
create database jobant;

--tables
--task
create table jobant_tasks_scheduler(
id bigint unsigned not null auto_increment,
task_name varchar(32) not null,
task_env varchar(128) not null,
task_status int not null default 0 comment '0: 生效, 1: 无效',
task_inverval int not null default 0,
start_time timestamp not null default current_timestamp,
primary key(id)
) engine=innodb;

create table jobant_tasks_template(
id bigint unsigned not null auto_increment,
scheduler_id bigint unsigned not null,
child_name bigint unsigned not null,
task_env varchar(128) default null,
task_info varchar(1000) default null,
task_return varchar(256) default null,
task_fail_call varchar(128) default null,
task_success_call varchar(128) default null,
primary key(id)
) engine=innodb;

create table jobant_task_running_log(
id bigint unsigned not null auto_increment,
task_scheduler_id int not null,
task_child_id int not null,
loginfo varchar(1000) not null,
primary key(id)
) engine=innodb;

--mail
create table mail_template(
id bigint not null auto_increment,
send_to varchar(128) not null,
duplicate_to varchar(128) default null,
mail_type varchar(32) not null default 'html' comment 'html, txt',
mail_status int default 0,
primary key(id)
) engine=innodb;


















