package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SelfParticipantsRefreshAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rft implements rhp {
    private final armf a;
    private final armf b;

    public rft(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SelfParticipantsRefreshAction c(Parcel parcel) {
        parcel.getClass();
        return new SelfParticipantsRefreshAction(this.a, this.b, parcel);
    }

    public final /* bridge */ /* synthetic */ ThrottledAction b() {
        return new SelfParticipantsRefreshAction(this.a, this.b);
    }
}
