package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.Collection;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akui extends ArrayAdapter {
    final /* synthetic */ ArrayAdapter a;
    final /* synthetic */ String b = "SimPickerDialogAdapter";
    final /* synthetic */ ahmn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akui(ahmn ahmnVar, Context context, ArrayAdapter arrayAdapter) {
        super(context, -1);
        this.a = arrayAdapter;
        this.c = ahmnVar;
    }

    @Override // android.widget.ArrayAdapter
    public final void add(Object obj) {
        this.a.add(obj);
    }

    @Override // android.widget.ArrayAdapter
    public final void addAll(Collection collection) {
        this.a.addAll(collection);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.a.areAllItemsEnabled();
    }

    @Override // android.widget.ArrayAdapter
    public final void clear() {
        this.a.clear();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public final CharSequence[] getAutofillOptions() {
        CharSequence[] autofillOptions;
        autofillOptions = this.a.getAutofillOptions();
        return autofillOptions;
    }

    @Override // android.widget.ArrayAdapter
    public final Context getContext() {
        return this.a.getContext();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.a.getCount();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return this.a.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.ArrayAdapter, android.widget.ThemedSpinnerAdapter
    public final Resources.Theme getDropDownViewTheme() {
        return this.a.getDropDownViewTheme();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return this.a.getFilter();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return this.a.getItem(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return this.a.getItemId(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.a.getItemViewType(i);
    }

    @Override // android.widget.ArrayAdapter
    public final int getPosition(Object obj) {
        return this.a.getPosition(obj);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (akqj.u()) {
            return this.a.getView(i, view, viewGroup);
        }
        akrc d = ((aksr) this.c.a).d(this.b.concat(":getView"));
        try {
            View view2 = this.a.getView(i, view, viewGroup);
            d.close();
            return view2;
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.a.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return this.a.hasStableIds();
    }

    @Override // android.widget.ArrayAdapter
    public final void insert(Object obj, int i) {
        this.a.insert(obj, i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.a.isEnabled(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.a.notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        this.a.notifyDataSetInvalidated();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.ArrayAdapter
    public final void remove(Object obj) {
        this.a.remove(obj);
    }

    @Override // android.widget.BaseAdapter
    public final void setAutofillOptions(CharSequence... charSequenceArr) {
        this.a.setAutofillOptions(charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter
    public final void setDropDownViewResource(int i) {
        this.a.setDropDownViewResource(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.ThemedSpinnerAdapter
    public final void setDropDownViewTheme(Resources.Theme theme) {
        this.a.setDropDownViewTheme(theme);
    }

    @Override // android.widget.ArrayAdapter
    public final void setNotifyOnChange(boolean z) {
        this.a.setNotifyOnChange(z);
    }

    @Override // android.widget.ArrayAdapter
    public final void sort(Comparator comparator) {
        this.a.sort(comparator);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.unregisterDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.ArrayAdapter
    public final void addAll(Object... objArr) {
        this.a.addAll(objArr);
    }
}
