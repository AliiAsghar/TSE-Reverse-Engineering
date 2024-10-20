package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoha implements aohe {
    final FirebaseInstanceId a;

    public aoha(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.aohe
    public final acir a() {
        String g = this.a.g();
        if (g != null) {
            return actx.s(g);
        }
        FirebaseInstanceId firebaseInstanceId = this.a;
        FirebaseInstanceId.i(firebaseInstanceId.c);
        return firebaseInstanceId.a(aetn.bg(firebaseInstanceId.c), "*").a(new acca(9));
    }

    @Override // defpackage.aohe
    public final void b() {
        this.a.g();
    }

    @Override // defpackage.aohe
    public final void c(asqc asqcVar) {
        this.a.f.add(asqcVar);
    }
}
