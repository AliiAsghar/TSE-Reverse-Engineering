package defpackage;

import android.text.Layout;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frs {
    public static final Comparator a = new ebn(12);
    public final esz b;
    public final int c;

    public frs(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        esy esyVar = new esy();
        esyVar.a = charSequence;
        esyVar.c = alignment;
        esyVar.c(f, 0);
        esyVar.e = i;
        esyVar.f = f2;
        esyVar.g = i2;
        esyVar.h = -3.4028235E38f;
        if (z) {
            esyVar.e(i3);
        }
        this.b = esyVar.a();
        this.c = i4;
    }
}
