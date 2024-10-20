package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cwe {
    public final cwf a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private cwf i;
    public boolean b = true;
    public final Map h = new HashMap();

    /* compiled from: PG */
    /* renamed from: cwe$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cwf, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cwf cwfVar = (cwf) obj;
            if (cwfVar.n()) {
                if (cwfVar.g().b) {
                    cwfVar.k();
                }
                Map map = cwfVar.g().h;
                cwe cweVar = cwe.this;
                for (Map.Entry entry : map.entrySet()) {
                    cweVar.d((csh) entry.getKey(), ((Number) entry.getValue()).intValue(), cwfVar.i());
                }
                cyn cynVar = cwfVar.i().v;
                cynVar.getClass();
                while (!d.F(cynVar, cwe.this.a.i())) {
                    Set<csh> keySet = cwe.this.c(cynVar).keySet();
                    cwe cweVar2 = cwe.this;
                    for (csh cshVar : keySet) {
                        cweVar2.d(cshVar, cweVar2.a(cynVar, cshVar), cynVar);
                    }
                    cynVar = cynVar.v;
                    cynVar.getClass();
                }
            }
            return arnb.a;
        }
    }

    public cwe(cwf cwfVar) {
        this.a = cwfVar;
    }

    protected abstract int a(cyn cynVar, csh cshVar);

    protected abstract long b(cyn cynVar, long j);

    protected abstract Map c(cyn cynVar);

    public final void d(csh cshVar, int i, cyn cynVar) {
        long j;
        float intBitsToFloat;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        loop0: while (true) {
            j = floatToRawIntBits | floatToRawIntBits2;
            do {
                j = b(cynVar, j);
                cynVar = cynVar.v;
                cynVar.getClass();
                if (d.F(cynVar, this.a.i())) {
                    break loop0;
                }
            } while (!c(cynVar).containsKey(cshVar));
            float a = a(cynVar, cshVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(a);
            long floatToRawIntBits4 = Float.floatToRawIntBits(a);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
        if (cshVar instanceof cta) {
            intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        Map map = this.h;
        int round = Math.round(intBitsToFloat);
        if (map.containsKey(cshVar)) {
            round = ((Number) cshVar.a.a(Integer.valueOf(((Number) aqjn.l(this.h, cshVar)).intValue()), Integer.valueOf(round))).intValue();
        }
        map.put(cshVar, Integer.valueOf(round));
    }

    public final void e() {
        this.b = true;
        cwf h = this.a.h();
        if (h == null) {
            return;
        }
        if (this.c) {
            h.m();
        } else if (this.e || this.d) {
            h.l();
        }
        if (this.f) {
            this.a.m();
        }
        if (this.g) {
            this.a.l();
        }
        h.g().e();
    }

    public final void f() {
        this.h.clear();
        this.a.j(new AnonymousClass1());
        this.h.putAll(c(this.a.i()));
        this.b = false;
    }

    public final void g() {
        cwf cwfVar;
        cwe g;
        cwe g2;
        if (i()) {
            cwfVar = this.a;
        } else {
            cwf h = this.a.h();
            if (h != null) {
                cwfVar = h.g().i;
                if (cwfVar == null || !cwfVar.g().i()) {
                    cwf cwfVar2 = this.i;
                    if (cwfVar2 != null && !cwfVar2.g().i()) {
                        cwf h2 = cwfVar2.h();
                        if (h2 != null && (g2 = h2.g()) != null) {
                            g2.g();
                        }
                        cwf h3 = cwfVar2.h();
                        if (h3 != null && (g = h3.g()) != null) {
                            cwfVar = g.i;
                        } else {
                            cwfVar = null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.i = cwfVar;
    }

    public final void h() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.i = null;
    }

    public final boolean i() {
        if (!this.c && !this.e && !this.f && !this.g) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        g();
        if (this.i != null) {
            return true;
        }
        return false;
    }
}
