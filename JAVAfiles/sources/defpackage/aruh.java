package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aruh implements artx, artr {
    public final artx a;
    public final int b;
    public final int c;

    public aruh(artx artxVar, int i, int i2) {
        this.a = artxVar;
        this.b = i;
        this.c = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i2 >= i) {
                    return;
                } else {
                    throw new IllegalArgumentException(a.bU(i, i2, "endIndex should be not less than startIndex, but was ", " < "));
                }
            }
            throw new IllegalArgumentException(a.bV(i2, "endIndex should be non-negative, but is "));
        }
        throw new IllegalArgumentException(a.bV(i, "startIndex should be non-negative, but is "));
    }

    private final int d() {
        return this.c - this.b;
    }

    @Override // defpackage.artx
    public final Iterator a() {
        return new arug(this);
    }

    @Override // defpackage.artr
    public final artx b(int i) {
        if (i >= d()) {
            return arts.a;
        }
        return new aruh(this.a, this.b + i, this.c);
    }

    @Override // defpackage.artr
    public final artx c(int i) {
        if (i >= d()) {
            return this;
        }
        artx artxVar = this.a;
        int i2 = this.b;
        return new aruh(artxVar, i2, i + i2);
    }
}
