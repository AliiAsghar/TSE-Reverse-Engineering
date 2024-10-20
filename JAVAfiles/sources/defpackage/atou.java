package defpackage;

import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atou implements atoq {
    private final Type a;
    private final /* synthetic */ int b;

    public atou(Type type, int i) {
        this.b = i;
        this.a = type;
    }

    @Override // defpackage.atoq
    public final /* synthetic */ Object a(atoo atooVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    atqy atqyVar = new atqy(atooVar);
                    atooVar.d(new atph(atqyVar, 3));
                    return atqyVar;
                }
                atqy atqyVar2 = new atqy(atooVar);
                atooVar.d(new atph(atqyVar2, 2));
                return atqyVar2;
            }
            atos atosVar = new atos(atooVar);
            atooVar.d(new atot(atosVar, 1));
            return atosVar;
        }
        atos atosVar2 = new atos(atooVar);
        atooVar.d(new atot(atosVar2, 0));
        return atosVar2;
    }

    @Override // defpackage.atoq
    public final Type b() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return this.a;
                }
                return this.a;
            }
            return this.a;
        }
        return this.a;
    }
}
