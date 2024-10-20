package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hft implements hfh {
    public final String a;
    public final heu b;
    public final List c;
    public final het d;
    public final hew e;
    public final heu f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public hft(String str, heu heuVar, List list, het hetVar, hew hewVar, heu heuVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = heuVar;
        this.c = list;
        this.d = hetVar;
        this.e = hewVar;
        this.f = heuVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.hfh
    public final hbz a(hbl hblVar, hbb hbbVar, hfw hfwVar) {
        return new hcp(hblVar, hfwVar, this);
    }
}
