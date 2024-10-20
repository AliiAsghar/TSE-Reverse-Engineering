package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arpk implements arpe, arpt {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(arpk.class, Object.class, "result");
    private final arpe b;
    private volatile Object result;

    public arpk(arpe arpeVar, Object obj) {
        this.b = arpeVar;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        arpl arplVar = arpl.b;
        if (obj == arplVar) {
            if (d.o(a, this, arplVar, arpl.a)) {
                return arpl.a;
            }
            obj = this.result;
        }
        if (obj == arpl.c) {
            return arpl.a;
        }
        if (!(obj instanceof armp)) {
            return obj;
        }
        throw ((armp) obj).a;
    }

    @Override // defpackage.arpt
    public final arpt dJ() {
        arpe arpeVar = this.b;
        if (arpeVar instanceof arpt) {
            return (arpt) arpeVar;
        }
        return null;
    }

    public final String toString() {
        arpe arpeVar = this.b;
        Objects.toString(arpeVar);
        return "SafeContinuation for ".concat(arpeVar.toString());
    }

    @Override // defpackage.arpe
    public final arpi u() {
        return this.b.u();
    }

    @Override // defpackage.arpe
    public final void w(Object obj) {
        while (true) {
            Object obj2 = this.result;
            arpl arplVar = arpl.b;
            if (obj2 == arplVar) {
                if (d.o(a, this, arplVar, obj)) {
                    return;
                }
            } else {
                arpl arplVar2 = arpl.a;
                if (obj2 == arplVar2) {
                    if (d.o(a, this, arplVar2, arpl.c)) {
                        this.b.w(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public arpk(arpe arpeVar) {
        this(arpeVar, arpl.b);
    }

    @Override // defpackage.arpt
    public final void dK() {
    }
}
