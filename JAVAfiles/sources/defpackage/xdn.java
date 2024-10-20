package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xdn implements puu, pvk {
    public static final alwo a = alwo.o("BugleTachygram");
    public final anen b;
    public final xnv c;
    public final xgj d;
    public final vbs e;
    private final anen f;
    private final armf g;
    private final xdk h;
    private final lgg i;

    public xdn(xdk xdkVar, anen anenVar, anen anenVar2, lgg lggVar, xnv xnvVar, armf armfVar, xgj xgjVar, vbs vbsVar) {
        this.h = xdkVar;
        this.b = anenVar;
        this.f = anenVar2;
        this.i = lggVar;
        this.c = xnvVar;
        this.g = armfVar;
        this.d = xgjVar;
        this.e = vbsVar;
    }

    private final akul f() {
        alor alorVar = (alor) Collection.EL.stream(((xtj) this.g.b()).f(xtg.c)).collect(alls.a(Function$CC.identity(), new wki(this, 16)));
        return aktp.am(alorVar.values()).h(akto.k(new vze(this, alorVar, 15)), this.b);
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        Iterable$EL.forEach(iterable, new vxb(hashSet, hashMap, 16));
        return f().i(new wgb(hashSet, 12), this.f).h(new way(this, hashSet, hashMap, 11), this.b).f(ankx.class, new xdg(4), this.b);
    }

    @Override // defpackage.puu
    public final akul b(qei qeiVar) {
        return f().i(new wgb(yyb.cI(qeiVar), 14), this.f).h(new wxv(this, 16), this.b).f(ankx.class, new xdg(2), this.b);
    }

    @Override // defpackage.pvk
    public final akul c(qei qeiVar) {
        return f().i(new wgb(yyb.cI(qeiVar), 13), this.f).h(new wxv(this.h, 15), this.b).i(new wkh(this, qeiVar, 8, null), this.b).f(ankx.class, new xdg(5), this.b).f(aniq.class, new xdg(6), this.b);
    }

    public final pto d(anlu anluVar) {
        aozy createBuilder = ptz.a.createBuilder();
        for (anlr anlrVar : anluVar.a()) {
            aozy createBuilder2 = pua.a.createBuilder();
            String str = anlrVar.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            pua puaVar = (pua) createBuilder2.b;
            puaVar.b = 1 | puaVar.b;
            puaVar.c = str;
            Optional a2 = anlrVar.a();
            createBuilder2.getClass();
            a2.ifPresent(new wqw(createBuilder2, 5));
            createBuilder.z((pua) createBuilder2.s());
        }
        alpr alprVar = new alpr();
        Iterator it = anluVar.b.iterator();
        while (it.hasNext()) {
            alprVar.j(((anls) it.next()).b);
        }
        aluq listIterator = alprVar.g().listIterator();
        while (listIterator.hasNext()) {
            Optional map = vbe.b(((Integer) listIterator.next()).intValue()).c().map(new xdo(1));
            createBuilder.getClass();
            map.ifPresent(new wqw(createBuilder, 6));
        }
        pvm pvmVar = new pvm();
        pvmVar.i((ptz) createBuilder.s());
        pvmVar.h(this.c.f());
        return pvmVar.g();
    }

    public final akul e(qei qeiVar, pto ptoVar) {
        return this.i.d(new uzn(qeiVar, ptoVar, 9));
    }
}
