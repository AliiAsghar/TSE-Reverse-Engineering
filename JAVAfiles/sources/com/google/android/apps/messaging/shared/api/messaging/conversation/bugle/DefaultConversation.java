package com.google.android.apps.messaging.shared.api.messaging.conversation.bugle;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.agmt;
import defpackage.agnc;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alls;
import defpackage.alog;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.anen;
import defpackage.aozy;
import defpackage.apag;
import defpackage.armf;
import defpackage.arwe;
import defpackage.kor;
import defpackage.kru;
import defpackage.krv;
import defpackage.lfx;
import defpackage.lig;
import defpackage.ltv;
import defpackage.mja;
import defpackage.mjg;
import defpackage.mjz;
import defpackage.mlt;
import defpackage.mlz;
import defpackage.mma;
import defpackage.mmb;
import defpackage.mpj;
import defpackage.mpp;
import defpackage.mtc;
import defpackage.mtn;
import defpackage.mto;
import defpackage.muc;
import defpackage.mzt;
import defpackage.nco;
import defpackage.ncq;
import defpackage.ndi;
import defpackage.nfx;
import defpackage.okf;
import defpackage.qdq;
import defpackage.qiu;
import defpackage.uvn;
import defpackage.yga;
import defpackage.yyb;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DefaultConversation implements BugleConversation {
    public final BugleConversationId a;
    public final anen b;
    public final ncq c;
    public final ncq d;
    public final ncq e;
    public final ncq f;
    private final boolean h;
    private final ncq i;
    private final alhr j;
    private final armf k;
    private final AtomicBoolean l = new AtomicBoolean(false);
    private yga m;
    private final armf n;
    private final armf o;
    private static final alvi g = alvi.m("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversation");
    public static final Parcelable.Creator<Conversation> CREATOR = new ltv(4);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        lig QV();
    }

    public DefaultConversation(anen anenVar, ndi ndiVar, nfx nfxVar, armf armfVar, mlt mltVar, armf armfVar2, mto mtoVar, kor korVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, BugleConversationId bugleConversationId, boolean z) {
        this.a = bugleConversationId;
        this.b = anenVar;
        this.h = z;
        this.o = armfVar6;
        nco u = korVar.u(ndiVar.d(bugleConversationId));
        this.c = u;
        this.d = korVar.u(nfxVar.b());
        nco u2 = korVar.u(mltVar.a(bugleConversationId));
        this.e = u2;
        this.j = albo.D(new mma(this, mtoVar, bugleConversationId, z, 0));
        this.k = armfVar3;
        this.f = korVar.u(((qdq) armfVar2.b()).p(u, u2, nfxVar.a(), bugleConversationId));
        this.n = armfVar;
        this.i = korVar.u(((qdq) armfVar4.b()).o(u2, u));
        albo.D(new mlz(armfVar5, 2));
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final mja a() {
        return ((mtn) this.j.get()).a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final mjg b() {
        return (mjg) this.j.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId c() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        if (this.j.get() != null) {
            ((mtn) this.j.get()).close();
        }
        yga ygaVar = this.m;
        if (ygaVar != null) {
            ygaVar.close();
            this.m = null;
        }
        alvw g2 = g.g();
        g2.X(alwp.a, "BugleConversation");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversation", "close", 344, "DefaultConversation.java")).t("Conversation closed: %s.", this.a.b());
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ncq d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ncq e() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ncq f() {
        if (((okf) this.n.b()).a()) {
            return this.i;
        }
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final uvn g() {
        qdq qdqVar = (qdq) this.o.b();
        arwe arweVar = (arwe) ((kru) qdqVar.a).a.dO.b();
        krv krvVar = ((kru) qdqVar.a).a;
        return new mpp(this, arweVar, krvVar.ug, krvVar.Df);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void h() {
        if (this.l.compareAndSet(false, true)) {
            Stream map = Collection.EL.stream((Set) this.k.b()).map(new mjz(this, 10));
            int i = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            if (!alogVar.isEmpty()) {
                akrh e = aktp.e("notifyIsInteractive");
                try {
                    akul ad = aktp.ad(alogVar);
                    e.b(ad);
                    qiu.h(ad);
                    e.close();
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final lfx i() {
        return ((mtn) this.j.get()).z();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation
    public final BugleConversationId j() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation
    public final mtn k() {
        return (mtn) this.j.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation
    public final ncq l() {
        return this.e;
    }

    public final void m() {
        alvw g2 = g.g();
        g2.X(alwp.a, "BugleConversation");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversation", "startPreload", 305, "DefaultConversation.java")).t("Conversation preloading: %s.", this.a.b());
        this.m = yyb.aK(this.e.a(new mmb(1)), this.c.a(new mmb(0)), this.d.a(new mmb(2)), this.f.a(new mmb(3)));
        agmt agmtVar = agnc.c;
        if (agmtVar.e() && !agmtVar.b()) {
            aktp.ag(null);
        } else {
            this.e.b();
        }
        this.c.b();
        this.d.b();
        this.f.b();
        mjg mjgVar = (mjg) this.j.get();
        if (mjgVar instanceof mzt) {
            ((mzt) mjgVar).G();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aozy createBuilder = mpj.a.createBuilder();
        String bugleConversationId = this.a.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        bugleConversationId.getClass();
        ((mpj) apagVar).b = bugleConversationId;
        boolean z = this.h;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((mpj) createBuilder.b).c = z;
        Bundle bundle = new Bundle();
        bundle.putParcelable("proto", new ProtoParsers$InternalDontUse(null, (mpj) createBuilder.s()));
        parcel.writeBundle(bundle);
    }

    public DefaultConversation(anen anenVar, ndi ndiVar, nfx nfxVar, armf armfVar, mlt mltVar, armf armfVar2, mto mtoVar, kor korVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, BugleConversationId bugleConversationId, boolean z, mtc mtcVar) {
        this.a = bugleConversationId;
        this.b = anenVar;
        this.h = z;
        this.o = armfVar6;
        nco u = korVar.u(ndiVar.d(bugleConversationId));
        this.c = u;
        this.d = korVar.u(nfxVar.b());
        nco u2 = korVar.u(mltVar.a(bugleConversationId));
        this.e = u2;
        this.j = albo.D(new muc(this, mtoVar, bugleConversationId, mtcVar, z, 1));
        this.k = armfVar3;
        this.f = korVar.u(((qdq) armfVar2.b()).p(u, u2, nfxVar.a(), bugleConversationId));
        this.n = armfVar;
        this.i = korVar.u(((qdq) armfVar4.b()).o(u2, u));
        albo.D(new mlz(armfVar5, 0));
    }
}
