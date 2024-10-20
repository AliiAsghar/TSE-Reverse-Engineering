package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gii extends ght {
    final /* synthetic */ gik b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gii(String[] strArr, gik gikVar) {
        super(strArr);
        this.b = gikVar;
    }

    @Override // defpackage.ght
    public final void a(Set set) {
        sq a = sq.a();
        fyk fykVar = new fyk(this.b, 16);
        if (a.y()) {
            fykVar.run();
        } else {
            a.b(fykVar);
        }
    }
}
