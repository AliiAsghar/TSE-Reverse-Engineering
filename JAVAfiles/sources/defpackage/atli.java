package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atli extends atmx {
    private static final long serialVersionUID = 3050449702765909687L;
    private int a;
    private int b;
    private int c;
    private Object d;
    private byte[] e;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        int i = this.b;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    stringBuffer.append(this.d);
                }
            } else {
                stringBuffer.append(((InetAddress) this.d).getHostAddress());
            }
        } else {
            stringBuffer.append(".");
        }
        if (this.e != null) {
            stringBuffer.append(" ");
            stringBuffer.append(atow.c(this.e));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atli();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.c();
        this.b = atktVar.c();
        this.c = atktVar.c();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.d = new atmk(atktVar);
                    } else {
                        throw new atoc("invalid gateway type");
                    }
                } else {
                    this.d = InetAddress.getByAddress(atktVar.i(16));
                }
            } else {
                this.d = InetAddress.getByAddress(atktVar.i(4));
            }
        } else {
            this.d = null;
        }
        if (atktVar.d() > 0) {
            this.e = atktVar.h();
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.g(this.a);
        atkvVar.g(this.b);
        atkvVar.g(this.c);
        int i = this.b;
        if (i != 1 && i != 2) {
            if (i == 3) {
                ((atmk) this.d).h(atkvVar, null, z);
            }
        } else {
            atkvVar.a(((InetAddress) this.d).getAddress());
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            atkvVar.a(bArr);
        }
    }
}
