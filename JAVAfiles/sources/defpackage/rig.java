package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.execution.DeferBackgroundWorkAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rig implements rhp {
    public final armf a;

    public rig(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DeferBackgroundWorkAction c(Parcel parcel) {
        rib ribVar = (rib) this.a.b();
        ribVar.getClass();
        parcel.getClass();
        return new DeferBackgroundWorkAction(ribVar, parcel);
    }
}
