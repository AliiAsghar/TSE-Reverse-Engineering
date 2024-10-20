package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v7.widget.ActivityChooserView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ke extends BaseAdapter {
    public jz a;
    public int b = 4;
    public boolean c;
    public final /* synthetic */ ActivityChooserView d;
    private boolean e;
    private boolean f;

    public ke(ActivityChooserView activityChooserView) {
        this.d = activityChooserView;
    }

    public final int a() {
        return this.a.a();
    }

    public final ResolveInfo b() {
        return this.a.d();
    }

    public final void c(int i) {
        if (this.b != i) {
            this.b = i;
            notifyDataSetChanged();
        }
    }

    public final void d(boolean z, boolean z2) {
        if (this.c == z && this.e == z2) {
            return;
        }
        this.c = z;
        this.e = z2;
        notifyDataSetChanged();
    }

    public final void e(boolean z) {
        if (this.f != z) {
            this.f = z;
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int a = this.a.a();
        if (!this.c && this.a.d() != null) {
            a--;
        }
        int min = Math.min(a, this.b);
        if (this.f) {
            return min + 1;
        }
        return min;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (getItemViewType(i) != 0) {
            return null;
        }
        if (!this.c && this.a.d() != null) {
            i++;
        }
        return this.a.c(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (this.f && i == getCount() - 1) {
            return 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (getItemViewType(i) != 0) {
            if (view != null && view.getId() == 1) {
                return view;
            }
            View inflate = LayoutInflater.from(this.d.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            inflate.setId(1);
            ((TextView) inflate.findViewById(R.id.title)).setText(this.d.getContext().getString(R.string.abc_activity_chooser_view_see_all));
            return inflate;
        }
        if (view == null || view.getId() != R.id.list_item) {
            view = LayoutInflater.from(this.d.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
        }
        PackageManager packageManager = this.d.getContext().getPackageManager();
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
        imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
        ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
        if (this.c && i == 0 && this.e) {
            view.setActivated(true);
        } else {
            view.setActivated(false);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }
}
