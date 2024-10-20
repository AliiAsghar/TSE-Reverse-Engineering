package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akij {
    public static final akij a;
    public final alor b;
    private final alor c;

    static {
        altg altgVar = altg.a;
        a = new akij(altgVar, altgVar);
    }

    public akij(Set set, Set set2) {
        alok alokVar = new alok();
        aluq listIterator = ((altg) set2).listIterator();
        while (listIterator.hasNext()) {
            ((akid) listIterator.next()).a(alokVar);
        }
        this.c = alokVar.b();
        alok alokVar2 = new alok();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((akid) it.next()).a(alokVar2);
        }
        this.b = alokVar2.b();
    }

    public final alpt a() {
        return this.b.keySet();
    }

    public final apuv b(String str) {
        apuv apuvVar = (apuv) this.c.get(str);
        if (apuvVar != null) {
            return apuvVar;
        }
        return (apuv) this.b.get(str);
    }
}
