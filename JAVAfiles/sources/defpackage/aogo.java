package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aogo implements aogr, aogs {
    public final aohf a;
    public final aohf b;
    private final Context c;
    private final Set d;
    private final Executor e;

    public aogo(Context context, String str, Set set, aohf aohfVar, Executor executor) {
        this.a = new aoer(context, str, 2);
        this.d = set;
        this.e = executor;
        this.b = aohfVar;
        this.c = context;
    }

    @Override // defpackage.aogr
    public final acir a() {
        if (!dzh.b(this.c)) {
            return actx.s("");
        }
        return actx.q(this.e, new aidu(this, 19));
    }

    @Override // defpackage.aogs
    public final synchronized int b() {
        aohf aohfVar = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        Object a = aohfVar.a();
        if (((aojh) a).v(currentTimeMillis)) {
            ((aojh) a).r();
            return 3;
        }
        return 1;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            actx.s(null);
        } else if (!dzh.b(this.c)) {
            actx.s(null);
        } else {
            actx.q(this.e, new aidu(this, 20));
        }
    }
}
