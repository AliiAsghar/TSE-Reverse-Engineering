package j$.util;

import java.security.AccessController;

/* loaded from: classes5.dex */
abstract class w0 {
    static final boolean a = ((Boolean) AccessController.doPrivileged(new j$.sun.security.action.a(1))).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
