package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class asdg {
    private int a;
    private asee b;
    public asdi[] d;
    public int e;

    public final ascv b() {
        asee aseeVar;
        synchronized (this) {
            aseeVar = this.b;
            if (aseeVar == null) {
                aseeVar = new asee(this.e);
                this.b = aseeVar;
            }
        }
        return aseeVar;
    }

    protected abstract asdi j();

    protected abstract asdi[] m();

    /* JADX INFO: Access modifiers changed from: protected */
    public final asdi n() {
        asdi asdiVar;
        asee aseeVar;
        synchronized (this) {
            asdi[] asdiVarArr = this.d;
            if (asdiVarArr == null) {
                asdiVarArr = m();
                this.d = asdiVarArr;
            } else {
                int i = this.e;
                int length = asdiVarArr.length;
                if (i >= length) {
                    Object[] copyOf = Arrays.copyOf(asdiVarArr, length + length);
                    copyOf.getClass();
                    asdiVarArr = (asdi[]) copyOf;
                    this.d = asdiVarArr;
                }
            }
            int i2 = this.a;
            do {
                asdiVar = asdiVarArr[i2];
                if (asdiVar == null) {
                    asdiVar = j();
                    asdiVarArr[i2] = asdiVar;
                }
                i2++;
                if (i2 >= asdiVarArr.length) {
                    i2 = 0;
                }
            } while (!asdiVar.a(this));
            this.a = i2;
            this.e++;
            aseeVar = this.b;
        }
        if (aseeVar != null) {
            aseeVar.p(1);
        }
        return asdiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(asdi asdiVar) {
        asee aseeVar;
        int i;
        arpe[] b;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            aseeVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            asdiVar.getClass();
            b = asdiVar.b(this);
        }
        for (arpe arpeVar : b) {
            if (arpeVar != null) {
                arpeVar.w(arnb.a);
            }
        }
        if (aseeVar != null) {
            aseeVar.p(-1);
        }
    }
}
