package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rbh implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;

    public rbh(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
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
    }

    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType) {
        Context context = (Context) this.a.b();
        context.getClass();
        anen anenVar = (anen) this.b.b();
        anenVar.getClass();
        zxy zxyVar = (zxy) this.d.b();
        zxyVar.getClass();
        ((pyv) this.f.b()).getClass();
        messageIdType.getClass();
        return new PauseRcsFileTransferAction(context, anenVar, this.c, zxyVar, this.e, messageIdType);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        anen anenVar = (anen) this.b.b();
        anenVar.getClass();
        zxy zxyVar = (zxy) this.d.b();
        zxyVar.getClass();
        ((pyv) this.f.b()).getClass();
        parcel.getClass();
        return new PauseRcsFileTransferAction(context, anenVar, this.c, zxyVar, this.e, parcel);
    }
}
