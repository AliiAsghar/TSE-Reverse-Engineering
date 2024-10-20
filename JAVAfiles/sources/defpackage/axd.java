package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axd extends arrp implements arqr<List<diy>, Boolean> {
    final /* synthetic */ ayd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axd(ayd aydVar) {
        super(1);
        this.a = aydVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean z;
        List list = (List) obj;
        if (this.a.d() != null) {
            baa d = this.a.d();
            d.getClass();
            list.add(d.a);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
