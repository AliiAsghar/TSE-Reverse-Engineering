package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gnd {
    public final DataSetObservable f = new DataSetObservable();
    public DataSetObserver g;

    public Parcelable a() {
        throw null;
    }

    public Object c(ViewGroup viewGroup, int i) {
        throw null;
    }

    public void d(ViewGroup viewGroup, int i, Object obj) {
        throw null;
    }

    public void e(Parcelable parcelable, ClassLoader classLoader) {
        throw null;
    }

    public abstract boolean g(View view, Object obj);

    public abstract int j();

    public CharSequence k(int i) {
        return null;
    }

    public final void l(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.g = dataSetObserver;
        }
    }

    public void h() {
    }

    public void f(ViewGroup viewGroup) {
    }

    public void i(Object obj) {
    }
}
