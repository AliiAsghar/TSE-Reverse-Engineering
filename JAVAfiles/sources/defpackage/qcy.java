package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qcy extends unp {
    public final qdc a;
    public final prk b;
    public final anen c;

    public qcy(qdc qdcVar, prk prkVar, anen anenVar) {
        this.a = qdcVar;
        this.b = prkVar;
        this.c = anenVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        return d.av();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("IncomingRbmMessageRequestHandler");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        String str;
        Optional of;
        qfo qfoVar = (qfo) apbtVar;
        qei qeiVar = qfoVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        String str2 = qeiVar.d;
        apwq apwqVar = qfoVar.i;
        if (apwqVar == null) {
            apwqVar = apwq.a;
        }
        apws apwsVar = apws.a;
        apbo apboVar = apwqVar.b;
        if (apboVar.containsKey("urn:rcs:google:")) {
            apwsVar = (apws) apboVar.get("urn:rcs:google:");
        }
        apbo apboVar2 = apwsVar.b;
        if (apboVar2.containsKey("Agent-Name")) {
            str = (String) apboVar2.get("Agent-Name");
        } else {
            str = "";
        }
        if (str.isEmpty()) {
            of = Optional.empty();
        } else {
            of = Optional.of(str);
        }
        return this.b.b(str2).i(new qcf(this, qfoVar, unsVar, of, str2, 2), this.c);
    }

    @Override // defpackage.unx
    public final apca e() {
        return qfo.b.getParserForType();
    }
}
