package defpackage;

import defpackage.ajw;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class apg extends arrp implements arqv<dqv, dqs, aqo> {
    final /* synthetic */ amj a;
    final /* synthetic */ apb b;
    final /* synthetic */ ajw.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apg(amj amjVar, apb apbVar, ajw.b bVar) {
        super(2);
        this.a = amjVar;
        this.b = apbVar;
        this.c = bVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        dqv dqvVar = (dqv) obj;
        long j = ((dqs) obj2).a;
        if (dqs.b(j) == Integer.MAX_VALUE) {
            aju.c("LazyVerticalGrid's width should be bound by parent.");
        }
        int b = dqs.b(j) - dqvVar.eo(amh.b(this.a, drk.a) + amh.a(this.a, drk.a));
        apb apbVar = this.b;
        ajw.b bVar = this.c;
        int[] aI = aqjn.aI(apbVar.a(dqvVar, b, dqvVar.eo(((ajw.d) bVar).a)));
        int[] iArr = new int[aI.length];
        bVar.b(dqvVar, b, aI, drk.a, iArr);
        return new aqo(aI, iArr);
    }
}
