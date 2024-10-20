package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsv implements frl {
    private final euf a = new euf();
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public fsv(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.c = bArr[24];
            this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.e = true == "Serif".equals(eul.I(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.g = i;
            boolean z = (bArr[0] & 32) != 0;
            this.b = z;
            if (z) {
                this.f = eul.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, brg.a, 0.95f);
                return;
            } else {
                this.f = 0.85f;
                return;
            }
        }
        this.c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.b = false;
        this.f = 0.85f;
        this.g = -1;
    }

    private static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                }
                z = false;
            }
            if ((i & 4) == 0) {
                if (i7 == 0 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                    return;
                }
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
        }
    }

    @Override // defpackage.frl
    public final /* synthetic */ frc a(byte[] bArr, int i, int i2) {
        return fsm.b(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.frl
    public final void b(byte[] bArr, int i, int i2, frk frkVar, etm etmVar) {
        boolean z;
        String z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        this.a.H(bArr, i + i2);
        this.a.J(i);
        euf eufVar = this.a;
        int i6 = 1;
        int i7 = 0;
        int i8 = 2;
        if (eufVar.b() >= 2) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int n = eufVar.n();
        if (n == 0) {
            z2 = "";
        } else {
            int i9 = eufVar.b;
            Charset A = eufVar.A();
            int i10 = eufVar.b - i9;
            if (A == null) {
                A = StandardCharsets.UTF_8;
            }
            z2 = eufVar.z(n - i10, A);
        }
        if (z2.isEmpty()) {
            int i11 = alog.d;
            etmVar.a(new xab(alsx.a, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z2);
        e(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (true) {
            euf eufVar2 = this.a;
            if (eufVar2.b() >= 8) {
                int i12 = eufVar2.b;
                int e = eufVar2.e();
                int e2 = this.a.e();
                if (e2 == 1937013100) {
                    if (this.a.b() >= i8) {
                        z4 = i6;
                    } else {
                        z4 = i7;
                    }
                    d.s(z4);
                    int n2 = this.a.n();
                    int i13 = i7;
                    while (i13 < n2) {
                        euf eufVar3 = this.a;
                        if (eufVar3.b() >= 12) {
                            z5 = i6;
                        } else {
                            z5 = i7;
                        }
                        d.s(z5);
                        int n3 = eufVar3.n();
                        int n4 = eufVar3.n();
                        eufVar3.K(i8);
                        int j = eufVar3.j();
                        eufVar3.K(i6);
                        int e3 = eufVar3.e();
                        if (n4 > spannableStringBuilder.length()) {
                            i4 = n2;
                            eub.f("Tx3gParser", "Truncating styl end (" + n4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                            i5 = spannableStringBuilder.length();
                        } else {
                            i4 = n2;
                            i5 = n4;
                        }
                        if (n3 >= i5) {
                            eub.f("Tx3gParser", a.cl(i5, n3, "Ignoring styl with start (", ") >= end (", ")."));
                        } else {
                            int i14 = i5;
                            e(spannableStringBuilder, j, this.c, n3, i14, 0);
                            d(spannableStringBuilder, e3, this.d, n3, i14, 0);
                        }
                        i13++;
                        n2 = i4;
                        i6 = 1;
                        i7 = 0;
                        i8 = 2;
                    }
                    i3 = i8;
                } else if (e2 == 1952608120 && this.b) {
                    i3 = 2;
                    if (this.a.b() >= 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    d.s(z3);
                    f = eul.a(this.a.n() / this.g, brg.a, 0.95f);
                } else {
                    i3 = 2;
                }
                this.a.J(i12 + e);
                i8 = i3;
                i6 = 1;
                i7 = 0;
            } else {
                esy esyVar = new esy();
                esyVar.a = spannableStringBuilder;
                esyVar.c(f, 0);
                esyVar.e = 0;
                etmVar.a(new xab(alog.r(esyVar.a()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }

    @Override // defpackage.frl
    public final /* synthetic */ void c() {
    }
}
