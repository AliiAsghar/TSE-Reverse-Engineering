package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class akrl {
    public static final aktp e = new aktp();
    private final akrl a;
    public final vl c;
    public boolean d = false;

    public akrl(akrl akrlVar, vl vlVar) {
        if (akrlVar != null) {
            d.s(akrlVar.d);
        }
        this.a = akrlVar;
        this.c = vlVar;
    }

    public static akrj b() {
        return akrk.a.c();
    }

    public static akrl d(Set set) {
        boolean z;
        if (set.isEmpty()) {
            return akrk.a;
        }
        if (set.size() == 1) {
            return (akrl) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            akrl akrlVar = (akrl) it.next();
            do {
                i += akrlVar.c.d;
                akrlVar = akrlVar.a;
            } while (akrlVar != null);
        }
        if (i == 0) {
            return akrk.a;
        }
        vl vlVar = new vl(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            akrl akrlVar2 = (akrl) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    vl vlVar2 = akrlVar2.c;
                    if (i2 >= vlVar2.d) {
                        break;
                    }
                    if (vlVar.put((aktp) vlVar2.d(i2), akrlVar2.c.g(i2)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    albo.N(z, "Duplicate bindings: %s", akrlVar2.c.d(i2));
                    i2++;
                }
                akrlVar2 = akrlVar2.a;
            } while (akrlVar2 != null);
        }
        return new akrk(null, vlVar).f();
    }

    public static akrl e(akrl akrlVar, akrl akrlVar2) {
        if (akrlVar.g()) {
            return akrlVar2;
        }
        if (akrlVar2.g()) {
            return akrlVar;
        }
        return d(alpt.r(akrlVar, akrlVar2));
    }

    public static akri j(aktp aktpVar, akrl akrlVar) {
        int i;
        Object h = akrlVar.h(aktpVar);
        if (h == null) {
            if (true != akrlVar.c.containsKey(e)) {
                i = 3;
            } else {
                i = 2;
            }
            return akri.d(i);
        }
        return new akri(1, h, false);
    }

    public final akrj c() {
        return new akrk(this, new vl());
    }

    public final akrl f() {
        if (!this.d) {
            this.d = true;
            akrl akrlVar = this.a;
            if (akrlVar != null && this.c.isEmpty()) {
                return akrlVar;
            }
            return this;
        }
        throw new IllegalStateException("Already frozen");
    }

    public final boolean g() {
        if (this == akrk.a) {
            return true;
        }
        return false;
    }

    public final Object h(aktp aktpVar) {
        akrl akrlVar;
        albo.T(this.d);
        Object obj = this.c.get(aktpVar);
        if (obj == null && (akrlVar = this.a) != null) {
            return akrlVar.h(aktpVar);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(aktp aktpVar) {
        if (this.c.containsKey(aktpVar)) {
            return true;
        }
        akrl akrlVar = this.a;
        if (akrlVar != null && akrlVar.i(aktpVar)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (akrl akrlVar = this; akrlVar != null; akrlVar = akrlVar.a) {
            for (int i = 0; i < akrlVar.c.d; i++) {
                sb.append(this.c.g(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
