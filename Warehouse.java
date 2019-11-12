package TokoSepatu;

//Real Time Date & Time
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//JOptionPane
import javax.swing.JOptionPane;

//Format Nilai Mata Uang Rupiah
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Warehouse {

    String merk, type, gender, colour, size, value;
    int detail,price,total,totaldisc;
    
    String merk2,type2, colour2, size2, value2;
    int price2,total2;
        
    String merk3,type3, colour3, size3, value3;
    int price3,total3;
    
    String merk4,type4, colour4, size4, value4;
    int price4,total4;

    public void Kasir() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        NumberFormat Rupiah = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        
        JOptionPane.showMessageDialog(null, "╔═════════════╗"
                +                         "\n║   JAYA BARU SHOES STORE   ║"
                +                         "\n╚═════════════╝");
        
        gender = JOptionPane.showInputDialog(null, "╔═══╗  ╔════╗"
                +                                "\n║   Men  ║  ║  Woman ║"
                +                                "\n╚═══╝  ╚════╝"
                +                                "\n\nPilih Jenis Kelamin Anda: ", "Gender", 1);
        
        type = JOptionPane.showInputDialog(null, "╔═════╦════╗"
                +                              "\n║     Sport      ║  Running ║"
                +                              "\n╠═════╬════╣"
                +                              "\n║ Sneakers  ║   Formal  ║"
                +                              "\n╚═════╩════╝"
                + "\n\nPilih Kategori Sepatu Yang Diinginkan: ", "Category", 1);
        
        merk = JOptionPane.showInputDialog(null, "╔═════╦════╦════╗"
                +                              "\n║     Adidas    ║    Nike    ║Converse║"
                +                              "\n╠═════╬════╬════╣"
                +                              "\n║      Puma     ║    Vans    ║ Reebok ║"
                +                              "\n╠═════╬════╬════╣"
                +                              "\n║  Skechers  ║     Fila      ║     910     ║"
                +                              "\n╚═════╩════╩════╝"
                + "\n\nPilih Brand Sepatu Yang Diinginkan: ", "Brand", 1);
        
        colour = JOptionPane.showInputDialog(null, "╔═════╦════╦════╗"
                +                                "\n║      Black     ║   White    ║    Gold    ║"
                +                                "\n╠═════╬════╬════╣"
                +                                "\n║      Silver     ║ Orange   ║   Green   ║"
                +                                "\n╠═════╬════╬════╣"
                +                                "\n║     Yellow     ║   Blue     ║     Red      ║"
                +                                "\n╚═════╩════╩════╝"
                + "\n\nPilih Warna Sepatu Yang Diinginkan: ", "Colour", 1);
        
        size = JOptionPane.showInputDialog(null, "╔══╦══╦══╗"
                +                              "\n║  26  ║  27  ║  28  ║"
                +                              "\n╠══╬══╬══╣"
                +                              "\n║  29  ║  30  ║  31  ║"
                +                              "\n╠══╬══╬══╣"
                +                              "\n║  32  ║  33  ║  34  ║"
                +                              "\n╚══╩══╩══╝"
                + "\n\nPilih Ukuran Sepatu Anda: ", "Size", 1);
        
        value = JOptionPane.showInputDialog("╔═══════╦═══════╗"
                +                         "\n║  Rp200.000,00 ║  Rp300.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp400.000,00 ║  Rp500.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp600.000,00 ║  Rp700.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp800.000,00 ║  Rp900.000,00  ║"
                +                         "\n╚═══════╩═══════╝"
                + "\n\nPilih Jenis Kisaran Harga Yang Anda Inginkan: ", "Input Angka Saja..");
        price = Integer.parseInt(value);
        
        total =+ price;
        
        detail = JOptionPane.showConfirmDialog(null, "┎╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍┓"
                +                                  "\n╎                 KASIR SNAKE 01                     ╎ Tanggal Pembelian: " + dateFormat.format(cal.getTime())
                +                                  "\n╎ Jl.Hati-Hati Banyak Anak Kecil no.06 ╎ Gender: " + gender
                +                                  "\n╎            www.ajinotoputri.com                ╎"
                +                                  "\n┕╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍┚"
                +                                  "\nNOTA: "   
                +                                  "\nMerk Sepatu    : ........................... " + merk 
                +                                  "\nTipe Sepatu     : ........................... " + type 
                +                                  "\nColour               : ........................... " + colour 
                +                                  "\nSize                   : ........................... " + size 
                +                                  "\nHarga Sepatu  : ........................... " + Rupiah.format(price)
                +                                "\n\n==================================="
                +                                "\nTotal Harga     : ........................... " + Rupiah.format(total)
                +                                "\n==================================="
                +                                "\n\n*Beli 2 Diskon Rp50.000,00*\n*Beli 3 Diskon Rp100.000,00*"
                +                                "\n\nIngin menambah sepatu?", "Detail", JOptionPane.YES_NO_OPTION, 1);

        if (detail == 0) {
            Beli2();
        } else {
            JOptionPane.showMessageDialog(null, "Terimakasih Telah Berbelanja Di Toko Jaya Baru!");
            System.exit(0);
        }

    }
    
    public void Beli2() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        NumberFormat Rupiah = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        
        type2 = JOptionPane.showInputDialog(null, "╔═════╦════╗"
                +                              "\n║     Sport      ║  Running ║"
                +                              "\n╠═════╬════╣"
                +                              "\n║ Sneakers  ║   Formal  ║"
                +                              "\n╚═════╩════╝"
                + "\n\nPilih Kategori Sepatu Yang Diinginkan: ", "Category", 1);
        
        merk2 = JOptionPane.showInputDialog(null, "╔═════╦════╦════╗"
                +                              "\n║     Adidas    ║    Nike    ║Converse║"
                +                              "\n╠═════╬════╬════╣"
                +                              "\n║      Puma     ║    Vans    ║ Reebok ║"
                +                              "\n╠═════╬════╬════╣"
                +                              "\n║  Skechers  ║     Fila      ║     910     ║"
                +                              "\n╚═════╩════╩════╝"
                + "\n\nPilih Brand Sepatu Yang Diinginkan: ", "Brand", 1);
        
        colour2 = JOptionPane.showInputDialog(null, "╔═════╦════╦════╗"
                +                                "\n║      Black     ║   White    ║    Gold    ║"
                +                                "\n╠═════╬════╬════╣"
                +                                "\n║      Silver     ║ Orange   ║   Green   ║"
                +                                "\n╠═════╬════╬════╣"
                +                                "\n║     Yellow     ║   Blue     ║     Red      ║"
                +                                "\n╚═════╩════╩════╝"
                + "\n\nPilih Warna Sepatu Yang Diinginkan: ", "Colour", 1);
        
        size2 = JOptionPane.showInputDialog(null, "╔══╦══╦══╗"
                +                              "\n║  26  ║  27  ║  28  ║"
                +                              "\n╠══╬══╬══╣"
                +                              "\n║  29  ║  30  ║  31  ║"
                +                              "\n╠══╬══╬══╣"
                +                              "\n║  32  ║  33  ║  34  ║"
                +                              "\n╚══╩══╩══╝"
                + "\n\nPilih Ukuran Sepatu Anda: ", "Size", 1);
        
        value2 = JOptionPane.showInputDialog("╔═══════╦═══════╗"
                +                         "\n║  Rp200.000,00 ║  Rp300.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp400.000,00 ║  Rp500.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp600.000,00 ║  Rp700.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp800.000,00 ║  Rp900.000,00  ║"
                +                         "\n╚═══════╩═══════╝"
                + "\n\nPilih Jenis Kisaran Harga Yang Anda Inginkan: ", "Input Angka Saja..");
        price2 = Integer.parseInt(value2);
        
        total =price + price2;
        totaldisc =total - 50000;
        
        detail = JOptionPane.showConfirmDialog(null, "┎╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍┓"
                +                                  "\n╎                 KASIR SNAKE 01                     ╎ Tanggal Pembelian: " + dateFormat.format(cal.getTime())
                +                                  "\n╎ Jl.Hati-Hati Banyak Anak Kecil no.06 ╎ Gender: " + gender
                +                                  "\n╎            www.ajinotoputri.com                ╎"
                +                                  "\n┕╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍┚"
                +                                  "\nNOTA: "   
                +                                  "\nMerk Sepatu 1    : ........................... " + merk 
                +                                  "\nMerk Sepatu 2    : ........................... " + merk2
                +                                  "\nTipe Sepatu 1     : ........................... " + type
                +                                  "\nTipe Sepatu 2     : ........................... " + type2
                +                                  "\nColour 1               : ........................... " + colour 
                +                                  "\nColour 2               : ........................... " + colour2
                +                                  "\nSize 1                   : ........................... " + size 
                +                                  "\nSize 2                   : ........................... " + size2
                +                                  "\nHarga Sepatu 1  : ........................... " + Rupiah.format(price)
                +                                  "\nHarga Sepatu 2  : ........................... " + Rupiah.format(price2)
                +                                "\n\n==================================="
                +                                "\nTotal Harga             : ........................... " + Rupiah.format(total)
                +                                "\nPotongan Harga     : ........................... Rp50.000,00"
                +                                "\n                                     ........................... " + Rupiah.format(totaldisc)
                +                                "\n==================================="
                +                                "\n\n*Beli 2 Diskon Rp50.000,00*\n*Beli 3 Diskon Rp100.000,00*"
                +                                "\n\nIngin menambah sepatu?", "Detail", JOptionPane.YES_NO_OPTION, 1);

        if (detail == 0) {
            Beli3();
        } else {
            JOptionPane.showMessageDialog(null, "Terimakasih Telah Berbelanja Di Toko Jaya Baru!");
            System.exit(0);
        }

    }
    
    public void Beli3() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        NumberFormat Rupiah = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        
        type3 = JOptionPane.showInputDialog(null, "╔═════╦════╗"
                +                              "\n║     Sport      ║  Running ║"
                +                              "\n╠═════╬════╣"
                +                              "\n║ Sneakers  ║   Formal  ║"
                +                              "\n╚═════╩════╝"
                + "\n\nPilih Kategori Sepatu Yang Diinginkan: ", "Category", 1);
        
        merk3 = JOptionPane.showInputDialog(null, "╔═════╦════╦════╗"
                +                              "\n║     Adidas    ║    Nike    ║Converse║"
                +                              "\n╠═════╬════╬════╣"
                +                              "\n║      Puma     ║    Vans    ║ Reebok ║"
                +                              "\n╠═════╬════╬════╣"
                +                              "\n║  Skechers  ║     Fila      ║     910     ║"
                +                              "\n╚═════╩════╩════╝"
                + "\n\nPilih Brand Sepatu Yang Diinginkan: ", "Brand", 1);
        
        colour3 = JOptionPane.showInputDialog(null, "╔═════╦════╦════╗"
                +                                "\n║      Black     ║   White    ║    Gold    ║"
                +                                "\n╠═════╬════╬════╣"
                +                                "\n║      Silver     ║ Orange   ║   Green   ║"
                +                                "\n╠═════╬════╬════╣"
                +                                "\n║     Yellow     ║   Blue     ║     Red      ║"
                +                                "\n╚═════╩════╩════╝"
                + "\n\nPilih Warna Sepatu Yang Diinginkan: ", "Colour", 1);
        
        size3 = JOptionPane.showInputDialog(null, "╔══╦══╦══╗"
                +                              "\n║  26  ║  27  ║  28  ║"
                +                              "\n╠══╬══╬══╣"
                +                              "\n║  29  ║  30  ║  31  ║"
                +                              "\n╠══╬══╬══╣"
                +                              "\n║  32  ║  33  ║  34  ║"
                +                              "\n╚══╩══╩══╝"
                + "\n\nPilih Ukuran Sepatu Anda: ", "Size", 1);
        
        value3 = JOptionPane.showInputDialog("╔═══════╦═══════╗"
                +                         "\n║  Rp200.000,00 ║  Rp300.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp400.000,00 ║  Rp500.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp600.000,00 ║  Rp700.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp800.000,00 ║  Rp900.000,00  ║"
                +                         "\n╚═══════╩═══════╝"
                + "\n\nPilih Jenis Kisaran Harga Yang Anda Inginkan: ", "Input Angka Saja..");
        price3 = Integer.parseInt(value3);
        
        total =price + price2 + price3;
        totaldisc =total - 100000;
        
        detail = JOptionPane.showConfirmDialog(null, "┎╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍┓"
                +                                  "\n╎                 KASIR SNAKE 01                     ╎ Tanggal Pembelian: " + dateFormat.format(cal.getTime())
                +                                  "\n╎ Jl.Hati-Hati Banyak Anak Kecil no.06 ╎ Gender: " + gender
                +                                  "\n╎            www.ajinotoputri.com                ╎"
                +                                  "\n┕╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍┚"
                +                                  "\nNOTA: "   
                +                                  "\nMerk Sepatu 1   : ........................... " + merk 
                +                                  "\nMerk Sepatu 2   : ........................... " + merk2
                +                                  "\nMerk Sepatu 3   : ........................... " + merk3
                +                                  "\nTipe Sepatu 1    : ........................... " + type
                +                                  "\nTipe Sepatu 2    : ........................... " + type2
                +                                  "\nTipe Sepatu 3    : ........................... " + type3
                +                                  "\nColour 1              : ........................... " + colour 
                +                                  "\nColour 2              : ........................... " + colour2
                +                                  "\nColour 3              : ........................... " + colour3
                +                                  "\nSize 1                  : ........................... " + size 
                +                                  "\nSize 2                  : ........................... " + size2
                +                                  "\nSize 3                  : ........................... " + size3
                +                                  "\nHarga Sepatu 1 : ........................... " + Rupiah.format(price)
                +                                  "\nHarga Sepatu 2 : ........................... " + Rupiah.format(price2)
                +                                  "\nHarga Sepatu 3 : ........................... " + Rupiah.format(price3)
                +                                "\n\n======================================================"
                +                                "\nTotal Harga             : ........................... " + Rupiah.format(total)
                +                                "\nPotongan Harga     : ........................... Rp100.000,00"
                +                                "\n                                     ........................... " + Rupiah.format(totaldisc)
                +                                "\n======================================================"
                +                                "\n\n*Beli 2 Diskon Rp50.000,00*\n*Beli 3 Diskon Rp100.000,00*"
                +                                "\n\nIngin menambah sepatu?", "Detail", JOptionPane.YES_NO_OPTION, 1);

        if (detail == 0) {
            Beli4();
        } else {
            JOptionPane.showMessageDialog(null, "Terimakasih Telah Berbelanja Di Toko Jaya Baru!");
            System.exit(0);
        }

    }
    
    public void Beli4() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        NumberFormat Rupiah = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        
        type4 = JOptionPane.showInputDialog(null, "╔═════╦════╗"
                +                              "\n║     Sport      ║  Running ║"
                +                              "\n╠═════╬════╣"
                +                              "\n║ Sneakers  ║   Formal  ║"
                +                              "\n╚═════╩════╝"
                + "\n\nPilih Kategori Sepatu Yang Diinginkan: ", "Category", 1);
        
        merk4 = JOptionPane.showInputDialog(null, "╔═════╦════╦════╗"
                +                              "\n║     Adidas    ║    Nike    ║Converse║"
                +                              "\n╠═════╬════╬════╣"
                +                              "\n║      Puma     ║    Vans    ║ Reebok ║"
                +                              "\n╠═════╬════╬════╣"
                +                              "\n║  Skechers  ║     Fila      ║     910     ║"
                +                              "\n╚═════╩════╩════╝"
                + "\n\nPilih Brand Sepatu Yang Diinginkan: ", "Brand", 1);
        
        colour4 = JOptionPane.showInputDialog(null, "╔═════╦════╦════╗"
                +                                "\n║      Black     ║   White    ║    Gold    ║"
                +                                "\n╠═════╬════╬════╣"
                +                                "\n║      Silver     ║ Orange   ║   Green   ║"
                +                                "\n╠═════╬════╬════╣"
                +                                "\n║     Yellow     ║   Blue     ║     Red      ║"
                +                                "\n╚═════╩════╩════╝"
                + "\n\nPilih Warna Sepatu Yang Diinginkan: ", "Colour", 1);
        
        size4 = JOptionPane.showInputDialog(null, "╔══╦══╦══╗"
                +                              "\n║  26  ║  27  ║  28  ║"
                +                              "\n╠══╬══╬══╣"
                +                              "\n║  29  ║  30  ║  31  ║"
                +                              "\n╠══╬══╬══╣"
                +                              "\n║  32  ║  33  ║  34  ║"
                +                              "\n╚══╩══╩══╝"
                + "\n\nPilih Ukuran Sepatu Anda: ", "Size", 1);
        
        value4 = JOptionPane.showInputDialog("╔═══════╦═══════╗"
                +                         "\n║  Rp200.000,00 ║  Rp300.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp400.000,00 ║  Rp500.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp600.000,00 ║  Rp700.000,00  ║"
                +                         "\n╠═══════╬═══════╣"
                +                         "\n║  Rp800.000,00 ║  Rp900.000,00  ║"
                +                         "\n╚═══════╩═══════╝"
                + "\n\nPilih Jenis Kisaran Harga Yang Anda Inginkan: ", "Input Angka Saja..");
        price4 = Integer.parseInt(value3);
        
        total =price + price2 + price3 + price4;
        
        detail = JOptionPane.showConfirmDialog(null, "┎╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍┓"
                +                                  "\n╎                 KASIR SNAKE 01                     ╎ Tanggal Pembelian: " + dateFormat.format(cal.getTime())
                +                                  "\n╎ Jl.Hati-Hati Banyak Anak Kecil no.06 ╎ Gender: " + gender
                +                                  "\n╎            www.ajinotoputri.com                ╎"
                +                                  "\n┕╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍╍┚"
                +                                  "\nNOTA: "   
                +                                  "\nMerk Sepatu 1   : ........................... " + merk 
                +                                  "\nMerk Sepatu 2   : ........................... " + merk2
                +                                  "\nMerk Sepatu 3   : ........................... " + merk3
                +                                  "\nMerk Sepatu 4   : ........................... " + merk4
                +                                  "\nTipe Sepatu 1    : ........................... " + type
                +                                  "\nTipe Sepatu 2    : ........................... " + type2
                +                                  "\nTipe Sepatu 3    : ........................... " + type3
                +                                  "\nTipe Sepatu 4    : ........................... " + type4
                +                                  "\nColour 1              : ........................... " + colour 
                +                                  "\nColour 2              : ........................... " + colour2
                +                                  "\nColour 3              : ........................... " + colour3
                +                                  "\nColour 4              : ........................... " + colour4
                +                                  "\nSize 1                  : ........................... " + size 
                +                                  "\nSize 2                  : ........................... " + size2
                +                                  "\nSize 3                  : ........................... " + size3
                +                                  "\nSize 4                  : ........................... " + size4
                +                                  "\nHarga Sepatu 1 : ........................... " + Rupiah.format(price)
                +                                  "\nHarga Sepatu 2 : ........................... " + Rupiah.format(price2)
                +                                  "\nHarga Sepatu 3 : ........................... " + Rupiah.format(price3)
                +       
                "\nHarga Sepatu 4 : ........................... " + Rupiah.format(price4)
                +                                "\n\n======================================================"
                +                                "\nTotal Harga      : ........................... " + Rupiah.format(total)
                +                                "\n======================================================"
                +                                "\n\n*Beli 2 Diskon Rp50.000,00*\n*Beli 3 Diskon Rp100.000,00*"
                +                                "\n\nIngin menambah sepatu?", "Detail", JOptionPane.YES_NO_OPTION, 1);

        if (detail == 0) {
            JOptionPane.showMessageDialog(null, "    Maaf, batas pembelian hanya bisa 4 produk."
                                          + "\n!Terimakasih Telah Berbelanja Di Toko Jaya Baru!");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "!Terimakasih Telah Berbelanja Di Toko Jaya Baru!");
            System.exit(0);
        }

    }
}