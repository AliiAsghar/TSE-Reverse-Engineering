package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abis {
    public static zfj c;
    private static final Object d = new Object();
    protected final String a;
    protected final Object b;

    /* JADX INFO: Access modifiers changed from: protected */
    public abis(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public static void b(Context context) {
        synchronized (d) {
            if (c == null) {
                c = new zfj(context.getContentResolver());
            }
        }
    }

    public abstract Object a();
}
