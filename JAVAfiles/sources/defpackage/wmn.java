package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class wmn extends wlt {
    public static final xze a = xze.g("Bugle", "SimChangeReceiver");
    public armf b;
    public armf c;
    public armf d;
    public armf e;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.d.b()).b("SimChangeReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        String action = intent.getAction();
        xyo c = a.c();
        c.H("action:");
        c.H(action);
        c.q();
        qjb.a(new vri((Object) this, (Object) context, (Object) action, 5, (short[]) null), (Executor) this.c.b());
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }
}
