package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RedownloadMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class riz implements rhp {
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

    public riz() {
        throw null;
    }

    public final void a(MessageIdType messageIdType) {
        b(messageIdType).t();
    }

    public final /* bridge */ /* synthetic */ Action b(MessageIdType messageIdType) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.c.b();
        xnvVar.getClass();
        qoq qoqVar = (qoq) this.d.b();
        qoqVar.getClass();
        rjk rjkVar = (rjk) this.e.b();
        rjkVar.getClass();
        rji rjiVar = (rji) this.f.b();
        rjiVar.getClass();
        rcz rczVar = (rcz) this.g.b();
        rczVar.getClass();
        messageIdType.getClass();
        return new RedownloadMessageAction(context, this.b, xnvVar, qoqVar, rjkVar, rjiVar, rczVar, this.h, this.i, this.j, this.k, messageIdType, false);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.c.b();
        xnvVar.getClass();
        qoq qoqVar = (qoq) this.d.b();
        qoqVar.getClass();
        rjk rjkVar = (rjk) this.e.b();
        rjkVar.getClass();
        ((rji) this.f.b()).getClass();
        rcz rczVar = (rcz) this.g.b();
        rczVar.getClass();
        parcel.getClass();
        return new RedownloadMessageAction(context, this.b, xnvVar, qoqVar, rjkVar, rczVar, this.h, this.i, this.j, this.k, parcel);
    }

    public riz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
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
    }
}
