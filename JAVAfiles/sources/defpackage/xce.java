package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xce {
    public static final alhr a = uuh.y("split_external_intents");
    private final Context b;

    public xce(Context context) {
        this.b = context;
    }

    public final boolean a() {
        if (((Boolean) ((utz) a.get()).e()).booleanValue() && this.b.getResources().getBoolean(R.bool.is_large_window_size_class_width)) {
            return true;
        }
        return false;
    }
}
