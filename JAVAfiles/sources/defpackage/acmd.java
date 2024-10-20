package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmd {
    public static final acmk a;

    static {
        Uri uri = acme.a;
        a = acmf.a();
    }

    public static int a(ContentResolver contentResolver, String str, int i) {
        Object obj;
        Integer num;
        acmk acmkVar = a;
        acmk.e(contentResolver);
        synchronized (acmkVar) {
            acmkVar.c(contentResolver);
            obj = acmkVar.f;
            num = (Integer) acmk.f(acmkVar.c, str, Integer.valueOf(i));
        }
        if (num != null) {
            return num.intValue();
        }
        String a2 = acmkVar.a(contentResolver, str, null);
        if (a2 != null) {
            try {
                int parseInt = Integer.parseInt(a2);
                num = Integer.valueOf(parseInt);
                i = parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (acmkVar) {
            acmkVar.d(obj, acmkVar.c, str, num);
        }
        return i;
    }

    public static long b(ContentResolver contentResolver, String str, long j) {
        Object obj;
        Long l;
        acmk acmkVar = a;
        acmk.e(contentResolver);
        synchronized (acmkVar) {
            acmkVar.c(contentResolver);
            obj = acmkVar.f;
            l = (Long) acmk.f(acmkVar.d, str, Long.valueOf(j));
        }
        if (l != null) {
            return l.longValue();
        }
        String a2 = acmkVar.a(contentResolver, str, null);
        if (a2 != null) {
            try {
                long parseLong = Long.parseLong(a2);
                l = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (acmkVar) {
            acmkVar.d(obj, acmkVar.d, str, l);
        }
        return j;
    }

    public static String c(ContentResolver contentResolver, String str, String str2) {
        return a.a(contentResolver, str, str2);
    }

    public static Map d(ContentResolver contentResolver, String... strArr) {
        try {
            actx actxVar = a.i;
            return actx.l(contentResolver, strArr, new acmg(0));
        } catch (acmj unused) {
            return new TreeMap();
        }
    }

    public static boolean e(ContentResolver contentResolver, String str, boolean z) {
        Object obj;
        Boolean bool;
        acmk acmkVar = a;
        acmk.e(contentResolver);
        synchronized (acmkVar) {
            acmkVar.c(contentResolver);
            obj = acmkVar.f;
            bool = (Boolean) acmk.f(acmkVar.b, str, Boolean.valueOf(z));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = acmkVar.a(contentResolver, str, null);
        if (a2 != null && !a2.isEmpty()) {
            if (acme.c.matcher(a2).matches()) {
                z = true;
                bool = true;
            } else if (acme.d.matcher(a2).matches()) {
                z = false;
                bool = false;
            } else {
                Log.w("Gservices", a.bZ(a2, str, "attempt to read Gservices key ", " (value \"", "\") as boolean"));
            }
        }
        synchronized (acmkVar) {
            acmkVar.d(obj, acmkVar.b, str, bool);
        }
        return z;
    }
}
