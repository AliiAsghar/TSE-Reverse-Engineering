package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abon {
    public static final abon a;
    public static final abon b;
    public static final abon c;
    public final alpt d;

    static {
        alpt alptVar;
        EnumSet allOf = EnumSet.allOf(aboo.class);
        if (allOf instanceof Collection) {
            if (allOf.isEmpty()) {
                alptVar = altg.a;
            } else {
                alptVar = alnz.a(EnumSet.copyOf((Collection) allOf));
            }
        } else {
            Iterator it = allOf.iterator();
            if (it.hasNext()) {
                EnumSet of = EnumSet.of((Enum) it.next());
                alzz.aE(of, it);
                alptVar = alnz.a(of);
            } else {
                alptVar = altg.a;
            }
        }
        a = new abon(alptVar);
        b = new abon(altg.a);
        c = new abon(alnz.a(EnumSet.of(aboo.ZWIEBACK, new aboo[0])));
    }

    public abon(alpt alptVar) {
        this.d = alptVar;
    }

    public final boolean a(aboo abooVar) {
        return this.d.contains(abooVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof abon) && this.d.equals(((abon) obj).d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
