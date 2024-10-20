package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_FileTransferInformation;
import com.google.android.rcs.client.messaging.data.AutoValue_MessageReceipt;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tum implements qdj {
    public static final alwo a = alwo.o("BugleDataModel");
    public final tvh b;
    public final qdr c;
    public final mbl d;
    public final armf e;

    @Deprecated
    public final vbu f;
    public final anen g;
    public final anen h;
    public final armf i;
    private final pwa j;
    private final tvg k;
    private final trz l;
    private final armf m;
    private final armf n;

    public tum(pwa pwaVar, tvg tvgVar, tvh tvhVar, qdr qdrVar, trz trzVar, mbl mblVar, armf armfVar, armf armfVar2, armf armfVar3, vbu vbuVar, anen anenVar, anen anenVar2, armf armfVar4) {
        this.j = pwaVar;
        this.k = tvgVar;
        this.b = tvhVar;
        this.c = qdrVar;
        this.l = trzVar;
        this.d = mblVar;
        this.m = armfVar;
        this.e = armfVar2;
        this.i = armfVar3;
        this.f = vbuVar;
        this.g = anenVar;
        this.h = anenVar2;
        this.n = armfVar4;
    }

    private final void c(rve rveVar, qdk qdkVar, boolean z, boolean z2) {
        qeh qehVar = qeh.GROUP;
        qei qeiVar = qdkVar.a.e;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        boolean equals = qehVar.equals(b);
        alwl alwlVar = (alwl) a.i();
        alwlVar.X(ydl.f, rveVar);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "logHandlingAsUnencryptedMessage", 237, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).K("[Chat API] Incoming Etouffee message, but Message will be processed as a basic text. isReceiveEtouffeeEnabled: %b, isE2eeProvisioned: %b, inGroup: %b, isGroupEtouffeeEnabled: %b.", Boolean.valueOf(ttd.d()), Boolean.valueOf(z), Boolean.valueOf(equals), Boolean.valueOf(z2));
        if (equals && !z2) {
            ((iji) this.m.b()).p(rveVar, 45);
            return;
        }
        if (!ttd.d()) {
            ((iji) this.m.b()).p(rveVar, 15);
            this.d.e("Bugle.Etouffee.DecryptionAborted.Reason", ttf.ETOUFFEE_DISABLED.y);
        } else if (!z) {
            ((iji) this.m.b()).p(rveVar, 17);
        }
    }

    @Override // defpackage.qdj
    public final akul a(qdk qdkVar) {
        throw null;
    }

    public final akul b(qdk qdkVar, boolean z) {
        boolean z2;
        int i;
        akul ag;
        akul ag2;
        akul h;
        akul ag3;
        ajrt ajrtVar = (ajrt) this.j.m().fu(qdkVar.a());
        rve a2 = rve.a(qdkVar.a.g);
        alwo alwoVar = a;
        alwl alwlVar = (alwl) alwoVar.g();
        alwlVar.X(ydl.f, a2);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processInternal", 152, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).t("Processing incoming message with contentType: %s.", ajrtVar.b.c());
        boolean z3 = true;
        if (ttd.d() && z) {
            z2 = true;
        } else {
            z2 = false;
        }
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
        boolean h2 = tte.h();
        if (z2 && ((h2 && equals) || !equals)) {
            mbl mblVar = this.d;
            ContentType contentType = ajrtVar.b;
            if (adah.g.e(contentType)) {
                i = 2;
            } else if (adah.i.e(contentType)) {
                i = 4;
            } else if (adah.h.e(contentType)) {
                i = 3;
            } else {
                i = 1;
            }
            if (i != 1) {
                mblVar.e("Bugle.Etouffee.Encryption.LegacyE2eeContentTypesUsage", i - 1);
            }
            int i2 = 16;
            int i3 = 18;
            if (adah.c(ajrtVar.b)) {
                if (!equals) {
                    this.d.e("Bugle.Etouffee.Ftd.Process.Status.Counts", 2);
                    if (((okg) this.i.b()).a()) {
                        if ((qdkVar.a.c & 16) == 0) {
                            z3 = false;
                        }
                        d.s(z3);
                        qei qeiVar2 = qdkVar.a.f;
                        if (qeiVar2 == null) {
                            qeiVar2 = qei.a;
                        }
                        qei qeiVar3 = qeiVar2;
                        if (d.am(qeiVar3.d)) {
                            this.d.e("Bugle.Etouffee.Ftd.Process.Status.Counts", 4);
                            return aktp.ag(pwh.FAIL_RETRY);
                        }
                        wyl wylVar = (wyl) this.n.b();
                        anen anenVar = this.g;
                        mmc mmcVar = new mmc(this, qdkVar, ajrtVar, qeiVar3, 12);
                        anenVar.getClass();
                        return wylVar.b(a2).i(mmcVar, anenVar);
                    }
                    vbu vbuVar = this.f;
                    vbuVar.getClass();
                    return aktp.aj(new ikm(vbuVar, 18), this.h).h(new tul(this, ajrtVar, qdkVar, 0), this.g);
                }
                ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processInternal", 164, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Received an unexpected FTD in a group.");
                ((iji) this.m.b()).p(a2, 46);
                return aktp.ag(pwh.FAIL_NO_RETRY);
            }
            if (adah.a(ajrtVar.b)) {
                tvg tvgVar = this.k;
                qel qelVar = qdkVar.a().c;
                if (qelVar == null) {
                    qelVar = qel.a;
                }
                if (!adah.a((ContentType) tvgVar.c.fu(qelVar))) {
                    xyo e = tvg.a.e();
                    e.H("Ignoring an incoming message with unexpected MIME type");
                    e.g(rve.a(qdkVar.a.g));
                    pwb pwbVar = tvgVar.c;
                    qel qelVar2 = qdkVar.a().c;
                    if (qelVar2 == null) {
                        qelVar2 = qel.a;
                    }
                    e.z("contentType", pwbVar.fu(qelVar2));
                    e.q();
                    return aktp.ag(pwh.FAIL_NO_RETRY);
                }
                akul i4 = tvgVar.d(qdkVar.a).i(new tsz(tvgVar, 8), tvgVar.j);
                return i4.i(new tsm(tvgVar, qdkVar, i3), tvgVar.j).e(IllegalStateException.class, new ttu(i2), tvgVar.j).e(twg.class, new ttu(17), tvgVar.j).i(new qbt(tvgVar, qdkVar, i4, 17, (short[]) null), tvgVar.j).e(twx.class, new ttu(i3), tvgVar.j);
            }
            byte[] bArr = null;
            if (this.l.s()) {
                if (ajru.d.equals(ajrtVar.b)) {
                    tvg tvgVar2 = this.k;
                    ajrt ajrtVar2 = (ajrt) tvgVar2.l.m().fu(qdkVar.a());
                    if (!ajrtVar2.b.e(ajru.d)) {
                        tvg.a.o("Incoming message is not a message receipt.");
                        ag2 = aktp.ag(tsw.a);
                    } else {
                        try {
                            AutoValue_MessageReceipt autoValue_MessageReceipt = (AutoValue_MessageReceipt) ajsa.c(ajrtVar2);
                            boolean equals2 = autoValue_MessageReceipt.a.equals(ajqu.DELIVERY);
                            boolean equals3 = autoValue_MessageReceipt.a.equals(ajqu.DISPLAY);
                            if (((Boolean) ((utz) ttd.E.get()).e()).booleanValue()) {
                                if (!equals2 && !equals3) {
                                    tvg.a.o("Incoming message is not a delivery or display receipt, skipping.");
                                    ag2 = aktp.ag(tsw.a);
                                }
                            } else if (!autoValue_MessageReceipt.a.equals(ajqu.DELIVERY)) {
                                tvg.a.o("Incoming message is not a delivery receipt.");
                                ag2 = aktp.ag(tsw.a);
                            }
                            Optional optional = autoValue_MessageReceipt.c;
                            if (optional.isEmpty()) {
                                String str = autoValue_MessageReceipt.b;
                                qfo qfoVar2 = qdkVar.a;
                                rve a3 = rve.a(str);
                                rve a4 = rve.a(qfoVar2.g);
                                if (rve.l(a3)) {
                                    ag3 = aktp.ai(new qpk(tvgVar2, a3, 19, bArr), tvgVar2.i);
                                } else {
                                    ag3 = aktp.ag(false);
                                }
                                ag2 = ag3.h(new tul((Object) tvgVar2, (Object) a3, a4, 3), tvgVar2.j);
                            } else {
                                xyo c = tvg.a.c();
                                c.H("Processing IMDN with encrypted data extension");
                                c.g(rve.a(qdkVar.a.g));
                                c.A("isDelivery", equals2);
                                c.A("isDisplay", equals3);
                                c.q();
                                if (((Boolean) ((utz) ttd.E.get()).e()).booleanValue()) {
                                    if (autoValue_MessageReceipt.a.equals(ajqu.DELIVERY)) {
                                        tvgVar2.h.e("Bugle.Etouffee.DeliveryImdn.ChatApi.Format", ucm.c(3));
                                    }
                                } else {
                                    tvgVar2.h.e("Bugle.Etouffee.DeliveryImdn.ChatApi.Format", ucm.c(3));
                                }
                                if (tte.h()) {
                                    qei qeiVar4 = qdkVar.a.e;
                                    if (qeiVar4 == null) {
                                        qeiVar4 = qei.a;
                                    }
                                    qeh b2 = qeh.b(qeiVar4.c);
                                    if (b2 == null) {
                                        b2 = qeh.UNKNOWN_TYPE;
                                    }
                                    if (b2.equals(qeh.GROUP) && equals2) {
                                        try {
                                            apwl apwlVar = (apwl) apag.parseFrom(apwl.a, (aozb) optional.get(), aozs.a());
                                            if (apwlVar.e) {
                                                tvg.a.l("The message is a group FTD IMDN.");
                                                tvgVar2.h.e("Bugle.Etouffee.DeliveryImdn.ChatApi.Format", ucm.c(4));
                                                rve a5 = rve.a(tvm.a(apwlVar.c).getMessageId());
                                                xyo c2 = tvg.a.c();
                                                c2.H("Handling FTD.");
                                                c2.g(a5);
                                                c2.q();
                                                if (((okg) tvgVar2.n.b()).a()) {
                                                    qfo qfoVar3 = qdkVar.a;
                                                    qei qeiVar5 = qfoVar3.f;
                                                    if (qeiVar5 == null) {
                                                        qeiVar5 = qei.a;
                                                    }
                                                    if ((qfoVar3.c & 16) != 0 && !d.am(qeiVar5.d)) {
                                                        qei qeiVar6 = qfoVar3.d;
                                                        if (qeiVar6 == null) {
                                                            qeiVar6 = qei.a;
                                                        }
                                                        h = aktp.ai(new kwr(tvgVar2, apwlVar, a5, qeiVar6, qeiVar5, 2), tvgVar2.i);
                                                    }
                                                    tvg.a.m("Local identity is absent in incoming chat message request.");
                                                    h = aktp.ag(pwh.FAIL_NO_RETRY);
                                                } else {
                                                    h = tvgVar2.k.c().h(new mhr((Object) tvgVar2, (apag) apwlVar, (Object) a5, (Object) qdkVar, 4), tvgVar2.i);
                                                }
                                                ag2 = h.h(new tvd(0), tvgVar2.j);
                                            }
                                        } catch (apba e2) {
                                            xyo e3 = tvg.a.e();
                                            e3.H("Unable to parse the incoming chat message content as a MessageEnvelope.");
                                            e3.z("errorMessage", e2.getMessage());
                                            e3.q();
                                            tvgVar2.q.p(rve.a(qdkVar.a.g), 18);
                                            tvgVar2.h.e("Bugle.Etouffee.DecryptionAborted.Reason", ttf.INVALID_PROTOCOL_BUFFER.y);
                                            ag2 = aktp.ag(ubh.d(pwh.FAIL_NO_RETRY));
                                        }
                                    }
                                }
                                ag2 = tvgVar2.c(qdkVar, (aozb) optional.get()).h(new tvd(0), tvgVar2.j);
                            }
                        } catch (ajsh e4) {
                            rve a6 = rve.a(qdkVar.a.g);
                            xyo e5 = tvg.a.e();
                            e5.H("Failed to deserialize contents of a message receipt.");
                            e5.g(a6);
                            e5.r(e4);
                            tvgVar2.q.p(a6, 27);
                            ag2 = aktp.ag(ubh.d(pwh.FAIL_NO_RETRY));
                        }
                    }
                    return ag2.i(new tsm(this, qdkVar, 13), this.h);
                }
            }
            if (this.l.t()) {
                if (ajru.b.e(ajrtVar.b)) {
                    tvg tvgVar3 = this.k;
                    ajrt ajrtVar3 = (ajrt) tvgVar3.l.m().fu(qdkVar.a());
                    if (!ajrtVar3.b.e(ajru.b)) {
                        tvg.a.o("Incoming message is not a file transfer.");
                        ag = aktp.ag(tsw.a);
                    } else {
                        try {
                            AutoValue_FileTransferInformation autoValue_FileTransferInformation = (AutoValue_FileTransferInformation) ajrv.c(ajrtVar3);
                            Optional optional2 = autoValue_FileTransferInformation.c;
                            if (optional2.isEmpty()) {
                                tvg.a.o("File transfer message does not contain the encrypted-data extension.");
                                FileInformation fileInformation = autoValue_FileTransferInformation.a;
                                if (trx.a((String) fileInformation.h().orElse(null), fileInformation.b().toString())) {
                                    tvgVar3.h.e("Bugle.Etouffee.FileTransfer.Format", yyb.cV(4));
                                    tvgVar3.q.p(rve.a(qdkVar.a.g), 36);
                                } else {
                                    tvgVar3.h.e("Bugle.Etouffee.FileTransfer.Format", yyb.cV(5));
                                }
                                ag = aktp.ag(tsw.a);
                            } else {
                                xyo c3 = tvg.a.c();
                                c3.H("Processing file transfer with encrypted data extension");
                                c3.g(rve.a(qdkVar.a.g));
                                c3.q();
                                ag = tvgVar3.c(qdkVar, (aozb) optional2.get()).h(new tvd(0), tvgVar3.j).e(twx.class, new ttu(15), tvgVar3.j);
                            }
                        } catch (ajsh e6) {
                            rve a7 = rve.a(qdkVar.a.g);
                            xyo e7 = tvg.a.e();
                            e7.H("Failed to deserialize contents of a file transfer message.");
                            e7.g(a7);
                            e7.r(e6);
                            tvgVar3.q.p(a7, 27);
                            ag = aktp.ag(ubh.d(pwh.FAIL_NO_RETRY));
                        }
                    }
                    return ag.i(new tsm(this, qdkVar, 14), this.h);
                }
            }
        }
        if (this.l.h() && tvu.a(ajrtVar.b.toString())) {
            c(a2, qdkVar, z, h2);
        } else if (tvu.a(ajrtVar.b.toString())) {
            c(a2, qdkVar, z, h2);
            qdr qdrVar = this.c;
            pwb pwbVar2 = new pwb();
            aozy builder = qdkVar.a().toBuilder();
            qel qelVar3 = (qel) pwbVar2.m().fu(ajru.e);
            if (!builder.b.isMutable()) {
                builder.u();
            }
            qej qejVar = (qej) builder.b;
            qelVar3.getClass();
            qejVar.c = qelVar3;
            qejVar.b |= 1;
            qej qejVar2 = (qej) builder.s();
            qfo qfoVar4 = qdkVar.a;
            akia b3 = qdk.b();
            aozy builder2 = qfoVar4.toBuilder();
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            ((qfo) builder2.b).j = qfo.emptyProtobufList();
            builder2.J(qejVar2);
            b3.n((qfo) builder2.s());
            b3.m(0);
            return qdrVar.a(b3.l());
        }
        return this.c.a(qdkVar);
    }
}
