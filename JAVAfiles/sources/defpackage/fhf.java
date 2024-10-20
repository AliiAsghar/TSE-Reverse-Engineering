package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhf extends fge {
    private static final ere d;
    private final fgx[] e;
    private final erz[] f;
    private final ArrayList g;
    private int h = -1;
    private long[][] i = new long[0];
    private fhe j;

    static {
        equ equVar = new equ();
        equVar.a = "MergingMediaSource";
        d = equVar.a();
    }

    public fhf(fgx... fgxVarArr) {
        this.e = fgxVarArr;
        this.g = new ArrayList(Arrays.asList(fgxVarArr));
        this.f = new erz[fgxVarArr.length];
        new HashMap();
        albo.x(8, "expectedKeys");
        new alsa().b().f();
    }

    @Override // defpackage.fgx
    public final ere F() {
        fgx[] fgxVarArr = this.e;
        if (fgxVarArr.length > 0) {
            return fgxVarArr[0].F();
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fge, defpackage.ffv
    public final void i(ewc ewcVar) {
        super.i(ewcVar);
        int i = 0;
        while (true) {
            fgx[] fgxVarArr = this.e;
            if (i < fgxVarArr.length) {
                z(Integer.valueOf(i), fgxVarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fge, defpackage.ffv
    public final void l() {
        super.l();
        Arrays.fill(this.f, (Object) null);
        this.h = -1;
        this.j = null;
        this.g.clear();
        Collections.addAll(this.g, this.e);
    }

    @Override // defpackage.ffv, defpackage.fgx
    public final void o(ere ereVar) {
        this.e[0].o(ereVar);
    }

    @Override // defpackage.fge, defpackage.fgx
    public final void t() {
        fhe fheVar = this.j;
        if (fheVar == null) {
            super.t();
            return;
        }
        throw fheVar;
    }

    @Override // defpackage.fgx
    public final void v(fgt fgtVar) {
        fhd fhdVar = (fhd) fgtVar;
        int i = 0;
        while (true) {
            fgx[] fgxVarArr = this.e;
            if (i < fgxVarArr.length) {
                fgx fgxVar = fgxVarArr[i];
                fgt fgtVar2 = fhdVar.a[i];
                if (fgtVar2 instanceof fib) {
                    fgtVar2 = ((fib) fgtVar2).a;
                }
                fgxVar.v(fgtVar2);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.fgx
    public final fgt w(fgv fgvVar, fjl fjlVar, long j) {
        erz[] erzVarArr = this.f;
        int length = this.e.length;
        fgt[] fgtVarArr = new fgt[length];
        int a = erzVarArr[0].a(fgvVar.a);
        for (int i = 0; i < length; i++) {
            fgtVarArr[i] = this.e[i].w(fgvVar.a(this.f[i].f(a)), fjlVar, j - this.i[a][i]);
        }
        return new fhd(this.i[a], fgtVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fge
    public final /* bridge */ /* synthetic */ fgv x(Object obj, fgv fgvVar) {
        if (((Integer) obj).intValue() == 0) {
            return fgvVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fge
    public final /* bridge */ /* synthetic */ void y(Object obj, fgx fgxVar, erz erzVar) {
        int i;
        if (this.j == null) {
            if (this.h == -1) {
                i = erzVar.b();
                this.h = i;
            } else {
                int b = erzVar.b();
                int i2 = this.h;
                if (b != i2) {
                    this.j = new fhe();
                    return;
                }
                i = i2;
            }
            if (this.i.length == 0) {
                this.i = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, this.f.length);
            }
            this.g.remove(fgxVar);
            this.f[((Integer) obj).intValue()] = erzVar;
            if (this.g.isEmpty()) {
                j(this.f[0]);
            }
        }
    }
}
