package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.geq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969391(0x7f04032f, float:1.7547463E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.dyv.d(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.gfy.d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = defpackage.dyv.j(r4, r2, r2, r2)
            if (r5 == 0) goto L2b
            geu r5 = defpackage.geu.b
            if (r5 != 0) goto L26
            geu r5 = new geu
            r0 = 1
            r5.<init>(r0)
            defpackage.geu.b = r5
        L26:
            geu r5 = defpackage.geu.b
            r3.K(r5)
        L2b:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable e() {
        Parcelable e = super.e();
        if (this.v) {
            return e;
        }
        geq geqVar = new geq(e);
        geqVar.a = this.g;
        return geqVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(geq.class)) {
            super.g(parcelable);
            return;
        }
        geq geqVar = (geq) parcelable;
        super.g(geqVar.getSuperState());
        i(geqVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(u((String) obj));
    }

    public final void i(String str) {
        boolean j = j();
        this.g = str;
        Y(str);
        boolean j2 = j();
        if (j2 != j) {
            z(j2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        if (!TextUtils.isEmpty(this.g) && !super.j()) {
            return false;
        }
        return true;
    }
}
