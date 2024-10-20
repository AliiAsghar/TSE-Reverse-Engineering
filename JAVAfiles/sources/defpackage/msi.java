package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class msi implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ msi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [vni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [vni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [vni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [vni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [vni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [vni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [apwt, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        String b;
        String b2;
        switch (this.b) {
            case 0:
                return new msf(((msz) this.a).f);
            case 1:
                return this.a;
            case 2:
                return ((yjr) ((msq) this.a).b.b()).f();
            case 3:
                msq msqVar = (msq) this.a;
                return Optional.of(((yjs) msqVar.j.b()).b(((yjy) msqVar.f.b()).b()));
            case 4:
                return ((yjr) ((msq) this.a).b.b()).m();
            case 5:
                msq msqVar2 = (msq) this.a;
                int Q = ((yyt) msqVar2.h.b()).Q(vqk.f);
                if (((plo) msqVar2.c.b()).a()) {
                    b = ((yjy) msqVar2.f.b()).h(Q).u();
                } else {
                    b = ((yjs) msqVar2.j.b()).b(Q);
                }
                return Optional.of(b);
            case 6:
                return this.a.m();
            case 7:
                int i = msq.l;
                return Optional.of(this.a.m());
            case 8:
                return new msf(this.a.m());
            case 9:
                return Optional.of(((yjr) ((msq) this.a).b.b()).t());
            case 10:
                msq msqVar3 = (msq) this.a;
                int Q2 = ((yyt) msqVar3.h.b()).Q(vqk.g);
                if (((plo) msqVar3.k.b()).a()) {
                    b2 = ((yjy) msqVar3.f.b()).h(Q2).u();
                } else {
                    b2 = ((yjs) msqVar3.c.b()).b(Q2);
                }
                return Optional.of(b2);
            case 11:
                return new msf(this.a.m());
            case 12:
                int i2 = msq.l;
                return this.a;
            case 13:
                return ((yjr) ((msq) this.a).b.b()).m();
            case 14:
                return ((yjr) ((msq) this.a).b.b()).f();
            case 15:
                msq msqVar4 = (msq) this.a;
                return Optional.of(((yjs) msqVar4.c.b()).b(((yjy) msqVar4.f.b()).b()));
            case 16:
                return Optional.of(((yjr) ((msq) this.a).b.b()).t());
            case 17:
                return this.a.m();
            case 18:
                int i3 = msq.l;
                return Optional.of(this.a.m());
            case 19:
                return ((msq) ((msr) this.a).b.b()).l();
            default:
                return ((msq) ((msr) this.a).b.b()).m();
        }
    }
}
