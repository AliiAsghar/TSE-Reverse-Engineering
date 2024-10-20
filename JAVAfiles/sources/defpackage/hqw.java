package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqw {
    public final Context a;
    public final ActivityManager b;
    public float c;
    public final hgi d;

    public hqw(Context context) {
        this.c = 1.0f;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.d = new hgi(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.c = brg.a;
        }
    }
}
