package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyw extends alyx {
    private final ansy[] a;

    public alyw(ansy[] ansyVarArr) {
        this.a = ansyVarArr;
    }

    @Override // defpackage.alyx
    public final alyx a(alyx alyxVar) {
        int b = alyxVar.b();
        if (b == 0) {
            return this;
        }
        ansy[] ansyVarArr = this.a;
        int length = ansyVarArr.length;
        if (length == 0) {
            return alyxVar;
        }
        ansy[] ansyVarArr2 = (ansy[]) Arrays.copyOf(ansyVarArr, length + b);
        for (int i = 0; i < b; i++) {
            ansyVarArr2[this.a.length + i] = alyxVar.f(i);
        }
        return new alyw(ansyVarArr2);
    }

    @Override // defpackage.alxa
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.alxa
    public final Object d(alvz alvzVar) {
        ansy ansyVar;
        alzz.c(!alvzVar.b, "metadata key must be single valued");
        int length = this.a.length;
        do {
            length--;
            if (length >= 0) {
                ansyVar = this.a[length];
            } else {
                return null;
            }
        } while (!((alvz) ansyVar.b).equals(alvzVar));
        return ansyVar.a;
    }

    @Override // defpackage.alyx
    public final ansy f(int i) {
        return this.a[i];
    }
}
