package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atdd implements PrivilegedAction {
    final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public atdd(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return System.getProperty(this.a);
            }
            try {
                return ClassLoader.getSystemClassLoader().loadClass(this.a);
            } catch (Exception unused) {
                return null;
            }
        }
        return Security.getProperty(this.a);
    }
}
