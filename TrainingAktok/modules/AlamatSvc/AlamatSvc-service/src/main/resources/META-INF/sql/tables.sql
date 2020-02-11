create table master_Alamat (
	uuid_ VARCHAR(75) null,
	id_alamat VARCHAR(75) not null primary key,
	id_user LONG,
	nama_alamat VARCHAR(75) null,
	nama_penerima VARCHAR(75) null,
	nomor_handphone LONG,
	alamat_lengkap VARCHAR(75) null,
	kode_pos LONG,
	kota VARCHAR(75) null,
	provinsi VARCHAR(75) null,
	region VARCHAR(75) null,
	status BOOLEAN,
	created_date DATE null,
	modified_date DATE null
);