package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akjg extends arrp implements arqr {
    final /* synthetic */ arqx a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ akjh d;
    final /* synthetic */ aocw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akjg(arqx arqxVar, String str, int i, akjh akjhVar, aocw aocwVar) {
        super(1);
        this.a = arqxVar;
        this.b = str;
        this.c = i;
        this.d = akjhVar;
        this.e = aocwVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String[] strArr;
        aozb aozbVar;
        byte[] bArr = (byte[]) obj;
        Integer valueOf = Integer.valueOf(this.c);
        Set set = this.d.e;
        aocw aocwVar = this.e;
        if (aocwVar != null) {
            apax apaxVar = aocwVar.i;
            apaxVar.getClass();
            strArr = (String[]) aqjn.ak(aqjn.h(set, apaxVar)).toArray(new String[0]);
        } else {
            strArr = (String[]) set.toArray(new String[0]);
        }
        if (bArr == null) {
            aocw aocwVar2 = this.e;
            if (aocwVar2 != null && (aozbVar = aocwVar2.j) != null) {
                bArr = aozbVar.H();
            } else {
                bArr = null;
            }
        }
        return this.a.a(this.b, valueOf, strArr, bArr);
    }
}
