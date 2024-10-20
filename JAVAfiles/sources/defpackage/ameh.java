package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ameh implements apam {
    private final /* synthetic */ int v;
    static final apam u = new ameh(20);
    public static final apam t = new ameh(19);
    static final apam s = new ameh(18);
    static final apam r = new ameh(17);
    static final apam q = new ameh(16);
    static final apam p = new ameh(15);
    static final apam o = new ameh(14);
    static final apam n = new ameh(13);
    static final apam m = new ameh(12);
    static final apam l = new ameh(11);
    static final apam k = new ameh(10);
    static final apam j = new ameh(9);
    static final apam i = new ameh(8);
    static final apam h = new ameh(7);
    static final apam g = new ameh(6);
    static final apam f = new ameh(5);
    static final apam e = new ameh(4);
    static final apam d = new ameh(3);
    static final apam c = new ameh(2);
    static final apam b = new ameh(1);
    static final apam a = new ameh(0);

    private ameh(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.aX(i2);
            case 1:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        apakVar = ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_LOCATION;
                                    }
                                } else {
                                    apakVar = ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_UNREDACTED_PHONE_NUMBERS;
                                }
                            } else {
                                apakVar = ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_SELF_PHONE_NUMBER;
                            }
                        } else {
                            apakVar = ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_PROBLEMATIC_MESSAGES_ADVANCED_INFO;
                        }
                    } else {
                        apakVar = ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_MESSAGES_STATUS_HISTORY;
                    }
                } else {
                    apakVar = ameg.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 2:
                switch (i2) {
                    case 0:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_UNKNOWN;
                        break;
                    case 1:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_GENERIC;
                        break;
                    case 2:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_SEND;
                        break;
                    case 3:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_RECEIVE;
                        break;
                    case 4:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_DOWNLOAD;
                        break;
                    case 5:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_STUCK_IN_SENDING;
                        break;
                    case 6:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_DUPLICATED;
                        break;
                    case 7:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_OUT_OF_ORDER;
                        break;
                    case 8:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_IN_WRONG_CONVERSATION;
                        break;
                    case 9:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_RCS_CONNECTIVITY_LOST;
                        break;
                    case 10:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_RCS_PROVISIONING_FAIL;
                        break;
                    case 11:
                        apakVar = amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_LOST;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = amej.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_REJECTED;
                            }
                        } else {
                            apakVar = amej.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_CONSENTED;
                        }
                    } else {
                        apakVar = amej.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_NOT_REQUIRED;
                    }
                } else {
                    apakVar = amej.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 4:
                if (amek.b(i2) == null) {
                    return false;
                }
                return true;
            case 5:
                return a.aY(i2);
            case 6:
                switch (i2) {
                    case 0:
                        apakVar = amen.UNKNOWN_BUGLE_OPEN_CAUSE;
                        break;
                    case 1:
                        apakVar = amen.VIA_LAUNCH_ICON;
                        break;
                    case 2:
                        apakVar = amen.VIA_NOTIFICATION;
                        break;
                    case 3:
                        apakVar = amen.VIA_SHARING_INTENT;
                        break;
                    case 4:
                        apakVar = amen.VIA_LOCKSCREEN;
                        break;
                    case 5:
                        apakVar = amen.VIA_WIDGET;
                        break;
                    case 6:
                        apakVar = amen.VIA_OTHER_APPS_WITHOUT_SHARING_DATA;
                        break;
                    case 7:
                        apakVar = amen.VIA_DEFAULT;
                        break;
                    case 8:
                        apakVar = amen.VIA_SHORTCUT;
                        break;
                    case 9:
                        apakVar = amen.VIA_TRAMPOLINE;
                        break;
                    case 10:
                        apakVar = amen.VIA_ASSISTANT_APP_CONTROL;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 7:
                return a.aW(i2);
            case 8:
                return a.aW(i2);
            case 9:
                return a.be(i2);
            case 10:
                return a.bb(i2);
            case 11:
                return a.be(i2);
            case 12:
                return a.bi(i2);
            case 13:
                return a.bf(i2);
            case 14:
                return a.aW(i2);
            case 15:
                return a.aW(i2);
            case 16:
                return a.aW(i2);
            case 17:
                if (amfd.b(i2) == null) {
                    return false;
                }
                return true;
            case 18:
                return a.aY(i2);
            case 19:
                if (amfe.b(i2) == null) {
                    return false;
                }
                return true;
            default:
                return a.aW(i2);
        }
    }
}
