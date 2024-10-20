package defpackage;

import com.google.android.apps.messaging.R;
import defpackage.bwj;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aemt extends arrp implements arqw {
    final /* synthetic */ aejt a;
    final /* synthetic */ aenk b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ aeoo e;
    final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemt(aejt aejtVar, aenk aenkVar, int i, boolean z, aeoo aeooVar, float f) {
        super(3);
        this.a = aejtVar;
        this.b = aenkVar;
        this.c = i;
        this.d = z;
        this.e = aeooVar;
        this.f = f;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        ((anq) obj).getClass();
        if ((intValue & 81) == 16 && bwjVar.L()) {
            bwjVar.v();
        } else {
            boolean z = false;
            String format = String.format(dga.a(R.string.compose_remove_button_content_description, bwjVar), Arrays.copyOf(new Object[]{this.a.c()}, 1));
            format.getClass();
            bwjVar.y(-597630382);
            boolean G = bwjVar.G(this.b) | bwjVar.E(this.c);
            aenk aenkVar = this.b;
            int i = this.c;
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new aems(aenkVar, i, 0);
                bwjVar.B(h);
            }
            bwjVar.q();
            aehx aehxVar = new aehx(format, (arqg) h);
            bwjVar.y(-597620303);
            boolean G2 = bwjVar.G(this.b) | bwjVar.E(this.c);
            aenk aenkVar2 = this.b;
            int i2 = this.c;
            Object h2 = bwjVar.h();
            if (G2 || h2 == bwj.a.a) {
                h2 = new aems(aenkVar2, i2, 2);
                bwjVar.B(h2);
            }
            arqg arqgVar = (arqg) h2;
            bwjVar.q();
            bwjVar.y(-597618219);
            boolean G3 = bwjVar.G(this.b) | bwjVar.E(this.c);
            aenk aenkVar3 = this.b;
            int i3 = this.c;
            Object h3 = bwjVar.h();
            if (G3 || h3 == bwj.a.a) {
                h3 = new aems(aenkVar3, i3, 3);
                bwjVar.B(h3);
            }
            arqg arqgVar2 = (arqg) h3;
            bwjVar.q();
            if (this.a instanceof aejo) {
                z = this.d;
            }
            aetn.az(new aekk(aehxVar, arqgVar, arqgVar2, z), null, new cku(adom.aW(this.e, this.f, bwjVar)), cdk.e(2022877928, new aelu(this.a, 4), bwjVar), bwjVar, 3072);
        }
        return arnb.a;
    }
}
