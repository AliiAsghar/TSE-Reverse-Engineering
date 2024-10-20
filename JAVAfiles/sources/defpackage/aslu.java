package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslu {
    public final asmr a;
    public final asli b;
    public final List c;
    private final arml d;

    public aslu(asmr asmrVar, asli asliVar, List list, arqg arqgVar) {
        asmrVar.getClass();
        this.a = asmrVar;
        this.b = asliVar;
        this.c = list;
        this.d = armd.a(new aslt(arqgVar));
    }

    private static final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aslu) {
            aslu asluVar = (aslu) obj;
            if (asluVar.a == this.a && d.F(asluVar.b, this.b) && d.F(asluVar.a(), a()) && d.F(asluVar.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + a().hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        List a = a();
        ArrayList arrayList = new ArrayList(aqjn.J(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        asmr asmrVar = this.a;
        asli asliVar = this.b;
        List list = this.c;
        ArrayList arrayList2 = new ArrayList(aqjn.J(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        return "Handshake{tlsVersion=" + asmrVar + " cipherSuite=" + asliVar + " peerCertificates=" + obj + " localCertificates=" + arrayList2 + "}";
    }
}
