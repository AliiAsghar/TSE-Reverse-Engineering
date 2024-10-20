package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbq implements mja {
    public static final /* synthetic */ int c = 0;
    private static final alwo d = alwo.o("BugleSending");
    public final anen a;
    public final ahmn b = new ahmn((short[]) null);
    private final armf e;
    private final armf f;
    private final Optional g;
    private final armf h;
    private final Optional i;
    private final armf j;
    private final armf k;

    public nbq(armf armfVar, armf armfVar2, Optional optional, armf armfVar3, anen anenVar, Optional optional2, armf armfVar4, armf armfVar5) {
        this.e = armfVar;
        this.f = armfVar2;
        this.g = optional;
        this.h = armfVar3;
        this.a = anenVar;
        this.i = optional2;
        this.j = armfVar4;
        this.k = armfVar5;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.mja
    public final akul a(mzc mzcVar) {
        atok atokVar;
        nbg nbgVar;
        Object mjjVar;
        if (!(mzcVar instanceof mzc)) {
            return aktp.af(new IllegalArgumentException("Unknown MessageEnvelope Type: ".concat(String.valueOf(String.valueOf(mzcVar.getClass())))));
        }
        this.i.ifPresent(new mpv(mzcVar, 12));
        mzh mzhVar = mzcVar.f;
        if (mzcVar.b.aF() != null) {
            atokVar = mzcVar.b.aF();
            atokVar.getClass();
        } else {
            atokVar = atok.a;
        }
        if (mzhVar != null) {
            if (mzhVar.c == nbh.a) {
                nbgVar = mzhVar.b;
            } else {
                nbgVar = null;
            }
            armf armfVar = this.j;
            MessageId messageId = mzhVar.a;
            Object b = armfVar.b();
            nfw nfwVar = mzcVar.a.j;
            nfwVar.getClass();
            atokVar.getClass();
            lfl lflVar = (lfl) b;
            Instant f = ((xnv) lflVar.d).f();
            ?? r5 = lflVar.a;
            if (nbgVar != null) {
                f.getClass();
                mjjVar = new mji(nfwVar, f, atokVar, nbgVar);
            } else {
                f.getClass();
                mjjVar = new mjj(nfwVar, f, atokVar);
            }
            r5.put(messageId, mjjVar);
            ((yyt) lflVar.b).y(new mun(messageId, b, f, 0, null), "DefaultOptimisticReactionsCache::notify");
        }
        ((mho) this.f.b()).ad(mzcVar.g.a, atokVar, new mbh(mzcVar.h, mzcVar.i));
        mho mhoVar = (mho) this.f.b();
        MessageCoreData messageCoreData = mzcVar.b;
        int i = mzcVar.a.l.f;
        mhoVar.ap(messageCoreData);
        alwo alwoVar = d;
        alwl alwlVar = (alwl) alwoVar.g();
        alwlVar.X(ydl.q, mzcVar.a.b);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/message/send/BugleMessageCourier", "send", 128, "BugleMessageCourier.java")).t("Sending prepared envelope: %s.", mzcVar);
        mkp mkpVar = (mkp) this.e.b();
        nfw nfwVar2 = mzcVar.a.j;
        nfwVar2.getClass();
        mkpVar.g(nfwVar2, mzcVar.b, mzcVar.h, mzcVar.g);
        ((mxe) this.k.b()).h();
        akrh e = aktp.e("MessageCourier::NotifySendMessageListeners");
        try {
            alvw n = alwoVar.n();
            n.X(ydl.q, mzcVar.a.b);
            ((alwl) n.h("com/google/android/apps/messaging/shared/api/messaging/message/send/BugleMessageCourier", "notifySendMessageListeners", 153, "BugleMessageCourier.java")).r("Notifying %d SendMessageListeners.", ((Set) this.h.b()).size());
            Stream map = Collection.EL.stream((Set) this.h.b()).map(new mut(this, mzcVar, 4));
            int i2 = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            if (!alogVar.isEmpty()) {
                akrh e2 = aktp.e("SendMessageNotify");
                try {
                    akul ad = aktp.ad(alogVar);
                    e2.b(ad);
                    qiu.h(ad);
                    e2.close();
                } finally {
                }
            }
            e.close();
            return aktp.ag(null);
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mja
    public final akul b() {
        return ((wtg) this.g.get()).a().h(new mme(9), andi.a);
    }
}
