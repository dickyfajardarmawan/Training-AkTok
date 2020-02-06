create table master_Toko (
	uuid_ VARCHAR(75) null,
	id_toko VARCHAR(75) not null primary key,
	nama_toko VARCHAR(75) null,
	nama_depan_pemilik VARCHAR(75) null,
	nama_belakang_pemilik VARCHAR(75) null,
	nomor_hp LONG,
	status_toko LONG,
	tanggal_pendaftaran DATE null,
	password_ VARCHAR(75) null,
	pin LONG,
	id_distributor VARCHAR(75) null
);