package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpx extends atqh {
    private final Method a;
    private final int b;

    public atpx(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.atqh
    public final /* bridge */ /* synthetic */ void a(atql atqlVar, Object obj) {
        aslv aslvVar = (aslv) obj;
        if (aslvVar != null) {
            asuo asuoVar = atqlVar.m;
            int a = aslvVar.a();
            for (int i = 0; i < a; i++) {
                asuoVar.j(aslvVar.c(i), aslvVar.d(i));
            }
            return;
        }
        throw atqx.d(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
    }
}
