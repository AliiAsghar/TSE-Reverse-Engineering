package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amid implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amid(20);
    static final apam t = new amid(19);
    static final apam s = new amid(18);
    static final apam r = new amid(17);
    static final apam q = new amid(16);
    static final apam p = new amid(15);
    static final apam o = new amid(14);
    static final apam n = new amid(13);
    static final apam m = new amid(12);
    static final apam l = new amid(11);
    static final apam k = new amid(10);
    static final apam j = new amid(9);
    static final apam i = new amid(8);
    static final apam h = new amid(7);
    static final apam g = new amid(6);
    static final apam f = new amid(5);
    static final apam e = new amid(4);
    static final apam d = new amid(3);
    static final apam c = new amid(2);
    static final apam b = new amid(1);
    static final apam a = new amid(0);

    private amid(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.be(i2);
            case 1:
                return a.aY(i2);
            case 2:
                return a.aW(i2);
            case 3:
                if (amii.b(i2) == null) {
                    return false;
                }
                return true;
            case 4:
                return a.aW(i2);
            case 5:
                return a.aW(i2);
            case 6:
                if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                    return false;
                }
                return true;
            case 7:
                return a.aY(i2);
            case 8:
                return a.aW(i2);
            case 9:
                return a.aW(i2);
            case 10:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = amin.ENGAGEMENT_LEVEL_ACTIVE;
                            }
                        } else {
                            apakVar = amin.ENGAGEMENT_LEVEL_PASSIVE;
                        }
                    } else {
                        apakVar = amin.ENGAGEMENT_LEVEL_INACTIVE;
                    }
                } else {
                    apakVar = amin.UNKNOWN_ENGAGEMENT_LEVEL;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 11:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = amio.EVENT_AGE_MORE_THAN_28_DAYS;
                                }
                            } else {
                                apakVar = amio.EVENT_AGE_7_TO_28_DAYS;
                            }
                        } else {
                            apakVar = amio.EVENT_AGE_1_TO_7_DAYS;
                        }
                    } else {
                        apakVar = amio.EVENT_AGE_WITHIN_1_DAY;
                    }
                } else {
                    apakVar = amio.UNKNOWN_EVENT_AGE;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 12:
                if (akec.aH(i2) == 0) {
                    return false;
                }
                return true;
            case 13:
                switch (i2) {
                    case 0:
                        apakVar = amip.UNKNOWN_HAPPINESS_TRACKING_MODE;
                        break;
                    case 1:
                        apakVar = amip.HAPPINESS_TRACKING_MODE_SURVEY;
                        break;
                    case 2:
                        apakVar = amip.HAPPINESS_TRACKING_MODE_PLAY_STORE_RATING;
                        break;
                    case 3:
                        apakVar = amip.HAPPINESS_TRACKING_MODE_HIDDEN;
                        break;
                    case 4:
                        apakVar = amip.SMART_REPLY_HAPPINESS_TRACKING_SURVEY;
                        break;
                    case 5:
                        apakVar = amip.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
                        break;
                    case 6:
                        apakVar = amip.ORGANIZE_HAPPINESS_TRACKING_SURVEY;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 14:
                return a.aX(i2);
            case 15:
                return a.aY(i2);
            case 16:
                return a.bf(i2);
            case 17:
                if (akec.aG(i2) == 0) {
                    return false;
                }
                return true;
            case 18:
                return a.aY(i2);
            case 19:
                return a.aW(i2);
            default:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        apakVar = amir.NOT_VERIFIABLE;
                                    }
                                } else {
                                    apakVar = amir.NOT_YET_VERIFIED;
                                }
                            } else {
                                apakVar = amir.NA;
                            }
                        } else {
                            apakVar = amir.UNVERIFIED;
                        }
                    } else {
                        apakVar = amir.VERIFIED;
                    }
                } else {
                    apakVar = amir.UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
        }
    }
}
