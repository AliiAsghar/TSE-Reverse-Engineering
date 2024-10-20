package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.view.View;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.welcome.EmergencySmsButtonView;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import j$.util.Optional;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adea {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public adea(abqa abqaVar, vau vauVar, vjs vjsVar, adkd adkdVar, acwl acwlVar) {
        this.e = abqaVar;
        this.b = vauVar;
        this.a = vjsVar;
        this.d = adkdVar;
        this.c = acwlVar;
    }

    public static Optional c(Context context) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS).signingInfo;
                signatureArr = signingInfo.getSigningCertificateHistory();
            } else {
                signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            }
            if (signatureArr != null && signatureArr.length != 0) {
                return Optional.of(amcn.e.j(MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray())));
            }
            advr.q("Package signatures were not found.", new Object[0]);
            return Optional.empty();
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            advr.q("Error getting certificate hash.", new Object[0]);
            return Optional.empty();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    public final adeb a(AddUserToGroupRequest addUserToGroupRequest) {
        addUserToGroupRequest.getClass();
        return new adeb(addUserToGroupRequest, (Context) this.a.b(), (ajtk) this.b.b(), (aniz) this.c.b(), (armf) this.d, (anen) this.e.b(), 1);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final adas b(adrc adrcVar) {
        Object obj = ((apxx) this.d).a;
        Object obj2 = ((apxx) this.c).a;
        Object obj3 = ((apxx) this.a).a;
        adrcVar.getClass();
        return new adas((anen) ((apxx) this.b).a, (adov) obj3, (yjr) obj2, (aikc) obj, this.e, adrcVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    public final void d(EmergencySmsButtonView emergencySmsButtonView, Activity activity, int i) {
        Object parent = emergencySmsButtonView.getParent();
        parent.getClass();
        View view = (View) parent;
        view.post(new ajnt((View) emergencySmsButtonView, view, 1));
        int i2 = 2;
        if (((yjv) this.e.b()).d()) {
            emergencySmsButtonView.a.animate().alpha(1.0f).setStartDelay(165L).setDuration(350L).setListener(new aach(emergencySmsButtonView, 2));
        } else {
            emergencySmsButtonView.setVisibility(8);
        }
        emergencySmsButtonView.setOnClickListener(new aarn(this, i, activity, i2));
    }

    public adea(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
    }

    public adea(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr) {
        this.b = armfVar;
        this.a = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
    }

    public adea(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, short[] sArr) {
        this.b = armfVar;
        this.e = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.a = armfVar5;
    }

    public adea(aczg aczgVar) {
        this.c = aczgVar.h("ims_connectivity_verbosity", "INFO");
        this.e = aczgVar.h("ims_availability_verbosity", "INFO");
        this.b = aczgVar.i("enable_u2_logging", false);
        this.a = aczgVar.i("enable_primes_memory_measurement", false);
        this.d = aczgVar.h("override_imei_for_testing_on_emulators", "");
    }

    public adea(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = armfVar;
        this.e = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.a = aqjn.m(new armo("back_up_restore", new abfn(R.drawable.quantum_gm_ic_lock_vd_theme_24, R.string.welcome_gaia_promo_list_back_up_restore_text)), new armo("business_messaging", new abfn(R.drawable.quantum_gm_ic_messages_vd_theme_24, R.string.welcome_gaia_promo_list_business_messaging_text)), new armo("multi_device_sync", new abfn(R.drawable.quantum_gm_ic_laptop_mac_vd_theme_24, R.string.welcome_gaia_promo_list_multi_device_sync_text)), new armo("google_profile", new abfn(R.drawable.quantum_gm_ic_account_circle_filled_vd_theme_24, R.string.welcome_gaia_promo_list_google_profile_text)));
    }

    public adea(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
    }

    public adea(aczr aczrVar) {
        this.a = aczrVar.i("enable_conference_information_object", false);
        this.c = aczrVar.i("enable_reject_closed_group_invite", false);
        this.b = aczrVar.i("enable_no_failure_report_imdn", false);
        this.e = aczrVar.i("enable_pani_in_cpim", false);
        this.d = aczrVar.h("pani_header_cpim_namespace", "");
    }
}
