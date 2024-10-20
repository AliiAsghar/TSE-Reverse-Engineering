package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqh extends xcf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerJanitorTask");
    public final upp b;
    public final uot c;
    public final anen d;
    public final Executor e;
    public final uie f;
    public final ahmn g = new ahmn((short[]) null);
    private final uov h;
    private final otx i;

    public uqh(upp uppVar, anen anenVar, uot uotVar, uov uovVar, uie uieVar, otx otxVar) {
        this.b = uppVar;
        this.d = anenVar;
        this.e = new anew(anenVar);
        this.c = uotVar;
        this.h = uovVar;
        this.f = uieVar;
        this.i = otxVar;
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e("WorkQueueWorkManagerCleanupTask");
    }

    @Override // defpackage.xcf
    public final akul b() {
        if (this.i.a()) {
            akrh e = aktp.e("WorkQueueWorkManagerJanitorTask#run");
            try {
                akul d = d(0);
                e.b(d);
                e.close();
                return d;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.h.c(uou.b).h(new uhw(10), this.d).h(new ult(this, 5), this.d);
    }

    public final akul d(Integer num) {
        return this.h.c(uou.b).i(new jab(20), andi.a).i(new twe(this, num, 7), andi.a);
    }

    @Override // defpackage.xck
    public final boolean fI() {
        return true;
    }
}
