package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.app.job.JobParameters;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.rhg;
import defpackage.rho;
import defpackage.rhz;
import defpackage.rib;
import defpackage.rii;
import defpackage.xyl;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ActionJobService extends rii {
    private static final xze d = xze.g("BugleDataModel", "ActionJobService");
    public rib a;
    public aksr b;
    public armf c;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        akrc b = this.b.b("ActionJobService::StartJob");
        try {
            Action d2 = this.a.d(jobParameters.getExtras());
            boolean z = false;
            if (d2 == null) {
                jobFinished(jobParameters, false);
                xyl.c("failed to unparcel scheduled Action");
            } else {
                rho rhoVar = new rho(d2.t, jobParameters.getJobId(), new rhz(this, jobParameters, 1), null, true);
                rhoVar.b = toString();
                try {
                    ((rhg) this.c.b()).a(rhoVar, d2);
                    z = true;
                } catch (RuntimeException e) {
                    d.n("RuntimeException when starting job.", e);
                }
            }
            b.close();
            return z;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        akrc b = this.b.b("ActionJobService::StopJob");
        try {
            ((rhg) this.c.b()).c(jobParameters.getJobId());
            b.close();
            return false;
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
