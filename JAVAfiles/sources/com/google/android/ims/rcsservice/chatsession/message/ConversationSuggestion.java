package com.google.android.ims.rcsservice.chatsession.message;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.aooq;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
@aooq(a = ConversationSuggestionDeserializer.class)
/* loaded from: classes.dex */
public class ConversationSuggestion implements Parcelable {
    public static final Parcelable.Creator<ConversationSuggestion> CREATOR = new Parcelable.Creator<ConversationSuggestion>() { // from class: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationSuggestion createFromParcel(Parcel parcel) {
            return new ConversationSuggestion(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationSuggestion[] newArray(int i) {
            return new ConversationSuggestion[i];
        }
    };
    private static final String PROPERTIES_SEPARATOR = "__;__";
    private static final String PROPERTY_KEY_VALUE_SEPARATOR = "__=__";
    public static final String SUGGESTION_PROPERTY_CALENDAR_DESCRIPTION = "description";
    public static final String SUGGESTION_PROPERTY_CALENDAR_END_TIME = "end";
    public static final String SUGGESTION_PROPERTY_CALENDAR_START_TIME = "start";
    public static final String SUGGESTION_PROPERTY_CALENDAR_TITLE = "title";
    public static final String SUGGESTION_PROPERTY_COMPOSE_ACTION_DRAFT_TEXT = "composeActionDraftText";
    public static final String SUGGESTION_PROPERTY_COMPOSE_ACTION_RECORDING_TYPE = "composeActionRecordingType";
    public static final String SUGGESTION_PROPERTY_DISPLAY_TEXT = "displayText";
    public static final String SUGGESTION_PROPERTY_FALLBACK_URL = "fallbackUrl";
    public static final String SUGGESTION_PROPERTY_MAP_LABEL = "label";
    public static final String SUGGESTION_PROPERTY_MAP_LAT = "lat";
    public static final String SUGGESTION_PROPERTY_MAP_LONG = "long";
    public static final String SUGGESTION_PROPERTY_MAP_QUERY = "query";
    public static final String SUGGESTION_PROPERTY_OPEN_URL_APPLICATION = "openUrlApplication";
    public static final String SUGGESTION_PROPERTY_OPEN_URL_DESCRIPTION = "openUrlDescription";
    public static final String SUGGESTION_PROPERTY_OPEN_URL_VIEW_MODE = "openUrlViewMode";
    public static final String SUGGESTION_PROPERTY_PHONE_NUMBER = "phoneNumber";
    public static final String SUGGESTION_PROPERTY_TEXT = "text";
    public static final String SUGGESTION_PROPERTY_WEB_URI = "uri";
    public static final int SUGGESTION_TYPE_CALENDAR = 4;
    public static final int SUGGESTION_TYPE_COMPOSE_AUDIO = 9;
    public static final int SUGGESTION_TYPE_COMPOSE_TEXT = 8;
    public static final int SUGGESTION_TYPE_COMPOSE_VIDEO = 10;
    public static final int SUGGESTION_TYPE_INVALID = -1;
    public static final int SUGGESTION_TYPE_MAP = 3;
    public static final int SUGGESTION_TYPE_PHONE = 2;
    public static final int SUGGESTION_TYPE_REPLY = 0;
    public static final int SUGGESTION_TYPE_SHARE_LOCATION = 5;
    public static final int SUGGESTION_TYPE_WEB = 1;
    public static final int SUGGESTION_TYPE_WEBVIEW = 11;
    private final String postBackData;
    private final String postBackEncoding;
    private final HashMap<String, String> properties;
    private String rcsMessageId;
    private final int suggestionType;
    private String targetRcsMessageId;

    private ConversationSuggestion(int i, HashMap<String, String> hashMap, String str, String str2, String str3, String str4) {
        this.suggestionType = i;
        this.properties = hashMap;
        this.postBackData = str;
        this.postBackEncoding = str2;
        this.rcsMessageId = str3;
        this.targetRcsMessageId = str4;
    }

    public static ConversationSuggestion createRbmConversationSuggestion(int i, HashMap<String, String> hashMap, String str, String str2, String str3, String str4) {
        return new ConversationSuggestion(i, hashMap, str, str2, str3, str4);
    }

    private static HashMap<String, String> deserializeProperties(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (str != null) {
            for (String str2 : str.split(PROPERTIES_SEPARATOR)) {
                if (!TextUtils.isEmpty(str2)) {
                    String[] split = str2.split(PROPERTY_KEY_VALUE_SEPARATOR);
                    if (split.length == 2) {
                        String str3 = split[0];
                        String str4 = split[1];
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                            hashMap.put(str3, str4);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public boolean canUseFallbackUrl() {
        int i = this.suggestionType;
        if (i != 2 && i != 3 && i != 5 && i != 4) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPostBackData() {
        return this.postBackData;
    }

    public String getPostBackEncoding() {
        return this.postBackEncoding;
    }

    public String getPropertyValue(String str) {
        HashMap<String, String> hashMap;
        if ((SUGGESTION_PROPERTY_FALLBACK_URL.equals(str) && !canUseFallbackUrl()) || (hashMap = this.properties) == null) {
            return null;
        }
        return hashMap.get(str);
    }

    public String getRcsMessageId() {
        return this.rcsMessageId;
    }

    public int getSuggestionType() {
        return this.suggestionType;
    }

    public String getTargetRcsMessageId() {
        return this.targetRcsMessageId;
    }

    public boolean hasFallbackUrl() {
        if (canUseFallbackUrl() && !TextUtils.isEmpty(getPropertyValue(SUGGESTION_PROPERTY_FALLBACK_URL))) {
            return true;
        }
        return false;
    }

    public String serializeProperties() {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> hashMap = this.properties;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(PROPERTY_KEY_VALUE_SEPARATOR);
                sb.append(this.properties.get(str));
                sb.append(PROPERTIES_SEPARATOR);
            }
        }
        return sb.toString();
    }

    public void setRcsMessageId(String str) {
        this.rcsMessageId = str;
    }

    public void setTargetRcsMessageId(String str) {
        this.targetRcsMessageId = str;
    }

    public String toString() {
        String propertyValue = getPropertyValue(SUGGESTION_PROPERTY_TEXT);
        if (TextUtils.isEmpty(propertyValue)) {
            propertyValue = getPropertyValue(SUGGESTION_PROPERTY_DISPLAY_TEXT);
        }
        if (true == TextUtils.isEmpty(propertyValue)) {
            propertyValue = "N/A";
        }
        return String.format(Locale.US, "{type=%d, text=%s, rcsMsgId=%s, targetRcsMsgId=%s}", Integer.valueOf(this.suggestionType), propertyValue, this.rcsMessageId, this.targetRcsMessageId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.suggestionType);
        parcel.writeSerializable(this.properties);
        parcel.writeString(this.postBackData);
        parcel.writeString(this.postBackEncoding);
        parcel.writeString(this.rcsMessageId);
        parcel.writeString(this.targetRcsMessageId);
        parcel.writeString(null);
        parcel.writeString(null);
    }

    protected ConversationSuggestion(Parcel parcel) {
        this.suggestionType = parcel.readInt();
        this.properties = (HashMap) parcel.readSerializable();
        this.postBackData = parcel.readString();
        this.postBackEncoding = parcel.readString();
        this.rcsMessageId = parcel.readString();
        this.targetRcsMessageId = parcel.readString();
        parcel.readString();
        parcel.readString();
    }

    public static ConversationSuggestion createRbmConversationSuggestion(int i, String str, String str2, String str3, String str4, String str5) {
        return new ConversationSuggestion(i, deserializeProperties(str), str2, str3, str4, str5);
    }
}
