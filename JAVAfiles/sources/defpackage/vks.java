package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vks {
    DEFAULT_SETTINGS("_bugle_default_settings_group", R.string.notification2o_default_channel_group_name),
    CONVERSATIONS("bugle_conversations_group", R.string.notification2o_conversation_channel_group_name);

    public final String c;
    final int d;

    vks(String str, int i) {
        this.c = str;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(Context context) {
        return context.getString(this.d);
    }
}
