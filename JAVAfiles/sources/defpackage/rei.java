package defpackage;

import android.content.ContentValues;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rei implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;

    public rei(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }

    public final /* bridge */ /* synthetic */ Action a(ContentValues contentValues) {
        contentValues.getClass();
        rfa rfaVar = (rfa) this.a.b();
        rfaVar.getClass();
        anen anenVar = (anen) this.b.b();
        anenVar.getClass();
        ahqr ahqrVar = (ahqr) this.c.b();
        ahqrVar.getClass();
        lqn lqnVar = (lqn) this.d.b();
        lqnVar.getClass();
        return new ReceiveSmsMessageAction(contentValues, rfaVar, anenVar, ahqrVar, lqnVar);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        parcel.getClass();
        rfa rfaVar = (rfa) this.a.b();
        rfaVar.getClass();
        anen anenVar = (anen) this.b.b();
        anenVar.getClass();
        ahqr ahqrVar = (ahqr) this.c.b();
        ahqrVar.getClass();
        lqn lqnVar = (lqn) this.d.b();
        lqnVar.getClass();
        return new ReceiveSmsMessageAction(parcel, rfaVar, anenVar, ahqrVar, lqnVar);
    }
}
