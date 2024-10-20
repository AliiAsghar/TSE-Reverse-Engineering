package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hci implements hcj, hcg {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final hfk e;

    public hci(hfk hfkVar) {
        this.e = hfkVar;
    }

    private final void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        int size = this.d.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            hcj hcjVar = (hcj) this.d.get(size);
            if (hcjVar instanceof hca) {
                hca hcaVar = (hca) hcjVar;
                List j = hcaVar.j();
                int size2 = j.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path i = ((hcj) j.get(size2)).i();
                        i.transform(hcaVar.h());
                        this.b.addPath(i);
                    }
                }
            } else {
                this.b.addPath(hcjVar.i());
            }
        }
        hcj hcjVar2 = (hcj) this.d.get(0);
        if (hcjVar2 instanceof hca) {
            hca hcaVar2 = (hca) hcjVar2;
            List j2 = hcaVar2.j();
            for (int i2 = 0; i2 < j2.size(); i2++) {
                Path i3 = ((hcj) j2.get(i2)).i();
                i3.transform(hcaVar2.h());
                this.a.addPath(i3);
            }
        } else {
            this.a.set(hcjVar2.i());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.hbz
    public final void f(List list, List list2) {
        for (int i = 0; i < this.d.size(); i++) {
            ((hcj) this.d.get(i)).f(list, list2);
        }
    }

    @Override // defpackage.hbz
    public final String g() {
        throw null;
    }

    @Override // defpackage.hcg
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            hbz hbzVar = (hbz) listIterator.previous();
            if (hbzVar instanceof hcj) {
                this.d.add((hcj) hbzVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.hcj
    public final Path i() {
        this.c.reset();
        hfk hfkVar = this.e;
        if (!hfkVar.a) {
            int i = hfkVar.b;
            if (i != 0) {
                int i2 = i - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    a(Path.Op.XOR);
                                }
                            } else {
                                a(Path.Op.INTERSECT);
                            }
                        } else {
                            a(Path.Op.REVERSE_DIFFERENCE);
                        }
                    } else {
                        a(Path.Op.UNION);
                    }
                } else {
                    for (int i3 = 0; i3 < this.d.size(); i3++) {
                        this.c.addPath(((hcj) this.d.get(i3)).i());
                    }
                }
            } else {
                throw null;
            }
        }
        return this.c;
    }
}
