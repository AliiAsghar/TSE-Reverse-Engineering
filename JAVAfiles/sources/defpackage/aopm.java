package defpackage;

import java.lang.reflect.AccessibleObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aopm {
    public static final aopm b;

    static {
        aopm aopmVar = null;
        if (aopa.a()) {
            try {
                aopmVar = new aopk(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (aopmVar == null) {
            aopmVar = new aopl();
        }
        b = aopmVar;
    }

    public abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
