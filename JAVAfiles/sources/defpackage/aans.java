package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aans extends gdk {
    private final Map a;

    public aans(Map map) {
        this.a = map;
    }

    @Override // defpackage.gdk
    public final /* bridge */ /* synthetic */ Object a(gdl gdlVar) {
        throw new armn("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.gdk
    public final Object b(gdg gdgVar, arpe arpeVar) {
        int i;
        Integer num;
        Integer num2 = (Integer) gdgVar.a();
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 1;
        }
        int min = Math.min((gdgVar.b + i) - 1, 100);
        artb artbVar = new artb(i, min);
        ArrayList arrayList = new ArrayList(aqjn.J(artbVar, 10));
        arob it = artbVar.iterator();
        while (it.a) {
            int a = it.a();
            aanr aanrVar = (aanr) this.a.get(new Integer(a));
            if (aanrVar == null) {
                aanrVar = new aanr(a, a.bV(a, "Place Holder "), "run", yyo.r);
            }
            arrayList.add(aanrVar);
        }
        Integer num3 = null;
        if (i == 1) {
            num = null;
        } else {
            num = new Integer(Math.max(i - gdgVar.b, 1));
        }
        if (min != 100) {
            num3 = new Integer(min + 1);
        }
        return new gdj(arrayList, num, num3);
    }
}
