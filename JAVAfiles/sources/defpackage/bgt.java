package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgt<T> implements bge<T> {
    private final Map a;

    public bgt(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgt)) {
            return false;
        }
        return d.F(this.a, ((bgt) obj).a);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }

    @Override // defpackage.bge
    public final void a() {
    }

    @Override // defpackage.bge
    public final void b() {
    }
}
