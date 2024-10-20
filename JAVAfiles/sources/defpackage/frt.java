package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frt {
    public static final int a = a(2, 2, 2, 0);
    public static final int b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final boolean[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    public final List k = new ArrayList();
    public final SpannableStringBuilder l = new SpannableStringBuilder();
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    private int z;

    static {
        int a2 = a(0, 0, 0, 0);
        b = a2;
        int a3 = a(0, 0, 0, 3);
        c = new int[]{0, 0, 0, 0, 0, 2, 0};
        d = new int[]{0, 0, 0, 0, 0, 0, 2};
        e = new int[]{3, 3, 3, 3, 3, 3, 1};
        f = new boolean[]{false, false, false, true, true, true, false};
        g = new int[]{a2, a3, a2, a2, a3, a2, a2};
        h = new int[]{0, 1, 2, 3, 4, 3, 4};
        i = new int[]{0, 0, 0, 0, 0, 3, 3};
        j = new int[]{a2, a2, a2, a2, a2, a3, a3};
    }

    public frt() {
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            defpackage.dzg.f(r4, r0)
            defpackage.dzg.f(r5, r0)
            defpackage.dzg.f(r6, r0)
            defpackage.dzg.f(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L21
            if (r7 == r1) goto L21
            r3 = 2
            if (r7 == r3) goto L1e
            r3 = 3
            if (r7 == r3) goto L1c
            goto L21
        L1c:
            r7 = r0
            goto L22
        L1e:
            r7 = 127(0x7f, float:1.78E-43)
            goto L22
        L21:
            r7 = r2
        L22:
            if (r4 <= r1) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r0
        L27:
            if (r5 <= r1) goto L2b
            r5 = r2
            goto L2c
        L2b:
            r5 = r0
        L2c:
            if (r6 <= r1) goto L2f
            r0 = r2
        L2f:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frt.a(int, int, int, int):int");
    }

    public static void j(int i2, int i3, int i4) {
        a(i2, i3, i4, 0);
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.l);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.z != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.z, length, 33);
            }
            if (this.A != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A, length, 33);
            }
            if (this.B != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.C), this.B, length, 33);
            }
            if (this.D != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.E), this.D, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void c(char c2) {
        if (c2 == '\n') {
            this.k.add(b());
            this.l.clear();
            if (this.z != -1) {
                this.z = 0;
            }
            if (this.A != -1) {
                this.A = 0;
            }
            if (this.B != -1) {
                this.B = 0;
            }
            if (this.D != -1) {
                this.D = 0;
            }
            while (true) {
                if (this.k.size() < this.t && this.k.size() < 15) {
                    this.y = this.k.size();
                    return;
                }
                this.k.remove(0);
            }
        } else {
            this.l.append(c2);
        }
    }

    public final void d() {
        this.k.clear();
        this.l.clear();
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.D = -1;
        this.y = 0;
    }

    public final void e() {
        d();
        this.m = false;
        this.n = false;
        this.o = 4;
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 15;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        int i2 = b;
        this.x = i2;
        this.C = a;
        this.E = i2;
    }

    public final boolean f() {
        if (!this.m) {
            return true;
        }
        if (this.k.isEmpty() && this.l.length() == 0) {
            return true;
        }
        return false;
    }

    public final void g(boolean z, boolean z2) {
        if (this.z != -1) {
            if (!z) {
                this.l.setSpan(new StyleSpan(2), this.z, this.l.length(), 33);
                this.z = -1;
            }
        } else if (z) {
            this.z = this.l.length();
        }
        if (this.A != -1) {
            if (!z2) {
                this.l.setSpan(new UnderlineSpan(), this.A, this.l.length(), 33);
                this.A = -1;
                return;
            }
            return;
        }
        if (z2) {
            this.A = this.l.length();
        }
    }

    public final void h(int i2, int i3) {
        if (this.B != -1 && this.C != i2) {
            this.l.setSpan(new ForegroundColorSpan(this.C), this.B, this.l.length(), 33);
        }
        if (i2 != a) {
            this.B = this.l.length();
            this.C = i2;
        }
        if (this.D != -1 && this.E != i3) {
            this.l.setSpan(new BackgroundColorSpan(this.E), this.D, this.l.length(), 33);
        }
        if (i3 != b) {
            this.D = this.l.length();
            this.E = i3;
        }
    }

    public final void i(int i2, int i3) {
        this.x = i2;
        this.u = i3;
    }
}
