package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.MarkConversationNotYetDeliveredAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.agno;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.mbl;
import defpackage.ray;
import defpackage.rbb;
import defpackage.rbk;
import defpackage.rve;
import defpackage.uie;
import defpackage.vqt;
import defpackage.vqu;
import defpackage.xyl;
import defpackage.xyo;
import defpackage.xze;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MarkConversationNotYetDeliveredAction extends Action<Void> {
    public final armf b;
    public final armf c;
    public final mbl d;
    public final uie e;
    private final vqu f;
    private final agnq g;
    public static final xze a = xze.g("BugleDataModel", "MarkConversationNotYetDeliveredAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(2);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rbb Ns();
    }

    public MarkConversationNotYetDeliveredAction(armf armfVar, armf armfVar2, vqu vquVar, mbl mblVar, agnq agnqVar, uie uieVar, Parcel parcel) {
        super(parcel, amdy.MARK_CONVERSATION_NOT_YET_DELIVERED_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.f = vquVar;
        this.d = mblVar;
        this.g = agnqVar;
        this.e = uieVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("MarkConversationNotYetDeliveredAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        akrh e = aktp.e("MarkConversationNotYetDeliveredAction.executeAction");
        try {
            final rve b = rve.b(this.u.f(), "rcs_message_id");
            final vqt i = this.f.i(b);
            if (i == vqt.NONE) {
                a.p("client side fallback is disabled.");
            } else {
                int intValue = ((Integer) this.g.a("MarkConversationNotYetDeliveredAction#executeAction", new agno() { // from class: rba
                    @Override // defpackage.agno
                    public final Object a(ukb ukbVar) {
                        MarkConversationNotYetDeliveredAction markConversationNotYetDeliveredAction = MarkConversationNotYetDeliveredAction.this;
                        rwd rwdVar = (rwd) markConversationNotYetDeliveredAction.c.b();
                        rve rveVar = b;
                        MessageCoreData r = rwdVar.r(rveVar);
                        int i2 = 0;
                        if (r != null) {
                            armf armfVar = markConversationNotYetDeliveredAction.b;
                            ConversationIdType z = r.z();
                            if (((rtz) armfVar.b()).ab(z)) {
                                xyo a2 = MarkConversationNotYetDeliveredAction.a.a();
                                a2.H("Skipping client side fallback for RBM.");
                                a2.b(z);
                                a2.q();
                                ukbVar.a(0);
                            }
                            vqt vqtVar = i;
                            markConversationNotYetDeliveredAction.d.g("Bugle.Rcs.Chat.Message.NotYetDelivered.Counts", vqtVar.e);
                            if (markConversationNotYetDeliveredAction.u.y("rcs_offline")) {
                                markConversationNotYetDeliveredAction.d.g("Bugle.Rcs.Chat.Message.NotYetDelivered.Offline.Counts", vqtVar.e);
                            }
                            rwd rwdVar2 = (rwd) markConversationNotYetDeliveredAction.c.b();
                            long q = r.q();
                            akrh e2 = aktp.e("MessageDatabaseOperations#getUndeliveredRcsMessages");
                            try {
                                sxy d = MessagesTable.d();
                                d.w("getUndeliveredRcsMessages");
                                d.g(new lce(z, q, 8));
                                d.h(new atkn((Object) MessagesTable.c.i, true));
                                Stream w = d.b().w();
                                try {
                                    List<MessageCoreData> list = (List) w.map(new ruw(rwdVar2, 15)).collect(Collectors.toCollection(new roi(12)));
                                    if (w != null) {
                                        w.close();
                                    }
                                    e2.close();
                                    for (MessageCoreData messageCoreData : list) {
                                        markConversationNotYetDeliveredAction.e.j(messageCoreData, -1);
                                        if (messageCoreData.cn()) {
                                            ((rwd) markConversationNotYetDeliveredAction.c.b()).S(messageCoreData.z(), messageCoreData.B());
                                        } else if (vqtVar.ordinal() == 1) {
                                            ((rwd) markConversationNotYetDeliveredAction.c.b()).S(messageCoreData.z(), messageCoreData.B());
                                        }
                                        i2++;
                                    }
                                    return Integer.valueOf(i2);
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
                                    e2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        xyo e3 = MarkConversationNotYetDeliveredAction.a.e();
                        e3.H("rcs");
                        e3.g(rveVar);
                        e3.H("missing cant mark NotDelivered.");
                        e3.q();
                        ukbVar.a(0);
                        throw new IllegalStateException();
                    }
                })).intValue();
                xyo a2 = a.a();
                a2.H("MarkConversationNotYetDeliveredAction client side fallback enabled for");
                a2.F(intValue);
                a2.H("messages.");
                a2.g(b);
                a2.z("fallbackMode", i);
                a2.q();
                if (intValue > 0) {
                    rbk.d(7, this);
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
        return "Bugle.DataModel.Action.MarkConversationNotYetDelivered.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public MarkConversationNotYetDeliveredAction(armf armfVar, armf armfVar2, vqu vquVar, mbl mblVar, agnq agnqVar, uie uieVar, rve rveVar, boolean z) {
        super(amdy.MARK_CONVERSATION_NOT_YET_DELIVERED_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.f = vquVar;
        this.d = mblVar;
        this.g = agnqVar;
        this.e = uieVar;
        xyl.l(rveVar);
        rve.h(this.u.f(), "rcs_message_id", rveVar);
        this.u.p("rcs_offline", z);
    }
}
