package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class athk extends atgr {
    public static final athk o;
    private static final ConcurrentHashMap p;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        p = concurrentHashMap;
        athk athkVar = new athk(athi.H);
        o = athkVar;
        concurrentHashMap.put(atgc.a, athkVar);
    }

    private athk(atfu atfuVar) {
        super(atfuVar, null);
    }

    public static athk N() {
        return O(atgc.j());
    }

    public static athk O(atgc atgcVar) {
        if (atgcVar == null) {
            atgcVar = atgc.j();
        }
        ConcurrentHashMap concurrentHashMap = p;
        athk athkVar = (athk) concurrentHashMap.get(atgcVar);
        if (athkVar == null) {
            athkVar = new athk(atho.N(o, atgcVar));
            athk athkVar2 = (athk) concurrentHashMap.putIfAbsent(atgcVar, athkVar);
            if (athkVar2 != null) {
                return athkVar2;
            }
        }
        return athkVar;
    }

    private Object writeReplace() {
        return new athj(z());
    }

    @Override // defpackage.atgr
    protected final void M(atgq atgqVar) {
        if (this.a.z() == atgc.a) {
            atgqVar.H = new athu(athl.a, atfy.d);
            atgqVar.k = atgqVar.H.q();
            atgqVar.G = new atic((athu) atgqVar.H, atfy.e);
            atgqVar.C = new atic((athu) atgqVar.H, atgqVar.h, atfy.j);
        }
    }

    @Override // defpackage.atfu
    public final atfu a() {
        return o;
    }

    @Override // defpackage.atfu
    public final atfu b(atgc atgcVar) {
        if (atgcVar == z()) {
            return this;
        }
        return O(atgcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof athk) {
            return z().equals(((athk) obj).z());
        }
        return false;
    }

    public final int hashCode() {
        return z().hashCode() + 800855;
    }

    public final String toString() {
        atgc z = z();
        if (z != null) {
            return "ISOChronology[" + z.c + "]";
        }
        return "ISOChronology";
    }
}
