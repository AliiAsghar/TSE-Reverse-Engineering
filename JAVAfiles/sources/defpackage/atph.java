package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atph implements ator {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public atph(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, arpe] */
    @Override // defpackage.ator
    public final void a(atoo atooVar, atqo atqoVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((ance) this.a).set(atqoVar);
                    return;
                }
                if (atqoVar.c()) {
                    ((ance) this.a).set(atqoVar.b);
                    return;
                } else {
                    ((ance) this.a).setException(new atra(atqoVar));
                    return;
                }
            }
            if (atqoVar.c()) {
                Object obj = atqoVar.b;
                if (obj == null) {
                    Object cast = atpg.class.cast(atooVar.a().e.get(atpg.class));
                    cast.getClass();
                    Method method = ((atpg) cast).a;
                    this.a.w(aqil.O(new armk("Response from " + method.getDeclaringClass().getName() + "." + method.getName() + " was null but response body type was declared as non-null")));
                    return;
                }
                this.a.w(obj);
                return;
            }
            this.a.w(aqil.O(new atpc(atqoVar)));
            return;
        }
        this.a.w(atqoVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arpe] */
    @Override // defpackage.ator
    public final void b(Throwable th) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((ance) this.a).setException(th);
                    return;
                } else {
                    ((ance) this.a).setException(th);
                    return;
                }
            }
            this.a.w(aqil.O(th));
            return;
        }
        this.a.w(aqil.O(th));
    }
}
