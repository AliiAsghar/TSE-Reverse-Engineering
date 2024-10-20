package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjy implements clc {
    private static boolean a = true;
    private final ViewGroup b;
    private final Object c = new Object();
    private con d;

    public cjy(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    private final con c(ViewGroup viewGroup) {
        con conVar = this.d;
        if (conVar == null) {
            coo cooVar = new coo(viewGroup.getContext());
            viewGroup.addView(cooVar);
            this.d = cooVar;
            return cooVar;
        }
        return conVar;
    }

    @Override // defpackage.clc
    public final cof a() {
        cog cokVar;
        cof cofVar;
        synchronized (this.c) {
            ViewGroup viewGroup = this.b;
            if (Build.VERSION.SDK_INT >= 29) {
                viewGroup.getUniqueDrawingId();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                cokVar = new coj(new cks(), new cnr());
            } else if (a) {
                try {
                    cokVar = new coi(this.b, new cks(), new cnr());
                } catch (Throwable unused) {
                    a = false;
                    cokVar = new cok(c(this.b));
                }
            } else {
                cokVar = new cok(c(this.b));
            }
            cofVar = new cof(cokVar);
        }
        return cofVar;
    }

    @Override // defpackage.clc
    public final void b(cof cofVar) {
        synchronized (this.c) {
            if (!cofVar.j) {
                cofVar.j = true;
                cofVar.e();
            }
        }
    }
}
