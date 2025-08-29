Feature: Make Appointment Feature
        Memverifikasi fitur membuat janji temu di Cura Healthcare

  Scenario: Membuat janji temu dengan semua field yang diperlukan
    Given user berada di halaman Make Appointment
    When user memilih fasilitas "<facility>"
    And user mencentang Apply for hospital readmission
    And user memilih program kesehatan "<program>"
    And user memasukkan tanggal kunjungan "<date>"
    And user memasukkan komentar "<comments>"
    And user menekan tombol Book Appointment
    Then user berhasil membuat janji temu dan melihat konfirmasi

    Examples:
      | facility                     | program  | date       | comments                      | validasi |
      | Seoul CURA Healthcare Center | Medicare | 15/08/2025 | Saya ingin booking apointment |          |

  Scenario: Memverifikasi bahwa pengguna tidak dapat membuat janji temu jika tanggal kunjungan tidak diisi
    Given user berada di halaman Make Appointment
    When user memilih fasilitas "<facility>"
    And user mencentang Apply for hospital readmission
    And user memilih program kesehatan "<program>"
    And user memasukkan tanggal kunjungan "<date>"
    And user memasukkan komentar "<comments>"
    And user menekan tombol Book Appointment
    Then muncul pesan validasi "<validasi>"

    Examples:
      | facility                     | program  | date | comments                      | validasi       |
      | Seoul CURA Healthcare Center | Medicare |      | Saya ingin booking apointment | Isi isian ini. |
