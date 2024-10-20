package defpackage;

import j$.util.Optional;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aczc {
    public static final Optional c = Optional.empty();
    private final String a;
    public final ahtn d;

    /* JADX INFO: Access modifiers changed from: protected */
    public aczc(String str) {
        this.a = str;
        this.d = new ahtn(ahsy.a("com.google.android.ims.library")).c(str).b().a();
    }

    public static void m() {
        acyu.c();
        aczf.u();
        aczg.c();
        aczh.c();
        aczi.c();
        aczl.d();
        aczm.c();
        aczn.c();
        aczo.c();
        aczp.c();
        aczq.a();
        aczr.c();
        aczs.d();
        aczt.c();
        aczv.w();
        aczx.d();
        adaa.s();
        adab.c();
        adac.d();
        aczy.c();
        aczd.d();
        aczj.c();
    }

    protected abstract alog b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final acza e(String str, double d) {
        return new acza(this.d.d(str, d));
    }

    public final acza f(String str, int i) {
        return new acza(this.d.e(str, i));
    }

    public final acza g(String str, long j) {
        return new acza(this.d.f(str, j));
    }

    public final acza h(String str, String str2) {
        return new acza(new ahti(this.d, str, str2, false));
    }

    public final acza i(String str, boolean z) {
        return new acza(this.d.g(str, z));
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        alog b = b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            acyz acyzVar = (acyz) b.get(i);
            sb.append(System.lineSeparator());
            sb.append(acyzVar.b());
            sb.append("=");
            sb.append(acyzVar.a());
        }
        return sb.toString();
    }

    public final void k(PrintWriter printWriter) {
        alog b = b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            printWriter.println((acyz) b.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        if (advr.v()) {
            StringBuilder sb = new StringBuilder("<<< ");
            sb.append(this.a);
            sb.append("com.google.android.ims.library >>>");
            alog b = b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                acyz acyzVar = (acyz) b.get(i);
                sb.append(System.lineSeparator());
                sb.append(acyzVar);
            }
            advr.c("%s", sb.toString());
        }
    }
}
