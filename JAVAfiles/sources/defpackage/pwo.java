package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pwo implements pxf {
    public final UrlRequest.Builder a;
    private final Optional b = Optional.empty();

    public pwo(anen anenVar, armf armfVar, armf armfVar2, armf armfVar3, String str, UrlRequest.Callback callback) {
        UrlRequest.Builder trafficStatsTag;
        if (((pei) armfVar2.b()).a()) {
            trafficStatsTag = ((aiqj) armfVar3.b()).w().newUrlRequestBuilder(str, callback, anenVar).setTrafficStatsTag(8194);
        } else {
            trafficStatsTag = ((CronetEngine) armfVar.b()).newUrlRequestBuilder(str, callback, anenVar).setTrafficStatsTag(8194);
        }
        this.a = trafficStatsTag;
    }

    @Override // defpackage.pxf
    public final pxe a() {
        this.a.setHttpMethod(((pws) this.b.orElse(pws.GET)).toString());
        UrlRequest build = this.a.build();
        build.getClass();
        return new pwn(build);
    }

    @Override // defpackage.pxf
    public final /* bridge */ /* synthetic */ void b(String str) {
        this.a.addHeader("Range", str);
    }

    @Override // defpackage.pxf
    public final /* bridge */ /* synthetic */ void c(alpg alpgVar) {
        Collection.EL.forEach(alpgVar.r(), new ptf(this, 2));
    }
}
