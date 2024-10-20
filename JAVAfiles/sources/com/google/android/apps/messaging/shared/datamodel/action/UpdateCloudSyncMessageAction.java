package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.ndb;
import defpackage.qik;
import defpackage.rfw;
import defpackage.rgn;
import defpackage.vjs;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateCloudSyncMessageAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(10);
    public final armf a;
    public final armf b;
    private final Context c;
    private final vjs d;
    private final agnq e;
    private final qik f;
    private final vjs g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgn Ob();
    }

    public UpdateCloudSyncMessageAction(Context context, armf armfVar, armf armfVar2, vjs vjsVar, vjs vjsVar2, agnq agnqVar, qik qikVar, Parcel parcel) {
        super(parcel, amdy.UPDATE_CLOUD_SYNC_MESSAGE_ACTION);
        this.c = context;
        this.a = armfVar;
        this.b = armfVar2;
        this.d = vjsVar;
        this.g = vjsVar2;
        this.e = agnqVar;
        this.f = qikVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateCloudSyncMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        ArrayList arrayList = new ArrayList();
        if (((Boolean) this.e.c("UpdateCloudSyncMessageAction#executeAction", new ndb(this, arrayList, 14, null))).booleanValue()) {
            this.d.c();
            this.g.h();
        }
        if (!arrayList.isEmpty()) {
            this.f.d(this.c, (String[]) arrayList.toArray(new String[0]));
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateCloudSyncMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
