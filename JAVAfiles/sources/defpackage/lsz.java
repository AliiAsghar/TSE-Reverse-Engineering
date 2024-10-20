package defpackage;

import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import com.google.android.rcs.client.provisioning.singleregistration.SingleRegistrationVendorImsService;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsz extends unp {
    static final uuf a = uuh.e(uuh.b, "vendor_ims_service_call_retry_delay_seconds", 10);
    public final adis b;
    private final aneo c;
    private final ylg d;
    private final BiFunction e;

    public lsz(aneo aneoVar, BiFunction biFunction, ylg ylgVar, adis adisVar) {
        this.c = aneoVar;
        this.e = biFunction;
        this.d = ylgVar;
        this.b = adisVar;
    }

    public static upm b(Exception exc) {
        advr.i(exc, "[SR]: %s was raised while waiting to connect to SingleRegistrationVendorImsService.", exc.getClass().getSimpleName());
        return upm.e();
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c(unv.WAKELOCK);
        a2.d(Integer.MAX_VALUE);
        a2.g(gry.LINEAR);
        a2.h(((Integer) a.e()).intValue());
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("VendorImsCallWorkItemHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        lsy lsyVar;
        lsu lsuVar = (lsu) apbtVar;
        aphh b = aphh.b(lsuVar.d);
        if (b == null) {
            b = aphh.OPERATION_TYPE_UNKNOWN;
        }
        final int i = 1;
        final int i2 = 0;
        if (aphh.OPERATION_TYPE_SETUP_VENDOR_IMS.equals(b)) {
            lsyVar = new lsy() { // from class: lsv
                @Override // defpackage.lsy
                public final SingleRegistrationVendorImsServiceResult a(SingleRegistrationVendorImsService singleRegistrationVendorImsService, int i3) {
                    if (i != 0) {
                        return singleRegistrationVendorImsService.setupVendorIms(i3);
                    }
                    return singleRegistrationVendorImsService.terminateVendorIms(i3);
                }
            };
        } else {
            lsyVar = new lsy() { // from class: lsv
                @Override // defpackage.lsy
                public final SingleRegistrationVendorImsServiceResult a(SingleRegistrationVendorImsService singleRegistrationVendorImsService, int i3) {
                    if (i2 != 0) {
                        return singleRegistrationVendorImsService.setupVendorIms(i3);
                    }
                    return singleRegistrationVendorImsService.terminateVendorIms(i3);
                }
            };
        }
        final lsy lsyVar2 = lsyVar;
        final int i3 = unsVar.a().b;
        Integer valueOf = Integer.valueOf(lsuVar.c);
        aphh b2 = aphh.b(lsuVar.d);
        if (b2 == null) {
            b2 = aphh.OPERATION_TYPE_UNKNOWN;
        }
        advr.c("[SR] Executing Vendor IMS call. subId: %d, operation: %s, runAttemptCount: %d", valueOf, b2, Integer.valueOf(i3));
        final int i4 = lsuVar.c;
        aphh b3 = aphh.b(lsuVar.d);
        if (b3 == null) {
            b3 = aphh.OPERATION_TYPE_UNKNOWN;
        }
        aphg b4 = aphg.b(lsuVar.e);
        if (b4 == null) {
            b4 = aphg.TRIGGER_UNKNOWN;
        }
        if (i4 < 0) {
            advr.g("[SR]: invalid subscriptionId value. No retry expected.", new Object[0]);
            this.b.i(b3, b4, aphf.FAILURE_REASON_INVALID_SUBSCRIPTION_ID, i3);
            return aktp.ag(upm.d());
        }
        final aphh aphhVar = b3;
        final aphg aphgVar = b4;
        akul h = this.d.a(this.e, SingleRegistrationVendorImsService.class).h(new algk() { // from class: lsw
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                lsy lsyVar3 = lsyVar2;
                aphh aphhVar2 = aphhVar;
                lsz lszVar = lsz.this;
                SingleRegistrationVendorImsService singleRegistrationVendorImsService = (SingleRegistrationVendorImsService) obj;
                int i5 = i4;
                aphg aphgVar2 = aphgVar;
                int i6 = i3;
                try {
                    SingleRegistrationVendorImsServiceResult a2 = lsyVar3.a(singleRegistrationVendorImsService, i5);
                    if (a2 == null) {
                        lszVar.b.i(aphhVar2, aphgVar2, aphf.FAILURE_REASON_UNKNOWN, i6);
                    } else if (a2.succeeded()) {
                        adis adisVar = lszVar.b;
                        aozy createBuilder = apgv.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar = createBuilder.b;
                        apgv apgvVar = (apgv) apagVar;
                        apgvVar.f = 3;
                        apgvVar.b |= 2;
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        apgv apgvVar2 = (apgv) createBuilder.b;
                        apgvVar2.g = 2;
                        apgvVar2.b |= 4;
                        aozy createBuilder2 = apgm.a.createBuilder();
                        aozy createBuilder3 = aphi.a.createBuilder();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar2 = createBuilder3.b;
                        aphi aphiVar = (aphi) apagVar2;
                        aphiVar.c = aphhVar2.d;
                        aphiVar.b |= 1;
                        if (!apagVar2.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar3 = createBuilder3.b;
                        aphi aphiVar2 = (aphi) apagVar3;
                        aphiVar2.b |= 16;
                        aphiVar2.g = i6;
                        if (!apagVar3.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar4 = createBuilder3.b;
                        aphi aphiVar3 = (aphi) apagVar4;
                        aphiVar3.b = 2 | aphiVar3.b;
                        aphiVar3.d = true;
                        if (!apagVar4.isMutable()) {
                            createBuilder3.u();
                        }
                        aphi aphiVar4 = (aphi) createBuilder3.b;
                        aphiVar4.h = aphgVar2.l;
                        aphiVar4.b |= 32;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apgm apgmVar = (apgm) createBuilder2.b;
                        aphi aphiVar5 = (aphi) createBuilder3.s();
                        aphiVar5.getClass();
                        apgmVar.e = aphiVar5;
                        apgmVar.b |= 8;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apgv apgvVar3 = (apgv) createBuilder.b;
                        apgm apgmVar2 = (apgm) createBuilder2.s();
                        apgmVar2.getClass();
                        apgvVar3.d = apgmVar2;
                        apgvVar3.c = 9;
                        ((adiq) adisVar).h((apgv) createBuilder.s());
                    } else if (a2.getCode() == 28) {
                        lszVar.b.i(aphhVar2, aphgVar2, aphf.FAILURE_REASON_SIM_NOT_FOUND, i6);
                    } else if (a2.b.equals(aphf.FAILURE_REASON_IMS_EXCEPTION)) {
                        adis adisVar2 = lszVar.b;
                        apgi apgiVar = a2.a;
                        aozy createBuilder4 = apgv.a.createBuilder();
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apag apagVar5 = createBuilder4.b;
                        apgv apgvVar4 = (apgv) apagVar5;
                        apgvVar4.f = 3;
                        apgvVar4.b |= 2;
                        if (!apagVar5.isMutable()) {
                            createBuilder4.u();
                        }
                        apgv apgvVar5 = (apgv) createBuilder4.b;
                        apgvVar5.g = 3;
                        apgvVar5.b |= 4;
                        aozy createBuilder5 = apgm.a.createBuilder();
                        aozy createBuilder6 = aphi.a.createBuilder();
                        if (!createBuilder6.b.isMutable()) {
                            createBuilder6.u();
                        }
                        apag apagVar6 = createBuilder6.b;
                        aphi aphiVar6 = (aphi) apagVar6;
                        aphiVar6.c = aphhVar2.d;
                        aphiVar6.b |= 1;
                        if (!apagVar6.isMutable()) {
                            createBuilder6.u();
                        }
                        apag apagVar7 = createBuilder6.b;
                        aphi aphiVar7 = (aphi) apagVar7;
                        aphiVar7.b |= 16;
                        aphiVar7.g = i6;
                        if (!apagVar7.isMutable()) {
                            createBuilder6.u();
                        }
                        apag apagVar8 = createBuilder6.b;
                        aphi aphiVar8 = (aphi) apagVar8;
                        aphiVar8.b = 2 | aphiVar8.b;
                        aphiVar8.d = false;
                        aphf aphfVar = aphf.FAILURE_REASON_IMS_EXCEPTION;
                        if (!apagVar8.isMutable()) {
                            createBuilder6.u();
                        }
                        apag apagVar9 = createBuilder6.b;
                        aphi aphiVar9 = (aphi) apagVar9;
                        aphiVar9.e = aphfVar.j;
                        aphiVar9.b |= 4;
                        if (!apagVar9.isMutable()) {
                            createBuilder6.u();
                        }
                        apag apagVar10 = createBuilder6.b;
                        aphi aphiVar10 = (aphi) apagVar10;
                        aphiVar10.f = apgiVar.e;
                        aphiVar10.b |= 8;
                        if (!apagVar10.isMutable()) {
                            createBuilder6.u();
                        }
                        aphi aphiVar11 = (aphi) createBuilder6.b;
                        aphiVar11.h = aphgVar2.l;
                        aphiVar11.b |= 32;
                        if (!createBuilder5.b.isMutable()) {
                            createBuilder5.u();
                        }
                        apgm apgmVar3 = (apgm) createBuilder5.b;
                        aphi aphiVar12 = (aphi) createBuilder6.s();
                        aphiVar12.getClass();
                        apgmVar3.e = aphiVar12;
                        apgmVar3.b |= 8;
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apgv apgvVar6 = (apgv) createBuilder4.b;
                        apgm apgmVar4 = (apgm) createBuilder5.s();
                        apgmVar4.getClass();
                        apgvVar6.d = apgmVar4;
                        apgvVar6.c = 9;
                        ((adiq) adisVar2).h((apgv) createBuilder4.s());
                    } else {
                        lszVar.b.i(aphhVar2, aphgVar2, a2.b, i6);
                    }
                    if (a2 == null) {
                        advr.g("[SR] task failed (result: null). retry expected in %d seconds", Integer.valueOf(((Integer) lsz.a.e()).intValue() * i6));
                        return upm.e();
                    }
                    if (a2.succeeded()) {
                        advr.k("[SR]: task completed. no retry expected", new Object[0]);
                        return upm.b();
                    }
                    if (a2.getCode() == 28) {
                        advr.g("[SR]: task failed. SIM is missing - no retry expected", new Object[0]);
                        return upm.d();
                    }
                    advr.g("[SR]: task failed. retry expected in %d seconds", Integer.valueOf(((Integer) lsz.a.e()).intValue() * i6));
                    return upm.e();
                } catch (ajny e) {
                    lszVar.b.j(aphhVar2, aphgVar2, aphf.FAILURE_REASON_JIBE_SERVICE_EXCEPTION, e.getMessage(), i6);
                    return lsz.b(e);
                }
            }
        }, this.c);
        aphh aphhVar2 = b3;
        aphg aphgVar2 = b4;
        return h.e(SecurityException.class, new lsx(this, aphhVar2, aphgVar2, i3, 1), this.c).e(TimeoutException.class, new lsx(this, aphhVar2, aphgVar2, i3, 0), this.c).e(ylp.class, new lsx(this, aphhVar2, aphgVar2, i3, 2), this.c);
    }

    @Override // defpackage.unx
    public final apca e() {
        return lsu.a.getParserForType();
    }
}
