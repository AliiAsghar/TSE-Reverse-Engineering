package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class deh extends arrp implements arqg<arnb> {
    final /* synthetic */ czt a;
    final /* synthetic */ dei b;
    final /* synthetic */ deg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deh(czt cztVar, dei deiVar, deg degVar) {
        super(0);
        this.a = cztVar;
        this.b = deiVar;
        this.c = degVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        this.a.removeOnAttachStateChangeListener(this.b);
        ((ArrayList) ego.c(this.a).a).remove(this.c);
        return arnb.a;
    }
}
