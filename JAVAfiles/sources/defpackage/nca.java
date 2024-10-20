package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nca implements ncg {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedNoRetryNoFallbackStatusHandler");

    @Override // defpackage.ncj
    public final /* synthetic */ nbv a(Resources resources, MessagesTable.BindData bindData, alog alogVar, ifs ifsVar, mzx mzxVar, mll mllVar) {
        return lga.az(this, resources, bindData, alogVar, ifsVar, mzxVar, mllVar);
    }

    @Override // defpackage.ncg
    public final nbv b(Resources resources, MessagesTable.BindData bindData, alog alogVar, ifs ifsVar, mzx mzxVar, mll mllVar) {
        resources.getClass();
        bindData.getClass();
        alogVar.getClass();
        ifsVar.getClass();
        mzxVar.getClass();
        String string = resources.getString(R.string.mapi_message_status_send_failed_no_retry_no_fallback);
        string.getClass();
        ((alvg) a.g().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedNoRetryNoFallbackStatusHandler", "convertFailure", 41, "OutgoingFailedNoRetryNoFallbackStatusHandler.kt")).D("Message with id %x has status %s", bindData, string);
        return new nbv(string, 2, false, false, true, false, false, false, 236);
    }
}
