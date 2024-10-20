package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvv {
    public static final String a = gsy.b("Alarms");

    public static void a(Context context, gyg gygVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, gvw.c(context, gygVar), 603979776);
        if (service != null && alarmManager != null) {
            gsy.a().c(a, "Cancelling existing alarm with (workSpecId, systemId) (" + gygVar + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, gyg gygVar, long j) {
        gyb x = workDatabase.x();
        gya n = gvf.n(x, gygVar);
        if (n != null) {
            a(context, gygVar, n.c);
            c(context, gygVar, n.c, j);
            return;
        }
        hgi hgiVar = new hgi(workDatabase, (byte[]) null);
        Object e = ((gid) hgiVar.a).e(new gvk(hgiVar, 3));
        e.getClass();
        int intValue = ((Number) e).intValue();
        x.a(gvf.m(gygVar, intValue));
        c(context, gygVar, intValue, j);
    }

    private static void c(Context context, gyg gygVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, gvw.c(context, gygVar), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
