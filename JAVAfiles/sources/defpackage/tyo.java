package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tyo implements tsa {
    public static final alog a;
    public static final alog b;
    public static final xze c;
    public static final alvi d;
    public final tvr e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final qdx i;
    public final armf j;
    public final armf k;
    public final armf l;
    private final anen m;
    private final trz n;
    private final armf o;
    private final agnq p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final vcb t;
    private final uli u;

    static {
        Integer valueOf = Integer.valueOf(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        a = alog.B(valueOf, 229, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), 225, 226, 233, 234, 252, 215, 216, 219);
        b = alog.t(229, 226, 233);
        alog.s(valueOf, 234);
        c = xze.g("BugleEtouffee", "EtouffeeDatabaseOperationsImpl");
        d = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/operations/EtouffeeDatabaseOperationsImpl");
    }

    public tyo(anen anenVar, tvr tvrVar, trz trzVar, armf armfVar, armf armfVar2, agnq agnqVar, armf armfVar3, armf armfVar4, armf armfVar5, uli uliVar, vcb vcbVar, armf armfVar6, armf armfVar7, qdx qdxVar, armf armfVar8, armf armfVar9, armf armfVar10) {
        this.m = anenVar;
        this.e = tvrVar;
        this.n = trzVar;
        this.o = armfVar;
        this.f = armfVar2;
        this.p = agnqVar;
        this.q = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.u = uliVar;
        this.t = vcbVar;
        this.r = armfVar6;
        this.s = armfVar7;
        this.i = qdxVar;
        this.j = armfVar8;
        this.k = armfVar9;
        this.l = armfVar10;
    }

    @Override // defpackage.tsa
    public final MessageCoreData a(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        akrh e = aktp.e("EtouffeeDatabaseOperationsImpl#getLatestVisibleMessageOrGroupEtouffeeTombstoneExcludingMessage");
        try {
            rwd rwdVar = (rwd) this.f.b();
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.p(messageIdType);
            sycVar.S(qkv.b);
            sycVar.q(false);
            sycVar.b(new tvq(9), new tvq(10), new tvq(11));
            MessageCoreData j = rwdVar.j(new syb(sycVar));
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tsa
    public final akul b(String str) {
        if (!this.n.p()) {
            return aktp.ag(Optional.empty());
        }
        akrh e = aktp.e("EtouffeeDatabaseOperationsImpl#getParticipantRemoteRegistrationId");
        try {
            akul ai = aktp.ai(new ulo(this, str, 1), this.m);
            e.b(ai);
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

    @Override // defpackage.tsa
    public final alog c(int i) {
        akrh e = aktp.e("EtouffeeDatabaseOperationsImpl#getPreviouslyE2eeCurrentlyNonE2eeConversations");
        try {
            snf e2 = sni.e();
            e2.w("getPreviouslyE2eeCurrentlyNonE2eeConversations");
            e2.q();
            e2.h(new tvq(5));
            e2.f(new tvq(7));
            smu smuVar = sni.c;
            e2.i(new atkn((Object) smuVar.r, false), new atkn((Object) smuVar.a, false));
            e2.u(i);
            alog f = e2.b().f();
            e.close();
            return f;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tsa
    public final alog d(ConversationIdType conversationIdType, alog alogVar) {
        akrh e = aktp.e("EtouffeeDatabaseOperationsImpl#getRcsEncryptedMessages");
        try {
            sxy d2 = MessagesTable.d();
            d2.w("getRcsEncryptedMessages");
            d2.g(new tux(conversationIdType, alogVar, 5));
            alog t = d2.b().t();
            e.close();
            return t;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tsa
    public final Optional e(final MessageIdType messageIdType) {
        MessageCoreData q = ((rwd) this.f.b()).q(messageIdType);
        if (q == null) {
            xyo e = c.e();
            e.H("Failed to find the message to resend.");
            e.c(messageIdType);
            e.q();
            return Optional.empty();
        }
        armf armfVar = this.o;
        final ConversationIdType z = q.z();
        rto z2 = ((uac) armfVar.b()).z(z);
        if (z2 == null) {
            xyo e2 = c.e();
            e2.H("Failed to find the conversation of the message to resend");
            e2.c(messageIdType);
            e2.b(z);
            e2.q();
            return Optional.empty();
        }
        if (z2.G() == 2 && q.cn()) {
            final int b2 = tte.b() + 1;
            return (Optional) this.p.c("prepareMessageForGroupResending", new alhr() { // from class: tyn
                @Override // defpackage.alhr
                public final Object get() {
                    BitSet bitSet;
                    MessageIdType messageIdType2 = messageIdType;
                    MessagesTable.BindData a2 = MessagesTable.a(messageIdType2);
                    if (a2 == null) {
                        tyo.c.q("Failed to find the message for resend.");
                        return Optional.empty();
                    }
                    tyo tyoVar = tyo.this;
                    sxn F = a2.F();
                    F.j(null);
                    F.i(null);
                    F.r(Optional.empty());
                    F.ac(ruz.a);
                    F.x(Optional.empty());
                    F.T(tyoVar.i.a());
                    F.Q(0);
                    F.an(19);
                    F.S(-1L);
                    F.w(false);
                    F.ae(1L);
                    MessagesTable.BindData c2 = F.c();
                    tbs d2 = PartsTable.d();
                    d2.w("prepareMessageForUnencryptedResending-parts");
                    d2.g(new tyl(messageIdType2, 2));
                    tbn tbnVar = (tbn) d2.b().n();
                    while (tbnVar.moveToNext()) {
                        try {
                            tbg r = ((PartsTable.BindData) tbnVar.cK()).r();
                            r.J(c2.A());
                            r.d();
                        } catch (Throwable th) {
                            try {
                                tbnVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    tbnVar.close();
                    ssp c3 = sss.c();
                    c3.w("prepareMessageForUnencryptedResending-link_preview");
                    c3.e(new tyl(messageIdType2, 3));
                    ssm ssmVar = (ssm) c3.b().n();
                    while (ssmVar.moveToNext()) {
                        try {
                            ssi ssiVar = (ssi) ssmVar.cK();
                            ssj ssjVar = new ssj();
                            BitSet bitSet2 = ssiVar.cE;
                            if (bitSet2 == null) {
                                bitSet = null;
                            } else {
                                bitSet = (BitSet) bitSet2.clone();
                            }
                            ssjVar.ax = bitSet;
                            BitSet bitSet3 = ssjVar.ax;
                            if (bitSet3 != null) {
                                bitSet3.clear(0);
                            }
                            BitSet bitSet4 = ssjVar.ax;
                            if (bitSet4 == null || bitSet4.get(1)) {
                                ssjVar.b = ssiVar.k();
                            }
                            BitSet bitSet5 = ssjVar.ax;
                            if (bitSet5 == null || bitSet5.get(2)) {
                                ssjVar.c = ssiVar.q();
                            }
                            BitSet bitSet6 = ssjVar.ax;
                            if (bitSet6 == null || bitSet6.get(3)) {
                                ssjVar.d = ssiVar.h();
                            }
                            BitSet bitSet7 = ssjVar.ax;
                            if (bitSet7 == null || bitSet7.get(4)) {
                                ssjVar.e = ssiVar.p();
                            }
                            BitSet bitSet8 = ssjVar.ax;
                            if (bitSet8 == null || bitSet8.get(5)) {
                                ssjVar.f = ssiVar.m();
                            }
                            BitSet bitSet9 = ssjVar.ax;
                            if (bitSet9 == null || bitSet9.get(6)) {
                                ssjVar.g = ssiVar.o();
                            }
                            BitSet bitSet10 = ssjVar.ax;
                            if (bitSet10 == null || bitSet10.get(7)) {
                                ssjVar.h = ssiVar.n();
                            }
                            BitSet bitSet11 = ssjVar.ax;
                            if (bitSet11 == null || bitSet11.get(8)) {
                                ssjVar.i = ssiVar.l();
                            }
                            BitSet bitSet12 = ssjVar.ax;
                            if (bitSet12 == null || bitSet12.get(9)) {
                                ssjVar.j = ssiVar.s();
                            }
                            BitSet bitSet13 = ssjVar.ax;
                            if (bitSet13 == null || bitSet13.get(10)) {
                                ssjVar.k = ssiVar.r();
                            }
                            ssjVar.l(c2.A());
                            ssjVar.c();
                        } catch (Throwable th3) {
                            try {
                                ssmVar.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    ConversationIdType conversationIdType = z;
                    int i = b2;
                    ssmVar.close();
                    sya syaVar = new sya();
                    syaVar.aj("prepareMessageForUnencryptedResending");
                    syaVar.P(new tyl(messageIdType2, 4));
                    syaVar.E(i);
                    syaVar.L(22);
                    if (!((rwd) tyoVar.f.b()).M(syaVar.a(), conversationIdType, messageIdType2)) {
                        xyo e3 = tyo.c.e();
                        e3.H("Failed to update the original message");
                        e3.c(messageIdType2);
                        e3.b(conversationIdType);
                        e3.q();
                    }
                    return Optional.of(c2.A());
                }
            });
        }
        xyo a2 = c.a();
        a2.H("Not in a RCS group conversation, or message already not encrypted.");
        a2.c(messageIdType);
        a2.b(z);
        a2.q();
        if (l(messageIdType)) {
            return Optional.of(messageIdType);
        }
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tsa
    public final void f(alog alogVar, ConversationIdType conversationIdType) {
        Stream map = Collection.EL.stream(alogVar).map(new tvq(8));
        int i = alog.d;
        alog b2 = this.t.b((alog) map.collect(alls.a));
        int i2 = ((alsx) b2).c;
        int i3 = 0;
        while (i3 < i2) {
            sec secVar = (sec) b2.get(i3);
            if (secVar.j()) {
                i3++;
                if (!secVar.k()) {
                }
            }
            xyo a2 = c.a();
            a2.H("Group conversation will downgrade as one or more users does not have group e2ee capability");
            a2.b(conversationIdType);
            a2.q();
            m(conversationIdType, 0, uax.DOWNGRADE_INVALID_PARTICIPANTS_IN_GROUP);
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tsa
    public final void g(uax uaxVar) {
        akrh e = aktp.e("EtouffeeDatabaseOperationsImpl#disableEncryptionInAllConversations");
        try {
            sng sngVar = new sng();
            sngVar.aj("disableEncryptionInAllConversations");
            sngVar.af();
            sngVar.m(0);
            sngVar.X(new tvq(6));
            sngVar.ah();
            alog b2 = sngVar.a().b();
            xyo c2 = c.c();
            c2.H("Updated conversation encryption status in database.");
            c2.x("count", b2.size());
            c2.q();
            alur it = b2.iterator();
            while (it.hasNext()) {
                ((uhj) this.q.b()).d(((smr) it.next()).x());
            }
            if (((ofq) this.s.b()).a() && !b2.isEmpty()) {
                ((mbl) this.r.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", uaxVar.t);
            }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tsa
    public final void h(SelfIdentityId selfIdentityId) {
        aiut.b();
        akrh e = aktp.e("EtouffeeDatabaseOperationsImpl#disableEncryptionInConversations");
        try {
            sng sngVar = new sng();
            sngVar.aj("disableEncryptionInConversations");
            sngVar.af();
            sngVar.m(0);
            sngVar.X(new tyl(selfIdentityId, 1));
            sngVar.ah();
            alog b2 = sngVar.a().b();
            alvw g = d.g();
            g.X(alwp.a, "BugleEtouffee");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/operations/EtouffeeDatabaseOperationsImpl", "disableEncryptionInConversations", 639, "EtouffeeDatabaseOperationsImpl.java")).r("Updated conversation encryption status in database. count %d", b2.size());
            alur it = b2.iterator();
            while (it.hasNext()) {
                ((uhj) this.q.b()).d(((smr) it.next()).x());
            }
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

    @Override // defpackage.tsa
    public final void i(final qei qeiVar, final ConversationIdType conversationIdType, final int i, final uax uaxVar) {
        aiut.b();
        this.p.e("EtouffeeDatabaseOperationsImpl#updateDraftDefaultEncryption", new Runnable() { // from class: tym
            /* JADX WARN: Removed duplicated region for block: B:20:0x01d5  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x01fd  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 564
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tym.run():void");
            }
        });
    }

    @Override // defpackage.tsa
    public final void j(ConversationIdType conversationIdType, int i, uax uaxVar) {
        m(conversationIdType, i, uaxVar);
    }

    @Override // defpackage.tsa
    public final boolean k(ConversationIdType conversationIdType) {
        akrh e = aktp.e("EtouffeeDatabaseOperationsImpl#hasGroupSwitchToE2eeTombstone");
        try {
            sxy d2 = MessagesTable.d();
            d2.w("hasGroupSwitchToE2eeTombstone");
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.q(false);
            sycVar.b(new tvq(12));
            d2.f(sycVar);
            d2.u(1);
            boolean K = d2.b().K();
            e.close();
            return K;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tsa
    public final boolean l(MessageIdType messageIdType) {
        return ((Boolean) this.p.c("EtouffeeDatabaseOperationsImpl.markMessageForManualUnencryptedResending", new ubu(this, messageIdType, 1, null))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [armf, java.lang.Object] */
    public final void m(ConversationIdType conversationIdType, int i, uax uaxVar) {
        akrh e = aktp.e("EtouffeeDatabaseOperationsImpl#updateDraftDefaultEncryptionForAllIdentities");
        try {
            sng sngVar = new sng();
            sngVar.aj("updateDraftDefaultEncryption-conversations#update1");
            sngVar.m(i);
            int i2 = 1;
            if (i == 1) {
                sngVar.t();
            }
            boolean z = false;
            sngVar.X(new tyl(conversationIdType, 0));
            int e2 = sngVar.a().e();
            if (e2 <= 1) {
                z = true;
            }
            albo.T(z);
            if (e2 == 1) {
                ((uhj) this.q.b()).d(conversationIdType);
                rto z2 = ((uac) this.o.b()).z(conversationIdType);
                if (z2 != null && tvu.e(z2.G())) {
                    uli uliVar = this.u;
                    aozy createBuilder = uba.a.createBuilder();
                    String a2 = conversationIdType.a();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    uba ubaVar = (uba) createBuilder.b;
                    a2.getClass();
                    ubaVar.b = a2;
                    ((uof) uliVar.a.b()).a(upk.a("tombstone_manager_on_rcs_group_e2ee_status_change", (uba) createBuilder.s()));
                }
            } else {
                i2 = e2;
            }
            if (uaxVar != uax.DEFAULT && i2 > 0 && ((ofq) this.s.b()).a()) {
                ((mbl) this.r.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", uaxVar.t);
            }
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
