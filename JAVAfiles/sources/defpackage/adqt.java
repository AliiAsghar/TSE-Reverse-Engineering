package defpackage;

import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import j$.util.DesugarArrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum adqt {
    UNKNOWN("unknown"),
    CPIM_MESSAGE("message/cpim"),
    TEXT_MESSAGE("text/plain"),
    DISPOSITION_NOTIFICATION("message/imdn+xml"),
    IS_COMPOSING_INDICATOR("application/im-iscomposing+xml"),
    HTTP_FT_PUSH("application/vnd.gsma.rcs-ft-http+xml"),
    CONVERSATION_SUGGESTIONS("application/vnd.gsma.botsuggestion.v1.0+json"),
    CONVERSATION_SUGGESTIONS_RESPONSE(RbmSuggestionResponse.CONTENT_TYPE),
    RBM_SPAM_REPORT("application/vnd.gsma.rcsspam-report+xml"),
    RBM_BOT_MESSAGE(RbmSpecificMessage.CONTENT_TYPE),
    CPM_GROUP_DATA(GroupManagementContentType.CONTENT_TYPE);

    public final String l;

    adqt(String str) {
        this.l = str;
    }

    public static adqt a(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        return (adqt) DesugarArrays.stream(values()).filter(new zko(str, 14)).findFirst().orElse(UNKNOWN);
    }
}
