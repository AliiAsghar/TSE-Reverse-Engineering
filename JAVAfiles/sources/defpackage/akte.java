package defpackage;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akte {
    public static final alvi a = alvi.m("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final aegu b;
    public final aneo c;
    public final ConcurrentMap d = new ConcurrentHashMap(2, 0.75f, 1);
    public final AtomicLong e;
    public final int f;
    public final int g;
    private final akqz h;
    private final armf i;
    private final akqn j;

    public akte(akqz akqzVar, aegu aeguVar, aneo aneoVar, armf armfVar, akqn akqnVar, Map map, Map map2) {
        boolean z;
        this.h = akqzVar;
        this.b = aeguVar;
        this.c = aneoVar;
        this.i = armfVar;
        this.j = akqnVar;
        Boolean bool = false;
        bool.getClass();
        if (!map.isEmpty()) {
            if (((altc) map).d == 1) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "Please only specify the max number of spans once.");
            ((akqt) alzz.aP(((alor) map).keySet())).a();
            this.f = 1500;
        } else {
            this.f = 500;
        }
        if (!map2.isEmpty()) {
            d.t(((altc) map2).d == 1, "Please only specify the trace deadline limit once.");
            this.g = ((akss) alzz.aP(((alor) map2).keySet())).a();
        } else {
            this.g = 900000;
        }
        this.e = new AtomicLong(this.g);
    }

    public static final void c(akry akryVar, String str) {
        akpy akpyVar;
        if (akryVar != null && akryVar != akrf.a && !(akryVar instanceof akra) && akpx.a != 1) {
            if (akryVar instanceof akqc) {
                String n = akqj.n(akryVar);
                if (!"".equals(n)) {
                    n = ": ".concat(String.valueOf(n));
                }
                akpyVar = new akpy(n, str, ((akqc) akryVar).g());
            } else {
                akpyVar = new akpy(str);
            }
            akpy akpyVar2 = akpyVar;
            akpyVar2.addSuppressed(aktu.c());
            if (akpx.a == 3) {
                alvw h = aktb.a.h();
                h.X(alwp.a, "TraceManager");
                ((alvg) ((alvg) ((alvg) h).g(akpyVar2)).h("com/google/apps/tiktok/tracing/TraceManager", "reportDuplicateTraceException", 'j', "TraceManager.java")).q("Duplicate trace");
                return;
            }
            throw akpyVar2;
        }
    }

    public final /* bridge */ /* synthetic */ List a() {
        alob alobVar = new alob();
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            alobVar.h(((akuf) ((Map.Entry) it.next()).getValue()).b());
        }
        return alobVar.g();
    }

    public final void b(aktq aktqVar, SparseArray sparseArray, String str) {
        akru b = akqj.b();
        akry akryVar = b.c;
        akqj.g(new akqw(str, akqw.a, akrk.a, b));
        try {
            Iterator it = ((Set) this.i.b()).iterator();
            RuntimeException runtimeException = null;
            while (it.hasNext()) {
                try {
                    ((akta) it.next()).b(aktqVar, sparseArray);
                } catch (RuntimeException e) {
                    if (runtimeException != null) {
                        runtimeException.addSuppressed(e);
                    } else {
                        runtimeException = e;
                    }
                }
            }
            if (runtimeException == null) {
            } else {
                throw runtimeException;
            }
        } finally {
            akqj.h(b, akryVar);
        }
    }

    public final akry d(String str, akrl akrlVar, long j, long j2, int i, int i2) {
        long millis;
        UUID b = this.j.b();
        boolean b2 = aktp.b(b.getLeastSignificantBits(), brg.a);
        aozy createBuilder = aktq.a.createBuilder();
        long leastSignificantBits = b.getLeastSignificantBits();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aktq aktqVar = (aktq) createBuilder.b;
        aktqVar.b |= 2;
        aktqVar.d = leastSignificantBits;
        long mostSignificantBits = b.getMostSignificantBits();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aktq aktqVar2 = (aktq) apagVar;
        aktqVar2.b |= 1;
        aktqVar2.c = mostSignificantBits;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        aktq aktqVar3 = (aktq) apagVar2;
        aktqVar3.b |= 4;
        aktqVar3.f = j;
        long j3 = j2 / 1000000;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        aktq aktqVar4 = (aktq) apagVar3;
        aktqVar4.b |= 8;
        aktqVar4.g = j3;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        aktq aktqVar5 = (aktq) createBuilder.b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            aktqVar5.j = i3;
            aktqVar5.b |= 64;
            aktq aktqVar6 = (aktq) createBuilder.s();
            if (i2 == 2) {
                millis = j2;
            } else {
                millis = this.b.e().toMillis() * 1000000;
            }
            akue akueVar = new akue(str, akrlVar, i);
            akuf akufVar = new akuf(this, b, aktqVar6, akueVar, millis, b2, false, this.b);
            akru b3 = akqj.b();
            akrb akrbVar = new akrb(akueVar, akufVar, b3);
            akqz akqzVar = this.h;
            if (akqzVar.d.compareAndSet(false, true)) {
                akqzVar.c.execute(new akhg(akqzVar, 18));
            }
            akqy akqyVar = new akqy(akrbVar, akqzVar.b);
            akqz.a.put(akqyVar, Boolean.TRUE);
            akqx akqxVar = akqyVar.a;
            aneo aneoVar = this.c;
            akufVar.f = akqxVar;
            akqxVar.c(akufVar, aneoVar);
            this.d.put(b, akufVar);
            akqj.h(b3, akrbVar);
            return akrbVar;
        }
        throw null;
    }

    public final akrc e(String str, akrl akrlVar, int i) {
        akry c = akqj.c();
        c(c, str);
        akry d = d(str, akrlVar, this.b.f().toEpochMilli(), this.b.b(), 1, i);
        if (c == ((akrb) d).b) {
            return d;
        }
        return new aktc(d, c, 1);
    }
}
