/*   1:    */ java.awt.BorderLayout
/*   2:    */ java.awt.Color
/*   3:    */ java.awt.Container
/*   4:    */ java.awt.Dimension
/*   5:    */ java.awt.FlowLayout
/*   6:    */ java.awt.Graphics
/*   7:    */ java.awt.Graphics2D
/*   8:    */ java.awt.event.ActionEvent
/*   9:    */ java.awt.event.ActionListener
/*  10:    */ java.awt.event.ItemEvent
/*  11:    */ java.awt.event.ItemListener
/*  12:    */ java.awt.geom.Line2D.Float
/*  13:    */ java.awt.geom.Rectangle2D.Float
/*  14:    */ javax.swing.JButton
/*  15:    */ javax.swing.JCheckBox
/*  16:    */ javax.swing.JFrame
/*  17:    */ javax.swing.JLabel
/*  18:    */ javax.swing.JPanel
/*  19:    */ 
/*  20:    */ Life
/*  21:    */   
/*  22:    */   , , 
/*  23:    */ 
/*  24: 26 */   [][]coord = 2518
/*  25: 27 */   [][]Age = 2518
/*  26: 28 */   startbut = 
/*  27:    */   diescum
/*  28: 30 */   No = 0
/*  29: 31 */   next = "Next"
/*  30: 32 */   random = "Random"
/*  31: 33 */   screen = "Clear Screen"
/*  32: 34 */   start = "Start"
/*  33: 35 */   label = " Generation: "No
/*  34: 36 */   death = "Live Forever"
/*  35:    */   runner
/*  36:    */   
/*  37:    */   Life
/*  38:    */   
/*  39: 42 */     "Life by Simon Foster"
/*  40: 43 */     setSize355, 300
/*  41: 44 */     setVisible
/*  42: 45 */     setDefaultCloseOperation3
/*  43: 46 */      = getContentPane()
/*  44: 47 */      = ()
/*  45: 48 */      = ()
/*  46: 49 */     setBackgroundgray
/*  47: 50 */      = ()
/*  48: 51 */     setBackgroundwhite
/*  49: 52 */      = ()
/*  50: 53 */      = ()
/*  51: 54 */     setLayout
/*  52: 55 */     setLayout
/*  53: 56 */     death.setBackground(Color.white);
/*  54: 57 */     this.next.addActionListener(this);
/*  55: 58 */     this.random.addActionListener(this);
/*  56: 59 */     this.screen.addActionListener(this);
/*  57: 60 */     this.start.addActionListener(this);
/*  58: 61 */     this.death.addItemListener(this);
/*  59:    */     
/*  60: 63 */     statpanel.add(this.label, "West");
/*  61: 64 */     statpanel.add(this.death, "East");
/*  62: 65 */     butpanel.add(this.start);
/*  63: 66 */     butpanel.add(this.next);
/*  64: 67 */     butpanel.add(this.random);
/*  65: 68 */     butpanel.add(this.screen);
/*  66:    */     
/*  67: 70 */     contentArea.add(statpanel, "South");
/*  68: 71 */     contentArea.add(panel, "Center");
/*  69: 72 */     contentArea.add(butpanel, "North");
/*  70: 73 */     setContentPane(contentArea);
/*  71:    */   }
/*  72:    */   
/*  73:    */   class CustomPanel
/*  74:    */     extends JPanel
/*  75:    */   {
/*  76:    */     CustomPanel() {}
/*  77:    */     
/*  78:    */     public void paintComponent(Graphics painter)
/*  79:    */     {
/*  80: 92 */       Graphics2D painter2D = (Graphics2D)painter;
/*  81: 93 */       Rectangle2D.Float box = new Rectangle2D.Float(0.0F, 0.0F, getSize().width, getSize().height);
/*  82: 94 */       Rectangle2D.Float birth = new Rectangle2D.Float(50.0F, 10.0F, 15.0F, 15.0F);
/*  83: 95 */       Rectangle2D.Float one = new Rectangle2D.Float(50.0F, 25.0F, 15.0F, 15.0F);
/*  84: 96 */       Rectangle2D.Float two = new Rectangle2D.Float(50.0F, 40.0F, 15.0F, 15.0F);
/*  85: 97 */       Rectangle2D.Float three = new Rectangle2D.Float(50.0F, 55.0F, 15.0F, 15.0F);
/*  86: 98 */       Rectangle2D.Float four = new Rectangle2D.Float(50.0F, 70.0F, 15.0F, 15.0F);
/*  87: 99 */       Rectangle2D.Float five = new Rectangle2D.Float(50.0F, 85.0F, 15.0F, 15.0F);
/*  88:100 */       Rectangle2D.Float six = new Rectangle2D.Float(50.0F, 100.0F, 15.0F, 15.0F);
/*  89:101 */       Rectangle2D.Float seven = new Rectangle2D.Float(50.0F, 115.0F, 15.0F, 15.0F);
/*  90:102 */       Rectangle2D.Float eight = new Rectangle2D.Float(50.0F, 130.0F, 15.0F, 15.0F);
/*  91:103 */       Rectangle2D.Float nine = new Rectangle2D.Float(50.0F, 145.0F, 15.0F, 15.0F);
/*  92:104 */       Rectangle2D.Float ten = new Rectangle2D.Float(50.0F, 160.0F, 15.0F, 15.0F);
/*  93:105 */       Rectangle2D.Float death = new Rectangle2D.Float(50.0F, 175.0F, 15.0F, 15.0F);
/*  94:106 */       Rectangle2D.Float birth2 = new Rectangle2D.Float(0.0F, 10.0F, 65.0F, 15.0F);
/*  95:107 */       Rectangle2D.Float one2 = new Rectangle2D.Float(0.0F, 25.0F, 65.0F, 15.0F);
/*  96:108 */       Rectangle2D.Float two2 = new Rectangle2D.Float(0.0F, 40.0F, 65.0F, 15.0F);
/*  97:109 */       Rectangle2D.Float three2 = new Rectangle2D.Float(0.0F, 55.0F, 65.0F, 15.0F);
/*  98:110 */       Rectangle2D.Float four2 = new Rectangle2D.Float(0.0F, 70.0F, 65.0F, 15.0F);
/*  99:111 */       Rectangle2D.Float five2 = new Rectangle2D.Float(0.0F, 85.0F, 65.0F, 15.0F);
/* 100:112 */       Rectangle2D.Float six2 = new Rectangle2D.Float(0.0F, 100.0F, 65.0F, 15.0F);
/* 101:113 */       Rectangle2D.Float seven2 = new Rectangle2D.Float(0.0F, 115.0F, 65.0F, 15.0F);
/* 102:114 */       Rectangle2D.Float eight2 = new Rectangle2D.Float(0.0F, 130.0F, 65.0F, 15.0F);
/* 103:115 */       Rectangle2D.Float nine2 = new Rectangle2D.Float(0.0F, 145.0F, 65.0F, 15.0F);
/* 104:116 */       Rectangle2D.Float ten2 = new Rectangle2D.Float(0.0F, 160.0F, 65.0F, 15.0F);
/* 105:117 */       Rectangle2D.Float death2 = new Rectangle2D.Float(0.0F, 175.0F, 65.0F, 15.0F);
/* 106:118 */       Line2D.Float line = new Line2D.Float(50.0F, 10.0F, 50.0F, 175.0F);
/* 107:119 */       painter2D.setColor(Color.lightGray);
/* 108:120 */       painter2D.fill(box);
/* 109:121 */       painter2D.setColor(Color.red);
/* 110:122 */       painter2D.fill(birth);
/* 111:123 */       painter2D.setColor(Color.orange);
/* 112:124 */       painter2D.fill(one);
/* 113:125 */       painter2D.setColor(Color.yellow);
/* 114:126 */       painter2D.fill(two);
/* 115:127 */       painter2D.setColor(Color.green);
/* 116:128 */       painter2D.fill(three);
/* 117:129 */       painter2D.setColor(Color.cyan);
/* 118:130 */       painter2D.fill(four);
/* 119:131 */       painter2D.setColor(Color.blue);
/* 120:132 */       painter2D.fill(five);
/* 121:133 */       painter2D.setColor(Color.magenta);
/* 122:134 */       painter2D.fill(six);
/* 123:135 */       painter2D.setColor(Color.pink);
/* 124:136 */       painter2D.fill(seven);
/* 125:137 */       painter2D.setColor(Color.lightGray);
/* 126:138 */       painter2D.fill(eight);
/* 127:139 */       painter2D.setColor(Color.gray);
/* 128:140 */       painter2D.fill(nine);
/* 129:141 */       painter2D.setColor(Color.darkGray);
/* 130:142 */       painter2D.fill(ten);
/* 131:143 */       painter2D.setColor(Color.black);
/* 132:144 */       painter2D.draw(line);
/* 133:145 */       painter2D.fill(death);
/* 134:146 */       painter2D.draw(birth2);
/* 135:147 */       painter2D.draw(one2);
/* 136:148 */       painter2D.draw(two2);
/* 137:149 */       painter2D.draw(three2);
/* 138:150 */       painter2D.draw(four2);
/* 139:151 */       painter2D.draw(five2);
/* 140:152 */       painter2D.draw(six2);
/* 141:153 */       painter2D.draw(seven2);
/* 142:154 */       painter2D.draw(eight2);
/* 143:155 */       painter2D.draw(nine2);
/* 144:156 */       painter2D.draw(ten2);
/* 145:157 */       painter2D.draw(death2);
/* 146:158 */       painter2D.drawString("Birth ", 10, 23);
/* 147:159 */       painter2D.drawString("   1  ", 10, 38);
/* 148:160 */       painter2D.drawString("   2  ", 10, 53);
/* 149:161 */       painter2D.drawString("   3  ", 10, 68);
/* 150:162 */       painter2D.drawString("   4  ", 10, 83);
/* 151:163 */       painter2D.drawString("   5  ", 10, 98);
/* 152:164 */       painter2D.drawString("   6  ", 10, 113);
/* 153:165 */       painter2D.drawString("   7  ", 10, 128);
/* 154:166 */       painter2D.drawString("   8  ", 10, 143);
/* 155:167 */       painter2D.drawString("   9  ", 10, 158);
/* 156:168 */       painter2D.drawString("  10  ", 10, 173);
/* 157:169 */       painter2D.drawString("Death ", 10, 188);
/* 158:171 */       for (int j = 0; j <= 24; j++) {
/* 159:173 */         for (int k = 0; k <= 17; k++)
/* 160:    */         {
/* 161:175 */           int jc = j * 10;
/* 162:176 */           int kc = k * 10;
/* 163:177 */           Rectangle2D.Float cell = new Rectangle2D.Float(70 + jc, 10 + kc, 10.0F, 10.0F);
/* 164:178 */           Rectangle2D.Float grid = new Rectangle2D.Float(70 + jc, 10 + kc, 10.0F, 10.0F);
/* 165:180 */           if ((Life.diescum == 1) && (Life.Age[j][k] == 13)) {
/* 166:181 */             Life.Age[j][k] = 1;
/* 167:    */           }
/* 168:182 */           if ((Life.Age[j][k] == 1) && (Life.coord[j][k] == 1)) {
/* 169:183 */             painter2D.setColor(Color.red);
/* 170:    */           }
/* 171:184 */           if (Life.coord[j][k] == 0) {
/* 172:185 */             painter2D.setColor(Color.white);
/* 173:    */           }
/* 174:186 */           if ((Life.Age[j][k] == 2) && (Life.coord[j][k] == 1)) {
/* 175:187 */             painter2D.setColor(Color.orange);
/* 176:    */           }
/* 177:188 */           if ((Life.Age[j][k] == 3) && (Life.coord[j][k] == 1)) {
/* 178:189 */             painter2D.setColor(Color.yellow);
/* 179:    */           }
/* 180:190 */           if ((Life.Age[j][k] == 4) && (Life.coord[j][k] == 1)) {
/* 181:191 */             painter2D.setColor(Color.green);
/* 182:    */           }
/* 183:192 */           if ((Life.Age[j][k] == 5) && (Life.coord[j][k] == 1)) {
/* 184:193 */             painter2D.setColor(Color.cyan);
/* 185:    */           }
/* 186:194 */           if ((Life.Age[j][k] == 6) && (Life.coord[j][k] == 1)) {
/* 187:195 */             painter2D.setColor(Color.blue);
/* 188:    */           }
/* 189:196 */           if ((Life.Age[j][k] == 7) && (Life.coord[j][k] == 1)) {
/* 190:197 */             painter2D.setColor(Color.magenta);
/* 191:    */           }
/* 192:198 */           if ((Life.Age[j][k] == 8) && (Life.coord[j][k] == 1)) {
/* 193:199 */             painter2D.setColor(Color.pink);
/* 194:    */           }
/* 195:200 */           if ((Life.Age[j][k] == 9) && (Life.coord[j][k] == 1)) {
/* 196:201 */             painter2D.setColor(Color.lightGray);
/* 197:    */           }
/* 198:202 */           if ((Life.Age[j][k] == 10) && (Life.coord[j][k] == 1)) {
/* 199:203 */             painter2D.setColor(Color.gray);
/* 200:    */           }
/* 201:204 */           if ((Life.Age[j][k] == 11) && (Life.coord[j][k] == 1)) {
/* 202:205 */             painter2D.setColor(Color.darkGray);
/* 203:    */           }
/* 204:206 */           if ((Life.Age[j][k] == 12) && (Life.coord[j][k] == 1)) {
/* 205:207 */             painter2D.setColor(Color.black);
/* 206:    */           }
/* 207:208 */           if ((Life.Age[j][k] == 13) && (Life.coord[j][k] == 1))
/* 208:    */           {
/* 209:209 */             painter2D.setColor(Color.white);
/* 210:210 */             Life.Age[j][k] = 0;
/* 211:211 */             Life.coord[j][k] = 0;
/* 212:    */           }
/* 213:213 */           painter2D.fill(cell);
/* 214:214 */           painter2D.setColor(Color.black);
/* 215:215 */           painter2D.draw(grid);
/* 216:    */         }
/* 217:    */       }
/* 218:    */     }
/* 219:    */   }
/* 220:    */   
/* 221:    */   public static void main(String[] arguments)
/* 222:    */   {
/* 223:229 */     Life eg = new Life();
/* 224:230 */     randy();
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void test()
/* 228:    */   {
/* 229:238 */     int[][] ccoord = new int[25][18];
/* 230:239 */     int total = 0;
/* 231:240 */     for (int j = 0; j <= 24; j++) {
/* 232:242 */       for (int k = 0; k <= 17; k++)
/* 233:    */       {
/* 234:244 */         if ((j == 0) && (k == 0)) {
/* 235:246 */           total = coord[j][(k + 1)] + coord[(j + 1)][k] + 
/* 236:247 */             coord[(j + 1)][(k + 1)];
/* 237:249 */         } else if ((j == 0) && (k == 17)) {
/* 238:251 */           total = coord[j][(k - 1)] + coord[(j + 1)][k] + 
/* 239:252 */             coord[(j + 1)][(k - 1)];
/* 240:254 */         } else if (j == 0) {
/* 241:256 */           total = coord[j][(k + 1)] + coord[(j + 1)][k] + 
/* 242:257 */             coord[(j + 1)][(k + 1)] + coord[(j + 1)][(k - 1)] + 
/* 243:258 */             coord[j][(k - 1)];
/* 244:260 */         } else if ((j == 24) && (k == 0)) {
/* 245:262 */           total = coord[j][(k + 1)] + coord[(j - 1)][k] + 
/* 246:263 */             coord[(j - 1)][(k + 1)];
/* 247:265 */         } else if ((j == 24) && (k == 17)) {
/* 248:267 */           total = coord[j][(k - 1)] + coord[(j - 1)][k] + 
/* 249:268 */             coord[(j - 1)][(k - 1)];
/* 250:270 */         } else if (j == 24) {
/* 251:272 */           total = coord[j][(k + 1)] + coord[(j - 1)][k] + 
/* 252:273 */             coord[(j - 1)][(k + 1)] + coord[j][(k - 1)] + 
/* 253:274 */             coord[(j - 1)][(k - 1)];
/* 254:276 */         } else if (k == 0) {
/* 255:278 */           total = coord[j][(k + 1)] + coord[(j + 1)][k] + 
/* 256:279 */             coord[(j + 1)][(k + 1)] + coord[(j - 1)][k] + 
/* 257:280 */             coord[(j - 1)][(k + 1)];
/* 258:282 */         } else if (k == 17) {
/* 259:284 */           total = coord[j][(k - 1)] + coord[(j + 1)][k] + 
/* 260:285 */             coord[(j + 1)][(k - 1)] + coord[(j - 1)][k] + 
/* 261:286 */             coord[(j - 1)][(k - 1)];
/* 262:288 */         } else if ((j != 0) && (k != 0)) {
/* 263:290 */           total = coord[j][(k + 1)] + coord[j][(k - 1)] + coord[(j + 1)][k] + 
/* 264:291 */             coord[(j - 1)][k] + coord[(j - 1)][(k - 1)] + 
/* 265:292 */             coord[(j - 1)][(k + 1)] + coord[(j + 1)][(k - 1)] + 
/* 266:293 */             coord[(j + 1)][(k + 1)];
/* 267:    */         }
/* 268:296 */         if ((total == 2) && (coord[j][k] == 1))
/* 269:    */         {
/* 270:299 */           coord[j][k] = 1; int 
/* 271:300 */             tmp633_631 = k; int[] tmp633_630 = Age[j]; int tmp637_636 = (tmp633_630[tmp633_631] + 1);tmp633_630[tmp633_631] = tmp637_636;Age[j][k] = tmp637_636;
/* 272:301 */           ccoord[j][k] = 1;
/* 273:    */         }
/* 274:302 */         else if (total == 3)
/* 275:    */         {
/* 276:303 */           ccoord[j][k] = 1; int 
/* 277:304 */             tmp676_674 = k; int[] tmp676_673 = Age[j]; int tmp680_679 = (tmp676_673[tmp676_674] + 1);tmp676_673[tmp676_674] = tmp680_679;Age[j][k] = tmp680_679;
/* 278:    */         }
/* 279:    */         else
/* 280:    */         {
/* 281:306 */           ccoord[j][k] = 0;
/* 282:307 */           Age[j][k] = 0;
/* 283:    */         }
/* 284:    */       }
/* 285:    */     }
/* 286:312 */     coord = ccoord;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public static void randy()
/* 290:    */   {
/* 291:321 */     for (int j = 0; j <= 24; j++) {
/* 292:323 */       for (int k = 0; k <= 17; k++)
/* 293:    */       {
/* 294:325 */         int randno = (int)Math.round(Math.random());
/* 295:326 */         coord[j][k] = randno;
/* 296:327 */         Age[j][k] = coord[j][k];
/* 297:    */       }
/* 298:    */     }
/* 299:    */   }
/* 300:    */   
/* 301:    */   public static void clearscr()
/* 302:    */   {
/* 303:337 */     for (int j = 0; j <= 24; j++) {
/* 304:339 */       for (int k = 0; k <= 17; k++)
/* 305:    */       {
/* 306:340 */         coord[j][k] = 0;
/* 307:341 */         Age[j][k] = 0;
/* 308:    */       }
/* 309:    */     }
/* 310:    */   }
/* 311:    */   
/* 312:    */   public void actionPerformed(ActionEvent event)
/* 313:    */   {
/* 314:356 */     if (event.getSource() == this.next)
/* 315:    */     {
/* 316:357 */       test();
/* 317:358 */       No = ++No;
/* 318:359 */       this.label.setText(" Generation: " + No);
/* 319:360 */       for (int j = 0; j <= 24; j++) {
/* 320:362 */         for (int k = 0; k <= 17; k++) {}
/* 321:    */       }
/* 322:366 */       repaint(0, 0, getSize().width, getSize().height);
/* 323:    */     }
/* 324:369 */     if (event.getSource() == this.screen)
/* 325:    */     {
/* 326:370 */       clearscr();
/* 327:371 */       No = 0;
/* 328:372 */       this.label.setText(" Generation: " + No);
/* 329:373 */       repaint(0, 0, getSize().width, getSize().height);
/* 330:    */     }
/* 331:376 */     if (event.getSource() == this.random)
/* 332:    */     {
/* 333:377 */       randy();
/* 334:378 */       No = 0;
/* 335:379 */       this.label.setText(" Generation: " + No);
/* 336:380 */       repaint(0, 0, getSize().width, getSize().height);
/* 337:    */     }
/* 338:382 */     if (event.getSource() == this.start) {
/* 339:384 */       if (startbut)
/* 340:    */       {
/* 341:385 */         startbut = false;
/* 342:386 */         this.start.setText("Start");stop();
/* 343:    */       }
/* 344:    */       else
/* 345:    */       {
/* 346:388 */         startbut = true;
/* 347:389 */         this.start.setText("Stop ");start();
/* 348:    */       }
/* 349:    */     }
/* 350:    */   }
/* 351:    */   
/* 352:    */   public void itemStateChanged(ItemEvent event)
/* 353:    */   {
/* 354:399 */     int state = event.getStateChange();
/* 355:400 */     if ((state == 1) && 
/* 356:401 */       (event.getItem() == this.death)) {
/* 357:402 */       diescum = 1;
/* 358:    */     }
/* 359:404 */     if ((state == 2) && 
/* 360:405 */       (event.getItem() == this.death)) {
/* 361:406 */       diescum = 0;
/* 362:    */     }
/* 363:    */   }
/* 364:    */   
/* 365:    */   public void start()
/* 366:    */   {
/* 367:411 */     if (this.runner == null)
/* 368:    */     {
/* 369:413 */       this.runner = new Thread(this);
/* 370:414 */       this.runner.start();
/* 371:    */     }
/* 372:    */   }
/* 373:    */   
/* 374:    */   public void stop()
/* 375:    */   {
/* 376:419 */     if (this.runner != null) {
/* 377:419 */       this.runner = null;
/* 378:    */     }
/* 379:    */   }
/* 380:    */   
/* 381:    */   public void run()
/* 382:    */   {
/* 383:422 */     while (this.runner == Thread.currentThread())
/* 384:    */     {
/* 385:424 */       repaint();
/* 386:    */       try
/* 387:    */       {
/* 388:427 */         Thread.sleep(1000L);test();
/* 389:428 */         No = ++No;this.label.setText(" Generation: " + No);
/* 390:    */       }
/* 391:    */       catch (InterruptedException localInterruptedException) {}
/* 392:    */     }
/* 393:    */   }
/* 394:    */ }


/* Location:           C:\Program Files (x86)\Life\Life.jar
 * Qualified Name:     Life
 * JD-Core Version:    0.7.0.1
 */