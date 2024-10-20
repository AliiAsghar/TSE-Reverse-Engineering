package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.rbc;
import defpackage.rfw;
import defpackage.rgg;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetDittoSessionInactiveAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(4);
    private final Optional a;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgg NW();
    }

    public SetDittoSessionInactiveAction(Optional optional, Parcel parcel) {
        super(parcel, amdy.SET_DITTO_SESSION_INACTIVE_ACTION);
        this.a = optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SetDittoSessionInactiveAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        this.a.ifPresent(new rbc(4));
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SetDittoSessionInactive.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
