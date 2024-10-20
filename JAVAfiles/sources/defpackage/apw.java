package defpackage;

import defpackage.aqq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apw extends arrp implements arqr<Integer, ArrayList<armo<? extends Integer, ? extends dqs>>> {
    final /* synthetic */ aqq a;
    final /* synthetic */ apv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apw(aqq aqqVar, apv apvVar) {
        super(1);
        this.a = aqqVar;
        this.b = apvVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aqq.c c = this.a.c(((Number) obj).intValue());
        int i = c.a;
        ArrayList arrayList = new ArrayList(c.b.size());
        List list = c.b;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            apv apvVar = this.b;
            long j = ((apc) list.get(i3)).a;
            arrayList.add(new armo(Integer.valueOf(i), new dqs(apvVar.c(i2, 1))));
            i++;
            i2++;
        }
        return arrayList;
    }
}
