package defpackage;

import android.content.ContentValues;
import android.provider.Telephony;
import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aamv extends arpw implements arqv {
    long a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ LoadMessagesReceiver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamv(LoadMessagesReceiver loadMessagesReceiver, arpe arpeVar) {
        super(2, arpeVar);
        this.d = loadMessagesReceiver;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aamv) c((List) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        List list;
        long j;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            j = this.a;
            list = (List) this.c;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            list = (List) this.c;
            long a = ((xnv) this.d.l().b()).a();
            armf armfVar = this.d.i;
            if (armfVar == null) {
                arro.b("contentResolver");
                armfVar = null;
            }
            ListenableFuture i = ((atsg) armfVar.b()).i(new aket(Telephony.Sms.Inbox.CONTENT_URI, (ContentValues[]) list.toArray(new ContentValues[0]), 0));
            this.c = list;
            this.a = a;
            this.b = 1;
            if (arro.F(i, this) != arplVar) {
                j = a;
            } else {
                return arplVar;
            }
        }
        long a2 = ((xnv) this.d.l().b()).a();
        alvw g = LoadMessagesReceiver.d.g();
        g.X(alwp.a, "BugleTests");
        ((alvg) g.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver$loadMessagesFromFile$3", "invokeSuspend", 149, "LoadMessagesReceiver.kt")).v("Inserted %d messages in %d ms", list.size(), a2 - j);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        aamv aamvVar = new aamv(this.d, arpeVar);
        aamvVar.c = obj;
        return aamvVar;
    }
}
