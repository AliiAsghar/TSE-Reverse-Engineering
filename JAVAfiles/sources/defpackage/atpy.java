package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpy extends atqh {
    private final Method a;
    private final int b;
    private final aslv c;
    private final atox d;

    public atpy(Method method, int i, aslv aslvVar, atox atoxVar) {
        this.a = method;
        this.b = i;
        this.c = aslvVar;
        this.d = atoxVar;
    }

    @Override // defpackage.atqh
    public final void a(atql atqlVar, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            atqlVar.c(this.c, (asmk) this.d.a(obj));
        } catch (IOException e) {
            throw atqx.d(this.a, this.b, a.bX(obj, "Unable to convert ", " to RequestBody"), e);
        }
    }
}
