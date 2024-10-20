package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rav implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;

    public rav(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
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
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InsertRcsMessageInTelephonyAction c(Parcel parcel) {
        parcel.getClass();
        vqm vqmVar = (vqm) this.b.b();
        vqmVar.getClass();
        lpg lpgVar = (lpg) this.c.b();
        lpgVar.getClass();
        anen anenVar = (anen) this.d.b();
        anenVar.getClass();
        return new InsertRcsMessageInTelephonyAction(parcel, this.a, vqmVar, lpgVar, anenVar, this.e);
    }
}
