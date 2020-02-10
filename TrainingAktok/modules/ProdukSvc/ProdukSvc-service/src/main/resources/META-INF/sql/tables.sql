create table master_Produk (
	uuid_ VARCHAR(75) null,
	id_produk VARCHAR(75) not null primary key,
	create_date DATE null,
	modified_date DATE null,
	nama_produk VARCHAR(75) null,
	harga_produk LONG,
	kelipatan_produk LONG
);