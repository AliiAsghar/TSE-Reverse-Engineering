package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amoo implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amoo(20);
    static final apam t = new amoo(19);
    static final apam s = new amoo(18);
    static final apam r = new amoo(17);
    static final apam q = new amoo(16);
    static final apam p = new amoo(15);
    static final apam o = new amoo(14);
    static final apam n = new amoo(13);
    static final apam m = new amoo(12);
    static final apam l = new amoo(11);
    static final apam k = new amoo(10);
    static final apam j = new amoo(9);
    static final apam i = new amoo(8);
    static final apam h = new amoo(7);
    static final apam g = new amoo(6);
    static final apam f = new amoo(5);
    static final apam e = new amoo(4);
    static final apam d = new amoo(3);
    static final apam c = new amoo(2);
    static final apam b = new amoo(1);
    public static final apam a = new amoo(0);

    private amoo(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                if (i2 != 107 && i2 != 112) {
                    switch (i2) {
                        default:
                            switch (i2) {
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                    break;
                                default:
                                    return false;
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            return true;
                    }
                }
                return true;
            case 1:
                if (a.S(i2) == 0) {
                    return false;
                }
                return true;
            case 2:
                return a.bb(i2);
            case 3:
                return a.bh(i2);
            case 4:
                return a.bh(i2);
            case 5:
                return a.aW(i2);
            case 6:
                return a.bk(i2);
            case 7:
                return a.aW(i2);
            case 8:
                return a.be(i2);
            case 9:
                return a.bh(i2);
            case 10:
                return a.aW(i2);
            case 11:
                return a.be(i2);
            case 12:
                return a.aW(i2);
            case 13:
                return a.aW(i2);
            case 14:
                return a.aY(i2);
            case 15:
                switch (i2) {
                    case 0:
                        apakVar = amqd.UNKNOWN_CLOSING_SOURCE;
                        break;
                    case 1:
                        apakVar = amqd.BACK_BUTTON;
                        break;
                    case 2:
                        apakVar = amqd.BACK_ICON;
                        break;
                    case 3:
                        apakVar = amqd.KEYBOARD_OPEN;
                        break;
                    case 4:
                        apakVar = amqd.SELECTION;
                        break;
                    case 5:
                        apakVar = amqd.DISMISSAL;
                        break;
                    case 6:
                        apakVar = amqd.MESSAGE_SELECTED;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 16:
                switch (i2) {
                    case 0:
                        apakVar = amqe.UNKNOWN_OPENING_SOURCE;
                        break;
                    case 1:
                        apakVar = amqe.PLUS_BUTTON;
                        break;
                    case 2:
                        apakVar = amqe.CAMERA_GALLERY_BUTTON;
                        break;
                    case 3:
                        apakVar = amqe.CATEGORY_HEADER;
                        break;
                    case 4:
                        apakVar = amqe.CATEGORY_OVERFLOW;
                        break;
                    case 5:
                        apakVar = amqe.SUGGESTION;
                        break;
                    case 6:
                        apakVar = amqe.EXPAND;
                        break;
                    case 7:
                        apakVar = amqe.FAVORITES;
                        break;
                    case 8:
                        apakVar = amqe.QUERY;
                        break;
                    case 9:
                        apakVar = amqe.CAMERA;
                        break;
                    case 10:
                        apakVar = amqe.MINI_CAMERA;
                        break;
                    case 11:
                        apakVar = amqe.DRAFT_END_EMOJI_BUTTON;
                        break;
                    case 12:
                        apakVar = amqe.MESSAGE_LONG_PRESS;
                        break;
                    case 13:
                        apakVar = amqe.MESSAGE_BADGE_CLICK;
                        break;
                    case 14:
                        apakVar = amqe.MESSAGE_REPLY_BUTTON_CLICK;
                        break;
                    case 15:
                        apakVar = amqe.MESSAGE_REPLY_SWIPE;
                        break;
                    case 16:
                        apakVar = amqe.ADD_CUSTOM_REACTION_BUTTON_CLICK;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 17:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = amqf.INTERRUPTED;
                                }
                            } else {
                                apakVar = amqf.PREVIOUSLY_LOADED;
                            }
                        } else {
                            apakVar = amqf.FAILED_TO_LOAD;
                        }
                    } else {
                        apakVar = amqf.LOADED;
                    }
                } else {
                    apakVar = amqf.UNKNOWN_OPENING_STATE;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 18:
                switch (i2) {
                    case 0:
                        apakVar = amqh.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
                        break;
                    case 1:
                        apakVar = amqh.ALL;
                        break;
                    case 2:
                        apakVar = amqh.CAMERA_GALLERY;
                        break;
                    case 3:
                        apakVar = amqh.CAMERA;
                        break;
                    case 4:
                        apakVar = amqh.GALLERY;
                        break;
                    case 5:
                        apakVar = amqh.EXTERNAL;
                        break;
                    case 6:
                        apakVar = amqh.EMOJI;
                        break;
                    case 7:
                        apakVar = amqh.GIF;
                        break;
                    case 8:
                        apakVar = amqh.STICKER;
                        break;
                    case 9:
                        apakVar = amqh.LOCATION;
                        break;
                    case 10:
                        apakVar = amqh.SEND_MONEY;
                        break;
                    case 11:
                        apakVar = amqh.REQUEST_MONEY;
                        break;
                    case 12:
                        apakVar = amqh.CONTACT;
                        break;
                    case 13:
                        apakVar = amqh.VOICE;
                        break;
                    case 14:
                        apakVar = amqh.FILE;
                        break;
                    case 15:
                        apakVar = amqh.REACTION;
                        break;
                    case 16:
                        apakVar = amqh.ASSISTANT;
                        break;
                    case 17:
                        apakVar = amqh.REPLY_DRAFT;
                        break;
                    case 18:
                        apakVar = amqh.EMOTIVE;
                        break;
                    case 19:
                        apakVar = amqh.EMOTIFY;
                        break;
                    case 20:
                        apakVar = amqh.SELFIE_GIF;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 19:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = amqi.FULL_SCREEN;
                            }
                        } else {
                            apakVar = amqi.EXPANDED;
                        }
                    } else {
                        apakVar = amqi.COLLAPSED;
                    }
                } else {
                    apakVar = amqi.UNKNOWN_COMPOSE_SCREEN_MODE;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            default:
                return a.aW(i2);
        }
    }
}
