package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqcx implements apap {
    private final /* synthetic */ int a;

    public aqcx(int i) {
        this.a = i;
    }

    @Override // defpackage.apap
    public final /* synthetic */ Object a(int i) {
        int i2 = this.a;
        Object obj = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i != 0) {
                    switch (i) {
                        case 3:
                            obj = askr.GAIA_CALLER_ID;
                            break;
                        case 4:
                            obj = askr.TESTING;
                            break;
                        case 5:
                            obj = askr.EMAIL_CONTACTS;
                            break;
                        case 6:
                            obj = askr.TACHYGRAM;
                            break;
                        case 7:
                            obj = askr.MUTUAL_CJNS;
                            break;
                        case 8:
                            obj = askr.PUSH_ALERTS;
                            break;
                        case 9:
                            obj = askr.UNICORN;
                            break;
                        case 10:
                            obj = askr.GROUP_CALLING_TICKLE_WEB;
                            break;
                        case 11:
                            obj = askr.GUESTS_SUPPORTED;
                            break;
                        case 12:
                            obj = askr.SUSPECTED_SPAM_UI_SUPPORTED;
                            break;
                        case 13:
                            obj = askr.SELF_GROUP_CALL_TICKLE_SUPPORTED;
                            break;
                        case 14:
                            obj = askr.DUET_GROUP_CALL;
                            break;
                        case 15:
                            obj = askr.SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN;
                            break;
                        case 16:
                            obj = askr.SUPPORTS_24_HOUR_RCS_AUTH_TOKEN;
                            break;
                    }
                } else {
                    obj = askr.UNKNOWN;
                }
                if (obj == null) {
                    return askr.UNRECOGNIZED;
                }
                return obj;
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        obj = apqr.PROMPT_STYLE_FIRST_CARD_MODAL;
                    }
                } else {
                    obj = apqr.PROMPT_STYLE_FIRST_CARD_NON_MODAL;
                }
            } else {
                obj = apqr.PROMPT_STYLE_UNKNOWN;
            }
            if (obj == null) {
                return apqr.UNRECOGNIZED;
            }
            return obj;
        }
        if (i != 0) {
            if (i == 1) {
                obj = aqbd.SUGGESTION_TAG_BIRTHDAY;
            }
        } else {
            obj = aqbd.SUGGESTION_TAG_UNSPECIFIED;
        }
        if (obj == null) {
            return aqbd.UNRECOGNIZED;
        }
        return obj;
    }
}
