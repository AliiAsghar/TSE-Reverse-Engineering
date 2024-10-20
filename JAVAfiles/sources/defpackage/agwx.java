package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agwx implements Callable {
    public final /* synthetic */ ListenableFuture a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ agwx(akul akulVar, akul akulVar2, rry rryVar, int i, boolean z, Consumer consumer, int i2) {
        this.g = i2;
        this.f = akulVar;
        this.a = akulVar2;
        this.e = rryVar;
        this.c = i;
        this.b = z;
        this.d = consumer;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aguz, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.g != 0) {
            if (((Boolean) albo.bQ(this.f)).booleanValue()) {
                ?? r0 = this.d;
                boolean z = this.b;
                r0.q(new itt((rry) this.e, this.c, !((Boolean) albo.bQ(this.a)).booleanValue(), z));
                return null;
            }
            return null;
        }
        int i = alog.d;
        alog alogVar = (alog) agkx.i(this.a, alsx.a);
        ((Optional) this.d).isPresent();
        return aglo.y(this.e, alogVar, 0, (agxe) this.f, false, this.b, this.c);
    }

    public /* synthetic */ agwx(ListenableFuture listenableFuture, Optional optional, aguz aguzVar, agxe agxeVar, boolean z, int i, int i2) {
        this.g = i2;
        this.a = listenableFuture;
        this.d = optional;
        this.e = aguzVar;
        this.f = agxeVar;
        this.b = z;
        this.c = i;
    }
}
