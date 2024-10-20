package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum yht {
    DEFAULT_SETTINGS("_bugle_default_settings_group", R.string.bugle_notification_category_default_settings),
    CONVERSATIONS("bugle_conversations_group", R.string.bugle_notification_category_conversations),
    WEB_SETTINGS("bugle_web_group", R.string.bugle_notification_category_web),
    REMINDERS("bugle_reminders_group", R.string.bugle_notification_category_reminders);

    public final String e;
    final int f;

    yht(String str, int i) {
        this.e = str;
        this.f = i;
    }
}
