package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alrj extends aluo {
    final /* synthetic */ algk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrj(Iterator it, algk algkVar) {
        super(it);
        this.a = algkVar;
    }

    @Override // defpackage.aluo
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new alnv(obj, this.a.apply(obj));
    }
}
