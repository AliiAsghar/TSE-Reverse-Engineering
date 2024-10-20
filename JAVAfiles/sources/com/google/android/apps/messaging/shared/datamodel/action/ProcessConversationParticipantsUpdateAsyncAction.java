package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.akto;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alog;
import defpackage.altx;
import defpackage.alur;
import defpackage.amdy;
import defpackage.andi;
import defpackage.andy;
import defpackage.anen;
import defpackage.aqdu;
import defpackage.armf;
import defpackage.mbl;
import defpackage.ndi;
import defpackage.okf;
import defpackage.qbt;
import defpackage.qxs;
import defpackage.qyv;
import defpackage.qza;
import defpackage.rau;
import defpackage.ray;
import defpackage.rbn;
import defpackage.rbo;
import defpackage.rbs;
import defpackage.ruy;
import defpackage.trg;
import defpackage.trm;
import defpackage.trn;
import defpackage.uie;
import defpackage.vbl;
import defpackage.vct;
import defpackage.veg;
import defpackage.vej;
import defpackage.wpp;
import defpackage.wyp;
import defpackage.xze;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class ProcessConversationParticipantsUpdateAsyncAction extends Action<List<aqdu>> {
    public final armf b;
    public final mbl c;
    public final armf d;
    public final wpp e;
    private final andy f;
    private final armf g;
    private final trn h;
    private final anen i;
    private final anen j;
    private final armf k;
    private final wyp l;
    public static final xze a = xze.g("BugleAction", "ProcessConversationParticipantsUpdateAsyncAction");
    public static final Parcelable.Creator<Action<List<aqdu>>> CREATOR = new ray(6);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rbo Nv();
    }

    public ProcessConversationParticipantsUpdateAsyncAction(Parcel parcel, armf armfVar, armf armfVar2, vct vctVar, wpp wppVar, trn trnVar, mbl mblVar, anen anenVar, anen anenVar2, wyp wypVar, armf armfVar3, armf armfVar4) {
        super(parcel, amdy.PROCESS_CONVERSATION_PARTICIPANTS_UPDATE_ACTION);
        this.g = armfVar;
        this.b = armfVar2;
        this.f = vctVar;
        this.e = wppVar;
        this.h = trnVar;
        this.c = mblVar;
        this.i = anenVar;
        this.j = anenVar2;
        this.l = wypVar;
        this.d = armfVar3;
        this.k = armfVar4;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessConversationParticipantsUpdateAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessConversationParticipantUpdate.ExecuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        Set<BugleConversationId> set;
        akul ad;
        akul akulVar;
        akul h;
        Boolean bool = (Boolean) trg.a.e();
        if (bool.booleanValue()) {
            this.c.e("Bugle.Ditto.Action.Success.Metrics.Counts", 17);
        }
        alog c = this.h.c();
        int i = 2;
        if (c.isEmpty()) {
            ad = aktp.ag(Collections.emptyList());
        } else {
            int i2 = 18;
            if (this.u.x("conversation_id_key")) {
                set = new altx(new BugleConversationId(ruy.b(this.u.l("conversation_id_key"))));
            } else {
                set = (Set) Collection.EL.stream(((uie) this.g.b()).n(this.u.e("conversation_timestamp_key", Long.MAX_VALUE))).map(new qza(18)).map(new rbs(1)).collect(Collectors.toCollection(new qxs(8)));
            }
            akul A = this.l.A();
            akrh e = aktp.e("ProcessConversationParticipantsUpdateAsyncAction::workOnAllActiveDesktops_dsdrGroupsFlag");
            try {
                ArrayList arrayList = new ArrayList();
                for (BugleConversationId bugleConversationId : set) {
                    if (((okf) this.k.b()).a()) {
                        akulVar = this.l.z(bugleConversationId);
                    } else {
                        akulVar = A;
                    }
                    wyp wypVar = this.l;
                    if (((okf) wypVar.g.b()).a()) {
                        h = wypVar.y(bugleConversationId).h(new vej(12), wypVar.d).i(new vbl(wypVar, bugleConversationId, i2), wypVar.d);
                    } else {
                        akul h2 = ((ndi) wypVar.f).d(bugleConversationId).b().h(new veg(wypVar, 9), wypVar.d);
                        akul x = wypVar.x(bugleConversationId);
                        h = aktp.ap(h2, x).h(akto.k(new rbn(wypVar, h2, x, 10)), wypVar.d);
                    }
                    boolean z = true;
                    akul h3 = aktp.ap(akulVar, h).h(new rbn(bugleConversationId, akulVar, h, 0), this.j);
                    alur it = c.iterator();
                    while (it.hasNext()) {
                        trm trmVar = (trm) it.next();
                        String str = trmVar.b;
                        if (TextUtils.isEmpty(str)) {
                            a.q("Skip desktop due to empty request id");
                        } else {
                            arrayList.add(h3.i(new qbt((Object) this, (Object) trmVar, (Object) str, 7, (byte[]) null), this.j));
                            z = true;
                        }
                    }
                    i2 = 18;
                }
                ad = aktp.ad(arrayList);
                e.close();
            } finally {
            }
        }
        akul e2 = ad.e(Throwable.class, new qyv(5), andi.a);
        if (bool.booleanValue()) {
            e2 = e2.h(new rau(this, i), this.i);
        }
        e2.k(this.f, andi.a);
        return e2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
