/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.nhanvien;

import java.awt.Color;
import java.awt.Image;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TaiKhoan;
import repository.taikhoan.RepositoryTaiKhoan;
import service.taikhoan.ServiceTaiKhoan;

/**
 *
 * @author HUNGpYN
 */
public class CapNhatNhanVien extends javax.swing.JDialog {

    private Color color2 = Color.decode("#101820");// thanden
    private Color color1 = Color.decode("#FEE715"); //mau vang
    private repository.taikhoan.RepositoryTaiKhoan rptk;
     private ServiceTaiKhoan stk;

    public CapNhatNhanVien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setFont();

    }

    void setFont() {
        lbl_ThemMoi.setForeground(color1);
        pnl_ThemMoi.setBackground(color2);
        setLocationRelativeTo(null);
        btn_ThemAnh.setColor1(Color.LIGHT_GRAY);
        txt_NgaySinh.setText("dd - mm - yyyy");

    }

    TaiKhoan readForm() {
        TaiKhoan tk = new TaiKhoan();
        tk.setIDTaiKhoan(txt_MaNhanVien.getText());
        tk.setHoTen(txt_HoVaTen.getText());
        tk.setTaiKhoan(txt_TaiKhoan.getText());
        tk.setMatKhau(txt_MatKhau.getText());
        tk.setDiaChi(txt_DiaChi.getText());
        tk.setEmail(txt_Email.getText());
        tk.setSoDienThoai(txt_SoDienThoai.getText());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null; 
        try {
            utilDate = dateFormat.parse(txt_NgaySinh.getText()); 
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            tk.setNgaySinh(sqlDate); 
        } catch (ParseException e) {
            e.printStackTrace(); 
        }
        String link = (String) lbl_HinhAnh.getClientProperty("imagepath");
        tk.setHinhAnh(link);
        if (rdo_Nam.isSelected()) {
            tk.setGioiTinh(true);
        } else {
            tk.setGioiTinh(false);
        }
        if (rdo_QuanLi.isSelected()) {
            tk.setChucVu(true);
        } else {
            tk.setChucVu(false);
        }
        return tk;

    }

    public void setData(TaiKhoan tk) {
        txt_MaNhanVien.setText(tk.getIDTaiKhoan());
        txt_HoVaTen.setText(tk.getHoTen());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            java.sql.Date sqlDate = tk.getNgaySinh();
            String formattedDate = dateFormat.format(sqlDate);
        txt_NgaySinh.setText(formattedDate);
        txt_TaiKhoan.setText(tk.getTaiKhoan());
        txt_MatKhau.setText(tk.getMatKhau());
        txt_SoDienThoai.setText(tk.getSoDienThoai());
        txt_Email.setText(tk.getEmail());
        txt_DiaChi.setText(tk.getDiaChi());

        if (tk.isGioiTinh()) {
            rdo_Nam.setSelected(true);
        } else {
            rdo_Nu.setSelected(true);
        }

        if (tk.isChucVu()) {
            rdo_QuanLi.setSelected(true);
        } else {
            rdo_NhanVien.setSelected(true);
        }

        if (tk.isTrangThai()) {
            rdoo_LamViec.setSelected(true);
        } else {
            rdo_NghiViec.setSelected(true);
        }
        ImageIcon imageIcon = new ImageIcon(tk.getHinhAnh());
        Image image = imageIcon.getImage(); // Chuyển đổi về đối tượng Image
        Image scaledImage = image.getScaledInstance(lbl_HinhAnh.getWidth() - 2, lbl_HinhAnh.getHeight() - 2, Image.SCALE_SMOOTH); // Thay đổi kích thước ảnh
        imageIcon = new ImageIcon(scaledImage);
        lbl_HinhAnh.setIcon(imageIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnl_ThemMoi = new javax.swing.JPanel();
        lbl_ThemMoi = new javax.swing.JLabel();
        btn_ThemAnh = new view.until.button.Button();
        jLabel1 = new javax.swing.JLabel();
        txt_TaiKhoan = new view.until.textfield.TextFieldSuggestion();
        jLabel2 = new javax.swing.JLabel();
        txt_SoDienThoai = new view.until.textfield.TextFieldSuggestion();
        jLabel3 = new javax.swing.JLabel();
        txt_HoVaTen = new view.until.textfield.TextFieldSuggestion();
        jLabel4 = new javax.swing.JLabel();
        txt_MatKhau = new view.until.textfield.TextFieldSuggestion();
        jLabel5 = new javax.swing.JLabel();
        txt_Email = new view.until.textfield.TextFieldSuggestion();
        jLabel6 = new javax.swing.JLabel();
        txt_NgaySinh = new view.until.textfield.TextFieldSuggestion();
        jLabel7 = new javax.swing.JLabel();
        rdo_QuanLi = new view.until.radiobutton.RadioButtonCustom();
        rdo_NhanVien = new view.until.radiobutton.RadioButtonCustom();
        jLabel8 = new javax.swing.JLabel();
        rdo_Nam = new view.until.radiobutton.RadioButtonCustom();
        rdo_Nu = new view.until.radiobutton.RadioButtonCustom();
        jLabel9 = new javax.swing.JLabel();
        rdoo_LamViec = new view.until.radiobutton.RadioButtonCustom();
        rdo_NghiViec = new view.until.radiobutton.RadioButtonCustom();
        btn_Huy = new view.until.button.Button();
        btn_Luu = new view.until.button.Button();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_DiaChi = new view.until.textarea.TextAreaSuggestion();
        jLabel11 = new javax.swing.JLabel();
        txt_MaNhanVien = new view.until.textfield.TextFieldSuggestion();
        lbl_HinhAnh = new javax.swing.JLabel();

        dateChooser1.setForeground(new java.awt.Color(51, 51, 51));
        dateChooser1.setTextRefernce(txt_NgaySinh);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_ThemMoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_ThemMoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ThemMoi.setText("Cập Nhật Nhân Viên");

        javax.swing.GroupLayout pnl_ThemMoiLayout = new javax.swing.GroupLayout(pnl_ThemMoi);
        pnl_ThemMoi.setLayout(pnl_ThemMoiLayout);
        pnl_ThemMoiLayout.setHorizontalGroup(
            pnl_ThemMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ThemMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_ThemMoiLayout.setVerticalGroup(
            pnl_ThemMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThemMoiLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_ThemMoi)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btn_ThemAnh.setText("Thêm Ảnh");
        btn_ThemAnh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ThemAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemAnhActionPerformed(evt);
            }
        });

        jLabel1.setText("Họ Và Tên:");

        txt_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TaiKhoanActionPerformed(evt);
            }
        });

        jLabel2.setText("Tài Khoản");

        txt_SoDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoDienThoaiActionPerformed(evt);
            }
        });

        jLabel3.setText("Mật khẩu");

        txt_HoVaTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HoVaTenActionPerformed(evt);
            }
        });

        jLabel4.setText("Số Điện Thoại");

        txt_MatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MatKhauActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });

        jLabel6.setText("Ngày Sinh");

        txt_NgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NgaySinhActionPerformed(evt);
            }
        });

        jLabel7.setText("Chức Vụ");

        buttonGroup3.add(rdo_QuanLi);
        rdo_QuanLi.setText("Quản Lí");
        rdo_QuanLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_QuanLiActionPerformed(evt);
            }
        });

        buttonGroup3.add(rdo_NhanVien);
        rdo_NhanVien.setSelected(true);
        rdo_NhanVien.setText("Nhân Viên");

        jLabel8.setText("Giới Tính");

        buttonGroup1.add(rdo_Nam);
        rdo_Nam.setSelected(true);
        rdo_Nam.setText("Nam");

        buttonGroup1.add(rdo_Nu);
        rdo_Nu.setText("Nữ");

        jLabel9.setText("Trạng Thái");

        buttonGroup2.add(rdoo_LamViec);
        rdoo_LamViec.setSelected(true);
        rdoo_LamViec.setText("Làm Việc");
        rdoo_LamViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoo_LamViecActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdo_NghiViec);
        rdo_NghiViec.setText("Nghỉ Việc");

        btn_Huy.setText("Hủy");
        btn_Huy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyActionPerformed(evt);
            }
        });

        btn_Luu.setText("Lưu");
        btn_Luu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
            }
        });

        jLabel10.setText("Địa Chỉ");

        txt_DiaChi.setColumns(20);
        txt_DiaChi.setRows(5);
        jScrollPane1.setViewportView(txt_DiaChi);

        jLabel11.setText("Mã Nhân Viên");

        lbl_HinhAnh.setText("     ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_ThemMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(rdo_QuanLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdo_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(rdo_NghiViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoo_LamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btn_ThemAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lbl_HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(txt_NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rdo_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(rdo_Nu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_MatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(txt_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(txt_HoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_ThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ThemAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_HoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdo_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdo_Nu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdo_QuanLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoo_LamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo_NghiViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_SoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoDienThoaiActionPerformed

    private void txt_HoVaTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HoVaTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HoVaTenActionPerformed

    private void txt_MatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MatKhauActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TaiKhoanActionPerformed

    private void txt_NgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NgaySinhActionPerformed

    private void rdoo_LamViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoo_LamViecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoo_LamViecActionPerformed

    private void rdo_QuanLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_QuanLiActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rdo_QuanLiActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_HuyActionPerformed

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
        try {
            if (readForm() != null) {
                RepositoryTaiKhoan rtk = new RepositoryTaiKhoan();
                rtk.update(readForm()); // Thực hiện thêm dữ liệu vào cơ sở dữ liệu

                // Lấy thể hiện của GiaoDienNhanVien
                GiaoDienNhanVien gdnv = GiaoDienNhanVien.getInstance();
                if (gdnv != null) {
                    gdnv.update(); // Cập nhật bảng
                }

                // Hiển thị thông báo thành công
                JOptionPane.showMessageDialog(this, "Thêm Thành Công");
            } else {
                // Hiển thị thông báo lỗi nếu dữ liệu không hợp lệ
                JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra lại thông tin nhập vào.");
            }
        } catch (Exception e) {
            // Xử lý tất cả các ngoại lệ khác
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Thêm thất bại: " + e.getMessage());
        } finally {
            // Đóng JDialog
            this.dispose();
        }

    }//GEN-LAST:event_btn_LuuActionPerformed

    private void btn_ThemAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemAnhActionPerformed
          stk = new ServiceTaiKhoan();
        stk.chonAnh(lbl_HinhAnh);
    }//GEN-LAST:event_btn_ThemAnhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CapNhatNhanVien dialog = new CapNhatNhanVien(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.until.button.Button btn_Huy;
    private view.until.button.Button btn_Luu;
    private view.until.button.Button btn_ThemAnh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_HinhAnh;
    private javax.swing.JLabel lbl_ThemMoi;
    private javax.swing.JPanel pnl_ThemMoi;
    private view.until.radiobutton.RadioButtonCustom rdo_Nam;
    private view.until.radiobutton.RadioButtonCustom rdo_NghiViec;
    private view.until.radiobutton.RadioButtonCustom rdo_NhanVien;
    private view.until.radiobutton.RadioButtonCustom rdo_Nu;
    private view.until.radiobutton.RadioButtonCustom rdo_QuanLi;
    private view.until.radiobutton.RadioButtonCustom rdoo_LamViec;
    private view.until.textarea.TextAreaSuggestion txt_DiaChi;
    private view.until.textfield.TextFieldSuggestion txt_Email;
    private view.until.textfield.TextFieldSuggestion txt_HoVaTen;
    private view.until.textfield.TextFieldSuggestion txt_MaNhanVien;
    private view.until.textfield.TextFieldSuggestion txt_MatKhau;
    private view.until.textfield.TextFieldSuggestion txt_NgaySinh;
    private view.until.textfield.TextFieldSuggestion txt_SoDienThoai;
    private view.until.textfield.TextFieldSuggestion txt_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}
