package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezd extends arrp implements arqv {
    final /* synthetic */ cga a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ List e;
    final /* synthetic */ arqg f;
    final /* synthetic */ boolean g;
    final /* synthetic */ aezf h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aezd(cga cgaVar, String str, long j, float f, List list, arqg arqgVar, boolean z, aezf aezfVar, int i) {
        super(2);
        this.a = cgaVar;
        this.b = str;
        this.c = j;
        this.d = f;
        this.e = list;
        this.f = arqgVar;
        this.g = z;
        this.h = aezfVar;
        this.i = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cga cgaVar = this.a;
        String str = this.b;
        long j = this.c;
        float f = this.d;
        List list = this.e;
        arqg arqgVar = this.f;
        boolean z = this.g;
        adom.ck(cgaVar, str, j, f, list, arqgVar, z, this.h, (bwj) obj, bzh.a(this.i | 1));
        return arnb.a;
    }
}
