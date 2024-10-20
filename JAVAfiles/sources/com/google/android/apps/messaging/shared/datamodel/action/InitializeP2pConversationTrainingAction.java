package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.apwt;
import defpackage.qyy;
import defpackage.qzx;
import defpackage.xze;
import defpackage.yid;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InitializeP2pConversationTrainingAction extends Action<Void> {
    private final Optional b;
    private static final xze a = xze.g("Bugle", "InitializeP2pConversationTrainingAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(18);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzx No();
    }

    public InitializeP2pConversationTrainingAction(Optional<apwt<yid>> optional) {
        super(amdy.INITIALIZE_P2P_CONVERSATION_TRAINING_ACTION);
        this.b = optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("InitializeP2pConversationTrainingAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InitializeP2pConversationTraining.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        if (this.b.isEmpty()) {
            a.l("P2pConversationTrainingUtils not available, cannot initialize training");
            return null;
        }
        a.l("Initializing p2p conversation training.");
        ((yid) ((apwt) this.b.get()).b()).c();
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public InitializeP2pConversationTrainingAction(Optional<apwt<yid>> optional, Parcel parcel) {
        super(parcel, amdy.INITIALIZE_P2P_CONVERSATION_TRAINING_ACTION);
        this.b = optional;
    }
}
