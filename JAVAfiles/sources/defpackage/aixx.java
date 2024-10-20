package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aixx {
    private static aixx e;
    public int a;
    public final Object b;
    public final Object c;
    public Object d;

    public aixx(String str, aixw... aixwVarArr) {
        this.b = str;
        this.c = aixwVarArr;
    }

    public static synchronized aixx d(Context context) {
        aixx aixxVar;
        synchronized (aixx.class) {
            if (e == null) {
                abgj abgjVar = accz.a;
                e = new aixx(context, abgj.o(new aglj("MessengerIpcClient", 1)));
            }
            aixxVar = e;
        }
        return aixxVar;
    }

    public final synchronized int a() {
        int i;
        i = this.a;
        this.a = i + 1;
        return i;
    }

    public final acir b(int i, Bundle bundle) {
        return c(new abpg(a(), i, bundle));
    }

    public final synchronized acir c(abph abphVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(abphVar.toString()));
        }
        if (!((abpf) this.d).e(abphVar)) {
            abpf abpfVar = new abpf(this);
            this.d = abpfVar;
            abpf abpfVar2 = abpfVar;
            abpfVar.e(abphVar);
        }
        return (acir) abphVar.b.a;
    }

    public aixx(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new abpf(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }
}
