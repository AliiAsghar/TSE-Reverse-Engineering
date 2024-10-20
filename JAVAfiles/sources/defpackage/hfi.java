package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfi implements hfh {
    public final Path.FillType a;
    public final hev b;
    public final hew c;
    public final hey d;
    public final hey e;
    public final String f;
    public final boolean g;
    public final int h;

    public hfi(String str, int i, Path.FillType fillType, hev hevVar, hew hewVar, hey heyVar, hey heyVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = hevVar;
        this.c = hewVar;
        this.d = heyVar;
        this.e = heyVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.hfh
    public final hbz a(hbl hblVar, hbb hbbVar, hfw hfwVar) {
        return new hce(hblVar, hbbVar, hfwVar, this);
    }
}
