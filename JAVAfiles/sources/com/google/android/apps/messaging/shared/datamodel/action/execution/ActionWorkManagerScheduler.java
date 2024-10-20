package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import defpackage.akec;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.albo;
import defpackage.armf;
import defpackage.gsi;
import defpackage.gsu;
import defpackage.gsx;
import defpackage.kzr;
import defpackage.nhy;
import defpackage.qwn;
import defpackage.rhg;
import defpackage.rhn;
import defpackage.rho;
import defpackage.rhr;
import defpackage.rib;
import defpackage.rik;
import defpackage.xyl;
import defpackage.xze;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ActionWorkManagerScheduler {
    public static final xze a = xze.g("BugleDataModel", "ActionWorkManagerScheduler");
    public final armf b;
    public final Context c;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static class ActionWorker extends gsx {
        private final rib e;
        private final rhg f;
        private final aksr g;

        public ActionWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            a aVar = (a) akec.w(context, a.class);
            this.e = aVar.cI();
            this.f = aVar.cH();
            this.g = aVar.a();
        }

        @Override // defpackage.gsx
        public final ListenableFuture b() {
            AutoCloseable e;
            Action b;
            ListenableFuture bI;
            try {
                e = this.g.b("ActionWorker#startWork");
            } catch (IllegalStateException unused) {
                aktp.d();
                e = aktp.e("ActionWorker#startWork");
            }
            try {
                rib ribVar = this.e;
                gsi f = f();
                String d = f.d("bundle_action_name");
                String d2 = f.d("bundle_action_key");
                if (((nhy) ribVar.b.b()).a()) {
                    b = (Action) Optional.ofNullable(f.g("persistable_bundle_action_params_serialized")).flatMap(new rhr(8)).map(new rhr(7)).or(new qwn(f, 11)).map(new kzr(ribVar, d, d2, 10)).orElse(null);
                } else {
                    String d3 = f.d("bundle_action_params");
                    if (d3 == null) {
                        d3 = f.d("bundle_action_serialized_params");
                    }
                    b = ribVar.b(d, d2, (ActionParameters) rik.a(d3, ActionParameters.class, "ActionParameters"));
                }
                if (b == null) {
                    xyl.c("failed to unparcel scheduled Action");
                    bI = albo.bI(new gsu());
                } else {
                    final SettableFuture create = SettableFuture.create();
                    rho rhoVar = new rho(b.t, rho.a(b), new rhn() { // from class: ric
                        @Override // defpackage.rhn
                        public final void a() {
                            SettableFuture.this.set(new gsw());
                        }
                    }, null, true);
                    rhoVar.b = toString();
                    try {
                        this.f.a(rhoVar, b);
                        bI = create;
                    } catch (RuntimeException e2) {
                        ActionWorkManagerScheduler.a.n("RuntimeException when starting job.", e2);
                        bI = albo.bI(new gsu());
                    }
                }
                e.close();
                return bI;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        aksr a();

        rhg cH();

        rib cI();
    }

    public ActionWorkManagerScheduler(armf armfVar, Context context) {
        this.b = armfVar;
        this.c = context;
    }
}
