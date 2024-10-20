package defpackage;

import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjx extends eal {
    final /* synthetic */ ajka a;
    final /* synthetic */ ajjz b;

    public ajjx(ajjz ajjzVar, ajka ajkaVar) {
        this.a = ajkaVar;
        this.b = ajjzVar;
    }

    @Override // defpackage.eal
    public final void a(int i) {
        this.b.o = true;
        this.a.a(i);
    }

    @Override // defpackage.eal
    public final void b(Typeface typeface) {
        ajjz ajjzVar = this.b;
        ajjzVar.m = Typeface.create(typeface, ajjzVar.d);
        this.b.o = true;
        this.a.b(this.b.m, false);
    }
}
