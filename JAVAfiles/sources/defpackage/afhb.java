package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class afhb implements rv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ afhb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    @Override // defpackage.rv
    public final void a(Object obj) {
        if (this.c != 0) {
            ru ruVar = (ru) obj;
            Object obj2 = this.b;
            obj2.getClass();
            ruVar.getClass();
            if (ruVar.a == -1) {
                Object obj3 = this.a;
                Intent intent = ruVar.b;
                intent.getClass();
                ((ipi) obj3).g((afto) obj2, (Uri) intent.getParcelableExtra("android.intent.extra.STREAM"), intent.getType());
                return;
            }
            return;
        }
        List list = (List) obj;
        list.getClass();
        ?? r0 = this.b;
        afhd afhdVar = (afhd) this.a;
        arrn.J(afhdVar.c, null, null, new afhc(list, afhdVar, r0, null), 3);
    }
}
