package org.bouncycastle.asn1;

import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LocaleUtil {
    public static Locale a;

    static {
        Locale locale;
        new HashMap();
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            locale = Locale.getDefault();
        } else {
            Locale[] availableLocales = Locale.getAvailableLocales();
            int i = 0;
            while (true) {
                if (i != availableLocales.length) {
                    if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                        locale = availableLocales[i];
                        break;
                    }
                    i++;
                } else {
                    locale = Locale.getDefault();
                    break;
                }
            }
        }
        a = locale;
    }
}
