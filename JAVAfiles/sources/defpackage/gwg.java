package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwg implements guf {
    public static final String a = gsy.b("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final gwf d;
    private final WorkDatabase e;
    private final gsb f;

    public gwg(Context context, WorkDatabase workDatabase, gsb gsbVar) {
        JobScheduler a2 = gwe.a(context);
        gwf gwfVar = new gwf(context);
        this.b = context;
        this.c = a2;
        this.d = gwfVar;
        this.e = workDatabase;
        this.f = gsbVar;
    }

    public static gyg a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new gyg(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b = gwe.b(jobScheduler);
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : b) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            gsy.a();
            Log.e(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.guf
    public final void b(String str) {
        ArrayList arrayList;
        List<JobInfo> e = e(this.b, this.c);
        if (e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : e) {
                gyg a2 = a(jobInfo);
                if (a2 != null && str.equals(a2.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f(this.c, ((Integer) it.next()).intValue());
            }
            gyb x = this.e.x();
            gyf gyfVar = (gyf) x;
            gyfVar.a.k();
            gkp d = gyfVar.c.d();
            d.g(1, str);
            try {
                ((gyf) x).a.l();
                try {
                    d.a();
                    ((gyf) x).a.o();
                } finally {
                    ((gyf) x).a.m();
                }
            } finally {
                gyfVar.c.f(d);
            }
        }
    }

    @Override // defpackage.guf
    public final void c(gys... gysVarArr) {
        int intValue;
        WorkDatabase workDatabase;
        hgi hgiVar = new hgi(this.e, (byte[]) null);
        for (gys gysVar : gysVarArr) {
            this.e.l();
            try {
                gys b = this.e.A().b(gysVar.c);
                if (b == null) {
                    gsy.a();
                    Log.w(a, "Skipping scheduling " + gysVar.c + " because it's no longer in the DB");
                    this.e.o();
                    workDatabase = this.e;
                } else if (b.d != gtk.ENQUEUED) {
                    gsy.a();
                    Log.w(a, "Skipping scheduling " + gysVar.c + " because it is no longer enqueued");
                    this.e.o();
                    workDatabase = this.e;
                } else {
                    gyg J = gvf.J(gysVar);
                    gya n = gvf.n(this.e.x(), J);
                    if (n != null) {
                        intValue = n.c;
                    } else {
                        gsb gsbVar = this.f;
                        Object e = ((gid) hgiVar.a).e(new ktb(hgiVar, gsbVar.i, gsbVar.j, 1));
                        e.getClass();
                        intValue = ((Number) e).intValue();
                    }
                    if (n == null) {
                        this.e.x().a(gvf.m(J, intValue));
                    }
                    g(gysVar, intValue);
                    this.e.o();
                    workDatabase = this.e;
                }
                workDatabase.m();
            } catch (Throwable th) {
                this.e.m();
                throw th;
            }
        }
    }

    @Override // defpackage.guf
    public final boolean d() {
        return true;
    }

    public final void g(gys gysVar, int i) {
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        int i5;
        gsf gsfVar = gysVar.l;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", gysVar.c);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", gysVar.v);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", gysVar.f());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.d.b).setRequiresCharging(gsfVar.c).setRequiresDeviceIdle(gsfVar.d).setExtras(persistableBundle);
        NetworkRequest a2 = gsfVar.a();
        int i6 = 0;
        if (Build.VERSION.SDK_INT >= 28 && a2 != null) {
            extras.getClass();
            extras.setRequiredNetwork(a2);
        } else {
            int i7 = gsfVar.j;
            if (Build.VERSION.SDK_INT >= 30 && i7 == 6) {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int i8 = i7 - 1;
                if (i8 != 0) {
                    if (i8 != 1) {
                        i2 = 2;
                        if (i8 != 2) {
                            i2 = 3;
                            if (i8 != 3) {
                                i2 = 4;
                                if (i8 != 4) {
                                    gsy a3 = gsy.a();
                                    String str3 = gwf.a;
                                    Objects.toString(gvf.as(i7));
                                    a3.c(str3, "API version too low. Cannot convert network type value ".concat(gvf.as(i7)));
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            }
        }
        if (!gsfVar.d) {
            if (gysVar.n == gry.LINEAR) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            extras.setBackoffCriteria(gysVar.o, i5);
        }
        long max = Math.max(gysVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!gysVar.s) {
            extras.setImportantWhileForeground(true);
        }
        if (gsfVar.b()) {
            for (gse gseVar : gsfVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(gseVar.a, gseVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(gsfVar.g);
            extras.setTriggerContentMaxDelay(gsfVar.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(gsfVar.e);
        extras.setRequiresStorageNotLow(gsfVar.f);
        int i9 = gysVar.m;
        if (Build.VERSION.SDK_INT >= 31 && gysVar.s && i9 <= 0 && max <= 0) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str2 = gysVar.z) != null) {
            extras.setTraceTag(str2);
        }
        JobInfo build = extras.build();
        gsy a4 = gsy.a();
        String str4 = a;
        a4.c(str4, "Scheduling work ID " + gysVar.c + "Job ID " + i);
        try {
            if (this.c.schedule(build) == 0) {
                gsy.a();
                Log.w(str4, "Unable to schedule work ID " + gysVar.c);
                if (gysVar.s && gysVar.t == gtf.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    gysVar.s = false;
                    gsy.a().c(str4, String.format("Scheduling a non-expedited job (work ID %s)", gysVar.c));
                    g(gysVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.b;
            WorkDatabase workDatabase = this.e;
            int i10 = gwe.a;
            int size = workDatabase.A().d().size();
            String str5 = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler a5 = gwe.a(context);
                List b = gwe.b(a5);
                if (b != null) {
                    List e2 = e(context, a5);
                    if (e2 != null) {
                        i4 = b.size() - e2.size();
                    } else {
                        i4 = 0;
                    }
                    String str6 = null;
                    if (i4 == 0) {
                        str = null;
                    } else {
                        str = i4 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    List e3 = e(context, (JobScheduler) systemService);
                    if (e3 != null) {
                        i6 = e3.size();
                    }
                    if (i6 != 0) {
                        str6 = i6 + " from WorkManager in the default namespace";
                    }
                    str5 = aqjn.aK(aqil.o(new String[]{b.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str6}), ",\n", null, null, null, 62);
                }
            } else {
                List e4 = e(context, gwe.a(context));
                if (e4 != null) {
                    str5 = e4.size() + " jobs from WorkManager";
                }
            }
            if (Build.VERSION.SDK_INT >= 31) {
                i3 = 150;
            } else {
                i3 = 100;
            }
            String str7 = "JobScheduler " + i3 + " job limit exceeded.\nIn JobScheduler there are " + str5 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.";
            gsy.a();
            Log.e(a, str7);
            throw new IllegalStateException(str7, e);
        } catch (Throwable th) {
            gsy.a();
            String str8 = a;
            Objects.toString(gysVar);
            Log.e(str8, "Unable to schedule ".concat(String.valueOf(gysVar)), th);
        }
    }
}
