package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class maa implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public maa(hkd hkdVar, String str, long j, int i) {
        this.d = i;
        this.c = str;
        this.a = j;
        this.b = hkdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        agnw d;
        agnw d2;
        Object apply;
        agnw d3;
        switch (this.d) {
            case 0:
                int i = mac.c;
                String[] strArr = sqd.a;
                int i2 = spk.a;
                tof tofVar = new tof((char[]) null);
                tofVar.g((mej) this.b);
                tofVar.h(this.a);
                ((Optional) this.c).ifPresent(new leq(tofVar, 16));
                spw e = tofVar.e(new spk(7));
                d = agnc.d("$primary");
                d2 = agnc.d("$primary");
                agnc.a(d2, "events", e, new spl(d, 2), new smq(e, 2));
                return;
            case 1:
                ((hkd) this.b).a.a((String) this.c, this.a);
                hkd hkdVar = (hkd) this.b;
                hkdVar.a.b(hkdVar.toString());
                return;
            case 2:
                alwo alwoVar = mat.a;
                ((aboj) this.b).c((String) this.c).a(0L, this.a, aboj.b);
                return;
            case 3:
                alwo alwoVar2 = mat.a;
                abog e2 = ((aboj) this.b).e((String) this.c);
                abob abobVar = e2.f;
                e2.a(this.a, 1L, aboj.b);
                return;
            case 4:
                xyo c = prd.a.c();
                c.H("Updating business info metadata");
                ?? r1 = this.b;
                c.z("bot id", yyb.bh(r1));
                Object obj = this.c;
                c.z(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, obj);
                long j = this.a;
                c.y("expiry ms", j);
                c.q();
                tef tefVar = new tef();
                tefVar.aj("updateBusinessInfoMetadata");
                tefVar.d((String) obj);
                tefVar.c(j);
                teg tegVar = new teg();
                tegVar.b((String) r1);
                tefVar.ae(new agpw(tegVar), "rbm_business_info-buildAndUpdateForRbmBotId");
                return;
            case 5:
                String[] strArr2 = teh.a;
                int i3 = tdb.a;
                tdy tdyVar = new tdy();
                Object obj2 = this.b;
                BusinessInfoData businessInfoData = (BusinessInfoData) obj2;
                tdyVar.k(businessInfoData.getRbmBotId());
                String name = businessInfoData.getName();
                name.getClass();
                tdyVar.e(name);
                String logoImageRemoteUrl = businessInfoData.getLogoImageRemoteUrl();
                logoImageRemoteUrl.getClass();
                tdyVar.j(logoImageRemoteUrl);
                String logoImageLocalUri = businessInfoData.getLogoImageLocalUri();
                logoImageLocalUri.getClass();
                tdyVar.i(logoImageLocalUri);
                String description = businessInfoData.getDescription();
                description.getClass();
                tdyVar.d(description);
                tdyVar.c(businessInfoData.getColor());
                String heroImageRemoteUrl = businessInfoData.getHeroImageRemoteUrl();
                heroImageRemoteUrl.getClass();
                tdyVar.h(heroImageRemoteUrl);
                String heroImageLocalUri = businessInfoData.getHeroImageLocalUri();
                heroImageLocalUri.getClass();
                tdyVar.g(heroImageLocalUri);
                tdyVar.l(businessInfoData.getVerifierId());
                tdyVar.m((String) this.c);
                tdyVar.f(this.a);
                tdyVar.b(businessInfoData.getAgentUseCase());
                tdx a = tdyVar.a();
                apply = new nfc(obj2, 13).apply(new teg());
                agpw agpwVar = new agpw((teg) apply);
                d3 = agnc.d("$primary");
                if (((Boolean) d3.r(new tdw((aglz) a, agpwVar, d3, 0))).booleanValue()) {
                    return;
                }
                xyo b = prd.a.b();
                b.H("Failed to insert core RBM business info into table.");
                b.z("RBM core business info bind data", a);
                b.q();
                throw new prr("Failed to insert core RBM business info into table.", 19);
            case 6:
                long j2 = this.a;
                Object obj3 = this.b;
                sni.j((ConversationIdType) obj3, new vua(this.c, obj3, j2, 0));
                return;
            case 7:
                vui vuiVar = (vui) this.c;
                xnv xnvVar = vuiVar.h;
                qwm g = vuiVar.n.g();
                long epochMilli = xnvVar.f().toEpochMilli();
                long j3 = this.a;
                ConversationIdType conversationIdType = (ConversationIdType) this.b;
                vuiVar.e.g(g, epochMilli, conversationIdType, j3, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
                ((rtz) vuiVar.d.b()).M(conversationIdType);
                return;
            case 8:
                String str = "getResults init timeout: " + this.a + " ms";
                abwc abwcVar = (abwc) this.c;
                abwn abwnVar = abwcVar.g;
                addy addyVar = (addy) this.b;
                abwcVar.c(new abwb((Context) addyVar.a, (abwd) addyVar.c, str, abwnVar));
                return;
            case 9:
                String str2 = "getResults snapshot timeout: " + this.a + " ms";
                abvz abvzVar = (abvz) this.b;
                abwb abwbVar = new abwb((Context) abvzVar.b, (abwd) abvzVar.f, str2, (abwn) abvzVar.h);
                String a2 = abwbVar.a(new HashMap());
                abwbVar.close();
                ((abvz) this.c).a(a2);
                return;
            case 10:
                new aizh((aizi) this.b, this.a, (apqf) this.c).start();
                return;
            default:
                ?? r0 = this.b;
                if (!r0.isDone()) {
                    ((alvg) ((alvg) ((alvg) akat.a.h()).g(aktu.c())).h("com/google/apps/tiktok/concurrent/AndroidFutures", "crashApplicationOnFailure", 359, "AndroidFutures.java")).J("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", Long.valueOf(this.a), this.c, r0);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ maa(Object obj, long j, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = j;
        this.c = obj2;
    }

    public /* synthetic */ maa(Object obj, Object obj2, long j, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    public /* synthetic */ maa(unp unpVar, ConversationIdType conversationIdType, long j, int i) {
        this.d = i;
        this.c = unpVar;
        this.b = conversationIdType;
        this.a = j;
    }
}
