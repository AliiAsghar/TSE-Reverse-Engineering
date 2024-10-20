package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoro implements Closeable {
    public long d;
    public int e;
    public String f;
    public int[] h;
    private final Reader j;
    private int[] n;
    private String[] o;
    public int i = 2;
    public final char[] a = new char[1024];
    public int b = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    public int c = 0;
    public int g = 1;

    static {
        aotl.b = new aotl();
    }

    public aoro(Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        iArr[0] = 6;
        this.o = new String[32];
        this.h = new int[32];
        reader.getClass();
        this.j = reader;
    }

    private final void A(int i) {
        int i2 = this.g;
        if (i2 - 1 < 1280) {
            int[] iArr = this.n;
            if (i2 == iArr.length) {
                int i3 = i2 + i2;
                this.n = Arrays.copyOf(iArr, i3);
                this.h = Arrays.copyOf(this.h, i3);
                this.o = (String[]) Arrays.copyOf(this.o, i3);
            }
            int[] iArr2 = this.n;
            int i4 = this.g;
            this.g = i4 + 1;
            iArr2[i4] = i;
            return;
        }
        throw new aorq("Nesting limit 1280 reached" + g());
    }

    private final void B(char c) {
        do {
            int i = this.b;
            int i2 = this.k;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.a[i];
                if (c2 == c) {
                    this.b = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.b = i3;
                    v();
                    i = this.b;
                    i2 = this.k;
                } else {
                    if (c2 == '\n') {
                        this.l++;
                        this.m = i3;
                    }
                    i = i3;
                }
            }
            this.b = i;
        } while (E(1));
        throw x("Unterminated string");
    }

    private final void C() {
        char c;
        do {
            if (this.b < this.k || E(1)) {
                char[] cArr = this.a;
                int i = this.b;
                int i2 = i + 1;
                this.b = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.l++;
                    this.m = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private final void D() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r4.b
            int r2 = r2 + r1
            int r3 = r4.k
            if (r2 >= r3) goto L50
            char[] r3 = r4.a
            char r2 = r3[r2]
            r3 = 9
            if (r2 == r3) goto L4a
            r3 = 10
            if (r2 == r3) goto L4a
            r3 = 12
            if (r2 == r3) goto L4a
            r3 = 13
            if (r2 == r3) goto L4a
            r3 = 32
            if (r2 == r3) goto L4a
            r3 = 35
            if (r2 == r3) goto L47
            r3 = 44
            if (r2 == r3) goto L4a
            r3 = 47
            if (r2 == r3) goto L47
            r3 = 61
            if (r2 == r3) goto L47
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L4a
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto L4a
            r3 = 58
            if (r2 == r3) goto L4a
            r3 = 59
            if (r2 == r3) goto L47
            switch(r2) {
                case 91: goto L4a;
                case 92: goto L47;
                case 93: goto L4a;
                default: goto L44;
            }
        L44:
            int r1 = r1 + 1
            goto L2
        L47:
            r4.z()
        L4a:
            int r0 = r4.b
            int r0 = r0 + r1
            r4.b = r0
            return
        L50:
            r4.b = r2
            r1 = 1
            boolean r1 = r4.E(r1)
            if (r1 == 0) goto L5a
            goto L1
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoro.D():void");
    }

    private final boolean E(int i) {
        int i2;
        int i3 = this.m;
        int i4 = this.b;
        this.m = i3 - i4;
        char[] cArr = this.a;
        int i5 = this.k;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.k = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.k = 0;
        }
        this.b = 0;
        do {
            Reader reader = this.j;
            int i7 = this.k;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.k + read;
            this.k = i2;
            if (this.l == 0 && this.m == 0 && i2 > 0 && cArr[0] == 65279) {
                this.b++;
                this.m = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean F(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
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
            z();
            return false;
        }
        return false;
    }

    private final char v() {
        int i;
        if (this.b == this.k && !E(1)) {
            throw x("Unterminated escape sequence");
        }
        char[] cArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i2 + 5 > this.k && !E(4)) {
                                        throw x("Unterminated escape sequence");
                                    }
                                    int i4 = this.b;
                                    int i5 = i4 + 4;
                                    int i6 = 0;
                                    while (i4 < i5) {
                                        char[] cArr2 = this.a;
                                        int i7 = i6 << 4;
                                        char c2 = cArr2[i4];
                                        if (c2 >= '0' && c2 <= '9') {
                                            i = c2 - '0';
                                        } else if (c2 >= 'a' && c2 <= 'f') {
                                            i = c2 - 'W';
                                        } else if (c2 >= 'A' && c2 <= 'F') {
                                            i = c2 - '7';
                                        } else {
                                            throw x("Malformed Unicode escape \\u".concat(new String(cArr2, this.b, 4)));
                                        }
                                        i6 = i7 + i;
                                        i4++;
                                    }
                                    this.b += 4;
                                    return (char) i6;
                                }
                                throw x("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.l++;
            this.m = i3;
        }
        return c;
    }

    private final int w(boolean z) {
        int i = this.b;
        int i2 = this.k;
        while (true) {
            if (i == i2) {
                this.b = i;
                if (!E(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(g()));
                }
                i = this.b;
                i2 = this.k;
            }
            char[] cArr = this.a;
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.l++;
                this.m = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.b = i3;
                    if (i3 == i2) {
                        this.b = i;
                        boolean E = E(2);
                        this.b++;
                        if (!E) {
                            return 47;
                        }
                    }
                    z();
                    int i4 = this.b;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.b = i4 + 1;
                        C();
                        i = this.b;
                        i2 = this.k;
                    } else {
                        this.b = i4 + 1;
                        while (true) {
                            if (this.b + 2 > this.k && !E(2)) {
                                throw x("Unterminated comment");
                            }
                            char[] cArr2 = this.a;
                            int i5 = this.b;
                            if (cArr2[i5] == '\n') {
                                this.l++;
                                this.m = i5 + 1;
                            } else {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (this.a[this.b + i6] == "*/".charAt(i6)) {
                                    }
                                }
                                i = this.b + 2;
                                i2 = this.k;
                                break;
                            }
                            this.b++;
                        }
                    }
                } else if (c == '#') {
                    this.b = i3;
                    z();
                    C();
                    i = this.b;
                    i2 = this.k;
                } else {
                    this.b = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private final aorq x(String str) {
        throw new aorq(str + g() + "\nSee " + aotl.q("malformed-json"));
    }

    private final String y(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.g;
            if (i < i2) {
                int i3 = this.n[i];
                switch (i3) {
                    case 1:
                    case 2:
                        int i4 = this.h[i];
                        if (z && i4 > 0 && i == i2 - 1) {
                            i4--;
                        }
                        sb.append('[');
                        sb.append(i4);
                        sb.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb.append('.');
                        String str = this.o[i];
                        if (str == null) {
                            break;
                        } else {
                            sb.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(a.bV(i3, "Unknown scope value: "));
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    private final void z() {
        if (this.i == 1) {
        } else {
            throw x("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    public final double a() {
        char c;
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i == 15) {
            this.c = 0;
            int[] iArr = this.h;
            int i2 = this.g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.d;
        }
        if (i == 16) {
            char[] cArr = this.a;
            int i3 = this.b;
            int i4 = this.e;
            this.f = new String(cArr, i3, i4);
            this.b = i3 + i4;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.f = k();
            } else if (i != 11) {
                throw d("a double");
            }
        } else {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f = i(c);
        }
        this.c = 11;
        double parseDouble = Double.parseDouble(this.f);
        if (this.i != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw x("JSON forbids NaN and infinities: " + parseDouble);
        }
        this.f = null;
        this.c = 0;
        int[] iArr2 = this.h;
        int i5 = this.g - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return parseDouble;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0211, code lost:
    
        if (F(r1) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a0, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0214, code lost:
    
        if (r9 != 2) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0216, code lost:
    
        if (r15 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021c, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x021e, code lost:
    
        if (r16 == 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0227, code lost:
    
        if (r11 != 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0229, code lost:
    
        if (r14 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022f, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0230, code lost:
    
        r21.d = r11;
        r21.b += r10;
        r21.c = 15;
        r14 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x022c, code lost:
    
        if (r14 == 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0221, code lost:
    
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x023e, code lost:
    
        r1 = 2;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0240, code lost:
    
        if (r9 == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0243, code lost:
    
        if (r9 == 4) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0246, code lost:
    
        if (r9 != 7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0248, code lost:
    
        r21.e = r10;
        r14 = 16;
        r21.c = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b() {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoro.b():int");
    }

    public final int c() {
        char c;
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i == 15) {
            long j = this.d;
            int i2 = (int) j;
            if (j == i2) {
                this.c = 0;
                int[] iArr = this.h;
                int i3 = this.g - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + j + g());
        }
        if (i == 16) {
            char[] cArr = this.a;
            int i4 = this.b;
            int i5 = this.e;
            this.f = new String(cArr, i4, i5);
            this.b = i4 + i5;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw d("an int");
            }
            if (i == 10) {
                this.f = k();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f = i(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f);
                this.c = 0;
                int[] iArr2 = this.h;
                int i6 = this.g - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.c = 11;
        double parseDouble = Double.parseDouble(this.f);
        int i7 = (int) parseDouble;
        if (i7 == parseDouble) {
            this.f = null;
            this.c = 0;
            int[] iArr3 = this.h;
            int i8 = this.g - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        }
        throw new NumberFormatException("Expected an int but was " + this.f + g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = 0;
        this.n[0] = 8;
        this.g = 1;
        this.j.close();
    }

    public final IllegalStateException d(String str) {
        String str2;
        int t = t();
        String C = d.C(t());
        String g = g();
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(C);
        sb.append(g);
        sb.append("\nSee ");
        if (t == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        sb.append(aotl.q(str2));
        return new IllegalStateException(sb.toString());
    }

    public final String e() {
        return y(false);
    }

    public final String f() {
        return y(true);
    }

    public final String g() {
        int i = this.l + 1;
        int i2 = this.b - this.m;
        return " at line " + i + " column " + (i2 + 1) + " path " + e();
    }

    public final String h() {
        String i;
        int i2 = this.c;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 14) {
            i = k();
        } else if (i2 == 12) {
            i = i('\'');
        } else if (i2 == 13) {
            i = i('\"');
        } else {
            throw d("a name");
        }
        this.c = 0;
        this.o[this.g - 1] = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        r0.append(r4, r2, r3);
        r9.b = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i(char r10) {
        /*
            r9 = this;
            r0 = 0
        L1:
            int r1 = r9.b
            int r2 = r9.k
            r3 = r2
            r2 = r1
        L7:
            char[] r4 = r9.a
            r5 = 16
            r6 = 1
            if (r1 >= r3) goto L5d
            int r7 = r1 + 1
            char r1 = r4[r1]
            if (r1 != r10) goto L2a
            int r10 = r7 - r2
            int r10 = r10 + (-1)
            r9.b = r7
            if (r0 != 0) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2, r10)
            return r0
        L22:
            r0.append(r4, r2, r10)
            java.lang.String r10 = r0.toString()
            return r10
        L2a:
            r8 = 92
            if (r1 != r8) goto L50
            int r1 = r7 - r2
            int r3 = r1 + (-1)
            r9.b = r7
            if (r0 != 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r0.<init>(r1)
        L40:
            r0.append(r4, r2, r3)
            char r1 = r9.v()
            r0.append(r1)
            int r2 = r9.b
            int r3 = r9.k
            r1 = r2
            goto L7
        L50:
            r4 = 10
            if (r1 != r4) goto L5b
            int r1 = r9.l
            int r1 = r1 + r6
            r9.l = r1
            r9.m = r7
        L5b:
            r1 = r7
            goto L7
        L5d:
            int r3 = r1 - r2
            if (r0 != 0) goto L6d
            int r0 = r3 + r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r5)
            r7.<init>(r0)
            r0 = r7
        L6d:
            r0.append(r4, r2, r3)
            r9.b = r1
            boolean r1 = r9.E(r6)
            if (r1 == 0) goto L79
            goto L1
        L79:
            java.lang.String r10 = "Unterminated string"
            aorq r10 = r9.x(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoro.i(char):java.lang.String");
    }

    public final String j() {
        String str;
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i == 10) {
            str = k();
        } else if (i == 8) {
            str = i('\'');
        } else if (i == 9) {
            str = i('\"');
        } else if (i == 11) {
            str = this.f;
            this.f = null;
        } else if (i == 15) {
            str = Long.toString(this.d);
        } else if (i == 16) {
            String str2 = new String(this.a, this.b, this.e);
            this.b += this.e;
            str = str2;
        } else {
            throw d("a string");
        }
        this.c = 0;
        int[] iArr = this.h;
        int i2 = this.g - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        z();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.b
            int r3 = r3 + r2
            int r4 = r5.k
            if (r3 >= r4) goto L4c
            char[] r4 = r5.a
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.z()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.E(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.a
            int r4 = r5.b
            r1.append(r3, r4, r2)
            int r3 = r5.b
            int r3 = r3 + r2
            r5.b = r3
            r2 = 1
            boolean r2 = r5.E(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.a
            java.lang.String r2 = new java.lang.String
            int r3 = r5.b
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.a
            int r3 = r5.b
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.b
            int r1 = r1 + r0
            r5.b = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoro.k():java.lang.String");
    }

    public final void l() {
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i == 3) {
            A(1);
            this.h[this.g - 1] = 0;
            this.c = 0;
            return;
        }
        throw d("BEGIN_ARRAY");
    }

    public final void m() {
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i == 1) {
            A(3);
            this.c = 0;
            return;
        }
        throw d("BEGIN_OBJECT");
    }

    public final void n() {
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i == 4) {
            int i2 = this.g;
            this.g = i2 - 1;
            int[] iArr = this.h;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.c = 0;
            return;
        }
        throw d("END_ARRAY");
    }

    public final void o() {
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i == 2) {
            int i2 = this.g;
            int i3 = i2 - 1;
            this.g = i3;
            this.o[i3] = null;
            int[] iArr = this.h;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.c = 0;
            return;
        }
        throw d("END_OBJECT");
    }

    public final void p() {
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i == 7) {
            this.c = 0;
            int[] iArr = this.h;
            int i2 = this.g - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw d("null");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public final void q() {
        int i = 0;
        do {
            int i2 = this.c;
            if (i2 == 0) {
                i2 = b();
            }
            switch (i2) {
                case 1:
                    A(3);
                    i++;
                    this.c = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.o[this.g - 1] = null;
                        i = 0;
                    }
                    this.g--;
                    i--;
                    this.c = 0;
                    break;
                case 3:
                    A(1);
                    i++;
                    this.c = 0;
                    break;
                case 4:
                    this.g--;
                    i--;
                    this.c = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.c = 0;
                    break;
                case 8:
                    B('\'');
                    this.c = 0;
                    break;
                case 9:
                    B('\"');
                    this.c = 0;
                    break;
                case 10:
                    D();
                    this.c = 0;
                    break;
                case 12:
                    B('\'');
                    if (i == 0) {
                        this.o[this.g - 1] = "<skipped>";
                        i = 0;
                    }
                    this.c = 0;
                    break;
                case 13:
                    B('\"');
                    if (i == 0) {
                        this.o[this.g - 1] = "<skipped>";
                        i = 0;
                    }
                    this.c = 0;
                    break;
                case 14:
                    D();
                    if (i == 0) {
                        this.o[this.g - 1] = "<skipped>";
                        i = 0;
                    }
                    this.c = 0;
                    break;
                case 16:
                    this.b += this.e;
                    this.c = 0;
                    break;
                case 17:
                    return;
            }
        } while (i > 0);
        int[] iArr = this.h;
        int i3 = this.g - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final boolean r() {
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        if (i == 5) {
            this.c = 0;
            int[] iArr = this.h;
            int i2 = this.g - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.c = 0;
            int[] iArr2 = this.h;
            int i3 = this.g - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw d("a boolean");
    }

    public final int t() {
        int i = this.c;
        if (i == 0) {
            i = b();
        }
        switch (i) {
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
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(g());
    }

    public final void u(int i) {
        if (i != 0) {
            this.i = i;
            return;
        }
        throw null;
    }
}
