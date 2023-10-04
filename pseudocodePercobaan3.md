Algoritma: Harga_Bayar_NoAbsen
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan
harga barang}
Deklarasi:
harga, jumlah, jmlHlmBuku : int
dis, total, bayar, jmlDis : double
merk buku : String 
Deskripsi:
1. print "Masukkan merk buku"
2. read merkBuku
3. print "Masukkan jumlah halaman buku"
4. read jmlHmlBuku
5. print "Masukkan diskon"
6. read dis 
7. print "Masukkan harga barang yang dibeli”
8. read harga
9. print " Masukkan jumlah barang yang dibeli”
10. read jumlah
11. total = harga *jumlah
12. jmlDis=total*dis
13. bayar=total-jmlDis
14. print “Diskon yang anda dapatkan adalah”
15. print jmlDiskon
16. print "Jumlah yang harus dibayar adalah”
17. print bayar