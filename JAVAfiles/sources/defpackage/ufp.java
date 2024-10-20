package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ufp extends ugi {
    public ufp(String str, int i, int i2, int i3, int i4) {
        super(ydk.h(str), i, i2, i3, i4, true, false, false, 0);
    }

    @Override // defpackage.ugi, defpackage.ufs, defpackage.ufx
    public final ufw f(Context context) {
        return new ufo(context, this);
    }

    @Override // defpackage.ugi, defpackage.ufs
    public final String g() {
        String g = super.g();
        if (g == null) {
            return null;
        }
        return g.concat("|false");
    }
}
