package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fcv implements Executor {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fcv(Handler handler, int i, short[] sArr) {
        this.b = i;
        this.a = handler;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [etu, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                ((Handler) this.a).post(runnable);
                return;
            case 1:
                ((Handler) this.a).post(runnable);
                return;
            case 2:
                ((Handler) this.a).post(runnable);
                return;
            case 3:
                this.a.b(runnable);
                return;
            case 4:
                ((Handler) this.a).post(runnable);
                return;
            case 5:
                if (((akbm) ((yyt) this.a).d).post(runnable)) {
                    return;
                } else {
                    throw new alia("Could not execute on TiktokHandler");
                }
            case 6:
                ((Handler) this.a).post(runnable);
                return;
            case 7:
                ((aazm) this.a).c(runnable);
                return;
            case 8:
                ((aazm) this.a).c(runnable);
                return;
            case 9:
                ((aazm) this.a).c(runnable);
                return;
            default:
                ((Handler) this.a).post(runnable);
                return;
        }
    }

    public /* synthetic */ fcv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
