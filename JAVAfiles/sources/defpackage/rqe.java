package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqe extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(arsb arsbVar, arsb arsbVar2, abvz abvzVar, lrc lrcVar, yym yymVar, int i) {
        super(0);
        this.f = i;
        this.c = arsbVar;
        this.b = arsbVar2;
        this.e = abvzVar;
        this.d = lrcVar;
        this.a = yymVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r0v58, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v66, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, mkl] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        aewe x;
        aesp aeskVar;
        aewe x2;
        aewe x3;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.e.h(false);
                        this.c.h(false);
                        if (((Boolean) this.a.a()).booleanValue()) {
                            this.b.a(this.d);
                            this.a.h(false);
                        }
                        return arnb.a;
                    }
                    ?? r0 = this.d;
                    Object obj = this.e;
                    String c = r0.c();
                    boolean e = ((zem) obj).d.e();
                    String concat = c.concat(" ");
                    if (e) {
                        if (((osd) ((zdi) this.a).g.b()).a()) {
                            x3 = ico.h((ico) ((zdi) this.a).h.b(), this.d);
                        } else {
                            x3 = hwr.x(this.d);
                        }
                        aewe aeweVar = x3;
                        ?? r1 = this.d;
                        String e2 = r1.e();
                        String concat2 = concat.concat(String.valueOf(r1.d()));
                        boolean a = ((zem) this.e).a(this.d.b());
                        List g = zdi.g((zdi) this.a, (Pattern) this.b, this.d.e());
                        Object obj2 = this.a;
                        Object obj3 = this.b;
                        Pattern pattern = (Pattern) obj3;
                        zdi zdiVar = (zdi) obj2;
                        aeskVar = new aesn(aeweVar, e2, concat2, a, aqjn.aq(g, zdiVar.f(pattern, this.d.d(), 2, concat.length())), ((ahmv) ((zdi) this.a).e.b()).i(this.d, (zem) this.e));
                    } else {
                        if (((osd) ((zdi) this.a).g.b()).a()) {
                            x2 = ico.h((ico) ((zdi) this.a).h.b(), this.d);
                        } else {
                            x2 = hwr.x(this.d);
                        }
                        aewe aeweVar2 = x2;
                        ?? r12 = this.d;
                        String e3 = r12.e();
                        String concat3 = concat.concat(String.valueOf(r12.d()));
                        List g2 = zdi.g((zdi) this.a, (Pattern) this.b, this.d.e());
                        Object obj4 = this.a;
                        Object obj5 = this.b;
                        Pattern pattern2 = (Pattern) obj5;
                        zdi zdiVar2 = (zdi) obj4;
                        aeskVar = new aesk(aeweVar2, e3, concat3, aqjn.aq(g2, zdiVar2.f(pattern2, this.d.d(), 2, concat.length())), ((ahmv) ((zdi) this.a).e.b()).i(this.d, (zem) this.e), 8);
                    }
                    return new zdj((String) this.c, aeskVar);
                }
                arsb arsbVar = (arsb) this.c;
                arsbVar.a = aesh.a((aesh) arsbVar.a, null, null, null, !r3.d, null, 247);
                arsb arsbVar2 = (arsb) this.b;
                aeqa aeqaVar = (aeqa) arsbVar2.a;
                String string = ((Context) ((abvz) this.e).b.b()).getString(R.string.safety_check_dialog_positive);
                string.getClass();
                arsbVar2.a = aeqa.b(aeqaVar, null, aqjn.y(((arsb) this.c).a), null, null, new aewr(string, ((aesh) ((arsb) this.c).a).d, new kdt(this.e, this.d, this.a, 13, (int[]) null)), null, 93);
                this.d.b((aewt) ((arsb) this.b).a);
                return arnb.a;
            }
            armf armfVar = ((ljh) this.a).h;
            String c2 = this.e.c();
            if (((osd) armfVar.b()).a()) {
                x = ico.h((ico) ((ljh) this.a).i.b(), this.e);
            } else {
                x = hwr.x(this.e);
            }
            aewe aeweVar3 = x;
            String concat4 = c2.concat(" ");
            ?? r3 = this.e;
            String e4 = r3.e();
            String valueOf = String.valueOf(r3.d());
            return new lio((String) this.c, new aesn(aeweVar3, e4, concat4.concat(valueOf), ((lge) this.d).b(this.e.b()), aqjn.aq(((ljh) this.a).f((Pattern) this.b, this.e.e(), 1, 0), ((ljh) this.a).f((Pattern) this.b, this.e.d(), 2, concat4.length())), new kfq(this.a, this.e, 14)));
        }
        alvi alviVar = rqg.a;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        Object obj9 = this.a;
        rkb rkbVar = ((rqg) obj9).b;
        jda jdaVar = new jda(obj9, obj8, obj7, obj6, 14, (byte[]) null);
        Object obj10 = this.b;
        obj10.getClass();
        File file = (File) obj10;
        d.t(file.exists(), new qtq(obj10, 4));
        String parent = rkbVar.c().getAbsoluteFile().getCanonicalFile().getParent();
        String parent2 = file.getCanonicalFile().getParent();
        d.t(d.F(parent, parent2), new qtq(parent2, 5));
        try {
            agnc.p(true);
            ((agmu) rkbVar.b.b()).c(((File) obj10).getName());
            jdaVar.a();
            ((agmu) rkbVar.b.b()).b();
            agnc.p(false);
            ((agmu) rkbVar.b.b()).a();
            return arnb.a;
        } catch (Throwable th) {
            ((agmu) rkbVar.b.b()).b();
            agnc.p(false);
            ((agmu) rkbVar.b.b()).a();
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(byn bynVar, byn bynVar2, byn bynVar3, arqr arqrVar, Context context, int i) {
        super(0);
        this.f = i;
        this.e = bynVar;
        this.c = bynVar2;
        this.a = bynVar3;
        this.b = arqrVar;
        this.d = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(mkl mklVar, ljh ljhVar, lge lgeVar, Pattern pattern, String str, int i) {
        super(0);
        this.f = i;
        this.e = mklVar;
        this.a = ljhVar;
        this.d = lgeVar;
        this.b = pattern;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(mkl mklVar, zem zemVar, zdi zdiVar, Pattern pattern, String str, int i) {
        super(0);
        this.f = i;
        this.d = mklVar;
        this.e = zemVar;
        this.a = zdiVar;
        this.b = pattern;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(rqg rqgVar, File file, ahjj ahjjVar, rpq rpqVar, lrf lrfVar, int i) {
        super(0);
        this.f = i;
        this.a = rqgVar;
        this.b = file;
        this.c = ahjjVar;
        this.d = rpqVar;
        this.e = lrfVar;
    }
}
