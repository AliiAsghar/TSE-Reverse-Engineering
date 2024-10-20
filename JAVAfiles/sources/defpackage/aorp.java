package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aorp implements Closeable, Flushable {
    private static final Pattern e = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] f = new String[128];
    private static final String[] g;
    public final Writer a;
    public boolean b;
    public boolean c;
    public int d;
    private int[] h = new int[32];
    private int i = 0;
    private aonr j;
    private String k;
    private String l;
    private boolean m;
    private String n;

    static {
        for (int i = 0; i <= 31; i++) {
            f[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        g = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public aorp(Writer writer) {
        q(6);
        this.d = 2;
        this.c = true;
        this.a = writer;
        b(aonr.a);
    }

    private final int o() {
        int i = this.i;
        if (i != 0) {
            return this.h[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void p() {
        if (!this.m) {
            this.a.write(this.j.b);
            int i = this.i;
            for (int i2 = 1; i2 < i; i2++) {
                this.a.write(this.j.c);
            }
        }
    }

    private final void q(int i) {
        int i2 = this.i;
        int[] iArr = this.h;
        if (i2 == iArr.length) {
            this.h = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.h;
        int i3 = this.i;
        this.i = i3 + 1;
        iArr2[i3] = i;
    }

    private final void r(int i) {
        this.h[this.i - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.b
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.aorp.g
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.aorp.f
        L9:
            java.io.Writer r1 = r8.a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L44
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L27
            r6 = r0[r6]
            if (r6 == 0) goto L42
            goto L34
        L27:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2e
            java.lang.String r6 = "\\u2028"
            goto L34
        L2e:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L42
            java.lang.String r6 = "\\u2029"
        L34:
            if (r4 >= r3) goto L3c
            java.io.Writer r7 = r8.a
            int r3 = r3 - r4
            r7.write(r9, r4, r3)
        L3c:
            java.io.Writer r3 = r8.a
            r3.write(r6)
            r4 = r5
        L42:
            r3 = r5
            goto L16
        L44:
            if (r4 >= r1) goto L4c
            java.io.Writer r0 = r8.a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4c:
            java.io.Writer r9 = r8.a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aorp.s(java.lang.String):void");
    }

    private final void t(int i, int i2, char c) {
        int o = o();
        if (o != i2 && o != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.n;
        if (str == null) {
            this.i--;
            if (o == i2) {
                p();
            }
            this.a.write(c);
            return;
        }
        throw new IllegalStateException("Dangling name: ".concat(str));
    }

    private final void u(int i, char c) {
        a();
        q(i);
        this.a.write(c);
    }

    public final void a() {
        int o = o();
        if (o != 1) {
            if (o != 2) {
                if (o != 4) {
                    if (o != 6) {
                        if (o == 7) {
                            if (this.d != 1) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    r(7);
                    return;
                }
                this.a.append((CharSequence) this.k);
                r(5);
                return;
            }
            this.a.append((CharSequence) this.l);
            p();
            return;
        }
        r(2);
        p();
    }

    public final void b(aonr aonrVar) {
        aonrVar.getClass();
        this.j = aonrVar;
        this.l = ",";
        if (aonrVar.d) {
            this.k = ": ";
            if (aonrVar.b.isEmpty()) {
                this.l = ", ";
            }
        } else {
            this.k = ":";
        }
        boolean z = false;
        if (this.j.b.isEmpty() && this.j.c.isEmpty()) {
            z = true;
        }
        this.m = z;
    }

    public final void c() {
        if (this.n != null) {
            int o = o();
            if (o == 5) {
                this.a.write(this.l);
            } else if (o != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            p();
            r(4);
            s(this.n);
            this.n = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        int i = this.i;
        if (i <= 1 && (i != 1 || this.h[0] == 7)) {
            this.i = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(int i) {
        if (i != 0) {
            this.d = i;
            return;
        }
        throw null;
    }

    public final void e() {
        c();
        u(1, '[');
    }

    public final void f() {
        c();
        u(3, '{');
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.i != 0) {
            this.a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void g() {
        t(1, 2, ']');
    }

    public final void h() {
        t(3, 5, '}');
    }

    public final void i(String str) {
        str.getClass();
        if (this.n == null) {
            int o = o();
            if (o != 3 && o != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.n = str;
            return;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void j() {
        if (this.n != null) {
            if (this.c) {
                c();
            } else {
                this.n = null;
                return;
            }
        }
        a();
        this.a.write("null");
    }

    public final void k(long j) {
        c();
        a();
        this.a.write(Long.toString(j));
    }

    public final void l(Number number) {
        if (number == null) {
            j();
            return;
        }
        c();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !e.matcher(obj).matches()) {
                    throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + obj);
                }
            } else if (this.d != 1) {
                throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(obj)));
            }
        }
        a();
        this.a.append((CharSequence) obj);
    }

    public final void m(String str) {
        if (str == null) {
            j();
            return;
        }
        c();
        a();
        s(str);
    }

    public final void n(boolean z) {
        String str;
        c();
        a();
        if (true != z) {
            str = "false";
        } else {
            str = "true";
        }
        this.a.write(str);
    }
}
