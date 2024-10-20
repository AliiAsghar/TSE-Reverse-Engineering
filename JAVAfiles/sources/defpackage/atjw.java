package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjw extends atmx {
    private static final long serialVersionUID = -4588601512069748050L;
    private byte[] a;

    @Override // defpackage.atmx
    public final String a() {
        try {
            InetAddress byAddress = InetAddress.getByAddress(null, this.a);
            if (byAddress.getAddress().length == 4) {
                StringBuffer stringBuffer = new StringBuffer("0:0:0:0:0:ffff:");
                byte[] bArr = this.a;
                int i = bArr[12] & 255;
                int i2 = bArr[13] & 255;
                int i3 = bArr[14] & 255;
                int i4 = bArr[15] & 255;
                stringBuffer.append(Integer.toHexString((i << 8) + i2));
                stringBuffer.append(':');
                stringBuffer.append(Integer.toHexString((i3 << 8) + i4));
                return stringBuffer.toString();
            }
            return byAddress.getHostAddress();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atjw();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.i(16);
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.a(this.a);
    }

    public final InetAddress e() {
        try {
            atmk atmkVar = this.f;
            if (atmkVar == null) {
                return InetAddress.getByAddress(this.a);
            }
            return InetAddress.getByAddress(atmkVar.toString(), this.a);
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
