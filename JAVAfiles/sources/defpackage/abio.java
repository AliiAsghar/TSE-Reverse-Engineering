package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abio {
    private static volatile abio b;
    public final Context a;

    private abio(Context context) {
        this.a = context;
    }

    public static abio a() {
        abio abioVar = b;
        if (abioVar != null) {
            return abioVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (b == null) {
            synchronized (abio.class) {
                if (b == null) {
                    b = new abio(context);
                }
            }
        }
    }

    public final abil c() {
        return new abin(this.a);
    }
}
