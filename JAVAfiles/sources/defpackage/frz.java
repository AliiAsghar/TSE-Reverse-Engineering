package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frz implements frc {
    private final List a;

    public frz(List list) {
        this.a = list;
    }

    @Override // defpackage.frc
    public final int a() {
        return 1;
    }

    @Override // defpackage.frc
    public final int b(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.frc
    public final long c(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return 0L;
    }

    @Override // defpackage.frc
    public final List e(long j) {
        if (j >= 0) {
            return this.a;
        }
        return Collections.emptyList();
    }
}
