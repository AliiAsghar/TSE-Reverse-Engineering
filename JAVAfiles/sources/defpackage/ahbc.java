package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbc implements aguc {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/systemproperty/SystemProperties");
    public static final ahbc b = new ahbc();
    public final tm c = new tm();
    public final Method d;

    private ahbc() {
        Method method;
        try {
            method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
        } catch (Exception e) {
            ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/inputmethod/systemproperty/SystemProperties", "<init>", '9', "SystemProperties.java")).q("Cannot find android.os.SystemProperties#get(String)");
            method = null;
        }
        this.d = method;
        agub.a.a(this);
    }
}
