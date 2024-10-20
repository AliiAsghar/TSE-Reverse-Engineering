package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddu implements czc {
    public final int a;
    public Float b = null;
    public Float c = null;
    public dgw d = null;
    public dgw e = null;
    private final List f;

    public ddu(int i, List list) {
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.czc
    public final boolean J() {
        return this.f.contains(this);
    }
}
