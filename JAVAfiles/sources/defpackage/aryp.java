package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aryp extends arwb {
    public static final aryp a = new aryp();

    private aryp() {
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        aryt arytVar = (aryt) arpiVar.get(aryt.b);
        if (arytVar != null) {
            arytVar.a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // defpackage.arwb
    public final boolean ey(arpi arpiVar) {
        return false;
    }

    @Override // defpackage.arwb
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
