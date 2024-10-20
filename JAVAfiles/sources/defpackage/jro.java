package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jro extends arpw implements arqv {
    int a;
    final /* synthetic */ jrr b;
    final /* synthetic */ String c;
    final /* synthetic */ List d;
    final /* synthetic */ Long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jro(jrr jrrVar, String str, List list, Long l, arpe arpeVar) {
        super(2, arpeVar);
        this.b = jrrVar;
        this.c = str;
        this.d = list;
        this.e = l;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jro) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i != 0) {
            return obj;
        }
        arwe arweVar = (arwe) this.f;
        int i2 = 1;
        if (((Boolean) this.b.b.b()).booleanValue() && this.c != null && this.d.size() != 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        jrr jrrVar = this.b;
        jnd jndVar = new jnd(new jno(afsz.c, jrrVar.f, this.e), true);
        List list = this.d;
        jrr jrrVar2 = this.b;
        String str = this.c;
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(arrn.I(arweVar, null, null, new hak(jrrVar2, (jgz) it.next(), jndVar, str, (arpe) null, 6), 3));
            i2 = 1;
        }
        this.a = i2;
        Object j = arrj.j(arrayList, this);
        if (j == arplVar) {
            return arplVar;
        }
        return j;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        jro jroVar = new jro(this.b, this.c, this.d, this.e, arpeVar);
        jroVar.f = obj;
        return jroVar;
    }
}
