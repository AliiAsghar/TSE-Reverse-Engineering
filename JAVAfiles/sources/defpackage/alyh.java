package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyh implements alya {
    public final String a;
    public final Level b;
    public final boolean c;
    public final Set d;
    public final alxh e;
    public final int f;
    private volatile alyi g;

    public alyh(int i, Level level, boolean z, Set set, alxh alxhVar) {
        this.a = "";
        this.f = 2;
        this.b = level;
        this.c = z;
        this.d = set;
        this.e = alxhVar;
    }

    @Override // defpackage.alya
    public final alww a(String str) {
        if (this.c && str.contains(".")) {
            alyi alyiVar = this.g;
            if (alyiVar == null) {
                synchronized (this) {
                    alyiVar = this.g;
                    if (alyiVar == null) {
                        alyiVar = new alyi(null, 2, this.b, false, this.d, this.e);
                        this.g = alyiVar;
                    }
                }
            }
            return alyiVar;
        }
        return new alyj(str, 2, this.b, this.d, this.e);
    }

    private alyh() {
        this(2, Level.ALL, false, alyj.a, alyj.b);
    }
}
