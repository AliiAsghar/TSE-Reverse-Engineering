package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvz implements Runnable {
    final /* synthetic */ gwd a;

    public gvz(gwd gwdVar) {
        this.a = gwdVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        gwd gwdVar;
        gwc gwcVar;
        gwd gwdVar2;
        gvw gvwVar;
        Intent intent;
        String action;
        List<hgi> a;
        boolean z;
        gvz gvzVar = this;
        synchronized (gvzVar.a.g) {
            gwd gwdVar3 = gvzVar.a;
            gwdVar3.h = (Intent) gwdVar3.g.get(0);
        }
        gwd gwdVar4 = gvzVar.a;
        Intent intent2 = gwdVar4.h;
        if (intent2 != null) {
            String action2 = intent2.getAction();
            int intExtra = gwdVar4.h.getIntExtra("KEY_START_ID", 0);
            gsy.a().c(gwd.a, "Processing command " + gvzVar.a.h + ", " + intExtra);
            PowerManager.WakeLock a2 = haa.a(gvzVar.a.b, action2 + " (" + intExtra + ")");
            try {
                gsy.a().c(gwd.a, a.ci(a2, action2, "Acquiring operation wake lock (", ") "));
                a2.acquire();
                gwdVar2 = gvzVar.a;
                gvwVar = gwdVar2.f;
                intent = gwdVar2.h;
                action = intent.getAction();
            } catch (Throwable th) {
                th = th;
            }
            try {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
                    gsy a3 = gsy.a();
                    String str = gvw.a;
                    Objects.toString(intent);
                    a3.c(str, "Handling constraints changed ".concat(String.valueOf(intent)));
                    String str2 = gvx.a;
                    Context context = gvwVar.b;
                    hgi hgiVar = new hgi(gwdVar2.e.k);
                    List<gys> d = gwdVar2.e.e.A().d();
                    int i = ConstraintProxy.a;
                    Iterator it = d.iterator();
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (it.hasNext()) {
                        gsf gsfVar = ((gys) it.next()).l;
                        z2 |= gsfVar.e;
                        z3 |= gsfVar.c;
                        z4 |= gsfVar.f;
                        if (gsfVar.j != 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z5 |= z;
                        if (z2 && z3 && z4 && z5) {
                            break;
                        }
                    }
                    Intent intent3 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
                    intent3.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
                    intent3.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
                    context.sendBroadcast(intent3);
                    ArrayList arrayList = new ArrayList(d.size());
                    long currentTimeMillis = System.currentTimeMillis();
                    for (gys gysVar : d) {
                        if (currentTimeMillis >= gysVar.a() && (!gysVar.d() || hgiVar.i(gysVar))) {
                            arrayList.add(gysVar);
                        }
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        gys gysVar2 = (gys) arrayList.get(i2);
                        String str3 = gysVar2.c;
                        Intent c = gvw.c(context, gvf.J(gysVar2));
                        gsy.a().c(gvx.a, a.bW(str3, "Creating a delay_met command for workSpec with id (", ")"));
                        gwdVar2.j.c.execute(new gwa(gwdVar2, c, intExtra, 0));
                    }
                } else if ("ACTION_RESCHEDULE".equals(action)) {
                    gsy.a().c(gvw.a, "Handling reschedule " + intent + ", " + intExtra);
                    gwdVar2.e.p();
                } else {
                    Bundle extras = intent.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                        if ("ACTION_SCHEDULE_WORK".equals(action)) {
                            gyg e = gvw.e(intent);
                            gsy a4 = gsy.a();
                            String str4 = gvw.a;
                            Objects.toString(e);
                            a4.c(str4, "Handling schedule work for ".concat(e.toString()));
                            WorkDatabase workDatabase = gwdVar2.e.e;
                            workDatabase.l();
                            try {
                                gys b = workDatabase.A().b(e.a);
                                if (b == null) {
                                    gsy.a();
                                    Log.w(gvw.a, a.cc(e, "Skipping scheduling ", " because it's no longer in the DB"));
                                } else if (b.d.a()) {
                                    gsy.a();
                                    Log.w(gvw.a, a.cc(e, "Skipping scheduling ", "because it is finished."));
                                } else {
                                    long a5 = b.a();
                                    if (!b.d()) {
                                        gsy.a().c(gvw.a, "Setting up Alarms for " + e + "at " + a5);
                                        gvv.b(gvwVar.b, workDatabase, e, a5);
                                    } else {
                                        gsy.a().c(gvw.a, "Opportunistically setting an alarm for " + e + "at " + a5);
                                        gvv.b(gvwVar.b, workDatabase, e, a5);
                                        gwdVar2.j.c.execute(new gwa(gwdVar2, gvw.b(gvwVar.b), intExtra, 0));
                                    }
                                    workDatabase.o();
                                }
                            } finally {
                                workDatabase.m();
                            }
                        } else {
                            int i3 = 2;
                            if ("ACTION_DELAY_MET".equals(action)) {
                                synchronized (gvwVar.d) {
                                    gyg e2 = gvw.e(intent);
                                    gsy.a().c(gvw.a, a.ch(e2, "Handing delay met for "));
                                    if (!gvwVar.c.containsKey(e2)) {
                                        gvy gvyVar = new gvy(gvwVar.b, intExtra, gwdVar2, gvwVar.e.d(e2));
                                        gvwVar.c.put(e2, gvyVar);
                                        String str5 = gvyVar.d.a;
                                        gvyVar.i = haa.a(gvyVar.b, str5 + " (" + gvyVar.c + ")");
                                        gsy.a().c(gvy.a, "Acquiring wakelock " + gvyVar.i + "for WorkSpec " + str5);
                                        gvyVar.i.acquire();
                                        gys b2 = gvyVar.e.e.e.A().b(str5);
                                        if (b2 == null) {
                                            gvyVar.g.execute(new gtq(gvyVar, i3));
                                        } else {
                                            boolean d2 = b2.d();
                                            gvyVar.j = d2;
                                            if (!d2) {
                                                gsy.a().c(gvy.a, "No constraints for ".concat(str5));
                                                gvyVar.g.execute(new gtq(gvyVar, 3));
                                            } else {
                                                gvyVar.l = gwp.a(gvyVar.m, b2, gvyVar.k, gvyVar);
                                            }
                                        }
                                    } else {
                                        gsy.a().c(gvw.a, a.cc(e2, "WorkSpec ", " is is already being handled for ACTION_DELAY_MET"));
                                    }
                                }
                            } else if ("ACTION_STOP_WORK".equals(action)) {
                                Bundle extras2 = intent.getExtras();
                                String string = extras2.getString("KEY_WORKSPEC_ID");
                                if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                                    int i4 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                                    a = new ArrayList(1);
                                    hgi c2 = gvwVar.e.c(new gyg(string, i4));
                                    if (c2 != null) {
                                        a.add(c2);
                                    }
                                } else {
                                    a = gvwVar.e.a(string);
                                }
                                for (hgi hgiVar2 : a) {
                                    gsy.a().c(gvw.a, "Handing stopWork work for ".concat(String.valueOf(string)));
                                    gvf.an(gwdVar2.k, hgiVar2);
                                    Context context2 = gvwVar.b;
                                    WorkDatabase workDatabase2 = gwdVar2.e.e;
                                    Object obj = hgiVar2.a;
                                    String str6 = gvv.a;
                                    gyb x = workDatabase2.x();
                                    gya n = gvf.n(x, (gyg) obj);
                                    if (n != null) {
                                        gvv.a(context2, (gyg) obj, n.c);
                                        gsy.a().c(gvv.a, "Removing SystemIdInfo for workSpecId (" + obj + ")");
                                        ((gyf) x).a.k();
                                        gkp d3 = ((gyf) x).b.d();
                                        d3.g(1, ((gyg) obj).a);
                                        d3.e(2, (long) ((gyg) obj).b);
                                        try {
                                            ((gyf) x).a.l();
                                            try {
                                                d3.a();
                                                ((gyf) x).a.o();
                                            } finally {
                                            }
                                        } finally {
                                            ((gyf) x).b.f(d3);
                                        }
                                    }
                                    gwdVar2.a((gyg) hgiVar2.a, false);
                                }
                            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                                gyg e3 = gvw.e(intent);
                                boolean z6 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                                gsy.a().c(gvw.a, "Handling onExecutionCompleted " + intent + ", " + intExtra);
                                gvwVar.a(e3, z6);
                            } else {
                                gsy.a();
                                String str7 = gvw.a;
                                Objects.toString(intent);
                                Log.w(str7, "Ignoring intent ".concat(String.valueOf(intent)));
                            }
                        }
                    }
                    gsy.a();
                    Log.e(gvw.a, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
                }
                gsy.a().c(gwd.a, a.ci(a2, action2, "Releasing operation wake lock (", ") "));
                a2.release();
                gwdVar = this.a;
                gwcVar = new gwc(gwdVar, 0);
            } catch (Throwable th2) {
                th = th2;
                gvzVar = this;
                try {
                    gsy.a();
                    Log.e(gwd.a, "Unexpected error in onHandleIntent", th);
                    gsy.a().c(gwd.a, a.ci(a2, action2, "Releasing operation wake lock (", ") "));
                    a2.release();
                    gwdVar = gvzVar.a;
                    gwcVar = new gwc(gwdVar, 0);
                    gwdVar.j.c.execute(gwcVar);
                } catch (Throwable th3) {
                    gsy.a().c(gwd.a, a.ci(a2, action2, "Releasing operation wake lock (", ") "));
                    a2.release();
                    gwd gwdVar5 = gvzVar.a;
                    gwdVar5.j.c.execute(new gwc(gwdVar5, 0));
                    throw th3;
                }
            }
            gwdVar.j.c.execute(gwcVar);
        }
    }
}
