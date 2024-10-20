package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvg {
    public static final xze a = xze.g("BugleEtouffee", "IncomingEncryptedMessageProcessor");
    public final armf b;
    public final pwb c;
    public final tuf d;
    public final qdr e;
    public final tvh f;
    public final twu g;
    public final mbl h;
    public final anen i;
    public final anen j;
    public final vbu k;
    public final pwa l;
    public final armf m;
    public final armf n;
    public final tvy o;
    public final iji p;
    public final iji q;
    private final xnv r;
    private final armf s;

    public tvg(armf armfVar, iji ijiVar, xnv xnvVar, tuf tufVar, qdr qdrVar, tvh tvhVar, twu twuVar, armf armfVar2, mbl mblVar, anen anenVar, anen anenVar2, vbu vbuVar, tvy tvyVar, pwa pwaVar, iji ijiVar2, armf armfVar3, armf armfVar4) {
        this.b = armfVar;
        this.p = ijiVar;
        this.r = xnvVar;
        this.d = tufVar;
        this.e = qdrVar;
        this.f = tvhVar;
        this.g = twuVar;
        this.k = vbuVar;
        this.o = tvyVar;
        this.l = pwaVar;
        this.q = ijiVar2;
        this.m = armfVar3;
        ContentType contentType = ajrv.a;
        ContentType contentType2 = ajsa.a;
        this.n = armfVar2;
        this.s = armfVar4;
        this.h = mblVar;
        this.j = anenVar2;
        this.i = anenVar;
        this.c = new pwb();
    }

    public static Bundle a(Optional optional, amgu amguVar) {
        Bundle bundle = new Bundle();
        bundle.putString("chat.extra.wrappingContentType", adah.c);
        if (optional.isPresent()) {
            bundle.putString("chat.extra.customDeliveryReceiptContentType", ((ChatMessage) optional.get()).getContentType());
            bundle.putByteArray("chat.extra.customDeliveryReceipt", ((ChatMessage) optional.get()).getContent());
        }
        bundle.putByteArray("chat.extra.logData", amguVar.toByteArray());
        return bundle;
    }

    public static void g(Exception exc) {
        xyo e = a.e();
        e.H("No MessageEncryptor available to decrypt incoming message.");
        e.z("errorMessage", exc.getMessage());
        e.q();
    }

    public final vqy b(qdk qdkVar) {
        if (qdkVar.a().d.r()) {
            qfo qfoVar = qdkVar.a;
            qeh qehVar = qeh.GROUP;
            qei qeiVar = qfoVar.e;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            qeh b = qeh.b(qeiVar.c);
            if (b == null) {
                b = qeh.UNKNOWN_TYPE;
            }
            boolean equals = qehVar.equals(b);
            qfo qfoVar2 = qdkVar.a;
            vqx a2 = vqy.a();
            a2.h(rve.a(qfoVar2.g));
            qei qeiVar2 = qdkVar.a.d;
            if (qeiVar2 == null) {
                qeiVar2 = qei.a;
            }
            a2.l(qeiVar2.d);
            qei qeiVar3 = qdkVar.a.d;
            if (qeiVar3 == null) {
                qeiVar3 = qei.a;
            }
            a2.k(qeiVar3);
            a2.a = qdkVar.a().d.D();
            a2.b = null;
            apct apctVar = qdkVar.a.k;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            a2.n(apds.a(apctVar));
            a2.j(this.r.f().toEpochMilli());
            pwb pwbVar = this.c;
            qel qelVar = qdkVar.a().c;
            if (qelVar == null) {
                qelVar = qel.a;
            }
            a2.e = ((ContentType) pwbVar.fu(qelVar)).toString();
            a2.i(-1L);
            a2.f = null;
            a2.e(equals);
            a2.g = null;
            a2.o(0);
            qfo qfoVar3 = qdkVar.a;
            qeh qehVar2 = qeh.BOT;
            qei qeiVar4 = qfoVar3.d;
            if (qeiVar4 == null) {
                qeiVar4 = qei.a;
            }
            qeh b2 = qeh.b(qeiVar4.c);
            if (b2 == null) {
                b2 = qeh.UNKNOWN_TYPE;
            }
            a2.f(qehVar2.equals(b2));
            apwq apwqVar = qdkVar.a.i;
            if (apwqVar == null) {
                apwqVar = apwq.a;
            }
            a2.h = apwqVar;
            a2.c(false);
            qei qeiVar5 = qdkVar.a.f;
            if (qeiVar5 == null) {
                qeiVar5 = qei.a;
            }
            a2.m(qeiVar5);
            a2.d(false);
            if (tte.h() && equals) {
                qfo qfoVar4 = qdkVar.a;
                a2.c = qfoVar4.h;
                qei qeiVar6 = qfoVar4.e;
                if (qeiVar6 == null) {
                    qeiVar6 = qei.a;
                }
                a2.d = qeiVar6.d;
            }
            if (aczf.E()) {
                a2.c(new apaq(qdkVar.a.n, qfo.a).contains(qfn.POSITIVE_DELIVERY));
                a2.d(new apaq(qdkVar.a.n, qfo.a).contains(qfn.DISPLAY));
            }
            return a2.a();
        }
        throw new IllegalStateException("Unable to parse the incoming content as an encrypted message.");
    }

    public final akul c(qdk qdkVar, aozb aozbVar) {
        akul d = d(qdkVar.a);
        akul i = d.i(new tsz(this, 11), this.j);
        return i.i(new mmc(this, aozbVar, qdkVar, d, 14), this.j).e(apba.class, new tvd(2), this.j).e(IllegalStateException.class, new tvd(3), this.j).i(new qbt(this, qdkVar, i, 18, (short[]) null), this.j);
    }

    public final akul d(qfo qfoVar) {
        boolean z;
        if (((okg) this.n.b()).a()) {
            if ((qfoVar.c & 16) != 0) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Receiver must be set");
            qei qeiVar = qfoVar.f;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            return aktp.ag(qeiVar.d);
        }
        if ((qfoVar.c & 16) != 0) {
            qei qeiVar2 = qfoVar.f;
            if (qeiVar2 == null) {
                qeiVar2 = qei.a;
            }
            qeiVar2.getClass();
            return aktp.ai(new rbg(qeiVar2, 11), this.i);
        }
        return this.k.c();
    }

    public final akul e(final qdk qdkVar, final tvx tvxVar, final akul akulVar) {
        return aktp.aj(new ancr() { // from class: tve
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:148:0x08f6  */
            /* JADX WARN: Removed duplicated region for block: B:151:0x099a  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x08f9  */
            @Override // defpackage.ancr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    Method dump skipped, instructions count: 2471
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.i);
    }

    public final akul f(qdk qdkVar, Optional optional) {
        vqx a2 = vqy.a();
        a2.h(rve.a(qdkVar.a.g));
        qei qeiVar = qdkVar.a.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        a2.l(qeiVar.d);
        qei qeiVar2 = qdkVar.a.d;
        if (qeiVar2 == null) {
            qeiVar2 = qei.a;
        }
        a2.k(qeiVar2);
        a2.b = null;
        apct apctVar = qdkVar.a.k;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        a2.n(apds.a(apctVar));
        a2.j(this.r.f().toEpochMilli());
        a2.i(-1L);
        a2.f = null;
        qfo qfoVar = qdkVar.a;
        qeh qehVar = qeh.GROUP;
        qei qeiVar3 = qfoVar.e;
        if (qeiVar3 == null) {
            qeiVar3 = qei.a;
        }
        qeh b = qeh.b(qeiVar3.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        a2.e(qehVar.equals(b));
        a2.g = null;
        boolean z = false;
        a2.o(0);
        qfo qfoVar2 = qdkVar.a;
        qeh qehVar2 = qeh.BOT;
        qei qeiVar4 = qfoVar2.d;
        if (qeiVar4 == null) {
            qeiVar4 = qei.a;
        }
        qeh b2 = qeh.b(qeiVar4.c);
        if (b2 == null) {
            b2 = qeh.UNKNOWN_TYPE;
        }
        a2.f(qehVar2.equals(b2));
        apwq apwqVar = qdkVar.a.i;
        if (apwqVar == null) {
            apwqVar = apwq.a;
        }
        a2.h = apwqVar;
        a2.g(113);
        amgu amguVar = qdkVar.a.l;
        if (amguVar == null) {
            amguVar = amgu.a;
        }
        a2.b(a(optional, amguVar));
        a2.c(false);
        qei qeiVar5 = qdkVar.a.f;
        if (qeiVar5 == null) {
            qeiVar5 = qei.a;
        }
        a2.m(qeiVar5);
        a2.d(false);
        if (tte.h()) {
            qei qeiVar6 = qdkVar.a.e;
            if (qeiVar6 == null) {
                qeiVar6 = qei.a;
            }
            qeh b3 = qeh.b(qeiVar6.c);
            if (b3 == null) {
                b3 = qeh.UNKNOWN_TYPE;
            }
            if (b3.equals(qeh.GROUP)) {
                qfo qfoVar3 = qdkVar.a;
                a2.c = qfoVar3.h;
                qei qeiVar7 = qfoVar3.e;
                if (qeiVar7 == null) {
                    qeiVar7 = qei.a;
                }
                a2.d = qeiVar7.d;
            }
        }
        if (aczf.E()) {
            apaq apaqVar = new apaq(qdkVar.a.n, qfo.a);
            if (optional.isPresent() || apaqVar.contains(qfn.POSITIVE_DELIVERY)) {
                z = true;
            }
            a2.c(z);
        }
        return ((vxx) this.s.b()).d(a2.a()).h(new ttg(qdkVar, 9), this.j);
    }

    public final void h(tvx tvxVar, rve rveVar) {
        ChatMessage chatMessage = tvxVar.b;
        if (chatMessage != null && adah.d(chatMessage.getContentType())) {
            this.q.l(rveVar);
        }
    }
}
