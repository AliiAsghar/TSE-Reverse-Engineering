package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tuy implements ancs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ tuy(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [vgf, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul i;
        int i2 = this.e;
        int i3 = 2;
        if (i2 != 0) {
            ahqq ahqqVar = null;
            int i4 = 1;
            int i5 = 15;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (Boolean.FALSE.equals((Boolean) obj)) {
                                return aktp.ag(null);
                            }
                            Object obj2 = this.d;
                            int i6 = this.a;
                            Object obj3 = this.b;
                            Object obj4 = this.c;
                            ytw.a.q("Sending diagnostic report for the failed registration");
                            ytp ytpVar = (ytp) ((ytw) obj4).h.b();
                            akul d = ytpVar.c.d();
                            yuu yuuVar = ytpVar.c;
                            yuuVar.getClass();
                            akul i7 = d.i(new xfn(yuuVar, 16), ytpVar.g);
                            akul c = ytpVar.c.c();
                            return aktp.an(d, i7, c).h(new adkp(ytpVar, (anmf) obj3, i6, (Throwable) obj2, d, c, i7, 1), ytpVar.h).i(new xfn(ytpVar.i, 17), ytpVar.g).f(Throwable.class, new xdg(i5), ytpVar.h).h(new yts(i4), ytpVar.h);
                        }
                        qhi qhiVar = (qhi) obj;
                        if (qhiVar != qhi.a && qhiVar != qhi.c) {
                            int i8 = this.a;
                            Object obj5 = this.c;
                            Object obj6 = this.d;
                            Object obj7 = this.b;
                            ((alwl) ((alwl) xsd.a.g()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 393, "FileUploadWorkHandler.java")).q("Recovery strategy was not successful, file upload failed.");
                            return ((xsd) obj7).l((String) obj6, (pwr) obj5, i8);
                        }
                        ((alwl) ((alwl) xsd.a.g()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 390, "FileUploadWorkHandler.java")).t("Recovery strategy result: [%s], retrying.", qhiVar);
                        return aktp.ag(upm.e());
                    }
                    amdk amdkVar = (amdk) obj;
                    Exception cause = amdkVar.getCause();
                    boolean booleanValue = ((Boolean) xdq.d.e()).booleanValue();
                    Object obj8 = this.b;
                    if (booleanValue && (cause instanceof aniv) && anir.n.equals(((aniv) cause).a.b)) {
                        xdq xdqVar = (xdq) obj8;
                        ((yyt) xdqVar.i.b()).X(xdqVar.h, new vff(((vjs) xdqVar.j.b()).a, this.a)).a();
                    }
                    Object obj9 = this.d;
                    ((xdq) obj8).k.e(this.c, 2);
                    return aktp.af(new psx((String) obj9, amdkVar.getCause()));
                }
                aozy b = ((aozy) obj).b();
                vfl vflVar = (vfl) this.b;
                return this.d.a(vflVar.q, this.c, this.a).h(new veg(b, 19), vflVar.c);
            }
            boolean booleanValue2 = ((Boolean) obj).booleanValue();
            if (!((Boolean) qpf.a.e()).booleanValue() && !qpi.a()) {
                return aktp.ag(Optional.empty());
            }
            if (booleanValue2) {
                rfa.b.o("Skipping BCM conversation lookup for OTP message");
                return aktp.ag(Optional.empty());
            }
            int i9 = this.a;
            Object obj10 = this.c;
            rfa rfaVar = (rfa) this.d;
            ContentValues contentValues = (ContentValues) obj10;
            rew e = rfaVar.e(contentValues, i9);
            e.a.o(((Boolean) new mss(15).get()).booleanValue());
            if (((Boolean) qpf.a.e()).booleanValue()) {
                boolean booleanValue3 = ((Boolean) new mss(15).get()).booleanValue();
                if (((nxg) rfaVar.O.b()).a()) {
                    ahqqVar = rfaVar.K.d();
                }
                return aktp.ai(new mti(rfaVar, (msh) this.b, booleanValue3, i3), rfaVar.F).h(new mhz(rfaVar, e, i9, contentValues, ahqqVar, 2), rfaVar.F);
            }
            return ((qpj) rfaVar.G.b()).e(e.a).h(new qyv(i5), rfaVar.F);
        }
        if (!((Boolean) obj).booleanValue()) {
            return aktp.ag(upm.b());
        }
        Object obj11 = this.d;
        Object obj12 = this.c;
        Object obj13 = this.b;
        final tva tvaVar = (tva) obj13;
        if (((okg) tvaVar.l.b()).a()) {
            i = aktp.ai(new qpk(obj12, obj11, 18), tvaVar.c).i(new qbt(obj13, obj12, obj11, 15, (short[]) null), tvaVar.c);
        } else {
            tcd b2 = tcf.b();
            b2.w("pendingIdentityVerificationFor");
            b2.d(new tux(obj12, obj11, i3));
            i = akul.g(b2.b().v()).i(new qbt(obj13, obj12, obj11, 16, (short[]) null), tvaVar.e);
        }
        final int i10 = this.a;
        final String str = (String) obj11;
        return i.h(new algk() { // from class: tuz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.algk
            public final Object apply(Object obj14) {
                atkn atknVar;
                boolean z;
                upm upmVar = (upm) obj14;
                alvw e2 = tva.a.e();
                e2.X(alwp.a, "BugleEtouffee");
                alvg alvgVar = (alvg) e2;
                alvz alvzVar = ydl.D;
                String str2 = str;
                alvgVar.X(alvzVar, str2);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 327, "IdentityVerificationPendingMessageProcessor.java")).t("Completed download remote registration id from tachyon. result: %s", upmVar);
                boolean z2 = upmVar.a;
                tva tvaVar2 = tva.this;
                if (z2) {
                    tcd b3 = tcf.b();
                    b3.w("getAllPendingMessages1");
                    atkn[] atknVarArr = new atkn[1];
                    if (tvaVar2.i.a()) {
                        atknVar = new atkn((agmh) tcf.c.g, (byte[]) null);
                    } else {
                        atknVar = new atkn((agmh) tcf.c.h, (byte[]) null);
                    }
                    atknVarArr[0] = atknVar;
                    b3.z((String) DesugarArrays.stream(atknVarArr).map(new sho(18)).collect(Collectors.joining(", ")));
                    b3.d(new ttr(str2, 5));
                    alog t = b3.b().t();
                    int i11 = ((alsx) t).c;
                    int i12 = 0;
                    while (i12 < i11) {
                        tbw tbwVar = (tbw) t.get(i12);
                        alvw e3 = tva.a.e();
                        e3.X(alwp.a, "BugleEtouffee");
                        alvg alvgVar2 = (alvg) e3;
                        alvgVar2.X(ydl.f, tbwVar.h());
                        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 336, "IdentityVerificationPendingMessageProcessor.java")).q("Processing queued message");
                        rve h = tbwVar.h();
                        tcb tcbVar = new tcb();
                        tcbVar.f("deletePendingMessage");
                        tcbVar.b(new ttr(h, 6));
                        tcbVar.d();
                        String k = tbwVar.k();
                        k.getClass();
                        ContentType d2 = ContentType.d(k);
                        aozy createBuilder = qfo.b.createBuilder();
                        aozy createBuilder2 = qei.a.createBuilder();
                        String m = tbwVar.m();
                        m.getClass();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar = createBuilder2.b;
                        alog alogVar = t;
                        qei qeiVar = (qei) apagVar;
                        int i13 = i11;
                        qeiVar.b |= 2;
                        qeiVar.d = m;
                        qeh qehVar = qeh.PHONE;
                        if (!apagVar.isMutable()) {
                            createBuilder2.u();
                        }
                        qei qeiVar2 = (qei) createBuilder2.b;
                        qeiVar2.c = qehVar.e;
                        qeiVar2.b |= 1;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qfo qfoVar = (qfo) createBuilder.b;
                        qei qeiVar3 = (qei) createBuilder2.s();
                        qeiVar3.getClass();
                        qfoVar.d = qeiVar3;
                        qfoVar.c |= 1;
                        aozy createBuilder3 = qei.a.createBuilder();
                        String m2 = tbwVar.m();
                        m2.getClass();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar2 = createBuilder3.b;
                        qei qeiVar4 = (qei) apagVar2;
                        qeiVar4.b |= 2;
                        qeiVar4.d = m2;
                        qeh qehVar2 = qeh.PHONE;
                        if (!apagVar2.isMutable()) {
                            createBuilder3.u();
                        }
                        qei qeiVar5 = (qei) createBuilder3.b;
                        qeiVar5.c = qehVar2.e;
                        qeiVar5.b |= 1;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qfo qfoVar2 = (qfo) createBuilder.b;
                        qei qeiVar6 = (qei) createBuilder3.s();
                        qeiVar6.getClass();
                        qfoVar2.e = qeiVar6;
                        qfoVar2.c |= 4;
                        String str3 = tbwVar.h().b;
                        str3.getClass();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar3 = createBuilder.b;
                        qfo qfoVar3 = (qfo) apagVar3;
                        qfoVar3.c |= 32;
                        qfoVar3.g = str3;
                        if (!apagVar3.isMutable()) {
                            createBuilder.u();
                        }
                        qfo qfoVar4 = (qfo) createBuilder.b;
                        qfoVar4.c |= 64;
                        qfoVar4.h = "Dummy conversation ID for 1:1 E2EE message.";
                        aozy createBuilder4 = qej.a.createBuilder();
                        qel qelVar = (qel) tvaVar2.f.m().fu(d2);
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        qej qejVar = (qej) createBuilder4.b;
                        qelVar.getClass();
                        qejVar.c = qelVar;
                        qejVar.b |= 1;
                        String l = tbwVar.l();
                        l.getClass();
                        aozb z3 = aozb.z(l);
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        qej qejVar2 = (qej) createBuilder4.b;
                        qejVar2.b |= 2;
                        qejVar2.d = z3;
                        createBuilder.bk(createBuilder4);
                        tbwVar.ao(6, "sent_timestamp");
                        apct b4 = apds.b(tbwVar.g);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qfo qfoVar5 = (qfo) createBuilder.b;
                        b4.getClass();
                        qfoVar5.k = b4;
                        qfoVar5.c |= 256;
                        String n = tbwVar.n();
                        n.getClass();
                        albo.T(!TextUtils.isEmpty(n));
                        qei a = ((psq) tvaVar2.k.b()).a(n, false);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qfo qfoVar6 = (qfo) createBuilder.b;
                        a.getClass();
                        qfoVar6.f = a;
                        qfoVar6.c |= 16;
                        tbwVar.ao(13, "is_group");
                        if (tbwVar.n) {
                            tbwVar.ao(14, "conversation_id");
                            String str4 = tbwVar.o;
                            str4.getClass();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            qfo qfoVar7 = (qfo) createBuilder.b;
                            qfoVar7.c |= 64;
                            qfoVar7.h = str4;
                            aozy createBuilder5 = qei.a.createBuilder();
                            tbwVar.ao(15, "conference_uri");
                            String str5 = tbwVar.p;
                            str5.getClass();
                            if (!createBuilder5.b.isMutable()) {
                                createBuilder5.u();
                            }
                            apag apagVar4 = createBuilder5.b;
                            qei qeiVar7 = (qei) apagVar4;
                            qeiVar7.b |= 2;
                            qeiVar7.d = str5;
                            qeh qehVar3 = qeh.GROUP;
                            if (!apagVar4.isMutable()) {
                                createBuilder5.u();
                            }
                            qei qeiVar8 = (qei) createBuilder5.b;
                            qeiVar8.c = qehVar3.e;
                            z = true;
                            qeiVar8.b |= 1;
                            qei qeiVar9 = (qei) createBuilder5.s();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            qfo qfoVar8 = (qfo) createBuilder.b;
                            qeiVar9.getClass();
                            qfoVar8.e = qeiVar9;
                            qfoVar8.c |= 4;
                        } else {
                            z = true;
                        }
                        tbwVar.ao(12, "custom_headers");
                        apwq apwqVar = tbwVar.m;
                        if (apwqVar != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            qfo qfoVar9 = (qfo) createBuilder.b;
                            qfoVar9.i = apwqVar;
                            qfoVar9.c |= 128;
                        }
                        if (aczf.E()) {
                            tbwVar.ao(16, "is_delivery_report_requested");
                            if (tbwVar.q) {
                                createBuilder.K(qfn.POSITIVE_DELIVERY);
                            }
                            tbwVar.ao(17, "is_display_report_requested");
                            if (tbwVar.r) {
                                createBuilder.K(qfn.DISPLAY);
                            }
                        }
                        qfo qfoVar10 = (qfo) createBuilder.s();
                        tvaVar2.m.f(qfoVar10).i(new tsm(tvaVar2, rve.a(qfoVar10.g), 17), tvaVar2.e).k(qiu.b(), andi.a);
                        i12++;
                        t = alogVar;
                        i11 = i13;
                    }
                    if (((Boolean) new mss(17).get()).booleanValue()) {
                        tvaVar2.d(tvaVar2.j.b(((psq) tvaVar2.k.b()).a(str2, false)), str2);
                    } else {
                        tvaVar2.c(str2);
                    }
                    return upm.b();
                }
                int i14 = i10;
                alvw i15 = tva.a.i();
                i15.X(alwp.a, "BugleEtouffee");
                alvg alvgVar3 = (alvg) i15;
                alvgVar3.X(ydl.D, str2);
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 343, "IdentityVerificationPendingMessageProcessor.java")).q("Refreshing remote registration failed");
                ((iji) tvaVar2.h.b()).n(amkb.TACHYON_DOWNLOAD_FAILED, i14);
                return upm.e();
            }
        }, tvaVar.b).e(Throwable.class, new ikg(obj13, i10, 6), tvaVar.e);
    }

    public /* synthetic */ tuy(rfa rfaVar, ContentValues contentValues, int i, msh mshVar, int i2) {
        this.e = i2;
        this.d = rfaVar;
        this.c = contentValues;
        this.a = i;
        this.b = mshVar;
    }

    public /* synthetic */ tuy(tva tvaVar, qei qeiVar, String str, int i, int i2) {
        this.e = i2;
        this.b = tvaVar;
        this.c = qeiVar;
        this.d = str;
        this.a = i;
    }

    public /* synthetic */ tuy(xdq xdqVar, int i, msh mshVar, String str, int i2) {
        this.e = i2;
        this.b = xdqVar;
        this.a = i;
        this.c = mshVar;
        this.d = str;
    }

    public /* synthetic */ tuy(ytw ytwVar, anmf anmfVar, int i, Throwable th, int i2) {
        this.e = i2;
        this.c = ytwVar;
        this.b = anmfVar;
        this.a = i;
        this.d = th;
    }
}
