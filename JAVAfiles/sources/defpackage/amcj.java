package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amcj extends amcm {
    final char[] a;

    public amcj(amci amciVar) {
        super(amciVar, null);
        boolean z;
        this.a = new char[512];
        if (amciVar.b.length == 16) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        for (int i = 0; i < 256; i++) {
            this.a[i] = amciVar.a(i >>> 4);
            this.a[i | 256] = amciVar.a(i & 15);
        }
    }

    @Override // defpackage.amcm, defpackage.amcn
    public final int a(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.b.b(charSequence.charAt(i)) << 4) | this.b.b(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new amcl("Invalid input length " + charSequence.length());
    }

    @Override // defpackage.amcm
    public final amcn b(amci amciVar, Character ch) {
        return new amcj(amciVar);
    }

    @Override // defpackage.amcm, defpackage.amcn
    public final void c(Appendable appendable, byte[] bArr, int i) {
        albo.S(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.a[i3]);
            appendable.append(this.a[i3 | 256]);
        }
    }
}
