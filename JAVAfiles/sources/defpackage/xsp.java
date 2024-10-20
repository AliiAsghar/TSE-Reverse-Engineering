package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xsp implements ancv {
    private final /* synthetic */ int a;

    public /* synthetic */ xsp(int i) {
        this.a = i;
    }

    @Override // defpackage.ancv
    public final andc a(ahmn ahmnVar, Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return new andc(albo.bI(aozb.A((InputStream) obj).H()));
            }
            return new andc(aktp.ag(new gsw()));
        }
        apvh apvhVar = (apvh) obj;
        apvhVar.getClass();
        return new andc(apvhVar.b());
    }
}
