package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.amdy;
import defpackage.armf;
import defpackage.qzi;
import defpackage.rdk;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RequestSmartSuggestionsAction extends Action<Void> {
    private final armf b;
    private static final xze a = xze.g("Bugle", "RequestSmartSuggestionsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(16);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzi Pw();
    }

    public RequestSmartSuggestionsAction(armf armfVar, Parcel parcel) {
        super(parcel, amdy.REQUEST_P2P_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = armfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("RequestSmartSuggestionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RequestP2pConversationSuggestions.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        a.m("Action was called even though debug smart replies are not enabled.");
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul fx() {
        a.m("Action was called even though debug smart replies are not enabled.");
        return aktp.ag(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
