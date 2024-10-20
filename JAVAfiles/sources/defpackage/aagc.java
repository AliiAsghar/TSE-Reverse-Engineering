package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagc {
    public static final xze a = xze.g("Bugle", "SuggestionIntentFactory");
    public final xve b;
    private final Optional c;

    public aagc(xve xveVar, Optional optional) {
        this.b = xveVar;
        this.c = optional;
    }

    public static final Intent d(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 3) {
            xyo c = a.c();
            c.H("suggestion is not map type, cannot create map intent");
            c.M("suggestion", rbmSuggestionData);
            c.q();
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        try {
            if (!TextUtils.isEmpty(propertyValue)) {
                sb.append("geo:0,0?q=");
                sb.append(ytd.j(propertyValue));
            } else {
                String propertyValue2 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT);
                String propertyValue3 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
                if (!TextUtils.isEmpty(propertyValue2) && !TextUtils.isEmpty(propertyValue3)) {
                    String j = ytd.j(propertyValue2);
                    String j2 = ytd.j(propertyValue3);
                    String propertyValue4 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                    if (TextUtils.isEmpty(propertyValue4)) {
                        sb.append(String.format("geo:%s,%s", j, j2));
                    } else {
                        sb.append(String.format("geo:0,0?q=%s,%s(%s)", j, j2, ytd.j(propertyValue4)));
                    }
                }
                xyo c2 = a.c();
                c2.H("suggestion type map missing lat/lng, cannot create intent");
                c2.L(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT, propertyValue2);
                c2.L("lng", propertyValue3);
                c2.q();
                return null;
            }
            return new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString()));
        } catch (UnsupportedEncodingException unused) {
            xyo a2 = a.a();
            a2.H("Unsupported encoding exception for suggested map action.");
            a2.M("suggestion", rbmSuggestionData);
            a2.q();
            return null;
        }
    }

    public final Intent a(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 4) {
            xyo c = a.c();
            c.H("suggestion is not calendar type, cannot create calendar intent");
            c.M("suggestion", rbmSuggestionData);
            c.q();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
        String propertyValue2 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME);
        if (propertyValue != null && propertyValue2 != null) {
            try {
                advi.b(propertyValue);
                advi.b(propertyValue2);
                return (Intent) this.c.map(new zvp(conversationSuggestion, 9)).orElse(null);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public final Intent b(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 2) {
            xyo c = a.c();
            c.H("suggestion is not phone type, cannot create call intent");
            c.M("suggestion", rbmSuggestionData);
            c.q();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER);
        if (TextUtils.isEmpty(propertyValue)) {
            xyo c2 = a.c();
            c2.H("suggestion type phone has empty number. Cannot create call intent.");
            c2.M("suggestion", rbmSuggestionData);
            c2.q();
            return null;
        }
        return this.b.a(propertyValue);
    }

    public final Intent c(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 1) {
            xyo c = a.c();
            c.H("suggestion is not web type, cannot create web intent");
            c.M("suggestion", rbmSuggestionData);
            c.q();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (TextUtils.isEmpty(propertyValue)) {
            xyo c2 = a.c();
            c2.H("suggestion type web has empty uri. Cannot create web intent.");
            c2.M("suggestion", rbmSuggestionData);
            c2.q();
            return null;
        }
        return this.b.b(propertyValue);
    }
}
