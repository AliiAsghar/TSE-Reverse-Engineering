package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfs {
    public static final /* synthetic */ int a = 0;
    private static final alor b;

    static {
        alok alokVar = new alok();
        alokVar.h(albo.ap(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), apgf.FEATURE_TAG_TEXT);
        alokVar.h(albo.ap("video"), apgf.FEATURE_TAG_VIDEO);
        alokVar.h(albo.ap("+g.3gpp.smsip"), apgf.FEATURE_TAG_3GPP_SMSIP);
        alokVar.h(albo.ap("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.dp\""), apgf.FEATURE_TAG_3GPP_IARI_REF_RCSE_DP);
        alokVar.h(albo.ap("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel\""), apgf.FEATURE_TAG_3GPP_ICSI_REF_MMTEL);
        alokVar.h(albo.ap("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush\""), apgf.FEATURE_TAG_3GPP_IARI_REF_GEOPUSH);
        alokVar.h(albo.ap("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session\""), apgf.FEATURE_TAG_3GPP_ICSI_REF_CPM_SESSION);
        alokVar.h(albo.ap("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp\""), apgf.FEATURE_TAG_3GPP_IARI_REF_FTHTTP);
        alokVar.h(albo.ap("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.filetransfer\""), apgf.FEATURE_TAG_3GPP_IARI_REF_CPM_FILETRANSFER);
        alokVar.h(albo.ap("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg\""), apgf.FEATURE_TAG_3GPP_ICSI_REF_CPM_MSG);
        alokVar.h(albo.ap("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg\""), apgf.FEATURE_TAG_3GPP_ICSI_REF_CPM_LARGEMSG);
        alokVar.h(albo.ap("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.deferred\""), apgf.FEATURE_TAG_3GPP_ICSI_REF_CPM_DEFERRED);
        alokVar.h(albo.ap("+g.gsma.rcs.cpm.pager-large"), apgf.FEATURE_TAG_CPM_PAGER_LARGE);
        alokVar.h(albo.ap("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms\""), apgf.FEATURE_TAG_3GPP_IARI_REF_FTSMS);
        alokVar.h(albo.ap("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer\""), apgf.FEATURE_TAG_3GPP_ICSI_REF_CALLCOMPOSER);
        alokVar.h(albo.ap("+g.gsma.callcomposer"), apgf.FEATURE_TAG_GSMA_CALLCOMPOSER);
        alokVar.h(albo.ap("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered\""), apgf.FEATURE_TAG_3GPP_ICSI_REF_CALLUNANSWERED);
        alokVar.h(albo.ap("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap\""), apgf.FEATURE_TAG_3GPP_ICSI_REF_SHAREDMAP);
        alokVar.h(albo.ap("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch\""), apgf.FEATURE_TAG_3GPP_ICSI_REF_SHAREDSKETCH);
        alokVar.h(albo.ap("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geosms\""), apgf.FEATURE_TAG_3GPP_IARI_REF_GEOSMS);
        alokVar.h(albo.ap("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot\""), apgf.FEATURE_TAG_3GPP_IARI_REF_CHATBOT);
        alokVar.h(albo.ap("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot.sa\""), apgf.FEATURE_TAG_3GPP_IARI_REF_CHATBOT_SA);
        alokVar.h(albo.ap("+g.gsma.rcs.botversion=\"#=1,#=2\""), apgf.FEATURE_TAG_GSMA_BOTVERSION);
        alokVar.h(albo.ap("+g.gsma.rcs.cpimext"), apgf.FEATURE_TAG_GSMA_CPIMEXT);
        b = alokVar.b();
    }

    public static apgf a(String str) {
        return (apgf) b.getOrDefault(albo.ap(str), apgf.FEATURE_TAG_TYPE_UNKNOWN);
    }
}
