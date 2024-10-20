package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebr implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ ebq c;
    final /* synthetic */ int d;

    public ebr(String str, Context context, ebq ebqVar, int i) {
        this.a = str;
        this.b = context;
        this.c = ebqVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return ebu.b(this.a, this.b, fvq.p(new Object[]{this.c}), this.d);
    }
}
