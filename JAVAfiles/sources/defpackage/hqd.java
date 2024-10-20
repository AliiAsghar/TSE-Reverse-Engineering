package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqd {
    private final hqc a = new hqc(null);
    private final Map b = new HashMap();

    private static void d(hqc hqcVar) {
        hqc hqcVar2 = hqcVar.d;
        hqcVar2.c = hqcVar.c;
        hqcVar.c.d = hqcVar2;
    }

    private static void e(hqc hqcVar) {
        hqcVar.c.d = hqcVar;
        hqcVar.d.c = hqcVar;
    }

    public final Object a(hqk hqkVar) {
        hqc hqcVar = (hqc) this.b.get(hqkVar);
        if (hqcVar == null) {
            hqcVar = new hqc(hqkVar);
            this.b.put(hqkVar, hqcVar);
        } else {
            hqkVar.a();
        }
        d(hqcVar);
        hqc hqcVar2 = this.a;
        hqcVar.d = hqcVar2;
        hqcVar.c = hqcVar2.c;
        e(hqcVar);
        return hqcVar.b();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [hqk, java.lang.Object] */
    public final Object b() {
        for (hqc hqcVar = this.a.d; !hqcVar.equals(this.a); hqcVar = hqcVar.d) {
            Object b = hqcVar.b();
            if (b != null) {
                return b;
            }
            d(hqcVar);
            this.b.remove(hqcVar.a);
            hqcVar.a.a();
        }
        return null;
    }

    public final void c(hqk hqkVar, Object obj) {
        hqc hqcVar = (hqc) this.b.get(hqkVar);
        if (hqcVar == null) {
            hqcVar = new hqc(hqkVar);
            d(hqcVar);
            hqc hqcVar2 = this.a;
            hqcVar.d = hqcVar2.d;
            hqcVar.c = hqcVar2;
            e(hqcVar);
            this.b.put(hqkVar, hqcVar);
        } else {
            hqkVar.a();
        }
        if (hqcVar.b == null) {
            hqcVar.b = new ArrayList();
        }
        hqcVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        hqc hqcVar = this.a.c;
        boolean z = false;
        while (!hqcVar.equals(this.a)) {
            sb.append('{');
            sb.append(hqcVar.a);
            sb.append(':');
            sb.append(hqcVar.a());
            sb.append("}, ");
            hqcVar = hqcVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
