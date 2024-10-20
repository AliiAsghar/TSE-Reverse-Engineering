package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbx implements ncg {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCancelledMessageStatusHandler");

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
        String string = resources.getString(R.string.mapi_message_status_cancelled_sending);
        string.getClass();
        ((alvg) a.g().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCancelledMessageStatusHandler", "convertFailure", 37, "OutgoingCancelledMessageStatusHandler.kt")).D("Message with id %x has status %s", bindData.A(), string);
        return new nbv(string, 1, true, false, true, false, false, false, 224);
    }
}
