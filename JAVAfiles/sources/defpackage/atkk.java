package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkk extends atky {
    private int a;
    private int b;
    private int c;
    private InetAddress d;

    public atkk() {
        super(8);
    }

    @Override // defpackage.atky
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.d.getHostAddress());
        stringBuffer.append("/");
        stringBuffer.append(this.b);
        stringBuffer.append(", scope netmask ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    @Override // defpackage.atky
    public final void b(atkt atktVar) {
        int b = atktVar.b();
        this.a = b;
        if (b != 1 && b != 2) {
            throw new atoc("unknown address family");
        }
        int c = atktVar.c();
        this.b = c;
        if (c <= atow.f(this.a) * 8) {
            int c2 = atktVar.c();
            this.c = c2;
            if (c2 <= atow.f(this.a) * 8) {
                byte[] h = atktVar.h();
                int length = h.length;
                if (length == ((this.b + 7) >> 3)) {
                    byte[] bArr = new byte[atow.f(this.a)];
                    System.arraycopy(h, 0, bArr, 0, length);
                    try {
                        InetAddress byAddress = InetAddress.getByAddress(bArr);
                        this.d = byAddress;
                        if (atow.i(byAddress, this.b).equals(this.d)) {
                            return;
                        } else {
                            throw new atoc("invalid padding");
                        }
                    } catch (UnknownHostException e) {
                        throw new atoc(e);
                    }
                }
                throw new atoc("invalid address");
            }
            throw new atoc("invalid scope netmask");
        }
        throw new atoc("invalid source netmask");
    }

    @Override // defpackage.atky
    public final void c(atkv atkvVar) {
        atkvVar.d(this.a);
        atkvVar.g(this.b);
        atkvVar.g(this.c);
        atkvVar.b(this.d.getAddress(), 0, (this.b + 7) >> 3);
    }
}
