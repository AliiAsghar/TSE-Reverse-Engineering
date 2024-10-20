package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gha implements ghg {
    final /* synthetic */ adfg a;

    public gha(adfg adfgVar) {
        this.a = adfgVar;
    }

    @Override // defpackage.ghg
    public final void a() {
        adfg adfgVar = this.a;
        synchronized (adfgVar.d) {
            if (adfgVar.a > 0) {
                Log.w("OperationMonitor", "Resetting OperationMonitor with " + adfgVar.a + " active operations.");
            }
            adfgVar.a = 0;
            adfgVar.i();
        }
    }

    @Override // defpackage.ghg
    public final boolean b() {
        boolean z;
        adfg adfgVar = this.a;
        synchronized (adfgVar.d) {
            synchronized (adfgVar.d) {
                if (adfgVar.a > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        return z;
    }
}
