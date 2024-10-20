package com.google.android.ims.businessinfo.json;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.acyu;
import defpackage.acyz;
import defpackage.acza;
import defpackage.aczd;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alog;
import defpackage.alsx;
import defpackage.aoop;
import defpackage.aoor;
import defpackage.yjr;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessInfoJsonData {
    protected static final String MAILTO_PREFIX = "mailto:";
    protected static final String SCHEME_SMS = "sms:";

    @aoor(a = "comm-addr")
    @aoop
    CommunicationAddressesData communicationAddressesData;

    @aoor(a = "media-list")
    @aoop
    MediaListData mediaListData;

    @aoor(a = "web-resources")
    @aoop
    WebResourceData webResourceData;
    private static final acyz<Boolean> ENABLE_FORMATTABLE_PHONE_NUMBERS_REGEX = aczd.a(152440489);
    private static final alhr<Pattern> formattablePhoneNumbers = albo.D(new alhr() { // from class: com.google.android.ims.businessinfo.json.BusinessInfoJsonData$$ExternalSyntheticLambda0
        @Override // defpackage.alhr
        public final Object get() {
            Pattern compile;
            compile = Pattern.compile((String) ((acza) acyu.a().b.j).a());
            return compile;
        }
    });

    /* compiled from: PG */
    /* loaded from: classes.dex */
    private static class CommunicationAddressesData {

        @aoor(a = "tel")
        @aoop
        private TelephoneData telephoneData;

        @aoor(a = "uri-entry")
        @aoop
        private List<UriEntryData> uriEntries;

        private CommunicationAddressesData() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    private static class MediaListData {

        @aoor(a = "media-entry")
        @aoop
        private List<MediaEntryJsonData> mediaEntries;

        private MediaListData() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    static class TelephoneData {

        @aoor(a = "custom-label")
        @aoop
        private String customLabel;

        @aoor(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
        @aoop
        private String label;

        @aoor(a = "tel-nb")
        @aoop
        private TelephoneNumber telephoneNumber;

        @aoor(a = "tel-type")
        @aoop
        private String type;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class TelephoneNumber {

            @aoor(a = "tel-str")
            @aoop
            private String telephoneString;

            private TelephoneNumber() {
            }
        }

        TelephoneData() {
        }

        public String getCustomLabel() {
            return this.customLabel;
        }

        String getLabel() {
            return this.label;
        }

        public String getTelephoneString() {
            TelephoneNumber telephoneNumber = this.telephoneNumber;
            if (telephoneNumber != null && telephoneNumber.telephoneString != null) {
                return this.telephoneNumber.telephoneString;
            }
            return "";
        }

        public String getTelephoneType() {
            return this.type;
        }

        public String toString() {
            return String.format("tel-str: %s tel-type: %s label: %s custom-label: %s", getTelephoneString(), this.type, this.label, this.customLabel);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    protected static class UriEntryData {

        @aoor(a = "custom-label")
        @aoop
        private String customLabel;

        @aoor(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
        @aoop
        private String label;

        @aoor(a = "addr-uri-type")
        @aoop
        private String type;

        @aoor(a = "addr-uri")
        @aoop
        private String uri;

        protected UriEntryData() {
        }

        public String getCustomLabel() {
            return this.customLabel;
        }

        public String getLabel() {
            return this.label;
        }

        public String getType() {
            return this.type;
        }

        public String getUri() {
            return this.uri;
        }

        public String toString() {
            return String.format("addr-uri-type: %s addr-uri: %s label: %s custom-label: %s", this.type, this.uri, this.label, this.customLabel);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    protected static class WebEntryData {

        @aoor(a = "custom-label")
        @aoop
        private String customLabel;

        @aoor(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
        @aoop
        private String label;

        @aoor(a = "url")
        @aoop
        private String url;

        protected WebEntryData() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public String getCustomLabel() {
            return this.customLabel;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public String getLabel() {
            return this.label;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public String getUrl() {
            return this.url;
        }

        public String toString() {
            return String.format("url: %s label: %s custom-label: %s", this.url, this.label, this.customLabel);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    private static class WebResourceData {

        @aoor(a = "web-entry")
        @aoop
        private List<WebEntryData> webEntries;

        private WebResourceData() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String formatPhoneNumberForHeader(String str, yjr yjrVar) {
        if (((Boolean) ENABLE_FORMATTABLE_PHONE_NUMBERS_REGEX.a()).booleanValue() && !formattablePhoneNumbers.get().matcher(str).matches()) {
            if (str.startsWith("tel:")) {
                return str.substring(4);
            }
            return str;
        }
        return yjrVar.j(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String removeSmsPrefix(String str) {
        return albo.ag(str).replaceFirst(SCHEME_SMS, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<MediaEntryJsonData> getMediaEntries() {
        MediaListData mediaListData = this.mediaListData;
        if (mediaListData != null && mediaListData.mediaEntries != null) {
            return this.mediaListData.mediaEntries;
        }
        int i = alog.d;
        return alsx.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TelephoneData getTelephoneData() {
        CommunicationAddressesData communicationAddressesData = this.communicationAddressesData;
        if (communicationAddressesData != null) {
            return communicationAddressesData.telephoneData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<UriEntryData> getUriEntries() {
        CommunicationAddressesData communicationAddressesData = this.communicationAddressesData;
        if (communicationAddressesData != null && communicationAddressesData.uriEntries != null) {
            return this.communicationAddressesData.uriEntries;
        }
        int i = alog.d;
        return alsx.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<WebEntryData> getWebEntries() {
        WebResourceData webResourceData = this.webResourceData;
        if (webResourceData != null && webResourceData.webEntries != null) {
            return this.webResourceData.webEntries;
        }
        int i = alog.d;
        return alsx.a;
    }
}
