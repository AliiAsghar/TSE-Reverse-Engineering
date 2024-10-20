package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aapo implements abce {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aapo(aapp aappVar, ameb amebVar, int i) {
        this.c = i;
        this.a = aappVar;
        this.b = amebVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, arpe] */
    @Override // defpackage.abce
    public final void a(Uri uri) {
        afcq a;
        if (this.c != 0) {
            if (((Boolean) utw.o.e()).booleanValue()) {
                vld k = inf.k();
                k.g(uri);
                k.e(ameb.CONTACT_CHOOSER);
                a = k.d();
            } else {
                Object obj = this.a;
                a = ((iqa) obj).g.a(uri, ameb.CONTACT_CHOOSER);
            }
            afcq afcqVar = a;
            iqa iqaVar = (iqa) this.a;
            qjh.l(iqaVar.e, null, new ipz((arpe) this.b, iqaVar, afcqVar, (arpe) null, 1), 3);
            return;
        }
        boolean booleanValue = ((Boolean) utw.o.e()).booleanValue();
        Object obj2 = this.b;
        Object obj3 = this.a;
        if (booleanValue) {
            aapu aapuVar = ((aapp) obj3).h;
            vld k2 = inf.k();
            k2.g(uri);
            k2.e((ameb) obj2);
            aapuVar.e(k2.d(), aapp.a);
            return;
        }
        aapp aappVar = (aapp) obj3;
        aappVar.h.g(aappVar.d.a(uri, (ameb) obj2), aapp.a);
    }

    public aapo(iqa iqaVar, arpe arpeVar, int i) {
        this.c = i;
        this.a = iqaVar;
        this.b = arpeVar;
    }
}
