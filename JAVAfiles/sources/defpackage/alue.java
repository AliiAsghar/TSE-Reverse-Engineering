package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alue extends aluo {
    final /* synthetic */ aluf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alue(aluf alufVar, Iterator it) {
        super(it);
        this.a = alufVar;
    }

    @Override // defpackage.aluo
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return alzz.A((Collection) obj, this.a.g);
    }
}
