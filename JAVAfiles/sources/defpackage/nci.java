package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nci implements ncj {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/status/SendingStatusHandler");
    private final xyt b;
    private final xnv c;

    public nci(xyt xytVar, xnv xnvVar) {
        xytVar.getClass();
        xnvVar.getClass();
        this.b = xytVar;
        this.c = xnvVar;
    }

    @Override // defpackage.ncj
    public final nbv a(Resources resources, MessagesTable.BindData bindData, alog alogVar, ifs ifsVar, mzx mzxVar, mll mllVar) {
        boolean z;
        nfw f;
        bindData.getClass();
        xyt xytVar = this.b;
        int k = bindData.k();
        yaq yaqVar = (yaq) xytVar.a();
        String str = null;
        if (yaqVar.r() && (f = mllVar.f()) != null && yaqVar.a(k, f.b()) == yay.UNAVAILABLE) {
            if (resources != null) {
                str = resources.getString(R.string.mapi_message_status_waiting_to_connect);
            }
        } else {
            Instant ofEpochMilli = Instant.ofEpochMilli(bindData.v());
            Object e = ncu.a.e();
            e.getClass();
            if (ofEpochMilli.plus(Duration.ofMillis(((Number) e).longValue())).isBefore(this.c.f()) && resources != null) {
                str = resources.getString(R.string.mapi_message_status_still_sending);
            }
        }
        String str2 = str;
        ((alvg) a.g().h("com/google/android/apps/messaging/shared/api/messaging/message/status/SendingStatusHandler", "convert", 74, "SendingStatusHandler.kt")).D("Message with id %s has status %s", bindData.A().a(), str2);
        if (bindData.k() == 3 && !mllVar.F()) {
            z = true;
        } else {
            z = false;
        }
        return new nbv(str2, 1, true, z, true, false, false, false, 224);
    }
}
