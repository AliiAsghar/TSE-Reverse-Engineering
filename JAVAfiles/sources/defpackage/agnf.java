package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agnf implements agns {
    public final agne a;
    public final boolean b;
    private final String c;
    private final List d;

    public agnf(int[] iArr, String str, agne agneVar) {
        this(iArr, false, str, agneVar);
    }

    @Override // defpackage.agns
    public final int a() {
        return ((Integer) this.d.get(0)).intValue();
    }

    @Override // defpackage.agns
    public final int b() {
        return 2;
    }

    @Override // defpackage.agns
    public final agnr c(agnw agnwVar) {
        return new agnd(this, new wob(this, ((Integer) this.d.remove(0)).intValue(), agnwVar, 8));
    }

    @Override // defpackage.agns
    public final String d() {
        return this.c;
    }

    @Override // defpackage.agns
    public final boolean e() {
        if (!this.d.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agns
    public final boolean f() {
        return false;
    }

    public agnf(int[] iArr, boolean z, String str, agne agneVar) {
        this.d = new ArrayList();
        this.c = str;
        this.b = z;
        for (int i : iArr) {
            this.d.add(Integer.valueOf(i));
        }
        this.a = agneVar;
    }
}
