# Automation Testing for JPetstore Demo

## Cara Penggunaan :
1. Install Katalon & Web Browser(Google Chrome)
2. Buka Katalon & Clone github repo https://github.com/Fadhil99/katalon-petstore-web
3. Buka Project Fadhil99/katalon-petstore-web
4. Jalankan test dengan membuka `Test Suites\TS_Petstore_Regression`
5. Run(Ctrl+Shift+A) atau icon ini <img width="32" height="19" alt="image" src="https://github.com/user-attachments/assets/6a9e777f-bac5-4e96-850d-f8b8ce31c4b1" />
-> Pilih Chrome
6. Setiap report eksekusi test suite dapat dilihat dan di export dari `Report\...`

## Global Variable : 
terdapat di `Profiles/default`
1. HomeLink = https://petstore.octoperf.com/actions/Catalog.action
2. uname = testusers
3. password = testpass
   
## Mencakup 5 Test Cases Coverage :

 No	| Test Case ID | Deskripsi | Skenario	| DDT
 --- | --- | --- | --- | --- 
1	| TC1_LoginCheck	| Login pengguna yang telah terdaftar.  | Positif(uname&pass benar)/Negatif(uname/pass salah).  | `Data Files\LoginData`
2	| TC2_SearchByProductName	 | Melakukan pencarian katalog menggunakan nama produk pada text box input search.	  | Nama produk ada & tidak ada di katalog / tidak menginputkan produk di text box. | `DataFiles\ProductName`
3	| TC3_AddProductToCartByCategory	| Menambahkan produk ke keranjang berdasarkan kategori produk.	| Pilihan variabel ProductCategory : Fish,Dogs,Cats,Reptiles,Birds.  | `DataFiles\ProductCategory`
4	| TC4_CheckOutProduct	| Melakukan checkout order produk setelah ditambahkan ke keranjang.  | Pengujian keranjang berisi & keranjang kosong.  | `DataFiles\CartEmpty`
5	| TC5_Logout	| Pengujian logout berdasarkan status login pengguna.  | Positif(Status Login Yes->Logout Passed) / Negatif(Tidak Login sebelumnya).  	| `DataFiles\LoginData`
