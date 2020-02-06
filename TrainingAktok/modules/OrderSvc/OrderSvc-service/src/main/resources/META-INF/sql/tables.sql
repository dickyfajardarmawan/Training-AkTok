create table master_Order (
	uuid_ VARCHAR(75) null,
	id_order VARCHAR(75) not null primary key,
	total_harga LONG,
	tanggal_pemesanan DATE null,
	tanggal_ekspetasi_pengiriman DATE null,
	status_order VARCHAR(75) null,
	status_pembayaran_keseluruhan VARCHAR(75) null,
	status_pengiriman_keseluruhan VARCHAR(75) null,
	catatan VARCHAR(75) null,
	create_date DATE null,
	modified_date DATE null,
	id_metode_pembayaran VARCHAR(75) null
);