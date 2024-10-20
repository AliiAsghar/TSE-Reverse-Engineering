package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.eyq;
import defpackage.qyy;
import defpackage.qyz;
import defpackage.rji;
import defpackage.sni;
import defpackage.uhj;
import defpackage.xyl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClearCloudSyncMessagesAction extends Action<Void> implements Parcelable {
    public final rji b;
    public final uhj c;
    private final agnq d;
    public static final String a = "SELECT " + sni.c.a.toString() + " FROM conversations LEFT OUTER JOIN messages ON (" + sni.c.a.toString() + " = " + MessagesTable.c.b.toString() + ") WHERE " + MessagesTable.c.a.toString() + " IS NULL AND " + sni.c.L.toString() + " = 1";
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(0);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qyz Ne();
    }

    public ClearCloudSyncMessagesAction(rji rjiVar, uhj uhjVar, agnq agnqVar, Parcel parcel) {
        super(parcel, amdy.CLEAR_CLOUD_SYNC_MESSAGES_ACTION);
        this.b = rjiVar;
        this.c = uhjVar;
        this.d = agnqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ClearCloudSyncMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ClearCloudSyncMessages.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        boolean z;
        long d = this.u.d("cutoff_timestamp");
        if (d > 0) {
            z = true;
        } else {
            z = false;
        }
        xyl.k(z);
        this.d.d(new eyq(this, d, 2));
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
