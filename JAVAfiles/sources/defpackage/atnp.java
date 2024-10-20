package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atnp extends atmx {
    private static final long serialVersionUID = -88820909016649306L;
    private atmk a;
    private Date b;
    private int c;
    private byte[] d;
    private int e;
    private int k;
    private byte[] l;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        if (atmp.a("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(this.b.getTime() / 1000);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(this.d.length);
        if (atmp.a("multiline")) {
            stringBuffer.append("\n");
            stringBuffer.append(atow.d(this.d, false));
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(atow.c(this.d));
        }
        stringBuffer.append(" ");
        stringBuffer.append(atmw.a(this.k));
        stringBuffer.append(" ");
        byte[] bArr = this.l;
        if (bArr == null) {
            stringBuffer.append(0);
        } else {
            stringBuffer.append(bArr.length);
            if (atmp.a("multiline")) {
                stringBuffer.append("\n\n\n\t");
            } else {
                stringBuffer.append(" ");
            }
            if (this.k == 18) {
                byte[] bArr2 = this.l;
                if (bArr2.length != 6) {
                    stringBuffer.append("<invalid BADTIME other data>");
                } else {
                    int i = bArr2[0] & 255;
                    int i2 = bArr2[1] & 255;
                    int i3 = bArr2[2] & 255;
                    int i4 = bArr2[3] & 255;
                    int i5 = bArr2[4] & 255;
                    int i6 = bArr2[5] & 255;
                    stringBuffer.append("<server time: ");
                    stringBuffer.append(new Date(((i << 40) + (i2 << 32) + (i3 << 24) + (i4 << 16) + (i5 << 8) + i6) * 1000));
                    stringBuffer.append(">");
                }
            } else {
                stringBuffer.append("<");
                stringBuffer.append(atow.c(this.l));
                stringBuffer.append(">");
            }
        }
        if (atmp.a("multiline")) {
            stringBuffer.append(" )");
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atnp();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = new atmk(atktVar);
        this.b = new Date(((atktVar.b() << 32) + atktVar.e()) * 1000);
        this.c = atktVar.b();
        this.d = atktVar.i(atktVar.b());
        this.e = atktVar.b();
        this.k = atktVar.b();
        int b = atktVar.b();
        if (b > 0) {
            this.l = atktVar.i(b);
        } else {
            this.l = null;
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        this.a.h(atkvVar, null, z);
        long time = this.b.getTime() / 1000;
        atkvVar.d((int) (time >> 32));
        atkvVar.f(time & 4294967295L);
        atkvVar.d(this.c);
        atkvVar.d(this.d.length);
        atkvVar.a(this.d);
        atkvVar.d(this.e);
        atkvVar.d(this.k);
        byte[] bArr = this.l;
        if (bArr != null) {
            atkvVar.d(bArr.length);
            atkvVar.a(this.l);
        } else {
            atkvVar.d(0);
        }
    }
}
