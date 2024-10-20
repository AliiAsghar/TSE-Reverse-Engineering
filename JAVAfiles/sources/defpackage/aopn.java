package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aopn extends aopr {
    final /* synthetic */ Method a;
    final /* synthetic */ Object b;

    public aopn(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // defpackage.aopr
    public final Object a(Class cls) {
        aopr.b(cls);
        return this.a.invoke(this.b, cls);
    }
}
