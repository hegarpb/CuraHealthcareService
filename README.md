CuraHealthcareService

Proyek ini adalah aplikasi berbasis Java dengan Cucumber untuk pengujian.

## Menjalankan Pengujian Secara Lokal

Untuk menjalankan pengujian secara lokal, Anda dapat menggunakan Maven. Pastikan Anda telah menginstal dan mengonfigurasi Maven.
Arahkan ke direktori root proyek di terminal Anda dan jalankan perintah berikut:

```bash
mvn clean test
```

Perintah ini akan mengompilasi proyek, menjalankan semua pengujian yang didefinisikan dalam direktori `src/test`, dan menghasilkan laporan pengujian.

## Konfigurasi Jenkins

Untuk mengonfigurasi Jenkins untuk proyek ini:
1. **Instal Plugin yang Diperlukan:** Pastikan Anda telah menginstal plugin seperti "Maven Integration", "Git", dan "Cucumber Reports".
2. **Buat Pekerjaan Baru:** Buat pekerjaan "Freestyle project" atau "Pipeline" baru di Jenkins. 3. **Manajemen Kode Sumber:** Konfigurasikan pekerjaan untuk mengambil kode dari repositori GitHub: `https://github.com/hegarpb/CuraHealthcareService.git`.
4. **Langkah-Langkah Build:**
- Untuk proyek Freestyle: Tambahkan langkah build "Panggil target Maven tingkat atas" dan tetapkan sasaran ke `instalasi bersih`.
- Untuk proyek Pipeline: Gunakan `Jenkinsfile` yang mendefinisikan proses build, termasuk perintah Maven.
5. **Tindakan Pasca-build:** Konfigurasikan untuk mengarsipkan hasil pengujian atau menerbitkan laporan Cucumber jika berlaku.

*Catatan: Detail konfigurasi Jenkins spesifik dapat bervariasi berdasarkan pengaturan dan persyaratan Jenkins Anda.