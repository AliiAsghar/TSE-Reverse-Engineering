package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amln implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amln(20);
    static final apam t = new amln(19);
    static final apam s = new amln(18);
    static final apam r = new amln(17);
    static final apam q = new amln(16);
    static final apam p = new amln(15);
    static final apam o = new amln(14);
    static final apam n = new amln(13);
    static final apam m = new amln(12);
    static final apam l = new amln(11);
    static final apam k = new amln(10);
    static final apam j = new amln(9);
    static final apam i = new amln(8);
    static final apam h = new amln(7);
    static final apam g = new amln(6);
    static final apam f = new amln(5);
    static final apam e = new amln(4);
    static final apam d = new amln(3);
    static final apam c = new amln(2);
    static final apam b = new amln(1);
    static final apam a = new amln(0);

    private amln(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.aX(i2);
            case 1:
                if (a.aR(i2) == 0) {
                    return false;
                }
                return true;
            case 2:
                switch (i2) {
                    case 0:
                        apakVar = amlq.UNSPECIFIED_STAGE;
                        break;
                    case 1:
                        apakVar = amlq.RESTORE;
                        break;
                    case 2:
                        apakVar = amlq.RESTORE_BACKUP_KEY;
                        break;
                    case 3:
                        apakVar = amlq.RESTORE_ENCRYPTION_KEY;
                        break;
                    case 4:
                        apakVar = amlq.RESTORE_PARTICIPANT;
                        break;
                    case 5:
                        apakVar = amlq.RESTORE_CONVERSATION;
                        break;
                    case 6:
                        apakVar = amlq.RESTORE_MESSAGE;
                        break;
                    case 7:
                        apakVar = amlq.BACKUP;
                        break;
                    case 8:
                        apakVar = amlq.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS;
                        break;
                    case 9:
                        apakVar = amlq.OPTIMIZED_RESTORE;
                        break;
                    case 10:
                        apakVar = amlq.OPTIMIZED_RESTORE_BACKUP_KEY;
                        break;
                    case 11:
                        apakVar = amlq.OPTIMIZED_RESTORE_ENCRYPTION_KEY;
                        break;
                    case 12:
                        apakVar = amlq.OPTIMIZED_RESTORE_PARTICIPANT;
                        break;
                    case 13:
                        apakVar = amlq.OPTIMIZED_RESTORE_CONVERSATION;
                        break;
                    case 14:
                        apakVar = amlq.OPTIMIZED_RESTORE_MESSAGE;
                        break;
                    case 15:
                        apakVar = amlq.MEDIA_BACKUP;
                        break;
                    case 16:
                        apakVar = amlq.MEDIA_RESTORE;
                        break;
                    case 17:
                        apakVar = amlq.OPTIMIZED_BACKUP;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 3:
                return a.aY(i2);
            case 4:
                if (amlx.b(i2) == null) {
                    return false;
                }
                return true;
            case 5:
                return a.aW(i2);
            case 6:
                return a.bb(i2);
            case 7:
                return a.aW(i2);
            case 8:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = amlz.RCS_GROUP_SELF_MSISDN;
                            }
                        } else {
                            apakVar = amlz.RCS_CONFERENCE_URI;
                        }
                    } else {
                        apakVar = amlz.RCS_GROUP_ID;
                    }
                } else {
                    apakVar = amlz.UNKNOWN_RCS_GROUP_IDENTIFIER;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 9:
                return a.aW(i2);
            case 10:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = amma.INVALID_RECIPIENT_ADDRESS_FORMAT;
                                }
                            } else {
                                apakVar = amma.MULTIPLE_RECIPIENTS_PARSED;
                            }
                        } else {
                            apakVar = amma.MULTIPLE_RECIPIENT_IDS_RETURNED;
                        }
                    } else {
                        apakVar = amma.NO_RECIPIENT_IDS_FOR_THREAD_ID;
                    }
                } else {
                    apakVar = amma.UNKNOWN_RCS_GROUP_TELEPHONY_DATA_FAILURE_REASON;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 11:
                return a.aY(i2);
            case 12:
                return a.bc(i2);
            case 13:
                if (amme.b(i2) == null) {
                    return false;
                }
                return true;
            case 14:
                return a.aW(i2);
            case 15:
                return a.be(i2);
            case 16:
                return a.bh(i2);
            case 17:
                return a.aY(i2);
            case 18:
                return a.bf(i2);
            case 19:
                return a.bb(i2);
            default:
                if (ammr.b(i2) == null) {
                    return false;
                }
                return true;
        }
    }
}
