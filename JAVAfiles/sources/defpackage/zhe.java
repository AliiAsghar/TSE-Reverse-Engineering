package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhe extends zil {
    public yfu aj;
    private PackageManager ak;
    private Preference al;
    private Preference an;
    private Preference ao;

    @Override // defpackage.gfl
    public final void aN(Bundle bundle) {
        fR(R.xml.privacy_terms_preference);
        this.ak = fe().getPackageManager();
        this.al = a(S(R.string.application_version_number));
        this.an = a(S(R.string.privacy_policy_pref_key));
        this.ao = a(S(R.string.terms_of_service_pref_key));
    }

    public final boolean aP(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(fe().getPackageManager()) != null) {
            aG(intent);
            return true;
        }
        return false;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void af() {
        super.af();
        try {
            this.al.n(this.ak.getPackageInfo(fe().getPackageName(), 128).versionName);
            this.an.o = new lpi(this, 3);
            this.ao.o = new lpi(this, 4);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Package of a resumed activity doesn't exist", e);
        }
    }
}
