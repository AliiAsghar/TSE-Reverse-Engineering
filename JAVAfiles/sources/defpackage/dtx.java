package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtx extends arsm {
    final /* synthetic */ dty a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtx(dty dtyVar, kkc kkcVar) {
        super(kkcVar);
        this.a = dtyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [duw] */
    @Override // defpackage.arsm
    public final /* bridge */ /* synthetic */ void a(artm artmVar, Object obj, Object obj2) {
        dva dvaVar;
        kkc kkcVar = (kkc) obj2;
        String c = artmVar.c();
        kkcVar.getClass();
        if (((kkc) kkcVar.c).J() && ((kkc) kkcVar.b).J()) {
            dvaVar = ((kkc) kkcVar.a).I();
        } else {
            dva dvaVar2 = new dva(new char[0]);
            kkc kkcVar2 = (kkc) kkcVar.c;
            if (!kkcVar2.J()) {
                dvaVar2.r("min", kkcVar2.I());
            }
            kkc kkcVar3 = (kkc) kkcVar.b;
            if (!kkcVar3.J()) {
                dvaVar2.r("max", kkcVar3.I());
            }
            dvaVar2.r(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, ((kkc) kkcVar.a).I());
            dvaVar = dvaVar2;
        }
        this.a.b.r(c, dvaVar);
    }
}
