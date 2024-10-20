package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeoe extends arrp implements arqw {
    final /* synthetic */ boolean a;
    final /* synthetic */ aeoi b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoe(boolean z, aeoi aeoiVar, boolean z2) {
        super(3);
        this.a = z;
        this.b = aeoiVar;
        this.c = z2;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga a;
        long f;
        long j;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ake) obj).getClass();
        if ((intValue & 81) == 16 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bwjVar.y(1953574182);
            boolean z = this.a;
            cga cgaVar = cga.e;
            if (z) {
                cgaVar = amd.c(cga.e, 1.0f, brg.a, 2);
            }
            if (this.b.e != null) {
                cgaVar = cgaVar.a(amd.c(cga.e, brg.a, -4.0f, 1));
            }
            aeoi aeoiVar = this.b;
            if (aeoiVar.g.d && aeoiVar.a.ordinal() == 49) {
                a = cgaVar;
            } else {
                a = cgaVar.a(aeke.bh(cga.e, (drk) bwjVar.g(dch.i)));
            }
            bwjVar.q();
            cor bg = aeke.bg(this.b.a, bwjVar);
            aeoi aeoiVar2 = this.b;
            bwjVar.y(1953581630);
            String str = aeoiVar2.d;
            if (str == null) {
                str = dga.a(R.string.compose_icon_send_content_description, bwjVar);
            }
            String str2 = str;
            bwjVar.q();
            if (this.b.f) {
                bwjVar.y(431627981);
                if (this.c) {
                    bwjVar.y(431664096);
                    f = bmp.a(bwjVar).b;
                    bwjVar.q();
                } else {
                    bwjVar.y(431730498);
                    f = bmp.a(bwjVar).a;
                    bwjVar.q();
                }
                bwjVar.q();
            } else {
                bwjVar.y(431810819);
                if (this.c) {
                    bwjVar.y(431845756);
                    f = ckw.f(cku.d(r13), cku.c(r13), cku.b(r13), bfw.b(bwjVar), cku.f(bmp.a(bwjVar).b));
                    bwjVar.q();
                } else {
                    bwjVar.y(431947932);
                    f = ckw.f(cku.d(r13), cku.c(r13), cku.b(r13), bfw.b(bwjVar), cku.f(bmp.a(bwjVar).q));
                    bwjVar.q();
                }
                bwjVar.q();
            }
            adom.aN(bg, str2, a, f, bwjVar, 8, 0);
            String str3 = this.b.e;
            if (str3 != null) {
                boolean z2 = this.a;
                boolean z3 = this.c;
                cga c = amd.c(cga.e, brg.a, 10.0f, 1);
                if (z2) {
                    c = c.a(amd.c(cga.e, 1.0f, brg.a, 2));
                }
                dje djeVar = adom.ca(bwjVar).e;
                if (z3) {
                    bwjVar.y(1583703169);
                    j = bmp.a(bwjVar).b;
                    bwjVar.q();
                } else {
                    bwjVar.y(1583769571);
                    j = bmp.a(bwjVar).a;
                    bwjVar.q();
                }
                adom.cq(str3, c, j, null, 0, 0, djeVar, bwjVar, 0, 56);
            }
        }
        return arnb.a;
    }
}
