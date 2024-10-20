package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import defpackage.gew;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] g;
    public final CharSequence[] h;
    public final Set i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969348(0x7f040304, float:1.7547375E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.dyv.d(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.i = r1
            int[] r1 = defpackage.gfy.f
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = defpackage.dyv.l(r4, r5, r2)
            r3.g = r5
            r5 = 3
            r0 = 1
            java.lang.CharSequence[] r5 = defpackage.dyv.l(r4, r5, r0)
            r3.h = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable e = super.e();
        if (this.v) {
            return e;
        }
        gew gewVar = new gew(e);
        gewVar.a = this.i;
        return gewVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(gew.class)) {
            super.g(parcelable);
            return;
        }
        gew gewVar = (gew) parcelable;
        super.g(gewVar.getSuperState());
        k(gewVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        k(v((Set) obj));
    }

    public final void k(Set set) {
        this.i.clear();
        this.i.addAll(set);
        if (V() && !set.equals(v(null))) {
            SharedPreferences.Editor b = this.k.b();
            b.putStringSet(this.s, set);
            super.O(b);
        }
        d();
    }
}
