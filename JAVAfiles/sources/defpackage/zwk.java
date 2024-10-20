package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwk extends arpw implements arqv {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwk(yyt yytVar, ypm ypmVar, ypi ypiVar, amzf amzfVar, int i, int i2, arpe arpeVar, int i3) {
        super(2, arpeVar);
        this.h = i3;
        this.f = yytVar;
        this.g = ypmVar;
        this.d = ypiVar;
        this.e = amzfVar;
        this.c = i;
        this.b = i2;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.h != 0) {
            return ((zwk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((zwk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object o;
        if (this.h != 0) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i != 0) {
                o = obj;
            } else {
                yni m = ((aiqj) ((yyt) this.f).d.b()).m((ypm) this.g);
                aiqj aiqjVar = (aiqj) ((yyt) this.f).d.b();
                Object obj2 = this.g;
                this.a = 1;
                ypm ypmVar = (ypm) obj2;
                o = aiqjVar.o(ypmVar.a, ypmVar.b, m, this);
                if (o == arplVar) {
                    return arplVar;
                }
            }
            Object obj3 = this.d;
            Object obj4 = this.e;
            int i2 = this.c;
            int i3 = this.b;
            aozy aozyVar = (aozy) o;
            aozy d = yyt.d((ypi) obj3, (amzf) obj4, i2);
            if (!d.b.isMutable()) {
                d.u();
            }
            amze amzeVar = (amze) d.b;
            amze amzeVar2 = amze.a;
            amzeVar.i = a.aq(i3);
            amzeVar.b |= 32;
            amze amzeVar3 = (amze) d.s();
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            amzo amzoVar = (amzo) aozyVar.b;
            amzo amzoVar2 = amzo.a;
            amzeVar3.getClass();
            amzoVar.d = amzeVar3;
            amzoVar.c = 4;
            ynb ynbVar = (ynb) ((yyt) this.f).c.b();
            aozy createBuilder = amyy.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amyy amyyVar = (amyy) createBuilder.b;
            amzo amzoVar3 = (amzo) aozyVar.s();
            amzoVar3.getClass();
            amyyVar.c = amzoVar3;
            amyyVar.b = 1;
            apag s = createBuilder.s();
            s.getClass();
            ynbVar.b((amyy) s);
            return arnb.a;
        }
        arpl arplVar2 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            zwm zwmVar = (zwm) this.d;
            String string = zwmVar.a.getString(this.b, ((arsb) this.e).a);
            string.getClass();
            kjl kjlVar = new kjl(string, ((zwm) this.d).a.getString(R.string.unblock_unspam_snack_bar_undo), false, null, new lhz(this.d, this.f, this.g, this.c, 4), 57);
            this.a = 1;
            if (zwmVar.f.k(kjlVar, this) == arplVar2) {
                return arplVar2;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.h != 0) {
            Object obj2 = this.f;
            Object obj3 = this.g;
            Object obj4 = this.d;
            return new zwk((yyt) obj2, (ypm) obj3, (ypi) obj4, (amzf) this.e, this.c, this.b, arpeVar, 1);
        }
        Object obj5 = this.d;
        int i = this.b;
        Object obj6 = this.e;
        Object obj7 = this.f;
        xxn xxnVar = (xxn) obj7;
        return new zwk((zwm) obj5, i, (arsb) obj6, xxnVar, (amfe) this.g, this.c, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwk(zwm zwmVar, int i, arsb arsbVar, xxn xxnVar, amfe amfeVar, int i2, arpe arpeVar, int i3) {
        super(2, arpeVar);
        this.h = i3;
        this.d = zwmVar;
        this.b = i;
        this.e = arsbVar;
        this.f = xxnVar;
        this.g = amfeVar;
        this.c = i2;
    }
}
