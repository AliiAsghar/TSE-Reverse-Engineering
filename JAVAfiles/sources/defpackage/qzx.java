package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.InitializeP2pConversationTrainingAction;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzx implements rhp {
    public final armf a;

    public qzx(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InitializeP2pConversationTrainingAction c(Parcel parcel) {
        Optional optional = (Optional) ((apxx) this.a).a;
        parcel.getClass();
        return new InitializeP2pConversationTrainingAction(optional, parcel);
    }
}
