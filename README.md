# Post-Test-2-PBO
# Deskripsi Program
Program ini adalah aplikasi sederhana berbasis Java untuk mengelola data ruang coworking. Fitur utama yang tersedia:
Create: Menambahkan data ruang (kode, nama, kapasitas).
Read: Menampilkan seluruh data ruang yang sudah ada.
Update: Mengubah data ruang (nama, kapasitas).
Delete: Menghapus data ruang berdasarkan nomor urut.
Search: Mencari data ruang berdasarkan kode atau nama.
Program menggunakan ArrayList sebagai tempat penyimpanan data sementara, serta Scanner untuk input dari pengguna.

Alur Program
Saat dijalankan, program menampilkan menu utama berisi pilihan fitur (Create, Read, Update, Delete, Search, Exit).
Pengguna memilih menu dengan memasukkan angka sesuai opsi yang tersedia.
Berdasarkan pilihan:
Jika memilih Create, pengguna diminta memasukkan kode, nama, dan kapasitas ruang → data tersimpan ke dalam list.
Jika memilih Read, seluruh data yang ada ditampilkan.
Jika memilih Update, pengguna memilih data yang akan diubah, lalu memasukkan data baru.
Jika memilih Delete, pengguna memilih data yang ingin dihapus berdasarkan nomor urut.
Jika memilih Search, pengguna memasukkan kata kunci (kode/nama ruang), program akan menampilkan data yang cocok.
Proses berulang hingga pengguna memilih Exit untuk keluar dari program.

# Struktur Package & Class
Program ini terdiri dari 3 class utama:

1. model
Berisi class model yang digunakan untuk merepresentasikan data ruang coworking.
Atribut utamanya:
kode → kode ruang
nama → nama ruang
kapasitas → kapasitas ruang
Juga terdapat getter & setter untuk mengakses dan mengubah data.
Intinya, model berfungsi sebagai blueprint / struktur data.

2. service
Berisi class service yang mengatur logika program (CRUD + Search).
Metode yang ada di sini antara lain:
create() → menambahkan data baru
read() → menampilkan data
update() → mengubah data yang sudah ada
delete() → menghapus data
search() → mencari data berdasarkan kode atau nama
service ini menghubungkan user input dengan data (model), jadi semacam “otak” dari program.

3. main
Berisi class main dengan method main().
Di sini program dijalankan dan ditampilkan menu pilihan ke pengguna.
Fungsinya:
Menyediakan menu interaktif (Create, Read, Update, Delete, Search, Exit).
Memanggil method yang ada di service sesuai input pengguna.
Bisa dibilang main adalah pintu masuk (entry point) dari program.

# Dokumentasi Program

<img width="677" height="202" alt="image" src="https://github.com/user-attachments/assets/ff8ee23f-bc19-4609-800c-b3ce5d38d190" />

Kelas service berfungsi sebagai pusat logika program yang mengelola data ruang coworker. Di dalamnya terdapat ArrayList untuk menyimpan daftar ruang yang dibuat berdasarkan class model, serta Scanner untuk membaca input dari pengguna. Pada bagian konstruktor, kelas ini secara otomatis menambahkan beberapa data awal, jadi ketika program dijalankan pertama kali, daftar ruang sudah terisi dan bisa langsung digunakan untuk operasi CRUD seperti tambah, ubah, hapus, maupun cari data.

<img width="643" height="113" alt="image" src="https://github.com/user-attachments/assets/cfd5a426-f8f9-41d2-82d1-cc35da503774" />

Konstruktor service digunakan untuk menambahkan data awal ke dalam daftar coworker space. Tiga ruang dimasukkan secara otomatis dengan kode, nama, dan kapasitas tertentu, sehingga saat program dijalankan pengguna langsung memiliki data contoh yang bisa dikelola tanpa harus menambahkannya terlebih dahulu.

<img width="570" height="316" alt="image" src="https://github.com/user-attachments/assets/387461f3-0780-43ad-820e-a6f745b80c6c" />

Method create() digunakan untuk menambahkan data coworker space baru. Program meminta pengguna memasukkan kode ruang, nama ruang, dan kapasitas ruang, lalu menyimpannya sebagai objek baru dari class model ke dalam coworkerList. Setelah data berhasil ditambahkan, program menampilkan pesan konfirmasi "Data berhasil ditambahkan!".

