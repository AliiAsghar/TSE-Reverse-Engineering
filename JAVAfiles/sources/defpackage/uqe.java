package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import com.google.android.gms.common.Feature;
import com.google.android.gms.constellation.GetIidTokenRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uqe implements dts {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uqe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dts
    public final Object a(dtq dtqVar) {
        int i = 4;
        switch (this.b) {
            case 0:
                ((uqf) this.a).b = dtqVar;
                return arnb.a;
            case 1:
                ((ucd) this.a).b = dtqVar;
                return null;
            case 2:
                alvw g = vbq.a.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider$1", "attachCompleter", 456, "PhoneRegistrationProvider.java")).q("otpCompleter is set");
                synchronized (((vbq) this.a).k) {
                    ((vbq) this.a).l = dtqVar;
                }
                return "OTP Verification";
            case 3:
                Object obj = this.a;
                vdp vdpVar = (vdp) obj;
                vdpVar.e.c("Bugle.Constellation.IIDToken.Requested");
                GetIidTokenRequest getIidTokenRequest = new GetIidTokenRequest(466216207879L);
                ajxp ajxpVar = new ajxp(null);
                ajxpVar.c = new abkk(getIidTokenRequest, 4);
                int i2 = 0;
                ajxpVar.d = new Feature[]{abvu.e};
                ajxpVar.b = 11903;
                acir g2 = vdpVar.d.g(ajxpVar.b());
                g2.r(new vdn(obj, dtqVar, i2));
                g2.s(new vdo(obj, dtqVar, i2));
                return "Requesting IIDToken from Constellation API.";
            case 4:
                Object obj2 = this.a;
                RcsProvisioningListenableWorker rcsProvisioningListenableWorker = (RcsProvisioningListenableWorker) obj2;
                rcsProvisioningListenableWorker.l = dtqVar;
                rcsProvisioningListenableWorker.n = aktp.ah(new uql(obj2, 10), rcsProvisioningListenableWorker.m);
                qiu.h(rcsProvisioningListenableWorker.n);
                return "RCS Provisioning Task";
            case 5:
                ((wne) this.a).b(new vwq(dtqVar, 16));
                return "Starting foreground notification";
            case 6:
                ybz ybzVar = ((yby) this.a).b;
                abvt abvtVar = new abvt(ybzVar.b);
                Bundle bundle = new Bundle();
                bundle.putString("policy_id", "verifiedsmsconsent");
                bundle.putString("package_name", ybzVar.b.getPackageName());
                bundle.putString("certificate_hash", ybzVar.a());
                bundle.putString("client_version", "3");
                ajxp ajxpVar2 = new ajxp(null);
                ajxpVar2.c = new abkk(bundle, 2);
                ajxpVar2.b = 11901;
                acir g3 = abvtVar.g(ajxpVar2.b());
                g3.r(new ktn(dtqVar, 3));
                g3.s(new kos(dtqVar, i));
                return "Requesting Constellation API to get phone number.";
            case 7:
                ((adcz) this.a).d = dtqVar;
                return "groupManagementOperation";
            default:
                return Boolean.valueOf(dtqVar.b(this.a));
        }
    }

    public uqe(vbq vbqVar, int i) {
        this.b = i;
        this.a = vbqVar;
    }
}
