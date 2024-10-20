package defpackage;

import android.text.Spannable;
import android.text.style.ClickableSpan;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kec extends arrp implements arqr {
    final /* synthetic */ ked a;
    final /* synthetic */ Spannable b;
    final /* synthetic */ ClickableSpan c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ kdv f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kec(ked kedVar, Spannable spannable, ClickableSpan clickableSpan, int i, int i2, kdv kdvVar, int i3) {
        super(1);
        this.g = i3;
        this.a = kedVar;
        this.b = spannable;
        this.c = clickableSpan;
        this.d = i;
        this.e = i2;
        this.f = kdvVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        lmu lmuVar;
        boolean z = false;
        if (this.g != 0) {
            long j = ((cjn) obj).a;
            if (!this.a.b.e()) {
                lmu lmuVar2 = new lmu(this.b, this.c, this.d, this.e, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
                ked kedVar = this.a;
                kdg kdgVar = new kdg(kedVar, lmuVar2, 12, null);
                kdv kdvVar = this.f;
                String lmuVar3 = lmuVar2.toString();
                kdv kdvVar2 = this.f;
                kedVar.i.b(new yym(kdgVar, kdvVar.q, lmuVar3, !kdvVar2.c, kdvVar2.g, kdvVar2.j, kdvVar2.h, kdvVar2.i, kdvVar2.p.g()));
                z = true;
            }
            return Boolean.valueOf(z);
        }
        long j2 = ((cjn) obj).a;
        if (!this.a.b.e()) {
            if (a.bB(j2, 9205357640488583168L)) {
                lmuVar = new lmu(this.b, this.c, this.d, this.e, brg.a, brg.a);
            } else {
                lmuVar = new lmu(this.b, this.c, this.d, this.e, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
            }
            ked kedVar2 = this.a;
            kdg kdgVar2 = new kdg(kedVar2, lmuVar, 13, null);
            kdv kdvVar3 = this.f;
            boolean z2 = !kdvVar3.c;
            kedVar2.i.b(new yym(kdgVar2, kdvVar3.q, lmuVar.toString(), z2, kdvVar3.g, kdvVar3.j, kdvVar3.h, kdvVar3.i, kdvVar3.p.g()));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
