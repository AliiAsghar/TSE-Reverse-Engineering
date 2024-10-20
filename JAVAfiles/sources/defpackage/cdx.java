package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdx {

    /* compiled from: PG */
    /* renamed from: cdx$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv {
        final /* synthetic */ arqv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqv arqvVar) {
            super(2);
            this.a = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cek cekVar = (cek) obj;
            List list = (List) this.a.a(cekVar, obj2);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj3 = list.get(i);
                if (obj3 != null && !cekVar.b(obj3)) {
                    throw new IllegalArgumentException("item can't be saved");
                }
            }
            if (!list.isEmpty()) {
                return new ArrayList(list);
            }
            return null;
        }
    }

    public static final ceh a(arqv arqvVar, arqr arqrVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(arqvVar);
        arsd.g(arqrVar, 1);
        return new cej(anonymousClass1, arqrVar);
    }
}
