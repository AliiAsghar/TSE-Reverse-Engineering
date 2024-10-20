package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agta implements agts {
    private final AtomicInteger a = new AtomicInteger();
    private final agtr[] b = new agtr[30];
    private final Object c = new Object();
    private int d = 0;

    @Override // defpackage.agts
    public final agtr a(Runnable runnable) {
        String str;
        agtr agtrVar = new agtr();
        if (runnable instanceof agtq) {
            str = runnable.toString();
        } else {
            Class<?> cls = runnable.getClass();
            String simpleName = cls.getSimpleName();
            if (TextUtils.isEmpty(simpleName)) {
                str = cls.getName();
            } else {
                str = simpleName;
            }
        }
        agtrVar.a = str;
        synchronized (this.c) {
            agtr[] agtrVarArr = this.b;
            int i = this.d;
            agtrVarArr[i] = agtrVar;
            this.d = (i + 1) % 30;
        }
        return agtrVar;
    }

    @Override // defpackage.agts
    public final void b() {
        this.a.incrementAndGet();
    }

    @Override // defpackage.agts
    public final void c() {
        this.a.decrementAndGet();
    }
}
