package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rek implements armf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ rek(rat ratVar, alog alogVar, alog alogVar2, int i, int i2) {
        this.e = i2;
        this.b = ratVar;
        this.c = alogVar;
        this.d = alogVar2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        if (this.e != 0) {
            xhz xhzVar = (xhz) ((rat) this.b).E.b();
            ?? r2 = this.c;
            ?? r3 = this.d;
            alpt bd = alzz.bd(r2);
            alzz.bd(r3);
            return xhzVar.g(bd, this.a, !((nwo) r0.N.b()).a());
        }
        rfa rfaVar = (rfa) this.b;
        ruu ruuVar = new ruu(((xhz) rfaVar.M.b()).b(((msk) rfaVar.I.b()).q((ParticipantsTable.BindData) this.c), this.a, !((nwo) rfaVar.S.b()).a()));
        ruuVar.b((tqc) this.d);
        return ruuVar.a();
    }

    public /* synthetic */ rek(rfa rfaVar, ParticipantsTable.BindData bindData, int i, tqc tqcVar, int i2) {
        this.e = i2;
        this.b = rfaVar;
        this.c = bindData;
        this.a = i;
        this.d = tqcVar;
    }
}
