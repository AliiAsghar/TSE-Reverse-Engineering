package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqp {
    private static final Uri a = Uri.parse("content://com.google.android.apps.messaging.shared.datamodel.BugleContentProvider");
    private static final List b = new ArrayList();

    public static boolean a(Context context, String str) {
        List list = b;
        if (!list.isEmpty()) {
            return list.contains(str);
        }
        try {
            Bundle call = context.getContentResolver().call(a, "is_blocked", str, (Bundle) null);
            if (call != null) {
                if (call.getBoolean("blocked", false)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
