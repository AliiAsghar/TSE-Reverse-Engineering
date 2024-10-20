package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvn {
    private static final abvn a = new abvn();
    private zfm b = null;

    public static zfm b(Context context) {
        return a.a(context);
    }

    public final synchronized zfm a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new zfm((Object) context, (byte[]) null);
        }
        return this.b;
    }
}
