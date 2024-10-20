package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class jaq implements akgh<alog<nfw>> {
    final /* synthetic */ jar a;

    public jaq(jar jarVar) {
        this.a = jarVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        alvw i = jar.a.i();
        i.X(alwp.a, "Bugle");
        ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/conversation/simpicker/SimPickerFragmentPeer$2", "onError", (char) 380, "SimPickerFragmentPeer.java")).q("Failed to load self identities for SimPickerFragmentPeer.");
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        alog alogVar = (alog) obj;
        akrh e = aktp.e("SimPickerFragmentPeer::onNewData localSelfIdentities");
        try {
            if (((okf) this.a.m.b()).a()) {
                jar jarVar = this.a;
                jarVar.l = jarVar.q.q(alogVar);
                jar jarVar2 = this.a;
                jarVar2.a(jarVar2.l);
            }
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
