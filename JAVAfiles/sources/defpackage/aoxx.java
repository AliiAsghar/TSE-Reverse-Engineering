package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxx {
    public static final algs a;
    public static final algs b;
    public static final anna c;
    private static final algs d;
    private static final alog e;
    private static final anna f;
    private static final anna g;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, alhn] */
    static {
        anna d2 = anna.e('=').d();
        albo.L(true, "must be greater than zero: %s", 2);
        c = new anna((alhn) d2.c, d2.b, (algc) d2.d, 2);
        f = anna.e('/');
        g = anna.e('-');
        anna.e(':');
        a = new algs("/");
        d = new algs("-");
        b = new algs("=");
        e = alog.C(new aoxw("s", false), new aoxw("w", false), new aoxw("c", true), new aoxw("d", true), new aoxw("h", false), new aoxw("s", true), new aoxw("h", true), new aoxw("p", true), new aoxw("pp", true), new aoxw("pf", true), new aoxw("n", true), new aoxw("r", false), new aoxw("r", true), new aoxw("o", true), new aoxw("o", false), new aoxw("j", false), new aoxw("x", false), new aoxw("y", false), new aoxw("z", false), new aoxw("g", true), new aoxw("e", false), new aoxw("f", false), new aoxw("k", true), new aoxw("u", true), new aoxw("ut", true), new aoxw("i", true), new aoxw("a", true), new aoxw("b", true), new aoxw("b", false), new aoxw("c", false), new aoxw("t", false), new aoxw("nt0", false), new aoxw("v", true), new aoxw("q", false), new aoxw("fh", true), new aoxw("fv", true), new aoxw("fg", true), new aoxw("ci", true), new aoxw("rw", true), new aoxw("rwu", true), new aoxw("rwa", true), new aoxw("nw", true), new aoxw("rh", true), new aoxw("no", true), new aoxw("ns", true), new aoxw("k", false), new aoxw("p", false), new aoxw("l", false), new aoxw("v", false), new aoxw("nu", true), new aoxw("ft", true), new aoxw("cc", true), new aoxw("nd", true), new aoxw("ip", true), new aoxw("nc", true), new aoxw("a", false), new aoxw("rj", true), new aoxw("rp", true), new aoxw("rg", true), new aoxw("pd", true), new aoxw("pa", true), new aoxw("m", false), new aoxw("vb", false), new aoxw("vl", false), new aoxw("lf", true), new aoxw("mv", true), new aoxw("id", true), new aoxw("al", true), new aoxw("ic", false), new aoxw("pg", true), new aoxw("mo", true), new aoxw("iv", false), new aoxw("il", false), new aoxw("ba", false), new aoxw("vm", false), new aoxw("vf", false));
    }

    protected aoxx() {
    }

    public static final String a(agsh agshVar) {
        ArrayList an = alzz.an(c.a(agshVar.a()));
        if (an.size() == 2) {
            return (String) an.get(1);
        }
        return "";
    }

    public static final String b(List list) {
        if (list.size() == 4) {
            list.add("");
        } else if (list.size() == 5) {
            list.add(4, "");
        }
        return (String) list.get(4);
    }

    public static final List c(agsh agshVar) {
        ArrayList an = alzz.an(f.a(agshVar.a()));
        if (an.size() > 0 && ((String) an.get(0)).isEmpty()) {
            return an.subList(1, an.size());
        }
        return an;
    }

    public static final boolean d(List list) {
        int size = list.size();
        if (size <= 0 || size > 1 || ((String) list.get(0)).isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean e(List list) {
        int size = list.size();
        if (size < 4) {
            return false;
        }
        if (size == 4) {
            if (((String) list.get(3)).isEmpty()) {
                return false;
            }
            return true;
        }
        if (size > 6) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String f(String str, String str2) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "oldOptions is null");
        d.t(true, "newOptions is null");
        if (!str.isEmpty()) {
            List<String> g2 = g(str);
            if (!g2.isEmpty()) {
                g2.addAll(g(str2));
                d.t(true, "options is null");
                alln allnVar = new alln();
                ArrayList arrayList = new ArrayList();
                for (String str3 : g2) {
                    alog alogVar = e;
                    int i = ((alsx) alogVar).c;
                    aoxw aoxwVar = null;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            break;
                        }
                        aoxw aoxwVar2 = (aoxw) alogVar.get(i2);
                        if (str3.toLowerCase(Locale.getDefault()).startsWith(aoxwVar2.a)) {
                            if (aoxwVar2.b) {
                                if (str3.length() == aoxwVar2.a.length()) {
                                    aoxwVar = aoxwVar2;
                                    break;
                                }
                            } else {
                                aoxwVar = aoxwVar2;
                            }
                        }
                        i2++;
                    }
                    if (aoxwVar != null) {
                        allnVar.q(aoxwVar, str3);
                    } else {
                        arrayList.add(str3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                alog alogVar2 = e;
                int i3 = ((alsx) alogVar2).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    String str4 = "";
                    for (String str5 : allnVar.b((aoxw) alogVar2.get(i4))) {
                        if (Character.isUpperCase(str5.charAt(0))) {
                            arrayList2.add(str5);
                        } else {
                            str4 = str5;
                        }
                    }
                    if (!str4.isEmpty()) {
                        arrayList2.add(str4);
                    }
                }
                arrayList2.addAll(arrayList);
                return d.d(arrayList2);
            }
        }
        return str2;
    }

    public static List g(String str) {
        boolean z;
        Object obj;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "options is null");
        ArrayList arrayList = new ArrayList();
        Iterator it = g.a(str).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!str2.isEmpty()) {
                Object obj2 = "";
                if (str2.startsWith("O") || str2.startsWith("J")) {
                    while (str2.length() < 12) {
                        algs algsVar = d;
                        if (!it.hasNext()) {
                            obj = "";
                        } else {
                            obj = it.next();
                        }
                        str2 = algsVar.f(str2, obj, new Object[0]);
                    }
                }
                if (str2.equals("pi") || str2.equals("ya") || str2.equals("ro")) {
                    algs algsVar2 = d;
                    if (it.hasNext()) {
                        obj2 = it.next();
                    }
                    str2 = algsVar2.f(str2, obj2, new Object[0]);
                }
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static final List h(agsh agshVar) {
        if (agshVar.a() != null) {
            List c2 = c(agshVar);
            if (!c2.isEmpty() && "u".equals(c2.get(0))) {
                c2.remove(1);
                c2.remove(0);
            } else if (!c2.isEmpty() && "image".equals(c2.get(0))) {
                c2.remove(0);
            }
            if (c2.size() == 2) {
                c2.remove(0);
            }
            return c2;
        }
        throw new aoxv("url path is null");
    }

    public final boolean i(Uri uri) {
        agsh agshVar = new agsh(uri);
        boolean z = true;
        d.s(true);
        String agshVar2 = agshVar.toString();
        if (agshVar2 == null) {
            z = false;
        }
        d.s(z);
        return aoyg.a.matcher(agshVar2).find();
    }

    public aoxx(byte[] bArr) {
        this();
    }
}
