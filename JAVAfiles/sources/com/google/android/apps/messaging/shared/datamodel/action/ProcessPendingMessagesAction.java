package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.ray;
import defpackage.rbk;
import defpackage.rje;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessPendingMessagesAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(14);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rje cX();
    }

    public ProcessPendingMessagesAction() {
        super(amdy.PROCESS_PENDING_MESSAGES_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessPendingMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        rbk.d(this.u.b("reason", 0), this);
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessPendingMessages.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessPendingMessagesAction(int i) {
        super(amdy.PROCESS_PENDING_MESSAGES_ACTION);
        this.u.r("reason", i);
    }

    public ProcessPendingMessagesAction(Parcel parcel) {
        super(parcel, amdy.PROCESS_PENDING_MESSAGES_ACTION);
    }
}
