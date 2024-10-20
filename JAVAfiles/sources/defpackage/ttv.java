package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ttv implements wzb {
    private static final xze n = xze.g("BugleEtouffee", "EncryptedRcsFileTransferDetailsConverter");
    public final ttz a;

    @Deprecated
    public final vbu b;
    public final msk c;
    public final armf d;
    public final tvr e;
    public final armf f;
    public final ajsg g;
    public final armf h;
    public final armf i;
    public final anen j;
    public final armf k;
    public final tvy l;
    public final iji m;
    private final pvz o;
    private final xah p;
    private final trz q;
    private final pwb r = new pwb();
    private final armf s;
    private final armf t;
    private final anen u;
    private final anen v;

    public ttv(iji ijiVar, ttz ttzVar, vbu vbuVar, pvz pvzVar, xah xahVar, msk mskVar, trz trzVar, armf armfVar, tvy tvyVar, tvr tvrVar, armf armfVar2, ajsg ajsgVar, armf armfVar3, armf armfVar4, armf armfVar5, anen anenVar, anen anenVar2, anen anenVar3, armf armfVar6, armf armfVar7) {
        this.m = ijiVar;
        this.a = ttzVar;
        this.b = vbuVar;
        this.o = pvzVar;
        this.p = xahVar;
        this.c = mskVar;
        this.q = trzVar;
        this.d = armfVar;
        this.l = tvyVar;
        this.e = tvrVar;
        this.f = armfVar2;
        this.g = ajsgVar;
        this.h = armfVar3;
        this.i = armfVar4;
        this.s = armfVar6;
        this.t = armfVar7;
        this.k = armfVar5;
        this.u = anenVar;
        this.j = anenVar2;
        this.v = anenVar3;
    }

    public static spr a(rve rveVar) {
        spt b = spv.b();
        b.w("getEtouffeeMessageByRcsId3");
        b.c(new ttr(rveVar, 0));
        return (spr) b.b().n();
    }

    private final apwk d(MessageCoreData messageCoreData) {
        MessagePartCoreData G = messageCoreData.G();
        G.getClass();
        G.bH();
        spr a = a(messageCoreData.D());
        try {
            if (a.moveToFirst()) {
                apwk apwkVar = (apwk) b(a).s();
                a.close();
                return apwkVar;
            }
            ((iji) this.i.b()).r(messageCoreData.D(), 6);
            throw new IllegalArgumentException("The etouffee metadata was missing.");
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final akul e(qeq qeqVar, MessageCoreData messageCoreData, aoia aoiaVar) {
        return this.p.c(qeqVar, messageCoreData, aoiaVar).h(new raw(this, messageCoreData, 12, null), this.j);
    }

    public final aozy b(spr sprVar) {
        if (!sprVar.isClosed() && !sprVar.isBeforeFirst() && !sprVar.isAfterLast()) {
            aozy createBuilder = apwk.a.createBuilder();
            byte[] p = sprVar.p();
            if (p != null) {
                byte[] o = sprVar.o();
                if (o != null) {
                    aozy createBuilder2 = apwj.a.createBuilder();
                    aozb w = aozb.w(p);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apwj apwjVar = (apwj) createBuilder2.b;
                    apwjVar.b |= 1;
                    apwjVar.c = w;
                    aozb w2 = aozb.w(o);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apwj apwjVar2 = (apwj) createBuilder2.b;
                    apwjVar2.b |= 2;
                    apwjVar2.d = w2;
                    int c = sprVar.c();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apwj apwjVar3 = (apwj) createBuilder2.b;
                    apwjVar3.b |= 4;
                    apwjVar3.e = c;
                    if (this.q.v()) {
                        String m = sprVar.m();
                        if (m != null) {
                            String l = sprVar.l();
                            if (l != null) {
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                apwj apwjVar4 = (apwj) createBuilder2.b;
                                apwjVar4.b = 8 | apwjVar4.b;
                                apwjVar4.f = m;
                                qel qelVar = (qel) this.r.m().fu(ContentType.d(l));
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                apwj apwjVar5 = (apwj) createBuilder2.b;
                                qelVar.getClass();
                                apwjVar5.g = qelVar;
                                apwjVar5.b |= 16;
                            } else {
                                ((iji) this.i.b()).r(sprVar.g(), 10);
                                throw new IllegalArgumentException("The etouffee metadata is missing the content type of the attachment.");
                            }
                        } else {
                            ((iji) this.i.b()).r(sprVar.g(), 9);
                            throw new IllegalArgumentException("The etouffee metadata is missing the name of the attachment.");
                        }
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apwk apwkVar = (apwk) createBuilder.b;
                    apwj apwjVar6 = (apwj) createBuilder2.s();
                    apwjVar6.getClass();
                    apwkVar.d = apwjVar6;
                    apwkVar.b |= 2;
                    byte[] t = sprVar.t();
                    byte[] s = sprVar.s();
                    if (t != null && s != null) {
                        aozy createBuilder3 = apwj.a.createBuilder();
                        aozb w3 = aozb.w(t);
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apwj apwjVar7 = (apwj) createBuilder3.b;
                        apwjVar7.b |= 1;
                        apwjVar7.c = w3;
                        aozb w4 = aozb.w(s);
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apwj apwjVar8 = (apwj) createBuilder3.b;
                        apwjVar8.b |= 2;
                        apwjVar8.d = w4;
                        int e = sprVar.e();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apwj apwjVar9 = (apwj) createBuilder3.b;
                        apwjVar9.b |= 4;
                        apwjVar9.e = e;
                        if (this.q.v()) {
                            String n2 = sprVar.n();
                            if (n2 != null) {
                                qel qelVar2 = (qel) this.r.m().fu(ContentType.d(n2));
                                if (!createBuilder3.b.isMutable()) {
                                    createBuilder3.u();
                                }
                                apwj apwjVar10 = (apwj) createBuilder3.b;
                                qelVar2.getClass();
                                apwjVar10.g = qelVar2;
                                apwjVar10.b |= 16;
                            } else {
                                ((iji) this.i.b()).r(sprVar.g(), 11);
                                throw new IllegalArgumentException("The etouffee metadata is missing the content type of the thumbnail.");
                            }
                        }
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apwk apwkVar2 = (apwk) createBuilder.b;
                        apwj apwjVar11 = (apwj) createBuilder3.s();
                        apwjVar11.getClass();
                        apwkVar2.c = apwjVar11;
                        apwkVar2.b |= 1;
                    }
                    return createBuilder;
                }
                ((iji) this.i.b()).r(sprVar.g(), 8);
                throw new IllegalArgumentException("The etouffee metadata is missing attachment digest.");
            }
            ((iji) this.i.b()).r(sprVar.g(), 7);
            throw new IllegalArgumentException("The etouffee metadata is missing the attachment one time media key.");
        }
        throw new IllegalArgumentException("Invalid cursor while reading etouffee metadata.");
    }

    @Override // defpackage.wzb
    public final akul c(qeq qeqVar, MessageCoreData messageCoreData, aoia aoiaVar) {
        akul i;
        akul ag;
        if (((okg) this.k.b()).a()) {
            i = aktp.aj(new imi(this, messageCoreData.w(), 17, null), this.u);
        } else {
            vbu vbuVar = this.b;
            iji ijiVar = this.m;
            akul c = vbuVar.c();
            ijiVar.getClass();
            i = c.i(new tsz(ijiVar, 6), this.u);
        }
        akul akulVar = i;
        if (this.q.v()) {
            if (((Boolean) this.t.b()).booleanValue()) {
                if (!aoiaVar.e() && ((Optional) ((apxx) this.s).a).isPresent()) {
                    ueo ueoVar = (ueo) ((Optional) ((apxx) this.s).a).get();
                    aoiaVar.b();
                    if (ueoVar.a()) {
                        n.l("Found a matrix user");
                        ag = e(qeqVar, messageCoreData, aoiaVar);
                    }
                }
                ag = aktp.ag(d(messageCoreData));
            } else {
                ag = aktp.ag(d(messageCoreData));
            }
            akul akulVar2 = ag;
            return aktp.an(akulVar, akulVar2).i(new ttt(this, messageCoreData, qeqVar, akulVar, akulVar2, aoiaVar, 0), this.u).h(new ttu(0), this.u).e(IllegalStateException.class, new ttu(2), this.u);
        }
        akul e = e(qeqVar, messageCoreData, aoiaVar);
        return aktp.an(akulVar, e).i(new ttt(this, messageCoreData, e, akulVar, this.c.y(aoiaVar), aoiaVar, 2), this.v).h(new ttu(0), this.u).e(IllegalStateException.class, new ttu(1), this.u);
    }
}
