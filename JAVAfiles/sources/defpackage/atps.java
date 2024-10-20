package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atps extends atqh {
    private final Method a;
    private final int b;
    private final atox c;

    public atps(Method method, int i, atox atoxVar) {
        this.a = method;
        this.b = i;
        this.c = atoxVar;
    }

    @Override // defpackage.atqh
    public final void a(atql atqlVar, Object obj) {
        if (obj != null) {
            try {
                atqlVar.k = (asmk) this.c.a(obj);
                return;
            } catch (IOException e) {
                throw atqx.e(this.a, e, this.b, a.bX(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
            }
        }
        throw atqx.d(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
    }
}
