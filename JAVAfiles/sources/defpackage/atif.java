package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atif extends atgd implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final atgf b;

    private atif(atgf atgfVar) {
        this.b = atgfVar;
    }

    public static synchronized atif h(atgf atgfVar) {
        atif atifVar;
        synchronized (atif.class) {
            HashMap hashMap = a;
            if (hashMap == null) {
                a = new HashMap(7);
                atifVar = null;
            } else {
                atifVar = (atif) hashMap.get(atgfVar);
            }
            if (atifVar == null) {
                atif atifVar2 = new atif(atgfVar);
                a.put(atgfVar, atifVar2);
                return atifVar2;
            }
            return atifVar;
        }
    }

    private final UnsupportedOperationException i() {
        return new UnsupportedOperationException(this.b.m.concat(" field is unsupported"));
    }

    private Object readResolve() {
        return h(this.b);
    }

    @Override // defpackage.atgd
    public final long a(long j, int i) {
        throw i();
    }

    @Override // defpackage.atgd
    public final long b(long j, long j2) {
        throw i();
    }

    @Override // defpackage.atgd
    public final long c() {
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // defpackage.atgd
    public final atgf d() {
        return this.b;
    }

    @Override // defpackage.atgd
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof atif) {
            atif atifVar = (atif) obj;
            atifVar.g();
            return atifVar.g().equals(g());
        }
        return false;
    }

    @Override // defpackage.atgd
    public final boolean f() {
        return false;
    }

    public final String g() {
        return this.b.m;
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return "UnsupportedDurationField[" + g() + "]";
    }
}
