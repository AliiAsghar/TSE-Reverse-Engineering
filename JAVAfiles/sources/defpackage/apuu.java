package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apuu {
    private final Map a = new HashMap();

    public final String a(String str) {
        if (!this.a.containsKey(str.toLowerCase(Locale.US))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : (List) this.a.get(str.toLowerCase(Locale.US))) {
            if (str2 != null) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public final List b(String str) {
        List list = (List) this.a.get(str.toLowerCase(Locale.US));
        if (list == null) {
            int i = alog.d;
            return alsx.a;
        }
        return list;
    }

    public final Set c() {
        return DesugarCollections.unmodifiableSet(this.a.keySet());
    }

    public final void d(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        d.s(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        if (!this.a.containsKey(lowerCase)) {
            this.a.put(lowerCase, new ArrayList());
        }
        ((List) this.a.get(lowerCase)).add(str2);
    }

    public final void e(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        d.s(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        this.a.put(lowerCase, new ArrayList());
        ((List) this.a.get(lowerCase)).add(str2);
    }

    public final boolean f(String str) {
        return this.a.containsKey(str.toLowerCase(Locale.US));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.a.entrySet());
        Collections.sort(arrayList, new zyv(15));
        StringBuilder sb = new StringBuilder("{");
        new alhm(new algs(", "), "=").b(sb, arrayList);
        sb.append('}');
        return sb.toString();
    }
}
