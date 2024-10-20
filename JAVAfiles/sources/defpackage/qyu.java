package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ChangeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyu implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;

    public qyu(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
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
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ChangeParticipantsAction c(Parcel parcel) {
        uhg uhgVar = (uhg) this.c.b();
        uhgVar.getClass();
        ujv ujvVar = (ujv) this.d.b();
        ujvVar.getClass();
        ryg rygVar = (ryg) this.e.b();
        rygVar.getClass();
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        mho mhoVar = (mho) this.g.b();
        mhoVar.getClass();
        agnq agnqVar = (agnq) this.h.b();
        agnqVar.getClass();
        vsh vshVar = (vsh) this.i.b();
        vshVar.getClass();
        parcel.getClass();
        return new ChangeParticipantsAction(this.a, this.b, uhgVar, ujvVar, rygVar, xnvVar, mhoVar, agnqVar, vshVar, this.j, parcel);
    }

    public final /* bridge */ /* synthetic */ Action b(Bundle bundle) {
        uhg uhgVar = (uhg) this.c.b();
        uhgVar.getClass();
        ujv ujvVar = (ujv) this.d.b();
        ujvVar.getClass();
        ryg rygVar = (ryg) this.e.b();
        rygVar.getClass();
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        mho mhoVar = (mho) this.g.b();
        mhoVar.getClass();
        agnq agnqVar = (agnq) this.h.b();
        agnqVar.getClass();
        vsh vshVar = (vsh) this.i.b();
        vshVar.getClass();
        return new ChangeParticipantsAction(this.a, this.b, uhgVar, ujvVar, rygVar, xnvVar, mhoVar, agnqVar, vshVar, this.j, bundle);
    }
}
