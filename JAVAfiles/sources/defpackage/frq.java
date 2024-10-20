package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frq {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final StringBuilder c = new StringBuilder();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public frq(int i, int i2) {
        e(i);
        this.h = i2;
    }

    private static void h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    private static void i(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    private static void j(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.SpannableString a() {
        /*
            r15 = this;
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r1 = r15.c
            r0.<init>(r1)
            int r1 = r0.length()
            r2 = 0
            r3 = -1
            r4 = r2
            r7 = r4
            r9 = r7
            r5 = r3
            r6 = r5
            r8 = r6
            r10 = r8
        L14:
            java.util.List r11 = r15.a
            int r11 = r11.size()
            if (r4 >= r11) goto L7a
            java.util.List r11 = r15.a
            java.lang.Object r11 = r11.get(r4)
            frp r11 = (defpackage.frp) r11
            boolean r12 = r11.b
            int r13 = r11.a
            r14 = 8
            if (r13 == r14) goto L39
            r9 = 7
            if (r13 != r9) goto L31
            r14 = 1
            goto L32
        L31:
            r14 = r2
        L32:
            if (r13 == r9) goto L38
            int[] r9 = defpackage.frr.a
            r10 = r9[r13]
        L38:
            r9 = r14
        L39:
            int r11 = r11.c
            int r4 = r4 + 1
            java.util.List r13 = r15.a
            int r13 = r13.size()
            if (r4 >= r13) goto L50
            java.util.List r13 = r15.a
            java.lang.Object r13 = r13.get(r4)
            frp r13 = (defpackage.frp) r13
            int r13 = r13.c
            goto L51
        L50:
            r13 = r1
        L51:
            if (r11 != r13) goto L54
            goto L14
        L54:
            if (r5 == r3) goto L5d
            if (r12 != 0) goto L5e
            j(r0, r5, r11)
            r5 = r3
            goto L63
        L5d:
            r5 = r3
        L5e:
            if (r5 != r3) goto L63
            if (r12 == 0) goto L63
            r5 = r11
        L63:
            if (r6 == r3) goto L6c
            if (r9 != 0) goto L6d
            i(r0, r6, r11)
            r6 = r3
            goto L72
        L6c:
            r6 = r3
        L6d:
            if (r6 != r3) goto L72
            if (r9 == 0) goto L72
            r6 = r11
        L72:
            if (r10 == r8) goto L14
            h(r0, r7, r11, r8)
            r8 = r10
            r7 = r11
            goto L14
        L7a:
            if (r5 == r3) goto L81
            if (r5 == r1) goto L81
            j(r0, r5, r1)
        L81:
            if (r6 == r3) goto L88
            if (r6 == r1) goto L88
            i(r0, r6, r1)
        L88:
            if (r7 == r1) goto L8d
            h(r0, r7, r1, r8)
        L8d:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frq.a():android.text.SpannableString");
    }

    public final esz b(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            spannableStringBuilder.append((CharSequence) this.b.get(i2));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) a());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.e + this.f;
        int length = (32 - i3) - spannableStringBuilder.length();
        if (i == Integer.MIN_VALUE) {
            int i4 = i3 - length;
            if (this.g == 2 && (Math.abs(i4) < 3 || length < 0)) {
                i = 1;
            } else if (this.g == 2 && i4 > 0) {
                i = 2;
            } else {
                i = 0;
            }
        }
        if (i != 1) {
            if (i == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i5 = this.d;
        if (i5 > 7) {
            i5 -= 17;
        } else if (this.g == 1) {
            i5 -= this.h - 1;
        }
        esy esyVar = new esy();
        esyVar.a = spannableStringBuilder;
        esyVar.c = Layout.Alignment.ALIGN_NORMAL;
        esyVar.c(i5, 1);
        esyVar.f = f;
        esyVar.g = i;
        return esyVar.a();
    }

    public final void c(char c) {
        if (this.c.length() < 32) {
            this.c.append(c);
        }
    }

    public final void d() {
        frp frpVar;
        int i;
        int length = this.c.length();
        if (length > 0) {
            this.c.delete(length - 1, length);
            int size = this.a.size();
            while (true) {
                size--;
                if (size >= 0 && (i = (frpVar = (frp) this.a.get(size)).c) == length) {
                    frpVar.c = i - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void e(int i) {
        this.g = i;
        this.a.clear();
        this.b.clear();
        this.c.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i, boolean z) {
        this.a.add(new frp(i, z, this.c.length()));
    }

    public final boolean g() {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0) {
            return true;
        }
        return false;
    }
}
