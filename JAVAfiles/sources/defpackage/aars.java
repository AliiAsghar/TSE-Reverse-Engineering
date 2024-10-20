package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aars implements akgh<ajzb> {
    final /* synthetic */ Bundle a;
    final /* synthetic */ aarm b;

    public aars(aarm aarmVar, Bundle bundle) {
        this.a = bundle;
        this.b = aarmVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        xzb.n("Bugle", "AccountFullscreenGalleryFragmentPeer: failed to fetch account info");
        this.b.a(new abnl(1), this.a);
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        aarm aarmVar = this.b;
        aarmVar.a(new aarr(aarmVar.n.c, (ajzb) obj, 0), this.a);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
