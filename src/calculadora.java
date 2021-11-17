// Nelson Alejadro Cosme Diaz 10142016
// Calculadora


public class Calculadora extends javax.swing.JFrame {
    private double num1;
    private double num2;
    private String signo;
    

Sumar suma1 = new Sumar();
Resta resta1 = new Resta();
Multiplicar multiplicacion1 = new Multiplicar();
Division division1 = new Division();




    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        textooperacion1 = new javax.swing.JLabel();
        textoresultado1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        textooperacion = new javax.swing.JLabel();
        textoresultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        division = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        porcentaje = new javax.swing.JButton();
        elevador = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        borrador = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        cero = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        textooperacion1.setBackground(new java.awt.Color(255, 255, 255));
        textooperacion1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        textooperacion1.setForeground(new java.awt.Color(0, 0, 51));
        textooperacion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textooperacion1.setText("5 x 10 +20");

        textoresultado1.setBackground(new java.awt.Color(153, 255, 255));
        textoresultado1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        textoresultado1.setForeground(new java.awt.Color(0, 0, 51));
        textoresultado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoresultado1.setText("31231231");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textooperacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(textooperacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoresultado1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jFrame1.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 110));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 51));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton21.setText("÷");
        jButton21.setFocusPainted(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 50, 50));

        jButton22.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 0, 51));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton22.setText("-");
        jButton22.setFocusPainted(false);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 50, 50));

        jButton23.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 0, 51));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton23.setText("%");
        jButton23.setFocusPainted(false);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 50));

        jButton24.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 0, 51));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton24.setText("^");
        jButton24.setFocusPainted(false);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton25.setForeground(new java.awt.Color(0, 0, 51));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm) (1).png"))); // NOI18N
        jButton25.setText("Result");
        jButton25.setFocusPainted(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 120, 50));

        jButton26.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 0, 51));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton26.setText("7");
        jButton26.setFocusPainted(false);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 50));

        jButton27.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 0, 51));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton27.setText("8");
        jButton27.setFocusPainted(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, 50));

        jButton28.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 0, 51));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton28.setText("9");
        jButton28.setFocusPainted(false);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 50, 50));

        jButton29.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 0, 51));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton29.setText("X");
        jButton29.setFocusPainted(false);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 50, 50));

        jButton30.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 0, 51));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton30.setText("+");
        jButton30.setFocusPainted(false);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 50, 50));

        jButton31.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 0, 51));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton31.setText("6");
        jButton31.setFocusPainted(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 50, 50));

        jButton32.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton32.setForeground(new java.awt.Color(0, 0, 51));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton32.setText("5");
        jButton32.setFocusPainted(false);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 50));

        jButton33.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton33.setForeground(new java.awt.Color(0, 0, 51));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton33.setText("4");
        jButton33.setFocusPainted(false);
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, 50));

        jButton34.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton34.setForeground(new java.awt.Color(0, 0, 51));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton34.setText(".");
        jButton34.setFocusPainted(false);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 50, 50));

        jButton35.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton35.setForeground(new java.awt.Color(0, 0, 51));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton35.setText("2");
        jButton35.setFocusPainted(false);
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, 50));

        jButton36.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton36.setForeground(new java.awt.Color(0, 0, 51));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton36.setText("3");
        jButton36.setFocusPainted(false);
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton36.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 50, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 290, 50));

        jButton37.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton37.setForeground(new java.awt.Color(0, 0, 51));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton37.setText("C");
        jButton37.setFocusPainted(false);
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton37.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jButton38.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton38.setForeground(new java.awt.Color(0, 0, 51));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton38.setText("1");
        jButton38.setFocusPainted(false);
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton38.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 50, 50));

        jButton39.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton39.setForeground(new java.awt.Color(0, 0, 51));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        jButton39.setText("0");
        jButton39.setFocusPainted(false);
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton39.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        jPanel5.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 50, 50));

        jFrame1.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 290, 320));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        textooperacion.setBackground(new java.awt.Color(255, 255, 255));
        textooperacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        textooperacion.setForeground(new java.awt.Color(0, 0, 51));
        textooperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        textoresultado.setBackground(new java.awt.Color(255, 255, 255));
        textoresultado.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        textoresultado.setForeground(new java.awt.Color(0, 0, 51));
        textoresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textooperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(textooperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoresultado, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        division.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        division.setForeground(new java.awt.Color(0, 0, 51));
        division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        division.setText("÷");
        division.setFocusPainted(false);
        division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        jPanel2.add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 50, 50));

        resta.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        resta.setForeground(new java.awt.Color(0, 0, 51));
        resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        resta.setText("-");
        resta.setFocusPainted(false);
        resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        jPanel2.add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 50, 50));

        porcentaje.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        porcentaje.setForeground(new java.awt.Color(0, 0, 51));
        porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        porcentaje.setText("%");
        porcentaje.setFocusPainted(false);
        porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 50));

        elevador.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        elevador.setForeground(new java.awt.Color(0, 0, 51));
        elevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        elevador.setText("^");
        elevador.setFocusPainted(false);
        elevador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        elevador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        elevador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadorActionPerformed(evt);
            }
        });
        jPanel2.add(elevador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        resultado.setForeground(new java.awt.Color(0, 0, 51));
        resultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm) (1).png"))); // NOI18N
        resultado.setText("Result");
        resultado.setFocusPainted(false);
        resultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        jPanel2.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 120, 50));

        siete.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        siete.setForeground(new java.awt.Color(0, 0, 51));
        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        siete.setText("7");
        siete.setFocusPainted(false);
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        siete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel2.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 50));

        ocho.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        ocho.setForeground(new java.awt.Color(0, 0, 51));
        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        ocho.setText("8");
        ocho.setFocusPainted(false);
        ocho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ocho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel2.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, 50));

        nueve.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        nueve.setForeground(new java.awt.Color(0, 0, 51));
        nueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        nueve.setText("9");
        nueve.setFocusPainted(false);
        nueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel2.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 50, 50));

        multiplicacion.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        multiplicacion.setForeground(new java.awt.Color(0, 0, 51));
        multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        multiplicacion.setText("X");
        multiplicacion.setFocusPainted(false);
        multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 50, 50));

        suma.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        suma.setForeground(new java.awt.Color(0, 0, 51));
        suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        suma.setText("+");
        suma.setFocusPainted(false);
        suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        jPanel2.add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 50, 50));

        seis.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        seis.setForeground(new java.awt.Color(0, 0, 51));
        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        seis.setText("6");
        seis.setFocusPainted(false);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel2.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 50, 50));

        cinco.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        cinco.setForeground(new java.awt.Color(0, 0, 51));
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        cinco.setText("5");
        cinco.setFocusPainted(false);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel2.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 50));

        cuatro.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        cuatro.setForeground(new java.awt.Color(0, 0, 51));
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        cuatro.setText("4");
        cuatro.setFocusPainted(false);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel2.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, 50));

        punto.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        punto.setForeground(new java.awt.Color(0, 0, 51));
        punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        punto.setText(".");
        punto.setFocusPainted(false);
        punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        jPanel2.add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 50, 50));

        dos.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        dos.setForeground(new java.awt.Color(0, 0, 51));
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        dos.setText("2");
        dos.setFocusPainted(false);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel2.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, 50));

        tres.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        tres.setForeground(new java.awt.Color(0, 0, 51));
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        tres.setText("3");
        tres.setFocusPainted(false);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel2.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 50, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 290, 50));

        borrador.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        borrador.setForeground(new java.awt.Color(0, 0, 51));
        borrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        borrador.setText("C");
        borrador.setFocusPainted(false);
        borrador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        borrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borradorActionPerformed(evt);
            }
        });
        jPanel2.add(borrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        uno.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        uno.setForeground(new java.awt.Color(0, 0, 51));
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        uno.setText("1");
        uno.setFocusPainted(false);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel2.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 50, 50));

        cero.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        cero.setForeground(new java.awt.Color(0, 0, 51));
        cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm).png"))); // NOI18N
        cero.setText("0");
        cero.setFocusPainted(false);
        cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título (50 x 50 cm) (5 x 5 cm).png"))); // NOI18N
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel2.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 290, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elevadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadorActionPerformed
         agregarEnPantalla("^");  
          System.out.println("Se presiono ^");
    }//GEN-LAST:event_elevadorActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
         
         this.signo="/";
        System.out.println("Se presiono /");
        String num1texto = textooperacion.getText();
       this.num1= Double.parseDouble(num1texto);
       textooperacion.setText("");
    }//GEN-LAST:event_divisionActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
    String num2texto = textooperacion.getText();
    if(this.signo=="+"){
       this.num2= Double.parseDouble(num2texto);
        Double resultado1 =suma1.execute(num1, num2);
        String resultadofinal = resultado1.toString();
        textoresultado.setText(resultadofinal);
        textooperacion.setText("");}
    
    else if(this.signo== "-"){
      this.num2= Double.parseDouble(num2texto);
        Double resultado1 =resta1.execute(num1, num2);
        String resultadofinal = resultado1.toString();
        textoresultado.setText(resultadofinal);
        textooperacion.setText("");} 
     else if(this.signo== "*"){
      this.num2= Double.parseDouble(num2texto);
        Double resultado1 =multiplicacion1.execute(num1, num2);
        String resultadofinal = resultado1.toString();
        textoresultado.setText(resultadofinal);
        textooperacion.setText("");}
    else if(this.signo== "/"){
      this.num2= Double.parseDouble(num2texto);
        Double resultado1 =division1.execute(num1, num2);
        String resultadofinal = resultado1.toString();
        textoresultado.setText(resultadofinal);
        textooperacion.setText("");}
    
    }//GEN-LAST:event_resultadoActionPerformed

    private void porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeActionPerformed
         agregarEnPantalla("%");   System.out.println("Se presiono %");
    }//GEN-LAST:event_porcentajeActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void borradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borradorActionPerformed
        System.out.println("Se presiono Borrar");
        textooperacion.setText("");
        textoresultado.setText("");
        
    }//GEN-LAST:event_borradorActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
      agregarEnPantalla("7");  
      System.out.println("Se presiono 7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        agregarEnPantalla("8"); 
         System.out.println("Se presiono 8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
         agregarEnPantalla("9"); 
          System.out.println("Se presiono 9");
    }//GEN-LAST:event_nueveActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
         agregarEnPantalla("4");  
          System.out.println("Se presiono 4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
         agregarEnPantalla("5");  
          System.out.println("Se presiono 5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
         agregarEnPantalla("6");  
          System.out.println("Se presiono 6");
    }//GEN-LAST:event_seisActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
         agregarEnPantalla("1");  
          System.out.println("Se presiono 1");
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
         agregarEnPantalla("2");  
          System.out.println("Se presiono 2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
         agregarEnPantalla("3");  
          System.out.println("Se presiono 3");
    }//GEN-LAST:event_tresActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
         agregarEnPantalla("0");  
          System.out.println("Se presiono 0");
    }//GEN-LAST:event_ceroActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
         agregarEnPantalla(".");  
          System.out.println("Se presiono un punto");
    }//GEN-LAST:event_puntoActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
     this.signo= "-";         
          System.out.println("Se presiono -");
          String num1texto = textooperacion.getText();
       this.num1= Double.parseDouble(num1texto);
       textooperacion.setText("");
    }//GEN-LAST:event_restaActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        
         this.signo="+";
        System.out.println("Se presiono +");
        String num1texto = textooperacion.getText();
       this.num1= Double.parseDouble(num1texto);
       textooperacion.setText("");
        
    
    
        
    }//GEN-LAST:event_sumaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
         this.signo="*";
        System.out.println("Se presiono *");
        String num1texto = textooperacion.getText();
       this.num1= Double.parseDouble(num1texto);
       textooperacion.setText(""); 
    }//GEN-LAST:event_multiplicacionActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
     public void agregarEnPantalla(String valor){
     textooperacion.setText(textooperacion.getText()+valor);
 
 }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrador;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton division;
    private javax.swing.JButton dos;
    private javax.swing.JButton elevador;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton porcentaje;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JButton resultado;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton suma;
    protected javax.swing.JLabel textooperacion;
    private javax.swing.JLabel textooperacion1;
    private javax.swing.JLabel textoresultado;
    private javax.swing.JLabel textoresultado1;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
