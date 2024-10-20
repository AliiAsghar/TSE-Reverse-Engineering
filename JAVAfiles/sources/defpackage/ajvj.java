package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajvj {
    public int a;
    public final Object b;
    public Object c;
    public final Object d;

    public ajvj(Context context) {
        abgj abgjVar = accz.a;
        ScheduledExecutorService o = abgj.o(new aglj("MessengerIpcClient", 1));
        this.c = new acbr(this);
        this.a = 1;
        this.b = context.getApplicationContext();
        this.d = o;
    }

    public final synchronized int a() {
        int i;
        i = this.a;
        this.a = i + 1;
        return i;
    }

    public final synchronized acir b(acbs acbsVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(acbsVar.toString()));
        }
        if (!((acbr) this.c).f(acbsVar)) {
            acbr acbrVar = new acbr(this);
            this.c = acbrVar;
            acbr acbrVar2 = acbrVar;
            acbrVar.f(acbsVar);
        }
        return (acir) acbsVar.b.a;
    }

    public ajvj() {
        this.b = new Handler();
        this.d = new ajir(this, 11);
    }
}
