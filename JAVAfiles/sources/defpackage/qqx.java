package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqx implements qrh {
    public final armf a;
    public final Supplier b;
    public final anen c;
    public volatile Integer d = null;
    private final andr e = new andr();

    public qqx(armf armfVar, anen anenVar, armf armfVar2) {
        this.a = armfVar;
        this.c = anenVar;
        this.b = new ngq(armfVar2, 17);
    }

    @Override // defpackage.qrh
    public final akul a() {
        if (this.d != null) {
            return aktp.ag(Optional.of(this.d));
        }
        return akul.g(this.e.b(akto.c(new ikm(this, 15)), this.c));
    }

    @Override // defpackage.qrh
    public final Optional b() {
        Object obj;
        Object obj2;
        albo.T(!aiut.g());
        if (this.d == null) {
            try {
                obj = this.b.get();
                qrf qrfVar = (qrf) ((wul) obj).l();
                if ((qrfVar.b & 1) != 0) {
                    return Optional.of(Integer.valueOf(qrfVar.c));
                }
                Optional b = ((qrh) this.a.b()).b();
                if (b.isPresent() && ((Integer) b.get()).intValue() >= 6) {
                    obj2 = this.b.get();
                    ((wul) obj2).m(new qlf(b, 12));
                    return b;
                }
                return b;
            } catch (apba e) {
                throw new RuntimeException(e);
            }
        }
        return Optional.of(this.d);
    }
}
