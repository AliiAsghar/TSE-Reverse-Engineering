package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.telephony.SubscriptionManager;
import com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wvy implements wvv {
    public static final alwo a = alwo.o("BugleSimStateTracker");
    public final Context b;
    public final Executor c;
    public final arwe d;
    public final armf e;
    public final AtomicBoolean f;
    public SubscriptionManager.OnSubscriptionsChangedListener g;
    public final kkg h;
    private final anen i;
    private final armf j;
    private final akbm k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private boolean q;
    private final AtomicBoolean r;

    public wvy(Context context, Executor executor, anen anenVar, arwe arweVar, arwe arweVar2, armf armfVar, akbm akbmVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        context.getClass();
        executor.getClass();
        anenVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        akbmVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.b = context;
        this.c = executor;
        this.i = anenVar;
        this.d = arweVar2;
        this.j = armfVar;
        this.k = akbmVar;
        this.e = armfVar2;
        this.l = armfVar3;
        this.m = armfVar4;
        this.n = armfVar5;
        this.o = armfVar6;
        this.p = armfVar7;
        this.h = new kkg(new vbo(this, 6), anenVar);
        this.q = true;
        this.f = new AtomicBoolean(false);
        this.r = new AtomicBoolean(false);
    }

    @Override // defpackage.wvv
    public final void a() {
        a.m().q("Starting SimStateMonitor.");
        this.k.post(new wuo(this, 3));
        if (((pcg) this.o.b()).a()) {
            if (!this.r.getAndSet(true)) {
                ((wwt) this.n.b()).a(2);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
                intentFilter.addAction("android.telephony.action.CARRIER_CONFIG_CHANGED");
                intentFilter.addAction("android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED");
                intentFilter.addAction("android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED");
                Context context = this.b;
                egl.h(context, new AsyncTelephonySimStateReceiver(), intentFilter);
                return;
            }
            return;
        }
        if (((pck) this.p.b()).a()) {
            ((wwt) this.n.b()).a(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wvw
            if (r0 == 0) goto L13
            r0 = r5
            wvw r0 = (defpackage.wvw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wvw r0 = new wvw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            boolean r5 = r4.q
            if (r5 == 0) goto L5a
            r5 = 0
            r4.q = r5
            alwo r5 = defpackage.wvy.a
            alvw r5 = r5.m()
            java.lang.String r2 = "Update PhoneSimsState on first SIM event."
            r5.q(r2)
            armf r5 = r4.j
            java.lang.Object r5 = r5.b()
            wvm r5 = (defpackage.wvm) r5
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            wxa r5 = (defpackage.wxa) r5
            arnb r5 = defpackage.arnb.a
            return r5
        L5a:
            alwo r5 = defpackage.wvy.a
            alvw r5 = r5.m()
            java.lang.String r0 = "Subscriptions changed. Scheduling PhoneSimsStateUpdate."
            r5.q(r0)
            armf r5 = r4.m
            java.lang.Object r5 = r5.b()
            wwa r5 = (defpackage.wwa) r5
            r5.a()
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvy.b(arpe):java.lang.Object");
    }
}
