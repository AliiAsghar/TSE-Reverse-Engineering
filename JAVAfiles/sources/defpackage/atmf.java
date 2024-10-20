package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmf extends atmx {
    private static final atoi a = new atoi();
    private static final long serialVersionUID = -7123504635968932855L;
    private int b;
    private int c;
    private int d;
    private byte[] e;
    private byte[] k;
    private atnv l;

    @Override // defpackage.atmx
    public final String a() {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append(' ');
        stringBuffer.append(this.c);
        stringBuffer.append(' ');
        stringBuffer.append(this.d);
        stringBuffer.append(' ');
        byte[] bArr = this.e;
        if (bArr == null) {
            stringBuffer.append('-');
        } else {
            stringBuffer.append(atpj.c(bArr));
        }
        stringBuffer.append(' ');
        atoi atoiVar = a;
        byte[] bArr2 = this.k;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 < (bArr2.length + 4) / 5; i2++) {
            short[] sArr = new short[5];
            int i3 = 5;
            for (int i4 = 0; i4 < 5; i4++) {
                int i5 = (i2 * 5) + i4;
                if (i5 < bArr2.length) {
                    sArr[i4] = (short) (bArr2[i5] & 255);
                } else {
                    sArr[i4] = 0;
                    i3--;
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                i = -1;
                            } else {
                                i = 0;
                            }
                        } else {
                            i = 1;
                        }
                    } else {
                        i = 3;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 6;
            }
            short s = sArr[0];
            short s2 = sArr[1];
            short s3 = sArr[2];
            int i6 = ((s2 & 1) << 4) | ((s3 >> 4) & 15);
            int i7 = s3 & 15;
            short s4 = sArr[3];
            short s5 = sArr[4];
            int[] iArr = {(s >> 3) & 31, ((s & 7) << 2) | ((s2 >> 6) & 3), (s2 >> 1) & 31, i6, (i7 + i7) | (1 & (s4 >> 7)), (s4 >> 2) & 31, ((s4 & 3) << 3) | ((s5 >> 5) & 7), s5 & 31};
            for (int i8 = 0; i8 < 8 - i; i8++) {
                byteArrayOutputStream.write(((String) atoiVar.a).charAt(iArr[i8]));
            }
        }
        stringBuffer.append(new String(byteArrayOutputStream.toByteArray()));
        if (!this.l.b()) {
            stringBuffer.append(' ');
            stringBuffer.append(this.l.toString());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atmf();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.b = atktVar.c();
        this.c = atktVar.c();
        this.d = atktVar.b();
        int c = atktVar.c();
        if (c > 0) {
            this.e = atktVar.i(c);
        } else {
            this.e = null;
        }
        this.k = atktVar.i(atktVar.c());
        this.l = new atnv(atktVar);
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.g(this.b);
        atkvVar.g(this.c);
        atkvVar.d(this.d);
        byte[] bArr = this.e;
        if (bArr != null) {
            atkvVar.g(bArr.length);
            atkvVar.a(this.e);
        } else {
            atkvVar.g(0);
        }
        atkvVar.g(this.k.length);
        atkvVar.a(this.k);
        this.l.a(atkvVar);
    }
}
