package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfp extends no {
    public List c;
    private final PreferenceGroup d;
    private List e;
    private final List f;
    private final Runnable h = new fyk(this, 11, null);
    private final Handler g = new Handler(Looper.getMainLooper());

    public gfp(PreferenceGroup preferenceGroup) {
        this.d = preferenceGroup;
        preferenceGroup.C = this;
        this.e = new ArrayList();
        this.c = new ArrayList();
        this.f = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            A(((PreferenceScreen) preferenceGroup).e);
        } else {
            A(true);
        }
        F();
    }

    private final List H(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int k = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            Preference o = preferenceGroup.o(i2);
            if (o.w) {
                if (J(preferenceGroup) && i >= preferenceGroup.d) {
                    arrayList2.add(o);
                } else {
                    arrayList.add(o);
                }
                if (!(o instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                    if (!preferenceGroup2.ad()) {
                        continue;
                    } else {
                        if (J(preferenceGroup) && J(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : H(preferenceGroup2)) {
                            if (J(preferenceGroup) && i >= preferenceGroup.d) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i++;
                        }
                    }
                }
            }
        }
        if (J(preferenceGroup) && i > preferenceGroup.d) {
            ges gesVar = new ges(preferenceGroup.j, arrayList2, preferenceGroup.eS());
            gesVar.o = new gfn(this, preferenceGroup);
            arrayList.add(gesVar);
        }
        return arrayList;
    }

    private final void I(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int k = preferenceGroup.k();
        for (int i = 0; i < k; i++) {
            Preference o = preferenceGroup.o(i);
            list.add(o);
            gfo gfoVar = new gfo(o);
            if (!this.f.contains(gfoVar)) {
                this.f.add(gfoVar);
            }
            if (o instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                if (preferenceGroup2.ad()) {
                    I(list, preferenceGroup2);
                }
            }
            o.C = this;
        }
    }

    private static final boolean J(PreferenceGroup preferenceGroup) {
        if (preferenceGroup.d != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final void F() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).C = null;
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        this.e = arrayList;
        I(arrayList, this.d);
        this.c = H(this.d);
        gfu gfuVar = this.d.k;
        p();
        for (Preference preference : this.e) {
        }
    }

    public final void G() {
        this.g.removeCallbacks(this.h);
        this.g.post(this.h);
    }

    @Override // defpackage.no
    public final int b() {
        return this.c.size();
    }

    @Override // defpackage.no
    public final int c(int i) {
        gfo gfoVar = new gfo(m(i));
        int indexOf = this.f.indexOf(gfoVar);
        if (indexOf != -1) {
            return indexOf;
        }
        List list = this.f;
        int size = list.size();
        list.add(gfoVar);
        return size;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        gfo gfoVar = (gfo) this.f.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, gfy.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = d.f(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(gfoVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = gfoVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new gfx(inflate);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        gfx gfxVar = (gfx) ooVar;
        View view = gfxVar.a;
        Preference m = m(i);
        Drawable background = view.getBackground();
        Drawable drawable = gfxVar.s;
        if (background != drawable) {
            gfxVar.a.setBackground(drawable);
        }
        TextView textView = (TextView) gfxVar.D(R.id.title);
        if (textView != null && gfxVar.t != null && !textView.getTextColors().equals(gfxVar.t)) {
            textView.setTextColor(gfxVar.t);
        }
        m.a(gfxVar);
    }

    @Override // defpackage.no
    public final long gI(int i) {
        if (!this.a) {
            return -1L;
        }
        return m(i).eS();
    }

    public final Preference m(int i) {
        if (i >= 0 && i < b()) {
            return (Preference) this.c.get(i);
        }
        return null;
    }
}
