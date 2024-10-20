package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sy extends sz implements Iterator {
    sw a;
    sw b;

    public sy(sw swVar, sw swVar2) {
        this.a = swVar2;
        this.b = swVar;
    }

    private final sw d() {
        sw swVar = this.b;
        sw swVar2 = this.a;
        if (swVar != swVar2 && swVar2 != null) {
            return b(swVar);
        }
        return null;
    }

    public abstract sw a(sw swVar);

    public abstract sw b(sw swVar);

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        sw swVar = this.b;
        this.b = d();
        return swVar;
    }

    @Override // defpackage.sz
    public final void dI(sw swVar) {
        if (this.a == swVar && swVar == this.b) {
            this.b = null;
            this.a = null;
        }
        sw swVar2 = this.a;
        if (swVar2 == swVar) {
            this.a = a(swVar2);
        }
        if (this.b == swVar) {
            this.b = d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
