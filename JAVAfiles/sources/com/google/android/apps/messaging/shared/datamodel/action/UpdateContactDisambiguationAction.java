package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.rfw;
import defpackage.rhl;
import defpackage.soz;
import defpackage.tpk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateContactDisambiguationAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(11);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        void Pf();
    }

    public UpdateContactDisambiguationAction(Parcel parcel) {
        super(parcel, amdy.UPDATE_CONTACT_DISAMBIGUATION_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateContactDisambiguationAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        rhl rhlVar = this.u;
        tpk c = soz.c();
        c.k(rhlVar.l("contact_key"));
        c.l(this.u.l("new_msisdn"));
        c.j().h();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateContactDisambiguation.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
