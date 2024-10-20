package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byf {
    public static final byd a(arpi arpiVar) {
        byd bydVar = (byd) arpiVar.get(byd.e);
        if (bydVar != null) {
            return bydVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(arqr arqrVar, arpe arpeVar) {
        return a(arpeVar.u()).a(new bye(arqrVar), arpeVar);
    }

    public static final Object c(arqr arqrVar, arpe arpeVar) {
        return a(arpeVar.u()).a(arqrVar, arpeVar);
    }
}
