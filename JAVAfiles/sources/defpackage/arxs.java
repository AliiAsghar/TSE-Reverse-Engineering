package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arxs implements arxi {
    public final aryb a;
    private final arve c;
    public final arvb b = new arvb(false, arvf.a);
    private final arve d = new arve(null, arvf.a);

    public arxs(aryb arybVar, Throwable th) {
        this.a = arybVar;
        this.c = new arve(th, arvf.a);
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    public final void e(Throwable th) {
        Throwable d = d();
        if (d == null) {
            this.c.c(th);
            return;
        }
        if (th != d) {
            Object c = c();
            if (c == null) {
                f(th);
                return;
            }
            if (c instanceof Throwable) {
                if (th != c) {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(c);
                    arrayList.add(th);
                    f(arrayList);
                    return;
                }
                return;
            }
            if (c instanceof ArrayList) {
                ((ArrayList) c).add(th);
            } else {
                Objects.toString(c);
                throw new IllegalStateException("State is ".concat(c.toString()));
            }
        }
    }

    public final void f(Object obj) {
        this.d.c(obj);
    }

    public final boolean g() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.b.b();
    }

    @Override // defpackage.arxi
    public final aryb hc() {
        return this.a;
    }

    @Override // defpackage.arxi
    public final boolean he() {
        if (d() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + "]";
    }
}
