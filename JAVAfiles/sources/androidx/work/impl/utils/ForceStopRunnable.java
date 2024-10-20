package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.android.vcard.VCardConfig;
import defpackage.gsy;
import defpackage.gvd;
import defpackage.hgi;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    private static final String a = gsy.b("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final gvd d;
    private int e = 0;
    private final hgi f;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = gsy.b("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                int i = gsy.a().c;
                String str = a;
                if (i <= 2) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.a(context);
            }
        }
    }

    public ForceStopRunnable(Context context, gvd gvdVar) {
        this.c = context.getApplicationContext();
        this.d = gvdVar;
        this.f = gvdVar.m;
    }

    static void a(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        }
        PendingIntent b2 = b(context, i);
        long currentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b2);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:101|102|103|104|105|(3:109|110|(5:117|118|(1:120)(1:150)|121|(4:(1:124)|125|(5:129|(1:131)|132|(4:135|(2:137|(3:139|140|141)(1:142))(1:144)|143|133)|145)|(1:147)(0))(2:(2:149|141)|(0)(0)))(1:114))|155|110|(1:112)|117|118|(0)(0)|121|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x036b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x036e, code lost:
    
        defpackage.gsy.a();
        android.util.Log.w(androidx.work.impl.utils.ForceStopRunnable.a, "Ignoring exception", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x036d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x003b, code lost:
    
        if (r5 == false) goto L181;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0353 A[Catch: SQLiteTableLockedException -> 0x03cf, SQLiteFullException -> 0x03d1, SQLiteDiskIOException -> 0x03d3, SQLiteDatabaseLockedException -> 0x03d5, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException -> 0x03d7, SQLiteConstraintException -> 0x03d9, SQLiteCantOpenDatabaseException -> 0x03db, SQLiteAccessPermException -> 0x03dd, all -> 0x0462, TRY_ENTER, TryCatch #2 {all -> 0x0462, blocks: (B:3:0x0008, B:5:0x0014, B:8:0x003f, B:10:0x0050, B:12:0x0082, B:14:0x00bd, B:16:0x00c8, B:17:0x00da, B:18:0x00e2, B:20:0x00e8, B:23:0x0100, B:25:0x0106, B:26:0x011b, B:28:0x0121, B:29:0x0134, B:32:0x012a, B:36:0x00cd, B:37:0x013e, B:39:0x0149, B:46:0x018a, B:48:0x0192, B:49:0x0198, B:51:0x019f, B:53:0x01a5, B:54:0x01a9, B:56:0x01af, B:63:0x01bb, B:59:0x01c1, B:66:0x01c9, B:67:0x01cd, B:69:0x01d3, B:72:0x01df, B:75:0x01f1, B:83:0x020f, B:86:0x0214, B:87:0x0218, B:89:0x0219, B:105:0x028d, B:110:0x0298, B:112:0x02ac, B:114:0x02b6, B:118:0x02e0, B:121:0x02eb, B:124:0x02f9, B:125:0x02fc, B:127:0x030d, B:129:0x0313, B:131:0x0323, B:133:0x0327, B:135:0x032d, B:137:0x033d, B:141:0x0379, B:143:0x0346, B:147:0x0353, B:149:0x034b, B:153:0x036e, B:167:0x03c2, B:168:0x03c5, B:175:0x03c7, B:176:0x03ce, B:179:0x03df, B:190:0x03e8, B:193:0x03f5, B:195:0x040a, B:196:0x0417, B:181:0x0418, B:184:0x043a, B:200:0x0441, B:202:0x0458, B:203:0x0461, B:204:0x0020), top: B:2:0x0008, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
