package defpackage;

import android.database.Observable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class np extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((nq) this.mObservers.get(size)).dz();
            } else {
                return;
            }
        }
    }

    public final void b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((nq) this.mObservers.get(size)).dF(i, i2);
            } else {
                return;
            }
        }
    }

    public final void c(int i, int i2) {
        d(i, i2, null);
    }

    public final void d(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((nq) this.mObservers.get(size)).dB(i, i2, obj);
            } else {
                return;
            }
        }
    }

    public final void e(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((nq) this.mObservers.get(size)).dC(i, i2);
            } else {
                return;
            }
        }
    }

    public final void f(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((nq) this.mObservers.get(size)).dD(i, i2);
            } else {
                return;
            }
        }
    }

    public final void g() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((nq) this.mObservers.get(size)).dE();
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        if (!this.mObservers.isEmpty()) {
            return true;
        }
        return false;
    }
}
