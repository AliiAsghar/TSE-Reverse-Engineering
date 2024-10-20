package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dng {
    public doj a;
    public dnh b;

    public dng() {
        doj dojVar = new doj(dhw.a, djc.a, (djc) null);
        this.a = dojVar;
        this.b = new dnh(dojVar.a, dojVar.b);
    }

    public final doj a(List list) {
        long a;
        dnd dndVar = null;
        djc djcVar = null;
        try {
            int size = list.size();
            int i = 0;
            dnd dndVar2 = null;
            while (i < size) {
                try {
                    dnd dndVar3 = (dnd) list.get(i);
                    try {
                        dndVar3.a(this.b);
                        i++;
                        dndVar2 = dndVar3;
                    } catch (Exception e) {
                        e = e;
                        dndVar = dndVar3;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error while applying EditCommand batch to buffer (length=" + this.b.c() + ", composition=" + this.b.e() + ", selection=" + ((Object) djc.f(this.b.d())) + "):");
                        sb.append('\n');
                        aqjn.aN(list, sb, new dnf(dndVar), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    dndVar = dndVar2;
                }
            }
            dhv dhvVar = new dhv(this.b.toString());
            long d = this.b.d();
            djc djcVar2 = new djc(d);
            if (true != djc.i(this.a.b)) {
                djcVar = djcVar2;
            }
            if (djcVar != null) {
                a = djcVar.b;
            } else {
                a = djd.a(djc.c(d), djc.d(d));
            }
            doj dojVar = new doj(dhvVar, a, this.b.e());
            this.a = dojVar;
            return dojVar;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
