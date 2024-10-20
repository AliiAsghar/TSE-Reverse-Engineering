package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRevocationSentAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rde implements rhp {
    private final armf a;

    public rde(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessRevocationSentAction c(Parcel parcel) {
        parcel.getClass();
        return new ProcessRevocationSentAction(this.a, parcel);
    }

    public final /* bridge */ /* synthetic */ Action b(rve rveVar) {
        return new ProcessRevocationSentAction(this.a, rveVar);
    }
}
