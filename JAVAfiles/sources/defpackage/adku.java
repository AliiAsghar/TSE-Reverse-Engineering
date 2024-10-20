package defpackage;

import android.content.Context;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adku extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adku(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q() {
        apkn apknVar = apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
        adlw adlwVar = this.a;
        String str = adlwVar.r;
        adiw adiwVar = new adiw(adlwVar.n);
        apkk[] apkkVarArr = {apkk.CONSENT_ALREADY_GRANTED};
        adlw adlwVar2 = this.a;
        adlwVar2.aE.d(adlwVar2.s, apknVar, str, adiwVar, apkkVarArr);
        this.a.E();
    }

    private final void r(int i) {
        this.a.D.d("Battery optimization is not required.", new Object[0]);
        this.a.ab(apjx.BATTERY_OPT_EXEMPTION_STAGE);
        this.a.aD(35);
        this.a.aD(8);
        this.a.E();
        if (!this.a.k().q()) {
            this.a.D.d("Configuration is still valid", new Object[0]);
            p(this.a.au, apkn.RCS_PROVISIONING_CONFIGURED_STATE, i);
        } else {
            p(this.a.ai, apkn.RCS_PROVISIONING_READY_STATE, i);
        }
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "CheckPreconditionsState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        apkk apkkVar;
        super.b();
        apkn apknVar = apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
        String valueOf = String.valueOf(this.a.ah());
        adlw adlwVar = this.a;
        String str = adlwVar.r;
        adiw adiwVar = new adiw(adlwVar.n);
        adlw adlwVar2 = this.a;
        adlwVar2.aE.m(adlwVar2.s, apknVar, 2, valueOf, str, adiwVar);
        if (this.a.au()) {
            adlw adlwVar3 = this.a;
            adnk adnkVar = adlwVar3.z;
            adkm adkmVar = adlwVar3.D;
            Boolean valueOf2 = Boolean.valueOf(adlwVar3.aJ.m());
            adlw adlwVar4 = this.a;
            adkmVar.d("provisioningEngineDataRetriever = %s, googleToSConsentCache.hasClientConsent() = %s, provisioningEngineDataRetriever.getGoogleTosConsent = %s rcsDefaultOnConsentCache.hasClientConsent = %s", adnkVar, valueOf2, Boolean.valueOf(adlwVar4.z.A(adlwVar4.s)), Boolean.valueOf(this.a.aF.e()));
            this.a.ab(apjx.RCS_DEFAULT_ON_STAGE);
            this.a.aD(35);
            this.a.aD(61);
            if (this.a.aF.e()) {
                adlw adlwVar5 = this.a;
                adlwVar5.aE.d(adlwVar5.s, apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE, adlwVar5.r, new adiw(adlwVar5.n), apkk.RCS_DEFAULT_ON_ALREADY_SEEN);
                this.a.E();
                if (aczv.F()) {
                    whm e = this.a.aF.a.e();
                    if ((e.b & 2) != 0) {
                        apct apctVar = e.g;
                        if (apctVar == null) {
                            apctVar = apct.a;
                        }
                        apct apctVar2 = e.f;
                        if (apctVar2 == null) {
                            apctVar2 = apct.a;
                        }
                        if (apdr.a(apctVar, apctVar2) > 0) {
                            if (this.a.z.g().isEmpty()) {
                                n(this.a.aC, apkn.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE);
                                return;
                            }
                        }
                    }
                    n(this.a.aB, apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                    return;
                }
                r(1);
                return;
            }
            n(this.a.aD, apkn.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE);
            return;
        }
        if (this.a.ah()) {
            this.a.ab(apjx.GOOGLE_TOS_STAGE);
            this.a.aD(35);
            this.a.aD(3);
            if (!aczv.K() && !aczv.F()) {
                adlw adlwVar6 = this.a;
                if (adlwVar6.z.A(adlwVar6.s)) {
                    this.a.aD(5);
                    adlw adlwVar7 = this.a;
                    apkn apknVar2 = apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
                    String str2 = adlwVar7.r;
                    adiw adiwVar2 = new adiw(adlwVar7.n);
                    apkk[] apkkVarArr = new apkk[1];
                    if (this.a.ah()) {
                        apkkVar = apkk.CONSENT_ALREADY_GRANTED;
                    } else {
                        apkkVar = apkk.GOOGLE_TOS_DISABLED;
                    }
                    Context context = adlwVar7.s;
                    acnz acnzVar = adlwVar7.aE;
                    apkkVarArr[0] = apkkVar;
                    acnzVar.d(context, apknVar2, str2, adiwVar2, apkkVarArr);
                    this.a.E();
                } else {
                    n(this.a.aw, apkn.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE);
                    return;
                }
            } else {
                adlw adlwVar8 = this.a;
                adkm adkmVar2 = adlwVar8.D;
                adnk adnkVar2 = adlwVar8.z;
                Boolean valueOf3 = Boolean.valueOf(adlwVar8.aJ.m());
                adlw adlwVar9 = this.a;
                adkmVar2.d("provisioningEngineDataRetriever = %s, googleToSConsentCache.hasClientConsent() = %s, provisioningEngineDataRetriever.getGoogleTosConsent = %s", adnkVar2, valueOf3, Boolean.valueOf(adlwVar9.z.A(adlwVar9.s)));
                if (!this.a.aJ.m()) {
                    adlw adlwVar10 = this.a;
                    if (!adlwVar10.z.A(adlwVar10.s)) {
                        n(this.a.aw, apkn.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE);
                        return;
                    }
                }
                if (this.a.aJ.m() && !this.a.aJ.n()) {
                    q();
                    n(this.a.aB, apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                    return;
                }
                adlw adlwVar11 = this.a;
                if (adlwVar11.z.A(adlwVar11.s) && !this.a.aJ.m() && aczv.A()) {
                    adlw adlwVar12 = this.a;
                    if (adlwVar12.z.A(adlwVar12.s)) {
                        try {
                            if (!this.a.z.b.l("did_show_google_tos_prompt", false, "bugle")) {
                                this.a.D.d("Restoring Google Tos Consent from Backup", new Object[0]);
                                this.a.aD(58);
                            }
                        } catch (adux unused) {
                            advr.h(adnk.a, "Error while retrieving did show Google Tos prompt from Bugle Storage. Returning default value: %s", true);
                        }
                    }
                    q();
                    this.a.z();
                    n(this.a.aB, apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                    return;
                }
                if (aczv.F()) {
                    q();
                    if (this.a.z.g().isEmpty() || !aczv.V()) {
                        n(this.a.aC, apkn.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE);
                        return;
                    }
                }
            }
        }
        r(1);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_CHECK_PRECONDITIONS;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return false;
    }

    @Override // defpackage.adll
    public final boolean i() {
        return false;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return true;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.a.J("CheckPreconditionsState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 38 && ordinal != 39) {
            return super.o(message, adjjVar);
        }
        r(2);
        return true;
    }
}
