package defpackage;

import defpackage.apbt;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apae<ContainingType extends apbt, Type> extends aozq<ContainingType, Type> {
    final apbt a;
    public final Object b;
    public final apbt c;
    public final apad d;

    public apae(apbt apbtVar, Object obj, apbt apbtVar2, apad apadVar) {
        if (apbtVar != null) {
            if (apadVar.c == apdf.MESSAGE && apbtVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.a = apbtVar;
            this.b = obj;
            this.c = apbtVar2;
            this.d = apadVar;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    @Override // defpackage.aozq
    public final int a() {
        return this.d.b;
    }

    public final apdf b() {
        return this.d.c;
    }

    public final Object c(Object obj) {
        apad apadVar = this.d;
        if (apadVar.d) {
            if (apadVar.a() == apdg.ENUM) {
                apcd apcdVar = new apcd(apcd.a, 0, true);
                List list = (List) obj;
                apcdVar.d(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    apcdVar.add(d(it.next()));
                }
                apcdVar.b();
                return apcdVar;
            }
            return obj;
        }
        return d(obj);
    }

    final Object d(Object obj) {
        if (this.d.a() == apdg.ENUM) {
            apad apadVar = this.d;
            return apadVar.a.a(((Integer) obj).intValue());
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object e(Object obj) {
        if (this.d.a() == apdg.ENUM) {
            return Integer.valueOf(((apak) obj).a());
        }
        return obj;
    }

    public final boolean f() {
        return this.d.d;
    }
}
