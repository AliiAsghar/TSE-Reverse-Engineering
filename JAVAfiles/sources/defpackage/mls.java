package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mls implements ncq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier");
    public final anen b;
    public final anen c;
    public final armf d;
    public final BugleConversationId e;
    public final rzz f;
    public final nfx g;
    public final ncq h;
    public yga i;
    public final nfx j;
    public final msk k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final moc p;
    public final yyt q;

    /* JADX WARN: Type inference failed for: r2v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    public mls(wfh wfhVar, anen anenVar, anen anenVar2, iew iewVar, nfx nfxVar, lfl lflVar, msk mskVar, nfx nfxVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, BugleConversationId bugleConversationId, armf armfVar5, armf armfVar6) {
        this.q = wfhVar.Y(new mlr(this, 0));
        this.b = anenVar;
        this.c = anenVar2;
        this.d = armfVar3;
        this.e = bugleConversationId;
        this.n = armfVar5;
        this.f = new rzz((wfh) iewVar.a.b(), e(bugleConversationId), new ldx(18), "getPropertiesById");
        this.g = nfxVar;
        this.h = nfxVar.a();
        lqn y = lflVar.y();
        ncq d = ((ndi) armfVar4.b()).d(bugleConversationId);
        jat jatVar = (jat) y.a;
        arwe arweVar = (arwe) jatVar.e.b();
        arweVar.getClass();
        arwe arweVar2 = (arwe) jatVar.a.b();
        arweVar2.getClass();
        wfh wfhVar2 = (wfh) jatVar.d.b();
        wfhVar2.getClass();
        iew iewVar2 = (iew) jatVar.c.b();
        iewVar2.getClass();
        qvv qvvVar = (qvv) jatVar.f.b();
        qvvVar.getClass();
        this.p = new moc(arweVar, arweVar2, wfhVar2, iewVar2, jatVar.g, qvvVar, jatVar.b, bugleConversationId, d);
        this.k = mskVar;
        this.j = nfxVar2;
        this.l = armfVar;
        this.m = armfVar2;
        this.o = armfVar6;
    }

    public static mmy d(smr smrVar) {
        if (uzz.g() && smrVar.at("parental_approval_status")) {
            if (smrVar.an("parental_approval_status").equals("1")) {
                return mmy.b;
            }
            return mmy.c;
        }
        return mmy.a;
    }

    static sne e(BugleConversationId bugleConversationId) {
        Object apply;
        smv smvVar = sni.c.a;
        smu smuVar = sni.c;
        int i = 9;
        alog C = alog.C(smvVar, smuVar.O, smuVar.R, smuVar.q, smuVar.c, smuVar.d, smuVar.ak, smuVar.N, smuVar.p, smuVar.P, smuVar.H, smuVar.A, smuVar.t, smuVar.aq, smuVar.ap, smuVar.ab, smuVar.aa, smuVar.M, smuVar.y, smuVar.an, smuVar.ar, smuVar.af, smuVar.as);
        alob alobVar = new alob();
        alobVar.j(C);
        alobVar.h(sni.c.ag);
        if (uzz.g()) {
            alobVar.h(sni.c.D);
        }
        snf e = sni.e();
        e.w("getConversationRowByIdQuery");
        e.c((smv[]) Collection.EL.toArray(alobVar.g(), new mlo(0)));
        e.h(new mjz(bugleConversationId, 8));
        if (uzz.g()) {
            taa taaVar = new taa(tac.a);
            taaVar.c((szw) tac.d.a);
            apply = new mjz(bugleConversationId, i).apply(new tab());
            taaVar.k(new agpw((tab) apply));
            e.n(new agow(taaVar.b()), "parental_approval_status");
        }
        return e.b();
    }

    public static Optional h(alog alogVar, SelfIdentityId selfIdentityId) {
        if (selfIdentityId == null) {
            return Optional.empty();
        }
        return Collection.EL.stream(alogVar).filter(new isg(selfIdentityId, 8)).findFirst();
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.q.w(new kzq(ncpVar, 2), "BugleConversationPropertiesSupplier::register", "BugleConversationPropertiesSupplier::callback", "BugleConversationPropertiesSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        akrh e = aktp.e("getPropertiesForConversation");
        try {
            akul i = e(this.e).s().i(new ancs() { // from class: mln
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj) {
                    Instant instant;
                    amjj amjjVar;
                    String P;
                    boolean z;
                    Uri uri;
                    boolean z2;
                    alog alogVar = (alog) obj;
                    mlx mlxVar = new mlx();
                    mlxVar.b(tqc.UNARCHIVED);
                    mlxVar.d(0);
                    mlxVar.l(true);
                    mlxVar.g(false);
                    mlxVar.f(qpd.NONE);
                    mlxVar.j(0);
                    mlxVar.p(amjj.SEND_MODE_AUTO);
                    mlp mlpVar = null;
                    mlxVar.e = null;
                    mlxVar.e(false);
                    mlxVar.f = null;
                    mlxVar.i(false);
                    mlxVar.h(false);
                    mlxVar.o(-1L);
                    mlxVar.r(false);
                    mlxVar.q(false);
                    mlxVar.m(new mod(moe.HIDDEN, null));
                    mlxVar.i = null;
                    mlxVar.n(mmy.b);
                    mlxVar.k(vvh.a);
                    mlxVar.c(false);
                    mlxVar.k = true;
                    short s = mlxVar.m;
                    mlxVar.l = true;
                    mlxVar.m = (short) (s | 6144);
                    utk utkVar = utk.a;
                    if (utkVar != null) {
                        mls mlsVar = mls.this;
                        mlxVar.j = utkVar;
                        BugleConversationId bugleConversationId = mlsVar.e;
                        if (bugleConversationId != null) {
                            mlxVar.a = bugleConversationId;
                            if (alogVar.isEmpty()) {
                                mlxVar.e(true);
                                return aktp.ag(mlxVar.a());
                            }
                            smr smrVar = (smr) alzz.aP(alogVar);
                            if (smrVar.I().isPresent()) {
                                instant = (Instant) smrVar.I().get();
                            } else {
                                instant = null;
                            }
                            mlxVar.d(smrVar.h());
                            mlxVar.g(smrVar.ac());
                            mlxVar.f(smrVar.w());
                            mlxVar.j(smrVar.l());
                            int p = smrVar.p();
                            if (p != 0) {
                                if (p != 1) {
                                    if (p != 2) {
                                        amjjVar = amjj.UNKNOWN_SEND_MODE;
                                    } else {
                                        amjjVar = amjj.SEND_MODE_XMS_LATCH;
                                    }
                                } else {
                                    amjjVar = amjj.SEND_MODE_XMS;
                                }
                            } else {
                                amjjVar = amjj.SEND_MODE_AUTO;
                            }
                            mlxVar.p(amjjVar);
                            if (!uzz.g()) {
                                P = smrVar.P();
                            } else if (mls.d(smrVar) != mmy.b && tvu.c(smrVar.h())) {
                                P = ((Context) mlsVar.o.b()).getString(R.string.unapproved_group_conversation_name);
                            } else {
                                P = smrVar.P();
                            }
                            mlxVar.b = P;
                            if (smrVar.B() != tqh.NAME_IS_MANUAL) {
                                z = true;
                            } else {
                                z = false;
                            }
                            mlxVar.l(z);
                            mlxVar.b(smrVar.A());
                            if (mls.d(smrVar) == mmy.c) {
                                uri = Uri.parse("android.resource://com.google.android.apps.messaging.shared.kids/" + uxi.c(smrVar.o()));
                                uri.getClass();
                            } else if (smrVar.O() != null) {
                                uri = Uri.parse(smrVar.O());
                            } else {
                                uri = null;
                            }
                            mlxVar.f = uri;
                            mlxVar.o(smrVar.s());
                            mlxVar.g = smrVar.S();
                            mlxVar.i(smrVar.ae());
                            if (smrVar.k() == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            mlxVar.h(z2);
                            mlxVar.r(smrVar.ab());
                            mlxVar.c = smrVar.U();
                            mlxVar.d = smrVar.V();
                            mlxVar.h = instant;
                            vst C = smrVar.C();
                            if (C != null) {
                                mlpVar = new mlp(C);
                            }
                            mlxVar.i = mlpVar;
                            mlxVar.q(smrVar.ah());
                            mlxVar.k(smrVar.E());
                            mlxVar.n(mls.d(smrVar));
                            mlxVar.c(smrVar.D().d(vtl.REMOVE_USER_BY_ALL));
                            if (((orj) mlsVar.l.b()).a() && smrVar.h() == 0 && mlsVar.k.p(albo.ag(smrVar.S())).B()) {
                                return mlsVar.j.a().b().h(new mds(mlxVar, 10), mlsVar.b);
                            }
                            SelfIdentityId W = lga.W(smrVar.K());
                            akul b = mlsVar.h.b();
                            akul i2 = b.i(new mhv(mlsVar, W, smrVar, 2), mlsVar.c);
                            return aktp.an(b, i2).i(new ttt(mlsVar, b, W, i2, mlxVar, smrVar, 1), mlsVar.c);
                        }
                        throw new NullPointerException("Null id");
                    }
                    throw new NullPointerException("Null encryptionProtocol");
                }
            }, this.b);
            e.b(i);
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final akul f() {
        return aktp.ah(new kut(this, 17), this.b);
    }

    public final akul g(ConversationIdType conversationIdType, alog alogVar, mlx mlxVar) {
        return aktp.ai(new haw(alogVar, conversationIdType, 17, null), this.c).h(new mds(mlxVar, 9), this.c);
    }
}
