package defpackage;

import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzm {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public boolean c;
    private final Class d;

    public akzm(Class cls) {
        this.d = cls;
    }

    public final akzo a() {
        return new akzo(DesugarCollections.unmodifiableList(this.a), this.b, this.c, this.d);
    }

    public final void b(Enum... enumArr) {
        DesugarArrays.stream(enumArr).forEach(new akzl(this, 0));
        this.c = true;
    }
}
