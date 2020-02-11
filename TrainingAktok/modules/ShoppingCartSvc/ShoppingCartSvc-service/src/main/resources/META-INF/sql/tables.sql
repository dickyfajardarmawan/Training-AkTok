create table master_Cart (
	uuid_ VARCHAR(75) null,
	id_cart VARCHAR(75) not null primary key,
	id_produk VARCHAR(75) null,
	id_toko VARCHAR(75) null,
	jumlah_produk LONG,
	sub_total LONG
);

create table master_Produk (
	uuid_ VARCHAR(75) null,
	id_produk VARCHAR(75) not null primary key,
	create_date DATE null,
	modified_date DATE null,
	nama_produk VARCHAR(75) null,
	harga_produk LONG,
	kelipatan_produk LONG
);