<img width="706" height="222" alt="image" src="https://github.com/user-attachments/assets/f8affac5-9a69-4f73-b0e1-489852c255e4" />

Method read() digunakan untuk menampilkan daftar coworker space yang ada di dalam program. Jika coworkerList kosong maka akan muncul pesan "Tidak ada data coworker space", sedangkan jika ada isinya maka seluruh data akan ditampilkan secara berurutan dengan nomor indeks.

<img width="661" height="614" alt="image" src="https://github.com/user-attachments/assets/a49a4f91-4bb1-4537-a4bd-37ee9df63a1d" />

Method update() digunakan untuk memperbarui data coworker space yang sudah ada. Program akan menampilkan daftar data terlebih dahulu, lalu meminta pengguna memilih nomor data yang ingin diubah. Jika nomor valid, pengguna dapat memasukkan kode, nama, dan kapasitas baru untuk mengganti data lama. Setelah perubahan dilakukan, program menampilkan pesan konfirmasi bahwa data berhasil diubah.

<img width="635" height="361" alt="image" src="https://github.com/user-attachments/assets/1d00d45f-32a1-4956-9290-05a2720fec7f" />

Method delete() digunakan untuk menghapus data coworker space dari daftar. Program akan menampilkan seluruh data terlebih dahulu, kemudian meminta pengguna memilih nomor data yang ingin dihapus. Jika nomor yang dimasukkan tidak valid, program akan menampilkan pesan error, sedangkan jika valid maka data tersebut langsung dihapus dari daftar dan muncul konfirmasi bahwa data berhasil dihapus.

<img width="866" height="392" alt="image" src="https://github.com/user-attachments/assets/7d94899a-7db5-482f-86c5-e60fbcf39a9d" />

Method search() digunakan untuk mencari data coworker space berdasarkan kode atau nama ruang. Program meminta pengguna memasukkan kata kunci, lalu melakukan pengecekan pada setiap data di daftar. Jika ada data yang sesuai, maka ditampilkan sebagai hasil pencarian, sedangkan jika tidak ditemukan program akan menampilkan pesan bahwa data tidak ditemukan.

<img width="311" height="96" alt="image" src="https://github.com/user-attachments/assets/68ae6ed4-0b3b-4685-b984-2a5a24f5f777" />

Class model digunakan sebagai struktur data untuk merepresentasikan sebuah coworker space. Di dalamnya terdapat tiga properti utama, yaitu kode untuk menyimpan kode ruang, nama untuk menyimpan nama ruang, dan kapasitas untuk menyimpan jumlah kapasitas ruang.

<img width="568" height="117" alt="image" src="https://github.com/user-attachments/assets/054bedf4-21b0-446a-8769-ca256fefc351" />

Constructor pada class model digunakan untuk membuat objek coworker space baru dengan langsung mengisi nilai kode, nama, dan kapasitas. Saat objek dibuat, nilai yang dimasukkan melalui parameter akan disimpan ke dalam atribut menggunakan keyword this. Dengan begitu, setiap kali menambahkan data baru, kita bisa langsung memberi nilai awal tanpa perlu memanggil setter satu per satu.

<img width="486" height="515" alt="image" src="https://github.com/user-attachments/assets/59309dc6-441e-4b60-bd68-72324ca6fd6b" />

Method getter dan setter pada class model digunakan untuk mengakses dan mengubah nilai atribut yang bersifat private. Getter (getKode, getNama, getKapasitas) berfungsi mengambil nilai dari atribut, sedangkan setter (setKode, setNama, setKapasitas) berfungsi memberikan atau memperbarui nilainya. Dengan cara ini, data tetap terlindungi namun tetap bisa digunakan atau dimodifikasi melalui method khusus.

<img width="787" height="98" alt="image" src="https://github.com/user-attachments/assets/63d34b34-01d6-4d38-9c0d-1b6e747b9b18" />

Method toString() digunakan untuk menampilkan data coworker space dalam bentuk string yang lebih mudah dibaca. Dengan menambahkan @Override, method ini menggantikan implementasi bawaan dari Object. Hasilnya, setiap kali objek model dipanggil atau dicetak, program akan otomatis menampilkan informasi lengkap berupa kode, nama, dan kapasitas ruang dalam satu baris yang rapi.

