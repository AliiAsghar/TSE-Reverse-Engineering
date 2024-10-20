package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.andi;
import defpackage.armf;
import defpackage.jat;
import defpackage.qiu;
import defpackage.qyy;
import defpackage.qzk;
import defpackage.rtz;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ForwardIncomingTypingIndicatorToTachyonAction extends Action<Void> {
    private final armf b;
    private final jat c;
    private static final xze a = xze.g("BugleNetwork", "ForwardIncomingTypingIndicatorToTachyonAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(12);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzk Nk();
    }

    public ForwardIncomingTypingIndicatorToTachyonAction(armf armfVar, long j, String str, boolean z, jat jatVar) {
        super(amdy.FORWARD_INCOMING_TYPING_INDICATOR_TO_TACHYON_ACTION);
        this.b = armfVar;
        this.u.s("chat_session_id_key", j);
        if (str != null) {
            this.u.v("user_id_key", str);
        }
        this.u.p("typing_active_key", z);
        this.c = jatVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ForwardIncomingTypingIndicatorToTachyonAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        akrh e = aktp.e("ForwardIncomingTypingIndicatorToTachyonAction.executeAction");
        try {
            ConversationIdType p = ((rtz) this.b.b()).p(this.u.d("chat_session_id_key"));
            if (p.b()) {
                a.q("Couldn't find conversation id.");
            } else {
                String l = this.u.l("user_id_key");
                if (l != null) {
                    this.c.y(p, l, this.u.y("typing_active_key")).k(qiu.b(), andi.a);
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
        return "Bugle.DataModel.Action.ForwardIncomingTypingIndicatorToTachyon.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ForwardIncomingTypingIndicatorToTachyonAction(armf armfVar, jat jatVar, Parcel parcel) {
        super(parcel, amdy.FORWARD_INCOMING_TYPING_INDICATOR_TO_TACHYON_ACTION);
        this.b = armfVar;
        this.c = jatVar;
    }
}
