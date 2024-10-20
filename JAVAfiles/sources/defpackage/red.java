package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class red implements rhp {
    private final armf a;

    public red(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ReceiveP2pSuggestionsAction c(Parcel parcel) {
        reh rehVar = (reh) this.a.b();
        rehVar.getClass();
        parcel.getClass();
        return new ReceiveP2pSuggestionsAction(rehVar, parcel);
    }
}
