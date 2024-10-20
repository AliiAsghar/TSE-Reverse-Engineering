package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.amku;
import defpackage.armf;
import defpackage.rdk;
import defpackage.rfm;
import defpackage.rtz;
import defpackage.sng;
import defpackage.uhj;
import defpackage.vsh;
import defpackage.vsi;
import defpackage.vsj;
import defpackage.xyl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResetGroupRcsSessionIdAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(18);
    private final armf a;
    private final vsh b;
    private final uhj c;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rfm NS();
    }

    public ResetGroupRcsSessionIdAction(armf armfVar, vsh vshVar, uhj uhjVar, Parcel parcel) {
        super(parcel, amdy.RESET_GROUP_RCS_SESSION_ID_ACTION);
        this.a = armfVar;
        this.b = vshVar;
        this.c = uhjVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ResetGroupRcsSessionIdAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        akrh e = aktp.e("ResetGroupRcsSessionIdAction.executeAction");
        try {
            long e2 = this.u.e("rcs.intent.extra.sessionid", -1L);
            if (((GroupInfo) this.u.h(RcsIntents.EXTRA_GROUP_INFO)) == null) {
                vsh vshVar = this.b;
                vsi a2 = vsj.a();
                a2.b(false);
                a2.h(true);
                a2.n(amku.RESET_SESSION_ID_EVENT);
                a2.g(false);
                a2.p(e2);
                ConversationIdType a3 = vshVar.a(a2.a());
                if (a3.b()) {
                    xyl.c(defpackage.a.ck(e2, "Cannot find or create conversationId for RCS Chat. Session id: "));
                } else {
                    rtz rtzVar = (rtz) this.a.b();
                    sng sngVar = new sng();
                    sngVar.aj("ResetGroupRcsSessionIdAction#executeAction");
                    sngVar.N(-1L);
                    rtzVar.U(a3, sngVar);
                    this.c.d(a3);
                }
            }
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

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ResetGroupRcsSessionId.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
