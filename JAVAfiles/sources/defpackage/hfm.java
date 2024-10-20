package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfm implements hfh {
    public final String a;
    public final hfe b;
    public final hfe c;
    public final heu d;
    public final boolean e;

    public hfm(String str, hfe hfeVar, hfe hfeVar2, heu heuVar, boolean z) {
        this.a = str;
        this.b = hfeVar;
        this.c = hfeVar2;
        this.d = heuVar;
        this.e = z;
    }

    @Override // defpackage.hfh
    public final hbz a(hbl hblVar, hbb hbbVar, hfw hfwVar) {
        return new hcl(hblVar, hfwVar, this);
    }

    public final String toString() {
        hfe hfeVar = this.c;
        return "RectangleShape{position=" + String.valueOf(this.b) + ", size=" + String.valueOf(hfeVar) + "}";
    }
}
