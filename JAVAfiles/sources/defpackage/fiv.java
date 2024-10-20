package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiv extends ese {
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final SparseArray R;
    public final SparseBooleanArray S;

    static {
        new fiv(new fiu());
        eul.M(1000);
        eul.M(1001);
        eul.M(1002);
        eul.M(1003);
        eul.M(1004);
        eul.M(1005);
        eul.M(1006);
        eul.M(1007);
        eul.M(1008);
        eul.M(1009);
        eul.M(1010);
        eul.M(1011);
        eul.M(1012);
        eul.M(1013);
        eul.M(1014);
        eul.M(1015);
        eul.M(1016);
        eul.M(1017);
        eul.M(1018);
    }

    public fiv(fiu fiuVar) {
        super(fiuVar);
        this.C = fiuVar.t;
        this.D = false;
        this.E = fiuVar.u;
        this.F = false;
        this.G = fiuVar.v;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = fiuVar.w;
        this.M = fiuVar.x;
        this.N = fiuVar.y;
        this.O = false;
        this.P = fiuVar.z;
        this.Q = false;
        this.R = fiuVar.A;
        this.S = fiuVar.B;
    }

    public final boolean a(int i) {
        return this.S.get(i);
    }

    @Override // defpackage.ese
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fiv fivVar = (fiv) obj;
            if (super.equals(fivVar) && this.C == fivVar.C && this.E == fivVar.E && this.G == fivVar.G && this.L == fivVar.L && this.M == fivVar.M && this.N == fivVar.N && this.P == fivVar.P) {
                SparseBooleanArray sparseBooleanArray = this.S;
                SparseBooleanArray sparseBooleanArray2 = fivVar.S;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray sparseArray = this.R;
                            SparseArray sparseArray2 = fivVar.R;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                fid fidVar = (fid) entry.getKey();
                                                if (map2.containsKey(fidVar) && Objects.equals(entry.getValue(), map2.get(fidVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ese
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 961) + (this.E ? 1 : 0)) * 961) + (this.G ? 1 : 0)) * 28629151) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 961) + (this.P ? 1 : 0)) * 31;
    }
}
