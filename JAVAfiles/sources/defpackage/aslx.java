package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslx {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final List f;
    public final String g;
    public final boolean h;
    private final String i;
    private final String j;
    private final String k;

    public aslx(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6) {
        this.b = str;
        this.i = str2;
        this.j = str3;
        this.c = str4;
        this.d = i;
        this.e = list;
        this.f = list2;
        this.k = str5;
        this.g = str6;
        this.h = d.F(str, "https");
    }

    public final String a() {
        if (this.j.length() == 0) {
            return "";
        }
        int S = arsd.S(this.g, ':', this.b.length() + 3, 4) + 1;
        String str = this.g;
        String substring = str.substring(S, arsd.S(str, '@', 0, 6));
        substring.getClass();
        return substring;
    }

    public final String b() {
        int length = this.b.length();
        String str = this.g;
        int S = arsd.S(str, '/', length + 3, 4);
        String substring = this.g.substring(S, asmt.b(str, "?#", S, str.length()));
        substring.getClass();
        return substring;
    }

    public final String c() {
        if (this.f == null) {
            return null;
        }
        int S = arsd.S(this.g, '?', 0, 6) + 1;
        String str = this.g;
        String substring = str.substring(S, asmt.a(str, '#', S, str.length()));
        substring.getClass();
        return substring;
    }

    public final String d() {
        if (this.i.length() == 0) {
            return "";
        }
        String str = this.b;
        String str2 = this.g;
        int length = str.length() + 3;
        String substring = str2.substring(length, asmt.b(str2, ":@", length, str2.length()));
        substring.getClass();
        return substring;
    }

    public final String e() {
        aslw h = h("/...");
        h.getClass();
        h.b = aotl.ar("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        h.c = aotl.ar("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return h.a().g;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aslx) && d.F(((aslx) obj).g, this.g)) {
            return true;
        }
        return false;
    }

    public final URI f() {
        String substring;
        String str;
        String str2;
        aslw aslwVar = new aslw();
        aslwVar.a = this.b;
        aslwVar.b = d();
        aslwVar.c = a();
        aslwVar.d = this.c;
        int i = this.d;
        if (i == aotl.ao(this.b)) {
            i = -1;
        }
        aslwVar.e = i;
        aslwVar.f.clear();
        aslwVar.f.addAll(g());
        aslwVar.b(c());
        String str3 = null;
        if (this.k == null) {
            substring = null;
        } else {
            substring = this.g.substring(arsd.S(this.g, '#', 0, 6) + 1);
            substring.getClass();
        }
        aslwVar.h = substring;
        String str4 = aslwVar.d;
        if (str4 != null) {
            str = new arus("[\"<>^`{|}]").a(str4, "");
        } else {
            str = null;
        }
        aslwVar.d = str;
        int size = aslwVar.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = aslwVar.f;
            list.set(i2, aotl.ar((String) list.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        List list2 = aslwVar.g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str5 = (String) list2.get(i3);
                if (str5 != null) {
                    str2 = aotl.ar(str5, 0, 0, "\\^`{|}", true, true, true, false, 195);
                } else {
                    str2 = null;
                }
                list2.set(i3, str2);
            }
        }
        String str6 = aslwVar.h;
        if (str6 != null) {
            str3 = aotl.ar(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        aslwVar.h = str3;
        String aslwVar2 = aslwVar.toString();
        try {
            return new URI(aslwVar2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(new arus("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").a(aslwVar2, ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final List g() {
        int length = this.b.length();
        String str = this.g;
        int S = arsd.S(str, '/', length + 3, 4);
        int b = asmt.b(str, "?#", S, str.length());
        ArrayList arrayList = new ArrayList();
        while (S < b) {
            int i = S + 1;
            int a2 = asmt.a(this.g, '/', i, b);
            String substring = this.g.substring(i, a2);
            substring.getClass();
            arrayList.add(substring);
            S = a2;
        }
        return arrayList;
    }

    public final aslw h(String str) {
        try {
            aslw aslwVar = new aslw();
            aslwVar.c(this, str);
            return aslwVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final aslx i(String str) {
        str.getClass();
        aslw h = h(str);
        if (h != null) {
            return h.a();
        }
        return null;
    }

    public final String toString() {
        return this.g;
    }
}
