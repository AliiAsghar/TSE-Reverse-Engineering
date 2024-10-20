package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xac implements wzp {
    public static final xze c = xze.g("Bugle", "TelephonySyncManager");
    private static final long k = TimeUnit.SECONDS.toMillis(1);
    private static final long l = TimeUnit.MINUTES.toMillis(1);
    private static final alpt m = alpt.r(amvm.APP_STARTUP_RESUME_SYNC, amvm.SYNC_TELEPHONY_THREADS_RESUME_SYNC);
    private static volatile Boolean n = null;
    public final xnv d;
    public final alhr e;
    public final apwt f;
    public final armf g;
    public final armf h;
    public final armf i;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;
    private final Context u;
    private final anen v;
    private final anen w;
    private final armf x;
    private final andr y = new andr();
    public final List j = new ArrayList();
    private long z = -1;
    private long A = -1;
    private long B = -1;
    private uj C = null;

    public xac(armf armfVar, armf armfVar2, armf armfVar3, xnv xnvVar, armf armfVar4, armf armfVar5, armf armfVar6, Context context, apwt apwtVar, apwt apwtVar2, anen anenVar, anen anenVar2, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        this.o = armfVar;
        this.p = armfVar2;
        this.q = armfVar3;
        this.d = xnvVar;
        this.r = armfVar4;
        this.s = armfVar5;
        this.t = armfVar6;
        this.u = context;
        this.e = new vvk(apwtVar, 8);
        this.f = apwtVar2;
        this.v = anenVar;
        this.w = anenVar2;
        this.x = armfVar7;
        this.g = armfVar8;
        this.h = armfVar9;
        this.i = armfVar10;
    }

    private final void A(long j, long j2, long j3, amvm amvmVar) {
        y(j, j2, j3, amvmVar, UUID.randomUUID());
    }

    private final boolean B() {
        boolean z;
        boolean z2 = true;
        if (n == null) {
            if (!((Optional) ((apxx) this.q).a).isEmpty() && !((yjv) this.o.b()).e()) {
                z = false;
            } else {
                z = true;
            }
            n = Boolean.valueOf(z);
        }
        if (!n.booleanValue() || !((yjv) this.o.b()).d()) {
            z2 = false;
        }
        xyo d = c.d();
        d.H("Checking canSyncWithTelephony");
        d.A("canSyncWithTelephony", z2);
        d.A("isWearable", ((Optional) ((apxx) this.q).a).isPresent());
        d.A("isSmsCapable", ((yjv) this.o.b()).e());
        d.A("isDefaultSmsApp", ((yjv) this.o.b()).d());
        d.q();
        return z2;
    }

    private final boolean C() {
        if (((yjf) this.t.b()).m() && yhx.h(this.u)) {
            return true;
        }
        c.q("no permission to sync.");
        return false;
    }

    private final void z(amvm amvmVar, amvl amvlVar, boolean z) {
        aktp.ai(new wtz(this, z, amvmVar, amvlVar, 2), this.w).k(qiu.c(new ivo(amvmVar, amvlVar, z, 5)), andi.a);
    }

    @Override // defpackage.wzp
    public final long a(long j) {
        long j2;
        long e = ((ykw) ((wfh) this.p.b()).a).e("last_full_sync_time_millis", -1L);
        long j3 = l;
        if (e < 0) {
            j2 = j;
        } else {
            j2 = e + j3;
        }
        long j4 = j2 - j;
        if (j4 <= 0) {
            return 0L;
        }
        return j4;
    }

    @Override // defpackage.wzp
    public final synchronized xjn b(long j) {
        uj ujVar = this.C;
        if (ujVar != null) {
            return (xjn) ujVar.d(j);
        }
        return null;
    }

    @Override // defpackage.wzp
    public final akul c(final boolean z, final long j, final long j2, final long j3, final UUID uuid) {
        return akul.g(this.y.b(akto.c(new ancr() { // from class: wzz
            @Override // defpackage.ancr
            public final ListenableFuture a() {
                xac xacVar = xac.this;
                boolean z2 = z;
                long j4 = j;
                long j5 = j2;
                long j6 = j3;
                UUID uuid2 = uuid;
                wzo x = xacVar.x(z2, j4, j5, j6, uuid2);
                if (wzo.CAN_START.equals(x)) {
                    xbw xbwVar = (xbw) xacVar.f.b();
                    AtomicReference atomicReference = new AtomicReference();
                    AtomicReference atomicReference2 = new AtomicReference();
                    return akul.g(xbwVar.b.b(new wua(xbwVar, atomicReference, uuid2, atomicReference2, 2), andi.a)).h(new way(uuid2, atomicReference, atomicReference2, 10, (char[]) null), andi.a).h(new wxv(x, 8), andi.a);
                }
                return aktp.ag(x);
            }
        }), this.w));
    }

    @Override // defpackage.wzp
    public final akul d() {
        return ((xbw) this.f.b()).a();
    }

    @Override // defpackage.wzp
    public final akul e() {
        return aktp.ag(Boolean.valueOf(((wfh) this.p.b()).n()));
    }

    @Override // defpackage.wzp
    public final akul f(amvm amvmVar) {
        return aktp.ai(new vze(this, amvmVar, 14), (Executor) this.x.b());
    }

    @Override // defpackage.wzp
    public final synchronized void g() {
        xyo a = c.a();
        a.H("Sync started at");
        a.G(this.z);
        a.H("marked as complete");
        a.q();
        this.z = -1L;
        this.C = null;
        xbw xbwVar = (xbw) this.f.b();
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        AtomicReference atomicReference3 = new AtomicReference();
        akul.g(xbwVar.b.b(new way(atomicReference, atomicReference2, atomicReference3, 8, (char[]) null), andi.a)).h(new way(atomicReference, atomicReference2, atomicReference3, 9, (char[]) null), andi.a).h(new wxv(this, 9), this.w).k(qiu.b(), this.v);
    }

    @Override // defpackage.wzp
    public final void h() {
        j(this.d.f().toEpochMilli(), amvm.IMMEDIATE_SYNC);
    }

    @Override // defpackage.wzp
    public final synchronized void i(long j) {
        akrh e = aktp.e("TelephonySyncManager::onNewMessageInserted");
        try {
            long j2 = this.A;
            if (j2 >= 0 && j <= j2) {
                this.B = Math.max(j2, j);
                xyo a = c.a();
                a.H("New message at");
                a.G(j);
                a.H("is before upper bound of current sync batch");
                a.G(this.A);
                a.q();
            } else {
                xyo a2 = c.a();
                a2.H("New message at");
                a2.G(j);
                a2.H("is after upper bound of current sync batch");
                a2.G(this.A);
                a2.q();
            }
            e.close();
        } finally {
        }
    }

    @Override // defpackage.wzp
    public final void j(long j, amvm amvmVar) {
        A(j, ((wfh) this.p.b()).m(), j, amvmVar);
    }

    @Override // defpackage.wzp
    public final void k(amvm amvmVar) {
        akul i;
        akul ag;
        if (B()) {
            p(true);
            ((wyt) this.r.b()).i();
            n();
            if (!C()) {
                z(amvmVar, amvl.MISSING_PERMISSIONS, true);
                return;
            }
            xyo c2 = c.c();
            c2.H("Starting full sync");
            c2.z("reason", amvmVar);
            c2.q();
            long epochMilli = this.d.f().toEpochMilli() + xim.b().toMillis();
            if (amvmVar == amvm.SELECTED_DEFAULT_SMS_APP) {
                i = ((xbw) this.f.b()).b(epochMilli).h(new woc(11), andi.a);
            } else {
                i = ((xbw) this.f.b()).a().i(new mfj(this, epochMilli, 10), this.v);
            }
            akul e = i.e(IOException.class, new woc(14), andi.a);
            if (m.contains(amvmVar)) {
                ag = akul.g(((xbw) this.f.b()).b.a()).h(new woc(18), andi.a).h(new woc(13), this.v);
            } else {
                ag = aktp.ag(UUID.randomUUID());
            }
            akul akulVar = ag;
            aktp.ap(e, akulVar).i(new ahqs(this, e, akulVar, amvmVar, epochMilli, 1), (Executor) this.x.b()).k(qiu.c(new vrw(19)), this.v);
            return;
        }
        z(amvmVar, amvl.CANT_SYNC_WITH_TELEPHONY, true);
        xyo a = c.a();
        a.H("Skip forceFullSync() because canSyncWithTelephony is false");
        a.q();
    }

    @Override // defpackage.wzp
    public final void l(amvm amvmVar) {
        j(this.d.f().toEpochMilli() + xim.b().toMillis(), amvmVar);
    }

    @Override // defpackage.wzp
    public final void m(Uri uri, Instant instant) {
        long epochMilli = instant.toEpochMilli();
        long j = k;
        long j2 = epochMilli + j;
        long j3 = epochMilli - j;
        long j4 = 0;
        if (j3 >= 0) {
            j4 = j3;
        }
        A(epochMilli, j4, j2, amvm.SPOT_SYNC);
    }

    @Override // defpackage.wzp
    public final void n() {
        ((ykw) ((wfh) this.p.b()).a).k("last_full_sync_time_millis", -1L);
        ((ykw) ((wfh) this.p.b()).a).k("last_sync_time_millis", -1L);
    }

    @Override // defpackage.wzp
    public final synchronized void o(uj ujVar) {
        this.C = ujVar;
    }

    @Override // defpackage.wzp
    public final void p(boolean z) {
        boolean u = u();
        xze xzeVar = c;
        xyo c2 = xzeVar.c();
        c2.H("setting full sync.");
        c2.A("inProgress", z);
        c2.A("before", u);
        c2.q();
        if (u != z) {
            xyo a = xzeVar.a();
            a.H("setFullSyncInProgressFlag:");
            a.I(z);
            a.q();
            ((ykw) ((wfh) this.p.b()).a).g("bugle_full_sync_in_progress", z);
            if (!z) {
                qzi qziVar = (qzi) this.s.b();
                agnq agnqVar = (agnq) qziVar.b.b();
                agnqVar.getClass();
                new FillPartSizeAction(qziVar.a, agnqVar).z();
            }
        }
    }

    @Override // defpackage.wzp
    public final void q(boolean z) {
        n = Boolean.valueOf(z);
    }

    @Override // defpackage.wzp
    public final synchronized void r(long j) {
        boolean z;
        if (this.A < 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.A = j;
        this.B = -1L;
    }

    @Override // defpackage.wzp
    public final boolean s() {
        if (((wfh) this.p.b()).m() != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wzp
    public final synchronized boolean t(long j) {
        boolean z;
        boolean z2;
        z = true;
        if (this.A >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        long j2 = this.B;
        if (j2 < 0 || j2 < j) {
            z = false;
        }
        xyo a = c.a();
        a.H("Sync batch of messages.");
        a.y("lowerBoundTimestamp", j);
        a.y("upperBoundTimestamp", this.A);
        a.A("dirty", z);
        a.y("maxRecentChangeTimestamp", this.B);
        a.q();
        this.A = -1L;
        this.B = -1L;
        return z;
    }

    @Override // defpackage.wzp
    public final boolean u() {
        return ((wfh) this.p.b()).n();
    }

    @Override // defpackage.wzp
    public final synchronized boolean v() {
        if (this.z >= 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wzp
    public final synchronized boolean w(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        xyo a = c.a();
        a.H("IsSyncing");
        a.y("upperBoundTimestamp", j);
        a.y("currentUpperBoundTimestamp", this.A);
        a.q();
        if (j == this.A) {
            return true;
        }
        return false;
    }

    public final synchronized wzo x(boolean z, long j, long j2, long j3, UUID uuid) {
        xze xzeVar = c;
        xyo d = xzeVar.d();
        d.H("Checking if sync can start");
        d.y("startTimestampMs", j);
        d.z("syncId", uuid);
        d.A("isFull", z);
        d.q();
        if (z) {
            long a = a(j);
            if (a > 0) {
                xyo a2 = xzeVar.a();
                a2.H("Full sync requested, but delayed");
                a2.y("startTimestampMs", j);
                a2.y("delayUntilFullSyncMs", a);
                a2.z("syncId", uuid);
                a2.q();
                return wzo.FULL_SYNC_DELAYED;
            }
        }
        if (v()) {
            xyo a3 = xzeVar.a();
            a3.H("Not allowed to sync yet");
            a3.y("Current sync started at", this.z);
            a3.z("syncId", uuid);
            a3.A("isFull", z);
            a3.q();
            if (!z) {
                xyo a4 = xzeVar.a();
                a4.H("Adding partial sync request to queue");
                a4.y("startTimestampMs", j);
                a4.z("syncId", uuid);
                a4.q();
                this.j.add(new xab(j, j2, j3, uuid));
                return wzo.PARTIAL_SYNC_QUEUED;
            }
            return wzo.DO_NOT_START;
        }
        xyo a5 = xzeVar.a();
        a5.H("Sync configured");
        a5.y("startTimestampMs", j);
        a5.z("syncId", uuid);
        a5.A("isFull", z);
        a5.q();
        this.z = j;
        this.A = j3;
        this.B = -1L;
        Iterator it = ((CopyOnWriteArraySet) this.e.get()).iterator();
        while (it.hasNext()) {
            ((wzq) it.next()).b(z);
        }
        return wzo.CAN_START;
    }

    public final void y(long j, long j2, long j3, amvm amvmVar, UUID uuid) {
        if (!B()) {
            z(amvmVar, amvl.CANT_SYNC_WITH_TELEPHONY, false);
            return;
        }
        if (!C()) {
            z(amvmVar, amvl.MISSING_PERMISSIONS, false);
            return;
        }
        armf armfVar = this.g;
        UUID randomUUID = UUID.randomUUID();
        vyv vyvVar = (vyv) armfVar.b();
        int i = alog.d;
        ((xjc) vyvVar.a).b(uuid, alsx.a, vyv.L(amvmVar, false, false, randomUUID));
        qiu.h(((xil) this.i.b()).a(Instant.ofEpochMilli(j2), Instant.ofEpochMilli(j3), Instant.ofEpochMilli(j), amvmVar, uuid, randomUUID));
    }
}
