package pnj.uts.ti.teuku_rafli_fahrezy.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pnj.uts.ti.teuku_rafli_fahrezy.Adapter.AdapterBerita
import pnj.uts.ti.teuku_rafli_fahrezy.Data.BeritaData
import pnj.uts.ti.teuku_rafli_fahrezy.DetailBerita
import pnj.uts.ti.teuku_rafli_fahrezy.R
import pnj.uts.ti.teuku_rafli_fahrezy.databinding.ActivityFragmentTwoBinding

class FragmentTwo : Fragment() {

    private lateinit var binding: ActivityFragmentTwoBinding
    private lateinit var beritaArraylist : ArrayList<BeritaData>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for the fragment
        binding = ActivityFragmentTwoBinding.inflate(inflater, container, false)

        // Initialize the data
        val imageId = intArrayOf(
            R.drawable.berita1,
            R.drawable.berita2,
            R.drawable.berita3,
            R.drawable.berita4,
            R.drawable.berita5,
            R.drawable.berita6,
            R.drawable.berita7,
            R.drawable.berita8,
            R.drawable.berita9,
            R.drawable.berita10
        )

        val title = arrayOf(
            "Dibanderol Hingga Rp 75 Juta, Begini Spesifikasi Laptop Gaming Terbaru Asus",
            "Sri Mulyani: Barang Non Komersial Tak Akan Diatur Lagi dalam Permendag",
            "ASUS Umumkan ROG Tessen Mobile Controller, Portabel dan Banyak Fitur",
            "Huawei MateBook X Pro 2024 Meluncur, Laptop yang Ramping dan Tangguh",
            "Advan X-Play Dirilis Bawa Fitur AI untuk Saingi ROG Allay, Harganya?",
            "Selesai Digelar di Depok, Tahun Depan Pekalongan Jadi Tuan Rumah Rakerkomwil III APEKSI",
            "Akhiri Jabatan Penjabat Gubernur, Ismail Pakaya Jalani Adat Modepito",
            "Ladies Program Rakerkomwil III APEKSI, Istri Kepala Daerah Buat Kalung Batik dan Oshibana",
            "Kreasi Cantik Kerajinan Bunga Tekan ala Oshibana Buatan Bunda Elly",
            "Tradisi Potong Kebo Andil di Lebaran Depok 2024"
        )

