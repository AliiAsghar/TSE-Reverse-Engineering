package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateCloudSyncMessageAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgn implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;

    public rgn(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
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
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateCloudSyncMessageAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        vjs vjsVar = (vjs) this.d.b();
        vjsVar.getClass();
        vjs vjsVar2 = (vjs) this.e.b();
        vjsVar2.getClass();
        agnq agnqVar = (agnq) this.f.b();
        agnqVar.getClass();
        qik qikVar = (qik) this.g.b();
        qikVar.getClass();
        parcel.getClass();
        return new UpdateCloudSyncMessageAction(context, this.b, this.c, vjsVar, vjsVar2, agnqVar, qikVar, parcel);
    }
}
