package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alss extends alsr implements Serializable {
    public static final alsr a = new alss();
    private static final long serialVersionUID = 0;

    private alss() {
    }

    @Override // defpackage.alsr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        alst alstVar = (alst) obj;
        alst alstVar2 = (alst) obj2;
        return almj.b.c(alstVar.b, alstVar2.b).c(alstVar.c, alstVar2.c).a();
    }
}
