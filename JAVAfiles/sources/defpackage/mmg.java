package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmg implements mlu, mld {
    public static final alwo a = alwo.o("BugleConversation");
    private final armf A;
    private final armf B;
    private final armf C;
    private final uie D;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final xnv i;
    public final anen j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final lig n;
    public final vyv o;
    private final mng p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final anen v;
    private final anen w;
    private final armf x;
    private final armf y;
    private final armf z;

    public mmg(lig ligVar, armf armfVar, mng mngVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, xnv xnvVar, anen anenVar, anen anenVar2, anen anenVar3, uie uieVar, vyv vyvVar, armf armfVar13, armf armfVar14, armf armfVar15, lfl lflVar, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21) {
        this.n = ligVar;
        this.e = armfVar;
        this.p = mngVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.q = armfVar4;
        this.d = armfVar5;
        this.r = armfVar6;
        this.f = armfVar7;
        this.g = armfVar8;
        this.s = armfVar9;
        this.t = armfVar10;
        this.u = armfVar11;
        this.h = armfVar12;
        this.i = xnvVar;
        this.j = anenVar;
        this.v = anenVar2;
        this.w = anenVar3;
        this.D = uieVar;
        this.o = vyvVar;
        this.x = armfVar13;
        this.y = armfVar14;
        this.z = armfVar15;
        lflVar.y();
        this.A = armfVar16;
        this.B = armfVar17;
        this.k = armfVar18;
        this.l = armfVar19;
        this.m = armfVar20;
        this.C = armfVar21;
    }

    public static /* synthetic */ arnb F() {
        ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversationInternal", 445, "DefaultConversationRepository.java")).q("get or create conversation timeout.");
        return arnb.a;
    }

    private final void G(DefaultConversation defaultConversation, miv mivVar) {
        Stream map = Collection.EL.stream((Set) this.u.b()).map(new kzr(this, defaultConversation, mivVar, 8));
        int i = alog.d;
        alog alogVar = (alog) map.collect(alls.a);
        if (!alogVar.isEmpty()) {
            akrh e = aktp.e("OpenConversationNotify");
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

    @Override // defpackage.mlu
    public final BugleConversation A(BugleConversationId bugleConversationId, boolean z) {
        return this.n.i(bugleConversationId, z);
    }

    @Override // defpackage.mlu
    public final akul B(ConversationId conversationId, amjj amjjVar) {
        int i;
        akrh e = aktp.e("ConversationRepository#updateConversationSendMode");
        try {
            d.s(conversationId instanceof BugleConversationId);
            ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            sng sngVar = new sng();
            if (amjjVar == amjj.SEND_MODE_AUTO) {
                i = 0;
            } else if (amjjVar == amjj.SEND_MODE_XMS) {
                i = 1;
            } else if (amjjVar == amjj.SEND_MODE_XMS_LATCH) {
                i = 2;
            } else {
                throw new IllegalArgumentException("Value of sendMode is invalid");
            }
            sngVar.P(i);
            akul ai = aktp.ai(new hbd(this, conversationIdType, sngVar, 10), this.w);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    @Override // defpackage.mlu
    public final BugleConversation C(BugleConversationId bugleConversationId, miv mivVar, mtc mtcVar) {
        akrh akrhVar;
        boolean z;
        lig ligVar;
        anen anenVar;
        ndi ndiVar;
        nfx nfxVar;
        ?? r8;
        mlt mltVar;
        ?? r10;
        mto mtoVar;
        kor korVar;
        DefaultConversation defaultConversation;
        akrh e = aktp.e("ConversationRepository#openConversationForDelegation");
        try {
            if (mivVar == miv.FOR_DISPLAY) {
                z = true;
            } else {
                z = false;
            }
            ligVar = this.n;
            anenVar = (anen) ligVar.j.b();
            anenVar.getClass();
            ndiVar = (ndi) ligVar.h.b();
            ndiVar.getClass();
            nfxVar = (nfx) ligVar.a.b();
            nfxVar.getClass();
            r8 = ligVar.b;
            mltVar = (mlt) ligVar.k.b();
            mltVar.getClass();
            r10 = ligVar.f;
            mtoVar = (mto) ligVar.e.b();
            mtoVar.getClass();
            korVar = (kor) ligVar.i.b();
            korVar.getClass();
            akrhVar = e;
        } catch (Throwable th) {
            th = th;
            akrhVar = e;
        }
        try {
            DefaultConversation defaultConversation2 = new DefaultConversation(anenVar, ndiVar, nfxVar, r8, mltVar, r10, mtoVar, korVar, ligVar.d, ligVar.c, ligVar.l, ligVar.g, bugleConversationId, z, mtcVar);
            if (z) {
                defaultConversation2.m();
                defaultConversation = defaultConversation2;
            } else {
                defaultConversation = defaultConversation2;
                G(defaultConversation, mivVar);
            }
            akrhVar.close();
            return defaultConversation;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                akrhVar.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // defpackage.mlu
    public final akul D(ConversationId conversationId) {
        akrh e = aktp.e("ConversationRepository#updateConversationJoinState");
        try {
            d.s(conversationId instanceof BugleConversationId);
            akul ai = aktp.ai(new haw(this, ((BugleConversationId) conversationId).a, 20), this.w);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul E(BugleConversationId bugleConversationId, String str, boolean z) {
        return aktp.ai(new wtz(this, bugleConversationId, str, z, 1), this.v);
    }

    @Override // defpackage.miw
    public final Conversation a(ConversationId conversationId, miv mivVar) {
        boolean z;
        akrh e = aktp.e("ConversationRepository#openConversation");
        try {
            d.s(conversationId instanceof BugleConversationId);
            BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
            if (mivVar == miv.FOR_DISPLAY) {
                z = true;
            } else {
                z = false;
            }
            DefaultConversation i = this.n.i(bugleConversationId, z);
            if (z) {
                i.m();
            } else {
                G(i, mivVar);
            }
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

    @Override // defpackage.miw
    public final /* synthetic */ ConversationId b(mpi mpiVar) {
        return lgc.J();
    }

    @Override // defpackage.miw
    public final /* synthetic */ ConversationId c(byte[] bArr) {
        return lgc.K();
    }

    @Override // defpackage.miw
    public final ncq d(ConversationId conversationId) {
        return this.p.a(conversationId);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    @Override // defpackage.miw
    public final ncq e(int i, boolean z) {
        ifq ifqVar = (ifq) this.t.b();
        arwe arweVar = (arwe) ifqVar.b.b();
        arweVar.getClass();
        lfl lflVar = (lfl) ifqVar.c.b();
        lflVar.getClass();
        iew iewVar = (iew) ifqVar.d.b();
        iewVar.getClass();
        lxe lxeVar = (lxe) ifqVar.e.b();
        lxeVar.getClass();
        osb osbVar = (osb) ifqVar.a.b();
        osbVar.getClass();
        return new mmo(arweVar, lflVar, iewVar, lxeVar, osbVar, i, z);
    }

    @Override // defpackage.miw
    public final akul f(ConversationId conversationId, amfe amfeVar) {
        akrh e = aktp.e("ConversationRepository#archiveConversation");
        try {
            d.s(conversationId instanceof BugleConversationId);
            akul ai = aktp.ai(new hbd(this, (BugleConversationId) conversationId, amfeVar, 8, (char[]) null), this.v);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul g(ConversationId conversationId) {
        akrh e = aktp.e("ConversationRepository#clearDraftSnippet");
        try {
            d.s(conversationId instanceof BugleConversationId);
            akul c = this.D.c("DefaultConversationRepository#clearDraftSnippet", new fgh(this, ((BugleConversationId) conversationId).a, 9, null));
            e.close();
            return c;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul h(mqy mqyVar) {
        akrh e = aktp.e("ConversationRepository#findConversation");
        try {
            akul a2 = ((mpy) this.B.b()).a(mqyVar);
            e.close();
            return a2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul i(alog alogVar) {
        akul h;
        akrh e = aktp.e("ConversationRepository#findConversation");
        try {
            if (alogVar.isEmpty()) {
                ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "findConversation", 304, "DefaultConversationRepository.java")).q("Unable to findConversation: Empty recipient list.");
                h = aktp.af(new IllegalArgumentException("Unable to findConversation: Empty recipient list."));
            } else {
                h = ((qpj) this.y.b()).i((alog) Collection.EL.stream(alogVar).map(new mlm(6)).distinct().filter(new mmd(0)).collect(alls.a)).h(new mme(0), this.j);
            }
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul j() {
        return ((mpa) this.A.b()).a();
    }

    @Override // defpackage.miw
    public final akul k(alog alogVar, String str) {
        return l(Optional.empty(), alogVar, str);
    }

    @Override // defpackage.miw
    public final akul l(Optional optional, alog alogVar, String str) {
        akul i;
        akul h;
        akrh e = aktp.e("ConversationRepository#getOrCreateConversation");
        try {
            if (alogVar.isEmpty()) {
                ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversation", 241, "DefaultConversationRepository.java")).q("Unable to getOrCreateConversation: Empty recipient list.");
                i = aktp.af(new IllegalArgumentException("Unable to getOrCreateConversation: Empty recipient list."));
            } else {
                akul ag = aktp.ag(false);
                if (alogVar.size() > 1) {
                    alwo alwoVar = a;
                    ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversation", 249, "DefaultConversationRepository.java")).q("Attempting to create an RCS group conversation, verifying cached RCS availabilityfor participants.");
                    alog alogVar2 = (alog) Collection.EL.stream(alogVar).map(new mjz(this, 14)).collect(alls.a);
                    if (optional.isEmpty()) {
                        ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "isRcsConversationCreationEnabledForSelfIdentity", 473, "DefaultConversationRepository.java")).q("Missing self identity when determining isRcsConversationCreationEnabled.");
                        h = aktp.ag(false);
                    } else {
                        akul h2 = ((nfw) optional.get()).h(mjq.RICH);
                        akul b = ((nfw) optional.get()).d().b();
                        h = aktp.an(h2, b).h(new haw(h2, b, 19), this.v);
                    }
                    alob alobVar = new alob();
                    alobVar.j(alogVar2);
                    alobVar.h(h);
                    ag = akul.g(albo.bO(alobVar.g())).i(new jab(8), this.j);
                }
                i = ag.i(new mmc(this, optional, alogVar, str, 2), this.j);
            }
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.miw
    public final akul m(ConversationId conversationId, mnk mnkVar, Recipient recipient) {
        akul c;
        akrh e = aktp.e("ConversationRepository#incomingRichThemeUpdate");
        try {
            BugleConversation A = A((BugleConversationId) conversationId, false);
            mnl mnlVar = (mnl) ((Optional) this.x.b()).orElseThrow();
            recipient.getClass();
            if (!((ogt) mnlVar.d.b()).a()) {
                c = qjh.c(mnlVar.b, arpj.a, arwf.a, new icw(mnlVar, A, mnkVar, recipient, (arpe) null, 7));
            } else {
                c = mnlVar.e.c("RichThemeControllerImpl#incomingRichThemeUpdate", new mrf(mnlVar, (Conversation) A, mnkVar, recipient, 1));
                c.getClass();
            }
            e.close();
            return c;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul n(ConversationId conversationId) {
        akrh e = aktp.e("ConversationRepository#leaveConversation");
        try {
            d.s(conversationId instanceof BugleConversationId);
            BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
            akul i = ((mlt) this.r.b()).a(bugleConversationId).b().i(new woq(this, bugleConversationId, this.i.f().toEpochMilli(), 1), this.j);
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

    @Override // defpackage.miw
    public final akul o(ConversationId conversationId, mnk mnkVar) {
        akul c;
        akrh e = aktp.e("ConversationRepository#outgoingRichThemeUpdate");
        try {
            if (!(conversationId instanceof BugleConversationId)) {
                c = aktp.af(new UnsupportedOperationException("ConversationId must be type BugleConversationId"));
            } else {
                BugleConversation A = A((BugleConversationId) conversationId, false);
                mnl mnlVar = (mnl) ((Optional) this.x.b()).orElseThrow();
                c = qjh.c(mnlVar.b, arpj.a, arwf.a, new jyw(mnlVar, A, mnkVar, (arpe) null, 14));
            }
            e.close();
            return c;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul p(Recipient recipient) {
        akrh e = aktp.e("ConversationRepository#refreshAllConversationIconsForRecipient");
        try {
            akul ai = aktp.ai(new haw(this, recipient, 18), this.w);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul q(ConversationId conversationId, String str) {
        akul i;
        akrh e = aktp.e("ConversationRepository#renameConversation");
        try {
            if (TextUtils.isEmpty(str)) {
                i = aktp.af(new IllegalArgumentException("Unable to rename a conversation: Empty name."));
            } else {
                d.s(conversationId instanceof BugleConversationId);
                BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
                i = ((mlt) this.r.b()).a(bugleConversationId).b().i(new mmc(this, conversationId, str, bugleConversationId, 0), this.j);
            }
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

    @Override // defpackage.miw
    public final akul r(ConversationId conversationId, nfw nfwVar) {
        akul h;
        akrh e = aktp.e("ConversationRepository#setActiveSelfIdentity");
        try {
            d.s(conversationId instanceof BugleConversationId);
            ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            if (!nfwVar.o()) {
                h = aktp.ag(false);
            } else {
                sng sngVar = new sng();
                sngVar.aj("setActiveSelfIdentity");
                sngVar.X(new mjz(conversationIdType, 12));
                sngVar.k(((SelfIdentityIdImpl) nfwVar.f()).a);
                h = sngVar.a().g().h(new mdr(20), andi.a);
            }
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:3:0x0006, B:9:0x0017, B:11:0x001c, B:13:0x0027, B:15:0x0044, B:16:0x004a, B:18:0x004f, B:19:0x0053), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:3:0x0006, B:9:0x0017, B:11:0x001c, B:13:0x0027, B:15:0x0044, B:16:0x004a, B:18:0x004f, B:19:0x0053), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    @Override // defpackage.miw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul s(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5, java.lang.String r6, java.lang.String r7, defpackage.mxf r8) {
        /*
            r4 = this;
            java.lang.String r0 = "ConversationRepository#setDraftSnippet"
            akrh r0 = defpackage.aktp.e(r0)
            boolean r1 = r5 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId     // Catch: java.lang.Throwable -> L86
            defpackage.d.s(r1)     // Catch: java.lang.Throwable -> L86
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L16
            if (r7 != 0) goto L16
            if (r8 == 0) goto L14
            goto L16
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            defpackage.d.s(r3)     // Catch: java.lang.Throwable -> L86
            if (r8 == 0) goto L26
            java.lang.String r3 = r8.j()     // Catch: java.lang.Throwable -> L86
            boolean r3 = defpackage.gh.p(r3)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L27
        L26:
            r1 = r2
        L27:
            defpackage.d.s(r1)     // Catch: java.lang.Throwable -> L86
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r5     // Catch: java.lang.Throwable -> L86
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r5.a     // Catch: java.lang.Throwable -> L86
            sng r1 = new sng     // Catch: java.lang.Throwable -> L86
            r1.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "setDraftSnippet"
            r1.aj(r3)     // Catch: java.lang.Throwable -> L86
            r1.Q(r2)     // Catch: java.lang.Throwable -> L86
            r1.q(r6)     // Catch: java.lang.Throwable -> L86
            r1.r(r7)     // Catch: java.lang.Throwable -> L86
            r6 = 0
            if (r8 == 0) goto L49
            java.lang.String r7 = r8.j()     // Catch: java.lang.Throwable -> L86
            goto L4a
        L49:
            r7 = r6
        L4a:
            r1.n(r7)     // Catch: java.lang.Throwable -> L86
            if (r8 == 0) goto L53
            android.net.Uri r6 = r8.d()     // Catch: java.lang.Throwable -> L86
        L53:
            r1.o(r6)     // Catch: java.lang.Throwable -> L86
            xnv r6 = r4.i     // Catch: java.lang.Throwable -> L86
            j$.time.Instant r6 = r6.f()     // Catch: java.lang.Throwable -> L86
            long r6 = r6.toEpochMilli()     // Catch: java.lang.Throwable -> L86
            r1.T(r6)     // Catch: java.lang.Throwable -> L86
            mjz r6 = new mjz     // Catch: java.lang.Throwable -> L86
            r7 = 11
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L86
            r1.X(r6)     // Catch: java.lang.Throwable -> L86
            agpr r5 = r1.a()     // Catch: java.lang.Throwable -> L86
            akul r5 = r5.g()     // Catch: java.lang.Throwable -> L86
            mdr r6 = new mdr     // Catch: java.lang.Throwable -> L86
            r7 = 19
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L86
            andi r7 = defpackage.andi.a     // Catch: java.lang.Throwable -> L86
            akul r5 = r5.h(r6, r7)     // Catch: java.lang.Throwable -> L86
            r0.close()
            return r5
        L86:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r6 = move-exception
            r5.addSuppressed(r6)
        L8f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmg.s(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, java.lang.String, java.lang.String, mxf):akul");
    }

    @Override // defpackage.miw
    public final akul t(ConversationId conversationId, mmy mmyVar) {
        return ((mnb) this.z.b()).a(conversationId, mmyVar);
    }

    @Override // defpackage.miw
    public final akul u(ConversationId conversationId, amfe amfeVar) {
        akrh e = aktp.e("ConversationRepository#unarchiveConversation");
        try {
            d.s(conversationId instanceof BugleConversationId);
            akul ai = aktp.ai(new hbd(this, (BugleConversationId) conversationId, amfeVar, 9, (char[]) null), this.v);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul v(ConversationId conversationId) {
        if (!(conversationId instanceof BugleConversationId)) {
            return aktp.af(new IllegalArgumentException("conversationId should be BugleConversationId."));
        }
        return ((mpa) this.A.b()).b(A((BugleConversationId) conversationId, false));
    }

    @Override // defpackage.miw
    public final akul w(ConversationId conversationId, amfe amfeVar) {
        akrh e = aktp.e("ConversationRepository#deleteConversation");
        try {
            d.s(conversationId instanceof BugleConversationId);
            long epochMilli = this.i.f().toEpochMilli();
            qoz qozVar = (qoz) this.q.b();
            qox a2 = qoy.a();
            a2.b(((BugleConversationId) conversationId).a);
            a2.f(amfeVar);
            a2.d(SuperSortLabel.UNKNOWN);
            a2.c(epochMilli);
            a2.e(false);
            akul a3 = qozVar.a(a2.a());
            e.close();
            return a3;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul x(alog alogVar) {
        akrh e = aktp.e("ConversationRepository#markConversationsAsRead");
        try {
            akul a2 = ((moj) this.s.b()).a(alogVar);
            e.close();
            return a2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul y(alog alogVar) {
        akrh e = aktp.e("ConversationRepository#markConversationsAsUnread");
        try {
            akul b = ((moj) this.s.b()).b(alogVar);
            e.close();
            return b;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mld
    public final ConversationId z(mpi mpiVar) {
        boolean z;
        mph b = mph.b(mpiVar.b);
        if (b == null) {
            b = mph.UNRECOGNIZED;
        }
        if (b == mph.BUGLE) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return new BugleConversationId(mpiVar.c);
    }
}
