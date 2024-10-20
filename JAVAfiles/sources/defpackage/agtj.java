package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agtj implements aguc {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/concurrent/Executors");
    public static volatile agtj b;
    public final List c = new ArrayList();
    public final aneo d;
    public final aneo e;
    public final aneo f;
    public volatile aneo g;
    private final aneo h;
    private final agtp i;

    public agtj(aneo aneoVar, aneo aneoVar2, aneo aneoVar3, aneo aneoVar4) {
        if (aneoVar == null) {
            arbj arbjVar = new arbj((char[]) null, (byte[]) null);
            arbjVar.j("ImeScheduler-%d");
            arbjVar.i();
            aneoVar = albo.bC(Executors.newScheduledThreadPool(1, arbj.t(arbjVar)));
        }
        this.h = aneoVar;
        this.i = ahaw.a ? new agtp(aneoVar, new abes(17)) : null;
        this.d = aneoVar2 == null ? new agth(d("Light-P0", 0, Math.max(2, Runtime.getRuntime().availableProcessors() - 2)), aneoVar, 0) : aneoVar2;
        this.e = aneoVar3 == null ? new agth(d("Back-P10", 10, 4), aneoVar, 0) : aneoVar3;
        this.f = aneoVar4 == null ? new agth(f("Block-P11", 11, 0, Integer.MAX_VALUE, new SynchronousQueue(), false), aneoVar, 0) : aneoVar4;
        agub.a.a(this);
    }

    public static agtj a() {
        agtj agtjVar = b;
        if (agtjVar == null) {
            synchronized (agtj.class) {
                agtjVar = b;
                if (agtjVar == null) {
                    agtjVar = new agtj(null, null, null, null);
                    b = agtjVar;
                }
            }
        }
        return agtjVar;
    }

    public static Executor b(Executor executor) {
        if (!c(executor) && executor != andi.a && !(executor instanceof agti) && !(executor instanceof agtm)) {
            return new anew(executor);
        }
        return executor;
    }

    public static boolean c(Executor executor) {
        Executor executor2;
        if (executor != agtz.b) {
            if (ahaw.a) {
                executor2 = sp.a;
            } else {
                executor2 = andi.a;
            }
            if (executor != executor2 && executor != agtz.a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static agts e() {
        if (ahaw.a) {
            return new agta();
        }
        return new agtb();
    }

    private final anen f(String str, int i, int i2, int i3, BlockingQueue blockingQueue, boolean z) {
        agtp agtpVar;
        if (str.length() > 16) {
            ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/concurrent/Executors", "createThreadPoolExecutor", 621, "Executors.java")).t("createThreadPoolExecutor(): name[%s] exceeds limit", str);
            str = str.substring(0, 16);
        }
        agts e = e();
        agtl agtlVar = new agtl(str, i, e);
        aegu aeguVar = agsp.a;
        if (z) {
            agtpVar = this.i;
        } else {
            agtpVar = null;
        }
        agty agtyVar = new agty(aeguVar, agtpVar, i2, i3, TimeUnit.MINUTES, blockingQueue, agtlVar);
        if (i2 > 0) {
            agtyVar.allowCoreThreadTimeOut(true);
        }
        synchronized (this.c) {
            this.c.add(e);
            this.c.add(agtyVar);
        }
        return albo.bB(agtyVar);
    }

    final anen d(String str, int i, int i2) {
        return f(str, i, i2, i2, new LinkedBlockingQueue(), true);
    }
}
