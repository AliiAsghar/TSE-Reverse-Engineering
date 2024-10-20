package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aruf implements artx {
    final /* synthetic */ artx a;
    final /* synthetic */ Comparator b;

    public aruf(artx artxVar, Comparator comparator) {
        this.a = artxVar;
        this.b = comparator;
    }

    @Override // defpackage.artx
    public final Iterator a() {
        ArrayList arrayList = new ArrayList();
        aruj arujVar = new aruj((artt) this.a, 1);
        while (arujVar.hasNext()) {
            arrayList.add(arujVar.next());
        }
        aqjn.M(arrayList, this.b);
        return arrayList.iterator();
    }
}
