package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfq implements hfh {
    public final Path.FillType a;
    public final String b;
    public final het c;
    public final hew d;
    public final boolean e;
    private final boolean f;

    public hfq(String str, boolean z, Path.FillType fillType, het hetVar, hew hewVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = hetVar;
        this.d = hewVar;
        this.e = z2;
    }

    @Override // defpackage.hfh
    public final hbz a(hbl hblVar, hbb hbbVar, hfw hfwVar) {
        return new hcd(hblVar, hfwVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + "}";
    }
}
