package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arui implements artx, artr {
    public final artx a;
    public final int b;
    private final /* synthetic */ int c;

    public arui(artx artxVar, int i, int i2) {
        this.c = i2;
        this.a = artxVar;
        this.b = i;
    }

    @Override // defpackage.artx
    public final Iterator a() {
        if (this.c != 0) {
            return new artq(this, 0, null);
        }
        return new artq(this, 2);
    }

    @Override // defpackage.artr
    public final artx b(int i) {
        if (this.c != 0) {
            int i2 = this.b + i;
            if (i2 < 0) {
                return new arui(this, i, 1);
            }
            return new arui(this.a, i2, 1);
        }
        int i3 = this.b;
        if (i >= i3) {
            return arts.a;
        }
        return new aruh(this.a, i, i3);
    }

    @Override // defpackage.artr
    public final artx c(int i) {
        if (this.c != 0) {
            int i2 = this.b;
            int i3 = i2 + i;
            if (i3 < 0) {
                return new arui(this, i, 0);
            }
            return new aruh(this.a, i2, i3);
        }
        if (i >= this.b) {
            return this;
        }
        return new arui(this.a, i, 0);
    }
}
