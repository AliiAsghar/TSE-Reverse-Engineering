package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apgg implements apam {
    private final /* synthetic */ int i;
    static final apam h = new apgg(7);
    static final apam g = new apgg(6);
    static final apam f = new apgg(5);
    static final apam e = new apgg(4);
    static final apam d = new apgg(3);
    static final apam c = new apgg(2);
    static final apam b = new apgg(1);
    static final apam a = new apgg(0);

    private apgg(int i) {
        this.i = i;
    }

    @Override // defpackage.apam
    public final boolean a(int i) {
        apgf apgfVar;
        switch (this.i) {
            case 0:
                return a.aW(i);
            case 1:
                switch (i) {
                    case 0:
                        apgfVar = apgf.FEATURE_TAG_TYPE_UNKNOWN;
                        break;
                    case 1:
                        apgfVar = apgf.FEATURE_TAG_TEXT;
                        break;
                    case 2:
                        apgfVar = apgf.FEATURE_TAG_VIDEO;
                        break;
                    case 3:
                        apgfVar = apgf.FEATURE_TAG_3GPP_SMSIP;
                        break;
                    case 4:
                        apgfVar = apgf.FEATURE_TAG_3GPP_IARI_REF_RCSE_DP;
                        break;
                    case 5:
                        apgfVar = apgf.FEATURE_TAG_3GPP_ICSI_REF_MMTEL;
                        break;
                    case 6:
                        apgfVar = apgf.FEATURE_TAG_3GPP_IARI_REF_GEOPUSH;
                        break;
                    case 7:
                        apgfVar = apgf.FEATURE_TAG_3GPP_ICSI_REF_CPM_SESSION;
                        break;
                    case 8:
                        apgfVar = apgf.FEATURE_TAG_3GPP_IARI_REF_FTHTTP;
                        break;
                    case 9:
                        apgfVar = apgf.FEATURE_TAG_3GPP_IARI_REF_CPM_FILETRANSFER;
                        break;
                    case 10:
                        apgfVar = apgf.FEATURE_TAG_3GPP_ICSI_REF_CPM_MSG;
                        break;
                    case 11:
                        apgfVar = apgf.FEATURE_TAG_3GPP_ICSI_REF_CPM_LARGEMSG;
                        break;
                    case 12:
                        apgfVar = apgf.FEATURE_TAG_3GPP_ICSI_REF_CPM_DEFERRED;
                        break;
                    case 13:
                        apgfVar = apgf.FEATURE_TAG_CPM_PAGER_LARGE;
                        break;
                    case 14:
                        apgfVar = apgf.FEATURE_TAG_3GPP_IARI_REF_FTSMS;
                        break;
                    case 15:
                        apgfVar = apgf.FEATURE_TAG_3GPP_ICSI_REF_CALLCOMPOSER;
                        break;
                    case 16:
                        apgfVar = apgf.FEATURE_TAG_GSMA_CALLCOMPOSER;
                        break;
                    case 17:
                        apgfVar = apgf.FEATURE_TAG_3GPP_ICSI_REF_CALLUNANSWERED;
                        break;
                    case 18:
                        apgfVar = apgf.FEATURE_TAG_3GPP_ICSI_REF_SHAREDMAP;
                        break;
                    case 19:
                        apgfVar = apgf.FEATURE_TAG_3GPP_ICSI_REF_SHAREDSKETCH;
                        break;
                    case 20:
                        apgfVar = apgf.FEATURE_TAG_3GPP_IARI_REF_GEOSMS;
                        break;
                    case 21:
                        apgfVar = apgf.FEATURE_TAG_3GPP_IARI_REF_CHATBOT;
                        break;
                    case 22:
                        apgfVar = apgf.FEATURE_TAG_3GPP_IARI_REF_CHATBOT_SA;
                        break;
                    case 23:
                        apgfVar = apgf.FEATURE_TAG_GSMA_BOTVERSION;
                        break;
                    case 24:
                        apgfVar = apgf.FEATURE_TAG_GSMA_CPIMEXT;
                        break;
                    default:
                        apgfVar = null;
                        break;
                }
                if (apgfVar != null) {
                    return true;
                }
                return false;
            case 2:
                return a.bb(i);
            case 3:
                return a.be(i);
            case 4:
                if (apgi.b(i) != null) {
                    return true;
                }
                return false;
            case 5:
                return a.aW(i);
            case 6:
                return a.aW(i);
            default:
                return a.bb(i);
        }
    }
}
