package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eju {
    final ejw a;
    public boolean b;
    public boolean c;
    public int[] d;
    Set e;
    final ejv f = new ejz();

    public eju(ejw ejwVar) {
        this.a = ejwVar;
    }

    public final void a(dyl dylVar) {
        d.aC(dylVar, "initCallback cannot be null");
        if (this.e == null) {
            this.e = new to();
        }
        this.e.add(dylVar);
    }
}
