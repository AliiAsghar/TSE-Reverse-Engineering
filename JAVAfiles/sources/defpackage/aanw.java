package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanw extends eor {
    public final arpi a;
    public final uck b;
    public final Map c;
    public final ascd d;
    public final ascv e;
    public final asai f;
    public final aaoc g;
    public final abac h;
    private final arwe i;

    /* JADX WARN: Type inference failed for: r9v7, types: [asai, java.lang.Object] */
    public aanw(arwe arweVar, abac abacVar, aaoc aaocVar, arpi arpiVar, uck uckVar) {
        arweVar.getClass();
        aaocVar.getClass();
        arpiVar.getClass();
        uckVar.getClass();
        this.i = arweVar;
        this.h = abacVar;
        this.g = aaocVar;
        this.a = arpiVar;
        this.b = uckVar;
        List B = aqjn.B(new aanr(1, "Dump Database", "dump", new zzq(this, 11)), new aanr(2, "Dump Database (Redacted)", "dump", new zzq(this, 12)), new aanr(3, "Install Fake sqlite_stat1", "run", new zzq(this, 13)), new aanr(4, "Analyze Database", "run", new zzq(this, 14)), new aanr(5, "Checkpoint WAL", "run", new zzq(this, 15)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(B, 10)), 16));
        for (Object obj : B) {
            linkedHashMap.put(Integer.valueOf(((aanr) obj).a), obj);
        }
        this.c = linkedHashMap;
        ascd a = ascy.a(false);
        this.d = a;
        this.e = a;
        this.f = dyg.f(new ghw(new gcn(20, 0, false, 0, 0, 0, 58), new zzq(this, 16)).a, this.i);
    }

    public final void a() {
        ascd ascdVar;
        Object c;
        do {
            ascdVar = this.d;
            c = ascdVar.c();
            ((Boolean) c).booleanValue();
        } while (!ascdVar.g(c, false));
    }

    public final void b(arqr arqrVar) {
        qjh.l(this.i, null, new zez(this, arqrVar, (arpe) null, 12), 3);
    }

    public final void c(boolean z) {
        b(new aanu(this, z, null));
    }
}
