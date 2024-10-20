package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anen;
import defpackage.aozs;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apdj;
import defpackage.armf;
import defpackage.lpg;
import defpackage.msh;
import defpackage.msk;
import defpackage.mst;
import defpackage.prn;
import defpackage.qdm;
import defpackage.qei;
import defpackage.qyv;
import defpackage.rav;
import defpackage.ray;
import defpackage.rhl;
import defpackage.rvc;
import defpackage.rwd;
import defpackage.umk;
import defpackage.uta;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.vqm;
import defpackage.xyo;
import defpackage.xze;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InsertRcsMessageInTelephonyAction extends Action<Void> implements Parcelable {
    public final anen b;
    public final lpg c;
    private final armf e;
    private final vqm f;
    private final armf g;
    private static final xze d = xze.g("BugleDataModel", "InsertRcsMessageInTelephonyAction");
    public static final uuf a = uuh.r(148179123, "insert_rcs_message_in_telephony_is_async");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(1);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rav Nq();
    }

    public InsertRcsMessageInTelephonyAction(Parcel parcel, armf armfVar, vqm vqmVar, lpg lpgVar, anen anenVar, armf armfVar2) {
        super(parcel, amdy.INSERT_RCS_MESSAGE_IN_TELEPHONY_ACTION);
        this.e = armfVar;
        this.f = vqmVar;
        this.c = lpgVar;
        this.b = anenVar;
        this.g = armfVar2;
    }

    private final msh h(rhl rhlVar) {
        if (((Boolean) new mst(9).get()).booleanValue() && rhlVar.x("remoteChatEndpoint")) {
            return ((msk) this.g.b()).b((qei) ((apdj) rhlVar.h("remoteChatEndpoint")).a(qei.a, aozs.a()));
        }
        return ((msk) this.g.b()).t(rhlVar.l("senderId"), rhlVar.a("subId"));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("InsertRcsMessageInTelephonyAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InsertRcsMessageInTelephony.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        if (((Boolean) a.e()).booleanValue()) {
            return null;
        }
        try {
            rhl rhlVar = this.u;
            MessageIdType b = rvc.b(rhlVar.l("messageId"));
            msh h = h(rhlVar);
            int a2 = rhlVar.a("subId");
            long d2 = rhlVar.d("threadId");
            String l = rhlVar.l("rcsConferenceUri");
            boolean y = rhlVar.y("scheduleBusinessInfoDownload");
            MessageCoreData q = ((rwd) this.e.b()).q(b);
            if (q == null) {
                xyo b2 = d.b();
                b2.H("Cannot write message to telephony. Unable to read message");
                b2.z("messageId", b);
                b2.q();
            } else {
                this.f.b(q, d2, h, l, a2);
                String ag = albo.ag(h.h(((Boolean) new mst(9).get()).booleanValue()));
                if (y) {
                    lpg lpgVar = this.c;
                    aozy createBuilder = umk.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ((umk) apagVar).b = ag;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    ((umk) createBuilder.b).d = defpackage.a.am(6);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((umk) createBuilder.b).c = defpackage.a.an(3);
                    lpgVar.F((umk) createBuilder.s(), new uta(ag, ag, null, null, null, null));
                }
            }
            return null;
        } finally {
            d.k("RCSMSG receiving END");
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul fx() {
        akul i;
        if (((Boolean) a.e()).booleanValue()) {
            rhl rhlVar = this.u;
            MessageIdType b = rvc.b(rhlVar.l("messageId"));
            msh h = h(rhlVar);
            armf armfVar = this.e;
            int a2 = rhlVar.a("subId");
            long d2 = rhlVar.d("threadId");
            String l = rhlVar.l("rcsConferenceUri");
            boolean y = rhlVar.y("scheduleBusinessInfoDownload");
            MessageCoreData q = ((rwd) armfVar.b()).q(b);
            String ag = albo.ag(h.h(((Boolean) new mst(9).get()).booleanValue()));
            if (q == null) {
                xyo b2 = d.b();
                b2.H("Cannot write message to telephony. Unable to read message");
                b2.z("messageId", b);
                b2.q();
                i = aktp.ag(null);
            } else {
                i = this.f.h(q, d2, h, l, a2).i(new prn(this, y, ag, 2), this.b);
            }
            return i.h(new qyv(4), andi.a);
        }
        return super.fx();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public InsertRcsMessageInTelephonyAction(MessageIdType messageIdType, qei qeiVar, int i, long j, Optional optional, boolean z, armf armfVar, vqm vqmVar, lpg lpgVar, anen anenVar, armf armfVar2) {
        super(amdy.INSERT_RCS_MESSAGE_IN_TELEPHONY_ACTION);
        this.g = armfVar2;
        this.u.v("messageId", messageIdType.a());
        if (((Boolean) new mst(9).get()).booleanValue()) {
            this.u.t("remoteChatEndpoint", new ProtoParsers$InternalDontUse(null, qeiVar));
        }
        this.u.v("senderId", qeiVar.d);
        this.u.r("subId", i);
        this.u.s("threadId", j);
        this.u.p("scheduleBusinessInfoDownload", z);
        optional.ifPresent(new qdm(this, 14));
        this.e = armfVar;
        this.f = vqmVar;
        this.c = lpgVar;
        this.b = anenVar;
    }
}
