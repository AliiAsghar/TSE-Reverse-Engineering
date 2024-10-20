package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjp {
    public final List a;
    public List b;
    public final String c;

    public adjp(String str) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = str;
    }

    public final int a(String str, int i) {
        String e = e(str);
        if (e == null) {
            return i;
        }
        try {
            return Integer.parseInt(e);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final adjp b(String str) {
        adjp adjpVar = new adjp(str);
        this.b.add(adjpVar);
        return adjpVar;
    }

    public final adjp c(String str) {
        for (adjp adjpVar : this.b) {
            if (albo.ar(adjpVar.c, str)) {
                return adjpVar;
            }
        }
        return null;
    }

    public final adjp d(String str, String str2) {
        for (adjp adjpVar : this.b) {
            String e = adjpVar.e(str);
            if (e != null && albo.ar(e, str2)) {
                return adjpVar;
            }
        }
        return null;
    }

    public final String e(String str) {
        for (adjo adjoVar : this.a) {
            if (albo.ar(adjoVar.a, str)) {
                if (albo.ar(adjoVar.b, "X")) {
                    return "";
                }
                return adjoVar.b;
            }
        }
        return null;
    }

    public final boolean f(String str) {
        if (e(str) != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(" : {\r\n");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            sb.append((adjp) it.next());
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            sb.append((adjo) it2.next());
        }
        sb.append("}\r\n");
        return sb.toString();
    }

    public adjp() {
        this("WapProvisioningDocument");
    }
}
