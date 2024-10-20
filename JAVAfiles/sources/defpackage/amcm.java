package defpackage;

import j$.util.Objects;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class amcm extends amcn {
    private volatile amcn a;
    public final amci b;
    public final Character c;
    public volatile amcn d;

    public amcm(amci amciVar, Character ch) {
        this.b = amciVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            byte[] bArr = amciVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        albo.N(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.amcn
    public int a(byte[] bArr, CharSequence charSequence) {
        amci amciVar;
        CharSequence h = h(charSequence);
        if (this.b.f(h.length())) {
            int i = 0;
            int i2 = 0;
            while (i < h.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    amciVar = this.b;
                    if (i3 >= amciVar.e) {
                        break;
                    }
                    j <<= amciVar.d;
                    if (i + i3 < h.length()) {
                        j |= this.b.b(h.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = amciVar.f;
                int i6 = i4 * amciVar.d;
                int i7 = (i5 - 1) * 8;
                while (i7 >= (i5 * 8) - i6) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.b.e;
            }
            return i2;
        }
        throw new amcl("Invalid input length " + h.length());
    }

    public amcn b(amci amciVar, Character ch) {
        return new amcm(amciVar, ch);
    }

    @Override // defpackage.amcn
    public void c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        albo.S(0, i, bArr.length);
        while (i2 < i) {
            i(appendable, bArr, i2, Math.min(this.b.f, i - i2));
            i2 += this.b.f;
        }
    }

    @Override // defpackage.amcn
    public final int d(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.amcn
    public final int e(int i) {
        return this.b.e * albo.cR(i, this.b.f, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amcm) {
            amcm amcmVar = (amcm) obj;
            if (this.b.equals(amcmVar.b) && Objects.equals(this.c, amcmVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amcn
    public final amcn f() {
        amcn amcnVar = this.a;
        if (amcnVar == null) {
            amci amciVar = this.b;
            if (amciVar.e()) {
                albo.U(!amciVar.d(), "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr = new char[amciVar.b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = amciVar.b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    cArr[i] = albo.an(cArr2[i]);
                    i++;
                }
                amci amciVar2 = new amci(amciVar.a.concat(".lowerCase()"), cArr);
                if (amciVar.h) {
                    amciVar = amciVar2.c();
                } else {
                    amciVar = amciVar2;
                }
            }
            if (amciVar == this.b) {
                amcnVar = this;
            } else {
                amcnVar = b(amciVar, this.c);
            }
            this.a = amcnVar;
        }
        return amcnVar;
    }

    @Override // defpackage.amcn
    public final amcn g() {
        if (this.c == null) {
            return this;
        }
        return b(this.b, null);
    }

    @Override // defpackage.amcn
    public final CharSequence h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        Character ch = this.c;
        return Objects.hashCode(ch) ^ this.b.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        albo.S(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.b.f) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = (i2 + 1) * 8;
        amci amciVar = this.b;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - amciVar.d) - i3);
            amci amciVar2 = this.b;
            appendable.append(amciVar2.a(((int) j2) & amciVar2.c));
            i3 += this.b.d;
        }
        if (this.c != null) {
            while (i3 < this.b.f * 8) {
                this.c.charValue();
                appendable.append('=');
                i3 += this.b.d;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b);
        if (8 % this.b.d != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public amcm(String str, String str2, Character ch) {
        this(new amci(str, str2.toCharArray()), ch);
    }
}
