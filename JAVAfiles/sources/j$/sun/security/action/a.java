package j$.sun.security.action;

import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
public final class a implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                String property = System.getProperty("file.encoding");
                if (property == null) {
                    return null;
                }
                return property;
            default:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
