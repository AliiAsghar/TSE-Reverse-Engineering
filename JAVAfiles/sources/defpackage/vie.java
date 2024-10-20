package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vie implements vin {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vie(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [apwt, java.lang.Object] */
    @Override // defpackage.vin
    public final NotificationChannel a() {
        NotificationChannel notificationChannel;
        Object obj;
        Object obj2;
        CharSequence name;
        NotificationChannel notificationChannel2;
        String group;
        CharSequence name2;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return ((yhu) ((yyt) this.a).a).d();
                    }
                    yhu yhuVar = (yhu) this.a;
                    String string = yhuVar.b.getResources().getString(R.string.rcs_not_delivered_notification_channel_name);
                    notificationChannel2 = ((NotificationManager) yhuVar.a.b()).getNotificationChannel("bugle_rcs_not_delivered_channel");
                    if (notificationChannel2 != null) {
                        group = notificationChannel2.getGroup();
                        if (group != null) {
                            name2 = notificationChannel2.getName();
                            if (TextUtils.equals(name2, string)) {
                                return notificationChannel2;
                            }
                        }
                    }
                    wfh wfhVar = new wfh("bugle_rcs_not_delivered_channel", string, 3);
                    wfhVar.J(yht.DEFAULT_SETTINGS.e);
                    Object obj3 = wfhVar.a;
                    yhuVar.j(bl$$ExternalSyntheticApiModelOutline0.m(obj3));
                    return bl$$ExternalSyntheticApiModelOutline0.m(obj3);
                }
                return ((yhu) ((vif) this.a).f.b()).b();
            }
            yhu yhuVar2 = (yhu) ((wyp) this.a).g;
            if (yhuVar2.i()) {
                notificationChannel = ((NotificationManager) yhuVar2.a.b()).getNotificationChannel("bugle_auto_moved_spam_channel");
                String string2 = yhuVar2.b.getString(R.string.automoved_spam_notification_channel_name);
                if (notificationChannel != null) {
                    name = notificationChannel.getName();
                    obj = notificationChannel;
                    if (!TextUtils.equals(name, string2)) {
                        notificationChannel.setName(string2);
                        obj = notificationChannel;
                    }
                } else {
                    wfh wfhVar2 = new wfh("bugle_auto_moved_spam_channel", string2, 2);
                    wfhVar2.I(false);
                    wfhVar2.H(false);
                    bl$$ExternalSyntheticApiModelOutline0.m(wfhVar2.a).setShowBadge(false);
                    Object obj4 = wfhVar2.a;
                    yhuVar2.j(bl$$ExternalSyntheticApiModelOutline0.m(obj4));
                    obj = obj4;
                }
                obj2 = obj;
            } else {
                obj2 = null;
            }
            return bl$$ExternalSyntheticApiModelOutline0.m(obj2);
        }
        return ((yhu) ((yyt) this.a).c.b()).b();
    }
}
