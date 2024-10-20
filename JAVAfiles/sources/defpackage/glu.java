package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glu extends glm {
    private glm[] A;
    ArrayList v;
    int w;
    boolean x;
    private boolean y;
    private int z;

    public glu(byte[] bArr) {
        this();
        this.y = false;
        f(new glf(2));
        f(new gld());
        f(new glf(1));
    }

    private final void K(glm glmVar) {
        this.v.add(glmVar);
        glmVar.f = this;
    }

    private final void L(glm[] glmVarArr) {
        Arrays.fill(glmVarArr, (Object) null);
        this.A = glmVarArr;
    }

    private final glm[] M() {
        glm[] glmVarArr = this.A;
        this.A = null;
        if (glmVarArr == null) {
            glmVarArr = new glm[this.v.size()];
        }
        return (glm[]) this.v.toArray(glmVarArr);
    }

    @Override // defpackage.glm
    public final /* bridge */ /* synthetic */ void D(long j) {
        ArrayList arrayList;
        this.b = j;
        if (this.b >= 0 && (arrayList = this.v) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((glm) this.v.get(i)).D(j);
            }
        }
    }

    @Override // defpackage.glm
    public final /* bridge */ /* synthetic */ void E(TimeInterpolator timeInterpolator) {
        this.z |= 1;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((glm) this.v.get(i)).E(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    @Override // defpackage.glm
    public final void F() {
        this.z |= 2;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((glm) this.v.get(i)).F();
        }
    }

    @Override // defpackage.glm
    public final /* synthetic */ void G(long j) {
        this.a = j;
    }

    @Override // defpackage.glm
    public final void H(ViewGroup viewGroup, gpx gpxVar, gpx gpxVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.a;
        int size = this.v.size();
        int i = 0;
        while (i < size) {
            glm glmVar = (glm) this.v.get(i);
            if (j > 0) {
                if (!this.y) {
                    if (i == 0) {
                        i = 0;
                    }
                }
                long j2 = glmVar.a;
                if (j2 > 0) {
                    glmVar.G(j2 + j);
                } else {
                    glmVar.G(j);
                }
            }
            glmVar.H(viewGroup, gpxVar, gpxVar2, arrayList, arrayList2);
            i++;
        }
    }

    @Override // defpackage.glm
    public final void I(gvf gvfVar) {
        this.t = gvfVar;
        this.z |= 8;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((glm) this.v.get(i)).I(gvfVar);
        }
    }

    @Override // defpackage.glm
    public final void J(gvf gvfVar) {
        super.J(gvfVar);
        this.z |= 4;
        if (this.v != null) {
            for (int i = 0; i < this.v.size(); i++) {
                ((glm) this.v.get(i)).J(gvfVar);
            }
        }
    }

    @Override // defpackage.glm
    public final void b(glw glwVar) {
        if (A(glwVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                glm glmVar = (glm) arrayList.get(i);
                if (glmVar.A(glwVar.b)) {
                    glmVar.b(glwVar);
                    glwVar.c.add(glmVar);
                }
            }
        }
    }

    @Override // defpackage.glm
    public final void c(glw glwVar) {
        if (A(glwVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                glm glmVar = (glm) arrayList.get(i);
                if (glmVar.A(glwVar.b)) {
                    glmVar.c(glwVar);
                    glwVar.c.add(glmVar);
                }
            }
        }
    }

    @Override // defpackage.glm
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    public final glm e(int i) {
        if (i >= 0 && i < this.v.size()) {
            return (glm) this.v.get(i);
        }
        return null;
    }

    public final void f(glm glmVar) {
        K(glmVar);
        long j = this.b;
        if (j >= 0) {
            glmVar.D(j);
        }
        if ((this.z & 1) != 0) {
            glmVar.E(this.c);
        }
        if ((this.z & 2) != 0) {
            glmVar.F();
        }
        if ((this.z & 4) != 0) {
            glmVar.J(this.u);
        }
        if ((this.z & 8) != 0) {
            glmVar.I(this.t);
        }
    }

    @Override // defpackage.glm
    /* renamed from: h */
    public final glm clone() {
        glu gluVar = (glu) super.clone();
        gluVar.v = new ArrayList();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            gluVar.K(((glm) this.v.get(i)).clone());
        }
        return gluVar;
    }

    @Override // defpackage.glm
    public final String l(String str) {
        String l = super.l(str);
        for (int i = 0; i < this.v.size(); i++) {
            l = l + "\n" + ((glm) this.v.get(i)).l(str.concat("  "));
        }
        return l;
    }

    @Override // defpackage.glm
    public final void n(glw glwVar) {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((glm) this.v.get(i)).n(glwVar);
        }
    }

    @Override // defpackage.glm
    public final void s(View view) {
        super.s(view);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((glm) this.v.get(i)).s(view);
        }
    }

    @Override // defpackage.glm
    public final void t() {
        this.o = 0L;
        gls glsVar = new gls(this);
        for (int i = 0; i < this.v.size(); i++) {
            glm glmVar = (glm) this.v.get(i);
            glmVar.B(glsVar);
            glmVar.t();
            long j = glmVar.o;
            if (this.y) {
                this.o = Math.max(this.o, j);
            } else {
                long j2 = this.o;
                glmVar.q = j2;
                this.o = j2 + j;
            }
        }
    }

    @Override // defpackage.glm
    public final void u(View view) {
        super.u(view);
        glm[] M = M();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            M[i].u(view);
        }
        L(M);
    }

    @Override // defpackage.glm
    protected final void v() {
        if (!this.v.isEmpty()) {
            glt gltVar = new glt(this);
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((glm) arrayList.get(i)).B(gltVar);
            }
            this.w = this.v.size();
            if (!this.y) {
                for (int i2 = 1; i2 < this.v.size(); i2++) {
                    ((glm) this.v.get(i2 - 1)).B(new glr((glm) this.v.get(i2)));
                }
                glm glmVar = (glm) this.v.get(0);
                if (glmVar != null) {
                    glmVar.v();
                    return;
                }
                return;
            }
            ArrayList arrayList2 = this.v;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((glm) arrayList2.get(i3)).v();
            }
            return;
        }
        x();
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.glm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glu.w(long, long):void");
    }

    @Override // defpackage.glm
    public final boolean y() {
        for (int i = 0; i < this.v.size(); i++) {
            if (((glm) this.v.get(i)).y()) {
                return true;
            }
        }
        return false;
    }

    public glu() {
        this.v = new ArrayList();
        this.y = true;
        this.x = false;
        this.z = 0;
    }
}
