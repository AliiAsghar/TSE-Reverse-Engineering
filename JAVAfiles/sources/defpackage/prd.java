package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class prd {
    public static final xze a = xze.g("Bugle", "RbmBusinessInfoDataService");
    public final anen b;
    public final agnq c;

    public prd(anen anenVar, agnq agnqVar) {
        this.b = anenVar;
        this.c = agnqVar;
    }

    public static void c(BusinessInfoData businessInfoData, long j) {
        xze xzeVar = a;
        xzeVar.o("Beginning RBM business info validation...");
        e(businessInfoData.getRbmBotId(), "rbmBotId");
        e(businessInfoData.getName(), "displayName");
        e(businessInfoData.getLogoImageRemoteUrl(), "logoImageRemoteUrl");
        e(businessInfoData.getLogoImageLocalUri(), "logoImageLocalUri");
        e(businessInfoData.getDescription(), "description");
        e(businessInfoData.getColor(), BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR);
        e(businessInfoData.getHeroImageRemoteUrl(), "heroImageRemoteUrl");
        e(businessInfoData.getHeroImageLocalUri(), "heroImageLocalUri");
        if (j >= 0) {
            xzeVar.o("Successfully completed RBM business info validation...");
            return;
        }
        xyo e = xzeVar.e();
        e.H("Invalid bot info. Negative expiryMilliseconds.");
        e.y("RBM bot info expiry milliseconds", j);
        e.q();
        throw new prr("Invalid bot info. Negative expiryMilliseconds.", 5);
    }

    public static void d(BusinessInfoData businessInfoData) {
        xze xzeVar = a;
        xzeVar.o("Beginning RBM business verifier info validation...");
        e(businessInfoData.getVerifierId(), "verifierId");
        e(businessInfoData.getVerifierName(), "verifierName");
        e(businessInfoData.getVerifierLogoImageRemoteUrl(), "verifierLogoImageRemoteUrl");
        e(businessInfoData.getVerifierLogoImageLocalUri(), "verifierLogoImageLocalUri");
        xzeVar.o("Successfully completed RBM business verifier info validation...");
    }

    private static void e(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        String bW = a.bW(str2, "Invalid bot info. Empty ", ".");
        a.q(bW);
        throw new prr(bW, 5);
    }

    public final akul a(String str) {
        return aktp.ai(new mzn(this, str, 9, null), this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional b(String str) {
        Object apply;
        Object apply2;
        int i;
        if (!TextUtils.isEmpty(str)) {
            xze xzeVar = a;
            xyo c = xzeVar.c();
            c.H("Attempting read of business info data...");
            c.z("RBM bot id", yyb.bh(str));
            c.q();
            sdv a2 = sdx.a();
            a2.w("getBusinessInfoDataSync-rbm_business_info_and_verifier_info");
            apply = new nfc(str, 11).apply(new sdw());
            a2.k(new agpw((sdw) apply));
            alog t = a2.b().t();
            if (t.isEmpty()) {
                xzeVar.o("Cannot create BusinessInfoData object from empty business info from database.");
                return Optional.empty();
            }
            tdt a3 = tdv.a();
            a3.w("getBusinessInfoDataSync-rbm_business_info_properties");
            apply2 = new nfc(str, 12).apply(new tdu());
            a3.k(new agpw((tdu) apply2));
            alog t2 = a3.b().t();
            sdt sdtVar = (sdt) t.get(0);
            String i2 = sdtVar.i();
            alsx alsxVar = (alsx) t2;
            int i3 = alsxVar.c;
            int i4 = 0;
            while (i4 < i3) {
                tdo tdoVar = (tdo) t2.get(i4);
                if (tdoVar.l() != null) {
                    i4++;
                    if (tdoVar.k() == null) {
                        xyo e = a.e();
                        e.H("Invalid bot info in database. Null header.");
                        e.z("RBM bot id", yyb.bh(i2));
                        e.q();
                        throw new prr("Invalid bot info in database. Null header.", 5);
                    }
                } else {
                    xyo e2 = a.e();
                    e2.H("Invalid bot info in database. Null property value.");
                    e2.z("RBM bot id", yyb.bh(i2));
                    e2.q();
                    throw new prr("Invalid bot info in database. Null property value.", 5);
                }
            }
            BusinessInfoData.Builder builder = BusinessInfoData.builder(sdtVar.i());
            builder.setName(sdtVar.h());
            sdtVar.ao(2, "logo_image_remote_url");
            builder.setLogoImageRemoteUrl(sdtVar.a);
            sdtVar.ao(3, "logo_image_local_uri");
            builder.setLogoImageLocalUri(sdtVar.b);
            builder.setDescription(sdtVar.g());
            sdtVar.ao(5, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR);
            builder.setColor(sdtVar.c);
            sdtVar.ao(6, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL);
            builder.setHeroImageRemoteUrl(sdtVar.d);
            sdtVar.ao(7, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI);
            String str2 = sdtVar.e;
            str2.getClass();
            builder.setHeroImageLocalUri(str2);
            sdtVar.ao(11, "verifier_id");
            builder.setVerifierId(sdtVar.h);
            builder.setVerifierName(sdtVar.k());
            sdtVar.ao(13, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL);
            builder.setVerifierLogoImageRemoteUrl(sdtVar.i);
            builder.setVerifierLogoImageLocalUri(sdtVar.j());
            builder.setVerificationStatus(2);
            builder.setAgentUseCase(sdtVar.f());
            int i5 = alsxVar.c;
            for (int i6 = 0; i6 < i5; i6++) {
                tdo tdoVar2 = (tdo) t2.get(i6);
                int legacyTypeFromPropertyType = BusinessInfoData.getLegacyTypeFromPropertyType(tdoVar2.h());
                String l = tdoVar2.l();
                l.getClass();
                String k = tdoVar2.k();
                k.getClass();
                tdoVar2.ao(4, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER);
                String str3 = tdoVar2.e;
                qku h = tdoVar2.h();
                if (h != qku.PROPERTY_TYPE_PRIMARY_EMAIL && h != qku.PROPERTY_TYPE_PRIMARY_PHONE_NUMBER && h != qku.PROPERTY_TYPE_PRIMARY_WEBSITE && h != qku.PROPERTY_TYPE_SMS_NUMBER && h != qku.PROPERTY_TYPE_TERMS_AND_CONDITIONS_URL && h != qku.PROPERTY_X_GOOGLE_SHORT_CODE) {
                    i = 0;
                } else {
                    i = 1;
                }
                builder.addProperty(legacyTypeFromPropertyType, l, k, str3, i ^ 1);
            }
            BusinessInfoData build = builder.build();
            sdt sdtVar2 = (sdt) t.get(0);
            sdtVar2.ao(8, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
            String str4 = sdtVar2.f;
            sdt sdtVar3 = (sdt) t.get(0);
            sdtVar3.ao(9, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS);
            long j = sdtVar3.g;
            xyo c2 = a.c();
            c2.z("RBM bot id", yyb.bh(str));
            c2.z("RBM bot info version", str4);
            c2.y("RBM bot info expiry milliseconds", j);
            c2.q();
            c(build, j);
            d(build);
            return Optional.of(build);
        }
        xyo e3 = a.e();
        e3.H("Cannot retrieve business info from database; found empty bot id.");
        e3.q();
        throw new prr("Cannot retrieve business info from database; found empty bot id.", 2);
    }
}
