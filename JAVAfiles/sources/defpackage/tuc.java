package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tuc implements wze {
    public final mbl b;
    private final xaj d;
    private final wxz e;
    private final tub f;
    private final vqu g;
    private final trz h;
    private final pwb i = new pwb();
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsMessageReceiptSender");
    public static final alhr a = uuh.w("include_disposition_notification_required");

    public tuc(xaj xajVar, wxz wxzVar, tub tubVar, vqu vquVar, mbl mblVar, trz trzVar) {
        this.d = xajVar;
        this.e = wxzVar;
        this.f = tubVar;
        this.g = vquVar;
        this.b = mblVar;
        this.h = trzVar;
    }

    public static arjv e(Throwable th) {
        alvw i = c.i();
        i.X(alwp.a, "BugleEtouffee");
        ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsMessageReceiptSender", "logAndGetFailedResult", (char) 235, "EncryptedRcsMessageReceiptSender.java")).q("Failed to send receipt");
        arjv arjvVar = new arjv();
        arjvVar.a = false;
        return arjvVar;
    }

    private final qft f(String str) {
        boolean z;
        qfs qfsVar;
        if (this.h.u() && ajru.d.f(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            qfsVar = qfs.CONTROL;
        } else {
            qfsVar = qfs.USER;
        }
        aozy createBuilder = qft.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qft qftVar = (qft) apagVar;
        qftVar.c = qfsVar.d;
        qftVar.b |= 1;
        qfr qfrVar = qfr.HIGH;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        qft qftVar2 = (qft) apagVar2;
        qftVar2.d = qfrVar.e;
        qftVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        qft qftVar3 = (qft) createBuilder.b;
        qftVar3.b |= 4;
        qftVar3.e = false;
        if (((Boolean) ((utz) a.get()).e()).booleanValue() && !z) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qft qftVar4 = (qft) createBuilder.b;
            qftVar4.b |= 8;
            qftVar4.f = false;
        }
        return (qft) createBuilder.s();
    }

    @Override // defpackage.wze
    public final boolean a(MessageCoreData messageCoreData) {
        if (!messageCoreData.cn()) {
            return this.d.a(messageCoreData);
        }
        return this.g.Q(messageCoreData);
    }

    @Override // defpackage.wze
    public final akul b(MessageCoreData messageCoreData, aoia aoiaVar) {
        if (!messageCoreData.cn()) {
            return this.d.b(messageCoreData, aoiaVar);
        }
        alvw d = c.d();
        d.X(alwp.a, "BugleEtouffee");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsMessageReceiptSender", "sendDeliveryReceipt", 87, "EncryptedRcsMessageReceiptSender.java")).t("Attempt to send encrypted delivery report for RCS message: %s", messageCoreData.E().f());
        return this.e.k(messageCoreData, aoiaVar, 2, this.f, new ttu(11), f(messageCoreData.ah()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [wzd, java.lang.Object] */
    @Override // defpackage.wze
    public final akul c(rve rveVar, Instant instant, aoia aoiaVar, Optional optional, qei qeiVar) {
        if (optional.isPresent()) {
            ?? r5 = optional.get();
            pwb pwbVar = this.i;
            qel qelVar = r5.a(2, rveVar, instant).c;
            if (qelVar == null) {
                qelVar = qel.a;
            }
            return this.e.m(rveVar, aoiaVar, instant, r5, f(((ContentType) pwbVar.fu(qelVar)).toString()), qeiVar);
        }
        return this.d.c(rveVar, instant, aoiaVar, optional, qeiVar);
    }

    @Override // defpackage.wze
    public final akul d(MessageCoreData messageCoreData, aoia aoiaVar) {
        qfs qfsVar;
        if (!messageCoreData.cn()) {
            return this.d.d(messageCoreData, aoiaVar);
        }
        alvi alviVar = c;
        alvw d = alviVar.d();
        d.X(alwp.a, "BugleEtouffee");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsMessageReceiptSender", "sendDisplayReceipt", 109, "EncryptedRcsMessageReceiptSender.java")).t("Attempt to send encrypted display report for RCS message: %s", messageCoreData.E().f());
        aozy createBuilder = qft.a.createBuilder();
        if (tte.i() && aoiaVar.e()) {
            qfs qfsVar2 = qfs.CONTROL;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            qft qftVar = (qft) apagVar;
            qftVar.c = qfsVar2.d;
            qftVar.b |= 1;
            qfr qfrVar = qfr.NORMAL;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            qft qftVar2 = (qft) apagVar2;
            qftVar2.d = qfrVar.e;
            qftVar2.b |= 2;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            qft qftVar3 = (qft) createBuilder.b;
            qftVar3.b |= 4;
            qftVar3.e = false;
        } else {
            if (((Boolean) ((utz) ttd.C.get()).e()).booleanValue()) {
                qfsVar = qfs.CONTROL;
                alvw g = alviVar.g();
                g.X(alwp.a, "BugleEtouffee");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsMessageReceiptSender", "sendDisplayReceipt", 124, "EncryptedRcsMessageReceiptSender.java")).q("Encrypted display IMDN is using CONTROL MessageSource.");
            } else {
                qfsVar = qfs.USER;
                alvw g2 = alviVar.g();
                g2.X(alwp.a, "BugleEtouffee");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsMessageReceiptSender", "sendDisplayReceipt", 127, "EncryptedRcsMessageReceiptSender.java")).q("Encrypted display IMDN is using USER MessageSource.");
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            qft qftVar4 = (qft) apagVar3;
            qftVar4.c = qfsVar.d;
            qftVar4.b |= 1;
            qfr qfrVar2 = qfr.NORMAL;
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            apag apagVar4 = createBuilder.b;
            qft qftVar5 = (qft) apagVar4;
            qftVar5.d = qfrVar2.e;
            qftVar5.b |= 2;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            qft qftVar6 = (qft) createBuilder.b;
            qftVar6.b |= 4;
            qftVar6.e = false;
        }
        return this.e.k(messageCoreData, aoiaVar, 3, this.f, new ttu(7), (qft) createBuilder.s()).e(tvv.class, new ttg(this, 4), andi.a).e(twg.class, new ttu(8), andi.a).e(aqwb.class, new ttu(9), andi.a).e(tvi.class, new ttu(10), andi.a);
    }
}
