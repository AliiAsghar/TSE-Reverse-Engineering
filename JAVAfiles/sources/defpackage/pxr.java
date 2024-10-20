package defpackage;

import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pxr implements pxo {
    private boolean a;
    private final hgj b;

    public pxr(hgj hgjVar) {
        this.b = hgjVar;
    }

    @Override // defpackage.pxo
    public final akul a() {
        if (!this.a) {
            this.a = true;
            return aktp.ag(new pxi(aloi.g("User-Agent", this.b.l())));
        }
        throw new pxq();
    }

    @Override // defpackage.pxo
    public final boolean b(UrlResponseInfo urlResponseInfo) {
        return false;
    }
}
