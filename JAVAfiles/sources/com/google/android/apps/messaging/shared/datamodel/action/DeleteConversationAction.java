package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.agnc;
import defpackage.agpj;
import defpackage.agpw;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alob;
import defpackage.alog;
import defpackage.alur;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.ameb;
import defpackage.amfe;
import defpackage.amfh;
import defpackage.armf;
import defpackage.d;
import defpackage.lbp;
import defpackage.lck;
import defpackage.lcm;
import defpackage.lcn;
import defpackage.lco;
import defpackage.lzy;
import defpackage.mgv;
import defpackage.mho;
import defpackage.qab;
import defpackage.qih;
import defpackage.qik;
import defpackage.qyy;
import defpackage.qza;
import defpackage.qzc;
import defpackage.qzd;
import defpackage.riq;
import defpackage.rtb;
import defpackage.rtz;
import defpackage.ruy;
import defpackage.rwd;
import defpackage.rys;
import defpackage.sng;
import defpackage.sxt;
import defpackage.sxy;
import defpackage.syb;
import defpackage.syc;
import defpackage.tbn;
import defpackage.tbs;
import defpackage.tbu;
import defpackage.tqc;
import defpackage.ugy;
import defpackage.uhj;
import defpackage.uie;
import defpackage.utz;
import defpackage.uuy;
import defpackage.uzl;
import defpackage.uzo;
import defpackage.vjs;
import defpackage.vml;
import defpackage.vqu;
import defpackage.wpp;
import defpackage.wyp;
import defpackage.wzs;
import defpackage.xhv;
import defpackage.xol;
import defpackage.xot;
import defpackage.xyl;
import defpackage.xyo;
import defpackage.xzb;
import defpackage.xze;
import defpackage.xzu;
import defpackage.ydl;
import defpackage.yhu;
import defpackage.ymd;
import defpackage.yqq;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeleteConversationAction extends Action<Void> implements Parcelable {
    private final qik A;
    private final armf B;
    private final armf C;
    private final armf D;
    private final armf E;
    private final armf F;
    public final mho a;
    private final Context d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final lzy j;
    private final vqu k;
    private final Optional l;
    private final wzs m;
    private final wyp n;
    private final mgv o;
    private final uhj p;
    private final rys q;
    private final rtb z;
    private static final xze b = xze.g("BugleDataModel", "DeleteConversationAction");
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/DeleteConversationAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(4);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        riq cM();
    }

    public DeleteConversationAction(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, lzy lzyVar, vqu vquVar, Optional optional, wzs wzsVar, mho mhoVar, wyp wypVar, mgv mgvVar, uhj uhjVar, rys rysVar, rtb rtbVar, qik qikVar, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, Parcel parcel) {
        super(parcel, amdy.DELETE_CONVERSATION_ACTION);
        this.d = context;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = lzyVar;
        this.k = vquVar;
        this.l = optional;
        this.m = wzsVar;
        this.a = mhoVar;
        this.n = wypVar;
        this.o = mgvVar;
        this.p = uhjVar;
        this.q = rysVar;
        this.z = rtbVar;
        this.A = qikVar;
        this.B = armfVar7;
        this.C = armfVar6;
        this.D = armfVar8;
        this.E = armfVar9;
        this.F = armfVar10;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("DeleteConversationAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.DeleteConversation.ExcuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        String[] strArr;
        String[] strArr2;
        String str;
        uzl d;
        boolean z;
        Object apply;
        Integer valueOf;
        Object apply2;
        syb sybVar;
        try {
            ConversationIdType b2 = ruy.b(this.u.l("conversation_id"));
            if (!b2.b()) {
                SuperSortLabel a2 = SuperSortLabel.a(this.u.a("supersort_filter"));
                long d2 = this.u.d("cutoff_timestamp");
                if (((Boolean) ((utz) ymd.b.get()).e()).booleanValue()) {
                    ((Optional) this.B.b()).ifPresent(new qab(19));
                }
                boolean K = ((rwd) this.h.b()).K(b2);
                tqc r = ((rtz) this.g.b()).r(b2);
                amfh e = this.j.e(b2);
                amfe b3 = amfe.b(this.u.a("conversation_origin"));
                if (b3 == null) {
                    b3 = amfe.CONVERSATION_FROM_DELETION_LOGGING;
                }
                ((wpp) this.F.b()).q(b2);
                qzc qzcVar = new qzc(this, e, b2, b3, K, r, 0);
                boolean y = this.u.y("conversation_only_if_empty");
                xhv a3 = ((ugy) this.C.b()).a(b2);
                boolean d3 = ((qih) this.f.b()).d(b2, a3);
                if (d3) {
                    if (d2 != Long.MAX_VALUE) {
                        syc sycVar = new syc();
                        sycVar.D(d2);
                        sybVar = new syb(sycVar);
                    } else {
                        sybVar = null;
                    }
                    strArr = ((qih) this.f.b()).f(b2, sybVar);
                } else {
                    strArr = null;
                }
                akrh e2 = aktp.e("FileTrasnferDatabaseOperations#getConversationFileTransferSessionIds");
                try {
                    xyl.h();
                    xyl.l(b2);
                    sxy d4 = MessagesTable.d();
                    d4.w("getConversationFileTransferSessionIds");
                    d4.g(new xol(b2, 5));
                    sxt sxtVar = (sxt) d4.b().m(MessagesTable.c.I);
                    try {
                        alob alobVar = new alob();
                        while (sxtVar.moveToNext()) {
                            sxtVar.r();
                            alobVar.h(Long.valueOf(sxtVar.r()));
                        }
                        alog g = alobVar.g();
                        sxtVar.close();
                        e2.close();
                        sxy d5 = MessagesTable.d();
                        d5.e(new qza(2));
                        syc sycVar2 = new syc();
                        sycVar2.f(b2);
                        sycVar2.D(d2);
                        d5.f(sycVar2);
                        agpj b4 = d5.b();
                        if (lbp.a() && a2.b()) {
                            lcm a4 = lco.a();
                            apply = new qza(3).apply(lco.c);
                            lck[] lckVarArr = {(lck) apply};
                            valueOf = Integer.valueOf(d.P().W().c());
                            int intValue = valueOf.intValue();
                            if (((Integer) lco.b.getOrDefault(lckVarArr[0].toString(), -1)).intValue() > intValue) {
                                agnc.t("columnReference.toString()", intValue);
                            }
                            a4.m(lckVarArr);
                            str = "conversation_id";
                            strArr2 = strArr;
                            apply2 = new qzd(b2, d2, a2, 0).apply(new lcn());
                            a4.k(new agpw((lcn) apply2));
                            b4 = a4.b();
                        } else {
                            strArr2 = strArr;
                            str = "conversation_id";
                        }
                        tbs d6 = PartsTable.d();
                        d6.w("cleanupParts");
                        tbu tbuVar = new tbu();
                        tbuVar.e(b2);
                        tbuVar.p();
                        tbuVar.j(b4);
                        d6.f(tbuVar);
                        tbn tbnVar = (tbn) d6.b().n();
                        while (tbnVar.moveToNext()) {
                            try {
                                wyp wypVar = this.n;
                                Uri v = tbnVar.v();
                                if (v != null) {
                                    xzb.l("Bugle", "Clearing cache for ".concat(v.toString()));
                                    ((uie) wypVar.a.b()).a(1).e(v.toString());
                                }
                                if (!y && ameb.b(tbnVar.h()) != ameb.GIF_CHOOSER) {
                                    this.z.d(tbnVar).aj();
                                }
                            } finally {
                            }
                        }
                        tbnVar.close();
                        amfe b5 = amfe.b(this.u.a("conversation_origin"));
                        amfe amfeVar = amfe.CONVERSATION_FROM_CMS_ACTION;
                        if (y) {
                            z = ((uzo) this.e.b()).f(b2);
                        } else {
                            if (b5 == amfeVar) {
                                d = ((uzo) this.e.b()).e(b2, a2, d2);
                            } else {
                                d = ((uzo) this.e.b()).d(b2, a2, d2);
                            }
                            if (d.b) {
                                xze xzeVar = b;
                                xyo c2 = xzeVar.c();
                                c2.H("Deleted local");
                                c2.b(b2);
                                c2.y("cutoffTimestamp", d2);
                                c2.q();
                                if (!g.isEmpty()) {
                                    xyo c3 = xzeVar.c();
                                    c3.H("Deleting RCS engine file transfers associated with");
                                    c3.b(b2);
                                    c3.q();
                                    alur it = g.iterator();
                                    while (it.hasNext()) {
                                        this.k.y(((Long) it.next()).longValue());
                                    }
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (y) {
                            e2 = aktp.e("DeleteDatabaseOperations#resetConversationDeleteTimestamp");
                            try {
                                sng sngVar = new sng();
                                sngVar.aj("resetConversationDeleteTimestamp");
                                sngVar.l(0L);
                                sngVar.X(new uuy(b2, 12));
                                sngVar.a().e();
                                e2.close();
                            } finally {
                            }
                        } else {
                            ((uzo) this.e.b()).g(b2, d2);
                        }
                        if (!z) {
                            if (!y) {
                                xyo e3 = b.e();
                                e3.H("Could not delete local");
                                e3.b(b2);
                                e3.q();
                                this.q.a();
                            }
                        } else {
                            alvw g2 = c.g();
                            g2.X(alwp.a, "BugleNotifications");
                            alvg alvgVar = (alvg) g2;
                            alvgVar.X(ydl.o, b2.toString());
                            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/DeleteConversationAction", "doBackgroundWork", 374, "DeleteConversationAction.java")).q("Deleting conversation, canceling IM notification (action)");
                            ((wpp) this.D.b()).H(b2);
                            ((vml) this.E.b()).d(b2);
                            this.p.d(b2);
                            this.l.ifPresent(new qab(20));
                            if (a3.c()) {
                                if (this.m.R(a3.a(), d2)) {
                                    xyo c4 = b.c();
                                    c4.H("Deleted telephony");
                                    c4.z("threadId", a3);
                                    c4.y("cutoffTimestamp", d2);
                                    c4.q();
                                } else {
                                    xyo e4 = b.e();
                                    e4.H("there were no messages to delete. telephony:");
                                    e4.b(b2);
                                    e4.z("threadId", a3);
                                    e4.y("cutoffTimestamp", d2);
                                    e4.H("[might have been a conversation with just a draft].");
                                    e4.q();
                                }
                            } else if (d3) {
                                String[] strArr3 = strArr2;
                                if (strArr3 != null) {
                                    this.A.b(this.d, strArr3);
                                }
                            } else {
                                xyo e5 = b.e();
                                e5.H("Local conversation");
                                e5.b(b2);
                                e5.H("has an invalid telephony thread id; will delete messages individually.");
                                e5.q();
                                ConversationIdType b6 = ruy.b(this.u.l(str));
                                xyl.l(b6);
                                ArrayList arrayList = new ArrayList();
                                sxy d7 = MessagesTable.d();
                                d7.w("deleteConversationMessagesFromTelephony");
                                syc sycVar3 = new syc();
                                sycVar3.f(b6);
                                d7.f(sycVar3);
                                d7.c(MessagesTable.c.o);
                                sxt sxtVar2 = (sxt) d7.b().n();
                                while (sxtVar2.moveToNext()) {
                                    try {
                                        try {
                                            arrayList.add(sxtVar2.A());
                                        } catch (Exception e6) {
                                            xyo b7 = b.b();
                                            b7.H("Could not parse message uri:");
                                            b7.H(sxtVar2.A());
                                            b7.r(e6);
                                        }
                                    } finally {
                                    }
                                }
                                sxtVar2.close();
                                int size = arrayList.size();
                                boolean z2 = true;
                                for (int i = 0; i < size; i++) {
                                    Uri uri = (Uri) arrayList.get(i);
                                    if (this.m.a(uri, "Bugle.Telephony.Delete.SmsBulk.Latency") > 0) {
                                        xyo a5 = b.a();
                                        a5.H("Deleted telephony message:");
                                        a5.z("messageUri", uri);
                                        a5.q();
                                    } else {
                                        xyo e7 = b.e();
                                        e7.H("Could not delete telephony message:");
                                        e7.z("messageUri", uri);
                                        e7.q();
                                        z2 = false;
                                    }
                                }
                                if (!z2) {
                                    b.q("doBackgroundWork: not all message deleted.");
                                    this.q.a();
                                }
                            }
                            qzcVar.run();
                        }
                    } finally {
                    }
                } finally {
                }
            } else {
                b.m("conversationId is empty.");
            }
            this.o.f(mgv.m);
            return null;
        } catch (Throwable th) {
            this.o.f(mgv.m);
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public DeleteConversationAction(Context context, armf<uzo> armfVar, armf<qih> armfVar2, armf<rtz> armfVar3, armf<rwd> armfVar4, armf<xot> armfVar5, armf<ugy> armfVar6, lzy lzyVar, vqu vquVar, yhu yhuVar, Optional<xzu> optional, wzs wzsVar, mho mhoVar, wyp wypVar, mgv mgvVar, vjs vjsVar, uhj uhjVar, rys rysVar, rtb rtbVar, qik qikVar, armf<Optional<yqq>> armfVar7, armf<wpp> armfVar8, armf<vml> armfVar9, armf<wpp> armfVar10, ConversationIdType conversationIdType, long j, SuperSortLabel superSortLabel, amfe amfeVar, boolean z) {
        super(amdy.DELETE_CONVERSATION_ACTION);
        this.d = context;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = lzyVar;
        this.k = vquVar;
        this.l = optional;
        this.m = wzsVar;
        this.a = mhoVar;
        this.n = wypVar;
        this.o = mgvVar;
        this.p = uhjVar;
        this.q = rysVar;
        this.z = rtbVar;
        this.A = qikVar;
        this.B = armfVar7;
        this.D = armfVar8;
        this.E = armfVar9;
        this.F = armfVar10;
        if (!conversationIdType.b()) {
            this.u.v("conversation_id", conversationIdType.a());
        }
        this.u.s("cutoff_timestamp", j);
        this.u.r("conversation_origin", amfeVar == null ? -1 : amfeVar.t);
        this.u.p("conversation_only_if_empty", z);
        this.u.r("supersort_filter", superSortLabel.i);
        this.C = armfVar6;
    }
}
