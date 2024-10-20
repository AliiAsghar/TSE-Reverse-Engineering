package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngk implements ncq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier");
    public static final alwo b = alwo.o("BugleSelfIdentity");
    public final anen c;
    public final int d;
    public final adjb e;
    public final armf f;
    public final armf g;
    private final AtomicReference h;
    private final yyt i;

    public ngk(wfh wfhVar, anen anenVar, armf armfVar, armf armfVar2, ykb ykbVar) {
        final AtomicReference atomicReference = new AtomicReference(amwt.DISABLED_NOT_DEFAULT_SMS_APP);
        this.h = atomicReference;
        final yyt Y = wfhVar.Y(new mlr(this, 8));
        this.i = Y;
        this.c = anenVar;
        this.f = armfVar;
        final int a2 = ykbVar.a();
        this.d = a2;
        this.g = armfVar2;
        this.e = new adjb() { // from class: ngj
            @Override // defpackage.adjb
            public final void fP(String str, adjl adjlVar) {
                alvi alviVar = ngk.a;
                if (atomicReference.getAndSet(adjlVar.a) != adjlVar.a) {
                    yyt yytVar = Y;
                    int i = a2;
                    alwl alwlVar = (alwl) ngk.b.g();
                    alwlVar.X(ydl.t, Integer.valueOf(i));
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier", "createRcsAvailabilityListener", 156, "SubscriptionRcsAvailabilitySupplier.java")).t("Rcs Availability has been updated to %s.", adjlVar.a);
                    yytVar.y(new nfz(2), "SubscriptionRcsEnabledSupplier::Notify");
                }
            }
        };
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.i.w(new nem(ncpVar, 6), "SubscriptionRcsEnabledSupplier::register", "SubscriptionRcsEnabledSupplier::callback", "SubscriptionRcsEnabledSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        return ((adjc) this.f.b()).e(this.d).h(new ndd(this, 10), this.c);
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
