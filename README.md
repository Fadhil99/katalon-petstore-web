Automation Testing for JPetstore Demo
(https://petstore.octoperf.com/actions/Catalog.action)

Mencakup 5 Test Cases :

 No	| Test Case ID | Deskripsi | Skenario	| DDT
 --- | --- | --- | --- | --- 
1	| TC1_LoginCheck	| Menguji login pengguna yang telah terdaftar.  | Positif(uname&pass benar)/Negatif(uname/pass salah).  | Ya

2	| TC2_SearchByProductName	 | Melakukan pencarian katalog menggunakan nama produk pada text box input search.	  | Positif(nama produk ada di katalog)/Negatif(tidak ada input produk). | Ya

3	| TC3_AddProductToCartByCategory	| Menambahkan produk ke keranjang berdasarkan kategori produk.	| Pilihan variabel ProductCategory : Fish,Dogs,Cats,Reptiles,Birds.  | Ya

4	| TC4_CheckOutProduct	| Melakukan checkout order produk setelah ditambahkan ke keranjang.  | Pengujian keranjang berisi & keranjang kosong.  | Ya

5	| TC5_Logout	| Pengujian logout berdasarkan status login pengguna.  | Positif(Status Login Yes->Logout Passed)/Negatif(Status Login No).  	| Ya
