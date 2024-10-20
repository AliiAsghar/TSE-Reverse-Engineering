package defpackage;

import j$.util.Optional;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pxc implements pxf {
    private final String a;
    private final UrlRequest.Callback b;
    private final alpc c = new alpc();
    private final Optional d = Optional.empty();
    private final Optional e = Optional.empty();
    private final qnu f;

    public pxc(qnu qnuVar, String str, UrlRequest.Callback callback) {
        this.f = qnuVar;
        this.a = str;
        this.b = callback;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    @Override // defpackage.pxf
    public final pxe a() {
        this.d.isPresent();
        pws pwsVar = (pws) this.e.orElse(pws.GET);
        qnu qnuVar = this.f;
        ?? r1 = qnuVar.b;
        alpg e = this.c.e();
        aneo aneoVar = (aneo) r1.b();
        aneoVar.getClass();
        pwsVar.getClass();
        return new pxb(aneoVar, qnuVar.a, this.a, this.b, e, this.d, pwsVar);
    }

    @Override // defpackage.pxf
    public final /* bridge */ /* synthetic */ void b(String str) {
        this.c.g("Range", str);
    }

    @Override // defpackage.pxf
    public final /* bridge */ /* synthetic */ void c(alpg alpgVar) {
        for (Map.Entry entry : alpgVar.t().entrySet()) {
            alpc alpcVar = this.c;
            alpcVar.i(entry.getKey(), (Iterable) entry.getValue());
        }
    }
}
