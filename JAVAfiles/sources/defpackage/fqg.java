package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqg implements flu, fmk {
    private int A;
    private fou B;
    private final frj a;
    private final int b;
    private final euf c;
    private final euf d;
    private final euf e;
    private final euf f;
    private final ArrayDeque g;
    private final fqh h;
    private final List i;
    private alog j;
    private int k;
    private int l;
    private long m;
    private int n;
    private euf o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private flw v;
    private fqf[] w;
    private long[][] x;
    private int y;
    private long z;

    @Deprecated
    public fqg() {
        this(frj.a, 16);
    }

    private static int j(int i) {
        if (i != 1751476579) {
            if (i != 1903435808) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    private static int k(fql fqlVar, long j) {
        int a = fqlVar.a(j);
        if (a == -1) {
            return fqlVar.b(j);
        }
        return a;
    }

    private static long l(fql fqlVar, long j, long j2) {
        int k = k(fqlVar, j);
        if (k == -1) {
            return j2;
        }
        return Math.min(fqlVar.c[k], j2);
    }

    private final void m() {
        this.k = 0;
        this.n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f5, code lost:
    
        if (r5 != 1668311404) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f7, code lost:
    
        r14 = defpackage.dyd.k(1668311404, "TCMP", r4, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0205, code lost:
    
        if (r5 != 1668249202) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0207, code lost:
    
        r5 = r4.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0212, code lost:
    
        if (r4.e() != 1684108385) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0214, code lost:
    
        r12 = defpackage.fpz.a(r4.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021e, code lost:
    
        if (r12 != 13) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0220, code lost:
    
        r13 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0232, code lost:
    
        if (r13 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0234, code lost:
    
        defpackage.eub.f("MetadataUtil", "Unrecognized cover art flags: " + r12);
        r18 = r11;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0281, code lost:
    
        r4.J(r7);
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0286, code lost:
    
        r26 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024e, code lost:
    
        r4.K(4);
        r5 = r5 - 16;
        r12 = new byte[r5];
        r4.E(r12, 0, r5);
        r18 = r11;
        r14 = new defpackage.fof(r13, null, 3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0225, code lost:
    
        if (r12 != 14) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0227, code lost:
    
        r13 = "image/png";
        r12 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0231, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0264, code lost:
    
        r18 = r11;
        defpackage.eub.f("MetadataUtil", "Failed to parse cover art attribute");
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x026f, code lost:
    
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0276, code lost:
    
        if (r5 != 1631670868) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0278, code lost:
    
        r14 = defpackage.dyd.m(1631670868, "TPE2", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x028d, code lost:
    
        if (r5 != 1936682605) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x028f, code lost:
    
        r14 = defpackage.dyd.m(1936682605, "TSOT", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x029c, code lost:
    
        if (r5 != 1936679276) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x029e, code lost:
    
        r14 = defpackage.dyd.m(1936679276, "TSOA", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ab, code lost:
    
        if (r5 != 1936679282) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ad, code lost:
    
        r14 = defpackage.dyd.m(1936679282, "TSOP", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ba, code lost:
    
        if (r5 != 1936679265) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bc, code lost:
    
        r14 = defpackage.dyd.m(1936679265, "TSO2", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02c9, code lost:
    
        if (r5 != 1936679791) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cb, code lost:
    
        r14 = defpackage.dyd.m(1936679791, "TSOC", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d8, code lost:
    
        if (r5 != 1920233063) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02da, code lost:
    
        r5 = defpackage.dyd.k(1920233063, "ITUNESADVISORY", r4, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e4, code lost:
    
        r4.J(r7);
        r25 = r2;
        r14 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ee, code lost:
    
        if (r5 != 1885823344) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f0, code lost:
    
        r5 = defpackage.dyd.k(1885823344, "ITUNESGAPLESS", r4, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ff, code lost:
    
        if (r5 != 1936683886) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0301, code lost:
    
        r14 = defpackage.dyd.m(1936683886, "TVSHOWSORT", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030f, code lost:
    
        if (r5 != 1953919848) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0311, code lost:
    
        r14 = defpackage.dyd.m(1953919848, "TVSHOW", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x031f, code lost:
    
        if (r5 != 757935405) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0321, code lost:
    
        r5 = null;
        r14 = null;
        r11 = -1;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0325, code lost:
    
        r12 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0327, code lost:
    
        if (r12 >= r7) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0329, code lost:
    
        r23 = r4.e();
        r12 = r4.e();
        r25 = r2;
        r4.K(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x033c, code lost:
    
        if (r12 != 1835360622) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0347, code lost:
    
        r2 = r23 - 12;
        r26 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x034e, code lost:
    
        if (r12 != 1851878757) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0350, code lost:
    
        r5 = r4.x(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0354, code lost:
    
        r2 = r25;
        r9 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x035c, code lost:
    
        if (r12 != 1684108385) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x035e, code lost:
    
        r13 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0360, code lost:
    
        if (r12 != 1684108385) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0362, code lost:
    
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0364, code lost:
    
        r4.K(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x033e, code lost:
    
        r14 = r4.x(r23 - 12);
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0368, code lost:
    
        r25 = r2;
        r26 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x036c, code lost:
    
        if (r14 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x036e, code lost:
    
        if (r5 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0371, code lost:
    
        if (r11 != (-1)) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0374, code lost:
    
        r4.J(r11);
        r4.K(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0387, code lost:
    
        r14 = new defpackage.foo(r14, r5, r4.x(r13 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x038a, code lost:
    
        r4.J(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0389, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038f, code lost:
    
        r25 = r2;
        r26 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x044b, code lost:
    
        defpackage.eub.b("MetadataUtil", "Skipped unknown metadata entry: " + defpackage.eup.e(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0463, code lost:
    
        r4.J(r7);
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x018f, code lost:
    
        r5 = defpackage.fon.a(defpackage.dyd.j(r4) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0199, code lost:
    
        if (r5 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x019b, code lost:
    
        r12 = new defpackage.Cfor("TCON", null, defpackage.alog.r(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x01ae, code lost:
    
        r4.J(r7);
        r25 = r2;
        r26 = r9;
        r18 = r11;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01a8, code lost:
    
        defpackage.eub.f("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01ad, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x048b, code lost:
    
        r4.J(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x048e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0398, code lost:
    
        r25 = r2;
        r26 = r9;
        r18 = r11;
        r2 = 16777215 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a5, code lost:
    
        if (r2 != 6516084) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03a7, code lost:
    
        r2 = r4.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b2, code lost:
    
        if (r4.e() != 1684108385) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b4, code lost:
    
        r4.K(8);
        r2 = r4.x(r2 - 16);
        r14 = new defpackage.foj("und", r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0475, code lost:
    
        r4.J(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c8, code lost:
    
        defpackage.eub.f("MetadataUtil", "Failed to parse comment attribute: ".concat(defpackage.eup.e(r5)));
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03e1, code lost:
    
        if (r2 == 7233901) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03e6, code lost:
    
        if (r2 != 7631467) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03ed, code lost:
    
        if (r2 == 6516589) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03f2, code lost:
    
        if (r2 != 7828084) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03f9, code lost:
    
        if (r2 != 6578553) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03fb, code lost:
    
        r14 = defpackage.dyd.m(r5, "TDRC", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0406, code lost:
    
        if (r2 != 4280916) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0408, code lost:
    
        r14 = defpackage.dyd.m(r5, "TPE1", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0412, code lost:
    
        if (r2 != 7630703) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0414, code lost:
    
        r14 = defpackage.dyd.m(r5, "TSSE", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x041e, code lost:
    
        if (r2 != 6384738) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0420, code lost:
    
        r14 = defpackage.dyd.m(r5, "TALB", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x042a, code lost:
    
        if (r2 != 7108978) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x042c, code lost:
    
        r14 = defpackage.dyd.m(r5, "USLT", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0436, code lost:
    
        if (r2 != 6776174) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0438, code lost:
    
        r14 = defpackage.dyd.m(r5, "TCON", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0442, code lost:
    
        if (r2 != 6779504) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0444, code lost:
    
        r14 = defpackage.dyd.m(r5, "TIT1", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0468, code lost:
    
        r14 = defpackage.dyd.m(r5, "TCOM", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x046f, code lost:
    
        r14 = defpackage.dyd.m(r5, "TIT2", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x048f, code lost:
    
        r25 = r2;
        r26 = r9;
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x049c, code lost:
    
        if (r0.isEmpty() == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x049f, code lost:
    
        r14 = new defpackage.erk(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0161, code lost:
    
        r4.J(r7);
        r4.K(r12);
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016c, code lost:
    
        r7 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016e, code lost:
    
        if (r7 >= r10) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
    
        r7 = r7 + r4.e();
        r5 = r4.e();
        r12 = (r5 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        if (r12 == 169) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0186, code lost:
    
        if (r12 != 253) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
    
        if (r5 != 1735291493) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bc, code lost:
    
        if (r5 != 1684632427) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01be, code lost:
    
        r14 = defpackage.dyd.l(1684632427, "TPOS", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c4, code lost:
    
        r4.J(r7);
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c9, code lost:
    
        r26 = r9;
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0478, code lost:
    
        if (r14 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x047a, code lost:
    
        r0.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x047d, code lost:
    
        r11 = r18;
        r2 = r25;
        r9 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d5, code lost:
    
        if (r5 != 1953655662) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d7, code lost:
    
        r14 = defpackage.dyd.l(1953655662, "TRCK", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e1, code lost:
    
        if (r5 != 1953329263) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e3, code lost:
    
        r5 = defpackage.dyd.k(1953329263, "TBPM", r4, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01eb, code lost:
    
        r4.J(r7);
        r25 = r2;
        r14 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x076b A[EDGE_INSN: B:392:0x076b->B:393:0x076b BREAK  A[LOOP:10: B:317:0x060d->B:323:0x0757], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x078a A[LOOP:13: B:394:0x0787->B:396:0x078a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, fmq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(long r29) {
        /*
            Method dump skipped, instructions count: 2078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqg.n(long):void");
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.z;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        long j2;
        long j3;
        int b;
        fqf[] fqfVarArr = this.w;
        if (fqfVarArr.length == 0) {
            fml fmlVar = fml.a;
            return new fmi(fmlVar, fmlVar);
        }
        int i = this.y;
        long j4 = -1;
        if (i != -1) {
            fql fqlVar = (fql) fqfVarArr[i].c;
            int k = k(fqlVar, j);
            if (k == -1) {
                fml fmlVar2 = fml.a;
                return new fmi(fmlVar2, fmlVar2);
            }
            long j5 = fqlVar.f[k];
            j2 = fqlVar.c[k];
            if (j5 < j && k < fqlVar.b - 1 && (b = fqlVar.b(j)) != -1 && b != k) {
                j3 = fqlVar.f[b];
                j4 = fqlVar.c[b];
            } else {
                j3 = -9223372036854775807L;
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            fqf[] fqfVarArr2 = this.w;
            if (i2 >= fqfVarArr2.length) {
                break;
            }
            if (i2 != this.y) {
                fql fqlVar2 = (fql) fqfVarArr2[i2].c;
                long l = l(fqlVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = l(fqlVar2, j3, j4);
                }
                j2 = l;
            }
            i2++;
        }
        fml fmlVar3 = new fml(j, j2);
        if (j3 == -9223372036854775807L) {
            return new fmi(fmlVar3, fmlVar3);
        }
        return new fmi(fmlVar3, new fml(j3, j4));
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return true;
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        return this.j;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        if ((this.b & 16) == 0) {
            flwVar = new frm(flwVar, this.a);
        }
        this.v = flwVar;
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = true;
        if (j == 0) {
            if (this.k != 3) {
                m();
                return;
            }
            fqh fqhVar = this.h;
            fqhVar.a.clear();
            fqhVar.b = 0;
            this.i.clear();
            return;
        }
        for (fqf fqfVar : this.w) {
            fql fqlVar = (fql) fqfVar.c;
            int a = fqlVar.a(j2);
            if (a == -1) {
                a = fqlVar.b(j2);
            }
            fqfVar.a = a;
            Object obj = fqfVar.e;
            if (obj != null) {
                ((fmr) obj).b();
            }
        }
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        boolean z;
        alog alogVar;
        if ((this.b & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        fmo a = fqi.a(flvVar, false, z);
        if (a != null) {
            alogVar = alog.r(a);
        } else {
            int i = alog.d;
            alogVar = alsx.a;
        }
        this.j = alogVar;
        if (a == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:342:0x029c, code lost:
    
        if (r31 < r27) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, fmq] */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.flv r36, defpackage.vtk r37) {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqg.i(flv, vtk):int");
    }

    public fqg(frj frjVar, int i) {
        this.a = frjVar;
        this.b = i;
        int i2 = alog.d;
        this.j = alsx.a;
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new fqh();
        this.i = new ArrayList();
        this.f = new euf(16);
        this.g = new ArrayDeque();
        this.c = new euf(euw.a);
        this.d = new euf(5);
        this.e = new euf();
        this.p = -1;
        this.v = flw.y;
        this.w = new fqf[0];
        this.t = true;
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
