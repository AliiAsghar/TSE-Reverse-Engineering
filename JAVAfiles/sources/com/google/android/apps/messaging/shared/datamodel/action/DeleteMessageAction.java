package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.ahka;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alog;
import defpackage.alpr;
import defpackage.amdy;
import defpackage.armf;
import defpackage.lrf;
import defpackage.mbl;
import defpackage.mgv;
import defpackage.mut;
import defpackage.oda;
import defpackage.qik;
import defpackage.qwz;
import defpackage.qxs;
import defpackage.qyy;
import defpackage.qza;
import defpackage.riy;
import defpackage.rtz;
import defpackage.rvc;
import defpackage.rwd;
import defpackage.smr;
import defpackage.svk;
import defpackage.svo;
import defpackage.svq;
import defpackage.sxx;
import defpackage.sxy;
import defpackage.tzn;
import defpackage.ufv;
import defpackage.uie;
import defpackage.uih;
import defpackage.uzo;
import defpackage.vjs;
import defpackage.vqu;
import defpackage.wyp;
import defpackage.wzs;
import defpackage.xyo;
import defpackage.xzb;
import defpackage.xze;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeleteMessageAction extends Action<Bundle> implements Parcelable {
    private final Context b;
    private final armf c;
    private final armf d;
    private final mbl e;
    private final vqu f;
    private final uih g;
    private final wyp h;
    private final wzs i;
    private final mgv j;
    private final vjs k;
    private final qik l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final tzn p;
    private final vjs q;
    private static final xze a = xze.g("BugleDataModel", "DeleteMessageAction");
    public static final Parcelable.Creator<Action<Bundle>> CREATOR = new qyy(5);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        riy cR();
    }

    public DeleteMessageAction(Context context, armf armfVar, armf armfVar2, mbl mblVar, vqu vquVar, uih uihVar, wyp wypVar, wzs wzsVar, mgv mgvVar, vjs vjsVar, vjs vjsVar2, tzn tznVar, qik qikVar, armf armfVar3, armf armfVar4, armf armfVar5, Parcel parcel) {
        super(parcel, amdy.DELETE_MESSAGE_ACTION);
        this.b = context;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = mblVar;
        this.f = vquVar;
        this.g = uihVar;
        this.h = wypVar;
        this.i = wzsVar;
        this.j = mgvVar;
        this.k = vjsVar;
        this.q = vjsVar2;
        this.p = tznVar;
        this.l = qikVar;
        this.m = armfVar3;
        this.n = armfVar4;
        this.o = armfVar5;
    }

    private static Bundle h() {
        return j(false);
    }

    private static Bundle j(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success_extra", z);
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [armf, java.lang.Object] */
    private final Bundle l(List list, boolean z) {
        boolean z2;
        boolean z3;
        String S;
        String ad;
        alpr alprVar = new alpr();
        alprVar.j(list);
        sxy d = MessagesTable.d();
        d.w("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId-subquery");
        d.e(new qza(4));
        d.g(new qwz(list, 9));
        sxx b = d.b();
        sxy d2 = MessagesTable.d();
        d2.w("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId");
        boolean z4 = true;
        d2.c(MessagesTable.c.a);
        d2.g(new mut(b, list, 19, null));
        alprVar.j(d2.b().g());
        svo a2 = svq.a();
        a2.w("+DeleteMessageAction#getMessageIdsWithReactions");
        a2.c((svk) svq.d.c);
        a2.d(new qwz(list, 10));
        alprVar.j(a2.b().f());
        alog g = alprVar.g().g();
        alog<MessageCoreData> E = ((rwd) this.c.b()).E(g);
        if (E.isEmpty()) {
            a.q("No messages retrieved to delete");
            return h();
        }
        this.p.l(E);
        ConversationIdType z5 = ((MessageCoreData) E.get(0)).z();
        if (((uzo) this.d.b()).b(g, z5) == E.size()) {
            ArrayList arrayList = new ArrayList();
            int size = E.size();
            for (int i = 0; i < size; i++) {
                MessageCoreData messageCoreData = (MessageCoreData) E.get(i);
                MessageIdType B = messageCoreData.B();
                xze xzeVar = a;
                xyo c = xzeVar.c();
                c.H("Deleted local");
                c.c(B);
                c.q();
                if (messageCoreData.cJ() && !messageCoreData.cP()) {
                    this.e.c("Bugle.Rcs.Files.Transfer.Outgoing.Cancelled.Counts");
                }
                long m = messageCoreData.m();
                if (m != -1) {
                    this.f.y(m);
                    xyo c2 = xzeVar.c();
                    c2.H("Deleting file transfer from RCS engine.");
                    c2.y("rcsFileTransferSessionId", m);
                    c2.q();
                }
                if (z && (ad = messageCoreData.ad()) != null) {
                    arrayList.add(ad);
                }
            }
            if (z) {
                this.l.b(this.b, (String[]) arrayList.toArray(new String[0]));
            }
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (MessageCoreData messageCoreData2 : E) {
            wyp wypVar = this.h;
            List W = messageCoreData2.W();
            ufv a3 = ((uie) wypVar.a.b()).a(1);
            Iterator it = W.iterator();
            while (it.hasNext()) {
                Uri t = ((MessagePartCoreData) it.next()).t();
                if (t != null) {
                    xzb.l("Bugle", "Clearing cache for ".concat(t.toString()));
                    a3.e(t.toString());
                }
            }
            Uri t2 = messageCoreData2.t();
            if (t2 != null) {
                arrayList2.add(t2);
            } else {
                MessageIdType B2 = messageCoreData2.B();
                xyo c3 = a.c();
                c3.H("Local");
                c3.c(B2);
                c3.H("has no telephony uri: Unable to delete from telephony.");
                c3.q();
            }
        }
        this.i.W(arrayList2);
        if (E.size() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z2 | z3;
        if (((oda) this.n.b()).a()) {
            smr q = ((rtz) this.o.b()).q(z5);
            uih uihVar = this.g;
            lrf lrfVar = (lrf) this.m.b();
            if (q == null) {
                S = null;
            } else {
                S = q.S();
            }
            if (q == null || !q.ac()) {
                z4 = false;
            }
            uihVar.b(null, lrfVar.l(z5, S, z4));
        } else {
            this.g.b(null, ((lrf) this.m.b()).l(z5, null, false));
        }
        return j(z6);
    }

    private final ahka m() {
        ArrayList G = this.u.G();
        if (G != null && G.size() != 1) {
            return mgv.l;
        }
        return mgv.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("DeleteMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        this.j.e(m());
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.DeleteMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        MessageIdType b = rvc.b(this.u.l("message_id"));
        if (!b.b()) {
            arrayList2.add(b);
        }
        ArrayList G = this.u.G();
        if (G == null) {
            arrayList = null;
        } else {
            arrayList = (ArrayList) Collection.EL.stream(G).map(new qza(5)).collect(Collectors.toCollection(new qxs(4)));
        }
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            return l(arrayList2, true);
        }
        String l = this.u.l("cloud_sync_id");
        if (l != null && !TextUtils.isEmpty(l)) {
            MessageCoreData p = ((rwd) this.c.b()).p(l);
            if (p == null) {
                xyo e = a.e();
                e.H("Cloud Message");
                e.z("cloudSyncId", l);
                e.H("no longer exists.");
                e.q();
                return h();
            }
            Bundle l2 = l(Collections.singletonList(p.B()), false);
            this.k.c();
            this.q.h();
            return l2;
        }
        return h();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object fz(Bundle bundle) {
        this.j.f(m());
        return bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
