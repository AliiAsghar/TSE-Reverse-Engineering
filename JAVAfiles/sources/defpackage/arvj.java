package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvj implements arvn {
    private final arvi[] a;

    public arvj(arvi[] arviVarArr) {
        this.a = arviVarArr;
    }

    public final void a() {
        int i = 0;
        while (true) {
            arvi[] arviVarArr = this.a;
            if (i < arviVarArr.length) {
                arwu arwuVar = arviVarArr[i].a;
                if (arwuVar == null) {
                    arro.b("handle");
                    arwuVar = null;
                }
                arwuVar.hd();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.arvn
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + "]";
    }
}
