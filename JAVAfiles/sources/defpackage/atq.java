package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atq extends arrp implements arqg<Integer> {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atq(List list) {
        super(0);
        this.a = list;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        Object obj = this.a.get(2);
        obj.getClass();
        return (Integer) obj;
    }
}
