package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhk extends arrp implements arqr<List<Float>, Boolean> {
    final /* synthetic */ arqg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhk(arqg arqgVar) {
        super(1);
        this.a = arqgVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((List) obj).add(this.a.a());
        return true;
    }
}
