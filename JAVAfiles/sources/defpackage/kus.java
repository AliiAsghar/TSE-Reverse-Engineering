package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kus implements kur {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/home/ConversationListRootFragmentPeerDelegate");
    private final cg b;
    private final ajwt c;

    public kus(cg cgVar, ajwt ajwtVar) {
        this.b = cgVar;
        this.c = ajwtVar;
    }

    @Override // defpackage.kur
    public final cg a() {
        cg e = this.b.G().e("home_fragment_tag");
        if ((e instanceof kux) && ((kux) e).aw()) {
            return e;
        }
        return null;
    }

    @Override // defpackage.kur
    public final void b() {
        alvw g = a.g();
        g.X(alwp.a, "ConversationListRootFragmentPeerDelegate");
        ((alvg) g.h("com/google/android/apps/messaging/home/ConversationListRootFragmentPeerDelegate", "attachNewHomeFragment", 32, "ConversationListRootFragmentPeerDelegate.kt")).q("Adding a new home fragment");
        kux a2 = kux.a(this.c);
        bd bdVar = new bd(this.b.G());
        bdVar.v(R.id.home_fragment_container, a2, "home_fragment_tag");
        bdVar.b();
    }

    @Override // defpackage.kur
    public final void c() {
        cg a2 = a();
        if (a2 != null) {
            bd bdVar = new bd(this.b.G());
            bdVar.n(a2);
            bdVar.b();
        }
        this.b.G().ag();
    }
}
