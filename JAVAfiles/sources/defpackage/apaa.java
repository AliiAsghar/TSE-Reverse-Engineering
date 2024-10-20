package defpackage;

import defpackage.apaa;
import defpackage.apab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apaa<MessageType extends apab<MessageType, BuilderType>, BuilderType extends apaa<MessageType, BuilderType>> extends aozy<MessageType, BuilderType> implements apac, ahcx {
    public apaa() {
        throw null;
    }

    @Override // defpackage.aozy, defpackage.apbs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apab t() {
        if (!((apab) this.b).isMutable()) {
            return (apab) this.b;
        }
        ((apab) this.b).l.f();
        return (apab) super.t();
    }

    @Override // defpackage.apac
    public final boolean cs(aozq aozqVar) {
        apae checkIsLite;
        apab apabVar = (apab) this.b;
        checkIsLite = apag.checkIsLite(aozqVar);
        apabVar.b(checkIsLite);
        return apabVar.l.o(checkIsLite.d);
    }

    public final void ct(aozq aozqVar, Object obj) {
        apae checkIsLite;
        checkIsLite = apag.checkIsLite(aozqVar);
        if (checkIsLite.a == this.a) {
            if (!this.b.isMutable()) {
                u();
            }
            aozu aozuVar = ((apab) this.b).l;
            if (aozuVar.c) {
                aozuVar = aozuVar.clone();
                ((apab) this.b).l = aozuVar;
            }
            apad apadVar = checkIsLite.d;
            if (apadVar.d) {
                if (apadVar.a() == apdg.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        arrayList.add(checkIsLite.e(it.next()));
                    }
                    obj = arrayList;
                }
            } else {
                obj = checkIsLite.e(obj);
            }
            aozuVar.n(apadVar, obj);
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    @Override // defpackage.aozy
    public final void u() {
        super.u();
        if (((apab) this.b).l != aozu.a) {
            apab apabVar = (apab) this.b;
            apabVar.l = apabVar.l.clone();
        }
    }

    public apaa(apab apabVar) {
        super(apabVar);
    }
}
