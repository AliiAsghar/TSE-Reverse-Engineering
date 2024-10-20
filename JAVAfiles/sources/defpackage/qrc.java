package defpackage;

import android.provider.Telephony;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qrc implements akcq {
    public static final utz a = uuh.f(uuh.b, "conversation_matching_logger_worker_time_interval", 1440);
    private final qri b;

    public qrc(qri qriVar) {
        this.b = qriVar;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        qri qriVar = this.b;
        if (!qriVar.h.f()) {
            return aktp.ag(new gsu());
        }
        if (!((Boolean) ((utz) qrd.a.get()).e()).booleanValue()) {
            return aktp.ag(new gsw());
        }
        int i = 1;
        return akul.g(qriVar.i.h(Telephony.Sms.Inbox.CONTENT_URI, qri.b, null, null, null).e(akto.e(new xsj(qriVar, i)), qriVar.g).e(akto.e(new xsp(i)), qriVar.f).l());
    }
}
