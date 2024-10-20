package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ader implements adfk {
    final /* synthetic */ adet a;

    public ader(adet adetVar) {
        this.a = adetVar;
    }

    @Override // defpackage.adfk
    public final void f(acok acokVar) {
        advr.d(this.a.l, "Handling registration failed", new Object[0]);
        this.a.g(acokVar);
        adfa adfaVar = this.a.b;
        if (acokVar == acok.RECONFIGURATION_REQUIRED && !Objects.isNull(adfaVar)) {
            advr.d(this.a.l, "Stopping ImsRegistrationController. Reconfiguration is required.", new Object[0]);
            adfaVar.j(acokVar);
        }
        Iterator it = this.a.t.iterator();
        while (it.hasNext()) {
            ((adfk) it.next()).f(acokVar);
        }
    }

    @Override // defpackage.adfk
    public final void g() {
        advr.d(this.a.l, "Handling registration successful", new Object[0]);
        this.a.d.f();
        this.a.h.onImsModuleStarted();
        Iterator it = this.a.t.iterator();
        while (it.hasNext()) {
            ((adfk) it.next()).g();
        }
    }

    @Override // defpackage.adfk
    public final void h(acok acokVar) {
        advr.d(this.a.l, "Handling registration terminated", new Object[0]);
        this.a.d.g(acokVar);
        if (((Boolean) adet.a.a()).booleanValue()) {
            this.a.h(acokVar);
        } else if (this.a.j.get()) {
            this.a.h(acokVar);
        }
        Iterator it = this.a.t.iterator();
        while (it.hasNext()) {
            ((adfk) it.next()).h(acokVar);
        }
    }
}
