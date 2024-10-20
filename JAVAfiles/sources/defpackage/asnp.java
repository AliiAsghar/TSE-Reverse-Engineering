package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnp implements asly {
    private final asln a;

    public asnp(asln aslnVar) {
        this.a = aslnVar;
    }

    @Override // defpackage.asly
    public final asmm a(asnv asnvVar) {
        asmp asmpVar;
        asmh asmhVar = asnvVar.c;
        asmg asmgVar = new asmg(asmhVar);
        asmk asmkVar = asmhVar.d;
        if (asmkVar != null) {
            aslz b = asmkVar.b();
            if (b != null) {
                asmgVar.c(assi.a, b.c);
            }
            long a = asmkVar.a();
            if (a != -1) {
                asmgVar.c("Content-Length", String.valueOf(a));
                asmgVar.b("Transfer-Encoding");
            } else {
                asmgVar.c("Transfer-Encoding", "chunked");
                asmgVar.b("Content-Length");
            }
        }
        boolean z = false;
        if (asmhVar.a("Host") == null) {
            asmgVar.c("Host", asmt.k(asmhVar.a, false));
        }
        if (asmhVar.a("Connection") == null) {
            asmgVar.c("Connection", "Keep-Alive");
        }
        if (asmhVar.a("Accept-Encoding") == null && asmhVar.a("Range") == null) {
            asmgVar.c("Accept-Encoding", "gzip");
            z = true;
        }
        if (asmhVar.a("User-Agent") == null) {
            asmgVar.c("User-Agent", "okhttp/4.12.0");
        }
        asmm a2 = asnvVar.a(asmgVar.a());
        asnu.a(this.a, asmhVar.a, a2.f);
        asml asmlVar = new asml(a2);
        asmlVar.a = asmhVar;
        if (z && arsd.x("gzip", asmm.b(a2, "Content-Encoding"), true) && asnu.b(a2) && (asmpVar = a2.g) != null) {
            asrb asrbVar = new asrb(asmpVar.c());
            asuo e = a2.f.e();
            e.l("Content-Encoding");
            e.l("Content-Length");
            asmlVar.c(e.h());
            asmlVar.e = new asnw(asmm.b(a2, assi.a), -1L, new asrk(asrbVar));
        }
        return asmlVar.a();
    }
}
