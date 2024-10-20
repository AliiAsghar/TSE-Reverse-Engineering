package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuo implements flu {
    public final List a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public flw e;
    public int f;
    public boolean g;
    public int h;
    public final ghw i;
    private final int j;
    private final euf k;
    private final SparseIntArray l;
    private final frj m;
    private final ful n;
    private boolean o;
    private boolean p;
    private int q;
    private flk r;

    @Deprecated
    public fuo() {
        this(1, frj.a, new euj(0L), new ghw((byte[]) null, (byte[]) null, (char[]) null));
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        if (this.j == 0) {
            flwVar = new frm(flwVar, this.m);
        }
        this.e = flwVar;
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        flk flkVar;
        dzg.d(true);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            euj eujVar = (euj) this.a.get(i);
            if (eujVar.f() != -9223372036854775807L) {
                long d = eujVar.d();
                if (d != -9223372036854775807L) {
                    if (d != 0) {
                        if (d == j2) {
                        }
                    }
                }
            }
            eujVar.i(j2);
        }
        if (j2 != 0 && (flkVar = this.r) != null) {
            flkVar.a(j2);
        }
        this.k.F(0);
        this.l.clear();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            ((fur) this.b.valueAt(i2)).c();
        }
        this.q = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.flv r7) {
        /*
            r6 = this;
            euf r0 = r6.k
            byte[] r0 = r0.a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.j(r0, r2, r1)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L1f
            int r1 = r1 + 1
            goto Lb
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r7.m(r1)
            r7 = 1
            return r7
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuo.g(flv):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x02b4, code lost:
    
        if (r2 == false) goto L150;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.flv r28, defpackage.vtk r29) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuo.i(flv, vtk):int");
    }

    public fuo(int i, frj frjVar, euj eujVar, ghw ghwVar) {
        this.i = ghwVar;
        this.j = i;
        this.m = frjVar;
        this.a = Collections.singletonList(eujVar);
        this.k = new euf(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.c = sparseBooleanArray;
        this.d = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        this.l = new SparseIntArray();
        this.n = new ful();
        this.e = flw.y;
        this.h = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b.put(sparseArray2.keyAt(i2), (fur) sparseArray2.valueAt(i2));
        }
        this.b.put(0, new fui(new fum(this)));
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
