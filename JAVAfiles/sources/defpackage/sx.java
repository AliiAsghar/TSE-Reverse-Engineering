package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sx extends sz implements Iterator {
    final /* synthetic */ ta a;
    private sw b;
    private boolean c = true;

    public sx(ta taVar) {
        this.a = taVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        sw swVar;
        if (this.c) {
            this.c = false;
            swVar = this.a.b;
        } else {
            sw swVar2 = this.b;
            if (swVar2 != null) {
                swVar = swVar2.c;
            } else {
                swVar = null;
            }
        }
        this.b = swVar;
        return this.b;
    }

    @Override // defpackage.sz
    public final void dI(sw swVar) {
        boolean z;
        sw swVar2 = this.b;
        if (swVar == swVar2) {
            sw swVar3 = swVar2.d;
            this.b = swVar3;
            if (swVar3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            if (this.a.b != null) {
                return true;
            }
            return false;
        }
        sw swVar = this.b;
        if (swVar != null && swVar.c != null) {
            return true;
        }
        return false;
    }
}