        val desc = arrayOf(
            "Asus meluncurkan laptop gaming yang diklaim mampu menampung segala jenis permainan berkapasitas berat Laptop Asus ROG Strix Scar 18 (G834JYR) yang dirilis pada awal 2024 itu dianggap cocok untuk para gamer dan kreator konten yang menuntut performa maksimal.Merujuk rilis resmi Asus ROD yang diterima Tempo, Selasa, 14 Mei 2024, produk itu menyasar segmen pembeli gaming enthusiast atau pemain yang benar-benar mencari perangkat terbaik di kelasnya. Tak tanggung-tanggung, satu unit Asus ROG Strix Scar 18 dijual dengan harga Rp 75,9 juta.Harga tinggi itu sepadan dengan kualitasnya. Apalagi setiap pembelian laptop tersebut akan disertai garansi internasional atau warranty global selama dua tahun, serta satu tahun garansi Asus VIP Perfect Warranty.",
            "Pemerintah melakukan revisi Peraturan Menteri Perdagangan (Permendag) Nomor 36 Tahun 2023 Tentang Kebijakan dan Pengaturan Impor menjadi Permendag Nomor 8 Tahun 2024. Penerbitan aturan ini dilakukan untuk mengatasi penumpukan 26.000 kontainer yang tertahan di Pelabuhan Tanjung Priok dan Pelabuhan Tanjung Perak selama tiga bulan terakhir Menteri Keuangan Sri Mulyani mengatakan, seiring dengan revisi aturan tersebut, jenis barang impor non komersial dan personal use nantinya tidak akan diatur dalam Permendag",
            "ASUS ROG memperkenalkan produk aksesori baru untuk menambah pengalaman gaming di smartphone yakni ROG Tessen Mobile Controller. Salah satu keunggulan dari gamepad satu ini adalah desainnya yang portabel dapat dilipat sehingga mudah untuk di bawa atau diselipkan ke dalam tas.ASUS mengklaim ROG Tessen menjadi gamepad mobile satu-satunya yang dapat dilipat di pasaran saat ini dan dengan desain ergonomis untuk kenyamanan pengguna. Mendukung rubber pad tambahan, ROG Tessen kompatibel dengan berbagai ukuran smartphone bahkan saat memakai case ponsel sekalipun.Tombol-tombol dan juga D-Pad pada gamepad ini sudah menggunakan switch mekanik sehingga memberikan pengalaman klik yang tactile, respon cepat, dan daya tahan lama. Sementara itu, joystick diklaim sekelas konsol untuk kontrol yang lebih presisi, pengalaman gaming di smartphone jadi naik kelas!",
            "Perusahaan teknologi Huawei resmi meluncurkan laptop terbarunya, Huawei MateBook X Pro 2024 di Malaysia, Senin (13/5/2024). Laptop ini merupakan penerus dari Huawei MateBook X Pro 2023. Huawei MateBook X Pro 2024 mengunggulkan desainnya yang ringkas. Laptop ini memiliki bobot 980 gram, sedangkan dimensinya adalah 310 x 322 x 13,5 mm. Sebagai perbandingan, Huawei MateBook X Pro 2023 mempunyai bobot 1,26 kilogram. Sasis laptop MateBook X Pro 2024 dibuat dari paduan magnesium kelas penerbangan (aviation grade), sehingga tangguh tetapi sambil mempertahankan desainnya yang ramping. Laptop ini mengandalkan material aluminium berlian untuk mencapai keseimbangan bobot ini.",
            "Pasar konsol gaming handheld Indonesia diramaikan dengan kedatangan Advan X-Play. Perangkat ini membawa fitur kecerdasan buatan alias AI untuk saingi Asus ROG Allay dan sejenisnnya. Advan X-Play disokong proesesor AMD Ryzen 7 7840U yang memiliki konfigurasi 8 core CPU. 16 thread, serta punya kecepatan hingga 5.1 GHz. Dilengkapi dengan AMD Ryzen AI, Advan X-Play konsol ini menawarkan kinerja yang ringan dan efisien, memungkinkan para pemain untuk menikmati game AAA dengan lancar dan tanpa gangguan.",
            "Rapat Kerja Komisariat Wilayah (Rakerkomwil) III Asosiasi Pemerintah Kota seluruh Indonesia (APEKSI) di Kota Depok telah selesai dilaksanakan dengan ditutupnya puluhan poin rekomendasi yang akan disampaikan pada Rapat Kerja Nasional (Rakernas) XVII di Balikpapan. Dipimpin oleh Ketua Komisariat Wilayah (Konwil) III APEKSI, Wali Kota Cilegon, Helldy Agustian, acara tersebut dihadiri oleh 25 kepala daerah dari Jawa Barat (Jabar), Jawa Tengah (Jateng), DKI Jakarta, dan Banten. Helldy menyatakan bahwa Rakerkomwil III tahun 2024 telah selesai, dan untuk tahun 2025 akan dilaksanakan di Kota Pekalongan. APEKSI, sebagai organisasi yang beranggotakan 98 pemerintah kota di seluruh Indonesia, terbagi ke dalam enam Komwil berdasarkan wilayah. Setiap tahunnya, sebelum pelaksanaan Rakernas, keenam Komwil melakukan Rakerkomwil untuk menentukan rekomendasi program yang akan disampaikan pada Rakernas.",
            "Pemerintah Provinsi Gorontalo menggelar upacara adat Modepito untuk mengakhiri masa jabatan Ismail Pakaya sebagai Penjabat Gubernur Gorontalo. Modepito adalah prosesi adat yang mengantarkan pejabat yang berakhir masa tugasnya dari rumah jabatan ke kediaman pribadi, sebagai bentuk penghargaan atas pengabdian kepada daerah. Ismail Pakaya dan istri dijemput oleh pemangku adat untuk menuju tempat duduk adat, lalu meninggalkan rumah jabatan diantarkan oleh Bupati/Wali Kota, Forkopimda provinsi, dan pimpinan OPD. Prosesi dilanjutkan di kediaman pribadi Ismail Pakaya dengan pembacaan doa sebagai penutup. Modepito hampir sama dengan adat Mopotolungo, dengan perbedaan bahwa Mopotolungo untuk pejabat yang memasuki masa pensiun, sedangkan Modepito untuk pejabat yang masih menjabat namun berbeda. Ismail Pakaya masih menjabat sebagai Staf Ahli Bidang Sosial, Politik, dan Kebijakan Publik, Kemenaker RI. Selain Modepito, Ismail dan istri juga menghadiri upacara pelepasan yang dilakukan oleh IKAPTK Provinsi Gorontalo, di mana pasukan upacara membentuk formasi Bintang Astha Brata, simbol penghargaan tertinggi di bidang Kepamongprajaan. Ismail Pakaya menyelesaikan tugasnya pada 12 Mei 2024 dan digantikan oleh Rudy Salahuddin sebagai Penjabat Gubernur Gorontalo yang baru pada 17 Mei 2024.",
            "Ladies Program telah menjadi agenda tetap dalam Rapat Kerja Komisariat Wilayah (Rakerkomwil) III Asosiasi Pemerintah Kota seluruh Indonesia (APEKSI) setiap tahunnya, di mana para istri wali kota yang juga Ketua Tim Penggerak Pemberdayaan Kesejahteraan Keluarga (TP-PKK) diwajibkan untuk mengikuti program tersebut. Pada pelaksanaan Rakerkomwil III APEKSI tahun 2024 di Kota Depok, para istri wali kota mengikuti rangkaian kegiatan Ladies Program yang dibuka oleh istri Wali Kota Depok, Elly Farida. Mereka diajak untuk melihat festival budaya Lebaran Depok di Alun-alun Kota Depok dan mengikuti Workshop Kalung Batik dan Oshibana. Meskipun jumlah peserta terbatas, hal itu tidak mengurangi keceriaan acara yang diselenggarakan oleh Dinas Koperasi dan Usaha Mikro (DKUM) dan Dinas Perdagangan dan Perindustrian (Disdagin). Para peserta merasa terhibur dan menikmati waktu mereka dalam kegiatan ini, yang juga dianggap sebagai waktu untuk menyegarkan pikiran dari rutinitas sehari-hari. Bunda Elly berharap kegiatan ini dapat memberikan kesan yang baik dan mengingatkan bahwa istri kepala daerah juga memiliki peran penting dalam pembangunan di wilayah masing-masing.",
            "Pada Ladies Program Rapat Kerja Komisariat Wilayah (Rakerkomwil) III APEKSI 2024 di Kota Depok, beberapa workshop membuat kerajinan tangan diselenggarakan, termasuk pembuatan Kalung Batik dan Oshibana. Workshop tersebut diikuti oleh istri kepala daerah peserta Rakerkomwil III APEKSI, seperti Ketua TP-PKK Kota Depok, Elly Farida, yang membuat karya Oshibana yang menarik. Dengan latar kertas putih, Bunda Elly menyusun bunga dan daun kering menjadi karya yang abstrak namun harmonis, menggambarkan kesatuan, cita-cita, dan kebersamaan yang terbentuk melalui cinta. Oshibana adalah seni merangkai bunga atau dedaunan yang dikeringkan dengan cara dipress atau ditekan, yang dapat diaplikasikan dalam berbagai kreasi unik dan menarik.",
            "Pada acara Lebaran Depok 2024 di Alun-alun Kota Depok pada hari pertama, tradisi memotong hewan kerbau dari hasil patungan atau andilan tetap dilaksanakan. Wakil Wali Kota Depok, Imam Budi Hartono, dan Ketua Umum Kumpulan Orang Orang Depok (KOOD) Berbudaya, Ahmad Dahlan, turut menyaksikan pemotongan kebo andil tersebut. Ahmad Dahlan menjelaskan bahwa di masa lalu, masyarakat Depok akan melakukan patungan untuk membeli seekor kerbau menjelang Lebaran Idulfitri. Kerbau tersebut kemudian dipotong dan dibagikan kepada mereka yang telah berpartisipasi dalam patungan tersebut, sebagai bagian dari tradisi makan daging kerbau hanya saat Lebaran. Tujuan dari prosesi andil kebo ini adalah untuk mewariskan nilai kebersamaan kepada generasi muda dan mendorong mereka untuk melestarikan budaya tersebut. Ahmad Dahlan juga menegaskan bahwa tradisi memotong kebo andil ini masih dapat dilakukan di berbagai daerah sebelum Lebaran, tidak hanya di Depok, tetapi juga di Jakarta, Tangerang, dan Bekasi."
        )

        beritaArraylist = ArrayList()
        for (i in imageId.indices) {
            val berita = BeritaData(title[i], desc[i], imageId[i])
            beritaArraylist.add(berita)
        }

        // Set the adapter for the ListView
        binding.listView.isClickable = true
        binding.listView.adapter = AdapterBerita(requireActivity(), beritaArraylist)
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val title = title[position]
            val desc = desc[position]
            val imageId = imageId[position]

            val i = Intent(requireActivity(), DetailBerita::class.java)
            i.putExtra("title", title)
            i.putExtra("desc", desc)
            i.putExtra("imageId", imageId)
            startActivity(i)
        }

        // Return the root view of the fragment
        return binding.root
    }
}