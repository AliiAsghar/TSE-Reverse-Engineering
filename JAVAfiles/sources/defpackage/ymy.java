package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymy extends arpw implements arqv {
    int a;
    final /* synthetic */ ypn b;
    final /* synthetic */ yni c;
    final /* synthetic */ ypi d;
    final /* synthetic */ amzf e;
    final /* synthetic */ int f;
    final /* synthetic */ amzp g;
    final /* synthetic */ ypk h;
    final /* synthetic */ apzk i;
    final /* synthetic */ ypj j;
    final /* synthetic */ String k;
    final /* synthetic */ yyt l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymy(yyt yytVar, ypn ypnVar, yni yniVar, ypi ypiVar, amzf amzfVar, int i, amzp amzpVar, ypk ypkVar, apzk apzkVar, ypj ypjVar, String str, arpe arpeVar) {
        super(2, arpeVar);
        this.l = yytVar;
        this.b = ypnVar;
        this.c = yniVar;
        this.d = ypiVar;
        this.e = amzfVar;
        this.f = i;
        this.g = amzpVar;
        this.h = ypkVar;
        this.i = apzkVar;
        this.j = ypjVar;
        this.k = str;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ymy) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            aiqj aiqjVar = (aiqj) this.l.d.b();
            ypn ypnVar = this.b;
            yni yniVar = this.c;
            this.a = 1;
            obj = aiqjVar.o(ypnVar.c, ypnVar.d, yniVar, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        ypi ypiVar = this.d;
        amzf amzfVar = this.e;
        int i2 = this.f;
        amzp amzpVar = this.g;
        aozy aozyVar = (aozy) obj;
        aozy d = yyt.d(ypiVar, amzfVar, i2);
        if (!d.b.isMutable()) {
            d.u();
        }
        amze amzeVar = (amze) d.b;
        amze amzeVar2 = amze.a;
        amzeVar.e = amzpVar.a();
        amzeVar.b |= 4;
        float a = this.h.a();
        if (!d.b.isMutable()) {
            d.u();
        }
        apag apagVar = d.b;
        amze amzeVar3 = (amze) apagVar;
        amzeVar3.b |= 8;
        amzeVar3.f = a;
        apzk apzkVar = this.i;
        if (!apagVar.isMutable()) {
            d.u();
        }
        amze amzeVar4 = (amze) d.b;
        amzeVar4.g = apzkVar.a();
        amzeVar4.b |= 16;
        Set set = this.j.a;
        ArrayList arrayList = new ArrayList(aqjn.J(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((ypi) it.next()).a());
        }
        d.aN(arrayList);
        String str = this.k;
        if (!d.b.isMutable()) {
            d.u();
        }
        amze amzeVar5 = (amze) d.b;
        amzeVar5.b |= 128;
        amzeVar5.k = str;
        apag s = d.s();
        s.getClass();
        amze amzeVar6 = (amze) s;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amzo amzoVar = (amzo) aozyVar.b;
        amzo amzoVar2 = amzo.a;
        amzoVar.d = amzeVar6;
        amzoVar.c = 4;
        ynb ynbVar = (ynb) this.l.c.b();
        aozy createBuilder = amyy.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amyy amyyVar = (amyy) createBuilder.b;
        amzo amzoVar3 = (amzo) aozyVar.s();
        amzoVar3.getClass();
        amyyVar.c = amzoVar3;
        amyyVar.b = 1;
        apag s2 = createBuilder.s();
        s2.getClass();
        ynbVar.b((amyy) s2);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new ymy(this.l, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, arpeVar);
    }
}
