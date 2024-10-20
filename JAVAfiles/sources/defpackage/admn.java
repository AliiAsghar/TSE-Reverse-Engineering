package defpackage;

import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class admn implements advb {
    public final Optional a;
    private final adjb b;

    public admn(adjb adjbVar, Optional optional) {
        this.b = adjbVar;
        this.a = optional;
    }

    @Override // defpackage.advb
    public final /* synthetic */ void a(Object obj) {
        admo admoVar = (admo) obj;
        if (admoVar != null) {
            this.b.fP(admoVar.a, admoVar.b);
            advr.l(adms.a, "AvailabilityObserver.onUpdate : Notify RcsAvailabilityListener %s onRcsAvailabilityUpdate, SIM = %s, availability = %s", this.b, advq.SIM_ID.c(admoVar.a), admoVar.b.a);
        }
    }
}
