package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esb {
    public final esa a;
    public final alog b;

    static {
        eul.M(0);
        eul.M(1);
    }

    public esb(esa esaVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= esaVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = esaVar;
        this.b = alog.n(list);
    }

    public final int a() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            esb esbVar = (esb) obj;
            if (this.a.equals(esbVar.a) && alzz.at(this.b, esbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }
}