<img width="514" height="113" alt="image" src="https://github.com/user-attachments/assets/de18fe40-e8ca-4163-8d0c-1d5519687f46" />

Class Main adalah entry point dari program, tempat eksekusi dimulai. Pada bagian main(), dibuat objek Scanner untuk membaca input dari pengguna, serta objek service yang berisi seluruh logika CRUD. Variabel opsi disiapkan untuk menyimpan pilihan menu yang dimasukkan user. Dengan struktur ini, Main bertugas sebagai penghubung antara pengguna dengan fitur-fitur CRUD yang ada di dalam class service.

<img width="686" height="360" alt="image" src="https://github.com/user-attachments/assets/3102c5ed-3dec-4c50-89b3-6ff5829147f7" />

kode ini adalah tampilan menu utama dari program. Di dalam blok do, program menampilkan daftar pilihan yang bisa dilakukan pengguna, mulai dari menambah, melihat, mengubah, menghapus, mencari data coworker space, hingga keluar dari program. Setelah itu, pengguna diminta memasukkan angka sesuai menu yang ingin dijalankan melalui input.

<img width="532" height="136" alt="image" src="https://github.com/user-attachments/assets/9832715d-a3b3-4c94-a8ac-b47fadf42dd6" />

Kode ini berfungsi untuk validasi input menu. Program mencoba membaca input pengguna, lalu mengubahnya menjadi angka dengan Integer.parseInt(). Jika input bukan angka, akan muncul pesan "Input harus berupa angka!" dan nilai opsi diisi 0 agar tidak mengeksekusi menu yang salah. Dengan cara ini, program jadi lebih aman dari kesalahan input dan tidak langsung error ketika pengguna mengetikkan huruf atau karakter lain.

<img width="609" height="278" alt="image" src="https://github.com/user-attachments/assets/133f61f5-8f4a-44a5-a98d-cca8ec21a740" />

otongan kode switch tersebut berfungsi sebagai menu utama untuk mengatur alur program. Pada bagian ini, setiap pilihan yang dimasukkan pengguna akan diarahkan ke metode tertentu, seperti create() untuk menambah data baru, read() untuk menampilkan seluruh data, update() untuk mengubah data, delete() untuk menghapus data, dan search() untuk mencari data. Jika pengguna memilih opsi 6, maka program akan menampilkan pesan “Terima kasih!” sekaligus keluar dari perulangan. Struktur do-while memastikan menu akan terus ditampilkan dan dapat digunakan berulang kali selama pengguna belum memilih keluar. Setelah keluar, scanner ditutup agar tidak ada lagi input yang diproses.

# Output
<img width="423" height="175" alt="image" src="https://github.com/user-attachments/assets/1855ded5-d68c-44b5-b520-43fec790f170" />

Output ini merupakan menu utama dari Sistem Manajemen Coworker Space yang berfungsi sebagai antarmuka berbasis teks untuk pengguna. Pada menu ini terdapat beberapa opsi yang dapat dipilih, antara lain menambahkan data coworker space baru, melihat daftar coworker space yang sudah ada, mengubah data coworker space, menghapus data, hingga mencari coworker space berdasarkan kode atau nama. Selain itu, tersedia juga opsi untuk keluar dari program. Setelah daftar menu ditampilkan, pengguna diminta untuk memasukkan angka sesuai dengan pilihan yang diinginkan melalui perintah Pilih menu:. Tampilan ini akan terus muncul berulang setiap kali pengguna selesai menjalankan suatu fitur, sampai akhirnya memilih opsi keluar.

<img width="366" height="255" alt="image" src="https://github.com/user-attachments/assets/4ff817c1-bfa3-410e-8e2e-09ba028a1c2c" />

Output kali ini menunjukkan proses ketika pengguna memilih menu 1. Tambah Space Coworker pada sistem. Setelah memilih opsi tersebut, program meminta input berupa kode ruang, nama ruang, dan kapasitas ruang. Pada contoh ini, pengguna memasukkan kode ruang c505, nama ruang Ruang musik, dan kapasitas 10. Setelah semua data berhasil dimasukkan, program menampilkan pesan "Data berhasil ditambahkan!" sebagai konfirmasi bahwa data coworker space baru telah tersimpan di dalam sistem. Hal ini menggambarkan fungsi create yang bekerja dengan menambahkan data baru ke dalam daftar coworker space.

