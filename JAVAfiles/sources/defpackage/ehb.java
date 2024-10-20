package defpackage;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ehb extends BaseAdapter implements Filterable, ehc {
    private ehd a;
    public final boolean c = true;
    public Cursor d = null;
    public boolean b = false;
    public int e = -1;
    public final egz f = new egz(this);
    public final DataSetObserver g = new eha(this);

    @Override // defpackage.ehc
    public Cursor a(CharSequence charSequence) {
        throw null;
    }

    @Override // defpackage.ehc
    public CharSequence b(Cursor cursor) {
        throw null;
    }

    @Override // defpackage.ehc
    public void d(Cursor cursor) {
        throw null;
    }

    public abstract void e(View view, Cursor cursor);

    public abstract View f(ViewGroup viewGroup);

    @Override // defpackage.ehc
    public final Cursor g() {
        return this.d;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null) {
            cursor.moveToPosition(i);
            if (view == null) {
                view = h(viewGroup);
            }
            e(view, this.d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.a == null) {
            this.a = new ehd(this);
        }
        return this.a;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null) {
            cursor.moveToPosition(i);
            return this.d;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null && cursor.moveToPosition(i)) {
            return this.d.getLong(this.e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.b) {
            Cursor cursor = this.d;
            if (cursor != null) {
                if (cursor.moveToPosition(i)) {
                    if (view == null) {
                        view = f(viewGroup);
                    }
                    e(view, this.d);
                    return view;
                }
                throw new IllegalStateException(a.bV(i, "couldn't move cursor to position "));
            }
            throw new IllegalStateException("this should only be called when the cursor is non-null");
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public View h(ViewGroup viewGroup) {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
