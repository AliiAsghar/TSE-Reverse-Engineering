package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsPackageChangedReceiver;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import com.google.android.apps.messaging.shared.receiver.SmsReceiver;
import com.google.android.apps.messaging.shared.receiver.SmsRejectedReceiver;
import com.google.android.apps.messaging.shared.receiver.TelephonyChangeReceiver;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wlb {
    private static final xze a = xze.g("Bugle", "AppConfigUpdater");
    private final Context b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;

    public wlb(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.b = context;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
    }

    public final void a() {
        Context context = this.b;
        boolean g = yhx.g(context);
        PackageManager packageManager = context.getPackageManager();
        if (g) {
            a.p("Enabling SMS message receiving");
            packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) SmsReceiver.class), 1, 1);
        } else {
            a.p("Disabling SMS message receiving");
            packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) SmsReceiver.class), 2, 1);
        }
        xze xzeVar = a;
        xzeVar.p("Enabling Telephony change receiving");
        packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) TelephonyChangeReceiver.class), 1, 1);
        xzeVar.p("Enabling Default SMS package change receiving");
        packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) DefaultSmsPackageChangedReceiver.class), 1, 1);
        xyo d = xzeVar.d();
        d.H("Manufacturer:");
        d.H(Build.MANUFACTURER);
        d.q();
        if (((Optional) ((apxx) this.c).a).isEmpty()) {
            xyo d2 = xzeVar.d();
            d2.H("Enabling RestoreReceiver.");
            d2.z("manufacturer", Build.MANUFACTURER);
            d2.q();
            packageManager.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) RestoreReceiver.class), 1, 1);
        }
        if (this.d.b() != null) {
            yep yepVar = (yep) this.d.b();
            wnm wnmVar = (wnm) this.e.b();
            wnmVar.getClass();
            yepVar.g(new uql(wnmVar, 14));
        } else {
            xyo b = xzeVar.b();
            b.H("updateSmsReceiveHandler: bugleGservices is null!");
            b.r(new Exception());
        }
        if (!((Optional) ((apxx) this.c).a).isPresent()) {
            PackageManager packageManager2 = this.b.getPackageManager();
            if (((Boolean) SmsRejectedReceiver.a.e()).booleanValue() && !yhx.g(this.b)) {
                xzeVar.p("Enabling SMS rejected receiver");
                packageManager2.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) SmsRejectedReceiver.class), 1, 1);
            } else {
                xzeVar.p("Disabling SMS rejected receiver");
                packageManager2.setComponentEnabledSetting(new ComponentName(this.b, (Class<?>) SmsRejectedReceiver.class), 2, 1);
            }
        }
        yhe yheVar = (yhe) this.f.b();
        if (yheVar.c.isPresent()) {
            return;
        }
        PackageManager packageManager3 = yheVar.b.getPackageManager();
        alvw f = yhe.a.f();
        f.X(alwp.a, "BugleTranscoding");
        boolean R = ((alvg) f).R();
        if (yheVar.d.L()) {
            if (R) {
                alvw f2 = yhe.a.f();
                f2.X(alwp.a, "BugleTranscoding");
                ((alvg) ((alvg) f2).h("com/google/android/apps/messaging/shared/util/media/video/VideoSharingActivityUtil", "updateVideoSharingActivity", 47, "VideoSharingActivityUtil.java")).q("Enabling Video Sharing Activity");
            }
            packageManager3.setComponentEnabledSetting(new ComponentName(yheVar.b, "com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity"), 1, 1);
            return;
        }
        if (R) {
            alvw f3 = yhe.a.f();
            f3.X(alwp.a, "BugleTranscoding");
            ((alvg) ((alvg) f3).h("com/google/android/apps/messaging/shared/util/media/video/VideoSharingActivityUtil", "updateVideoSharingActivity", 56, "VideoSharingActivityUtil.java")).q("Disabling Video Sharing Activity");
        }
        packageManager3.setComponentEnabledSetting(new ComponentName(yheVar.b, "com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity"), 2, 1);
    }
}
