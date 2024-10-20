package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alvi;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anen;
import defpackage.armf;
import defpackage.prf;
import defpackage.ray;
import defpackage.rbg;
import defpackage.rbh;
import defpackage.xyl;
import defpackage.yhx;
import defpackage.zxy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PauseRcsFileTransferAction extends Action<Void> {
    public final anen b;
    public final armf c;
    public final armf d;
    public final zxy e;
    private final Context f;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(5);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rbh Nu();
    }

    public PauseRcsFileTransferAction(Context context, anen anenVar, armf armfVar, zxy zxyVar, armf armfVar2, Parcel parcel) {
        super(parcel, amdy.PAUSE_RCS_FILE_TRANSFER_ACTION);
        this.f = context;
        this.b = anenVar;
        this.c = armfVar;
        this.e = zxyVar;
        this.d = armfVar2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("PauseRcsFileTransferAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.PauseFileTransfer.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        if (yhx.g(this.f)) {
            xyl.c("PauseRcsFileTransferAction. Secondary user can't pause a file transfer");
            return aktp.ag(null);
        }
        return aktp.ai(new rbg(this, 0), this.b).i(new prf(this, 17), andi.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public PauseRcsFileTransferAction(Context context, anen anenVar, armf armfVar, zxy zxyVar, armf armfVar2, MessageIdType messageIdType) {
        super(amdy.PAUSE_RCS_FILE_TRANSFER_ACTION);
        this.f = context;
        this.b = anenVar;
        this.c = armfVar;
        this.e = zxyVar;
        this.d = armfVar2;
        this.u.v("rcs_ft_message_id", messageIdType.a());
    }
}
