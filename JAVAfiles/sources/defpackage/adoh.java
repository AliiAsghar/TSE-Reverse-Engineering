package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adoh extends Handler {
    private static final alor a = alor.p(0, "START_RCS_STACK", 1, "UPDATE_RCS_CONFIG", 2, "NOTIFY_UPTIME_IGNORE_STATE_CHANGED", 3, "SEND_SIM_EVENT_TO_PROVISIONING_ENGINE", 4, "STOP_RCS_STACK");
    private final advp b;
    private final WeakReference c;
    private final WeakReference d;

    public adoh(Looper looper, RcsEngineImpl rcsEngineImpl, adeq adeqVar) {
        super(looper);
        advp advpVar;
        advpVar = rcsEngineImpl.m;
        this.b = advpVar.b("Handler");
        this.c = new WeakReference(rcsEngineImpl);
        this.d = new WeakReference(adeqVar);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [acoh, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        Object obj = a.get(Integer.valueOf(message.what));
        if (this.c.get() == null) {
            str = "null";
        } else {
            str = "non-null";
        }
        advr.l(this.b, "handleMessage processing message:[%s] with [%s]:RcsEngineImpl reference", obj, str);
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            advr.r(this.b, "Unexpected RCS engine handler message: %s", message);
                            return;
                        }
                        advr.l(this.b, "RCS engine STOP RCS stack", new Object[0]);
                        RcsEngineImpl rcsEngineImpl = (RcsEngineImpl) this.c.get();
                        if (rcsEngineImpl != null) {
                            rcsEngineImpl.stopRcsStackInternal();
                            return;
                        } else {
                            advr.h(this.b, "skipping doStopImsStack, engine is null, this should not happen", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
                adeq adeqVar = (adeq) this.d.get();
                if (adeqVar != null) {
                    if (!adeqVar.l()) {
                        return;
                    }
                    try {
                        apfz b = adeqVar.b();
                        if (adeq.m(b)) {
                            adeqVar.i(b);
                            return;
                        } else if (adeqVar.r.isPresent() && adeqVar.r.get().isRegistered()) {
                            adeqVar.j();
                            return;
                        } else {
                            adeqVar.k(acok.UNKNOWN);
                            return;
                        }
                    } catch (adwk unused) {
                        advr.g("Missing permission to calculate uptime metric.", new Object[0]);
                        return;
                    }
                }
                advr.h(this.b, "skipping doNotifyUptimeIgnoreStateChanged, tracker is null, this should not happen", new Object[0]);
                return;
            }
            RcsEngineImpl rcsEngineImpl2 = (RcsEngineImpl) this.c.get();
            if (rcsEngineImpl2 != null) {
                rcsEngineImpl2.updateRcsConfig();
                return;
            } else {
                advr.h(this.b, "skipping doUpdateRcsConfig, engine is null, this should not happen", new Object[0]);
                return;
            }
        }
        RcsEngineImpl rcsEngineImpl3 = (RcsEngineImpl) this.c.get();
        if (rcsEngineImpl3 != null) {
            rcsEngineImpl3.startRcsStackInternal();
        } else {
            advr.h(this.b, "skipping doStartRcsStack, engine is null, this should not happen", new Object[0]);
        }
    }
}
