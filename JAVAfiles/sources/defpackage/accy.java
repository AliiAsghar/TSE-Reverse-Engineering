package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accy {
    public static final int a;

    static {
        int i;
        if (true != d.r()) {
            i = 0;
        } else {
            i = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        a = i;
    }

    public static PendingIntent a(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }

    public static PendingIntent b(Context context, Intent intent, int i) {
        return PendingIntent.getBroadcast(context, 0, intent, i);
    }
}
