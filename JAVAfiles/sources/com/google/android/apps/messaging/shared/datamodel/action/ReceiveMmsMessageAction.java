package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.amdy;
import defpackage.arpe;
import defpackage.arpj;
import defpackage.arwf;
import defpackage.qjh;
import defpackage.qsk;
import defpackage.rdk;
import defpackage.rdo;
import defpackage.reb;
import defpackage.rec;
import defpackage.rhl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReceiveMmsMessageAction extends Action<MessageCoreData> implements Parcelable {
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new rdk(3);
    private final rec a;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rdo NJ();
    }

    public ReceiveMmsMessageAction(int i, byte[] bArr, long j, int i2, int i3, rec recVar) {
        super(amdy.RECEIVE_MMS_MESSAGE_ACTION);
        this.a = recVar;
        this.u.r("sub_id", i);
        this.u.q("push_data", bArr);
        this.u.s("message_logging_id", j);
        this.u.r("mcc_mnc", i2);
        this.u.r("carrier_id", i3);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReceiveMmsMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveMmsMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        akul c;
        reb a2 = this.a.a(this);
        rhl rhlVar = this.u;
        rhlVar.getClass();
        c = qjh.c(a2.F, arpj.a, arwf.a, new qsk(a2, rhlVar, (arpe) null, 13, (byte[]) null));
        return c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fA() {
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul fx() {
        akul c;
        reb a2 = this.a.a(this);
        rhl rhlVar = this.u;
        rhlVar.getClass();
        c = qjh.c(a2.F, arpj.a, arwf.a, new qsk(a2, rhlVar, (arpe) null, 12));
        return c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReceiveMmsMessageAction(Parcel parcel, rec recVar) {
        super(parcel, amdy.RECEIVE_MMS_MESSAGE_ACTION);
        this.a = recVar;
    }
}
