package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepk implements PointerInputEventHandler {
    final /* synthetic */ arry a;
    final /* synthetic */ arry b;
    final /* synthetic */ byn c;
    final /* synthetic */ byn d;
    final /* synthetic */ byn e;
    final /* synthetic */ arqr f;
    final /* synthetic */ Context g;
    final /* synthetic */ boolean h;
    final /* synthetic */ arqg i;
    final /* synthetic */ cpm j;

    public aepk(arry arryVar, arry arryVar2, byn bynVar, byn bynVar2, byn bynVar3, arqr arqrVar, Context context, boolean z, arqg arqgVar, cpm cpmVar) {
        this.a = arryVar;
        this.b = arryVar2;
        this.c = bynVar;
        this.d = bynVar2;
        this.e = bynVar3;
        this.f = arqrVar;
        this.g = context;
        this.h = z;
        this.i = arqgVar;
        this.j = cpmVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
        arry arryVar = this.a;
        arry arryVar2 = this.b;
        byn bynVar = this.c;
        byn bynVar2 = this.d;
        jze jzeVar = new jze(arryVar, arryVar2, bynVar, bynVar2, 7);
        byn bynVar3 = this.e;
        arqr arqrVar = this.f;
        Context context = this.g;
        Object b = ahm.b(crkVar, new ahc(jzeVar, accd.r, new rqe(bynVar, bynVar2, bynVar3, arqrVar, context, 4), new aepj(bynVar, bynVar2, bynVar3, arryVar, arryVar2, this.h, this.i, arqrVar, context, this.j), null), arpeVar);
        arpl arplVar = arpl.a;
        if (b != arplVar) {
            b = arnb.a;
        }
        if (b == arplVar) {
            return b;
        }
        return arnb.a;
    }
}
