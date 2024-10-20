package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.EnsureConnectivityStabilizedAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qze implements rhp {
    public final armf a;
    public final armf b;

    public qze(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnsureConnectivityStabilizedAction c(Parcel parcel) {
        xyt xytVar = (xyt) this.a.b();
        xytVar.getClass();
        mbl mblVar = (mbl) this.b.b();
        mblVar.getClass();
        parcel.getClass();
        return new EnsureConnectivityStabilizedAction(xytVar, mblVar, parcel);
    }
}
