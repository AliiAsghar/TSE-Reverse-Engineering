package defpackage;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aopv;
import defpackage.aorn;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aopv extends aoon {
    public static final aooo a = c(2);
    private final int b;

    private aopv(int i) {
        this.b = i;
    }

    public static aooo c(int i) {
        final aopv aopvVar = new aopv(i);
        return new aooo() { // from class: com.google.gson.internal.bind.NumberTypeAdapter$1
            @Override // defpackage.aooo
            public final aoon a(aonx aonxVar, aorn aornVar) {
                if (aornVar.a == Number.class) {
                    return aopv.this;
                }
                return null;
            }
        };
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        int t = aoroVar.t();
        int i = t - 1;
        if (i != 5 && i != 6) {
            if (i == 8) {
                aoroVar.p();
                return null;
            }
            throw new aook("Expecting number, got: " + d.C(t) + "; at path " + aoroVar.e());
        }
        return aotl.y(this.b, aoroVar);
    }

    @Override // defpackage.aoon
    public final /* synthetic */ void b(aorp aorpVar, Object obj) {
        aorpVar.l((Number) obj);
    }
}
