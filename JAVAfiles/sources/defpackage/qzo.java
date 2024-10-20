package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.HandleIncomingRcsGroupChatInvitationAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzo implements rhp {
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
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;

    public qzo(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14) {
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
        armfVar11.getClass();
        this.k = armfVar11;
        armfVar12.getClass();
        this.l = armfVar12;
        armfVar13.getClass();
        this.m = armfVar13;
        armfVar14.getClass();
        this.n = armfVar14;
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        uhg uhgVar = (uhg) this.b.b();
        uhgVar.getClass();
        ujv ujvVar = (ujv) this.c.b();
        ujvVar.getClass();
        ryg rygVar = (ryg) this.d.b();
        rygVar.getClass();
        xnv xnvVar = (xnv) this.i.b();
        xnvVar.getClass();
        tqx tqxVar = (tqx) this.j.b();
        tqxVar.getClass();
        agnq agnqVar = (agnq) this.k.b();
        agnqVar.getClass();
        vsh vshVar = (vsh) this.l.b();
        vshVar.getClass();
        parcel.getClass();
        return new HandleIncomingRcsGroupChatInvitationAction(context, uhgVar, ujvVar, rygVar, this.e, this.f, this.g, this.h, xnvVar, tqxVar, agnqVar, vshVar, this.m, this.n, parcel);
    }
}
