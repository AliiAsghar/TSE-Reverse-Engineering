package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhw {
    private final Context a;
    private final ykw b;

    static {
        alwo.o("BugleNotifications");
        uuh.r(162850086, "enable_bugle_audio_player_for_notification");
    }

    public yhw(Context context, ykw ykwVar) {
        new AtomicLong(0L);
        this.a = context;
        this.b = ykwVar;
    }

    public final Uri a(String str) {
        if (str == null) {
            str = this.b.f(this.a.getString(R.string.notification_sound_pref_key), null);
        }
        if (!TextUtils.isEmpty(str)) {
            return Uri.parse(str);
        }
        if (str != null) {
            return null;
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }
}
