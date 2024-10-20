package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alvi;
import defpackage.amdy;
import defpackage.anen;
import defpackage.armf;
import defpackage.imi;
import defpackage.mbl;
import defpackage.rdk;
import defpackage.rjk;
import defpackage.rvc;
import defpackage.xnv;
import defpackage.xqc;
import defpackage.zxy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResumeRcsFileTransferAction extends Action<Void> implements Parcelable {
    public final armf b;
    public final xnv c;
    public final mbl d;
    public final anen e;
    public final anen f;
    public final xqc g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final zxy k;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(19);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rjk db();
    }

    public ResumeRcsFileTransferAction(armf armfVar, xnv xnvVar, mbl mblVar, anen anenVar, anen anenVar2, zxy zxyVar, xqc xqcVar, armf armfVar2, armf armfVar3, armf armfVar4, Parcel parcel) {
        super(parcel, amdy.RESUME_RCS_FILE_TRANSFER_ACTION);
        this.b = armfVar;
        this.c = xnvVar;
        this.d = mblVar;
        this.e = anenVar;
        this.f = anenVar2;
        this.k = zxyVar;
        this.g = xqcVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = armfVar4;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ResumeRcsFileTransferAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ResumeRcsFileTransferAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        akrh e = aktp.e("ResumeRcsFileTransferAction.executeAction");
        try {
            akul aj = aktp.aj(new imi(this, rvc.b(this.u.l("message_id")), 14), this.e);
            e.b(aj);
            e.close();
            return aj;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fA() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ResumeRcsFileTransferAction(armf armfVar, xnv xnvVar, mbl mblVar, anen anenVar, anen anenVar2, zxy zxyVar, xqc xqcVar, armf armfVar2, armf armfVar3, armf armfVar4, MessageIdType messageIdType) {
        super(amdy.RESUME_RCS_FILE_TRANSFER_ACTION);
        this.b = armfVar;
        this.c = xnvVar;
        this.d = mblVar;
        this.e = anenVar;
        this.f = anenVar2;
        this.k = zxyVar;
        this.g = xqcVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = armfVar4;
        this.u.v("message_id", messageIdType.a());
    }
}
