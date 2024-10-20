package defpackage;

import android.util.Log;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aboy extends abrc implements abns {
    public final alhr a;

    static {
        new AtomicBoolean(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aboy(android.content.Context r6, defpackage.alhr r7) {
        /*
            r5 = this;
            aaoc r0 = defpackage.abnr.k
            abqx r1 = defpackage.abqy.q
            adxq r2 = new adxq
            r2.<init>()
            aodm r3 = new aodm
            r4 = 1
            r3.<init>(r4)
            r2.b = r3
            abrb r2 = r2.j()
            r5.<init>(r6, r0, r1, r2)
            r5.a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboy.<init>(android.content.Context, alhr):void");
    }

    private final acir w(abno abnoVar) {
        abnv abnvVar;
        ListenableFuture listenableFuture;
        apwc apwcVar;
        int i = 1;
        if (abnoVar.n) {
            Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            listenableFuture = aneh.a;
        } else {
            abnoVar.n = true;
            if (abnoVar.a.l != null) {
                abnvVar = aict.b;
            } else {
                abnvVar = null;
            }
            if (abnvVar != null && (apwcVar = abnvVar.a) != apwc.LOGGER_OVERRIDE_PROVIDER && apwcVar != apwc.LOGGER_DEFERRING_PROVIDER) {
                Log.e("AbstractLogEventBuilder", "The provided logger-level ProductIdOrigin value " + apwcVar.toString() + " is not one of the values expected for a logger-level provider: " + String.valueOf(apwc.LOGGER_OVERRIDE_PROVIDER) + " or " + String.valueOf(apwc.LOGGER_DEFERRING_PROVIDER));
                abnvVar = null;
            }
            if (abnvVar != null && abnvVar.a == apwc.LOGGER_OVERRIDE_PROVIDER) {
                abnoVar.e(abnvVar);
            } else {
                abnv abnvVar2 = abnoVar.l;
                if (abnvVar2 != null && abnvVar2.a == apwc.CPS_APP_PROCESS_GLOBAL_PROVIDER) {
                    abnoVar.e(abnvVar2);
                } else if (abnvVar != null) {
                    abnoVar.e(abnvVar);
                } else if (abnvVar2 != null) {
                    abnoVar.e(abnvVar2);
                }
            }
            if (!abnoVar.a.e()) {
                ListenableFuture bI = albo.bI(null);
                listenableFuture = ancj.f(ancj.g(bI, new yui(abnoVar, bI, 15), andi.a), new aald(abnoVar, 16), andi.a);
            } else {
                listenableFuture = aneh.a;
            }
        }
        if (listenableFuture.isDone() && !listenableFuture.isCancelled()) {
            try {
                d.p(listenableFuture);
                abox aboxVar = new abox(this, abnoVar, this.i);
                r(aboxVar);
                return abhg.o(aboxVar);
            } catch (RuntimeException | ExecutionException unused) {
            }
        }
        return agkx.g(listenableFuture).d(andi.a, new abpk(this, abnoVar, i));
    }

    @Override // defpackage.abns
    public final acir a(abnq abnqVar) {
        return w(abnqVar);
    }

    @Override // defpackage.abns
    public final acir b(aboq aboqVar) {
        return w(aboqVar);
    }

    @Override // defpackage.abns
    public final void c(TimeUnit timeUnit) {
        try {
            actx.v(g(new abou()), 1100L, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException | TimeoutException unused2) {
        }
    }

    public final void d(BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.a.isEmpty()) {
            actx.s(Status.a);
            return;
        }
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abot(batchedLogErrorParcelable, 0);
        ajxpVar.d = new Feature[]{abok.a};
        ajxpVar.c();
        f(ajxpVar.b());
    }
}
