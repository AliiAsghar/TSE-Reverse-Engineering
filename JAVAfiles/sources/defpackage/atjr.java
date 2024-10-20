package defpackage;

import java.security.PrivilegedAction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjr implements PrivilegedAction {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public atjr(atjs atjsVar, String str, int i) {
        this.c = i;
        this.a = str;
        this.b = atjsVar;
    }

    @Override // java.security.PrivilegedAction
    public final /* synthetic */ Object run() {
        if (this.c != 0) {
            return ((Class) this.a).getResourceAsStream((String) this.b);
        }
        ClassLoader classLoader = ((atjs) this.b).a;
        if (classLoader != null) {
            return classLoader.getResourceAsStream((String) this.a);
        }
        return ClassLoader.getSystemResourceAsStream((String) this.a);
    }

    public atjr(Class cls, int i) {
        this.c = i;
        this.a = cls;
        this.b = "/android/icumessageformat/ICUConfig.properties";
    }
}
