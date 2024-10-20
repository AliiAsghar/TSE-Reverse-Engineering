package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.FallbackToXmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.agno;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alvi;
import defpackage.amdy;
import defpackage.amxo;
import defpackage.anen;
import defpackage.armf;
import defpackage.d;
import defpackage.mbl;
import defpackage.mho;
import defpackage.osp;
import defpackage.qyy;
import defpackage.qzg;
import defpackage.riw;
import defpackage.rve;
import defpackage.uie;
import defpackage.vqu;
import defpackage.xnv;
import defpackage.xyl;
import defpackage.xze;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FallbackToXmsAction extends Action<Void> {
    public final armf c;
    public final armf d;
    public final armf e;
    public final xnv f;
    public final mho g;
    public final vqu h;
    public final agnq i;
    public final anen j;
    public final osp k;
    public final uie l;
    private final mbl m;
    public static final xze a = xze.g("BugleDataModel", "FallbackToXmsAction");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/FallbackToXmsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(9);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzg Nh();
    }

    public FallbackToXmsAction(mbl mblVar, armf armfVar, armf armfVar2, xnv xnvVar, mho mhoVar, vqu vquVar, agnq agnqVar, uie uieVar, armf armfVar3, anen anenVar, osp ospVar, Parcel parcel) {
        super(parcel, amdy.FALLBACK_TO_XMS_ACTION);
        this.m = mblVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.f = xnvVar;
        this.g = mhoVar;
        this.h = vquVar;
        this.i = agnqVar;
        this.l = uieVar;
        this.e = armfVar3;
        this.j = anenVar;
        this.k = ospVar;
    }

    public static int g(int i) {
        d.s(riw.d(i));
        if (i != 0) {
            if (i == 4) {
                return 0;
            }
            return 1;
        }
        throw null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("FallbackToXmsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        akrh e = aktp.e("FallbackToXmsAction.executeAction");
        try {
            final rve b2 = rve.b(this.u.f(), "rcs_message_id");
            final int i = new int[]{1, 2, 3, 4, 5}[this.u.a("rcs_fallback_reason")];
            d.s(riw.d(i));
            final amxo amxoVar = amxo.values()[this.u.a("rcs_transport_type")];
            int intValue = ((Integer) this.i.a("FallbackToXmsAction#executeAction", new agno() { // from class: qzf
                @Override // defpackage.agno
                public final Object a(ukb ukbVar) {
                    int intValue2;
                    int i2;
                    FallbackToXmsAction fallbackToXmsAction = FallbackToXmsAction.this;
                    rwd rwdVar = (rwd) fallbackToXmsAction.d.b();
                    rve rveVar = b2;
                    MessageCoreData r = rwdVar.r(rveVar);
                    if (r == null) {
                        xyo b3 = FallbackToXmsAction.a.b();
                        b3.g(rveVar);
                        b3.H("missing and it can't fallback to xMS.");
                        b3.q();
                        return 0;
                    }
                    if (!r.cI()) {
                        return 0;
                    }
                    ConversationIdType z = r.z();
                    int i3 = 2;
                    if (fallbackToXmsAction.k.a()) {
                        intValue2 = -1;
                    } else {
                        SelfIdentityId v = r.v();
                        Stream map = Collection.EL.stream((alog) ((nfx) fallbackToXmsAction.e.b()).b().c()).filter(new qxp(v, i3)).map(new qza(6));
                        int i4 = alog.d;
                        alog alogVar = (alog) map.collect(alls.a);
                        if (alogVar.size() > 1) {
                            alvw i5 = FallbackToXmsAction.b.i();
                            i5.X(alwp.a, "BugleDataModel");
                            ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/datamodel/action/FallbackToXmsAction", "getSubscriptionIdLegacy", 229, "FallbackToXmsAction.java")).t("Multiple self identity mappings found for selfId %s; returning first mapping", v);
                        }
                        intValue2 = ((Integer) Collection.EL.stream(alogVar).findFirst().orElseGet(new qwn(v, i3))).intValue();
                    }
                    if (((rtz) fallbackToXmsAction.c.b()).ab(z)) {
                        xyo a2 = FallbackToXmsAction.a.a();
                        a2.H("Skipping rcs during sending fallback for RBM.");
                        a2.b(z);
                        a2.q();
                        ukbVar.a(0);
                    }
                    int j = r.j();
                    int i6 = 11;
                    if (j == 2 || j == 11) {
                        xyo e2 = FallbackToXmsAction.a.e();
                        e2.H("Skipping fallback for message already delivered as rcs.");
                        e2.b(z);
                        e2.q();
                        ukbVar.a(0);
                    }
                    int i7 = i;
                    amxo amxoVar2 = amxoVar;
                    fallbackToXmsAction.g.z(rveVar, ((rwd) fallbackToXmsAction.d.b()).r(rveVar), 25, amxoVar2);
                    if (fallbackToXmsAction.k.a()) {
                        int g = FallbackToXmsAction.g(i7);
                        fallbackToXmsAction.h.N(r, g, fallbackToXmsAction.f.f().toEpochMilli());
                        fallbackToXmsAction.h(g, i7);
                        fallbackToXmsAction.i.h(new mla(i6), null, new mib(fallbackToXmsAction, r, i7, amxoVar2, 2));
                        return 1;
                    }
                    int i8 = i7 - 1;
                    if (i7 != 0) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                i2 = fallbackToXmsAction.l.j(r, intValue2);
                            } else {
                                i2 = 1;
                            }
                        } else {
                            i2 = 0;
                        }
                        int i9 = i2;
                        fallbackToXmsAction.g.aO(r, i9, amxoVar2, intValue2, 4);
                        fallbackToXmsAction.h.M(r, i9, intValue2, fallbackToXmsAction.f.f().toEpochMilli(), true, riw.d(i7));
                        fallbackToXmsAction.h(i2, i7);
                        return 1;
                    }
                    throw null;
                }
            })).intValue();
            if (intValue > 0) {
                this.m.e("Bugle.Fallback.Conversation.Succeeded.Messages.Count", intValue);
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
        return "Bugle.DataModel.Action.FallbackToXmsAction.ExecuteAction.Latency";
    }

    public final void h(int i, int i2) {
        int i3;
        if (i2 != 0) {
            int i4 = i2 - 1;
            int i5 = 1;
            if (i4 != 1) {
                i3 = 3;
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            i3 = 5;
                        } else {
                            throw new IllegalArgumentException("Invalid fallback reason");
                        }
                    } else {
                        i3 = 4;
                    }
                }
            } else {
                i3 = 2;
            }
            if (i != 0) {
                i5 = 2;
            }
            this.m.e("Bugle.Fallback.Message.Succeeded.As", i5);
            this.m.e("Bugle.Fallback.Message.Succeeded.Reason", i3);
            return;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public FallbackToXmsAction(mbl mblVar, armf armfVar, armf armfVar2, xnv xnvVar, mho mhoVar, vqu vquVar, agnq agnqVar, uie uieVar, armf armfVar3, anen anenVar, osp ospVar, rve rveVar, int i, amxo amxoVar) {
        super(amdy.FALLBACK_TO_XMS_ACTION);
        this.m = mblVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.f = xnvVar;
        this.g = mhoVar;
        this.h = vquVar;
        this.i = agnqVar;
        this.l = uieVar;
        this.e = armfVar3;
        this.j = anenVar;
        this.k = ospVar;
        xyl.l(rveVar);
        rve.h(this.u.f(), "rcs_message_id", rveVar);
        this.u.r("rcs_fallback_reason", i - 1);
        this.u.r("rcs_transport_type", amxoVar.h);
    }
}
