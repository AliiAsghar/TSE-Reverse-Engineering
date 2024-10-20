package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qex implements apap {
    private final /* synthetic */ int a;

    public qex(int i) {
        this.a = i;
    }

    @Override // defpackage.apap
    public final /* synthetic */ Object a(int i) {
        Object obj = null;
        switch (this.a) {
            case 0:
                qes b = qes.b(i);
                if (b == null) {
                    return qes.UNKNOWN_TYPE;
                }
                return b;
            case 1:
                mez b2 = mez.b(i);
                if (b2 == null) {
                    return mez.TRANSPORT_OTHER;
                }
                return b2;
            case 2:
                qes b3 = qes.b(i);
                if (b3 == null) {
                    return qes.UNKNOWN_TYPE;
                }
                return b3;
            case 3:
                qes b4 = qes.b(i);
                if (b4 == null) {
                    return qes.UNKNOWN_TYPE;
                }
                return b4;
            case 4:
                qfn b5 = qfn.b(i);
                if (b5 == null) {
                    return qfn.UNKNOWN_REQUESTED_REPORT;
                }
                return b5;
            case 5:
                uas b6 = uas.b(i);
                if (b6 == null) {
                    return uas.UNKNOWN;
                }
                return b6;
            case 6:
                wbp b7 = wbp.b(i);
                if (b7 == null) {
                    return wbp.DISPOSITION_NOTIFICATION_TYPE_UNKNOWN;
                }
                return b7;
            case 7:
                wbp b8 = wbp.b(i);
                if (b8 == null) {
                    return wbp.DISPOSITION_NOTIFICATION_TYPE_UNKNOWN;
                }
                return b8;
            case 8:
                aqbc b9 = aqbc.b(i);
                if (b9 == null) {
                    return aqbc.UNKNOWN_SUGGESTION_TYPE;
                }
                return b9;
            case 9:
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        obj = amzh.LIGHTER;
                                    }
                                } else {
                                    obj = amzh.RBM;
                                }
                            } else {
                                obj = amzh.RCS;
                            }
                        } else {
                            obj = amzh.MMS;
                        }
                    } else {
                        obj = amzh.SMS;
                    }
                } else {
                    obj = amzh.UNKNOWN_CONVERSATION_PROTOCOL;
                }
                if (obj == null) {
                    return amzh.UNRECOGNIZED;
                }
                return obj;
            case 10:
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        obj = amzr.BOT;
                                    }
                                } else {
                                    obj = amzr.EMAIL;
                                }
                            } else {
                                obj = amzr.ALPHA_CODE;
                            }
                        } else {
                            obj = amzr.SHORT_CODE;
                        }
                    } else {
                        obj = amzr.LONG_CODE;
                    }
                } else {
                    obj = amzr.UNKNOWN_DESTINATION_TYPE;
                }
                if (obj == null) {
                    return amzr.UNRECOGNIZED;
                }
                return obj;
            case 11:
                aocu b10 = aocu.b(i);
                if (b10 == null) {
                    return aocu.UNKNOWN;
                }
                return b10;
            case 12:
                aocu b11 = aocu.b(i);
                if (b11 == null) {
                    return aocu.UNKNOWN;
                }
                return b11;
            case 13:
                switch (i) {
                    case 0:
                        obj = aley.OS;
                        break;
                    case 1:
                        obj = aley.ARCH;
                        break;
                    case 2:
                        obj = aley.BOARD_NAME;
                        break;
                    case 3:
                        obj = aley.PRODUCT_NAME;
                        break;
                    case 4:
                        obj = aley.SYSTEM_VERSION;
                        break;
                    case 5:
                        obj = aley.CHANNEL;
                        break;
                    case 7:
                        obj = aley.BUILD_TYPE;
                        break;
                    case 9:
                        obj = aley.EXPERIMENT_IDS;
                        break;
                    case 10:
                        obj = aley.APP_VERSION;
                        break;
                }
                if (obj == null) {
                    return aley.UNRECOGNIZED;
                }
                return obj;
            case 14:
                amed b12 = amed.b(i);
                if (b12 == null) {
                    return amed.TRANSPORT_OTHER;
                }
                return b12;
            case 15:
                amjy b13 = amjy.b(i);
                if (b13 == null) {
                    return amjy.UNKNOWN_REASON;
                }
                return b13;
            case 16:
                amss b14 = amss.b(i);
                if (b14 == null) {
                    return amss.UNKNOWN_REASON;
                }
                return b14;
            case 17:
                switch (i) {
                    case 0:
                        obj = anhg.UNKNOWN_API_FEATURE;
                        break;
                    case 1:
                        obj = anhg.CALL_INTENT_API_CALL_PHONE_NUMBER;
                        break;
                    case 2:
                        obj = anhg.CALL_INTENT_API_TARGETED_CALL;
                        break;
                    case 3:
                        obj = anhg.INTENT_API_OPEN_SETTINGS;
                        break;
                    case 4:
                        obj = anhg.INTENT_API_OPEN_BLOCKED_CONTACTS;
                        break;
                    case 5:
                        obj = anhg.CALL_INTENT_API_SELF_CALL;
                        break;
                    case 6:
                        obj = anhg.SERVICE_API_GET_REGISTRATION_INFO;
                        break;
                    case 7:
                        obj = anhg.SERVICE_API_GET_REGISTERED_ID_TYPE;
                        break;
                    case 8:
                        obj = anhg.DUO_KIT_REQUESTS;
                        break;
                    case 9:
                        obj = anhg.MEET_API_REQUESTS;
                        break;
                }
                if (obj == null) {
                    return anhg.UNRECOGNIZED;
                }
                return obj;
            case 18:
                aoug b15 = aoug.b(i);
                if (b15 == null) {
                    return aoug.UNRECOGNIZED;
                }
                return b15;
            case 19:
                aoug b16 = aoug.b(i);
                if (b16 == null) {
                    return aoug.UNRECOGNIZED;
                }
                return b16;
            default:
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            obj = apqo.COMPLETION_STYLE_TOAST;
                        }
                    } else {
                        obj = apqo.COMPLETION_STYLE_CARD;
                    }
                } else {
                    obj = apqo.COMPLETION_STYLE_UNKNOWN;
                }
                if (obj == null) {
                    return apqo.UNRECOGNIZED;
                }
                return obj;
        }
    }
}