<img width="491" height="311" alt="image" src="https://github.com/user-attachments/assets/fdceec91-6b2e-4901-9b58-a5e4559ee7df" />

Output berikut menunjukkan hasil ketika pengguna memilih menu 2. Lihat Daftar Space Coworker. Setelah opsi ini dipilih, sistem menampilkan seluruh data coworker space yang sudah tersimpan. Pada contoh ini, terdapat empat data ruang, yaitu: C101 - Ruang meeting (kapasitas 10), C102 - Ruang meeting 2 (kapasitas 20), C103 - Ruang sidang (kapasitas 15), dan c505 - Ruang musik (kapasitas 10). Tampilan ini merupakan hasil dari fitur read, yang berfungsi untuk menampilkan daftar coworker space secara terurut sesuai dengan data yang telah dimasukkan sebelumnya. Dengan adanya menu ini, pengguna dapat dengan mudah melihat data ruang yang tersedia.

<img width="505" height="405" alt="image" src="https://github.com/user-attachments/assets/0d3ecf23-deb5-414d-9f7b-a7ca37659fc5" />

Output ini menunjukkan hasil ketika pengguna memilih menu 3. Ubah Data Space Coworker. Setelah memilih opsi tersebut, sistem menampilkan daftar coworker space yang tersedia, kemudian meminta pengguna untuk menentukan nomor data yang ingin diubah. Pada contoh ini, pengguna memilih data nomor 4, yaitu ruang dengan kode c505. Selanjutnya, pengguna memasukkan data baru berupa kode c405, nama Ruang musik, dan kapasitas 20. Setelah proses selesai, sistem menampilkan pesan “Data berhasil diubah!” sebagai konfirmasi bahwa perubahan data berhasil dilakukan. Hal ini membuktikan bahwa fitur update berfungsi dengan baik dalam memperbarui data coworker space yang sudah ada.

<img width="478" height="339" alt="image" src="https://github.com/user-attachments/assets/bc979940-c7e9-45d1-bb62-6676e4edb8c3" />

Output pada gambar ini menunjukkan hasil ketika pengguna memilih menu 4. Hapus Space Coworker. Setelah opsi tersebut dipilih, sistem menampilkan daftar coworker space yang tersedia. Pengguna kemudian diminta untuk memilih nomor data yang ingin dihapus, dalam hal ini nomor 4, yaitu ruang dengan kode c405 dan kapasitas 20. Setelah konfirmasi input, sistem menampilkan pesan “Data berhasil dihapus!” sebagai tanda bahwa data telah dihapus dari daftar. Hal ini membuktikan bahwa fitur delete bekerja dengan baik untuk menghapus data coworker space yang dipilih oleh pengguna.

<img width="542" height="245" alt="image" src="https://github.com/user-attachments/assets/1885ba4d-a4b3-4b36-a4f1-cb0075c9c398" />

Output ini memperlihatkan hasil ketika pengguna memilih menu 5. Cari Space Coworker. Sistem meminta input berupa kode atau nama ruang, lalu pengguna memasukkan kata kunci “meeting”. Program kemudian melakukan pencarian pada daftar coworker space, dan hasilnya menampilkan dua data yang cocok, yaitu Kode: C101, Nama: Ruang meeting, Kapasitas: 10 dan Kode: C102, Nama: Ruang meeting 2, Kapasitas: 20. Hal ini menunjukkan bahwa fitur search berjalan dengan baik, mampu menampilkan semua data yang mengandung kata kunci sesuai input pengguna.

<img width="385" height="191" alt="image" src="https://github.com/user-attachments/assets/6045df58-5aa4-4157-af0d-aaafa9e70f0b" />

Output ini menunjukkan kondisi ketika pengguna memilih menu 6 (Keluar) dari program. Setelah memilih opsi tersebut, sistem langsung menampilkan pesan “Terima kasih!” sebagai penutup, kemudian program berhenti berjalan. Hal ini menandakan bahwa fitur keluar sudah berfungsi dengan baik, yaitu mengakhiri proses aplikasi dengan menampilkan pesan perpisahan yang sederhana.
