package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipr {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        albo.T(true);
        return PendingIntent.getActivity(context, i, intent, i2 | VCardConfig.FLAG_APPEND_TYPE_PARAM);
    }

    public static PendingIntent b(Context context, int i, Intent intent, int i2) {
        return c(context, i, intent, i2, 0);
    }

    public static PendingIntent c(Context context, int i, Intent intent, int i2, int i3) {
        return PendingIntent.getBroadcast(context, i, d(intent, i2, i3), i2);
    }

    public static Intent d(Intent intent, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if ((i & 88) == 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Cannot set any dangerous parts of intent to be mutable.");
        if ((i & 1) != 0 && !f(i2, 3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        d.t(z2, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        if ((i & 2) != 0 && !f(i2, 5)) {
            z3 = false;
        } else {
            z3 = true;
        }
        d.t(z3, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        if ((i & 4) != 0 && !f(i2, 9)) {
            z4 = false;
        } else {
            z4 = true;
        }
        d.t(z4, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        if ((i & 128) != 0 && !f(i2, 17)) {
            z5 = false;
        } else {
            z5 = true;
        }
        d.t(z5, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        if (intent.getComponent() != null) {
            z6 = true;
        }
        d.t(z6, "Must set component on Intent.");
        if (f(i2, 1)) {
            d.t(!f(i, VCardConfig.FLAG_APPEND_TYPE_PARAM), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            d.t(f(i, VCardConfig.FLAG_APPEND_TYPE_PARAM), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!f(i, VCardConfig.FLAG_APPEND_TYPE_PARAM)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!f(i2, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!f(i2, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!f(i2, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!f(i2, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    public static PendingIntent e(Context context, Intent intent) {
        return PendingIntent.getService(context, 0, d(intent, 1140850688, 0), 1140850688);
    }

    private static boolean f(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}
