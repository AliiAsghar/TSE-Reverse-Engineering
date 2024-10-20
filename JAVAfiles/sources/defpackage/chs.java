package defpackage;

import androidx.compose.ui.draw.PainterElement;
import defpackage.cfq;
import defpackage.csv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chs {
    public static /* synthetic */ cga a(cga cgaVar, cor corVar, cfq cfqVar, csv csvVar, float f, ckv ckvVar, int i) {
        boolean z;
        if ((i & 4) != 0) {
            int i2 = cfq.a;
            cfqVar = cfq.a.e;
        }
        cfq cfqVar2 = cfqVar;
        if ((i & 8) != 0) {
            int i3 = csv.a;
            csvVar = csv.a.e;
        }
        csv csvVar2 = csvVar;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return cgaVar.a(new PainterElement(corVar, z2, cfqVar2, csvVar2, f, ckvVar));
    }
}
