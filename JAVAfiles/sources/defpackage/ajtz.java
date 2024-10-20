package defpackage;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajtz extends IntentService {
    public static final alvi a = alvi.m("com/google/android/search/verification/client/SearchActionVerificationClientService");
    public final boolean b;
    private final long c;
    private final Intent d;
    private final Intent e;
    private ajty f;
    private ajty g;

    public ajtz() {
        super("SearchActionVerificationClientService");
        this.d = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.e = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.b = e();
        this.c = 1000L;
    }

    private final boolean b(String str) {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                if (packageInfo.applicationInfo.enabled) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            alvw i = a.i();
            i.X(alwp.a, "SAVerificationClientS");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "isPackageInstalled", 197, "SearchActionVerificationClientService.java")).t("Couldn't find package name %s", str);
            return false;
        }
    }

    private final boolean c(String str) {
        if (!b(str)) {
            return false;
        }
        if (!e() && !ajua.a(this, str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean d(java.lang.String r19, android.content.Intent r20, defpackage.ajty r21) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtz.d(java.lang.String, android.content.Intent, ajty):boolean");
    }

    private static final boolean e() {
        if (!"user".equals(Build.TYPE)) {
            return true;
        }
        return false;
    }

    public abstract void a(Intent intent, boolean z);

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (this.b) {
            alvw d = a.d();
            d.X(alwp.a, "SAVerificationClientS");
            ((alvg) ((alvg) d).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onCreate", 323, "SearchActionVerificationClientService.java")).q("onCreate");
        }
        super.onCreate();
        this.f = new ajty(this);
        if (c("com.google.android.googlequicksearchbox")) {
            bindService(this.d, this.f, 1);
        }
        this.g = new ajty(this);
        if (c("com.google.android.apps.assistant")) {
            bindService(this.e, this.g, 1);
        }
        NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(R.string.google_assistant_verification_channel_name), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        dyu dyuVar = new dyu(getApplicationContext(), "Assistant_verifier");
        dyuVar.u = "Assistant_verifier";
        dyuVar.i(getApplicationContext().getResources().getString(R.string.google_assistant_verification_notification_title));
        dyuVar.q(android.R.drawable.ic_dialog_email);
        dyuVar.l = -2;
        dyuVar.D = 1;
        startForeground(10000, dyuVar.a());
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        if (this.b) {
            alvw d = a.d();
            d.X(alwp.a, "SAVerificationClientS");
            ((alvg) ((alvg) d).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onDestroy", 350, "SearchActionVerificationClientService.java")).q("onDestroy");
        }
        super.onDestroy();
        if (this.f.a()) {
            unbindService(this.f);
        }
        if (this.g.a()) {
            unbindService(this.g);
        }
        stopForeground(true);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        boolean z;
        if (intent == null) {
            if (this.b) {
                alvw d = a.d();
                d.X(alwp.a, "SAVerificationClientS");
                ((alvg) ((alvg) d).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 282, "SearchActionVerificationClientService.java")).q("Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean b = b("com.google.android.googlequicksearchbox");
            boolean z2 = true;
            if (b && !this.f.a()) {
                z = false;
            } else {
                z = true;
            }
            if (this.b) {
                alvw d2 = a.d();
                d2.X(alwp.a, "SAVerificationClientS");
                ((alvg) ((alvg) d2).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "installedServicesConnected", 171, "SearchActionVerificationClientService.java")).J("GSA app %s installed: %b connected %b", "com.google.android.googlequicksearchbox", Boolean.valueOf(b), Boolean.valueOf(this.f.a()));
            }
            boolean b2 = b("com.google.android.apps.assistant");
            if (b2 && !this.g.a()) {
                z2 = false;
            }
            if (this.b) {
                alvw d3 = a.d();
                d3.X(alwp.a, "SAVerificationClientS");
                ((alvg) ((alvg) d3).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "installedServicesConnected", 182, "SearchActionVerificationClientService.java")).J("AssistantGo app %s installed: %b connected %b", "com.google.android.apps.assistant", Boolean.valueOf(b2), Boolean.valueOf(this.g.a()));
            }
            if ((!z || !z2) && System.nanoTime() - nanoTime < this.c * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    if (this.b) {
                        alvw d4 = a.d();
                        d4.X(alwp.a, "SAVerificationClientS");
                        ((alvg) ((alvg) ((alvg) d4).g(e)).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", (char) 294, "SearchActionVerificationClientService.java")).q("Unexpected InterruptedException");
                    }
                }
            }
        }
        if (d("com.google.android.googlequicksearchbox", intent, this.f)) {
            alvw g = a.g();
            g.X(alwp.a, "SAVerificationClientS");
            ((alvg) ((alvg) g).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 305, "SearchActionVerificationClientService.java")).q("Verified the intent with GSA.");
            return;
        }
        alvi alviVar = a;
        alvw g2 = alviVar.g();
        g2.X(alwp.a, "SAVerificationClientS");
        ((alvg) ((alvg) g2).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 308, "SearchActionVerificationClientService.java")).q("Unable to verify the intent with GSA.");
        if (d("com.google.android.apps.assistant", intent, this.g)) {
            alvw g3 = alviVar.g();
            g3.X(alwp.a, "SAVerificationClientS");
            ((alvg) ((alvg) g3).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 313, "SearchActionVerificationClientService.java")).q("Verified the intent with Assistant Go.");
        } else {
            alvw g4 = alviVar.g();
            g4.X(alwp.a, "SAVerificationClientS");
            ((alvg) ((alvg) g4).h("com/google/android/search/verification/client/SearchActionVerificationClientService", "onHandleIntent", 315, "SearchActionVerificationClientService.java")).q("Unable to verify the intent with Assistant Go.");
        }
    }
}
