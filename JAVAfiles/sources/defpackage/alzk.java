package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alzk {
    public static final Comparator a = new zyv(12);
    public static final alzk b = new alzk(new alzi(Collections.emptyList()));
    public final alzi c;

    private alzk(alzi alziVar) {
        this.c = alziVar;
    }

    public final alzk a(alzk alzkVar) {
        if (alzkVar.b()) {
            return this;
        }
        if (b()) {
            return alzkVar;
        }
        return new alzk(new alzi(this.c, alzkVar.c));
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof alzk) && ((alzk) obj).c.equals(this.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public alzk(String str, Object obj) {
        this(new alzi(str, obj));
        alzz.e(str);
    }
}
