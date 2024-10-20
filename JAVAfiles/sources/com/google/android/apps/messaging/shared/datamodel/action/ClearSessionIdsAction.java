package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.eyg;
import defpackage.qyy;
import defpackage.qzi;
import defpackage.uhj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClearSessionIdsAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(2);
    private final uhj a;
    private final agnq b;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzi Pt();
    }

    public ClearSessionIdsAction(uhj uhjVar, agnq agnqVar) {
        super(amdy.CLEAR_SESSION_IDS_ACTION);
        this.a = uhjVar;
        this.b = agnqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ClearSessionIdsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        this.b.e("ClearSessionIdsAction.executeAction", new eyg(6));
        this.a.f("ClearSessionIdsAction");
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ClearSessionsIds.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ClearSessionIdsAction(uhj uhjVar, agnq agnqVar, Parcel parcel) {
        super(parcel, amdy.CLEAR_SESSION_IDS_ACTION);
        this.a = uhjVar;
        this.b = agnqVar;
    }
}
