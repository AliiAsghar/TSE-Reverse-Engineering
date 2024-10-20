package defpackage;

import android.content.ContentValues;
import android.os.Process;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiep {
    public static String a;
    public static Boolean b;
    private static String c;
    private static Boolean d;

    private aiep() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r6) {
        /*
            java.lang.String r0 = "CurrentProcess"
            java.lang.String r1 = defpackage.aiep.c
            if (r1 == 0) goto L7
            return r1
        L7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L14
            java.lang.String r6 = defpackage.cok$$ExternalSyntheticApiModelOutline0.m144m()
            defpackage.aiep.c = r6
            return r6
        L14:
            java.lang.String r1 = "robolectric"
            java.lang.String r2 = android.os.Build.FINGERPRINT
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 != 0) goto L8e
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<aiep> r3 = defpackage.aiep.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L41
            r4 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r4, r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "currentProcessName"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r2)     // Catch: java.lang.Throwable -> L41
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r1 = r1.invoke(r2, r2)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L47
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L41
            goto L48
        L41:
            r1 = move-exception
            java.lang.String r3 = "Unable to check ActivityThread"
            android.util.Log.d(r0, r3, r1)
        L47:
            r1 = r2
        L48:
            defpackage.aiep.c = r1
            if (r1 != 0) goto L8d
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r5 = "/proc/self/cmdline"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r5 = 50
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L6d
            r3.close()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            android.os.StrictMode.setThreadPolicy(r1)
            goto L83
        L6d:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
        L76:
            throw r4     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
        L77:
            r6 = move-exception
            goto L89
        L79:
            r3 = move-exception
            java.lang.String r4 = "Unable to read /proc/self/cmdline"
            android.util.Log.e(r0, r4, r3)     // Catch: java.lang.Throwable -> L77
            android.os.StrictMode.setThreadPolicy(r1)
            r4 = r2
        L83:
            defpackage.aiep.c = r4
            if (r4 != 0) goto L88
            goto L8e
        L88:
            return r4
        L89:
            android.os.StrictMode.setThreadPolicy(r1)
            throw r6
        L8d:
            return r1
        L8e:
            java.lang.String r0 = "activity"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto Lb6
            int r0 = android.os.Process.myPid()
            java.util.Iterator r6 = r6.iterator()
        La4:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r3 = r1.pid
            if (r3 != r0) goto La4
            java.lang.String r2 = r1.processName
        Lb6:
            defpackage.aiep.c = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiep.a(android.content.Context):java.lang.String");
    }

    public static boolean b() {
        boolean isApplicationUid;
        if (d == null) {
            isApplicationUid = Process.isApplicationUid(Process.myUid());
            d = Boolean.valueOf(isApplicationUid);
        }
        return d.booleanValue();
    }

    public static final int c(alek alekVar, Instant instant) {
        long epochDay;
        int aT = a.aT(alekVar.e);
        if (aT == 0) {
            aT = 1;
        }
        int i = aT - 2;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    epochDay = instant.atZone(ZoneId.of(alekVar.f)).b().toEpochDay();
                } else {
                    throw new AssertionError("Invalid TimeZonePolicy");
                }
            } else {
                epochDay = instant.atZone(ZoneId.systemDefault()).b().toEpochDay();
            }
            return (int) epochDay;
        }
        return d(instant);
    }

    public static final int d(Instant instant) {
        return (int) instant.atZone(ZoneOffset.UTC).b().toEpochDay();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(aidj aidjVar, alek alekVar) {
        int i = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < aidjVar.a.size(); i3++) {
            Integer num = (Integer) aidjVar.a.get(i3);
            int intValue = num.intValue();
            alei aleiVar = (alei) alekVar.d.get(i3);
            int i4 = aleiVar.c;
            if (i4 != 0) {
                if (intValue > i4) {
                    throw new aief(String.format("event_code %s is larger than max_event_code %s", num, Integer.valueOf(aleiVar.c)));
                }
            } else {
                alob alobVar = new alob();
                also alsoVar = also.a;
                Object[] aU = alzz.aU(DesugarCollections.unmodifiableMap(aleiVar.b).keySet());
                Arrays.sort(aU, alsoVar);
                for (Integer num2 : alzz.an(Arrays.asList(aU))) {
                    num2.intValue();
                    alobVar.h(num2);
                }
                alog g = alobVar.g();
                for (int i5 = 0; i5 < ((alsx) g).c; i5++) {
                    if (intValue == ((Integer) g.get(i5)).intValue()) {
                        intValue = i5;
                    }
                }
                throw new aief(String.format("event_code %s was not found in the dimension's event codes", num));
            }
            i += intValue * i2;
            i2 *= k(aleiVar);
        }
        return i;
    }

    public static int f(List list) {
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i *= k((alei) it.next());
        }
        return i;
    }

    public static ContentValues g(aidn aidnVar, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("customer_id", Long.valueOf(aidnVar.a));
        contentValues.put("project_id", Long.valueOf(aidnVar.b));
        contentValues.put("metric_id", Long.valueOf(aidnVar.c));
        contentValues.put("report_id", Long.valueOf(aidnVar.d));
        contentValues.put("last_sent_day_index", Integer.valueOf(i));
        return contentValues;
    }

    public static ContentValues h(aiei aieiVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("observation_batch", aieiVar.toByteArray());
        return contentValues;
    }

    public static aozb i(SecureRandom secureRandom) {
        byte[] bArr = new byte[8];
        secureRandom.nextBytes(bArr);
        return aozb.w(bArr);
    }

    public static agrk j(aidn aidnVar, int i) {
        agrk agrkVar = new agrk((short[]) null);
        agrkVar.x("UPDATE Reports SET last_sent_day_index = ? ");
        agrkVar.y(Long.valueOf(i));
        agrkVar.x(" WHERE ");
        agrkVar.x("customer_id = ?");
        agrkVar.y(Long.valueOf(aidnVar.a));
        agrkVar.x(" AND project_id = ?");
        agrkVar.y(Long.valueOf(aidnVar.b));
        agrkVar.x(" AND metric_id = ?");
        agrkVar.y(Long.valueOf(aidnVar.c));
        agrkVar.x(" AND report_id = ?");
        agrkVar.y(Long.valueOf(aidnVar.d));
        return agrkVar.J();
    }

    private static int k(alei aleiVar) {
        int i = aleiVar.c;
        if (i != 0) {
            return i + 1;
        }
        return aleiVar.b.size();
    }
}
