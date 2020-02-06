create table master_Pengiriman (
	uuid_ VARCHAR(75) null,
	id_pengiriman VARCHAR(75) not null primary key,
	tanggal_pengiriman DATE null,
	status_pengiriman VARCHAR(75) null,
	tanggal_penerimaan DATE null,
	bukti_pengiriman VARCHAR(75) null,
	create_date DATE null,
	modified_date DATE null,
	id_order VARCHAR(75) null,
	id_toko VARCHAR(75) null
);