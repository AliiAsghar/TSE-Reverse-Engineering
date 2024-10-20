package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryj {
    public static final Set a;
    public static final Set b;

    static {
        aqil.r(new aqbc[]{aqbc.CALENDAR, aqbc.DUO_CALL, aqbc.REMINDER, aqbc.STARRING});
        a = aqil.r(new aqbc[]{aqbc.COPY_OTP, aqbc.SCRIPTED_REPLY});
        b = aqil.r(new aqbc[]{aqbc.COPY_OTP, aqbc.CALENDAR});
    }

    public static final aqbc a(aqbc aqbcVar) {
        aqbcVar.getClass();
        switch (aqbcVar.ordinal()) {
            case 0:
            case 8:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            case 26:
            case 27:
            case 28:
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return aqbc.UNKNOWN_SUGGESTION_TYPE;
            case 1:
            case 2:
            case 15:
            case 31:
                return aqbc.CATEGORY_TEXT;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
            case 22:
            case 23:
            case 25:
            case 30:
            case 32:
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
            case 39:
                return aqbc.CATEGORY_ACTION;
            case 12:
            case 16:
                return aqbc.CATEGORY_EMOTIVE;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return aqbc.BARD;
            default:
                throw new armm();
        }
    }

    public static final aqbc b(SuggestionData suggestionData) {
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData;
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) suggestionData;
        } else {
            smartSuggestionItemSuggestionData = null;
        }
        if (smartSuggestionItemSuggestionData != null) {
            return smartSuggestionItemSuggestionData.s();
        }
        return aqbc.UNKNOWN_SUGGESTION_TYPE;
    }

    public static final boolean c(SuggestionData suggestionData) {
        if (a(b(suggestionData)) == aqbc.CATEGORY_TEXT) {
            return true;
        }
        return false;
    }
}
