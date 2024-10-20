package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfd implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;

    public rfd(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
        armfVar.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
        this.i = armfVar9;
    }

    public final /* bridge */ /* synthetic */ Action a() {
        Context context = (Context) this.a.b();
        context.getClass();
        mfo mfoVar = (mfo) this.b.b();
        mfoVar.getClass();
        mbl mblVar = (mbl) this.c.b();
        mblVar.getClass();
        lig ligVar = (lig) this.d.b();
        ligVar.getClass();
        xhe xheVar = (xhe) this.e.b();
        xheVar.getClass();
        xhl xhlVar = (xhl) this.f.b();
        xhlVar.getClass();
        anen anenVar = (anen) this.g.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.h.b();
        anenVar2.getClass();
        return new RecurringTelemetryUploaderAction(context, mfoVar, mblVar, ligVar, xheVar, xhlVar, anenVar, anenVar2, this.i);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        mfo mfoVar = (mfo) this.b.b();
        mfoVar.getClass();
        mbl mblVar = (mbl) this.c.b();
        mblVar.getClass();
        lig ligVar = (lig) this.d.b();
        ligVar.getClass();
        anen anenVar = (anen) this.g.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.h.b();
        anenVar2.getClass();
        xhe xheVar = (xhe) this.e.b();
        xheVar.getClass();
        xhl xhlVar = (xhl) this.f.b();
        xhlVar.getClass();
        parcel.getClass();
        return new RecurringTelemetryUploaderAction(context, mfoVar, mblVar, ligVar, anenVar, anenVar2, xheVar, xhlVar, this.i, parcel);
    }
}
