package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class atln extends atmx {
    private static final long serialVersionUID = 3469321722693285454L;
    protected int a;
    protected int b;
    protected int c;
    protected byte[] d;
    protected int e = -1;

    @Override // defpackage.atmx
    public final String a() {
        int i;
        int length;
        int i2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        if (this.d != null) {
            if (atmp.a("multiline")) {
                stringBuffer.append(" (\n");
                stringBuffer.append(atow.d(this.d, true));
                stringBuffer.append(" ; key_tag = ");
                int i3 = this.e;
                if (i3 < 0) {
                    atkv atkvVar = new atkv();
                    int i4 = 0;
                    d(atkvVar, null, false);
                    byte[] h = atkvVar.h();
                    if (this.c == 1) {
                        int length2 = h.length;
                        int i5 = h[length2 - 3] & 255;
                        i2 = h[length2 - 2] & 255;
                        i = i5 << 8;
                    } else {
                        i = 0;
                        while (true) {
                            length = h.length;
                            if (i4 >= length - 1) {
                                break;
                            }
                            i += ((h[i4] & 255) << 8) + (h[i4 + 1] & 255);
                            i4 += 2;
                        }
                        if (i4 < length) {
                            i += (h[i4] & 255) << 8;
                        }
                        i2 = (char) (i >> 16);
                    }
                    i3 = (char) (i + i2);
                    this.e = i3;
                }
                stringBuffer.append(i3);
            } else {
                stringBuffer.append(" ");
                stringBuffer.append(atow.c(this.d));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.b();
        this.b = atktVar.c();
        this.c = atktVar.c();
        if (atktVar.d() > 0) {
            this.d = atktVar.h();
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.d(this.a);
        atkvVar.g(this.b);
        atkvVar.g(this.c);
        byte[] bArr = this.d;
        if (bArr != null) {
            atkvVar.a(bArr);
        }
    }
}
