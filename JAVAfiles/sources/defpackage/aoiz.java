package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoiz implements Runnable {
    private static final Object c = new Object();
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final aoix b;
    private final aoip f;
    private final PowerManager.WakeLock g;
    private final long h;

    public aoiz(aoix aoixVar, Context context, aoip aoipVar, long j) {
        this.b = aoixVar;
        this.a = context;
        this.h = j;
        this.f = aoipVar;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean b() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    private static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (c) {
            Boolean bool = d;
            if (bool == null) {
                booleanValue = d(context, "android.permission.WAKE_LOCK");
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            d = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean d(Context context, String str) {
        boolean z;
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", a.bW(str, "Missing Permission: ", ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest"));
            return false;
        }
        return z;
    }

    public final synchronized boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r4 = r3.b;
        r5 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if (r5 == 83) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (r5 == 85) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r4.equals("U") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r4 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        if (r4 == 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
    
        if (defpackage.aoix.e() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        android.util.Log.d("FirebaseMessaging", defpackage.a.bX(r3, "Unknown topic operation", "."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        r1.d.c(r3);
        r4 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015c, code lost:
    
        r3 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0164, code lost:
    
        if (r1.c.containsKey(r3) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0169, code lost:
    
        r5 = (java.util.ArrayDeque) r1.c.get(r3);
        r6 = (defpackage.acit) r5.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0177, code lost:
    
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0179, code lost:
    
        r6.b(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0181, code lost:
    
        if (r5.isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0183, code lost:
    
        r1.c.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0188, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0166, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cc, code lost:
    
        r4 = r3.a;
        r5 = r1.a;
        r6 = r1.b.b();
        r7 = new android.os.Bundle();
        r7.putString("gcm.topic", "/topics/".concat(r4));
        r7.putString("delete", "1");
        defpackage.aoix.a(defpackage.aoim.b(r5.a(r6, "/topics/".concat(r4), r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0102, code lost:
    
        if (defpackage.aoix.e() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0104, code lost:
    
        android.util.Log.d("FirebaseMessaging", defpackage.a.bW(r3.a, "Unsubscribe from topic: ", " succeeded."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0114, code lost:
    
        r4 = r3.a;
        r5 = r1.a;
        r6 = r1.b.b();
        r7 = new android.os.Bundle();
        r7.putString("gcm.topic", "/topics/".concat(r4));
        defpackage.aoix.a(defpackage.aoim.b(r5.a(r6, "/topics/".concat(r4), r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0143, code lost:
    
        if (defpackage.aoix.e() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0145, code lost:
    
        android.util.Log.d("FirebaseMessaging", defpackage.a.bW(r3.a, "Subscribe to topic: ", " succeeded."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00b2, code lost:
    
        r4 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ae, code lost:
    
        if (r4.equals("S") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b0, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0199, code lost:
    
        if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ac, code lost:
    
        if (r1.getMessage() == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ae, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d6, code lost:
    
        r10.b.d(r10.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b6, code lost:
    
        throw r1;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoiz.run():void");
    }
}
