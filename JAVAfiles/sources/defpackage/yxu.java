package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yxu implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ yxu(adnt adntVar, String str, String str2, int i) {
        this.d = i;
        this.c = adntVar;
        this.b = str;
        this.a = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean q;
        wfo wfoVar;
        Optional empty;
        int i = 3;
        boolean z = false;
        boolean z2 = false;
        r6 = 0;
        r6 = 0;
        r6 = 0;
        int i2 = 0;
        switch (this.d) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    return yxv.c();
                }
                ?? r1 = this.c;
                Object obj2 = this.b;
                Object obj3 = this.a;
                yxl yxlVar = (yxl) obj2;
                msh mshVar = yxlVar.d;
                yxv yxvVar = (yxv) obj3;
                String a = yxvVar.h.a(r1, mshVar);
                if (((Boolean) uui.a.e()).booleanValue()) {
                    Context context = yxvVar.b;
                    if (yyb.aF() && "119".equals(mshVar.j(((Boolean) new mss(9).get()).booleanValue()))) {
                        Intent intent = new Intent("com.lge.mms.action.MMS_119APP_REQUEST");
                        intent.putExtra("startFlag", "003");
                        context.sendBroadcast(intent);
                    }
                }
                int i3 = yxlVar.c;
                wzs wzsVar = yxvVar.d;
                Uri uri = yxlVar.b;
                String str = yxlVar.e;
                xbi xbiVar = yxvVar.c;
                if (!xbiVar.d.a(i3).v()) {
                    alvw d = xbi.a.d();
                    d.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/sms/config/MmsSmsPreferenceUtils", "isDeliveryReportRequired", 70, "MmsSmsPreferenceUtils.java")).q("SMS delivery reports disabled by subscription");
                } else {
                    Resources resources = xbiVar.c.getResources();
                    ykw x = xbiVar.f.x(i3);
                    String string = resources.getString(R.string.delivery_reports_pref_key);
                    boolean u = xbiVar.d.a(i3).u();
                    if (((Boolean) zke.a.e()).booleanValue()) {
                        q = ((Boolean) xbiVar.b(i3).h().orElse(Boolean.valueOf(u))).booleanValue();
                    } else {
                        q = x.q(string, u);
                    }
                    z = q;
                    alvw d2 = xbi.a.d();
                    d2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/sms/config/MmsSmsPreferenceUtils", "isDeliveryReportRequired", 88, "MmsSmsPreferenceUtils.java")).I("SMS delivery reports pref: %b (default: %b)", z, u);
                }
                return wzsVar.q(mshVar, a, uri, i3, albo.ag(str), z, r1.B(), r1.s());
            case 1:
                wxm wxmVar = (wxm) obj;
                qgr qgrVar = ((wxk) this.b).h;
                if (qgrVar == null) {
                    qgrVar = qgr.a;
                }
                Object obj4 = this.a;
                Object obj5 = this.c;
                qgrVar.getClass();
                obj5.getClass();
                ((yxr) obj4).f.a(qgrVar, (rve) obj5, 9);
                wxo wxoVar = wxmVar.c;
                if (wxoVar == null) {
                    wxoVar = wxo.a;
                }
                int U = a.U(wxoVar.c);
                if (U == 0) {
                    U = 1;
                }
                int i4 = U - 1;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                i = 2;
                            }
                        } else {
                            i = 1;
                        }
                    } else {
                        i = -1;
                        i2 = -1;
                    }
                } else {
                    i = 0;
                }
                return vqh.a(i, i2).a();
            case 2:
                Boolean bool = (Boolean) obj;
                Object obj6 = this.a;
                if (bool != null && bool.booleanValue()) {
                    Object obj7 = this.c;
                    Object obj8 = this.b;
                    ((abbu) ((aalt) obj6).Z.b()).l("Conversation with " + ((rrl) obj8).m() + " labeled as " + ((SuperSortLabel) obj7).name());
                } else {
                    ((abbu) ((aalt) obj6).Z.b()).l("Unable to label last message in conversation");
                }
                return bool;
            case 3:
                GetAsterismConsentResponse getAsterismConsentResponse = (GetAsterismConsentResponse) obj;
                if (getAsterismConsentResponse.b == 1) {
                    wfoVar = wfo.GOOGLE_TOS_CONSENTED;
                } else {
                    wfoVar = wfo.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED;
                }
                Object obj9 = this.c;
                Object obj10 = this.a;
                Object obj11 = this.b;
                String str2 = getAsterismConsentResponse.c;
                adka adkaVar = (adka) obj11;
                adkaVar.c.p(str2);
                GetAsterismConsentRequest getAsterismConsentRequest = (GetAsterismConsentRequest) obj9;
                advr.k("getAsterismConsent succeeded: sessionId=%s requestCode=%s consent=%s responseHasGmscoreIidToken=%s", obj10, Integer.valueOf(getAsterismConsentRequest.a), wfoVar.toString(), Boolean.valueOf(!str2.isEmpty()));
                adkaVar.f.q(adkaVar.b, (String) obj10, getAsterismConsentRequest.a, wfoVar, !getAsterismConsentResponse.c.isEmpty(), true, null);
                return new adkb(wfoVar, str2);
            case 4:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    Object obj12 = this.c;
                    Object obj13 = this.a;
                    Object obj14 = this.b;
                    GetAsterismConsentRequest getAsterismConsentRequest2 = (GetAsterismConsentRequest) obj12;
                    advr.s(th, "getAsterismConsent failure: sessionId=%s requestCode=%s", obj13, Integer.valueOf(getAsterismConsentRequest2.a));
                    adka adkaVar2 = (adka) obj14;
                    adkaVar2.f.q(adkaVar2.b, (String) obj13, getAsterismConsentRequest2.a, wfo.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED, false, false, th);
                }
                return th;
            case 5:
                apkc apkcVar = (apkc) obj;
                int i5 = apkcVar.b & 2;
                Object obj15 = this.b;
                Object obj16 = this.c;
                if (i5 != 0) {
                    apjn apjnVar = apkcVar.d;
                    if (apjnVar == null) {
                        apjnVar = apjn.a;
                    }
                    if ((apjnVar.b & 4) == 0) {
                        apkcVar = ((adnt) obj16).n(apkcVar, 8, (String) obj15);
                    }
                }
                aozy builder = apkcVar.toBuilder();
                aozy createBuilder = apjn.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apjn apjnVar2 = (apjn) createBuilder.b;
                apjnVar2.g = 1;
                apjnVar2.b |= 8;
                apct b = apds.b(agkx.W().longValue());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apjn apjnVar3 = (apjn) createBuilder.b;
                b.getClass();
                apjnVar3.e = b;
                apjnVar3.b |= 2;
                apjn apjnVar4 = (apjn) createBuilder.s();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apkc apkcVar2 = (apkc) builder.b;
                apjnVar4.getClass();
                apkcVar2.d = apjnVar4;
                apkcVar2.b |= 2;
                apkc apkcVar3 = (apkc) builder.s();
                adnt adntVar = (adnt) obj16;
                if (((acxl) adntVar.d.b()).a()) {
                    empty = Optional.of(obj15);
                } else {
                    empty = Optional.empty();
                }
                return adntVar.d(apkcVar3, (String) this.a, empty);
            case 6:
                return ((adnt) this.c).d((apkc) obj, (String) this.a, (Optional) this.b);
            case 7:
                return ((agsw) this.c).c((String) this.a, this.b);
            default:
                ajza ajzaVar = (ajza) obj;
                if (ajzaVar.c == 2) {
                    z2 = true;
                }
                albo.T(z2);
                boolean equals = ajzaVar.b.i.equals("incognito");
                Object obj17 = this.a;
                if (!equals) {
                    Object obj18 = this.c;
                    Object obj19 = this.b;
                    aozy builder2 = ((apag) obj17).toBuilder();
                    String str3 = ((akag) obj19).a;
                    str3.getClass();
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    ((akai) builder2.b).a().put(str3, Integer.valueOf(((ajwt) obj18).a));
                    return (akai) builder2.s();
                }
                return obj17;
        }
    }

    public /* synthetic */ yxu(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ yxu(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ yxu(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.a = str;
        this.b = obj2;
    }
}
