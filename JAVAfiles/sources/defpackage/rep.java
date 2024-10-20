package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rep implements ancr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ rep(aiwk aiwkVar, apbt apbtVar, int i, List list, int i2) {
        this.e = i2;
        this.c = aiwkVar;
        this.b = apbtVar;
        this.a = i;
        this.d = list;
    }

    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        akul h;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                ListenableFuture bI = albo.bI(this.b);
                for (int i2 = 0; i2 < this.a; i2++) {
                    if (((Boolean) albo.bQ((Future) this.d.get(i2))).booleanValue()) {
                        bI = ancj.g(bI, akto.d(new ahce((aiwp) ((aiwk) this.c).a.get(i2), 10)), andi.a);
                    }
                }
                return bI;
            }
            qzw qzwVar = (qzw) this.b;
            zai zaiVar = qzwVar.J;
            ConversationIdType conversationIdType = (ConversationIdType) this.d;
            boolean b = zaiVar.b(conversationIdType);
            qzs qzsVar = (qzs) this.c;
            final MessageCoreData q = qzwVar.r.q(qzsVar.r, qzsVar.q, qzsVar.o, qzsVar.s, qzsVar.f, qzsVar.g, qzsVar.a.M(), qzwVar.c.g().g(), conversationIdType, qzsVar.i, this.a, b, qzsVar.d, qzsVar.e, qzsVar.p, null);
            q.bD(qzsVar.b);
            msh mshVar = qzsVar.u;
            if (mshVar != null) {
                q.bA(mshVar);
            }
            aozb aozbVar = qzsVar.t;
            if (qzwVar.C.t() && aozbVar != null && !aozbVar.G()) {
                qzwVar.D.e("Bugle.Etouffee.FileTransfer.Format", yyb.cV(3));
                final ttl ttlVar = qzwVar.H;
                Boolean bool = (Boolean) ttd.c.e();
                final rve E = q.E();
                if (!bool.booleanValue()) {
                    xyo e = ttl.a.e();
                    e.H("Encrypted file transfer XML extension ignored since receiving E2EE is disabled.");
                    e.g(E);
                    e.z("isE2eeReceiveEnabled", bool);
                    e.q();
                    ((mbl) ttlVar.c.b()).e("Bugle.Etouffee.DecryptionAborted.Reason", ttf.ETOUFFEE_DISABLED.y);
                    ttlVar.j.p(q.E(), 15);
                    h = aktp.ag(null);
                } else {
                    akul ag = aktp.ag(q.w().d);
                    akul i3 = ag.i(new tsz(ttlVar, 2), ttlVar.f);
                    iji ijiVar = ttlVar.i;
                    ijiVar.getClass();
                    akul i4 = ag.i(new tsz(ijiVar, 3), ttlVar.f);
                    h = aktp.ap(i3, i4).h(new irk(ttlVar, aozbVar, q, i4, E, i3, 3), ttlVar.e).h(new algk() { // from class: ttk
                        @Override // defpackage.algk
                        public final Object apply(Object obj) {
                            apwk apwkVar;
                            MessageCoreData messageCoreData = q;
                            rve rveVar = E;
                            ttl ttlVar2 = ttl.this;
                            tvx tvxVar = (tvx) obj;
                            if (tvxVar != null && tvxVar.a == null && tvxVar.c.isPresent()) {
                                ((mbl) ttlVar2.c.b()).e("Bugle.Etouffee.DecryptionAborted.Reason", ((ttf) tvxVar.c.get()).y);
                                ttlVar2.j.k(rveVar, tvxVar.c);
                            } else {
                                try {
                                    apwo apwoVar = tvxVar.a;
                                    if (apwoVar == null) {
                                        apwkVar = null;
                                    } else {
                                        apwkVar = (apwk) apag.parseFrom(apwk.a, apwoVar.e, aozs.a());
                                    }
                                    ChatMessage chatMessage = tvxVar.b;
                                    if (chatMessage != null) {
                                        wya wyaVar = new wya(chatMessage.getContentType(), chatMessage.getContent());
                                        spn a = spv.a();
                                        a.p(rveVar);
                                        a.i(wyaVar.a);
                                        a.h(wyaVar.b);
                                        if (apwkVar != null) {
                                            if ((apwkVar.b & 2) != 0) {
                                                apwj apwjVar = apwkVar.d;
                                                if (apwjVar == null) {
                                                    apwjVar = apwj.a;
                                                }
                                                a.d(apwjVar.c.H());
                                                a.c(apwjVar.d.H());
                                                a.e(apwjVar.e);
                                                if ((apwjVar.b & 8) != 0) {
                                                    a.k(apwjVar.f);
                                                }
                                                if ((apwjVar.b & 16) != 0) {
                                                    pwb pwbVar = ttlVar2.b;
                                                    qel qelVar = apwjVar.g;
                                                    if (qelVar == null) {
                                                        qelVar = qel.a;
                                                    }
                                                    a.j(((ContentType) pwbVar.fu(qelVar)).toString());
                                                }
                                            }
                                            if ((apwkVar.b & 1) != 0) {
                                                apwj apwjVar2 = apwkVar.c;
                                                if (apwjVar2 == null) {
                                                    apwjVar2 = apwj.a;
                                                }
                                                a.n(apwjVar2.c.H());
                                                a.m(apwjVar2.d.H());
                                                a.o(apwjVar2.e);
                                                if ((apwjVar2.b & 16) != 0) {
                                                    pwb pwbVar2 = ttlVar2.b;
                                                    qel qelVar2 = apwjVar2.g;
                                                    if (qelVar2 == null) {
                                                        qelVar2 = qel.a;
                                                    }
                                                    a.l(((ContentType) pwbVar2.fu(qelVar2)).toString());
                                                }
                                            }
                                        }
                                        a.b();
                                        if (adah.d(wyaVar.a)) {
                                            ttlVar2.j.p(rveVar, 33);
                                            ttlVar2.j.l(rveVar);
                                        }
                                        if (apwkVar == null) {
                                            xyo e2 = ttl.a.e();
                                            e2.H("Decryption did not result in any metadata.");
                                            e2.g(rveVar);
                                            e2.q();
                                        } else {
                                            MessagePartCoreData G = messageCoreData.G();
                                            if (G == null) {
                                                xyo e3 = ttl.a.e();
                                                e3.H("Cannot enrich message since it has no attachment.");
                                                e3.g(rveVar);
                                                e3.q();
                                            } else {
                                                if ((apwkVar.b & 2) == 0) {
                                                    xyo e4 = ttl.a.e();
                                                    e4.H("Cannot enrich message since Etouffee metadata is missing for the file.");
                                                    e4.g(rveVar);
                                                    e4.q();
                                                }
                                                apwj apwjVar3 = apwkVar.d;
                                                if (apwjVar3 == null) {
                                                    apwjVar3 = apwj.a;
                                                }
                                                G.ax(apwjVar3.f);
                                                pwb pwbVar3 = ttlVar2.b;
                                                qel qelVar3 = apwjVar3.g;
                                                if (qelVar3 == null) {
                                                    qelVar3 = qel.a;
                                                }
                                                G.ar(((ContentType) pwbVar3.fu(qelVar3)).toString());
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Decryption of incoming file transfer XML encrypted data unexpectedly did not produce a receipt. This is possibly the result of sender sending a receipt as part of the file transfer XML.");
                                    }
                                } catch (apba e5) {
                                    xyo e6 = ttl.a.e();
                                    e6.H("Failed to parse the decryption result");
                                    e6.g(rveVar);
                                    e6.r(e5);
                                    ttlVar2.j.p(messageCoreData.E(), 18);
                                    ((mbl) ttlVar2.c.b()).e("Bugle.Etouffee.DecryptionAborted.Reason", ttf.INVALID_PROTOCOL_BUFFER.y);
                                }
                            }
                            return null;
                        }
                    }, ttlVar.e);
                }
                return h.h(new rau(q, 1), qzwVar.w);
            }
            ttl.d(q);
            if (q.cn()) {
                if (aozbVar != null && !aozbVar.G()) {
                    qzwVar.D.e("Bugle.Etouffee.FileTransfer.Format", yyb.cV(3));
                } else {
                    qzwVar.D.e("Bugle.Etouffee.FileTransfer.Format", yyb.cV(2));
                }
            } else if (trx.a(qzsVar.p, qzsVar.r)) {
                qzwVar.D.e("Bugle.Etouffee.FileTransfer.Format", yyb.cV(4));
            } else {
                qzwVar.D.e("Bugle.Etouffee.FileTransfer.Format", yyb.cV(5));
            }
            return aktp.ag(q);
        }
        rfa rfaVar = (rfa) this.b;
        if (!((ytk) rfaVar.A.b()).d()) {
            rfa.b.l("Verified SMS feature is disabled. Not checking for eligibility");
            return aktp.ag(rez.a());
        }
        if (yhx.g(rfaVar.d)) {
            rfa.b.o("We are secondary user. Not vsms eligible.");
            return aktp.ag(rez.a());
        }
        ykb h2 = ((yjy) rfaVar.k.b()).h(this.a);
        String A = h2.A(rfaVar.d);
        if (TextUtils.isEmpty(A)) {
            rfa.b.m("Received message from vsms sender but imsi is empty somehow");
            return aktp.ag(rez.a());
        }
        return ((ytk) rfaVar.A.b()).a(A).h(new ryp(rfaVar, A, (ContentValues) this.c, h2, (Optional) this.d, 1), rfaVar.F);
    }

    public /* synthetic */ rep(qzw qzwVar, ConversationIdType conversationIdType, qzs qzsVar, int i, int i2) {
        this.e = i2;
        this.b = qzwVar;
        this.d = conversationIdType;
        this.c = qzsVar;
        this.a = i;
    }

    public /* synthetic */ rep(rfa rfaVar, int i, ContentValues contentValues, Optional optional, int i2) {
        this.e = i2;
        this.b = rfaVar;
        this.a = i;
        this.c = contentValues;
        this.d = optional;
    }
}
