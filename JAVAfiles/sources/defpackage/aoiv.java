package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoiv implements Runnable {
    public final FirebaseMessaging a;
    final ExecutorService b = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new aglj("firebase-iid-executor", 1));
    private final long c;
    private final PowerManager.WakeLock d;

    public aoiv(FirebaseMessaging firebaseMessaging, long j) {
        this.a = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context a() {
        return this.a.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (aois.a().c(a())) {
            this.d.acquire();
        }
        try {
            try {
                boolean z = true;
                this.a.e(true);
                if (!this.a.g.e()) {
                    this.a.e(false);
                } else {
                    aois a = aois.a();
                    Context a2 = a();
                    if (a.b == null) {
                        if (a2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                            z = false;
                        }
                        a.b = Boolean.valueOf(z);
                    }
                    if (!a.a.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                    }
                    if (a.b.booleanValue() && !c()) {
                        aoiu aoiuVar = new aoiu(this);
                        if (b()) {
                            Log.d("FirebaseMessaging", "Connectivity change received registered");
                        }
                        aoiuVar.a.a().registerReceiver(aoiuVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    } else {
                        try {
                        } catch (IOException e) {
                            String message = e.getMessage();
                            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                                if (e.getMessage() == null) {
                                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                        } catch (SecurityException unused) {
                            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                        }
                        if (this.a.b() == null) {
                            Log.e("FirebaseMessaging", "Token retrieval failed: null");
                            this.a.g(this.c);
                        } else {
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Token successfully retrieved");
                            }
                            this.a.e(false);
                        }
                    }
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.e(false);
            }
        } finally {
            if (aois.a().c(a())) {
                this.d.release();
            }
        }
    }
}
