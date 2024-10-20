package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxg extends arpw implements arqw {
    /* synthetic */ Object a;
    final /* synthetic */ afxh b;
    final /* synthetic */ RecyclerView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxg(afxh afxhVar, RecyclerView recyclerView, arpe arpeVar) {
        super(3, arpeVar);
        this.b = afxhVar;
        this.c = recyclerView;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        afxg afxgVar = new afxg(this.b, this.c, (arpe) obj3);
        afxgVar.a = (Size) obj;
        return afxgVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        Object obj2 = this.a;
        afxh afxhVar = this.b;
        afxe e = afxh.e(afxhVar);
        e.getClass();
        afxhVar.aZ(this.c, (Size) obj2, e);
        return arnb.a;
    }
}
