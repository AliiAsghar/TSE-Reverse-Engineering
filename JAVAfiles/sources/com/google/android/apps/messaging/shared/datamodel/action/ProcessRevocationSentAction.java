package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.ray;
import defpackage.rde;
import defpackage.rve;
import defpackage.rwd;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessRevocationSentAction extends Action<Void> {
    private final armf b;
    private static final xze a = xze.g("BugleDataModel", "ProcessRevocationSentAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(17);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rde NE();
    }

    public ProcessRevocationSentAction(armf armfVar, Parcel parcel) {
        super(parcel, amdy.PROCESS_REVOCATION_SENT_ACTION);
        this.b = armfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessRevocationSentAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        rve b = rve.b(this.u.f(), "rcs_message_id");
        MessageCoreData r = ((rwd) this.b.b()).r(b);
        if (r != null) {
            if (r.j() == 15) {
                r.aQ(r.q());
                ((rwd) this.b.b()).N(r);
                xyo c = a.c();
                c.H("Revocation sent for message");
                c.c(r.B());
                c.g(b);
                c.q();
                return null;
            }
            xyo e = a.e();
            e.H("Revocation sent, but message is not pending revocation.");
            e.z("rcsMessageId", b);
            e.x("status", r.j());
            e.q();
            return null;
        }
        xyo e2 = a.e();
        e2.H("Revocation sent but message is missing.");
        e2.z("rcsMessageId ", b);
        e2.q();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessRevocationSent.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessRevocationSentAction(armf armfVar, rve rveVar) {
        super(amdy.PROCESS_REVOCATION_SENT_ACTION);
        if (rve.l(rveVar)) {
            rve.h(this.u.f(), "rcs_message_id", rveVar);
        }
        this.b = armfVar;
    }
}
