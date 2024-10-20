package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
final class xui {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(Context context, long j) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) * ((float) j);
    }
}
