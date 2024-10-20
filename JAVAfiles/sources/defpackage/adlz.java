package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlz implements advb {
    public final Object a;
    private final /* synthetic */ int b;

    public adlz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [vrl, java.lang.Object] */
    @Override // defpackage.advb
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    admq admqVar = (admq) obj;
                    if (admqVar != null) {
                        Object obj2 = this.a;
                        if (((adji) ((afxz) obj2).c).j().contains(new adiw(admqVar.a))) {
                            admqVar.b.filter(new addf(17)).ifPresent(new abid(this, admqVar, 11));
                            return;
                        }
                    }
                    advr.l(adms.a, "Unable to notify rcs provisioning change listeners because update is null or sim is not rcs available.", new Object[0]);
                    return;
                }
                admo admoVar = (admo) obj;
                if (admoVar == null) {
                    return;
                }
                ((afxz) this.a).e(new adiw(admoVar.a));
                return;
            }
            vrm vrmVar = (vrm) obj;
            if (vrmVar != null) {
                this.a.am(vrmVar);
                return;
            }
            return;
        }
        wgk wgkVar = (wgk) obj;
        if (wgkVar != null) {
            adkz adkzVar = (adkz) ((ahjj) this.a).a;
            adlw adlwVar = adkzVar.a;
            int i3 = wgkVar.d;
            int i4 = adlwVar.o;
            if (i3 != i4 && (!adlwVar.am() || !adkzVar.a.J.r(i3, i4))) {
                String str = (String) adkzVar.a.J.g(wgkVar.d, false).map(new adkk(i2)).orElse("");
                if (adkzVar.a.n.isEmpty()) {
                    alvw i5 = adlw.k.i();
                    i5.X(alwp.a, "BugleRcsProvisioning");
                    ((alvg) ((alvg) i5).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$InProgressState", "storeManuallyEnteredMsisdnAndOtpForOtherSim", 2474, "ProvisioningEngineStateMachine.java")).q("PESM: No SimId found for subId of the provisioning OTP when storing manually entered MSISDN.");
                } else {
                    adlw adlwVar2 = adkzVar.a;
                    String n = adlwVar2.z.n(adlwVar2.n);
                    adlw adlwVar3 = adkzVar.a;
                    if (n == null) {
                        n = "";
                    }
                    adnk adnkVar = adlwVar3.z;
                    try {
                        adnkVar.b.k("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str)), n, "bugle");
                    } catch (adux e) {
                        advr.j(e, adnk.a, "Error while storing manually entered MSISDN from Bugle's ContentProvider", new Object[0]);
                    }
                    if (((acxv) adnkVar.e.b()).a()) {
                        ((aday) adnkVar.f.b()).s(str, n);
                    } else {
                        Context context = adnkVar.c;
                        adnu.a();
                        adnu.p(context, str, n);
                    }
                    adkzVar.a.z.t(str, wgkVar);
                }
                adlw adlwVar4 = adkzVar.a;
                adnk adnkVar2 = adlwVar4.z;
                String str2 = adlwVar4.n;
                try {
                    adnkVar2.b.k("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str2)), "", "bugle");
                } catch (adux e2) {
                    adnkVar2.H(6);
                    advr.j(e2, adnk.a, "Error while clearing manually entered MSISDN from Bugle's ContentProvider", new Object[0]);
                }
                if (((acxv) adnkVar2.e.b()).a()) {
                    ((aday) adnkVar2.f.b()).s(str2, "");
                } else {
                    Context context2 = adnkVar2.c;
                    adnu.a();
                    adnu.p(context2, str2, "");
                }
                adlw adlwVar5 = adkzVar.a;
                adlwVar5.z.t(adlwVar5.n, wgk.a);
                return;
            }
            adkzVar.a.V(adjj.MSG_RECEIVED_OTP, wgkVar.c);
        }
    }
}
