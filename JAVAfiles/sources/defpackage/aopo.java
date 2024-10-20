package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aopo extends aopr {
    final /* synthetic */ Method a;
    final /* synthetic */ int b;

    public aopo(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.aopr
    public final Object a(Class cls) {
        aopr.b(cls);
        return this.a.invoke(null, cls, Integer.valueOf(this.b));
    }
}
