package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kte implements ktd {
    private final Context a;
    private final alog b;
    private final /* synthetic */ int c;

    public kte(Context context, alog alogVar, int i) {
        this.c = i;
        this.a = context;
        this.b = alogVar;
    }

    @Override // defpackage.ktd
    public final alog a() {
        switch (this.c) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            case 4:
                return this.b;
            case 5:
                return this.b;
            case 6:
                return this.b;
            case 7:
                return this.b;
            case 8:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.ktd
    public final amei b() {
        switch (this.c) {
            case 0:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_DUPLICATED;
            case 1:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_GENERIC;
            case 2:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_DOWNLOAD;
            case 3:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_RECEIVE;
            case 4:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_SEND;
            case 5:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_IN_WRONG_CONVERSATION;
            case 6:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_LOST;
            case 7:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_OUT_OF_ORDER;
            case 8:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_STUCK_IN_SENDING;
            default:
                return amei.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_RCS_CONNECTIVITY_LOST;
        }
    }

    @Override // defpackage.ktd
    public final String c() {
        switch (this.c) {
            case 0:
                return this.a.getString(R.string.message_duplicated_text);
            case 1:
                return this.a.getString(R.string.generic_issue_text);
            case 2:
                return this.a.getString(R.string.message_fail_to_download_text);
            case 3:
                return this.a.getString(R.string.message_fail_to_receive_text);
            case 4:
                return this.a.getString(R.string.message_fail_to_send_text);
            case 5:
                return this.a.getString(R.string.message_in_wrong_conversation_text);
            case 6:
                return this.a.getString(R.string.message_lost_text);
            case 7:
                return this.a.getString(R.string.message_out_of_order_text);
            case 8:
                return this.a.getString(R.string.message_stuck_in_sending_text);
            default:
                return this.a.getString(R.string.rcs_connectivity_lost_text_v2);
        }
    }
}
