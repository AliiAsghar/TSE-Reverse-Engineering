package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivz implements aiuw {
    private final apca a;
    private final aozs b;

    private aivz(apca apcaVar) {
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        this.b = aozs.a;
        this.a = apcaVar;
    }

    public static aivz b(apbt apbtVar) {
        return new aivz(apbtVar.getParserForType());
    }

    @Override // defpackage.aiuw
    public final /* bridge */ /* synthetic */ Object a(aogy aogyVar) {
        InputStream b = aivw.b(aogyVar);
        try {
            Object g = this.a.g(b, this.b);
            if (b != null) {
                b.close();
            }
            return g;
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
