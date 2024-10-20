package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ncb implements ncg {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedRecipientDidNotDecryptStatusHandler");
    private final trz b;

    public ncb(trz trzVar) {
        trzVar.getClass();
        this.b = trzVar;
    }

    @Override // defpackage.ncj
    public final /* synthetic */ nbv a(Resources resources, MessagesTable.BindData bindData, alog alogVar, ifs ifsVar, mzx mzxVar, mll mllVar) {
        return lga.az(this, resources, bindData, alogVar, ifsVar, mzxVar, mllVar);
    }

    @Override // defpackage.ncg
    public final nbv b(Resources resources, MessagesTable.BindData bindData, alog alogVar, ifs ifsVar, mzx mzxVar, mll mllVar) {
        String string;
        boolean z;
        boolean z2;
        String str;
        resources.getClass();
        bindData.getClass();
        alogVar.getClass();
        ifsVar.getClass();
        mzxVar.getClass();
        if (this.b.i() && tvu.e(mllVar.r()) && ifsVar.a() != 0) {
            alog alogVar2 = mzxVar.g;
            int size = alogVar2.size();
            alogVar2.getClass();
            Iterator<E> it = alogVar2.iterator();
            while (true) {
                if (it.hasNext()) {
                    str = ((ResolvedRecipient) it.next()).o();
                    if (str != null) {
                        break;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            if (str == null) {
                string = resources.getQuantityString(R.plurals.mapi_message_status_recipients_failed_decryption, size, Integer.valueOf(size));
                string.getClass();
            } else if (size > 1) {
                int i = size - 1;
                string = resources.getString(R.string.mapi_message_status_group_named_recipient_failed_decryption, resources.getQuantityString(R.plurals.name_and_other_plural, i, str, Integer.valueOf(i)));
                string.getClass();
            } else {
                string = resources.getString(R.string.mapi_message_status_group_named_recipient_failed_decryption, str);
                string.getClass();
            }
        } else {
            string = resources.getString(R.string.mapi_message_status_recipient_failed_decryption);
            string.getClass();
        }
        String str2 = string;
        ((alvg) a.g().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedRecipientDidNotDecryptStatusHandler", "convertFailure", 64, "OutgoingFailedRecipientDidNotDecryptStatusHandler.kt")).D("Message with id %x has status %s", bindData, str2);
        if (bindData.q() == 19) {
            z = true;
        } else {
            z = false;
        }
        if (bindData.k() == 3 && !mllVar.F()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new nbv(str2, 2, z, z2, true, false, false, false, 224);
    }
}
