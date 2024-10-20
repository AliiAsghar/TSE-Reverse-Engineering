package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxu {
    private static final Pattern a = Pattern.compile("^[a-zA-Z0-9\\x21\\x23-\\x27\\x2a-\\x2b\\x2d\\x5e-\\x60\\x7c\\x7e]+$");
    private static final Pattern b = Pattern.compile("^[^\\p{Cntrl}]*$");
    private final Map c;

    private vxu(Map map) {
        this.c = map;
    }

    public static vxu a() {
        return new vxu(new TreeMap(String.CASE_INSENSITIVE_ORDER));
    }

    public static vxu b(apwq apwqVar) {
        vxu a2 = a();
        if (apwqVar != null) {
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(apwqVar.b).entrySet()) {
                String str = (String) entry.getKey();
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((apws) entry.getValue()).b).entrySet()) {
                    a2.e(str, (String) entry2.getKey(), (String) entry2.getValue());
                }
            }
        }
        return a2;
    }

    private final void e(String str, String str2, String str3) {
        d.t(a.matcher(str2).matches(), "The headerName has not allowed characters.");
        d.t(b.matcher(str3).matches(), "The headerValue has not allowed characters.");
        if (!this.c.containsKey(str)) {
            this.c.put(str, new TreeMap(String.CASE_INSENSITIVE_ORDER));
        }
        Map map = (Map) this.c.get(str);
        if (map != null) {
            map.put(str2, str3);
            return;
        }
        throw new IllegalStateException("Could not add a new custom header due to null map.");
    }

    public final apwq c() {
        aozy createBuilder = apwq.a.createBuilder();
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            aozy createBuilder2 = apws.a.createBuilder();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                createBuilder2.bJ((String) entry2.getKey(), (String) entry2.getValue());
            }
            createBuilder.bH(str, (apws) createBuilder2.s());
        }
        return (apwq) createBuilder.s();
    }

    public final void d(vxt vxtVar, String str, String str2) {
        e(vxtVar.m, str, str2);
    }
}
