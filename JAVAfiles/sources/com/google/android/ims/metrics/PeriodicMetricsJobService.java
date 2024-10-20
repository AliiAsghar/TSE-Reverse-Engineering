package com.google.android.ims.metrics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.acrj;
import defpackage.adec;
import defpackage.advr;
import defpackage.anen;
import defpackage.armf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PeriodicMetricsJobService extends JobService {
    public static final /* synthetic */ int d = 0;
    public armf a;
    public armf b;
    armf c;

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    @Override // android.app.Service
    public final void onCreate() {
        adec adecVar = new adec(acrj.b(this));
        this.a = adecVar.e;
        this.b = adecVar.d;
        this.c = adecVar.c;
        super.onCreate();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        advr.o("Reporting periodic metrics.", new Object[0]);
        if (jobParameters.getJobId() != 30000) {
            advr.q("Periodic metrics service started with unexpected job ID! Ignoring!", new Object[0]);
            jobFinished(jobParameters, false);
            return false;
        }
        ((anen) this.c.b()).submit(new Runnable() { // from class: adel
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0126, code lost:
            
                if (r2.equals("CheckPreconditionsState") != false) goto L118;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 954
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.adel.run():void");
            }
        });
        jobFinished(jobParameters, false);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
