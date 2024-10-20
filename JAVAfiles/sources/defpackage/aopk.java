package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aopk extends aopm {
    final /* synthetic */ Method a;

    public aopk(Method method) {
        this.a = method;
    }

    @Override // defpackage.aopm
    public final boolean a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.a.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
