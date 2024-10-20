package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atka extends atmx {
    private static final long serialVersionUID = -2172609200849142323L;
    private int a;

    private static final byte[] f(int i) {
        return new byte[]{(byte) (i >> 24), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    @Override // defpackage.atmx
    public final String a() {
        return atow.h(f(this.a));
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atka();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        byte[] i = atktVar.i(4);
        this.a = (i[3] & 255) | ((i[0] & 255) << 24) | ((i[1] & 255) << 16) | ((i[2] & 255) << 8);
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.f(this.a & 4294967295L);
    }

    public final InetAddress e() {
        try {
            atmk atmkVar = this.f;
            if (atmkVar == null) {
                return InetAddress.getByAddress(f(this.a));
            }
            return InetAddress.getByAddress(atmkVar.toString(), f(this.a));
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
