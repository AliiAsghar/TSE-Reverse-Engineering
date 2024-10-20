package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asy extends arrp implements arqr<Map<String, ? extends List<? extends Object>>, asw> {
    final /* synthetic */ cee a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asy(cee ceeVar) {
        super(1);
        this.a = ceeVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new asw(this.a, (Map) obj);
    }
}
