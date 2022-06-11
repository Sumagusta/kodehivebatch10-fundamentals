-- day 11
-- DDL
create database kampusb10;

use kampusb10;

create table mahasiswa(
	id int,
    name varchar(50),
    spp int,
    alamat varchar(255),
    primary key (id)
);

create table jurusan(
	id int,
    name varchar(50),
    primary key (id)
);

-- day 12
-- rename column
alter table mahasiswa
rename column name to nm_mahasiswa;

-- add column
alter table mahasiswa
add column usia int;

-- delete column
alter table mahasiswa
drop column usia;

-- DML
insert into mahasiswa 
	(
		id,
        nm_mahasiswa,
        spp,
        alamat
	)
    values
    (
		2,
        'Bernard',
        3000009,
        'Bandung'
    ),
    (
		6,
        'Sugeng Dalu',
        3500000,
        'Malang'
    );
    
    insert into jurusan 
	(
		id,
       name
	)
    values
    (
		1,
        'Teknik Informatika'
    ),(
		2,
        'Sistem Informasi'
    ),(
		3,
        'Teknik Otomotif'
    ),(
		4,
        'Kedokteran Gigi'
    ),(
		5,
        'Sastra Inggris'
    );
    
-- memilih kolom yang ditampilkan
select nm_mahasiswa, alamat from mahasiswa;
select * from mahasiswa;

-- alias / as
select m.nm_mahasiswa, m.spp from mahasiswa as m;
select m.nm_mahasiswa, m.spp from mahasiswa m;

-- alias / as for column
select m.nm_mahasiswa as mahasiswa, m.spp from mahasiswa m;

-- query condition
select m.nm_mahasiswa as mahasiswa, m.spp from mahasiswa m
	where m.spp < 3000000;
    
select m.nm_mahasiswa as mahasiswa, m.spp from mahasiswa m
	where m.spp = 3000000;

-- and    
select m.nm_mahasiswa as mahasiswa, m.spp from mahasiswa m
	where m.spp = 3000000 and m.nm_mahasiswa = 'Sinta';

select m.nm_mahasiswa as mahasiswa, m.spp from mahasiswa m
	where m.spp = 3000000;
    
/*
Note: insert 2 data baru di mahasiswa, berikan value untuk alamat 'Bandung'  
	1. Tampilkan nama mahasiswa dan alamat yang berada di Bandung
    2. Tampilkan nama mahasiswa dan alamat yang lokasinya selain Bandung
    3. Tampilkan nama mahasiswa, alamat, dan spp yang jumlah spp nya tidak lebih dari 2500000 
	   dan bukan beralamatkan di Bandung
*/

-- like
select m.nm_mahasiswa from mahasiswa m
where m.nm_mahasiswa like 'D%';

select m.nm_mahasiswa from mahasiswa m
where m.nm_mahasiswa like '%2';

select m.nm_mahasiswa from mahasiswa m
where m.nm_mahasiswa like '%s%';

select * from mahasiswa;

update mahasiswa
	set alamat = "Jakarta Utara"
    where id = 3;

delete from mahasiswa where id =2;

select * from mahasiswa m order by m.id desc;
select * from mahasiswa m order by m.nm_mahasiswa asc;

select * from mahasiswa m;

/*
urutan penulisan query :
SELECT column_name(s)
FROM table_name
WHERE condition
GROUP BY column_name(s)
HAVING condition
ORDER BY column_name(s);
*/

select distinct (m.alamat) from mahasiswa m;

select m.alamat, count(m.alamat) jumlahAlamat, sum(m.spp) total from mahasiswa m
	group by m.alamat
    order by m.nm_mahasiswa asc;

select * from jurusan;
select * from mahasiswa;

alter table mahasiswa
add column jurusan_id int;

update mahasiswa
set jurusan_id = 1
where nm_mahasiswa like '%sinta%';

update mahasiswa
set jurusan_id = 2
where id = 2;

-- inner join
select m.nm_mahasiswa, j.name from mahasiswa m 
inner join jurusan j
on j.id = m.jurusan_id;

-- left join
select m.nm_mahasiswa, j.name from mahasiswa m -- left
left join jurusan j -- right
on j.id = m.jurusan_id;

-- right join
select m.nm_mahasiswa, j.name from mahasiswa m -- left
right join jurusan j -- right
on j.id = m.jurusan_id;

-- full outer join
select m.nm_mahasiswa, j.name from mahasiswa m -- left
left join jurusan j -- right
on j.id = m.jurusan_id
union -- menggabungkan querys
select m.nm_mahasiswa, j.name from mahasiswa m -- left
right join jurusan j -- right
on j.id = m.jurusan_id;