package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.rfw;
import defpackage.rgq;
import defpackage.rhl;
import defpackage.rxc;
import defpackage.tbt;
import defpackage.xyl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateMessagePartSizeAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(16);
    private final armf a;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgq Oe();
    }

    public UpdateMessagePartSizeAction(armf armfVar, Parcel parcel) {
        super(parcel, amdy.UPDATE_MESSAGE_PART_SIZE_ACTION);
        this.a = armfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateMessagePartSizeAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        rhl rhlVar = this.u;
        String l = rhlVar.l("part_id");
        int a2 = rhlVar.a("width");
        int a3 = rhlVar.a("height");
        MessagePartCoreData a4 = ((rxc) this.a.b()).a(l);
        if (a4 != null) {
            rxc rxcVar = (rxc) this.a.b();
            ConversationIdType z = a4.z();
            MessageIdType A = a4.A();
            akrh e = aktp.e("MessagePartDatabaseOperations#updateMessagePartSize");
            try {
                xyl.h();
                tbt tbtVar = new tbt();
                tbtVar.aj("updateMessagePartSize");
                tbtVar.u(a2);
                tbtVar.j(a3);
                rxcVar.e(z, A, l, tbtVar);
                e.close();
                return null;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateMessagePartSize.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateMessagePartSizeAction(armf armfVar, String str, int i, int i2) {
        super(amdy.UPDATE_MESSAGE_PART_SIZE_ACTION);
        this.u.v("part_id", str);
        this.u.r("width", i);
        this.u.r("height", i2);
        this.a = armfVar;
    }
}
