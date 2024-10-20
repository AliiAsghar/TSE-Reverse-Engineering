package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.RemoveSelfNumberFromConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alog;
import defpackage.alpt;
import defpackage.alsx;
import defpackage.alur;
import defpackage.amdy;
import defpackage.aozy;
import defpackage.armf;
import defpackage.mbm;
import defpackage.mce;
import defpackage.msk;
import defpackage.mss;
import defpackage.rbs;
import defpackage.rdk;
import defpackage.rfi;
import defpackage.rtz;
import defpackage.smu;
import defpackage.sna;
import defpackage.snf;
import defpackage.sni;
import defpackage.tqc;
import defpackage.uhj;
import defpackage.vcp;
import defpackage.vjr;
import defpackage.vjs;
import defpackage.wxr;
import defpackage.wyt;
import defpackage.xhv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yjr;
import defpackage.yjy;
import defpackage.yyb;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoveSelfNumberFromConversationsAction extends Action<Void> implements Parcelable {
    public final armf b;
    public final armf c;
    public final armf d;
    public final uhj e;
    private final yjy f;
    private final yjr g;
    private final wyt h;
    private final mce i;
    private final vjs j;
    private final agnq k;
    private final Context l;
    private final armf m;
    private final vjs n;
    public static final xze a = xze.g("Bugle", "RemoveSelfNumberFromConversationsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(14);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rfi NQ();
    }

    public RemoveSelfNumberFromConversationsAction(armf armfVar, armf armfVar2, armf armfVar3, yjy yjyVar, yjr yjrVar, wyt wytVar, mce mceVar, vjs vjsVar, vjs vjsVar2, uhj uhjVar, agnq agnqVar, armf armfVar4, Context context, int i) {
        super(amdy.REMOVE_SELF_NUMBER_FROM_CONVERSATIONS_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.f = yjyVar;
        this.g = yjrVar;
        this.h = wytVar;
        this.i = mceVar;
        this.n = vjsVar;
        this.j = vjsVar2;
        this.e = uhjVar;
        this.k = agnqVar;
        this.l = context;
        this.m = armfVar4;
        this.u.r("sub_id", i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("RemoveSelfNumberFromConversationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RemoveSelfNumberFromConversations.ExecuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        int i;
        String str = "targetThreadId";
        Optional j = this.f.h(this.u.b("sub_id", -1)).j(true);
        snf e = sni.e();
        e.w("RemoveSelfNumberFromConversationsAction#doBackgroundWork");
        e.q();
        smu smuVar = sni.c;
        int i2 = 2;
        e.c(smuVar.a, smuVar.q, smuVar.E, smuVar.G, smuVar.F, smuVar.b);
        e.h(new rbs(12));
        sna snaVar = (sna) e.b().n();
        while (snaVar.moveToNext()) {
            try {
                final ConversationIdType C = snaVar.C();
                List K = ((rtz) this.b.b()).K(C);
                if (((alsx) K).c >= i2) {
                    HashSet v = this.g.v();
                    alpt b = this.g.b();
                    alur it = ((alog) K).iterator();
                    boolean z = false;
                    boolean z2 = false;
                    while (it.hasNext()) {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                        String O = bindData.O();
                        Optional of = Optional.of(((msk) this.m.b()).q(bindData));
                        if (of.equals(j)) {
                            z = true;
                        } else {
                            alur alurVar = it;
                            if ((!((Boolean) new mss(20).get()).booleanValue() || b.contains(of.get())) && (((Boolean) new mss(20).get()).booleanValue() || v.contains(O))) {
                                it = alurVar;
                            }
                            it = alurVar;
                            z2 = true;
                        }
                    }
                    if (z && z2) {
                        final tqc E = snaVar.E();
                        final boolean z3 = !snaVar.au();
                        final boolean z4 = !snaVar.av();
                        final String aa = snaVar.aa();
                        xhv L = snaVar.L();
                        ContentResolver contentResolver = this.l.getContentResolver();
                        final ArrayList arrayList = new ArrayList();
                        alur it2 = ((alog) K).iterator();
                        while (it2.hasNext()) {
                            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it2.next();
                            alur alurVar2 = it2;
                            if (!Optional.of(((msk) this.m.b()).q(bindData2)).equals(j)) {
                                arrayList.add(bindData2);
                            }
                            it2 = alurVar2;
                        }
                        Optional optional = j;
                        final long d = this.h.d(arrayList);
                        if (d < 0) {
                            a.q("failed to create thread.");
                            j = optional;
                        } else if (!((rtz) this.b.b()).n(wxr.b, d).b()) {
                            a.q("thread without current self already exists.");
                            j = optional;
                        } else {
                            ContentValues contentValues = new ContentValues(1);
                            Long valueOf = Long.valueOf(d);
                            contentValues.put("thread_id", valueOf);
                            mbm b2 = this.i.b("Bugle.Telephony.Update.Sms.Thread.Latency");
                            int d2 = vcp.d(contentResolver, Telephony.Sms.CONTENT_URI, contentValues, "thread_id=?", new String[]{Long.toString(yyb.cE(L))});
                            b2.c();
                            xze xzeVar = a;
                            xyo c = xzeVar.c();
                            c.F(d2);
                            c.H("SMS moved.");
                            c.z("from threadId", L);
                            c.y(str, d);
                            c.q();
                            ContentValues contentValues2 = new ContentValues(1);
                            contentValues2.put("thread_id", valueOf);
                            mbm b3 = this.i.b("Bugle.Telephony.Update.Mms.Thread.Latency");
                            if (L.c()) {
                                i = vcp.d(contentResolver, Telephony.Mms.CONTENT_URI, contentValues2, "thread_id=?", new String[]{Long.toString(yyb.cE(L))});
                            } else {
                                i = 0;
                            }
                            b3.c();
                            xyo c2 = xzeVar.c();
                            c2.F(i);
                            c2.H("MMS moved.");
                            c2.z("from threadId", L);
                            c2.y(str, d);
                            c2.q();
                            String str2 = str;
                            this.k.d(new Runnable() { // from class: rfh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RemoveSelfNumberFromConversationsAction removeSelfNumberFromConversationsAction = RemoveSelfNumberFromConversationsAction.this;
                                    rtz rtzVar = (rtz) removeSelfNumberFromConversationsAction.b.b();
                                    ruu a2 = ruv.a();
                                    a2.s(new xhv(d));
                                    tqc tqcVar = E;
                                    a2.b(tqcVar);
                                    a2.j(arrayList);
                                    a2.h(!z3);
                                    a2.i(!z4);
                                    a2.b = Optional.ofNullable(aa);
                                    a2.e(false);
                                    a2.f(false);
                                    ConversationIdType conversationIdType = rtzVar.i(a2.a()).a;
                                    boolean b4 = conversationIdType.b();
                                    ConversationIdType conversationIdType2 = C;
                                    if (b4) {
                                        xyo e2 = RemoveSelfNumberFromConversationsAction.a.e();
                                        e2.H("Unable to create target conversationId and move ");
                                        e2.b(conversationIdType2);
                                        e2.q();
                                        return;
                                    }
                                    sya syaVar = new sya();
                                    syaVar.aj("moveMessageToNewConversationLocally-messages");
                                    syaVar.i(conversationIdType);
                                    syaVar.P(new rbw(conversationIdType2, 5));
                                    int e3 = syaVar.a().e();
                                    xyo c3 = RemoveSelfNumberFromConversationsAction.a.c();
                                    c3.F(e3);
                                    c3.H("messages moved from");
                                    c3.E("conversation", "id", Long.valueOf(e3));
                                    c3.H("to target");
                                    c3.b(conversationIdType);
                                    c3.q();
                                    tbt tbtVar = new tbt();
                                    tbtVar.aj("moveMessageToNewConversationLocally-parts");
                                    tbtVar.f(conversationIdType);
                                    tbu tbuVar = new tbu();
                                    tbuVar.e(conversationIdType2);
                                    tbtVar.Z(new agpw(tbuVar));
                                    tbtVar.a().e();
                                    if (!((uzo) removeSelfNumberFromConversationsAction.d.b()).f(conversationIdType2)) {
                                        ((ruq) removeSelfNumberFromConversationsAction.c.b()).j(conversationIdType2, tqcVar);
                                        RemoveSelfNumberFromConversationsAction.a.q("Source conversation not empty.");
                                    }
                                    ((ruq) removeSelfNumberFromConversationsAction.c.b()).a(conversationIdType, true, tqcVar);
                                    removeSelfNumberFromConversationsAction.e.i(conversationIdType2);
                                    removeSelfNumberFromConversationsAction.e.i(conversationIdType);
                                }
                            });
                            vjs vjsVar = this.j;
                            aozy createBuilder = vjr.a.createBuilder();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            vjr.a((vjr) createBuilder.b);
                            vjsVar.d((vjr) createBuilder.s());
                            this.n.h();
                            j = optional;
                            str = str2;
                            i2 = 2;
                        }
                    }
                    i2 = 2;
                }
            } finally {
            }
        }
        snaVar.close();
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RemoveSelfNumberFromConversationsAction(armf armfVar, armf armfVar2, armf armfVar3, yjy yjyVar, yjr yjrVar, wyt wytVar, mce mceVar, vjs vjsVar, vjs vjsVar2, uhj uhjVar, agnq agnqVar, armf armfVar4, Context context, Parcel parcel) {
        super(parcel, amdy.REMOVE_SELF_NUMBER_FROM_CONVERSATIONS_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.f = yjyVar;
        this.g = yjrVar;
        this.h = wytVar;
        this.i = mceVar;
        this.n = vjsVar;
        this.j = vjsVar2;
        this.e = uhjVar;
        this.k = agnqVar;
        this.l = context;
        this.m = armfVar4;
    }
}
