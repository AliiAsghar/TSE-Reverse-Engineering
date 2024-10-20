package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhs extends hhr {
    private static final asqx f = aotl.R("'\\");
    private static final asqx g = aotl.R("\"\\");
    private static final asqx h = aotl.R("{}[]:, \n\t\r\f/\\;#=");
    private static final asqx i = aotl.R("\n\r");
    private static final asqx j = aotl.R("*/");
    private final asqw k;
    private final asqu l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    public hhs(asqw asqwVar) {
        this.k = asqwVar;
        this.l = ((asrk) asqwVar).b;
        k(6);
    }

    private final boolean A(int i2) {
        if (i2 != 9 && i2 != 10 && i2 != 12 && i2 != 13 && i2 != 32) {
            if (i2 != 35) {
                if (i2 != 44) {
                    if (i2 != 47 && i2 != 61) {
                        if (i2 != 123 && i2 != 125 && i2 != 58) {
                            if (i2 != 59) {
                                switch (i2) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            w();
            return false;
        }
        return false;
    }

    private final int B(String str, ico icoVar) {
        int length = ((String[]) icoVar.b).length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(((String[]) icoVar.b)[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private final char r() {
        int i2;
        if (this.k.D(1L)) {
            byte d = this.l.d();
            if (d != 10 && d != 34 && d != 39 && d != 47 && d != 92) {
                if (d != 98) {
                    if (d != 102) {
                        if (d == 110) {
                            return '\n';
                        }
                        if (d != 114) {
                            if (d != 116) {
                                if (d == 117) {
                                    if (this.k.D(4L)) {
                                        char c = 0;
                                        for (int i3 = 0; i3 < 4; i3++) {
                                            byte c2 = this.l.c(i3);
                                            char c3 = (char) (c << 4);
                                            if (c2 >= 48 && c2 <= 57) {
                                                i2 = c2 - 48;
                                            } else if (c2 >= 97 && c2 <= 102) {
                                                i2 = c2 - 87;
                                            } else {
                                                if (c2 < 65 || c2 > 70) {
                                                    throw c("\\u".concat(this.l.n(4L)));
                                                }
                                                i2 = c2 - 55;
                                            }
                                            c = (char) (c3 + i2);
                                        }
                                        this.l.B(4L);
                                        return c;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path ".concat(d()));
                                }
                                throw c("Invalid escape sequence: \\" + ((char) d));
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) d;
        }
        throw c("Unterminated escape sequence");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01da, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01db, code lost:
    
        if (r3 == 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01de, code lost:
    
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01df, code lost:
    
        r19.n = r5;
        r19.l.B(r1);
        r19.m = 16;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d0, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ed, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
    
        if (r2 == 2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f3, code lost:
    
        if (r2 == 4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f5, code lost:
    
        if (r2 != 7) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f7, code lost:
    
        r19.o = r4;
        r3 = 17;
        r19.m = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ef, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0225, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        if (A(r10) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c3, code lost:
    
        if (r1 != 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c5, code lost:
    
        if (r9 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cb, code lost:
    
        if (r5 != Long.MIN_VALUE) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:
    
        if (r7 == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d5, code lost:
    
        if (r5 != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d7, code lost:
    
        if (r3 != 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d9, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0246 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int s() {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhs.s():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x004c, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x004e, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a6, code lost:
    
        r5 = r23.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01aa, code lost:
    
        if (r1 == (-1)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ac, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01af, code lost:
    
        if (r15 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b1, code lost:
    
        r1 = r1 + defpackage.hhs.j.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01bc, code lost:
    
        r5.B(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01bf, code lost:
    
        if (r15 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c8, code lost:
    
        throw c("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ba, code lost:
    
        r1 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ae, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6 A[EDGE_INSN: B:58:0x01a6->B:43:0x01a6 BREAK  A[LOOP:2: B:27:0x0077->B:40:0x01c9], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int t(boolean r24) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhs.t(boolean):int");
    }

    private final String u(asqx asqxVar) {
        StringBuilder sb = null;
        while (true) {
            long j2 = this.k.j(asqxVar);
            if (j2 != -1) {
                if (this.l.c(j2) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.l.n(j2));
                    this.l.d();
                    sb.append(r());
                } else {
                    if (sb == null) {
                        String n = this.l.n(j2);
                        this.l.d();
                        return n;
                    }
                    sb.append(this.l.n(j2));
                    this.l.d();
                    return sb.toString();
                }
            } else {
                throw c("Unterminated string");
            }
        }
    }

    private final String v() {
        long j2 = this.k.j(h);
        if (j2 != -1) {
            return this.l.n(j2);
        }
        return this.l.m();
    }

    private final void w() {
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void x(asqx asqxVar) {
        while (true) {
            long j2 = this.k.j(asqxVar);
            if (j2 != -1) {
                long j3 = 1 + j2;
                if (this.l.c(j2) == 92) {
                    this.l.B(j3);
                    r();
                } else {
                    this.l.B(j3);
                    return;
                }
            } else {
                throw c("Unterminated string");
            }
        }
    }

    private final void y() {
        long j2;
        long j3 = this.k.j(i);
        asqu asquVar = this.l;
        if (j3 != -1) {
            j2 = j3 + 1;
        } else {
            j2 = asquVar.b;
        }
        asquVar.B(j2);
    }

    private final void z() {
        long j2 = this.k.j(h);
        asqu asquVar = this.l;
        if (j2 == -1) {
            j2 = asquVar.b;
        }
        asquVar.B(j2);
    }

    @Override // defpackage.hhr
    public final double a() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 17) {
            this.p = this.l.n(this.o);
        } else if (i2 == 9) {
            this.p = u(g);
        } else if (i2 == 8) {
            this.p = u(f);
        } else if (i2 == 10) {
            this.p = v();
        } else if (i2 != 11) {
            throw new hhp(hht.a(this, "Expected a double but was "));
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.p = null;
                this.m = 0;
                int[] iArr2 = this.e;
                int i4 = this.b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseDouble;
            }
            throw new hhq("JSON forbids NaN and infinities: " + parseDouble + " at path " + d());
        } catch (NumberFormatException unused) {
            throw new hhp("Expected a double but was " + this.p + " at path " + d());
        }
    }

    @Override // defpackage.hhr
    public final int b() {
        String u;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.m = 0;
                int[] iArr = this.e;
                int i4 = this.b - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new hhp("Expected an int but was " + j2 + " at path " + d());
        }
        if (i2 == 17) {
            this.p = this.l.n(this.o);
        } else {
            if (i2 != 9) {
                if (i2 == 8) {
                    u = u(f);
                } else if (i2 != 11) {
                    throw new hhp(hht.a(this, "Expected an int but was "));
                }
            } else {
                u = u(g);
            }
            this.p = u;
            try {
                int parseInt = Integer.parseInt(u);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            int i6 = (int) parseDouble;
            if (i6 == parseDouble) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new hhp("Expected an int but was " + this.p + " at path " + d());
        } catch (NumberFormatException unused2) {
            throw new hhp("Expected an int but was " + this.p + " at path " + d());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.z();
        this.k.close();
    }

    @Override // defpackage.hhr
    public final String e() {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            str = v();
        } else if (i2 == 13) {
            str = u(g);
        } else if (i2 == 12) {
            str = u(f);
        } else if (i2 == 15) {
            str = this.p;
        } else {
            throw new hhp(hht.a(this, "Expected a name but was "));
        }
        this.m = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    @Override // defpackage.hhr
    public final String f() {
        String n;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 10) {
            n = v();
        } else if (i2 == 9) {
            n = u(g);
        } else if (i2 == 8) {
            n = u(f);
        } else if (i2 == 11) {
            n = this.p;
            this.p = null;
        } else if (i2 == 16) {
            n = Long.toString(this.n);
        } else if (i2 == 17) {
            n = this.l.n(this.o);
        } else {
            throw new hhp(hht.a(this, "Expected a string but was "));
        }
        this.m = 0;
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        return n;
    }

    @Override // defpackage.hhr
    public final void g() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 3) {
            k(1);
            this.e[this.b - 1] = 0;
            this.m = 0;
            return;
        }
        throw new hhp(hht.a(this, "Expected BEGIN_ARRAY but was "));
    }

    @Override // defpackage.hhr
    public final void h() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 1) {
            k(3);
            this.m = 0;
            return;
        }
        throw new hhp(hht.a(this, "Expected BEGIN_OBJECT but was "));
    }

    @Override // defpackage.hhr
    public final void i() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 4) {
            int i3 = this.b;
            this.b = i3 - 1;
            int[] iArr = this.e;
            int i4 = i3 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        throw new hhp(hht.a(this, "Expected END_ARRAY but was "));
    }

    @Override // defpackage.hhr
    public final void j() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 2) {
            int i3 = this.b;
            int i4 = i3 - 1;
            this.b = i4;
            this.d[i4] = null;
            int[] iArr = this.e;
            int i5 = i3 - 2;
            iArr[i5] = iArr[i5] + 1;
            this.m = 0;
            return;
        }
        throw new hhp(hht.a(this, "Expected END_OBJECT but was "));
    }

    @Override // defpackage.hhr
    public final void l() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            z();
        } else if (i2 == 13) {
            x(g);
        } else if (i2 == 12) {
            x(f);
        } else if (i2 != 15) {
            throw new hhp(hht.a(this, "Expected a name but was "));
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.hhr
    public final void m() {
        int i2 = 0;
        do {
            int i3 = this.m;
            if (i3 == 0) {
                i3 = s();
            }
            if (i3 == 3) {
                k(1);
            } else if (i3 == 1) {
                k(3);
            } else {
                if (i3 == 4) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        throw new hhp(hht.a(this, "Expected a value but was "));
                    }
                } else if (i3 == 2) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        throw new hhp(hht.a(this, "Expected a value but was "));
                    }
                } else if (i3 != 14 && i3 != 10) {
                    if (i3 != 9 && i3 != 13) {
                        if (i3 != 8 && i3 != 12) {
                            if (i3 == 17) {
                                this.l.B(this.o);
                            } else if (i3 == 18) {
                                throw new hhp(hht.a(this, "Expected a value but was "));
                            }
                        } else {
                            x(f);
                        }
                    } else {
                        x(g);
                    }
                } else {
                    z();
                }
                this.m = 0;
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i4 = this.b - 1;
        iArr[i4] = iArr[i4] + 1;
        this.d[i4] = "null";
    }

    @Override // defpackage.hhr
    public final boolean n() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 != 2 && i2 != 4 && i2 != 18) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hhr
    public final boolean o() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 == 6) {
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        throw new hhp(hht.a(this, "Expected a boolean but was "));
    }

    @Override // defpackage.hhr
    public final int p() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        switch (i2) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    @Override // defpackage.hhr
    public final int q(ico icoVar) {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return B(this.p, icoVar);
        }
        int g2 = this.k.g((asrf) icoVar.a);
        if (g2 != -1) {
            this.m = 0;
            this.d[this.b - 1] = ((String[]) icoVar.b)[g2];
            return g2;
        }
        String str = this.d[this.b - 1];
        String e = e();
        int B = B(e, icoVar);
        if (B == -1) {
            this.m = 15;
            this.p = e;
            this.d[this.b - 1] = str;
            return -1;
        }
        return B;
    }

    public final String toString() {
        return "JsonReader(" + this.k.toString() + ")";
    }
}
