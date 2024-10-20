package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aogv implements acig {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aogv(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = str;
        this.c = obj2;
    }

    @Override // defpackage.acig
    public final Object a(acir acirVar) {
        if (this.d != 0) {
            if (!acirVar.l()) {
                Object obj = this.b;
                if (!((acgl) obj).w(11925000)) {
                    return acgl.a();
                }
                Object obj2 = this.c;
                ajxp ajxpVar = new ajxp(null);
                ajxpVar.c = new acdk(this.a, obj2, 3, null);
                return ((abrc) obj).g(ajxpVar.b());
            }
            return acirVar;
        }
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.b;
        String e = firebaseInstanceId.e();
        Object obj3 = this.c;
        String str = this.a;
        String str2 = (String) obj3;
        aohb d = firebaseInstanceId.d(str, str2);
        if (!firebaseInstanceId.o(d)) {
            return actx.s(new aojh(d.b));
        }
        return firebaseInstanceId.h.x(str, str2, new aogw(firebaseInstanceId, e, str, str2, d));
    }
}
