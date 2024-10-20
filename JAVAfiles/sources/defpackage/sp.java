package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sp implements Executor {
    public static final sp a = new sp(15);
    private final /* synthetic */ int b;

    public sp(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                sq.a().b(runnable);
                return;
            case 1:
                new Thread(runnable).start();
                return;
            case 2:
                ((sr) sq.a().c).b.execute(runnable);
                return;
            case 3:
                return;
            case 4:
                runnable.run();
                return;
            case 5:
                runnable.run();
                return;
            case 6:
                runnable.run();
                return;
            case 7:
                runnable.run();
                return;
            case 8:
                runnable.run();
                return;
            case 9:
                runnable.run();
                return;
            case 10:
                xzw.d(runnable);
                return;
            case 11:
                aiut.e(runnable);
                return;
            case 12:
                runnable.run();
                return;
            case 13:
                runnable.run();
                return;
            case 14:
                runnable.run();
                return;
            case 15:
                agkx.k();
                runnable.run();
                return;
            case 16:
                runnable.run();
                return;
            case 17:
                runnable.run();
                return;
            case 18:
                runnable.run();
                return;
            case 19:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
