package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class c {
    private static final Properties a;

    static {
        InputStream resourceAsStream;
        Properties properties = new Properties();
        a = properties;
        try {
            if (System.getSecurityManager() != null) {
                resourceAsStream = (InputStream) AccessController.doPrivileged(new atjr(d.class, 1));
            } else {
                resourceAsStream = d.class.getResourceAsStream("/android/icumessageformat/ICUConfig.properties");
            }
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            }
        } catch (IOException | MissingResourceException unused) {
        }
    }

    public static String a() {
        String str;
        if (System.getSecurityManager() != null) {
            try {
                str = (String) AccessController.doPrivileged(new b());
            } catch (AccessControlException unused) {
                str = null;
            }
        } else {
            str = System.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode");
        }
        if (str == null) {
            return a.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL");
        }
        return str;
    }
}
