package defpackage;

import android.util.LruCache;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xds implements xdt {
    public static final alwo a = alwo.o("BugleTachygram");
    public final xyd b;
    public final anen c;
    public final xnv d;

    public xds(xyd xydVar, anen anenVar, xnv xnvVar) {
        this.b = xydVar;
        this.c = anenVar;
        this.d = xnvVar;
    }

    public final akul a(msh mshVar) {
        Optional c = c(mshVar);
        if (!c.isEmpty()) {
            if (!((pto) c.get()).f(this.d.f())) {
                return aktp.ag(c);
            }
        }
        return aktp.ai(new vze(this, mshVar, 16, null), this.c);
    }

    public final akul b(msh mshVar) {
        ((LruCache) this.b.get()).remove(mshVar);
        return aktp.ah(new wuo(mshVar, 5), this.c);
    }

    public final Optional c(msh mshVar) {
        synchronized (this.b) {
            xdr xdrVar = (xdr) ((LruCache) this.b.get()).get(mshVar);
            if (xdrVar != null) {
                return xdrVar.a;
            }
            xou a2 = xdr.a();
            aozy createBuilder = amja.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amja amjaVar = (amja) apagVar;
            amjaVar.d = 1;
            amjaVar.b |= 2;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amja amjaVar2 = (amja) createBuilder.b;
            amjaVar2.c = 1;
            amjaVar2.b |= 1;
            a2.e((amja) createBuilder.s());
            xdr d = a2.d();
            ((LruCache) this.b.get()).put(mshVar, d);
            return d.a;
        }
    }

    public final Optional d(msh mshVar) {
        Optional of;
        xou xouVar;
        int i;
        String n = mshVar.n();
        if (n.isEmpty()) {
            ((alvg) ((alvg) ptn.a.i()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations", "getRcsCapabilitiesLegacy", 59, "RcsCapabilitiesDatabaseOperations.java")).q("Failed to get RCS Capabilities from RcsRemoteCapabilitiesCacheTable, MSISDN is invalid");
            of = Optional.empty();
        } else {
            ptv ptvVar = new ptv(pty.a);
            ptvVar.w("getRcsCapabilitiesLegacy");
            ptvVar.c(new nfc(n, 19));
            ptp ptpVar = (ptp) ((ptr) ptvVar.b().n()).cO();
            if (ptpVar == null) {
                ((alvg) ((alvg) ptn.a.g()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations", "getRcsCapabilitiesLegacy", 73, "RcsCapabilitiesDatabaseOperations.java")).q("No RCS Capabilities found cached in database");
                of = Optional.empty();
            } else {
                pvm pvmVar = new pvm();
                pvmVar.i(ptpVar.d());
                pvmVar.h(ptpVar.e());
                of = Optional.of(pvmVar.g());
            }
        }
        synchronized (this.b) {
            xdr xdrVar = (xdr) ((LruCache) this.b.get()).get(mshVar);
            if (xdrVar == null) {
                xouVar = xdr.a();
            } else {
                xouVar = new xou(xdrVar);
            }
            if (xdrVar != null && !xdrVar.a.isPresent() && of.isPresent()) {
                xouVar.f((pto) of.get());
            }
            aozy createBuilder = amja.a.createBuilder();
            if (true != of.isPresent()) {
                i = 2;
            } else {
                i = 3;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amja amjaVar = (amja) apagVar;
            amjaVar.d = i - 1;
            amjaVar.b |= 2;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amja amjaVar2 = (amja) createBuilder.b;
            amjaVar2.c = 2;
            amjaVar2.b = 1 | amjaVar2.b;
            xouVar.e((amja) createBuilder.s());
            ((LruCache) this.b.get()).put(mshVar, xouVar.d());
        }
        return of;
    }

    @Override // defpackage.xdt
    public final void e(msh mshVar, int i) {
        xou xouVar;
        synchronized (this.b) {
            xdr xdrVar = (xdr) ((LruCache) this.b.get()).get(mshVar);
            if (xdrVar == null) {
                xouVar = xdr.a();
            } else {
                xouVar = new xou(xdrVar);
            }
            aozy createBuilder = amja.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amja amjaVar = (amja) apagVar;
            amjaVar.d = i - 1;
            amjaVar.b |= 2;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amja amjaVar2 = (amja) createBuilder.b;
            amjaVar2.c = 3;
            amjaVar2.b |= 1;
            xouVar.e((amja) createBuilder.s());
            ((LruCache) this.b.get()).put(mshVar, xouVar.d());
        }
    }
}
