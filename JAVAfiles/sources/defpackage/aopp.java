package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aopp extends aopr {
    final /* synthetic */ Method a;

    public aopp(Method method) {
        this.a = method;
    }

    @Override // defpackage.aopr
    public final Object a(Class cls) {
        aopr.b(cls);
        return this.a.invoke(null, cls, Object.class);
    }
}
