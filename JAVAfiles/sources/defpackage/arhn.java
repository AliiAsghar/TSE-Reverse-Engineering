package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arhn {
    public static final arhn a = new arhn(new aqae[0]);
    public final aqae[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public arhn(aqae[] aqaeVarArr) {
        this.b = aqaeVarArr;
    }

    public static /* synthetic */ void f(arhn arhnVar) {
        int i = 0;
        while (true) {
            aqae[] aqaeVarArr = arhnVar.b;
            if (i < aqaeVarArr.length) {
                aqae aqaeVar = aqaeVarArr[i];
                i++;
            } else {
                return;
            }
        }
    }

    public static arhn g(aqrx[] aqrxVarArr, aqrm aqrmVar) {
        arhn arhnVar = new arhn(aqrxVarArr);
        for (aqrx aqrxVar : aqrxVarArr) {
            aqrxVar.d(aqrmVar);
        }
        return arhnVar;
    }

    public final void a() {
        int i = 0;
        while (true) {
            aqae[] aqaeVarArr = this.b;
            if (i < aqaeVarArr.length) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void b(long j) {
        int i = 0;
        while (true) {
            aqae[] aqaeVarArr = this.b;
            if (i < aqaeVarArr.length) {
                aqaeVarArr[i].b(j);
                i++;
            } else {
                return;
            }
        }
    }

    public final void c(long j) {
        int i = 0;
        while (true) {
            aqae[] aqaeVarArr = this.b;
            if (i < aqaeVarArr.length) {
                aqaeVarArr[i].c(j);
                i++;
            } else {
                return;
            }
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            aqae[] aqaeVarArr = this.b;
            if (i < aqaeVarArr.length) {
                ((aqrx) aqaeVarArr[i]).a();
                i++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            aqae[] aqaeVarArr = this.b;
            if (i < aqaeVarArr.length) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void h() {
        if (this.c.compareAndSet(false, true)) {
            for (aqae aqaeVar : this.b) {
                aqaeVar.e();
            }
        }
    }
}
