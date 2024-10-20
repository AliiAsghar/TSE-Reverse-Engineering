package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.a;
import defpackage.gsy;
import defpackage.gts;
import defpackage.gud;
import defpackage.gui;
import defpackage.gvd;
import defpackage.gvf;
import defpackage.gyg;
import defpackage.hgi;
import defpackage.ico;
import defpackage.mka;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements gts {
    private static final String a = gsy.b("SystemJobService");
    private gvd b;
    private final Map c = new HashMap();
    private final gui d = gvf.ao(false);
    private ico e;

    private static gyg b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new gyg(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException(a.bW(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.gts
    public final void a(gyg gygVar, boolean z) {
        c("onExecuted");
        gsy.a().c(a, gygVar.a.concat(" executed on JobScheduler"));
        JobParameters jobParameters = (JobParameters) this.c.remove(gygVar);
        this.d.c(gygVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            gvd m = gvd.m(getApplicationContext());
            this.b = m;
            gud gudVar = m.g;
            this.e = new ico(gudVar, m.l);
            gudVar.a(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                gsy.a();
                Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        gvd gvdVar = this.b;
        if (gvdVar != null) {
            gvdVar.g.b(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Uri[] triggeredContentUris;
        String[] triggeredContentAuthorities;
        String[] triggeredContentAuthorities2;
        Uri[] triggeredContentUris2;
        c("onStartJob");
        if (this.b == null) {
            gsy.a().c(a, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        gyg b = b(jobParameters);
        if (b == null) {
            gsy.a();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        if (this.c.containsKey(b)) {
            gsy a2 = gsy.a();
            String str = a;
            Objects.toString(b);
            a2.c(str, "Job is already being executed by SystemJobService: ".concat(b.toString()));
            return false;
        }
        gsy a3 = gsy.a();
        String str2 = a;
        Objects.toString(b);
        a3.c(str2, "onStartJob for ".concat(b.toString()));
        this.c.put(b, jobParameters);
        mka mkaVar = new mka(null, null);
        triggeredContentUris = jobParameters.getTriggeredContentUris();
        if (triggeredContentUris != null) {
            triggeredContentUris2 = jobParameters.getTriggeredContentUris();
            mkaVar.a = Arrays.asList(triggeredContentUris2);
        }
        triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
        if (triggeredContentAuthorities != null) {
            triggeredContentAuthorities2 = jobParameters.getTriggeredContentAuthorities();
            Arrays.asList(triggeredContentAuthorities2);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            jobParameters.getNetwork();
        }
        this.e.H(this.d.d(b), mkaVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int stopReason;
        c("onStopJob");
        if (this.b == null) {
            gsy.a().c(a, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        gyg b = b(jobParameters);
        if (b == null) {
            gsy.a();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        gsy a2 = gsy.a();
        String str = a;
        Objects.toString(b);
        a2.c(str, "onStopJob for ".concat(b.toString()));
        this.c.remove(b);
        hgi c = this.d.c(b);
        if (c != null) {
            int i = -512;
            if (Build.VERSION.SDK_INT >= 31) {
                stopReason = jobParameters.getStopReason();
                switch (stopReason) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i = stopReason;
                        break;
                }
            }
            this.e.I(c, i);
        }
        gud gudVar = this.b.g;
        String str2 = b.a;
        synchronized (gudVar.j) {
            contains = gudVar.h.contains(str2);
        }
        if (!contains) {
            return true;
        }
        return false;
    }
}
