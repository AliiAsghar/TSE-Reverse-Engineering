package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.HandleLowStorageAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzp implements rhp {
    private final armf a;

    public qzp(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final HandleLowStorageAction c(Parcel parcel) {
        wzl wzlVar = (wzl) this.a.b();
        wzlVar.getClass();
        parcel.getClass();
        return new HandleLowStorageAction(wzlVar, parcel);
    }
}
