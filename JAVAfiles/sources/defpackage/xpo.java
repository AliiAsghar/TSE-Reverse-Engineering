package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.FileOutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xpo implements dts {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ xpo(ListenableFuture listenableFuture, Function function, Executor executor, int i) {
        this.e = i;
        this.d = listenableFuture;
        this.a = function;
        this.b = executor;
        this.c = "actionExecutor";
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, arqg] */
    @Override // defpackage.dts
    public final Object a(dtq dtqVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                albo.q(this.d, new akxt(this.a, dtqVar), this.b);
                return this.c;
            }
            Object obj = this.d;
            this.b.execute(new eex((String) this.c, (arqg) this.a, (eny) obj, dtqVar, 6));
            return arnb.a;
        }
        alwo alwoVar = xpp.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        xpq xpqVar = new xpq((String) this.b, (FileOutputStream) obj3, xoo.a(), dtqVar, (Optional) obj2);
        Object obj4 = this.a;
        ((AtomicReference) obj4).set(xpqVar);
        return obj4;
    }

    public /* synthetic */ xpo(Executor executor, String str, arqg arqgVar, eny enyVar, int i) {
        this.e = i;
        this.b = executor;
        this.c = str;
        this.a = arqgVar;
        this.d = enyVar;
    }

    public /* synthetic */ xpo(AtomicReference atomicReference, String str, FileOutputStream fileOutputStream, Optional optional, int i) {
        this.e = i;
        this.a = atomicReference;
        this.b = str;
        this.c = fileOutputStream;
        this.d = optional;
    }
}
