package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jaf extends jah implements wnr {
    public static final xze a = xze.g("Bugle", "DefaultSimChangeReceiver");
    public armf b;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.b.b()).b("DefaultSimChangeReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        a.o("Default SIM was changed");
        if (context != null) {
            qop.b(context, ruy.a, null);
        }
    }
}
