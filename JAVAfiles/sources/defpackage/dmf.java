package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmf implements dme {
    private static final Typeface c(String str, dlx dlxVar, int i) {
        Typeface create;
        Typeface create2;
        if (a.bA(i, 0) && d.F(dlxVar, dlx.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        create2 = Typeface.create(create, dlxVar.h, a.bA(i, 1));
        return create2;
    }

    @Override // defpackage.dme
    public final Typeface a(dlx dlxVar, int i) {
        return c(null, dlxVar, i);
    }

    @Override // defpackage.dme
    public final Typeface b(dlz dlzVar, dlx dlxVar, int i) {
        return c(dlzVar.d, dlxVar, i);
    }
}
