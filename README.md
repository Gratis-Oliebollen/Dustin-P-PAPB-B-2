# Dustin-P-PAPB-B-2

## Penjelasan kode:

### MainActivity:
-Menggunakan ComponentActivity dan memanggil setContent { ... } untuk menampilkan UI berbasis Jetpack Compose.
-Memanggil ProfilApp_235150207111024DustinTheme untuk menerapkan tema aplikasi.
-Di dalamnya ada kolom yang menempatkan ProfileSection() di tengah layar.

### ProfileSection()
-Membuat tata letak profil sederhana menggunakan tipe kolom (Column).
-Image: menampilkan foto profil dari R.drawable.profil, dibentuk lingkaran dengan clip(CircleShape).
-Text: menampilkan nama dan deskripsi pengguna.

-FollowButton(): tombol interaktif yang menampilkan teks Follow / Unfollow, menggunakan var isFollowed by remember { mutableStateOf(false) } agar status tombol tersimpan pada keadaan Compose. Jika diklik, isFollowed berubah sehingga teks tombol berganti antara "Follow" ↔ "Unfollow" secara otomatis.

-@Preview: digunakan untuk melihat tampilan UI langsung di Android Studio tanpa perlu menjalankan aplikasi.

Keuntungan Jetpack Compose dibandingkan XML Layout ialah mudahnya pengelolaan dibandingkan dengan XML Layout, deklaratif dan ringkas, dan integrasi penuh dengan Kotlin.
