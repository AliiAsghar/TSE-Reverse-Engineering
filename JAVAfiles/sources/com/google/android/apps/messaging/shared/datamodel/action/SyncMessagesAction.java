package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alwk;
import defpackage.amdy;
import defpackage.rfw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class SyncMessagesAction extends Action<Void> implements Parcelable {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/SyncMessagesAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(6);

    public SyncMessagesAction(Parcel parcel, amdy amdyVar) {
        super(parcel, amdyVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SyncMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SyncMessages.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        alvg alvgVar = (alvg) a.i();
        alvgVar.Z(alwk.MEDIUM);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/SyncMessagesAction", "executeActionAsync", 55, "SyncMessagesAction.java")).q("SyncMessagesAction was invoked, but should not have been.");
        return aktp.ag(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
