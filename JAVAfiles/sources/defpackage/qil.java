package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qil implements qik {
    private final msk a;

    public qil(msk mskVar) {
        this.a = mskVar;
    }

    @Override // defpackage.qik
    public final vqh a(Context context, int i, MessageIdType messageIdType, alog alogVar, String str) {
        ArrayList<? extends Parcelable> arrayList;
        try {
            Intent intent = new Intent(context, (Class<?>) qii.class);
            intent.setAction("com.google.android.apps.messaging.cloudsync.internal.action.SEND_MESSAGE_RESULT");
            intent.putExtra("com.google.android.apps.messaging.cloudsync.internal.extra.REQUEST_ID", messageIdType.a());
            intent.putExtra("com.google.android.apps.messaging.cloudsync.internal.extra.SUB_ID", i);
            Intent intent2 = new Intent("com.google.android.apps.messaging.cloudsync.action.SEND_MESSAGE");
            intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS", (String[]) Collection.EL.stream(alogVar).map(new qcq(7)).toArray(new mlo(2)));
            if (((Boolean) new mss(5).get()).booleanValue()) {
                if (((Boolean) new mst(4).get()).booleanValue()) {
                    Stream map = Collection.EL.stream(alogVar).map(new qcq(8));
                    int i2 = alog.d;
                    arrayList = new ArrayList<>((java.util.Collection<? extends Object>) map.collect(alls.a));
                } else {
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    int size = alogVar.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList2.add(lqn.n(this.a.t(((msh) alogVar.get(i3)).m(), i)));
                    }
                    arrayList = arrayList2;
                }
                intent2.putParcelableArrayListExtra("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS_MI", arrayList);
            }
            intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.TEXT", str);
            intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.PENDING_INTENT", PendingIntent.getBroadcast(context, 0, intent, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)));
            qop.d(context, intent2);
            return vqh.a;
        } catch (Exception e) {
            xzb.i("BugleWearable", e, "CloudSyncSender: failed to send cloud sync message ".concat(e.toString()));
            vqg a = vqh.a(2, 0);
            a.b(1);
            return a.a();
        }
    }

    @Override // defpackage.qik
    public final void b(Context context, String[] strArr) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.DELETE_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        qop.d(context, intent);
    }

    @Override // defpackage.qik
    public final void c(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) qii.class);
        intent.setAction("com.google.android.apps.messaging.cloudsync.internal.action.ACTION_ATTACHMENTS_DOWNLOADED");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.ID", str);
        Intent intent2 = new Intent("com.google.android.apps.messaging.cloudsync.action.DOWNLOAD_ATTACHMENTS");
        intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.ID", str);
        intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.PENDING_INTENT", PendingIntent.getBroadcast(context, 0, intent, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        intent2.putExtras(bundle);
        qop.d(context, intent2);
    }

    @Override // defpackage.qik
    public final void d(Context context, String[] strArr) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.GET_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        qop.d(context, intent);
    }

    @Override // defpackage.qik
    public final void e(Context context, String[] strArr) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.UPDATE_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED", true);
        qop.d(context, intent);
    }

    @Override // defpackage.qik
    public final void f(Context context, String[] strArr, boolean z) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.UPDATE_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.READ", true);
        if (z) {
            intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED", true);
        }
        qop.d(context, intent);
    }
}
