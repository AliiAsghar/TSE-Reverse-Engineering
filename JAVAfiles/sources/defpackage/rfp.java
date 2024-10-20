package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfp implements rjk {
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

    public rfp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.g = armfVar6;
        armfVar7.getClass();
        this.h = armfVar7;
        armfVar8.getClass();
        this.i = armfVar8;
        armfVar9.getClass();
        this.j = armfVar9;
        armfVar10.getClass();
        this.k = armfVar10;
        armfVar11.getClass();
        this.l = armfVar11;
    }

    @Override // defpackage.rjk
    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType) {
        xnv xnvVar = (xnv) this.c.b();
        xnvVar.getClass();
        mbl mblVar = (mbl) this.d.b();
        mblVar.getClass();
        anen anenVar = (anen) this.e.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.f.b();
        anenVar2.getClass();
        zxy zxyVar = (zxy) this.g.b();
        zxyVar.getClass();
        xqc xqcVar = (xqc) this.h.b();
        xqcVar.getClass();
        ((pyv) this.l.b()).getClass();
        messageIdType.getClass();
        return new ResumeRcsFileTransferAction(this.b, xnvVar, mblVar, anenVar, anenVar2, zxyVar, xqcVar, this.i, this.j, this.k, messageIdType);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        xnv xnvVar = (xnv) this.c.b();
        xnvVar.getClass();
        mbl mblVar = (mbl) this.d.b();
        mblVar.getClass();
        anen anenVar = (anen) this.e.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.f.b();
        anenVar2.getClass();
        zxy zxyVar = (zxy) this.g.b();
        zxyVar.getClass();
        xqc xqcVar = (xqc) this.h.b();
        xqcVar.getClass();
        ((pyv) this.l.b()).getClass();
        parcel.getClass();
        return new ResumeRcsFileTransferAction(this.b, xnvVar, mblVar, anenVar, anenVar2, zxyVar, xqcVar, this.i, this.j, this.k, parcel);
    }
}
