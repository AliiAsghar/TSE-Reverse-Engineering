package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqzj extends aqtw {
    final aqto a;
    final aqtf b;
    final aqzy c;
    final aqzz d;
    List e;
    arcr f;
    boolean g;
    boolean h;
    final /* synthetic */ ardr i;
    asmb j;

    public aqzj() {
        throw null;
    }

    @Override // defpackage.aqtw
    public final void a() {
        this.i.m.c();
        albo.U(this.g, "not started");
        this.f.a();
    }

    @Override // defpackage.aqtw
    public final void b() {
        asmb asmbVar;
        this.i.m.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (this.h) {
            if (this.i.C && (asmbVar = this.j) != null) {
                asmbVar.m();
                this.j = null;
            } else {
                return;
            }
        } else {
            this.h = true;
        }
        ardr ardrVar = this.i;
        if (!ardrVar.C) {
            this.j = ardrVar.m.d(new arcv(new arer(this, 1)), 5L, TimeUnit.SECONDS, this.i.i.c());
        } else {
            this.f.g(ardr.b);
        }
    }

    @Override // defpackage.aqtw
    public final void c(aqty aqtyVar) {
        this.i.m.c();
        albo.U(!this.g, "already started");
        albo.U(!this.h, "already shutdown");
        albo.U(!this.i.C, "Channel is being terminated");
        this.g = true;
        ardr ardrVar = this.i;
        String b = ardrVar.b();
        arao araoVar = ardrVar.i;
        ScheduledExecutorService c = araoVar.c();
        atpk atpkVar = new atpk(this, aqtyVar);
        ardr ardrVar2 = this.i;
        arcr arcrVar = new arcr(this.a, b, ardrVar.r, araoVar, c, ardrVar2.m, atpkVar, ardrVar2.I, ardrVar2.E.a(), this.b, this.c, ardrVar2.q);
        atcz atczVar = new atcz();
        atczVar.a = "Child Subchannel started";
        atczVar.b = aqsz.CT_INFO;
        atczVar.b(this.i.l.a());
        atczVar.c = arcrVar;
        this.i.G.b(atczVar.a());
        this.f = arcrVar;
        aqtc.b(this.i.I.e, arcrVar);
        this.i.w.add(arcrVar);
    }

    @Override // defpackage.aqtw
    public final void d(List list) {
        this.i.m.c();
        this.e = list;
        arcr arcrVar = this.f;
        list.getClass();
        arcr.j(list);
        d.t(!list.isEmpty(), "newAddressGroups is empty");
        arcrVar.f.execute(new aqym(arcrVar, DesugarCollections.unmodifiableList(new ArrayList(list)), 18, (byte[]) null));
    }

    public final String toString() {
        return this.b.toString();
    }

    public aqzj(ardr ardrVar, aqto aqtoVar) {
        this.i = ardrVar;
        this.e = aqtoVar.a;
        this.a = aqtoVar;
        aqtf b = aqtf.b("Subchannel", ardrVar.b());
        this.b = b;
        aqzz aqzzVar = new aqzz(b, ardrVar.l.a(), "Subchannel for ".concat(aqtoVar.a.toString()));
        this.d = aqzzVar;
        this.c = new aqzy(aqzzVar, ardrVar.l);
    }
}
