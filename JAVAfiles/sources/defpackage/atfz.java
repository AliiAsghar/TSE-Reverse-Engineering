package defpackage;

import j$.util.DesugarCollections;
import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atfz {
    public static volatile Map a;
    private static final atow b;
    private static volatile atow c;

    static {
        atow atowVar = new atow((byte[]) null);
        b = atowVar;
        c = atowVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", atgc.a);
        linkedHashMap.put("UTC", atgc.a);
        linkedHashMap.put("GMT", atgc.a);
        d(linkedHashMap, "EST", "America/New_York");
        d(linkedHashMap, "EDT", "America/New_York");
        d(linkedHashMap, "CST", "America/Chicago");
        d(linkedHashMap, "CDT", "America/Chicago");
        d(linkedHashMap, "MST", "America/Denver");
        d(linkedHashMap, "MDT", "America/Denver");
        d(linkedHashMap, "PST", "America/Los_Angeles");
        d(linkedHashMap, "PDT", "America/Los_Angeles");
        a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final DateFormatSymbols b(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final atfu c(atfu atfuVar) {
        if (atfuVar == null) {
            return athk.N();
        }
        return atfuVar;
    }

    private static void d(Map map, String str, String str2) {
        try {
            map.put(str, atgc.i(str2));
        } catch (RuntimeException unused) {
        }
    }
}
