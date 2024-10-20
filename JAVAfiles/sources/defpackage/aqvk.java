package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqvk implements aqvm {
    final int a;
    final aqvm[] b;
    private final int c;

    private aqvk(int i, aqvm[] aqvmVarArr, int i2) {
        this.a = i;
        this.b = aqvmVarArr;
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqvm b(aqvm aqvmVar, int i, aqvm aqvmVar2, int i2, int i3) {
        aqvm aqvmVar3;
        int f = f(i, i3);
        int f2 = f(i2, i3);
        if (f == f2) {
            aqvm b = b(aqvmVar, i, aqvmVar2, i2, i3 + 5);
            return new aqvk(f, new aqvm[]{b}, ((aqvk) b).c);
        }
        int g = g(i, i3);
        int g2 = g(i2, i3);
        if (g > g2) {
            aqvmVar3 = aqvmVar;
        } else {
            aqvmVar3 = aqvmVar2;
        }
        if (g > g2) {
            aqvmVar = aqvmVar2;
        }
        return new aqvk(f | f2, new aqvm[]{aqvmVar, aqvmVar3}, aqvmVar.a() + aqvmVar3.a());
    }

    private final int e(int i) {
        return Integer.bitCount((i - 1) & this.a);
    }

    private static int f(int i, int i2) {
        return 1 << g(i, i2);
    }

    private static int g(int i, int i2) {
        return (i >>> i2) & 31;
    }

    @Override // defpackage.aqvm
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aqvm
    public final aqvm c(Object obj, Object obj2, int i, int i2) {
        int i3 = this.a;
        int f = f(i, i2);
        int e = e(f);
        if ((i3 & f) == 0) {
            int i4 = i3 | f;
            aqvm[] aqvmVarArr = this.b;
            aqvm[] aqvmVarArr2 = new aqvm[aqvmVarArr.length + 1];
            System.arraycopy(aqvmVarArr, 0, aqvmVarArr2, 0, e);
            aqvmVarArr2[e] = new aqvl(obj, obj2, 0);
            aqvm[] aqvmVarArr3 = this.b;
            System.arraycopy(aqvmVarArr3, e, aqvmVarArr2, e + 1, aqvmVarArr3.length - e);
            return new aqvk(i4, aqvmVarArr2, this.c + 1);
        }
        aqvm[] aqvmVarArr4 = this.b;
        aqvm[] aqvmVarArr5 = (aqvm[]) Arrays.copyOf(aqvmVarArr4, aqvmVarArr4.length);
        aqvm c = this.b[e].c(obj, obj2, i, i2 + 5);
        aqvmVarArr5[e] = c;
        return new aqvk(this.a, aqvmVarArr5, (this.c + c.a()) - this.b[e].a());
    }

    @Override // defpackage.aqvm
    public final Object d(Object obj, int i, int i2) {
        int i3 = this.a;
        int f = f(i, i2);
        if ((i3 & f) == 0) {
            return null;
        }
        return this.b[e(f)].d(obj, i, i2 + 5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.a)));
        for (aqvm aqvmVar : this.b) {
            sb.append(aqvmVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
