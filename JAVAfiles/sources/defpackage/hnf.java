package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnf implements hnn {
    private final Collection b;

    @SafeVarargs
    public hnf(hnn... hnnVarArr) {
        this.b = Arrays.asList(hnnVarArr);
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((hnn) it.next()).a(messageDigest);
        }
    }

    @Override // defpackage.hnn
    public final hpt b(Context context, hpt hptVar, int i, int i2) {
        Iterator it = this.b.iterator();
        hpt hptVar2 = hptVar;
        while (it.hasNext()) {
            hpt b = ((hnn) it.next()).b(context, hptVar2, i, i2);
            if (hptVar2 != null && !hptVar2.equals(hptVar) && !hptVar2.equals(b)) {
                hptVar2.e();
            }
            hptVar2 = b;
        }
        return hptVar2;
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hnf) {
            return this.b.equals(((hnf) obj).b);
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return this.b.hashCode();
    }
}
