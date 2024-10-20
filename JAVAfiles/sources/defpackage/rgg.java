package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SetDittoSessionInactiveAction;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgg implements rhp {
    private final armf a;

    public rgg(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SetDittoSessionInactiveAction c(Parcel parcel) {
        Optional optional = (Optional) ((apxx) this.a).a;
        parcel.getClass();
        return new SetDittoSessionInactiveAction(optional, parcel);
    }
}
