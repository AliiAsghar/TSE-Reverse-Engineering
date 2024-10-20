package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.MarkConversationNotYetDeliveredAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rbb implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;

    public rbb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
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

    public final /* bridge */ /* synthetic */ Action a(rve rveVar, boolean z) {
        vqu vquVar = (vqu) this.c.b();
        vquVar.getClass();
        mbl mblVar = (mbl) this.d.b();
        mblVar.getClass();
        agnq agnqVar = (agnq) this.e.b();
        agnqVar.getClass();
        uie uieVar = (uie) this.f.b();
        uieVar.getClass();
        rveVar.getClass();
        return new MarkConversationNotYetDeliveredAction(this.a, this.b, vquVar, mblVar, agnqVar, uieVar, rveVar, z);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        vqu vquVar = (vqu) this.c.b();
        vquVar.getClass();
        mbl mblVar = (mbl) this.d.b();
        mblVar.getClass();
        agnq agnqVar = (agnq) this.e.b();
        agnqVar.getClass();
        uie uieVar = (uie) this.f.b();
        uieVar.getClass();
        parcel.getClass();
        return new MarkConversationNotYetDeliveredAction(this.a, this.b, vquVar, mblVar, agnqVar, uieVar, parcel);
    }
}
