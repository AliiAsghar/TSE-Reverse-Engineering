package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pxd implements pxg {
    private final armf a;

    public pxd(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.pxg
    public final /* bridge */ /* synthetic */ pxf a(String str, UrlRequest.Callback callback) {
        qnu qnuVar = (qnu) this.a.b();
        qnuVar.getClass();
        str.getClass();
        callback.getClass();
        return new pxc(qnuVar, str, callback);
    }
}
