package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ptk extends pto {
    private final ptz c;
    private final Instant d;
    private volatile transient boolean e;
    private volatile transient boolean f;

    public ptk(ptz ptzVar, Instant instant) {
        if (ptzVar != null) {
            this.c = ptzVar;
            if (instant != null) {
                this.d = instant;
                return;
            }
            throw new NullPointerException("Null lastRefreshTimestamp");
        }
        throw new NullPointerException("Null rcsCapabilities");
    }

    @Override // defpackage.pto
    public final ptz a() {
        return this.c;
    }

    @Override // defpackage.pto
    public final Instant b() {
        return this.d;
    }

    @Override // defpackage.pto
    public final boolean c() {
        boolean z;
        if (!this.f) {
            synchronized (this) {
                if (!this.f) {
                    apax apaxVar = this.c.b;
                    aozy createBuilder = pua.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    pua puaVar = (pua) apagVar;
                    puaVar.b |= 1;
                    puaVar.c = "+g.3gpp.iari-ref";
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    pua puaVar2 = (pua) createBuilder.b;
                    puaVar2.b |= 2;
                    puaVar2.d = "urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im";
                    if (!apaxVar.contains(createBuilder.s())) {
                        apax apaxVar2 = this.c.b;
                        aozy createBuilder2 = pua.a.createBuilder();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar2 = createBuilder2.b;
                        pua puaVar3 = (pua) apagVar2;
                        puaVar3.b |= 1;
                        puaVar3.c = "+g.3gpp.iari-ref";
                        if (!apagVar2.isMutable()) {
                            createBuilder2.u();
                        }
                        pua puaVar4 = (pua) createBuilder2.b;
                        puaVar4.b |= 2;
                        puaVar4.d = "urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp";
                        if (!apaxVar2.contains(createBuilder2.s())) {
                            z = false;
                            this.e = z;
                            this.f = true;
                        }
                    }
                    z = true;
                    this.e = z;
                    this.f = true;
                }
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pto) {
            pto ptoVar = (pto) obj;
            if (this.c.equals(ptoVar.a()) && this.d.equals(ptoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode();
    }
}
