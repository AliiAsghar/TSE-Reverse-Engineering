package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyw implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;

    public qyw(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
        armfVar10.getClass();
        this.j = armfVar10;
        armfVar11.getClass();
        this.k = armfVar11;
        armfVar12.getClass();
        this.l = armfVar12;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [apwt, java.lang.Object] */
    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        qyw qywVar = (qyw) this.a.b();
        qywVar.getClass();
        trn trnVar = (trn) this.b.b();
        trnVar.getClass();
        ?? b = this.c.b();
        b.getClass();
        anen anenVar = (anen) this.g.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.h.b();
        anenVar2.getClass();
        xnv xnvVar = (xnv) this.i.b();
        xnvVar.getClass();
        mbl mblVar = (mbl) this.j.b();
        mblVar.getClass();
        wpp wppVar = (wpp) this.k.b();
        wppVar.getClass();
        parcel.getClass();
        return new CheckActiveDesktopIsAliveAsyncAction(qywVar, trnVar, b, this.d, this.e, this.f, anenVar, anenVar2, xnvVar, mblVar, wppVar, this.l, parcel);
    }
}
