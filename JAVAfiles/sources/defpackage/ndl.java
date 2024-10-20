package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndl implements ncq {
    public final arqv a;
    private final ndj b;
    private final ngo c;

    public ndl(ndj ndjVar, arqv arqvVar, ngo ngoVar) {
        ndjVar.getClass();
        this.b = ndjVar;
        this.a = arqvVar;
        this.c = ngoVar;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        ndk ndkVar = new ndk(this, ncpVar);
        ndj ndjVar = this.b;
        synchronized (ndjVar.a) {
            ndjVar.a.add(ndkVar);
            if (ndjVar.a.size() == 1) {
                Boolean bool = ndjVar.b;
                bool.getClass();
                if (bool.booleanValue()) {
                    ndjVar.f.E(ndjVar.d);
                } else {
                    ndjVar.e.E(ndjVar.d);
                }
                akrh e = aktp.e("ParticipantObservableSupplier#addCallbackInternal_dsdrGroupsFlag");
                try {
                    if (ndjVar.c) {
                        ndjVar.j.E(ndjVar.h);
                    } else {
                        ndjVar.i.E(ndjVar.g);
                    }
                    armd.i(e, null);
                } finally {
                }
            }
        }
        return new mul(ndjVar, ndkVar, 4);
    }

    @Override // defpackage.ncq
    public final akul b() {
        return this.c.c();
    }

    @Override // defpackage.ncq
    public final Object c() {
        return this.c.d();
    }
}
