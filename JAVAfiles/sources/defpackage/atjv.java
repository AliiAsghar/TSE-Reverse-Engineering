package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjv extends atmx {
    private static final long serialVersionUID = -8815026887337346789L;
    private int a;
    private InetAddress b;
    private atmk c;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        if (this.b != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.b.getHostAddress());
        }
        if (this.c != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.c);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atjv();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        int c = atktVar.c();
        this.a = c;
        if (c < 128) {
            byte[] bArr = new byte[16];
            int i = (135 - c) / 8;
            atktVar.f(bArr, 16 - i, i);
            this.b = InetAddress.getByAddress(bArr);
        }
        if (this.a > 0) {
            this.c = new atmk(atktVar);
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.g(this.a);
        InetAddress inetAddress = this.b;
        if (inetAddress != null) {
            int i = (135 - this.a) / 8;
            atkvVar.b(inetAddress.getAddress(), 16 - i, i);
        }
        atmk atmkVar = this.c;
        if (atmkVar != null) {
            atmkVar.h(atkvVar, null, z);
        }
    }
}
