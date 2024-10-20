package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Size;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxh extends afxd {
    public Optional a;
    private final agek ag;
    private final arml ah;
    private final arml ai;
    private final arml aj;
    private final arml ak;
    private afxi al;
    public Optional b;
    public View c;
    public aiim d;
    public aday e;

    public afxh() {
        super(Integer.valueOf(R.layout.shortcuts_screen));
        this.ag = agek.e;
        this.ah = armd.a(new afww(this, 7));
        this.ai = armd.a(new afww(this, 8));
        this.aj = armd.a(new afww(this, 6));
        this.ak = armd.a(new afww(this, 5));
    }

    public static final /* synthetic */ afxe e(afxh afxhVar) {
        return (afxe) afxhVar.bj();
    }

    @Override // defpackage.agem
    public final agek aM() {
        return this.ag;
    }

    public final ascd aP() {
        return (ascd) this.aj.a();
    }

    public final void aW(int i) {
        Object obj;
        Iterator it = ((afxe) bj()).a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((afxc) obj).a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        afxc afxcVar = (afxc) obj;
        if (afxcVar != null) {
            arrn.J(bo(), null, null, new afju(this, afxcVar, (arpe) null, 7), 3);
            return;
        }
        throw new IllegalStateException(a.cb(i, "Couldn't find a shortcut with label ", "."));
    }

    public final void aZ(RecyclerView recyclerView, Size size, afxe afxeVar) {
        GridLayoutManager gridLayoutManager;
        afxo q = q();
        size.getClass();
        if (q.g) {
            q.l = afxeVar;
            q.h = arrn.r(arrn.s(size.getWidth() / q.m(), arrn.s(((aron) q.l.a).c, 7)), 1);
        } else {
            q.h = arrn.r(arrn.s(size.getWidth() / q.m(), q.k), 1);
        }
        q.i.d(afxo.c[0], Integer.valueOf(Math.max(1, size.getWidth() / q.h)));
        Math.ceil(q.b() / q.h);
        q.j.d(afxo.c[1], Integer.valueOf(((Number) q.o.a()).intValue()));
        int i = q().h;
        nw nwVar = recyclerView.m;
        if (nwVar instanceof GridLayoutManager) {
            gridLayoutManager = (GridLayoutManager) nwVar;
        } else {
            gridLayoutManager = null;
        }
        if (gridLayoutManager == null || gridLayoutManager.b != i) {
            recyclerView.getContext();
            recyclerView.aj(new GridLayoutManager(i));
        }
        if (bb() || !d.F(recyclerView.l, q())) {
            recyclerView.ag(q());
        }
        bs();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    @Override // defpackage.cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ag(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            r4.getClass()
            r3.c = r4
            android.os.Bundle r5 = r3.m
            r0 = 0
            if (r5 == 0) goto L24
            java.lang.String r1 = "auto_launch_shortcut"
            r2 = -1
            int r5 = r5.getInt(r1, r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r1 = r5.intValue()
            if (r1 != r2) goto L1c
            r5 = r0
        L1c:
            if (r5 == 0) goto L24
            afxi r1 = new afxi
            r1.<init>(r5)
            goto L25
        L24:
            r1 = r0
        L25:
            r3.al = r1
            if (r1 == 0) goto L34
            java.lang.Integer r5 = r1.a
            if (r5 == 0) goto L34
            int r5 = r5.intValue()
            r3.aW(r5)
        L34:
            aday r5 = new aday
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r5.<init>(r4)
            r3.e = r5
            agaj r4 = r3.bj()
            afxe r4 = (defpackage.afxe) r4
            java.lang.Integer r4 = r4.b
            if (r4 == 0) goto L70
            int r4 = r4.intValue()
            aday r5 = r3.e
            java.lang.String r1 = "views"
            if (r5 != 0) goto L55
            defpackage.arro.b(r1)
            r5 = r0
        L55:
            aday r2 = r3.e
            if (r2 != 0) goto L5d
            defpackage.arro.b(r1)
            r2 = r0
        L5d:
            java.lang.Object r5 = r5.b
            java.lang.Object r1 = r2.b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.content.Context r1 = r1.getContext()
            android.graphics.drawable.Drawable r4 = defpackage.d.f(r1, r4)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.setBackground(r4)
        L70:
            arwe r4 = r3.bo()
            afmg r5 = new afmg
            r1 = 12
            r5.<init>(r3, r0, r1)
            r1 = 3
            defpackage.arrn.J(r4, r0, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxh.ag(android.view.View, android.os.Bundle):void");
    }

    public final boolean bb() {
        return ((Boolean) this.ai.a()).booleanValue();
    }

    public final aiim bc() {
        aiim aiimVar = this.d;
        if (aiimVar != null) {
            return aiimVar;
        }
        arro.b("shortcutsAdapterFactory");
        return null;
    }

    @Override // defpackage.agai
    public final /* bridge */ /* synthetic */ void gC(agaj agajVar) {
        super.gC((afxe) agajVar);
        if (!bb()) {
            aP().f(bc().n((afxe) bj(), bb()));
        }
    }

    @Override // defpackage.agai
    public final boolean gD() {
        return ((Boolean) this.ah.a()).booleanValue();
    }

    public final afxo q() {
        if (gD() && !bb()) {
            Object c = aP().c();
            c.getClass();
            return (afxo) c;
        }
        afxo afxoVar = (afxo) this.ak.a();
        afxoVar.getClass();
        return afxoVar;
    }

    @Override // defpackage.ageb
    public final agea r() {
        aday adayVar = this.e;
        if (adayVar != null) {
            return afzv.q((RecyclerView) adayVar.a);
        }
        return null;
    }
}
