package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyw {
    public static final utz a = uuh.n(uuh.b, "enable_simplified_messaging_v2_api", false);
    static final utz b = uuh.n(uuh.b, "enable_simplified_messaging_notification_v2_api", false);
    private final Context c;

    public vyw(Context context) {
        this.c = context;
    }

    public final boolean a() {
        if (((Boolean) a.e()).booleanValue() && !adwi.k(this.c)) {
            return true;
        }
        return false;
    }
}
