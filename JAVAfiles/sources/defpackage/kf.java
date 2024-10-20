package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kf implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
    final /* synthetic */ ActivityChooserView a;

    public kf(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        int i = 0;
        if (view == activityChooserView.f) {
            activityChooserView.d();
            ke keVar = this.a.a;
            ResolveInfo b = keVar.b();
            jz jzVar = keVar.a;
            synchronized (jzVar.b) {
                jzVar.f();
                List list = jzVar.c;
                int size = list.size();
                while (true) {
                    if (i < size) {
                        if (((jv) list.get(i)).a == b) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
            }
            Intent b2 = this.a.a.a.b(i);
            if (b2 != null) {
                b2.addFlags(524288);
                this.a.getContext().startActivity(b2);
                return;
            }
            return;
        }
        if (view == activityChooserView.d) {
            activityChooserView.j = false;
            activityChooserView.b(activityChooserView.k);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        eco ecoVar = this.a.h;
        if (ecoVar != null) {
            ecoVar.subUiVisibilityChanged(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        float f;
        if (((ke) adapterView.getAdapter()).getItemViewType(i) != 0) {
            this.a.b(Integer.MAX_VALUE);
            return;
        }
        this.a.d();
        ActivityChooserView activityChooserView = this.a;
        if (activityChooserView.j) {
            if (i > 0) {
                jz jzVar = activityChooserView.a.a;
                synchronized (jzVar.b) {
                    jzVar.f();
                    jv jvVar = (jv) jzVar.c.get(i);
                    jv jvVar2 = (jv) jzVar.c.get(0);
                    if (jvVar2 != null) {
                        f = (jvVar2.b - jvVar.b) + 5.0f;
                    } else {
                        f = 1.0f;
                    }
                    jzVar.g(new jw(new ComponentName(jvVar.a.activityInfo.packageName, jvVar.a.activityInfo.name), System.currentTimeMillis(), f));
                }
                return;
            }
            return;
        }
        ke keVar = activityChooserView.a;
        if (!keVar.c) {
            i++;
        }
        Intent b = keVar.a.b(i);
        if (b != null) {
            b.addFlags(524288);
            this.a.getContext().startActivity(b);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        if (view == activityChooserView.f) {
            if (activityChooserView.a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = this.a;
                activityChooserView2.j = true;
                activityChooserView2.b(activityChooserView2.k);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }
}
