package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ilv implements akgh<alog<nfw>> {
    final /* synthetic */ ilw a;

    public ilv(ilw ilwVar) {
        this.a = ilwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        ((alwl) ((alwl) ((alwl) ilw.a.i()).g(th)).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer$9", "onError", (char) 1205, "DraftEditorFragmentPeer.java")).q("Failed to load self identities for SimPickerFragmentPeer.");
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        alog alogVar = (alog) obj;
        akrh e = aktp.e("DraftEditorFragmentPeer::onNewData addSelfLocalIdentitiesMixin");
        try {
            ilw ilwVar = this.a;
            uie uieVar = (uie) ilwVar.X.b();
            if (((pcd) this.a.Y.b()).a()) {
                Stream filter = Collection.EL.stream(alogVar).filter(new ilu(0));
                int i = alog.d;
                alogVar = (alog) filter.collect(alls.a);
            }
            ilwVar.O = uieVar.q(alogVar);
            this.a.y.E().P(this.a.O);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
