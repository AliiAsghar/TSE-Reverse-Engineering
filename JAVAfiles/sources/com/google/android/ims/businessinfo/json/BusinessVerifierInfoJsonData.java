package com.google.android.ims.businessinfo.json;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.adom;
import defpackage.advr;
import defpackage.aoop;
import defpackage.aoor;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessVerifierInfoJsonData {
    private static final String MEDIA_ENTRY_LOGO_IMAGE_URL_MEDIA_CONTENT = "LOGO";
    static final String VERIFIER_ID_NAMESPACE_FORMAT_STRING = "%s:%s";

    @aoor(a = "verification-info")
    @aoop
    private VerificationInfoData verificationInfoData;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    static class VerificationInfoData {

        @aoor(a = "media-list")
        @aoop
        private MediaListData mediaListData;

        @aoor(a = "verified")
        @aoop
        private boolean verified;

        @aoor(a = "verifier-id")
        @aoop
        private String verifierId;

        @aoor(a = "verified-by")
        @aoop
        private String verifierName;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        private static class MediaListData {

            @aoor(a = "media-entry")
            @aoop
            private List<MediaEntryJsonData> mediaEntries;

            private MediaListData() {
            }

            public List<MediaEntryJsonData> getMediaEntries() {
                return this.mediaEntries;
            }
        }

        VerificationInfoData() {
        }
    }

    private void addMediaEntryProperty(BusinessInfoData.Builder builder, MediaEntryJsonData mediaEntryJsonData) {
        String mediaContent = mediaEntryJsonData.getMediaContent();
        if (!TextUtils.isEmpty(mediaContent) && !TextUtils.isEmpty(mediaEntryJsonData.getUrl())) {
            if (mediaContent.equals("LOGO")) {
                builder.setVerifierLogoImageRemoteUrl(mediaEntryJsonData.getUrl());
                return;
            } else {
                advr.q("Cannot parse custom media entry, invalid type: %s", mediaEntryJsonData);
                return;
            }
        }
        advr.q("Cannot parse custom media entry, missing properties: %s", mediaEntryJsonData);
    }

    static String getNamespacedVerifierId(String str, String str2) {
        String q = adom.q(str);
        if (!TextUtils.isEmpty(q)) {
            return String.format(VERIFIER_ID_NAMESPACE_FORMAT_STRING, q, str2);
        }
        throw new IllegalArgumentException(String.format("Cannot parse RBM bot id for its SIP host: %s", str));
    }

    public boolean getVerified() {
        return this.verificationInfoData.verified;
    }

    public boolean parseJsonToBuilder(BusinessInfoData.Builder builder, String str) {
        VerificationInfoData verificationInfoData = this.verificationInfoData;
        if (verificationInfoData == null) {
            advr.q("Could not create business info data object from invalid verifier info json: %s", advr.a(null));
            return false;
        }
        builder.setVerifierName(verificationInfoData.verifierName);
        builder.setVerifierId(getNamespacedVerifierId(str, this.verificationInfoData.verifierId));
        List<MediaEntryJsonData> mediaEntries = this.verificationInfoData.mediaListData.getMediaEntries();
        if (mediaEntries != null) {
            Iterator<MediaEntryJsonData> it = mediaEntries.iterator();
            while (it.hasNext()) {
                addMediaEntryProperty(builder, it.next());
            }
        }
        return true;
    }
}
