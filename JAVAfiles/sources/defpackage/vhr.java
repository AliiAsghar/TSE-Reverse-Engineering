package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class vhr implements vhv {
    private final vhv a;

    /* JADX INFO: Access modifiers changed from: protected */
    public vhr(vhv vhvVar) {
        this.a = vhvVar;
    }

    @Override // defpackage.vhv
    public final /* synthetic */ int a() {
        return vom.l(this);
    }

    @Override // defpackage.vhv
    public Notification b() {
        throw null;
    }

    @Override // defpackage.vhv
    public final vhu c() {
        return ((vhs) this.a).b;
    }

    @Override // defpackage.vhv
    public String e() {
        return null;
    }

    public final String g() {
        NotificationChannel notificationChannel;
        wfh k;
        String id;
        vil vilVar = new vil(1);
        vhs vhsVar = (vhs) this.a;
        Optional map = vhsVar.d.map(vilVar);
        yhu yhuVar = vhsVar.a;
        String string = yhuVar.b.getString(R.string.bugle_notification_miscellaneous_channel_name);
        notificationChannel = ((NotificationManager) yhuVar.a.b()).getNotificationChannel("bugle_misc_channel");
        Object obj = null;
        if (notificationChannel != null) {
            obj = yhuVar.f(notificationChannel, string, null);
        } else {
            NotificationChannel e = yhuVar.e();
            if (e == null) {
                k = null;
            } else {
                k = yhu.k("bugle_misc_channel", string, null, e);
            }
            if (k != null) {
                obj = k.a;
                yhuVar.j(bl$$ExternalSyntheticApiModelOutline0.m(obj));
            }
        }
        NotificationChannel m = bl$$ExternalSyntheticApiModelOutline0.m(map.orElse(obj));
        if (m != null) {
            id = m.getId();
            return id;
        }
        return "";
    }

    public final String toString() {
        return String.format(Locale.US, "%s (id: %s, tag: %s)", ((vhs) this.a).c, c(), e());
    }
}
