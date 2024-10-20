package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aebq implements aebp {
    public final /* synthetic */ apag a;
    private final /* synthetic */ int b;

    public /* synthetic */ aebq(apag apagVar, int i) {
        this.b = i;
        this.a = apagVar;
    }

    @Override // defpackage.aebp
    public final void a(ahjj ahjjVar) {
        int i = 16;
        int i2 = 8;
        int i3 = 10;
        int i4 = 2;
        int i5 = 1;
        switch (this.b) {
            case 0:
                hzj hzjVar = (hzj) this.a;
                if ((hzjVar.b & 1) != 0) {
                    String str = hzjVar.c;
                    str.getClass();
                    ahjjVar.h("rawContent", str);
                }
                if ((hzjVar.b & 2) != 0) {
                    String str2 = hzjVar.d;
                    str2.getClass();
                    ahjjVar.h("language", str2);
                    return;
                }
                return;
            case 1:
                iad iadVar = (iad) this.a;
                if ((iadVar.b & 1) != 0) {
                    hzz hzzVar = iadVar.c;
                    if (hzzVar == null) {
                        hzzVar = hzz.a;
                    }
                    hzzVar.getClass();
                    ahjjVar.g("signals", new aebq(hzzVar, 15));
                }
                if ((iadVar.b & 2) != 0) {
                    final hzu hzuVar = iadVar.d;
                    if (hzuVar == null) {
                        hzuVar = hzu.a;
                    }
                    hzuVar.getClass();
                    ahjjVar.g("hashes", new aebp() { // from class: aebr
                        @Override // defpackage.aebp
                        public final void a(ahjj ahjjVar2) {
                            hzu hzuVar2 = hzu.this;
                            if ((hzuVar2.b & 1) != 0) {
                                String str3 = hzuVar2.c;
                                str3.getClass();
                                ahjjVar2.h("contentHash", str3);
                            }
                            if ((hzuVar2.b & 2) != 0) {
                                String str4 = hzuVar2.d;
                                str4.getClass();
                                ahjjVar2.h("encryptedHash", str4);
                            }
                            if ((hzuVar2.b & 4) != 0) {
                                ahjjVar2.j("isHashMatched", hzuVar2.e);
                            }
                            if ((hzuVar2.b & 8) != 0) {
                                ahjjVar2.j("isSignatureVerified", hzuVar2.f);
                            }
                        }
                    });
                }
                if ((iadVar.b & 4) != 0) {
                    hzv hzvVar = iadVar.e;
                    if (hzvVar == null) {
                        hzvVar = hzv.a;
                    }
                    hzvVar.getClass();
                    ahjjVar.g("ocr", new aebq(hzvVar, 9));
                    return;
                }
                return;
            case 2:
                iab iabVar = (iab) this.a;
                if ((iabVar.b & 1) != 0) {
                    hzi hziVar = iabVar.c;
                    if (hziVar == null) {
                        hziVar = hzi.a;
                    }
                    hziVar.getClass();
                    ahjjVar.g("entityId", new aebq(hziVar, 18));
                }
                if ((iabVar.b & 2) != 0) {
                    hzj hzjVar2 = iabVar.d;
                    if (hzjVar2 == null) {
                        hzjVar2 = hzj.a;
                    }
                    hzjVar2.getClass();
                    ahjjVar.g(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, new aebq(hzjVar2, 0));
                }
                if ((iabVar.b & 4) != 0) {
                    hzl hzlVar = iabVar.e;
                    if (hzlVar == null) {
                        hzlVar = hzl.a;
                    }
                    hzlVar.getClass();
                    ahjjVar.g("url", adcx.S(hzlVar));
                }
                if ((iabVar.b & 8) != 0) {
                    hzm hzmVar = iabVar.f;
                    if (hzmVar == null) {
                        hzmVar = hzm.a;
                    }
                    hzmVar.getClass();
                    ahjjVar.g("urlSet", new aebq(hzmVar, 17));
                    return;
                }
                return;
            case 3:
                iaa iaaVar = (iaa) this.a;
                if ((iaaVar.b & 1) != 0) {
                    hzq hzqVar = iaaVar.c;
                    if (hzqVar == null) {
                        hzqVar = hzq.a;
                    }
                    hzqVar.getClass();
                    ahjjVar.g("sInfoParams", new aebq(hzqVar, 19));
                }
                if ((iaaVar.b & 2) != 0) {
                    hzo hzoVar = iaaVar.d;
                    if (hzoVar == null) {
                        hzoVar = hzo.a;
                    }
                    hzoVar.getClass();
                    ahjjVar.g("messageContext", new aebq(hzoVar, 14));
                    return;
                }
                return;
            case 4:
                hzh hzhVar = (hzh) this.a;
                if ((hzhVar.b & 1) != 0) {
                    iab iabVar2 = hzhVar.c;
                    if (iabVar2 == null) {
                        iabVar2 = iab.a;
                    }
                    iabVar2.getClass();
                    ahjjVar.g("canonical", new aebq(iabVar2, i4));
                }
                if ((hzhVar.b & 2) != 0) {
                    iac iacVar = hzhVar.d;
                    if (iacVar == null) {
                        iacVar = iac.a;
                    }
                    iacVar.getClass();
                    ahjjVar.g("gppd", new aebq(iacVar, i2));
                }
                if ((hzhVar.b & 4) != 0) {
                    iad iadVar2 = hzhVar.e;
                    if (iadVar2 == null) {
                        iadVar2 = iad.a;
                    }
                    iadVar2.getClass();
                    ahjjVar.g("onDevice", new aebq(iadVar2, i5));
                }
                if ((hzhVar.b & 8) != 0) {
                    iaa iaaVar2 = hzhVar.f;
                    if (iaaVar2 == null) {
                        iaaVar2 = iaa.a;
                    }
                    iaaVar2.getClass();
                    ahjjVar.g("amOnDevice", new aebq(iaaVar2, 3));
                    return;
                }
                return;
            case 5:
                hzx hzxVar = (hzx) this.a;
                if ((hzxVar.b & 1) != 0) {
                    hzw hzwVar = hzxVar.c;
                    if (hzwVar == null) {
                        hzwVar = hzw.a;
                    }
                    hzwVar.getClass();
                    ahjjVar.g("tensorDataFloat", new aebq(hzwVar, 11));
                    return;
                }
                return;
            case 6:
                hzr hzrVar = (hzr) this.a;
                apaj apajVar = hzrVar.b;
                apajVar.getClass();
                ahjjVar.i("values", apajVar);
                apax apaxVar = hzrVar.c;
                apaxVar.getClass();
                ahjjVar.i("strings", apaxVar);
                return;
            case 7:
                if ((((hzp) this.a).b & 1) != 0) {
                    ((Data) ahjjVar.a).putDouble("uss", r0.c);
                    return;
                }
                return;
            case 8:
                iac iacVar2 = (iac) this.a;
                if ((iacVar2.b & 1) != 0) {
                    hzt hztVar = iacVar2.c;
                    if (hztVar == null) {
                        hztVar = hzt.a;
                    }
                    hztVar.getClass();
                    ahjjVar.g("swInput", new aebq(hztVar, 20));
                }
                if ((iacVar2.b & 2) != 0) {
                    hzr hzrVar2 = iacVar2.d;
                    if (hzrVar2 == null) {
                        hzrVar2 = hzr.a;
                    }
                    hzrVar2.getClass();
                    ahjjVar.g("cmInput", new aebq(hzrVar2, 6));
                }
                if ((iacVar2.b & 4) != 0) {
                    hzs hzsVar = iacVar2.e;
                    if (hzsVar == null) {
                        hzsVar = hzs.a;
                    }
                    hzsVar.getClass();
                    ahjjVar.g("sprInput", new aebq(hzsVar, i3));
                    return;
                }
                return;
            case 9:
                hzv hzvVar2 = (hzv) this.a;
                if ((hzvVar2.b & 1) != 0) {
                    String str3 = hzvVar2.c;
                    str3.getClass();
                    ahjjVar.h("ocrResults", str3);
                    return;
                }
                return;
            case 10:
                hzs hzsVar2 = (hzs) this.a;
                apaj apajVar2 = hzsVar2.b;
                apajVar2.getClass();
                ahjjVar.i("values", apajVar2);
                apax apaxVar2 = hzsVar2.c;
                apaxVar2.getClass();
                ahjjVar.i("strings", apaxVar2);
                return;
            case 11:
                apan apanVar = ((hzw) this.a).b;
                apanVar.getClass();
                ahjjVar.i("floatArray", apanVar);
                return;
            case 12:
                hzk hzkVar = (hzk) this.a;
                if ((hzkVar.b & 1) != 0) {
                    ((Data) ahjjVar.a).putInteger("seconds", hzkVar.c);
                }
                if ((hzkVar.b & 2) != 0) {
                    ahjjVar.f("nanos", hzkVar.d);
                    return;
                }
                return;
            case 13:
                hzl hzlVar2 = (hzl) this.a;
                if ((hzlVar2.b & 1) != 0) {
                    String str4 = hzlVar2.c;
                    str4.getClass();
                    ahjjVar.h("url", str4);
                    return;
                }
                return;
            case 14:
                hzo hzoVar2 = (hzo) this.a;
                if ((hzoVar2.b & 1) != 0) {
                    int R = a.R(hzoVar2.c);
                    if (R == 0) {
                        R = 1;
                    }
                    ahjjVar.f("protocol", R - 1);
                }
                if ((hzoVar2.b & 2) != 0) {
                    int R2 = a.R(hzoVar2.d);
                    if (R2 != 0) {
                        i5 = R2;
                    }
                    ahjjVar.f(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i5 - 1);
                }
                if ((hzoVar2.b & 4) != 0) {
                    String str5 = hzoVar2.e;
                    str5.getClass();
                    ahjjVar.h("groupName", str5);
                }
                if ((hzoVar2.b & 8) != 0) {
                    ahjjVar.f("incomingMessageCount", hzoVar2.f);
                }
                if ((16 & hzoVar2.b) != 0) {
                    ahjjVar.f("outgoingMessageCount", hzoVar2.g);
                }
                if ((hzoVar2.b & 32) != 0) {
                    hzk hzkVar2 = hzoVar2.h;
                    if (hzkVar2 == null) {
                        hzkVar2 = hzk.a;
                    }
                    hzkVar2.getClass();
                    ahjjVar.g("firstInTimestamp", new aebq(hzkVar2, 12));
                    return;
                }
                return;
            case 15:
                hzz hzzVar2 = (hzz) this.a;
                if ((hzzVar2.b & 1) != 0) {
                    String str6 = hzzVar2.c;
                    str6.getClass();
                    ahjjVar.h(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, str6);
                }
                if ((hzzVar2.b & 2) != 0) {
                    String str7 = hzzVar2.d;
                    str7.getClass();
                    ahjjVar.h("androidId", str7);
                }
                if ((hzzVar2.b & 4) != 0) {
                    String str8 = hzzVar2.e;
                    str8.getClass();
                    ahjjVar.h("filePath", str8);
                }
                apax<hzy> apaxVar3 = hzzVar2.f;
                apaxVar3.getClass();
                ArrayList arrayList = new ArrayList(aqjn.J(apaxVar3, 10));
                for (hzy hzyVar : apaxVar3) {
                    hzyVar.getClass();
                    arrayList.add(new aebq(hzyVar, i));
                }
                ahjjVar.i("tensors", arrayList);
                return;
            case 16:
                hzy hzyVar2 = (hzy) this.a;
                if ((hzyVar2.b & 1) != 0) {
                    String str9 = hzyVar2.c;
                    str9.getClass();
                    ahjjVar.h("tensorKey", str9);
                }
                apao apaoVar = hzyVar2.d;
                apaoVar.getClass();
                ahjjVar.i("tensorShape", apaoVar);
                if ((hzyVar2.b & 2) != 0) {
                    hzx hzxVar2 = hzyVar2.e;
                    if (hzxVar2 == null) {
                        hzxVar2 = hzx.a;
                    }
                    hzxVar2.getClass();
                    ahjjVar.g("tensorsData", new aebq(hzxVar2, 5));
                    return;
                }
                return;
            case 17:
                apax apaxVar4 = ((hzm) this.a).b;
                apaxVar4.getClass();
                ArrayList arrayList2 = new ArrayList(aqjn.J(apaxVar4, 10));
                Iterator<E> it = apaxVar4.iterator();
                while (it.hasNext()) {
                    arrayList2.add(adcx.S((hzl) it.next()));
                }
                ahjjVar.i("url", arrayList2);
                return;
            case 18:
                hzi hziVar2 = (hzi) this.a;
                if ((hziVar2.b & 1) != 0) {
                    String str10 = hziVar2.c;
                    str10.getClass();
                    ahjjVar.h("id", str10);
                    return;
                }
                return;
            case 19:
                apax<hzp> apaxVar5 = ((hzq) this.a).b;
                apaxVar5.getClass();
                ArrayList arrayList3 = new ArrayList(aqjn.J(apaxVar5, 10));
                for (hzp hzpVar : apaxVar5) {
                    hzpVar.getClass();
                    arrayList3.add(new aebq(hzpVar, 7));
                }
                ahjjVar.i("sInfos", arrayList3);
                return;
            default:
                hzt hztVar2 = (hzt) this.a;
                apaj apajVar3 = hztVar2.b;
                apajVar3.getClass();
                ahjjVar.i("values", apajVar3);
                apax apaxVar6 = hztVar2.c;
                apaxVar6.getClass();
                ahjjVar.i("strings", apaxVar6);
                return;
        }
    }
}
