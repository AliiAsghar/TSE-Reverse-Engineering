package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ParticipantFullRefreshAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rbf implements rhp {
    private final armf a;

    public rbf(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public final /* bridge */ /* synthetic */ Action a() {
        uhc uhcVar = (uhc) this.a.b();
        uhcVar.getClass();
        return new ParticipantFullRefreshAction(uhcVar);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        uhc uhcVar = (uhc) this.a.b();
        uhcVar.getClass();
        parcel.getClass();
        return new ParticipantFullRefreshAction(uhcVar, parcel);
    }
}
