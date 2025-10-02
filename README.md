# Dustin-P-PAPB-B-2

## Penjelasan kode:

### MainActivity:
-Menggunakan ComponentActivity dan memanggil setContent { ... } untuk menampilkan antarmuka pengguna berbasis _Jetpack Compose_.
-Memanggil ProfilApp_235150207111024DustinTheme untuk menerapkan tema aplikasi.
-Di dalam terdapat kolom yang menempatkan ProfileSection() di tengah layar.

### ProfileSection()
-Membuat tata letak profil sederhana menggunakan tipe kolom (_Column_).
-Image: menampilkan foto profil dari R.drawable.profil, dibentuk lingkaran dengan clip(CircleShape).
-Text: menampilkan nama dan deskripsi pengguna.

-FollowButton(): tombol interaktif yang menampilkan teks _Follow_/_Unfollow_, menggunakan var isFollowed by remember { mutableStateOf(false) } agar status tombol tersimpan pada keadaan _Compose_. Jika diklik, isFollowed berubah sehingga teks tombol berganti antara "_Follow_" ↔ "_Unfollow_" secara otomatis.

-@Preview: digunakan untuk melihat tampilan UI langsung di Android Studio tanpa perlu menjalankan aplikasi.

Keuntungan _Jetpack Compose_ dibandingkan _XML Layout_ ialah mudahnya pengelolaan dibandingkan dengan _XML Layout_, deklaratif dan ringkas, dan integrasi penuh dengan Kotlin.
