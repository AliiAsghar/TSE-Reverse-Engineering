package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajym implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ajym(aogy aogyVar, ajxb ajxbVar, ajye ajyeVar, ajwt ajwtVar, int i) {
        this.e = i;
        this.a = aogyVar;
        this.b = ajxbVar;
        this.c = ajyeVar;
        this.d = ajwtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.concurrent.Future, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ajye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v27, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        boolean z;
        ajwt ajwtVar;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    ?? r0 = this.b;
                    int i2 = aktu.a;
                    if (!r0.isDone()) {
                        ?? r2 = this.d;
                        if (r2 != 0) {
                            timeoutException.setStackTrace(aktu.l(r2, null));
                            aktu.i(r2, timeoutException);
                            aktu.g(r2, timeoutException);
                        }
                        albo.bT(this.a, r0);
                    }
                    return this.c;
                }
                ajxc ajxcVar = (ajxc) obj;
                if (ajxcVar.c == null && (ajwtVar = ajxcVar.a) != null) {
                    return ((aogy) this.b).x(ajwtVar, this.a, (Intent) this.d, ajxcVar.e);
                }
                return this.c;
            }
            Object obj2 = this.a;
            if (!((String) obj).equals(obj2)) {
                return aneh.a;
            }
            if (ahvc.c.containsKey(new algx(((ahuv) this.b).a, obj2))) {
                return aneh.a;
            }
            return ((ahta) this.d).b().a(((ahvp) this.c).c);
        }
        ajza ajzaVar = (ajza) obj;
        boolean contains = ((aogy) this.a).d.contains(ajzaVar.b.i);
        ?? r3 = this.c;
        Object obj3 = this.d;
        if (!contains) {
            if (ajzaVar.c != 3) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Can't auto-select disabled accounts.");
        }
        Object obj4 = this.b;
        albo.U(((ajxb) obj4).a.compareAndSet(false, true), "AccountOperationContext is already in the mutable state. This may be caused by concurrent access to the object, which is forbidden.");
        ucz uczVar = new ucz(obj4, 13, null);
        try {
            ListenableFuture c = r3.c((ajwt) obj3);
            uczVar.close();
            return ancj.f(c, akto.a(new abdo(obj3, obj4, 18)), andi.a);
        } catch (Throwable th) {
            try {
                uczVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ ajym(aogy aogyVar, List list, Intent intent, ListenableFuture listenableFuture, int i) {
        this.e = i;
        this.b = aogyVar;
        this.a = list;
        this.d = intent;
        this.c = listenableFuture;
    }

    public /* synthetic */ ajym(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, akry akryVar, ListenableFuture listenableFuture3, int i) {
        this.e = i;
        this.b = listenableFuture;
        this.c = listenableFuture2;
        this.d = akryVar;
        this.a = listenableFuture3;
    }

    public /* synthetic */ ajym(String str, ahuv ahuvVar, ahta ahtaVar, ahvp ahvpVar, int i) {
        this.e = i;
        this.a = str;
        this.b = ahuvVar;
        this.d = ahtaVar;
        this.c = ahvpVar;
    }
}
