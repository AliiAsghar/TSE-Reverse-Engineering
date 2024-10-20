package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbz implements ncg {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedEmergencyNumberStatusHandler");
    private final xyt b;
    private final armf c;

    public nbz(xyt xytVar, armf armfVar) {
        xytVar.getClass();
        armfVar.getClass();
        this.b = xytVar;
        this.c = armfVar;
    }

    @Override // defpackage.ncj
    public final /* synthetic */ nbv a(Resources resources, MessagesTable.BindData bindData, alog alogVar, ifs ifsVar, mzx mzxVar, mll mllVar) {
        return lga.az(this, resources, bindData, alogVar, ifsVar, mzxVar, mllVar);
    }

    @Override // defpackage.ncg
    public final nbv b(Resources resources, MessagesTable.BindData bindData, alog alogVar, ifs ifsVar, mzx mzxVar, mll mllVar) {
        String string;
        resources.getClass();
        bindData.getClass();
        alogVar.getClass();
        ifsVar.getClass();
        mzxVar.getClass();
        if (((odl) this.c.b()).a() && ((yaq) this.b.a()).o()) {
            string = resources.getString(R.string.message_status_failed_emergency_number_on_satellite);
        } else {
            string = resources.getString(R.string.message_status_failed_emergency_number);
        }
        String str = string;
        str.getClass();
        ((alvg) a.g().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedEmergencyNumberStatusHandler", "convertFailure", 53, "OutgoingFailedEmergencyNumberStatusHandler.kt")).D("Message with id %x has status %s", bindData.A(), str);
        return new nbv(str, 2, false, false, false, false, false, false, 252);
    }
}
