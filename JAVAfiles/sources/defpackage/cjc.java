package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjc {
    public boolean b;
    public final ve c = new ve((byte[]) null);
    public final cbh a = new cbh(new arqg[16]);

    public final ciz a(FocusTargetNode focusTargetNode) {
        return (ciz) this.c.a(focusTargetNode);
    }

    public final void b() {
        this.b = true;
    }

    public final void c() {
        this.c.i();
        int i = 0;
        this.b = false;
        cbh cbhVar = this.a;
        int i2 = cbhVar.b;
        if (i2 > 0) {
            Object[] objArr = cbhVar.a;
            do {
                ((arqg) objArr[i]).a();
                i++;
            } while (i < i2);
        }
        this.a.g();
    }

    public final void d() {
        ve veVar = this.c;
        Object[] objArr = veVar.b;
        long[] jArr = veVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) objArr[(i << 3) + i3];
                                ciz a = cjb.a(focusTargetNode).a(focusTargetNode);
                                if (a != null) {
                                    focusTargetNode.c = a;
                                } else {
                                    csg.a("committing a node that was not updated in the current transaction");
                                    throw new armj();
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 != 8) {
                            break;
                        }
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.c.i();
        this.b = false;
        this.a.g();
    }
}
