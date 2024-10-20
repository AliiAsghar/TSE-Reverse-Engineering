package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.andi;
import defpackage.gsx;
import defpackage.rui;
import defpackage.tsz;
import defpackage.uhw;
import defpackage.ukh;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CleanupVerifiedSmsDataWork extends gsx {
    private static final xze e = xze.g("Bugle", "CleanupVerifiedSmsDataWork");
    private final ukh f;
    private final aksr g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        aksr a();

        ukh dQ();
    }

    public CleanupVerifiedSmsDataWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) akec.w(context, a.class);
        this.f = aVar.dQ();
        this.g = aVar.a();
        xyo a2 = e.a();
        a2.H("CleanupVerifiedSmsDataWork created.");
        a2.q();
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        xyo a2 = e.a();
        a2.H("Beginning CleanupVerifiedSmsDataWork work.");
        a2.q();
        akrc b = this.g.b("CleanupVerifiedSmsDataWork");
        try {
            ukh ukhVar = this.f;
            akul h = aktp.ah(new rui(ukhVar, 17), ukhVar.i).i(new tsz(ukhVar, 16), andi.a).h(new uhw(4), andi.a);
            b.close();
            return h;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
