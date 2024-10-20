package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqe implements fmo {
    public static final fqe c = new fqe();
    public static final fqe a = new fqe();
    public static final fqe b = new fqe();

    public fqe() {
    }

    public fqe(int[] iArr) {
        if (iArr != null) {
            new anbm(Arrays.copyOf(iArr, iArr.length));
        } else {
            int i = anbm.a;
        }
    }
}
