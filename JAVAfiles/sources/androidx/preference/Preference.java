package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.dyv;
import defpackage.gez;
import defpackage.gfa;
import defpackage.gfb;
import defpackage.gfc;
import defpackage.gfd;
import defpackage.gfp;
import defpackage.gft;
import defpackage.gfu;
import defpackage.gfy;
import defpackage.jh;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public PreferenceGroup A;
    public gfd B;
    public gfp C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private List J;
    private boolean K;
    private gfc L;
    private final View.OnClickListener M;
    private CharSequence a;
    private Drawable b;
    private Bundle c;
    private boolean d;
    private boolean e;
    private String f;
    private Object g;
    private boolean h;
    private boolean i;
    public final Context j;
    public gfu k;
    public long l;
    public boolean m;
    public gfa n;
    public gfb o;
    public int p;
    public CharSequence q;
    public int r;
    public String s;
    public Intent t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public Preference(Context context) {
        this(context, null);
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    k(viewGroup.getChildAt(childCount), z);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A() {
        gfp gfpVar = this.C;
        if (gfpVar != null) {
            gfpVar.G();
        }
    }

    public void B() {
        F();
    }

    public final void C(gfu gfuVar) {
        this.k = gfuVar;
        if (!this.m) {
            this.l = gfuVar.a();
        }
        if (V() && q().contains(this.s)) {
            h(null);
            return;
        }
        Object obj = this.g;
        if (obj != null) {
            h(obj);
        }
    }

    public void D() {
        P();
    }

    public final void E() {
        Intent intent;
        gft gftVar;
        if (T() && this.e) {
            c();
            gfb gfbVar = this.o;
            if (gfbVar == null || !gfbVar.a(this)) {
                gfu gfuVar = this.k;
                if ((gfuVar == null || (gftVar = gfuVar.c) == null || !gftVar.aM(this)) && (intent = this.t) != null) {
                    this.j.startActivity(intent);
                }
            }
        }
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        Preference s = s(this.f);
        if (s != null) {
            if (s.J == null) {
                s.J = new ArrayList();
            }
            s.J.add(this);
            W(s.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f + "\" not found for preference \"" + this.s + "\" (title: \"" + ((Object) this.q) + "\"");
    }

    public final void G(boolean z) {
        if (this.d != z) {
            this.d = z;
            z(j());
            d();
        }
    }

    public final void H(Drawable drawable) {
        if (this.b != drawable) {
            this.b = drawable;
            this.r = 0;
            d();
        }
    }

    public final void I(int i) {
        if (i != this.p) {
            this.p = i;
            A();
        }
    }

    public final void J(int i) {
        n(this.j.getString(i));
    }

    public final void K(gfd gfdVar) {
        this.B = gfdVar;
        d();
    }

    public final void L(int i) {
        M(this.j.getString(i));
    }

    public final void M(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.q)) {
            this.q = charSequence;
            d();
        }
    }

    public final void N(boolean z) {
        if (this.w != z) {
            this.w = z;
            gfp gfpVar = this.C;
            if (gfpVar != null) {
                gfpVar.G();
            }
        }
    }

    public final void O(SharedPreferences.Editor editor) {
        if (!this.k.a) {
            editor.apply();
        }
    }

    public final void P() {
        Preference s;
        List list;
        String str = this.f;
        if (str != null && (s = s(str)) != null && (list = s.J) != null) {
            list.remove(this);
        }
    }

    public final boolean Q(Object obj) {
        gfa gfaVar = this.n;
        if (gfaVar != null && !gfaVar.a(this, obj)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean R(boolean z) {
        if (!V()) {
            return z;
        }
        return this.k.c().getBoolean(this.s, z);
    }

    public final boolean S() {
        if (!TextUtils.isEmpty(this.s)) {
            return true;
        }
        return false;
    }

    public boolean T() {
        if (this.d && this.h && this.i) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        gfu gfuVar;
        if (!this.w || (gfuVar = this.k) == null) {
            return false;
        }
        if (this != gfuVar.b) {
            PreferenceGroup preferenceGroup = this.A;
            if (preferenceGroup == null) {
                return false;
            }
            return preferenceGroup.U();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean V() {
        if (this.k != null && this.v && S()) {
            return true;
        }
        return false;
    }

    public final void W(boolean z) {
        if (this.h == z) {
            this.h = !z;
            z(j());
            d();
        }
    }

    public final void X(boolean z) {
        if (this.i == z) {
            this.i = !z;
            z(j());
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y(String str) {
        if (V() && !TextUtils.equals(str, u(null))) {
            SharedPreferences.Editor b = this.k.b();
            b.putString(this.s, str);
            O(b);
        }
    }

    public final void Z() {
        if (this.H) {
            this.H = false;
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.gfx r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.a(gfx):void");
    }

    public final void aa() {
        this.F = true;
        this.G = false;
    }

    public void b(View view) {
        E();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.p;
        int i2 = preference2.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference2.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.q.toString());
    }

    public void d() {
        int indexOf;
        gfp gfpVar = this.C;
        if (gfpVar != null && (indexOf = gfpVar.c.indexOf(this)) != -1) {
            gfpVar.r(indexOf, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcelable e() {
        this.K = true;
        return gez.EMPTY_STATE;
    }

    public long eS() {
        return this.l;
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(Parcelable parcelable) {
        this.K = true;
        if (parcelable != gez.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean j() {
        if (!T()) {
            return true;
        }
        return false;
    }

    public CharSequence m() {
        gfd gfdVar = this.B;
        if (gfdVar != null) {
            return gfdVar.a(this);
        }
        return this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.B == null) {
            if (!TextUtils.equals(this.a, charSequence)) {
                this.a = charSequence;
                d();
                return;
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int p(int i) {
        if (!V()) {
            return i;
        }
        return this.k.c().getInt(this.s, i);
    }

    public final SharedPreferences q() {
        gfu gfuVar = this.k;
        if (gfuVar != null) {
            return gfuVar.c();
        }
        return null;
    }

    public final Bundle r() {
        if (this.c == null) {
            this.c = new Bundle();
        }
        return this.c;
    }

    protected final Preference s(String str) {
        gfu gfuVar = this.k;
        if (gfuVar == null) {
            return null;
        }
        return gfuVar.d(str);
    }

    public CharSequence t() {
        return this.q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence t = t();
        if (!TextUtils.isEmpty(t)) {
            sb.append(t);
            sb.append(' ');
        }
        CharSequence m = m();
        if (!TextUtils.isEmpty(m)) {
            sb.append(m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public final String u(String str) {
        if (!V()) {
            return str;
        }
        return this.k.c().getString(this.s, str);
    }

    public final Set v(Set set) {
        if (!V()) {
            return set;
        }
        return this.k.c().getStringSet(this.s, set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.A != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.A = preferenceGroup;
    }

    public void x(Bundle bundle) {
        Parcelable parcelable;
        if (S() && (parcelable = bundle.getParcelable(this.s)) != null) {
            this.K = false;
            g(parcelable);
            if (!this.K) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void y(Bundle bundle) {
        if (S()) {
            this.K = false;
            Parcelable e = e();
            if (this.K) {
                if (e != null) {
                    bundle.putParcelable(this.s, e);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
    }

    public void z(boolean z) {
        List list = this.J;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).W(z);
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dyv.d(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Integer.MAX_VALUE;
        this.d = true;
        this.e = true;
        this.v = true;
        this.h = true;
        this.i = true;
        this.w = true;
        this.D = true;
        this.E = true;
        this.G = true;
        this.I = true;
        this.y = R.layout.preference;
        this.M = new jh(this, 9);
        this.j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gfy.g, i, i2);
        this.r = dyv.f(obtainStyledAttributes, 23, 0, 0);
        this.s = dyv.i(obtainStyledAttributes, 26, 6);
        this.q = dyv.h(obtainStyledAttributes, 34, 4);
        this.a = dyv.h(obtainStyledAttributes, 33, 7);
        this.p = dyv.m(obtainStyledAttributes, 28, 8);
        this.u = dyv.i(obtainStyledAttributes, 22, 13);
        this.y = dyv.f(obtainStyledAttributes, 27, 3, R.layout.preference);
        this.z = dyv.f(obtainStyledAttributes, 35, 9, 0);
        this.d = dyv.j(obtainStyledAttributes, 21, 2, true);
        this.e = dyv.j(obtainStyledAttributes, 30, 5, true);
        this.v = dyv.j(obtainStyledAttributes, 29, 1, true);
        this.f = dyv.i(obtainStyledAttributes, 19, 10);
        this.D = dyv.j(obtainStyledAttributes, 16, 16, this.e);
        this.E = dyv.j(obtainStyledAttributes, 17, 17, this.e);
        if (obtainStyledAttributes.hasValue(18)) {
            this.g = f(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.g = f(obtainStyledAttributes, 11);
        }
        this.I = dyv.j(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.F = hasValue;
        if (hasValue) {
            this.G = dyv.j(obtainStyledAttributes, 32, 14, true);
        }
        this.H = dyv.j(obtainStyledAttributes, 24, 15, false);
        this.w = dyv.j(obtainStyledAttributes, 25, 25, true);
        this.x = dyv.j(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }

    protected void c() {
    }

    protected void h(Object obj) {
    }
}
