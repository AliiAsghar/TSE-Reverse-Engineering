package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.bwj;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfh extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ dfi a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfh(dfi dfiVar, arqv arqvVar) {
        super(2);
        this.a = dfiVar;
        this.b = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Set set;
        View view;
        Object obj3;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            Object tag = this.a.a.getTag(R.id.inspection_slot_table_set);
            if (arsd.f(tag)) {
                set = (Set) tag;
            } else {
                set = null;
            }
            if (set == null) {
                Object parent = this.a.a.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view != null) {
                    obj3 = view.getTag(R.id.inspection_slot_table_set);
                } else {
                    obj3 = null;
                }
                if (arsd.f(obj3)) {
                    set = (Set) obj3;
                } else {
                    set = null;
                }
            }
            if (set != null) {
                set.add(bwjVar.f());
                bwjVar.k();
            }
            dfi dfiVar = this.a;
            boolean I = bwjVar.I(dfiVar);
            dfi dfiVar2 = this.a;
            Object h = bwjVar.h();
            if (I || h == bwj.a.a) {
                h = new dfe(dfiVar2, null);
                bwjVar.B(h);
            }
            bxl.g(dfiVar.a, (arqv) h, bwjVar);
            dfi dfiVar3 = this.a;
            boolean I2 = bwjVar.I(dfiVar3);
            dfi dfiVar4 = this.a;
            Object h2 = bwjVar.h();
            if (I2 || h2 == bwj.a.a) {
                h2 = new dff(dfiVar4, null);
                bwjVar.B(h2);
            }
            bxl.g(dfiVar3.a, (arqv) h2, bwjVar);
            bwx.a(cfn.a.c(set), cdk.e(-1193460702, new dfg(this.a, this.b), bwjVar), bwjVar, 56);
        }
        return arnb.a;
    }
}
