package defpackage;

import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajwq {
    public od a;
    public ol b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ SpannedGridLayoutManager i;

    public ajwq(SpannedGridLayoutManager spannedGridLayoutManager) {
        this.i = spannedGridLayoutManager;
    }

    public final boolean a() {
        int i;
        if (this.f) {
            i = this.i.a.c(this.c);
            this.c = i;
        } else {
            ajwr ajwrVar = this.i.a;
            int i2 = this.c;
            int a = ajwrVar.a(i2);
            while (i2 > 0 && ajwrVar.a(i2) == a) {
                i2--;
            }
            if (ajwrVar.a(i2) == a) {
                i = -1;
            } else {
                i = i2;
            }
            this.c = i;
        }
        return this.i.a.f(i);
    }
}
