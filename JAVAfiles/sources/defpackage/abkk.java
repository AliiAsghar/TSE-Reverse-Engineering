package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.internal.IAsterismApiService;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.constellation.GetIidTokenRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.internal.IConstellationApiService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkk implements abtf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public abkk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.abtf
    public final /* synthetic */ void a(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        abvw abvwVar = (abvw) obj;
                        abvr abvrVar = new abvr((acit) obj2);
                        Context context = abvwVar.b;
                        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                        ((IConstellationApiService) abvwVar.w()).getIidToken(abvrVar, (GetIidTokenRequest) this.a, new ApiMetadata(complianceOptions));
                        return;
                    }
                    abvw abvwVar2 = (abvw) obj;
                    abvq abvqVar = new abvq((acit) obj2);
                    Context context2 = abvwVar2.b;
                    ComplianceOptions complianceOptions2 = new ComplianceOptions(-1, -1, 0, true);
                    ((IConstellationApiService) abvwVar2.w()).verifyPhoneNumber(abvqVar, (VerifyPhoneNumberRequest) this.a, new ApiMetadata(complianceOptions2));
                    return;
                }
                abvw abvwVar3 = (abvw) obj;
                abvp abvpVar = new abvp((acit) obj2);
                Context context3 = abvwVar3.b;
                ComplianceOptions complianceOptions3 = new ComplianceOptions(-1, -1, 0, true);
                ((IConstellationApiService) abvwVar3.w()).verifyPhoneNumberV1(abvpVar, (Bundle) this.a, new ApiMetadata(complianceOptions3));
                return;
            }
            abkp abkpVar = (abkp) obj;
            abki abkiVar = new abki((acit) obj2);
            Context context4 = abkpVar.b;
            ComplianceOptions complianceOptions4 = new ComplianceOptions(-1, -1, 0, true);
            ((IAsterismApiService) abkpVar.w()).getAsterismConsent(abkiVar, (GetAsterismConsentRequest) this.a, new ApiMetadata(complianceOptions4));
            return;
        }
        abkp abkpVar2 = (abkp) obj;
        abkj abkjVar = new abkj((acit) obj2);
        Context context5 = abkpVar2.b;
        ComplianceOptions complianceOptions5 = new ComplianceOptions(-1, -1, 0, true);
        ((IAsterismApiService) abkpVar2.w()).setAsterismConsent(abkjVar, (SetAsterismConsentRequest) this.a, new ApiMetadata(complianceOptions5));
    }
}
