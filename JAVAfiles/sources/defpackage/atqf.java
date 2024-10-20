package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqf extends atqh {
    private final Method a;
    private final int b;

    public atqf(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.atqh
    public final void a(atql atqlVar, Object obj) {
        if (obj != null) {
            atqlVar.e = obj.toString();
            return;
        }
        throw atqx.d(this.a, this.b, "@Url parameter is null.", new Object[0]);
    }
}
