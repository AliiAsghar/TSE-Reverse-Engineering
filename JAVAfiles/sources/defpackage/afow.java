package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afow extends arsm {
    final /* synthetic */ afox a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afow(Object obj, afox afoxVar) {
        super(obj);
        this.a = afoxVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        afjd afjdVar;
        int i;
        List list = (List) obj2;
        List list2 = (List) obj;
        if (this.a.p.indexOfKey(0) < 0) {
            this.a.p.put(0, 0);
        }
        if (!this.a.g.isEmpty()) {
            afox afoxVar = this.a;
            hc a = hg.a(new afjg(aqjn.av(list2, afoxVar.q), aqjn.av(list, this.a.q), aeui.o, aeui.p, aeui.q));
            ArrayList<afje> arrayList = new ArrayList();
            a.b(new afjf(arrayList));
            int i2 = afoxVar.q;
            if (arrayList.size() < 5) {
                int i3 = i2;
                for (afje afjeVar : arrayList) {
                    if ((afjeVar instanceof afjd) && (i = (afjdVar = (afjd) afjeVar).a) < i2) {
                        i3 -= arrn.s(afjdVar.b + i, i2) - i;
                    }
                }
                if (i3 > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((afje) it.next()).a(afoxVar);
                    }
                    return;
                }
            }
            afoxVar.p();
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
