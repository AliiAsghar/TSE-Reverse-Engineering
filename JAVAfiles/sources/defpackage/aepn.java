package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepn implements PointerInputEventHandler {
    final /* synthetic */ arsb a;
    final /* synthetic */ aepp b;
    final /* synthetic */ Context c;
    final /* synthetic */ arwe d;
    final /* synthetic */ byn e;
    final /* synthetic */ cpm f;
    final /* synthetic */ byn g;
    final /* synthetic */ byn h;
    final /* synthetic */ arqr i;

    public aepn(arsb arsbVar, aepp aeppVar, Context context, arwe arweVar, byn bynVar, cpm cpmVar, byn bynVar2, byn bynVar3, arqr arqrVar) {
        this.a = arsbVar;
        this.b = aeppVar;
        this.c = context;
        this.d = arweVar;
        this.e = bynVar;
        this.f = cpmVar;
        this.g = bynVar2;
        this.h = bynVar3;
        this.i = arqrVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
        arsb arsbVar = this.a;
        byn bynVar = this.e;
        aepp aeppVar = this.b;
        Context context = this.c;
        cpm cpmVar = this.f;
        Object g = aik.g(crkVar, null, new aepl(arsbVar, aeppVar, context, this.d, bynVar, cpmVar, 0), new aepm(arsbVar, this.g, this.h, bynVar, aeppVar, cpmVar, null), new aaop(this.i, this.e, 13), arpeVar, 1);
        if (g == arpl.a) {
            return g;
        }
        return arnb.a;
    }
}
