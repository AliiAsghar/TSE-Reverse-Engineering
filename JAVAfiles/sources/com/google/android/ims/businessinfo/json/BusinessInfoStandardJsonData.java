package com.google.android.ims.businessinfo.json;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.ims.businessinfo.json.BusinessInfoJsonData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.acyy;
import defpackage.acyz;
import defpackage.advr;
import defpackage.aoop;
import defpackage.aoor;
import defpackage.yjr;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessInfoStandardJsonData extends BusinessInfoJsonData {
    private static final String COLOR_LABEL = "Colour";
    private static final String COLOR_MEDIA_CONTENT = "Other";
    private static final String LOGO_URL_LABEL = "Icon";
    private static final String LOGO_URL_MEDIA_CONTENT = "Logo";
    private static final String TEL_ENTRY_TEL_TYPE = "Work";
    private static final String URI_ENTRY_EMAIL_LABEL = "Email";
    private static final String URI_ENTRY_SERVICE_ID = "ServiceID";
    private static final String URI_ENTRY_SMS_LABEL = "SMS";
    private static final String URI_ENTRY_TYPE_X_GOOGLE_SHORT_CODE = "XGoogleShortCode";
    private static final String WEB_ENTRY_TERMS_AND_CONDITIONS_LABEL = "TCPage";
    private static final String WEB_ENTRY_WEBSITE_LABEL = "Website";

    @aoor(a = "org-description")
    @aoop
    String description;

    @aoor(a = "name")
    @aoop
    NameData nameData;
    static final acyz<Boolean> explicitlySetDefaultRbmColor = acyy.b("explicitly_set_default_rbm_color");
    public static final Pattern SIX_DIGIT_HEX_COLOR_PATTERN = Pattern.compile("^#([0-9A-Fa-f]{6})$");

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class NameData {

        @aoor(a = "name-entry")
        @aoop
        private NameEntryData nameEntryData;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class NameEntryData {

            @aoor(a = "display-name")
            @aoop
            private String displayName;

            private NameEntryData() {
            }
        }

        private NameData() {
        }
    }

    private static void addTelephoneEntryProperty(BusinessInfoData.Builder builder, BusinessInfoJsonData.TelephoneData telephoneData, yjr yjrVar) {
        if (Objects.equals(telephoneData.getTelephoneType(), TEL_ENTRY_TEL_TYPE)) {
            String telephoneString = telephoneData.getTelephoneString();
            if (!TextUtils.isEmpty(telephoneString)) {
                builder.setPrimaryPhoneNumber(telephoneString, formatPhoneNumberForHeader(telephoneString, yjrVar), telephoneData.getCustomLabel());
                return;
            } else {
                advr.q("Cannot parse standard tel entry, missing tel number: %s", telephoneData);
                return;
            }
        }
        advr.q("Cannot parse standard tel entry, invalid tel-type: %s", telephoneData);
    }

    private static void addUriEntryProperty(BusinessInfoData.Builder builder, BusinessInfoJsonData.UriEntryData uriEntryData) {
        String label = uriEntryData.getLabel();
        String uri = uriEntryData.getUri();
        String type = uriEntryData.getType();
        if (!TextUtils.isEmpty(label) && !TextUtils.isEmpty(uri)) {
            if (Objects.equals(label, URI_ENTRY_EMAIL_LABEL)) {
                builder.setPrimaryEmailAddress(uri, uri.replaceFirst("mailto:", ""), uriEntryData.getCustomLabel());
                return;
            }
            if (Objects.equals(label, URI_ENTRY_SMS_LABEL)) {
                builder.setSmsNumber(uri, label, uriEntryData.getCustomLabel());
                return;
            } else if (Objects.equals(type, URI_ENTRY_TYPE_X_GOOGLE_SHORT_CODE)) {
                builder.setShortCode(removeSmsPrefix(uri), label, uriEntryData.getCustomLabel());
                return;
            } else {
                if (Objects.equals(label, URI_ENTRY_SERVICE_ID)) {
                    return;
                }
                advr.q("Cannot parse standard uri entry, unknown type: %s", uriEntryData);
                return;
            }
        }
        advr.q("Cannot parse standard uri entry, missing properties: %s", uriEntryData);
    }

    private static void addWebEntryProperty(BusinessInfoData.Builder builder, BusinessInfoJsonData.WebEntryData webEntryData) {
        String label = webEntryData.getLabel();
        String url = webEntryData.getUrl();
        if (!TextUtils.isEmpty(label) && !TextUtils.isEmpty(url)) {
            if (label.equals(WEB_ENTRY_TERMS_AND_CONDITIONS_LABEL)) {
                String customLabel = webEntryData.getCustomLabel();
                if (customLabel != null) {
                    label = customLabel;
                }
                builder.setTermsAndConditionsUrl(url, label, null);
                return;
            }
            if (label.equals(WEB_ENTRY_WEBSITE_LABEL)) {
                builder.setPrimaryWebsite(url, url.replaceFirst("^(https?://)", ""), webEntryData.getCustomLabel());
                return;
            } else {
                advr.q("Cannot parse standard web entry, invalid type: %s", webEntryData);
                return;
            }
        }
        advr.q("Cannot parse standard web entry, missing properties: %s", webEntryData);
    }

    public static int getVerificationStatus(String str) {
        int verifiedBotPlatform = BusinessInfoData.getVerifiedBotPlatform(str);
        if (verifiedBotPlatform != 1 && verifiedBotPlatform != 2) {
            advr.c("Marking business %s as unverified from platform %s.", advr.b(str), advr.b(Integer.valueOf(verifiedBotPlatform)));
            return 1;
        }
        advr.c("Marking business %s as verified from platform %s.", advr.b(str), advr.b(Integer.valueOf(verifiedBotPlatform)));
        return 2;
    }

    public String getColor() {
        for (MediaEntryJsonData mediaEntryJsonData : getMediaEntries()) {
            if (Objects.equals(mediaEntryJsonData.getLabel(), COLOR_LABEL) && Objects.equals(mediaEntryJsonData.getMediaContent(), COLOR_MEDIA_CONTENT)) {
                String content = mediaEntryJsonData.getContent();
                if (SIX_DIGIT_HEX_COLOR_PATTERN.matcher(content).matches()) {
                    return content;
                }
                return new String(Base64.decode(content, 0), StandardCharsets.UTF_8);
            }
        }
        if (((Boolean) explicitlySetDefaultRbmColor.a()).booleanValue()) {
            return String.format("#%06X", 3622735);
        }
        return "";
    }

    public String getDescription() {
        return this.description;
    }

    public String getLogoUrl() {
        for (MediaEntryJsonData mediaEntryJsonData : getMediaEntries()) {
            if (Objects.equals(mediaEntryJsonData.getLabel(), LOGO_URL_LABEL) && Objects.equals(mediaEntryJsonData.getMediaContent(), LOGO_URL_MEDIA_CONTENT)) {
                return mediaEntryJsonData.getUrl();
            }
        }
        return null;
    }

    public String getName() {
        NameData nameData = this.nameData;
        if (nameData != null && nameData.nameEntryData != null) {
            return this.nameData.nameEntryData.displayName;
        }
        return null;
    }

    public void parseJsonToBuilder(BusinessInfoData.Builder builder, String str, yjr yjrVar) {
        BusinessInfoData.Builder name = builder.setName(getName());
        name.setLogoImageRemoteUrl(getLogoUrl());
        name.setDescription(getDescription());
        name.setColor(getColor());
        name.setVerificationStatus(getVerificationStatus(str));
        Iterator<BusinessInfoJsonData.UriEntryData> it = getUriEntries().iterator();
        while (it.hasNext()) {
            addUriEntryProperty(builder, it.next());
        }
        BusinessInfoJsonData.TelephoneData telephoneData = getTelephoneData();
        if (telephoneData != null) {
            addTelephoneEntryProperty(builder, telephoneData, yjrVar);
        }
        Iterator<BusinessInfoJsonData.WebEntryData> it2 = getWebEntries().iterator();
        while (it2.hasNext()) {
            addWebEntryProperty(builder, it2.next());
        }
    }
}
