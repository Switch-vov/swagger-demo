create table if not exists `users` (
  `id` int(11) unsigned not null auto_increment,
  `username` varchar(50) not null,
  `password` varchar(50) not null,
  primary key (`id`)
);