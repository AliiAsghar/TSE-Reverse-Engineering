package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.auth.account.data.IGoogleAuthService;
import com.google.android.gms.phenotype.internal.IPhenotypeService;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acgg implements abtf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ acgg(abrc abrcVar, absy absyVar, UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener, int i) {
        this.d = i;
        this.a = abrcVar;
        this.b = absyVar;
        this.c = usageReportingOptInOptionsChangedListener;
    }

    @Override // defpackage.abtf
    public final void a(Object obj, Object obj2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener = new UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener((absy) this.b);
                ((UsageReportingClientImpl) obj).K((UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener) this.c, usageReportingOptInOptionsChangedListener, new acjc((abrc) this.a, (acit) obj2, usageReportingOptInOptionsChangedListener));
                return;
            } else {
                IGoogleAuthService iGoogleAuthService = (IGoogleAuthService) ((abkz) obj).w();
                ablb ablbVar = new ablb((acit) obj2);
                Object obj3 = this.b;
                iGoogleAuthService.getTokenWithDetails(ablbVar, (Account) this.a, (String) this.c, (Bundle) obj3);
                return;
            }
        }
        acgk acgkVar = new acgk((acit) obj2);
        ((IPhenotypeService) ((acgq) obj).w()).weakRegister(acgkVar, "__internal.external_ids#".concat((String) this.a), 0, new String[]{(String) this.b}, (int[]) this.c, null);
    }

    public /* synthetic */ acgg(Account account, String str, Bundle bundle, int i) {
        this.d = i;
        this.a = account;
        this.c = str;
        this.b = bundle;
    }

    public /* synthetic */ acgg(String str, int[] iArr, int i) {
        this.d = i;
        this.a = "MOBILE_CONFIGURATION_NAME_SPACE";
        this.b = str;
        this.c = iArr;
    }
}
