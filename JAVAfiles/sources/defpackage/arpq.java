package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arpq implements Serializable, arpe, arpt {
    public final arpe A;

    public arpq(arpe arpeVar) {
        this.A = arpeVar;
    }

    protected abstract Object b(Object obj);

    public arpe c(Object obj, arpe arpeVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.arpt
    public arpt dJ() {
        arpe arpeVar = this.A;
        if (arpeVar instanceof arpt) {
            return (arpt) arpeVar;
        }
        return null;
    }

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    @Override // defpackage.arpe
    public final void w(Object obj) {
        arpe arpeVar = this;
        while (true) {
            arpeVar.getClass();
            arpq arpqVar = (arpq) arpeVar;
            arpe arpeVar2 = arpqVar.A;
            arpeVar2.getClass();
            try {
                obj = arpqVar.b(obj);
                if (obj == arpl.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = aqil.O(th);
            }
            arpqVar.g();
            if (arpeVar2 instanceof arpq) {
                arpeVar = arpeVar2;
            } else {
                arpeVar2.w(obj);
                return;
            }
        }
    }

    @Override // defpackage.arpt
    public void dK() {
    }

    protected void g() {
    }
}
