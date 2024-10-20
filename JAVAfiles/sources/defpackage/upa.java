package defpackage;

import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upa implements upp {
    public final upq a;
    public final armf b;
    public final uov c;
    private final arwe d;

    public upa(upq upqVar, armf armfVar, uov uovVar, arwe arweVar) {
        upqVar.getClass();
        armfVar.getClass();
        uovVar.getClass();
        arweVar.getClass();
        this.a = upqVar;
        this.b = armfVar;
        this.c = uovVar;
        this.d = arweVar;
    }

    @Override // defpackage.upp
    public final akul a(upr uprVar) {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new tyi(uprVar, this, (arpe) null, 13));
        return c;
    }

    @Override // defpackage.upp
    public final akul b(upr uprVar) {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new tyi(uprVar, this, (arpe) null, 14, (byte[]) null));
        return c;
    }

    @Override // defpackage.upp
    public final Optional c(upr uprVar) {
        String p = uprVar.p();
        p.getClass();
        int ordinal = this.c.b(p).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ((uqo) this.b.b()).c(uprVar);
            }
            throw new armm();
        }
        return Optional.empty();
    }

    @Override // defpackage.upp
    public final boolean d(String str, upo upoVar, UUID uuid) {
        uou a = this.c.a((String) arsd.ab(str, new String[]{"-"}, 0, 6).get(0));
        if (a == null || a.ordinal() != 1) {
            return this.a.d(str, upoVar, uuid);
        }
        return true;
    }
}
