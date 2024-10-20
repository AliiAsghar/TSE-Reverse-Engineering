package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgk implements emx {
    final /* synthetic */ cg a;
    final /* synthetic */ aohs b;

    public akgk(aohs aohsVar, cg cgVar) {
        this.a = cgVar;
        this.b = aohsVar;
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        epe epeVar = new epe(this.a.Q());
        epeVar.b(eol.c, Bundle.EMPTY);
        cg cgVar = this.a;
        this.b.a = (akgl) new eoy(cgVar.aL(), cgVar.P(), epeVar).a(akgl.class);
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        ((akbl) this.b.b).c();
        ((akbl) this.b.b).a();
        akgl akglVar = (akgl) this.b.a;
        Iterator it = akglVar.a.values().iterator();
        while (it.hasNext()) {
            ((akgn) it.next()).c();
        }
        Iterator it2 = akglVar.b.values().iterator();
        while (it2.hasNext()) {
            ((akgn) it2.next()).c();
        }
        akglVar.c.c();
        akglVar.d.clear();
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        ((akbl) this.b.b).b();
        akgl akglVar = (akgl) this.b.a;
        akglVar.c.g();
        for (Integer num : akglVar.b.keySet()) {
            albo.V(akglVar.d.contains(num), "Did not re-register a subscription for @ResId %s. You must re-register all subscriptions you previously had after a configuration change, so that you don't lose user state.", num.intValue());
        }
        ((akgl) this.b.a).e.b();
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        ((akgl) this.b.a).e.c();
        ((akbl) this.b.b).c();
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }
}
