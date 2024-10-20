package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atho extends atgr {
    private static final long serialVersionUID = -1079258847191166848L;

    private atho(atfu atfuVar, atgc atgcVar) {
        super(atfuVar, atgcVar);
    }

    public static atho N(atfu atfuVar, atgc atgcVar) {
        if (atfuVar != null) {
            atfu a = atfuVar.a();
            if (a != null) {
                return new atho(a, atgcVar);
            }
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean O(atgd atgdVar) {
        if (atgdVar != null && atgdVar.c() < 43200000) {
            return true;
        }
        return false;
    }

    private final atfw P(atfw atfwVar, HashMap hashMap) {
        if (atfwVar != null && atfwVar.u()) {
            if (hashMap.containsKey(atfwVar)) {
                return (atfw) hashMap.get(atfwVar);
            }
            athm athmVar = new athm(atfwVar, (atgc) this.b, Q(atfwVar.q(), hashMap), Q(atfwVar.s(), hashMap), Q(atfwVar.r(), hashMap));
            hashMap.put(atfwVar, athmVar);
            return athmVar;
        }
        return atfwVar;
    }

    private final atgd Q(atgd atgdVar, HashMap hashMap) {
        if (atgdVar != null && atgdVar.f()) {
            if (hashMap.containsKey(atgdVar)) {
                return (atgd) hashMap.get(atgdVar);
            }
            athn athnVar = new athn(atgdVar, (atgc) this.b);
            hashMap.put(atgdVar, athnVar);
            return athnVar;
        }
        return atgdVar;
    }

    @Override // defpackage.atgr
    protected final void M(atgq atgqVar) {
        HashMap hashMap = new HashMap();
        atgqVar.l = Q(atgqVar.l, hashMap);
        atgqVar.k = Q(atgqVar.k, hashMap);
        atgqVar.j = Q(atgqVar.j, hashMap);
        atgqVar.i = Q(atgqVar.i, hashMap);
        atgqVar.h = Q(atgqVar.h, hashMap);
        atgqVar.g = Q(atgqVar.g, hashMap);
        atgqVar.f = Q(atgqVar.f, hashMap);
        atgqVar.e = Q(atgqVar.e, hashMap);
        atgqVar.d = Q(atgqVar.d, hashMap);
        atgqVar.c = Q(atgqVar.c, hashMap);
        atgqVar.b = Q(atgqVar.b, hashMap);
        atgqVar.a = Q(atgqVar.a, hashMap);
        atgqVar.E = P(atgqVar.E, hashMap);
        atgqVar.F = P(atgqVar.F, hashMap);
        atgqVar.G = P(atgqVar.G, hashMap);
        atgqVar.H = P(atgqVar.H, hashMap);
        atgqVar.I = P(atgqVar.I, hashMap);
        atgqVar.x = P(atgqVar.x, hashMap);
        atgqVar.y = P(atgqVar.y, hashMap);
        atgqVar.z = P(atgqVar.z, hashMap);
        atgqVar.D = P(atgqVar.D, hashMap);
        atgqVar.A = P(atgqVar.A, hashMap);
        atgqVar.B = P(atgqVar.B, hashMap);
        atgqVar.C = P(atgqVar.C, hashMap);
        atgqVar.m = P(atgqVar.m, hashMap);
        atgqVar.n = P(atgqVar.n, hashMap);
        atgqVar.o = P(atgqVar.o, hashMap);
        atgqVar.p = P(atgqVar.p, hashMap);
        atgqVar.q = P(atgqVar.q, hashMap);
        atgqVar.r = P(atgqVar.r, hashMap);
        atgqVar.s = P(atgqVar.s, hashMap);
        atgqVar.u = P(atgqVar.u, hashMap);
        atgqVar.t = P(atgqVar.t, hashMap);
        atgqVar.v = P(atgqVar.v, hashMap);
        atgqVar.w = P(atgqVar.w, hashMap);
    }

    @Override // defpackage.atfu
    public final atfu a() {
        return this.a;
    }

    @Override // defpackage.atfu
    public final atfu b(atgc atgcVar) {
        if (atgcVar == this.b) {
            return this;
        }
        if (atgcVar == atgc.a) {
            return this.a;
        }
        return new atho(this.a, atgcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atho)) {
            return false;
        }
        atho athoVar = (atho) obj;
        if (this.a.equals(athoVar.a)) {
            if (((atgc) this.b).equals(athoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((atgc) this.b).hashCode() * 11) + 326565 + (this.a.hashCode() * 7);
    }

    public final String toString() {
        return "ZonedChronology[" + String.valueOf(this.a) + ", " + ((atgc) this.b).c + "]";
    }

    @Override // defpackage.atgr, defpackage.atfu
    public final atgc z() {
        return (atgc) this.b;
    }
}
