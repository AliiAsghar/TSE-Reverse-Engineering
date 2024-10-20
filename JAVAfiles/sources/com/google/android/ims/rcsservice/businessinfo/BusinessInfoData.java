package com.google.android.ims.rcsservice.businessinfo;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.acyu;
import defpackage.acyy;
import defpackage.acyz;
import defpackage.acza;
import defpackage.aczd;
import defpackage.aczn;
import defpackage.aczo;
import defpackage.advr;
import defpackage.albo;
import defpackage.alob;
import defpackage.alog;
import defpackage.alsx;
import defpackage.qku;
import j$.util.Objects;
import j$.util.Optional;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessInfoData implements Parcelable {
    public static final int PLATFORM_GOOGLE = 1;
    public static final int PLATFORM_UNKNOWN = 0;
    public static final int PLATFORM_VODAFONE = 2;
    public static final int VERIFICATION_STATUS_UNKNOWN = 0;
    public static final int VERIFICATION_STATUS_UNVERIFIED = 1;
    public static final int VERIFICATION_STATUS_VERIFIED = 2;
    private AgentUseCase agentUseCase;
    private String color;
    private String description;
    private String heroImageLocalUri;
    private String heroImageRemoteUrl;
    private String logoImageLocalUri;
    private String logoImageRemoteUrl;
    private String name;
    private BusinessInfoPropertyCollection properties;
    private String rbmBotId;
    private int verificationStatus;
    private boolean verifiedBrand;
    private String verifierId;
    private String verifierLogoImageLocalUri;
    private String verifierLogoImageRemoteUrl;
    private String verifierName;
    public static final acyz<Boolean> fixPotentialNullableHeadersIssues = aczd.a(187984328);
    public static final acyz<Boolean> enableAgentUseCaseCategoryDeserialization = acyy.b("enable_agent_use_case_category_deserialization");
    public static final Parcelable.Creator<BusinessInfoData> CREATOR = new Parcelable.Creator<BusinessInfoData>() { // from class: com.google.android.ims.rcsservice.businessinfo.BusinessInfoData.1
        private final String getNonNullString(Parcel parcel) {
            return Objects.toString(parcel.readString(), "");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public BusinessInfoData createFromParcel(Parcel parcel) {
            String nonNullString = getNonNullString(parcel);
            String nonNullString2 = getNonNullString(parcel);
            String nonNullString3 = getNonNullString(parcel);
            String readString = parcel.readString();
            String nonNullString4 = getNonNullString(parcel);
            String nonNullString5 = getNonNullString(parcel);
            int readInt = parcel.readInt();
            String nonNullString6 = getNonNullString(parcel);
            String nonNullString7 = getNonNullString(parcel);
            alob alobVar = new alob();
            int readInt2 = parcel.readInt();
            for (int i = 0; i < readInt2; i++) {
                alobVar.h((BusinessInfoProperty) parcel.readParcelable(BusinessInfoProperty.class.getClassLoader()));
            }
            alog g = alobVar.g();
            Builder builder = BusinessInfoData.builder(nonNullString);
            builder.setName(nonNullString2);
            builder.setLogoImageRemoteUrl(nonNullString3);
            builder.setLogoImageLocalUri(readString);
            builder.setDescription(nonNullString4);
            builder.setColor(nonNullString5);
            builder.setVerificationStatus(readInt);
            builder.setHeroImageRemoteUrl(nonNullString6);
            builder.setHeroImageLocalUri(nonNullString7);
            if (acyu.d()) {
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                builder.setVerifierId(readString2);
                builder.setVerifierName(readString3);
                builder.setVerifierLogoImageRemoteUrl(readString4);
                builder.setVerifierLogoImageLocalUri(readString5);
            }
            if (((Boolean) BusinessInfoData.enableAgentUseCaseCategoryDeserialization.a()).booleanValue()) {
                builder.setAgentUseCase(AgentUseCase.values()[parcel.readInt()]);
            }
            BusinessInfoData build = builder.build();
            int i2 = ((alsx) g).c;
            for (int i3 = 0; i3 < i2; i3++) {
                build.properties.insert((BusinessInfoProperty) g.get(i3));
            }
            return build;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BusinessInfoData[] newArray(int i) {
            return new BusinessInfoData[i];
        }
    };

    /* compiled from: PG */
    /* renamed from: com.google.android.ims.rcsservice.businessinfo.BusinessInfoData$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType;

        static {
            int[] iArr = new int[qku.values().length];
            $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType = iArr;
            try {
                iArr[qku.PROPERTY_TYPE_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_TYPE_PRIMARY_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_TYPE_SMS_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_TYPE_PHONE_NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_TYPE_PRIMARY_PHONE_NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_TYPE_WEBSITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_TYPE_PRIMARY_WEBSITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_TYPE_TERMS_AND_CONDITIONS_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_TYPE_PRIVACY_POLICY_URL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_X_GOOGLE_SHORT_CODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[qku.PROPERTY_TYPE_UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface BotPlatform {
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Builder {
        private AgentUseCase agentUseCase;
        private String color;
        private String description;
        private String heroImageLocalUri;
        private String heroImageRemoteUrl;
        private String logoImageLocalUri;
        private String logoImageRemoteUrl;
        private String name;
        private BusinessInfoPropertyCollection properties;
        private final String rbmBotId;
        private int verificationStatus;
        private boolean verifiedBrand;
        private String verifierId;
        private String verifierLogoImageLocalUri;
        private String verifierLogoImageRemoteUrl;
        private String verifierName;

        public Builder addOptionalEmailAddress(String str, String str2, String str3) {
            addProperty(0, str, str2, str3, 1);
            return this;
        }

        public Builder addOptionalPhoneNumber(String str, String str2, String str3) {
            addProperty(2, str, str2, str3, 1);
            return this;
        }

        public Builder addOptionalWebsite(String str, String str2, String str3) {
            addProperty(3, str, str2, str3, 1);
            return this;
        }

        public Builder addProperty(int i, String str, String str2, String str3, int i2) {
            if (TextUtils.isEmpty(str)) {
                advr.q("Cannot create business info property with empty value", new Object[0]);
            } else {
                this.properties.insert(BusinessInfoProperty.create(i, str, str2, str3, i2));
            }
            return this;
        }

        public BusinessInfoData build() {
            BusinessInfoData businessInfoData = new BusinessInfoData();
            businessInfoData.rbmBotId = this.rbmBotId;
            businessInfoData.name = this.name;
            businessInfoData.logoImageRemoteUrl = this.logoImageRemoteUrl;
            businessInfoData.logoImageLocalUri = this.logoImageLocalUri;
            businessInfoData.description = this.description;
            businessInfoData.color = this.color;
            businessInfoData.properties = this.properties;
            businessInfoData.verificationStatus = this.verificationStatus;
            businessInfoData.heroImageRemoteUrl = this.heroImageRemoteUrl;
            businessInfoData.heroImageLocalUri = this.heroImageLocalUri;
            businessInfoData.verifiedBrand = this.verifiedBrand;
            businessInfoData.verifierId = this.verifierId;
            businessInfoData.verifierName = this.verifierName;
            businessInfoData.verifierLogoImageRemoteUrl = this.verifierLogoImageRemoteUrl;
            businessInfoData.verifierLogoImageLocalUri = this.verifierLogoImageLocalUri;
            businessInfoData.agentUseCase = this.agentUseCase;
            return businessInfoData;
        }

        public Builder clearProperties() {
            this.properties = new BusinessInfoPropertyCollection();
            return this;
        }

        public Builder setAgentUseCase(AgentUseCase agentUseCase) {
            this.agentUseCase = agentUseCase;
            return this;
        }

        public Builder setColor(String str) {
            this.color = str;
            return this;
        }

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setHeroImageLocalUri(String str) {
            this.heroImageLocalUri = str;
            return this;
        }

        public Builder setHeroImageRemoteUrl(String str) {
            this.heroImageRemoteUrl = str;
            return this;
        }

        public Builder setLogoImageLocalUri(String str) {
            this.logoImageLocalUri = str;
            return this;
        }

        public Builder setLogoImageRemoteUrl(String str) {
            this.logoImageRemoteUrl = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Builder setPrimaryEmailAddress(String str, String str2, String str3) {
            addProperty(0, str, str2, str3, 0);
            return this;
        }

        public Builder setPrimaryPhoneNumber(String str, String str2, String str3) {
            addProperty(2, str, str2, str3, 0);
            return this;
        }

        public Builder setPrimaryWebsite(String str, String str2, String str3) {
            addProperty(3, str, str2, str3, 0);
            return this;
        }

        public Builder setPrivacyPolicyUrl(String str, String str2, String str3) {
            if (this.properties.getOptionalProperties(5).size() > 0) {
                advr.q("Attempted to add multiple privacy policy URLs, ignoring URL: %s", str);
                return this;
            }
            addProperty(5, str, str2, str3, 1);
            return this;
        }

        public Builder setShortCode(String str, String str2, String str3) {
            addProperty(6, str, str2, str3, 0);
            return this;
        }

        public Builder setSmsNumber(String str, String str2, String str3) {
            addProperty(1, str, str2, str3, 0);
            return this;
        }

        public Builder setTermsAndConditionsUrl(String str, String str2, String str3) {
            addProperty(4, str, str2, str3, 0);
            return this;
        }

        public Builder setVerificationStatus(int i) {
            this.verificationStatus = i;
            return this;
        }

        public Builder setVerifiedBrand(boolean z) {
            this.verifiedBrand = z;
            return this;
        }

        public Builder setVerifierId(String str) {
            this.verifierId = str;
            return this;
        }

        public Builder setVerifierLogoImageLocalUri(String str) {
            this.verifierLogoImageLocalUri = str;
            return this;
        }

        public Builder setVerifierLogoImageRemoteUrl(String str) {
            this.verifierLogoImageRemoteUrl = str;
            return this;
        }

        public Builder setVerifierName(String str) {
            this.verifierName = str;
            return this;
        }

        private Builder(String str) {
            this.rbmBotId = str;
            this.properties = new BusinessInfoPropertyCollection();
            this.agentUseCase = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class BusinessInfoPropertyCollection {
        private final Map<Integer, BusinessInfoProperty> primaryProperties;
        private final Map<Integer, List<BusinessInfoProperty>> properties;

        private boolean containsPrimaryProperty(int i) {
            if (getPrimaryProperty(i) != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<BusinessInfoProperty> getOptionalProperties(int i) {
            Map<Integer, List<BusinessInfoProperty>> map = this.properties;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                this.properties.put(valueOf, new ArrayList());
            }
            List<BusinessInfoProperty> list = this.properties.get(valueOf);
            list.getClass();
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(this.primaryProperties.get(valueOf));
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BusinessInfoProperty getPrimaryProperty(int i) {
            return this.primaryProperties.get(Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<BusinessInfoProperty> getProperties() {
            ArrayList arrayList = new ArrayList();
            Iterator<List<BusinessInfoProperty>> it = this.properties.values().iterator();
            while (it.hasNext()) {
                Iterator<BusinessInfoProperty> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void insert(BusinessInfoProperty businessInfoProperty) {
            if (businessInfoProperty.getImportance() == 0) {
                if (containsPrimaryProperty(businessInfoProperty.getPropertyType())) {
                    advr.q("Attempted to add multiple primary business properties of type %s, ignoring property with value %s", Integer.valueOf(businessInfoProperty.getPropertyType()), businessInfoProperty.getValue());
                    return;
                }
                this.primaryProperties.put(Integer.valueOf(businessInfoProperty.getPropertyType()), businessInfoProperty);
            }
            if (!this.properties.containsKey(Integer.valueOf(businessInfoProperty.getPropertyType()))) {
                this.properties.put(Integer.valueOf(businessInfoProperty.getPropertyType()), new ArrayList());
            }
            List<BusinessInfoProperty> list = this.properties.get(Integer.valueOf(businessInfoProperty.getPropertyType()));
            list.getClass();
            list.add(businessInfoProperty);
        }

        private BusinessInfoPropertyCollection() {
            this.properties = new LinkedHashMap();
            this.primaryProperties = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<BusinessInfoProperty> getProperties(int i) {
            Map<Integer, List<BusinessInfoProperty>> map = this.properties;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                this.properties.put(valueOf, new ArrayList());
            }
            List<BusinessInfoProperty> list = this.properties.get(valueOf);
            list.getClass();
            return list;
        }
    }

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface VerificationStatus {
    }

    private BusinessInfoData() {
        this.verificationStatus = 0;
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    private static boolean columnExists(int i, String str) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            advr.k("Verifier info column %s does not exist.", str);
        }
        return z;
    }

    public static BusinessInfoData createFromCursors(Cursor cursor, Cursor cursor2) {
        if (cursor == null) {
            advr.q("Cannot create BusinessInfoData object from null business info cursor", new Object[0]);
            return null;
        }
        if (cursor.moveToFirst() && cursor.getCount() != 0) {
            String string = cursor.getString(cursor.getColumnIndex("rbm_bot_id"));
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            String string2 = cursor.getString(cursor.getColumnIndex("name"));
            String string3 = cursor.getString(cursor.getColumnIndex("logo_image_remote_url"));
            String string4 = cursor.getString(cursor.getColumnIndex("logo_image_local_uri"));
            String string5 = cursor.getString(cursor.getColumnIndex("description"));
            String ag = albo.ag(cursor.getString(cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR)));
            int i = cursor.getInt(cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS));
            String string6 = cursor.getString(cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL));
            String string7 = cursor.getString(cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI));
            Builder builder = new Builder(string);
            builder.setName(string2);
            builder.setLogoImageRemoteUrl(string3);
            builder.setLogoImageLocalUri(string4);
            builder.setDescription(string5);
            builder.setColor(ag);
            builder.setVerificationStatus(i);
            builder.setHeroImageRemoteUrl(string6);
            builder.setHeroImageLocalUri(string7);
            if (acyu.d()) {
                int columnIndex = cursor.getColumnIndex("verifier_id");
                int columnIndex2 = cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME);
                int columnIndex3 = cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL);
                int columnIndex4 = cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
                if (columnExists(columnIndex, "verifier_id") && columnExists(columnIndex2, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME) && columnExists(columnIndex3, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL) && columnExists(columnIndex4, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI)) {
                    String string8 = cursor.getString(columnIndex);
                    String string9 = cursor.getString(columnIndex2);
                    String string10 = cursor.getString(columnIndex3);
                    String string11 = cursor.getString(columnIndex4);
                    builder.setVerifierId(string8);
                    builder.setVerifierName(string9);
                    builder.setVerifierLogoImageRemoteUrl(string10);
                    builder.setVerifierLogoImageLocalUri(string11);
                } else {
                    advr.k("At least one of the verifier info columns does not exist in the DB. Skipping read of verifier info data.", new Object[0]);
                }
            }
            if (cursor2 != null) {
                while (cursor2.moveToNext()) {
                    int i2 = cursor2.getInt(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE));
                    String string12 = cursor2.getString(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE));
                    String string13 = cursor2.getString(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER));
                    String string14 = cursor2.getString(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER));
                    int i3 = cursor2.getInt(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE));
                    if (TextUtils.isEmpty(string12)) {
                        advr.q("Cannot create business info property with empty value", new Object[0]);
                    } else {
                        if (((Boolean) fixPotentialNullableHeadersIssues.a()).booleanValue() && string13 == null) {
                            if (i2 != 5 && i2 != 4) {
                                advr.q("Cannot add property type: %s, value: %s, header: %s", Integer.valueOf(i2), string12, null);
                            } else {
                                advr.q("Setting null header to empty: %s, value: %s", Integer.valueOf(i2), string12);
                                string13 = "";
                            }
                        }
                        builder.addProperty(i2, string12, string13, string14, i3);
                        builder = builder;
                    }
                }
            }
            return builder.build();
        }
        advr.q("Cannot create BusinessInfoData object from empty business info cursor", new Object[0]);
        return null;
    }

    public static int getLegacyTypeFromPropertyType(qku qkuVar) {
        switch (qkuVar.ordinal()) {
            case 2:
                return 1;
            case 3:
            case 8:
                return 2;
            case 4:
            case 9:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
            default:
                return 0;
            case 10:
                return 6;
        }
    }

    public static qku getPropertyTypeFromLegacyType(BusinessInfoProperty businessInfoProperty) {
        switch (businessInfoProperty.getPropertyType()) {
            case 0:
                if (businessInfoProperty.getImportance() == 0) {
                    return qku.PROPERTY_TYPE_PRIMARY_EMAIL;
                }
                return qku.PROPERTY_TYPE_EMAIL;
            case 1:
                return qku.PROPERTY_TYPE_SMS_NUMBER;
            case 2:
                if (businessInfoProperty.getImportance() == 0) {
                    return qku.PROPERTY_TYPE_PRIMARY_PHONE_NUMBER;
                }
                return qku.PROPERTY_TYPE_PHONE_NUMBER;
            case 3:
                if (businessInfoProperty.getImportance() == 0) {
                    return qku.PROPERTY_TYPE_PRIMARY_WEBSITE;
                }
                return qku.PROPERTY_TYPE_WEBSITE;
            case 4:
                return qku.PROPERTY_TYPE_TERMS_AND_CONDITIONS_URL;
            case 5:
                return qku.PROPERTY_TYPE_PRIVACY_POLICY_URL;
            case 6:
                return qku.PROPERTY_X_GOOGLE_SHORT_CODE;
            default:
                return qku.PROPERTY_TYPE_UNKNOWN;
        }
    }

    public boolean containsLocalVerifierInfo() {
        if (!TextUtils.isEmpty(this.verifierName) && !TextUtils.isEmpty(this.verifierLogoImageLocalUri)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BusinessInfoData) {
            BusinessInfoData businessInfoData = (BusinessInfoData) obj;
            List properties = businessInfoData.properties.getProperties();
            List properties2 = this.properties.getProperties();
            Iterator it = properties.iterator();
            while (it.hasNext()) {
                if (!properties2.contains((BusinessInfoProperty) it.next())) {
                    return false;
                }
            }
            if (this.rbmBotId.equals(businessInfoData.rbmBotId) && Objects.equals(this.name, businessInfoData.name) && Objects.equals(this.logoImageRemoteUrl, businessInfoData.logoImageRemoteUrl) && Objects.equals(this.logoImageLocalUri, businessInfoData.logoImageLocalUri) && Objects.equals(this.description, businessInfoData.description) && Objects.equals(this.color, businessInfoData.color) && this.verificationStatus == businessInfoData.verificationStatus && Objects.equals(this.heroImageRemoteUrl, businessInfoData.heroImageRemoteUrl) && Objects.equals(this.heroImageLocalUri, businessInfoData.heroImageLocalUri) && Objects.equals(this.verifierId, businessInfoData.verifierId) && Objects.equals(this.verifierName, businessInfoData.verifierName) && Objects.equals(this.verifierLogoImageRemoteUrl, businessInfoData.verifierLogoImageRemoteUrl) && Objects.equals(this.verifierLogoImageLocalUri, businessInfoData.verifierLogoImageLocalUri) && this.agentUseCase == businessInfoData.agentUseCase && properties2.size() == properties.size()) {
                return true;
            }
        }
        return false;
    }

    public AgentUseCase getAgentUseCase() {
        return this.agentUseCase;
    }

    public String getColor() {
        return this.color;
    }

    public String getDescription() {
        return this.description;
    }

    public alog<BusinessInfoProperty> getEmailAddresses() {
        return alog.n(this.properties.getProperties(0));
    }

    public String getHeroImageLocalUri() {
        return this.heroImageLocalUri;
    }

    public String getHeroImageRemoteUrl() {
        return this.heroImageRemoteUrl;
    }

    public String getLogoImageLocalUri() {
        return this.logoImageLocalUri;
    }

    public String getLogoImageRemoteUrl() {
        return this.logoImageRemoteUrl;
    }

    public String getName() {
        return this.name;
    }

    public alog<BusinessInfoProperty> getOptionalEmailAddresses() {
        return alog.n(this.properties.getOptionalProperties(0));
    }

    public alog<BusinessInfoProperty> getOptionalPhoneNumbers() {
        return alog.n(this.properties.getOptionalProperties(2));
    }

    public alog<BusinessInfoProperty> getOptionalWebsites() {
        return alog.n(this.properties.getOptionalProperties(3));
    }

    public alog<BusinessInfoProperty> getPhoneNumbers() {
        return alog.n(this.properties.getProperties(2));
    }

    public BusinessInfoProperty getPrimaryEmailAddress() {
        return this.properties.getPrimaryProperty(0);
    }

    public BusinessInfoProperty getPrimaryPhoneNumber() {
        return this.properties.getPrimaryProperty(2);
    }

    public BusinessInfoProperty getPrimaryWebsite() {
        return this.properties.getPrimaryProperty(3);
    }

    public BusinessInfoProperty getPrivacyPolicyUrl() {
        List optionalProperties = this.properties.getOptionalProperties(5);
        if (optionalProperties.size() == 0) {
            return null;
        }
        if (optionalProperties.size() > 1) {
            advr.q("Multiple Privacy Policy URLs in businessInfo, returning first URL", new Object[0]);
        }
        return (BusinessInfoProperty) optionalProperties.get(0);
    }

    public alog<BusinessInfoProperty> getProperties() {
        return alog.n(this.properties.getProperties());
    }

    public String getRbmBotId() {
        return this.rbmBotId;
    }

    public Optional<BusinessInfoProperty> getShortCode() {
        return Optional.ofNullable(this.properties.getPrimaryProperty(6));
    }

    public BusinessInfoProperty getSmsNumber() {
        return this.properties.getPrimaryProperty(1);
    }

    public BusinessInfoProperty getTermsAndConditionsUrl() {
        return this.properties.getPrimaryProperty(4);
    }

    public int getVerificationStatus() {
        return this.verificationStatus;
    }

    public int getVerifiedBotPlatform() {
        return getVerifiedBotPlatform(getRbmBotId());
    }

    public String getVerifierId() {
        return this.verifierId;
    }

    public String getVerifierLogoImageLocalUri() {
        return this.verifierLogoImageLocalUri;
    }

    public String getVerifierLogoImageRemoteUrl() {
        return this.verifierLogoImageRemoteUrl;
    }

    public String getVerifierName() {
        return this.verifierName;
    }

    public alog<BusinessInfoProperty> getWebsites() {
        return alog.n(this.properties.getProperties(3));
    }

    public int hashCode() {
        Iterator it = this.properties.getProperties().iterator();
        int i = 0;
        while (it.hasNext()) {
            i ^= ((BusinessInfoProperty) it.next()).hashCode();
        }
        return Objects.hash(this.rbmBotId, this.name, this.logoImageRemoteUrl, this.logoImageLocalUri, this.description, this.color, Integer.valueOf(this.verificationStatus), this.heroImageRemoteUrl, this.heroImageLocalUri, this.verifierId, this.verifierName, this.verifierLogoImageRemoteUrl, this.verifierLogoImageLocalUri, this.agentUseCase, Integer.valueOf(i));
    }

    public boolean isVerifiedBrand() {
        return this.verifiedBrand;
    }

    public void setHeroImageLocalUri(String str) {
        this.heroImageLocalUri = str;
    }

    public void setHeroImageUrl(String str) {
        this.heroImageRemoteUrl = str;
    }

    public void setLogoImageLocalUri(String str) {
        this.logoImageLocalUri = str;
    }

    public void setVerifierLogoImageLocalUri(String str) {
        this.verifierLogoImageLocalUri = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getRbmBotId());
        parcel.writeString(getName());
        parcel.writeString(getLogoImageRemoteUrl());
        parcel.writeString(getLogoImageLocalUri());
        parcel.writeString(getDescription());
        parcel.writeString(getColor());
        parcel.writeInt(getVerificationStatus());
        parcel.writeString(getHeroImageRemoteUrl());
        parcel.writeString(getHeroImageLocalUri());
        List properties = this.properties.getProperties();
        parcel.writeInt(properties.size());
        Iterator it = properties.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((BusinessInfoProperty) it.next(), i);
        }
        if (acyu.d()) {
            parcel.writeString(getVerifierId());
            parcel.writeString(getVerifierName());
            parcel.writeString(null);
            parcel.writeString(getVerifierLogoImageRemoteUrl());
            parcel.writeString(getVerifierLogoImageLocalUri());
        }
        if (((Boolean) enableAgentUseCaseCategoryDeserialization.a()).booleanValue()) {
            parcel.writeInt(this.agentUseCase.ordinal());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, acyz] */
    public static int getVerifiedBotPlatform(String str) {
        Pattern compile = Pattern.compile((String) ((acza) aczn.a().a.b).a());
        Pattern compile2 = Pattern.compile((String) aczo.a().a.b.a());
        if (compile.matcher(str).find()) {
            return 1;
        }
        return (compile2.matcher(str).find() && ((Boolean) aczo.a().a.a.a()).booleanValue()) ? 2 : 0;
    }
}
