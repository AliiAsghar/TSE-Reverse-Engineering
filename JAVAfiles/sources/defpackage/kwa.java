package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kwa implements akgh<List<String>> {
    final /* synthetic */ kvw a;

    public kwa(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        xyo b = kuy.a.b();
        b.H("HomeFragmentPeer: getBugleDbBlockedDestinations SubscriptionMixin failed");
        b.r(th);
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List list = (List) obj;
        if (list != null) {
            this.a.aP.clear();
            this.a.aP.addAll(list);
            this.a.w();
        }
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}
