package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atnn extends atmx {
    private static final long serialVersionUID = 8828458121926391756L;
    private atmk a;
    private Date b;
    private Date c;
    private int d;
    private int e;
    private byte[] k;
    private byte[] l;

    @Override // defpackage.atmx
    public final String a() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        if (atmp.a("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(atld.a(this.b));
        stringBuffer.append(" ");
        stringBuffer.append(atld.a(this.c));
        stringBuffer.append(" ");
        int i = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = Integer.toString(i);
                        } else {
                            str = "DELETE";
                        }
                    } else {
                        str = "RESOLVERASSIGNED";
                    }
                } else {
                    str = "GSSAPI";
                }
            } else {
                str = "DIFFIEHELLMAN";
            }
        } else {
            str = "SERVERASSIGNED";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        stringBuffer.append(atmw.a(this.e));
        if (atmp.a("multiline")) {
            stringBuffer.append("\n");
            byte[] bArr = this.k;
            if (bArr != null) {
                stringBuffer.append(atow.d(bArr, false));
                stringBuffer.append("\n");
            }
            byte[] bArr2 = this.l;
            if (bArr2 != null) {
                stringBuffer.append(atow.d(bArr2, false));
            }
            stringBuffer.append(" )");
        } else {
            stringBuffer.append(" ");
            byte[] bArr3 = this.k;
            if (bArr3 != null) {
                stringBuffer.append(atow.c(bArr3));
                stringBuffer.append(" ");
            }
            byte[] bArr4 = this.l;
            if (bArr4 != null) {
                stringBuffer.append(atow.c(bArr4));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atnn();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = new atmk(atktVar);
        this.b = new Date(atktVar.e() * 1000);
        this.c = new Date(atktVar.e() * 1000);
        this.d = atktVar.b();
        this.e = atktVar.b();
        int b = atktVar.b();
        if (b > 0) {
            this.k = atktVar.i(b);
        } else {
            this.k = null;
        }
        int b2 = atktVar.b();
        if (b2 > 0) {
            this.l = atktVar.i(b2);
        } else {
            this.l = null;
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        this.a.h(atkvVar, null, z);
        atkvVar.f(this.b.getTime() / 1000);
        atkvVar.f(this.c.getTime() / 1000);
        atkvVar.d(this.d);
        atkvVar.d(this.e);
        byte[] bArr = this.k;
        if (bArr != null) {
            atkvVar.d(bArr.length);
            atkvVar.a(this.k);
        } else {
            atkvVar.d(0);
        }
        byte[] bArr2 = this.l;
        if (bArr2 != null) {
            atkvVar.d(bArr2.length);
            atkvVar.a(this.l);
        } else {
            atkvVar.d(0);
        }
    }
}
