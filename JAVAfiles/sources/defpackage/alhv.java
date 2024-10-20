package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alhv<F, T> implements Serializable, alhr {
    private static final long serialVersionUID = 0;
    final algk a;
    final alhr b;

    public alhv(algk algkVar, alhr alhrVar) {
        this.a = algkVar;
        alhrVar.getClass();
        this.b = alhrVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alhv) {
            alhv alhvVar = (alhv) obj;
            if (this.a.equals(alhvVar.a) && this.b.equals(alhvVar.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alhr
    public final T get() {
        return (T) this.a.apply(this.b.get());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        alhr alhrVar = this.b;
        return "Suppliers.compose(" + this.a.toString() + ", " + alhrVar.toString() + ")";
    }
}
