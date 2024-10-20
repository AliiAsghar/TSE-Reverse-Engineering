package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.a;
import defpackage.dyv;
import defpackage.fyk;
import defpackage.gfm;
import defpackage.gfu;
import defpackage.gfy;
import defpackage.vl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final vl a;
    public final List b;
    public boolean c;
    public int d;
    private final Handler e;
    private boolean f;
    private int g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void ag(Preference preference) {
        synchronized (this) {
            super.P();
            if (preference.A == this) {
                preference.w(null);
            }
            if (this.b.remove(preference)) {
                String str = preference.s;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.eS()));
                    this.e.removeCallbacks(this.h);
                    this.e.post(this.h);
                }
                if (this.c) {
                    preference.D();
                }
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.F();
        this.c = true;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).B();
        }
    }

    @Override // androidx.preference.Preference
    public final void D() {
        super.P();
        this.c = false;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).D();
        }
    }

    public final void ab() {
        synchronized (this) {
            List list = this.b;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ag((Preference) list.get(0));
                }
            }
        }
        A();
    }

    public final void ac(int i) {
        if (i != Integer.MAX_VALUE && !S()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.d = i;
    }

    public boolean ad() {
        return true;
    }

    public final void ae(Preference preference) {
        long a;
        if (!this.b.contains(preference)) {
            if (preference.s != null) {
                PreferenceGroup preferenceGroup = this;
                while (true) {
                    PreferenceGroup preferenceGroup2 = preferenceGroup.A;
                    if (preferenceGroup2 == null) {
                        break;
                    } else {
                        preferenceGroup = preferenceGroup2;
                    }
                }
                String str = preference.s;
                if (preferenceGroup.l(str) != null) {
                    Log.e("PreferenceGroup", a.bW(str, "Found duplicated key: \"", "\". This can cause unintended behaviour, please use unique keys for every preference."));
                }
            }
            if (preference.p == Integer.MAX_VALUE) {
                if (this.f) {
                    int i = this.g;
                    this.g = i + 1;
                    preference.I(i);
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).f = this.f;
                }
            }
            int binarySearch = Collections.binarySearch(this.b, preference);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            preference.X(j());
            synchronized (this) {
                this.b.add(binarySearch, preference);
            }
            gfu gfuVar = this.k;
            String str2 = preference.s;
            if (str2 != null && this.a.containsKey(str2)) {
                a = ((Long) this.a.get(str2)).longValue();
                this.a.remove(str2);
            } else {
                a = gfuVar.a();
            }
            preference.l = a;
            preference.m = true;
            try {
                preference.C(gfuVar);
                preference.m = false;
                preference.w(this);
                if (this.c) {
                    preference.B();
                }
                A();
            } catch (Throwable th) {
                preference.m = false;
                throw th;
            }
        }
    }

    public final void af(Preference preference) {
        ag(preference);
        A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable e() {
        return new gfm(super.e(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(gfm.class)) {
            super.g(parcelable);
            return;
        }
        gfm gfmVar = (gfm) parcelable;
        this.d = gfmVar.a;
        super.g(gfmVar.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        Preference l;
        if (charSequence != null) {
            if (TextUtils.equals(this.s, charSequence)) {
                return this;
            }
            int k = k();
            for (int i = 0; i < k; i++) {
                Preference o = o(i);
                if (TextUtils.equals(o.s, charSequence)) {
                    return o;
                }
                if ((o instanceof PreferenceGroup) && (l = ((PreferenceGroup) o).l(charSequence)) != null) {
                    return l;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public final Preference o(int i) {
        return (Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void x(Bundle bundle) {
        super.x(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).x(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void y(Bundle bundle) {
        super.y(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).y(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void z(boolean z) {
        super.z(z);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).X(z);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new vl();
        this.e = new Handler(Looper.getMainLooper());
        this.f = true;
        this.g = 0;
        this.c = false;
        this.d = Integer.MAX_VALUE;
        this.h = new fyk(this, 10, null);
        this.b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gfy.i, i, i2);
        this.f = dyv.j(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            ac(dyv.m(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }
}
