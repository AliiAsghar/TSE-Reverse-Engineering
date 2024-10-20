package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kw extends ml {
    final /* synthetic */ la a;
    final /* synthetic */ ld b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(ld ldVar, View view, la laVar) {
        super(view);
        this.b = ldVar;
        this.a = laVar;
    }

    @Override // defpackage.ml
    public final iz a() {
        return this.a;
    }

    @Override // defpackage.ml
    public final boolean b() {
        if (!this.b.b.u()) {
            this.b.b();
            return true;
        }
        return true;
    }
}
