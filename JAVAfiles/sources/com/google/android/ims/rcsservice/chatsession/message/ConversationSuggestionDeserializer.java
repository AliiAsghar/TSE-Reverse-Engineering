package com.google.android.ims.rcsservice.chatsession.message;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.acyz;
import defpackage.aczd;
import defpackage.advp;
import defpackage.advr;
import defpackage.aooa;
import defpackage.aoob;
import defpackage.aooc;
import defpackage.aood;
import defpackage.aoof;
import defpackage.aoog;
import defpackage.aooi;
import java.lang.reflect.Type;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConversationSuggestionDeserializer implements aooc<ConversationSuggestion> {
    public static final acyz<Boolean> DESERIALIZE_FALLBACK_URLS = aczd.a(148616363);
    private static final advp TAG = new advp("ConversationSuggestionDeserializer");
    private String postBackData;
    private HashMap<String, String> properties;
    private int suggestionType;

    private void deserializeComposeTextDraftMessage(aoog aoogVar) {
        deserializeProperty(aoogVar, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, ConversationSuggestion.SUGGESTION_PROPERTY_COMPOSE_ACTION_DRAFT_TEXT);
    }

    private boolean deserializeCreateCalendarEvent(aoog aoogVar) {
        aoog d = aoogVar.d("createCalendarEvent");
        if (d == null) {
            advr.d(TAG, "Unable to deserialize create calendar event action: null event", new Object[0]);
            return false;
        }
        String deserializeProperty = deserializeProperty(d, "startTime", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
        String deserializeProperty2 = deserializeProperty(d, "endTime", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME);
        String deserializeProperty3 = deserializeProperty(d, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
        deserializeProperty(d, "description", "description");
        deserializeFallbackUrl(d);
        if (!TextUtils.isEmpty(deserializeProperty) && !TextUtils.isEmpty(deserializeProperty2) && !TextUtils.isEmpty(deserializeProperty3)) {
            return true;
        }
        advr.d(TAG, "Unable to deserialize create calendar action: invalid properties; startTime: %s, endTime: %s, title: %s", deserializeProperty, deserializeProperty2, deserializeProperty3);
        return false;
    }

    private boolean deserializeFallbackUrl(aoog aoogVar) {
        if (!((Boolean) DESERIALIZE_FALLBACK_URLS.a()).booleanValue()) {
            return false;
        }
        String deserializePropertyWithoutSaving = deserializePropertyWithoutSaving(aoogVar, ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
        if (TextUtils.isEmpty(deserializePropertyWithoutSaving)) {
            advr.d(TAG, "Unable to deserialize fallback url: empty url", new Object[0]);
            return false;
        }
        Uri parse = Uri.parse(deserializePropertyWithoutSaving);
        if (parse == null) {
            advr.d(TAG, "Unable to deserialize fallback url: null uri", new Object[0]);
            return false;
        }
        if (URLUtil.isNetworkUrl(deserializePropertyWithoutSaving) && !TextUtils.isEmpty(parse.getHost())) {
            advr.d(TAG, "Valid fallback url: %s", deserializePropertyWithoutSaving);
            savePropertyInPropertyMap(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL, deserializePropertyWithoutSaving);
            return true;
        }
        advr.d(TAG, "Unable to deserialize fallback url: invalid url: %s", deserializePropertyWithoutSaving);
        return false;
    }

    private boolean deserializeLocation(aoog aoogVar) {
        aoog d = aoogVar.d("location");
        if (d == null) {
            advr.d(TAG, "Unable to deserialize location action: null location", new Object[0]);
            return false;
        }
        String deserializeProperty = deserializeProperty(d, "latitude", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT);
        String deserializeProperty2 = deserializeProperty(d, "longitude", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        String deserializeProperty3 = deserializeProperty(d, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        deserializeProperty(d, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
        deserializeFallbackUrl(aoogVar);
        if ((!TextUtils.isEmpty(deserializeProperty) && !TextUtils.isEmpty(deserializeProperty2)) || !TextUtils.isEmpty(deserializeProperty3)) {
            return true;
        }
        advr.d(TAG, "Unable to deserialize location action: invalid properties; latitude: %s, longitude: %s, query: %s", deserializeProperty, deserializeProperty2, deserializeProperty3);
        return false;
    }

    private boolean deserializePhoneNumber(aoog aoogVar) {
        aoog d = aoogVar.d("dialPhoneNumber");
        if (d == null) {
            advr.d(TAG, "Unable to deserialize phone action: null dialPhoneNumber", new Object[0]);
            return false;
        }
        if (TextUtils.isEmpty(deserializeProperty(d, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER))) {
            advr.d(TAG, "Unable to deserialize phone action: empty phoneNumber", new Object[0]);
            return false;
        }
        deserializeFallbackUrl(d);
        return true;
    }

    private boolean deserializePhoneNumberForComposeAction(aoog aoogVar) {
        if (!TextUtils.isEmpty(deserializeProperty(aoogVar, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER))) {
            return true;
        }
        return false;
    }

    private String deserializeProperty(aoog aoogVar, String str, String str2) {
        String deserializePropertyWithoutSaving = deserializePropertyWithoutSaving(aoogVar, str);
        if (deserializePropertyWithoutSaving != null) {
            savePropertyInPropertyMap(str2, deserializePropertyWithoutSaving);
        }
        return deserializePropertyWithoutSaving;
    }

    private static String deserializePropertyWithoutSaving(aoog aoogVar, String str) {
        aood aoodVar;
        if (aoogVar == null || (aoodVar = (aood) aoogVar.a.get(str)) == null || (aoodVar instanceof aoof)) {
            return null;
        }
        if (aoodVar instanceof aoog) {
            return aoodVar.c().toString();
        }
        if (aoodVar instanceof aooa) {
            return aoodVar.b().toString();
        }
        return aoodVar.a();
    }

    private void deserializeSuggestedAction(aoog aoogVar) {
        int i;
        String deserializeDisplayText = deserializeDisplayText(aoogVar);
        String deserializePostBackData = deserializePostBackData(aoogVar);
        if (TextUtils.isEmpty(deserializeDisplayText)) {
            advr.d(TAG, "Unable to deserialize suggested action: empty display text", new Object[0]);
            return;
        }
        this.postBackData = deserializePostBackData;
        this.properties.put(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, deserializeDisplayText);
        aoog d = aoogVar.d("urlAction");
        if (d != null) {
            advr.l(TAG, " EnableWebviewStaticBridge flag is : %s", false);
            if (deserializeWebUri(d)) {
                this.suggestionType = 1;
                return;
            }
            return;
        }
        aoog d2 = aoogVar.d("dialerAction");
        if (d2 != null && deserializePhoneNumber(d2)) {
            i = 2;
        } else {
            aoog d3 = aoogVar.d("mapAction");
            if (d3 != null) {
                aoog d4 = d3.d("showLocation");
                if (d4 != null && deserializeLocation(d4)) {
                    i = 3;
                } else {
                    aoog d5 = d3.d("requestLocationPush");
                    if (d5 != null) {
                        deserializeFallbackUrl(d5);
                        this.suggestionType = 5;
                        return;
                    }
                }
            }
            aoog d6 = aoogVar.d("calendarAction");
            if (d6 != null && deserializeCreateCalendarEvent(d6)) {
                i = 4;
            } else {
                aoog d7 = aoogVar.d("composeAction");
                if (d7 != null) {
                    aoog d8 = d7.d("composeTextMessage");
                    if (d8 != null && deserializePhoneNumberForComposeAction(d8)) {
                        deserializeComposeTextDraftMessage(d8);
                        this.suggestionType = 8;
                        return;
                    }
                    aoog d9 = d7.d("composeRecordingMessage");
                    if (d9 != null && deserializePhoneNumberForComposeAction(d9)) {
                        this.suggestionType = determineComposeRecordingSuggestionType(d9);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.suggestionType = i;
    }

    private void deserializeSuggestedReply(aoog aoogVar) {
        String deserializeDisplayText = deserializeDisplayText(aoogVar);
        String deserializePostBackData = deserializePostBackData(aoogVar);
        if (TextUtils.isEmpty(deserializeDisplayText)) {
            advr.d(TAG, "Unable to deserialize suggested reply: empty display text", new Object[0]);
            return;
        }
        this.suggestionType = 0;
        this.postBackData = deserializePostBackData;
        this.properties.put(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, deserializeDisplayText);
    }

    private boolean deserializeWebUri(aoog aoogVar) {
        aoog d = aoogVar.d("openUrl");
        if (d == null) {
            advr.c("Unable to deserialize web action: null openUrl", new Object[0]);
            return false;
        }
        String deserializeProperty = deserializeProperty(d, "url", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (TextUtils.isEmpty(deserializeProperty)) {
            advr.c("Unable to deserialize web action: empty url", new Object[0]);
            return false;
        }
        Uri parse = Uri.parse(deserializeProperty);
        if (parse == null) {
            advr.c("Unable to deserialize web action: null uri", new Object[0]);
            return false;
        }
        if (URLUtil.isNetworkUrl(deserializeProperty)) {
            if (!TextUtils.isEmpty(parse.getHost())) {
                advr.c("Valid web url: %s", deserializeProperty);
                return true;
            }
        } else if (!TextUtils.isEmpty(parse.getScheme()) && !URLUtil.isContentUrl(deserializeProperty) && !URLUtil.isFileUrl(deserializeProperty)) {
            advr.c("Valid intent url: %s", deserializeProperty);
            return true;
        }
        advr.c("Unable to deserialize web action: invalid url: %s", deserializeProperty);
        return false;
    }

    private int determineComposeRecordingSuggestionType(aoog aoogVar) {
        String deserializeProperty = deserializeProperty(aoogVar, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ConversationSuggestion.SUGGESTION_PROPERTY_COMPOSE_ACTION_RECORDING_TYPE);
        if (deserializeProperty != null) {
            if (deserializeProperty.equals("AUDIO")) {
                return 9;
            }
            if (deserializeProperty.equals(VCardConstants.PARAM_TYPE_VIDEO)) {
                return 10;
            }
            return -1;
        }
        return -1;
    }

    private void savePropertyInPropertyMap(String str, String str2) {
        HashMap<String, String> hashMap = this.properties;
        if (hashMap != null) {
            hashMap.put(str, str2);
        }
    }

    private boolean validateAndDeserializeOpenUrlAction(aoog aoogVar) {
        char c;
        aoog d = aoogVar.d("openUrl");
        if (d == null) {
            advr.d(TAG, "Unable to deserialize web action: null openUrl", new Object[0]);
            return false;
        }
        String deserializeProperty = deserializeProperty(d, "url", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (TextUtils.isEmpty(deserializeProperty)) {
            advr.d(TAG, "Unable to deserialize web action: empty url", new Object[0]);
            return false;
        }
        Uri parse = Uri.parse(deserializeProperty);
        if (parse == null) {
            advr.d(TAG, "Unable to deserialize web action: null uri", new Object[0]);
            return false;
        }
        if (URLUtil.isNetworkUrl(deserializeProperty)) {
            if (TextUtils.isEmpty(parse.getHost())) {
                advr.d(TAG, "Invalid empty web url host: %s", deserializeProperty);
                return false;
            }
        } else if (!TextUtils.isEmpty(parse.getScheme())) {
            if (URLUtil.isContentUrl(deserializeProperty) || URLUtil.isFileUrl(deserializeProperty)) {
                advr.d(TAG, "Invalid file or content url: %s", deserializeProperty);
                return false;
            }
        } else {
            advr.d(TAG, "Invalid empty web url scheme: %s", deserializeProperty);
            return false;
        }
        String deserializeProperty2 = deserializeProperty(d, "application", ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_APPLICATION);
        if (TextUtils.isEmpty(deserializeProperty2)) {
            advr.d(TAG, "Unable to deserialize open url action application: empty application %s", deserializeProperty2);
            return false;
        }
        int hashCode = deserializeProperty2.hashCode();
        if (hashCode != 150940456) {
            if (hashCode == 1224424441 && deserializeProperty2.equals("webview")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (deserializeProperty2.equals("browser")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                advr.d(TAG, "Unable to deserialize open url action application: invalid application %s", deserializeProperty2);
                return false;
            }
            this.suggestionType = 1;
        } else {
            this.suggestionType = 11;
        }
        String deserializeProperty3 = deserializeProperty(d, "viewMode", ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_VIEW_MODE);
        if (!TextUtils.isEmpty(deserializeProperty3) && !deserializeProperty3.equals("full") && !deserializeProperty3.equals("half") && !deserializeProperty3.equals("tall")) {
            advr.d(TAG, "Unable to deserialize open url action view mode: invalid view mode %s", deserializeProperty3);
        }
        advr.d(TAG, "Able to deserialize open url action:  url: %s,  application type: %s,  optional view mode: %s,  optional description: %s", deserializeProperty, deserializeProperty2, deserializeProperty3, deserializeProperty(d, "description", ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_DESCRIPTION));
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.aooc
    public ConversationSuggestion deserialize(aood aoodVar, Type type, aoob aoobVar) {
        aoog c = aoodVar.c();
        this.suggestionType = -1;
        this.postBackData = null;
        this.properties = new HashMap<>();
        aoog d = c.d("reply");
        if (d != null) {
            deserializeSuggestedReply(d);
        } else {
            aoog d2 = c.d(GroupManagementRequest.ACTION_TAG);
            if (d2 != null) {
                deserializeSuggestedAction(d2);
            }
        }
        int i = this.suggestionType;
        if (i != -1) {
            return ConversationSuggestion.createRbmConversationSuggestion(i, this.properties, this.postBackData, (String) null, (String) null, (String) null);
        }
        advr.q("Ignoring malformed suggestion.", new Object[0]);
        return null;
    }

    public String deserializeDisplayText(aoog aoogVar) {
        return deserializeProperty(aoogVar, ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT, ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
    }

    public String deserializePostBackData(aoog aoogVar) {
        aooi aooiVar;
        aoog d = aoogVar.d("postback");
        if (d != null && (aooiVar = (aooi) d.a.get(GroupManagementRequest.DATA_TAG)) != null && (aooiVar.a instanceof String) && !TextUtils.isEmpty(aooiVar.a())) {
            return aooiVar.a();
        }
        return null;
    }
}
