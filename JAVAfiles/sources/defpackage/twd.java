package defpackage;

import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twd {
    public twd(mbl mblVar) {
        try {
            xzt.a("scytale_v2_jni");
        } catch (Throwable th) {
            if (ttd.a()) {
                mblVar.e("Bugle.Etouffee.LoadScytale.Count", 3);
            } else {
                mblVar.e("Bugle.Etouffee.LoadScytale.Count", 4);
            }
            throw th;
        }
    }

    public static Object a(StatusOr statusOr) {
        if (statusOr.hasValue) {
            return statusOr.value;
        }
        throw new aqwb(statusOr.status);
    }

    public static void b(Status status) {
        if (status.f()) {
        } else {
            throw new aqwb(status);
        }
    }

    public static final tqy c(akul akulVar) {
        Level level = Level.WARNING;
        level.getClass();
        akulVar.k(new xch(level, 1), andi.a);
        return new tqz(akulVar);
    }

    public static agmh[] d() {
        return (agmh[]) svq.d.a;
    }
}
